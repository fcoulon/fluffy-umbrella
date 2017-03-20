package lang;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.acceleo.query.ast.AstPackage;
import org.eclipse.acceleo.query.runtime.EvaluationResult;
import org.eclipse.acceleo.query.runtime.IQueryEnvironment;
import org.eclipse.acceleo.query.runtime.Query;
import org.eclipse.acceleo.query.runtime.ServiceUtils;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.sirius.common.tools.api.interpreter.ClassLoadingCallback;
import org.eclipse.sirius.common.tools.api.interpreter.EPackageLoadingCallback;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterWithDiagnostic.IEvaluationResult;
import org.eclipse.sirius.common.tools.api.interpreter.JavaExtensionsManager;

import implementation.Behaviored;
import implementation.ImplementationPackage;
import implementation.ModelBehavior;
import lang.core.interpreter.DiagnosticLogger;
import lang.core.interpreter.EvalEnvironment;
import lang.core.interpreter.ImplementationEngine;
import lang.core.parser.Dsl;
import lang.core.parser.DslBuilder;
import lang.core.parser.visitor.ParseResult;

/**
 * This class is an interpreter for the 'Lang' Language.
 */
public class LangInterpreter {
	
	/**
	 * Environment of the evaluation. It contains declared EPackages & services.
	 * Mainly used to evalute AQL expression and to resolve types. 
	 */
	IQueryEnvironment queryEnvironment;
	
	
	/**
	 * Tracks updates of EPackges & services from the workspace  
	 */
	public JavaExtensionsManager javaExtensions;
	
	/**
	 * Binding between {@link javaExtensions} and {@link queryEnvironment}
	 */
	EPackageLoadingCallback ePackageCallBack;
	
	/**
	 * Binding between {@link javaExtensions} and {@link queryEnvironment} 
	 */
	private final ClassLoadingCallback callback = new ClassLoadingCallback() {

        @Override
        public void loaded(String qualifiedName, Class<?> clazz) {
        	ServiceUtils.registerServices(queryEnvironment, ServiceUtils.getServices(queryEnvironment, clazz));
        }

        @Override
        public void notFound(String qualifiedName) {
            //TODO: log error
        }

        @Override
        public void unloaded(String qualifiedName, Class<?> clazz) {
            ServiceUtils.removeServices(queryEnvironment, ServiceUtils.getServices(queryEnvironment, clazz));
        }
    };
    
    /**
     * Logs diagnostic for each call of implementation
     */
    DiagnosticLogger logger;
    
    /**
     * The environment is setup with default services & EPackages
     */
    public LangInterpreter() {
        this.queryEnvironment = Query.newEnvironmentWithDefaultServices(null);
        queryEnvironment.registerEPackage(ImplementationPackage.eINSTANCE);
		queryEnvironment.registerEPackage(AstPackage.eINSTANCE);
        this.ePackageCallBack = new EPackageLoadingCallback() {

            @Override
            public void loaded(String nsURI, EPackage pak) {
                queryEnvironment.registerEPackage(pak);
            }

            @Override
            public void unloaded(String nsURI, EPackage pak) {
                queryEnvironment.removeEPackage(pak.getName());
            }
        };
        this.javaExtensions = JavaExtensionsManager.createManagerWithOverride();
        this.javaExtensions.addClassLoadingCallBack(callback);
        this.javaExtensions.addEPackageCallBack(ePackageCallBack);
	}
    
    /**
     * Entry point for an evaluation.
     */
    public IEvaluationResult eval(String modelURI, List<Object> args, Dsl dsl) {
    	
    	/*
    	 * Parse semantic files
    	 */
    	List<ParseResult<ModelBehavior>> parsedSemantics = (new DslBuilder(queryEnvironment,new ResourceSetImpl())).parse(dsl);
    	
    	/*
    	 * Load input model
    	 */
    	Resource model = loadModel(modelURI);
		EObject caller = model.getContents().get(0);
		
		/*
		 * Eval
		 */
		return eval(caller,args,parsedSemantics);
		
    }
    
