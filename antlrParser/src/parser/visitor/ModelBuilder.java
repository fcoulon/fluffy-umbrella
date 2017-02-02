package parser.visitor;

import java.util.List;
import java.util.Optional;

import org.eclipse.acceleo.query.runtime.IQueryBuilderEngine.AstResult;
import org.eclipse.acceleo.query.runtime.IQueryEnvironment;
import org.eclipse.acceleo.query.runtime.impl.QueryBuilderEngine;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import implementation.Behaviored;
import implementation.Block;
import implementation.ExpressionStatement;
import implementation.ExtendedClass;
import implementation.FeatureAssignment;
import implementation.FeatureInsert;
import implementation.FeaturePut;
import implementation.FeatureRemove;
import implementation.ForEach;
import implementation.If;
import implementation.Implementation;
import implementation.ImplementationFactory;
import implementation.ImplementationPackage;
import implementation.Method;
import implementation.Parameter;
import implementation.Statement;
import implementation.VariableAssignement;
import implementation.VariableDeclaration;
import implementation.While;

public class ModelBuilder {
	
	public static ModelBuilder singleton;
	
	public static ModelBuilder createSingleton(IQueryEnvironment qryEnv) {
		ModelBuilder.singleton = new ModelBuilder(qryEnv);
		return singleton;
	}
	
	EcoreFactory ecoreFactory = (EcoreFactory) EcorePackage.eINSTANCE.getEFactoryInstance();
	ImplementationFactory factory = (ImplementationFactory) ImplementationPackage.eINSTANCE.getEFactoryInstance();
	IQueryEnvironment qryEnv;
	QueryBuilderEngine builder;
	
	public ModelBuilder (IQueryEnvironment qryEnv){
		this.qryEnv = qryEnv;
		builder = new QueryBuilderEngine(qryEnv);
	}
	
	public Behaviored buildOperation(String containingClass, String name, List<Parameter> params, Block body, boolean isMain) {
		Optional<EOperation> existingOperation = resolve(containingClass, name, params.size());
		
		if(existingOperation.isPresent())
			return buildImplementation(existingOperation.get(),params,body, isMain);
		else
			return buildMethod(name,params,body, isMain);
	}
	
	public Method buildMethod(String name, List<Parameter> params, Block body, boolean isMain) {
		EOperation operation = ecoreFactory.createEOperation();
		operation.setName(name);
		
		params.stream().forEach(p -> {
			EParameter opParam = ecoreFactory.createEParameter();
			opParam.setName(p.getName());
			opParam.setEType(p.getType());
			operation.getEParameters().add(opParam);
		});
		
		Method newMethod = factory.createMethod();
		newMethod.setOperationDef(operation);
		newMethod.setBody(body);
		newMethod.setIsMain(isMain);
		
		return newMethod;
	}
	
	public Implementation buildImplementation(EOperation operationRef, List<Parameter> params, Block body, boolean isMain) {
		Implementation implem = factory.createImplementation();
		
		implem.setOperationRef(operationRef);
		implem.setBody(body);
		implem.setIsMain(isMain);
		
		return implem;
	}
	
	public Parameter buildParameter(String type, String name) {
		Parameter param = factory.createParameter();
		param.setName(name);
		param.setType(resolve(type));
		return param;
	}
	
	public VariableDeclaration buildVariableDecl(String name, String exp, String type) {
		VariableDeclaration varDecl = factory. createVariableDeclaration();
		varDecl.setName(name);
		varDecl.setInitialValue(builder.build(exp).getAst());
		varDecl.setType(resolve(type));
		return varDecl;
	}
	
	public VariableAssignement buildVariableAssignement(String name, String exp) {
		VariableAssignement varAssign = factory. createVariableAssignement();
		varAssign.setName(name);
		varAssign.setValue(builder.build(exp).getAst());
		return varAssign; 
	}
	
	public If buildIf(String condition, Block thenBlock, Block elseBlock) {
		If ifStmt = factory.createIf();
		ifStmt.setCondition(builder.build(condition).getAst());
		ifStmt.setThen(thenBlock);
		ifStmt.setElse(elseBlock);
		return ifStmt;
	}
	
	public Block buildBlock(List<Statement> statements) {
		Block block = factory.createBlock();
		block.getStatements().addAll(statements);
		return block;
	}
	
