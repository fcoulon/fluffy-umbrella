package logo.standalone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.eclipse.acceleo.query.ast.AstPackage;
import org.eclipse.acceleo.query.ast.Expression;
import org.eclipse.acceleo.query.runtime.ServiceUtils;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterWithDiagnostic.IEvaluationResult;

import implementation.Behaviored;
import implementation.ImplementationPackage;
import implementation.ModelBehavior;
import kmLogo.ASM.ASMPackage;
import kmLogo.ASM.LogoProgram;
import lang.LangInterpreter;
import lang.core.interpreter.DiagnosticLogger;
import lang.core.interpreter.ImplementationEvaluator;
import lang.core.parser.Dsl;
import lang.core.parser.visitor.ParseResult;
import lang.core.resource.AntlrResource;
import lang.core.resource.AntlrResourceFactory;
import vmlogo.VmlogoPackage;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * Input files
		 */
		String dslFile = "logo-standalone.dsl";
		String modelFile = "../logo.example/data/LogoProgram.xmi";
		
//		/*
//		 * Init eval environment
//		 */
//		LangInterpreter interpreter = new LangInterpreter();
//		try {
//			ServiceUtils.registerServices(
//					interpreter.getQueryEnvironment(),
//					ServiceUtils.getServices(interpreter.getQueryEnvironment(),	Class.forName("logo.example.service.Display"))
//					);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		/*
//		 * Eval
//		 */
//		try {
//			IEvaluationResult result = interpreter.eval(modelFile, new ArrayList(), new Dsl(dslFile));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
		/* --------------------------------------
		 *  Load behaviors thanks to EMF factory
		 * --------------------------------------/
		
		
		/*
		 * Init eval environment
		 */
		LangInterpreter interpreter = new LangInterpreter();
		try {
			ServiceUtils.registerServices(
					interpreter.getQueryEnvironment(),
					ServiceUtils.getServices(interpreter.getQueryEnvironment(),	Class.forName("logo.example.service.Display"))
					);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		/*
		 * Load behavior
		 */
		ResourceSet modelRs = new ResourceSetImpl();
    	modelRs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("dsl", new AntlrResourceFactory(interpreter.getQueryEnvironment()));
    	URI uri = URI.createURI(dslFile);
		AntlrResource resource = (AntlrResource) modelRs.getResource(uri, true);
		
		/*
		 * Load model
		 */
		Resource model = interpreter.loadModel(modelFile);
		EObject caller = model.getContents().get(0);
		
		/*
		 * Eval
		 */
		List<ParseResult<ModelBehavior>> parsedSemantics = resource.getParseResult();
		interpreter.eval(caller,new ArrayList<Object>(),parsedSemantics);
		
		
		System.out.println("End");
	}
}