	/**
     * Search in {@link dslFile}'s semantics
     * for the first operation tagged 'main' and apply it to {@link caller}
     */
    public IEvaluationResult eval(EObject caller, List<Object> args, List<ParseResult<ModelBehavior>> parsedSemantics) {
    	
    	Optional<Behaviored> mainOp =
    		parsedSemantics
	    	.stream()
	    	.filter(sem -> sem.getRoot() != null)
	    	.map(sem -> getMainOp(sem.getRoot()))
	    	.filter(op -> op.isPresent())
	    	.map(op -> op.get())
	    	.findFirst();
    	
    	final BasicDiagnostic diagnostic = new BasicDiagnostic();
    	parsedSemantics
    	.stream()
    	.filter(parseResult -> Diagnostic.OK != parseResult.getDiagnostic().getSeverity())
    	.forEach(parseResult -> diagnostic.merge(parseResult.getDiagnostic()));
    	
    	
    	Object value = null;
		if (mainOp.isPresent()) {
			EvaluationResult evalResult = eval(caller, mainOp.get(), args, parsedSemantics);
			if (Diagnostic.OK != evalResult.getDiagnostic().getSeverity()) {
				diagnostic.merge(evalResult.getDiagnostic());
			}
			value = evalResult.getResult();
		}
		
		Object dumbFinal = value;
		return new IEvaluationResult() {

			@Override
			public Object getValue() {
				return dumbFinal;
			}

			@Override
			public Diagnostic getDiagnostic() {
				List<Diagnostic> children = diagnostic.getChildren();
				if (children.size() == 1) {
					return children.get(0);
				} else {
					return diagnostic;
				}
			}
		};
    }
    
    private EvaluationResult eval(EObject caller, Behaviored operation, List<Object> args, List<ParseResult<ModelBehavior>> parsedSemantics) {
    	List<ModelBehavior> allBehaviors = 
				parsedSemantics
		    	.stream()
		    	.filter(sem -> sem.getRoot() != null)
		    	.map(sem -> sem.getRoot())
		    	.collect(Collectors.toList());
    	logger = new DiagnosticLogger(parsedSemantics);
    	
    	/*
    	 * Register services
    	 */
    	parsedSemantics
	    	.stream()
	    	.forEach(sem -> {
	    		ModelBehavior root = sem.getRoot();
	    		if(root != null) {
	    			root
	    			.getServices()
	        		.stream()
	        		.forEach(srv -> javaExtensions.addImport(srv));
	    		}
	    	});
    	javaExtensions.reloadIfNeeded();
    	
    	EvalEnvironment env = new EvalEnvironment(queryEnvironment, allBehaviors, logger);
    	List<Object> inputElems = new ArrayList<Object>();
    	inputElems.add(caller);
    	inputElems.addAll(args);
    	initDynamicFeatures(inputElems,env);
    	
    	ImplementationEngine engine = new ImplementationEngine(env);
    	return engine.eval(caller, operation, args);
    }
    
    private void initDynamicFeatures(List<Object> inputElems, EvalEnvironment env) {
    	
    	Set<EObject> accessibleInputElements = new HashSet<EObject>();
    	
    	Set<Resource> allResources = 
    		inputElems
	    	.stream()
	    	.filter(elem -> elem instanceof EObject)
	    	.map(elem -> ((EObject)elem).eResource())
	    	.filter(res -> res != null)
	    	.collect(Collectors.toSet());
    	
    	//EObject from accessible resources
    	allResources
    		.forEach(res -> 
    			res.getAllContents().forEachRemaining(e ->
    				accessibleInputElements.add(e)
    			)
    		);
    	
    	//EObject outside a resource
    	inputElems
	    	.stream()
	    	.filter(elem -> elem instanceof EObject)
	    	.filter(elem -> ((EObject)elem).eResource() == null)
	    	.forEach(elem -> accessibleInputElements.add((EObject)elem));
    	
    	env.initialize(accessibleInputElements);
    }
    
    private Optional<Behaviored> getMainOp(ModelBehavior implem) {
		return 
			implem.getClassExtensions().stream()
			.flatMap(cls -> cls.getMethods().stream())
			.filter(op -> op.getTags().contains("main"))
			.findFirst();
	}
    
    public IQueryEnvironment getQueryEnvironment() {
        return this.queryEnvironment;
    }
    
    public DiagnosticLogger getLogger() {
		return logger;
	}
    
    /**
     * Return the resource resolved by this uri.
     * Ensure to use EPackages registered in the eval environment
     */
    public Resource loadModel(String modelURI) {
    	ResourceSet modelRs = new ResourceSetImpl();
    	modelRs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
    	queryEnvironment
	    	.getEPackageProvider()
	    	.getRegisteredEPackages()
	    	.stream()
	    	.forEach(pkg -> {
	    		modelRs.getPackageRegistry().put(pkg.getNsURI(), pkg);
	    	});
    	URI uri = URI.createURI(modelURI);
		return modelRs.getResource(uri, true);
    }
}