	public ExpressionStatement buildExpressionStatement(String value) {
		ExpressionStatement exp = factory.createExpressionStatement();
		exp.setExpression(builder.build(value).getAst());
		return exp;
	}
	
	public ForEach buildForEach(String variable, String expression, Block body) {
		ForEach loop = factory.createForEach();
		loop.setVariable(variable);
		loop.setCollectionExpression(builder.build(expression).getAst());
		loop.setBody(body);
		return loop;
	}
	
	public While buildWhile(String expression, Block body) {
		While loop = factory.createWhile();
		loop.setCollectionExpression(builder.build(expression).getAst());
		loop.setBody(body);
		return loop;
	}
	
	public FeatureAssignment buildFeatureAssign(String target, String feature, String valueExp) {
		FeatureAssignment featSetting = factory.createFeatureAssignment();
		featSetting.setTarget(builder.build(target).getAst());
		featSetting.setTargetFeature(feature);
		featSetting.setValue(builder.build(valueExp).getAst());
		return featSetting;
	}
	
	public FeatureInsert buildFeatureInsert(String target, String feature, String valueExp) {
		FeatureInsert featSetting = factory.createFeatureInsert();
		featSetting.setTarget(builder.build(target).getAst());
		featSetting.setTargetFeature(feature);
		featSetting.setValue(builder.build(valueExp).getAst());
		return featSetting;
	}
	
	public FeatureRemove buildFeatureRemove(String target, String feature, String valueExp) {
		FeatureRemove featSetting = factory.createFeatureRemove();
		featSetting.setTarget(builder.build(target).getAst());
		featSetting.setTargetFeature(feature);
		featSetting.setValue(builder.build(valueExp).getAst());
		return featSetting;
	}
	
	public FeaturePut buildFeaturePut(String target, String feature, String keyExp, String valueExp) {
		FeaturePut featSetting = factory.createFeaturePut();
		featSetting.setTarget(builder.build(target).getAst());
		featSetting.setTargetFeature(feature);
		featSetting.setKey(builder.build(keyExp).getAst());
		featSetting.setValue(builder.build(valueExp).getAst());
		return featSetting;
	}
	
	public ExtendedClass buildExtendedClass(String baseCls, List<VariableDeclaration> vars, List<Behaviored> operations) {
		ExtendedClass cls = factory.createExtendedClass();
		cls.setBaseClass((EClass) resolve(baseCls));
		cls.getMethods().addAll(operations);
		cls.getAttributes().addAll(vars);
		return cls;
	}
	
	//Can return null
	public Optional<EOperation> resolve(String className, String methodName, int nbArgs) {
		//TODO: manage qualified name		
		Optional<EOperation> eOperation = 
			qryEnv
			.getEPackageProvider()
			.getEClassifiers()
			.stream()
			.filter(cls -> cls instanceof EClass)
			.filter(cls -> cls.getName().equals(className))
			.flatMap(cls -> ((EClass)cls).getEOperations().stream())
			.filter(op -> op.getName().equals(methodName) && op.getEParameters().size() == nbArgs)
			.findFirst();
		
		return eOperation;
	}
	
	public EClassifier resolve(String className) {
		//TODO: manage qualified name
		Optional<EClassifier> candidate =
			qryEnv
			.getEPackageProvider()
			.getEClassifiers()
			.stream()
			.filter(cls -> cls instanceof EClass)
			.filter(cls -> cls.getName().equals(className))
			.findFirst();
		
		if(candidate.isPresent())
			return candidate.get();
		
		switch (className) {
			case "boolean" 	: return EcorePackage.eINSTANCE.getEBoolean();
			case "byte" 	: return EcorePackage.eINSTANCE.getEByte();
			case "char" 	: return EcorePackage.eINSTANCE.getEChar();
			case "short" 	: return EcorePackage.eINSTANCE.getEShort();
			case "int" 		: return EcorePackage.eINSTANCE.getEInt();
			case "long" 	: return EcorePackage.eINSTANCE.getELong();
			case "float" 	: return EcorePackage.eINSTANCE.getEFloat();
			case "double" 	: return EcorePackage.eINSTANCE.getEDouble();
			default			: return EcorePackage.eINSTANCE.getEClassifier();
		}
	}
	
	public AstResult parse(String expression) {
		return builder.build(expression);
	}
}