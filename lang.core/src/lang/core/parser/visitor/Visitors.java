package lang.core.parser.visitor;

import implementation.Behaviored;
import implementation.Block;
import implementation.ExpressionStatement;
import implementation.ImplementationFactory;
import implementation.ImplementationPackage;
import implementation.ImportSyntax;
import implementation.Parameter;
import implementation.ModelBehavior;
import implementation.Statement;
import implementation.VariableAssignment;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.eclipse.acceleo.query.ast.SequenceInExtensionLiteral;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EPackage;

import lang.core.parser.AstBuilder;
import lang.core.parser.XtdAQLBaseVisitor;
import lang.core.parser.XtdAQLParser.RAssignContext;
import lang.core.parser.XtdAQLParser.RBlockContext;
import lang.core.parser.XtdAQLParser.RClassContext;
import lang.core.parser.XtdAQLParser.RForEachContext;
import lang.core.parser.XtdAQLParser.RIfContext;
import lang.core.parser.XtdAQLParser.ROperationContext;
import lang.core.parser.XtdAQLParser.RParametersContext;
import lang.core.parser.XtdAQLParser.RRootContext;
import lang.core.parser.XtdAQLParser.RImportServiceContext;
import lang.core.parser.XtdAQLParser.RImportSyntaxContext;
import lang.core.parser.XtdAQLParser.RVariableContext;
import lang.core.parser.XtdAQLParser.RWhileContext;
import implementation.ExtendedClass;
import implementation.FeatureAssignment;
import implementation.FeatureInsert;
import implementation.FeaturePut;
import implementation.FeatureRemove;
import implementation.ForEach;
import implementation.If;
import implementation.VariableDeclaration;
import implementation.While;
import lang.core.parser.XtdAQLParser.RAttributeContext;
import lang.core.parser.XtdAQLParser.VarRefContext;
import lang.core.parser.XtdAQLParser.NavContext;
import lang.core.parser.XtdAQLParser.NavigationSegmentContext;
import lang.core.parser.XtdAQLParser.FeatureContext;
import lang.core.parser.XtdAQLParser.RExpressionContext;
import lang.core.parser.XtdAQLParser.ServiceCallContext;
import lang.core.parser.XtdAQLParser.CallExpContext;
import lang.core.parser.XtdAQLParser.CallOrApplyContext;
import lang.core.parser.XtdAQLParser.ExpressionContext;
import lang.core.parser.XtdAQLParser.RVarDeclContext;

/**
 * Visits the result of the antlr parser to build the Implementation model.
 */
public class Visitors {

	static class BlockVisitor extends XtdAQLBaseVisitor<Block> {

		ParseResult<ModelBehavior> parseRes;

		public BlockVisitor(ParseResult<ModelBehavior> parseRes) {
			this.parseRes = parseRes;
		}

		@Override
		public Block visitRBlock(RBlockContext ctx) {
			StatementVisitor subVisitor = new StatementVisitor(parseRes);
			List<Statement> body = ctx.rStatement().stream().map(s -> subVisitor.visit(s)).collect(Collectors.toList());

			Block res = ModelBuilder.singleton.buildBlock(body);
			parseRes.getStartPositions().put(res, ctx.start.getStartIndex());
			parseRes.getEndPositions().put(res, ctx.stop.getStopIndex());
			return res;
		}
	}

	static class StatementVisitor extends XtdAQLBaseVisitor<Statement> {

		ParseResult<ModelBehavior> parseRes;

		public StatementVisitor(ParseResult<ModelBehavior> parseRes) {
			this.parseRes = parseRes;
		}

		@Override
		public Statement visitRVarDecl(RVarDeclContext ctx) {
			String initialValue = null;
			if (ctx.expression() != null) { // no initial value
				initialValue = ctx.expression().getText();
			}

			String typeName = null;

			if (ctx.type.qualified() == null) { // String type
				typeName = ctx.type.typeLiteral().getText();
			} else {
				typeName = ctx.type.qualified().getText();
			}

			String name = ctx.Ident().getText();

			VariableDeclaration res = ModelBuilder.singleton.buildVariableDecl(name, initialValue, typeName);
			parseRes.getStartPositions().put(res, ctx.start.getStartIndex());
			parseRes.getEndPositions().put(res, ctx.stop.getStopIndex());
			if (res.getInitialValue() != null) {
				parseRes.getStartPositions().put(res.getInitialValue(), ctx.expression().start.getStartIndex());
				parseRes.getEndPositions().put(res.getInitialValue(), ctx.expression().stop.getStopIndex());
			}
			return res;
		}

		@Override
		public Statement visitRAssign(RAssignContext ctx) {
			ExpressionContext left = ctx.expression().get(0); // epxression.feature
																// or variable?
			String value = ctx.expression().get(1).getText();

			Statement res = null;
			if (left instanceof VarRefContext) {
				VarRefContext varRef = (VarRefContext) left;
				res = ModelBuilder.singleton.buildVariableAssignement(varRef.Ident().getText(), value);
				parseRes.getStartPositions().put(((VariableAssignment) res).getValue(),
						ctx.expression().get(1).start.getStartIndex());
				parseRes.getEndPositions().put(((VariableAssignment) res).getValue(),
						ctx.expression().get(1).stop.getStopIndex());
			} else if (left instanceof NavContext) {
				NavContext navCtx = (NavContext) left;
				NavigationSegmentContext navSegment = navCtx.navigationSegment();
				if (navSegment instanceof FeatureContext) {
					FeatureContext featCtx = (FeatureContext) navSegment;
					String feature = featCtx.Ident().getText();
					String target = navCtx.expression().getText();
					res = ModelBuilder.singleton.buildFeatureAssign(target, feature, value);
					parseRes.getStartPositions().put(((FeatureAssignment) res).getValue(),
							ctx.expression().get(1).start.getStartIndex());
					parseRes.getEndPositions().put(((FeatureAssignment) res).getValue(),
							ctx.expression().get(1).stop.getStopIndex());
				}
			} else {
				// TODO: raise error if we reach here
				res = ModelBuilder.singleton.buildVariableAssignement(left.getText(), value);
			}
			parseRes.getStartPositions().put(res, ctx.start.getStartIndex());
			parseRes.getEndPositions().put(res, ctx.stop.getStopIndex());
			return res;
		}

		@Override
		public Statement visitRIf(RIfContext ctx) {
			String cond = ctx.expression().getText();
			Block then = (new BlockVisitor(parseRes)).visit(ctx.rBlock().get(0));
			Block elseB = null;
			if (ctx.rBlock().size() > 1)
				elseB = (new BlockVisitor(parseRes)).visit(ctx.rBlock().get(1));
			If res = ModelBuilder.singleton.buildIf(cond, then, elseB);
			parseRes.getStartPositions().put(res, ctx.start.getStartIndex());
			parseRes.getEndPositions().put(res, ctx.stop.getStopIndex());
			parseRes.getStartPositions().put(res.getCondition(), ctx.expression().start.getStartIndex());
			parseRes.getEndPositions().put(res.getCondition(), ctx.expression().stop.getStopIndex());
			return res;
		}

		@Override
		public Statement visitRForEach(RForEachContext ctx) {

			ForEach res = null;
			Block body = (new BlockVisitor(parseRes)).visit(ctx.rBlock());
			ExpressionContext collectionExp = ctx.rCollection().expression();
			if (collectionExp == null) {
				String left = ctx.rCollection().Integer().get(0).getText();
				String right = ctx.rCollection().Integer().get(1).getText();
				SequenceInExtensionLiteral intSeq = ModelBuilder.singleton.buildIntSequence(left, right);
				res = ModelBuilder.singleton.buildForEach(ctx.Ident().getText(), intSeq, body);
			} else {
				res = ModelBuilder.singleton.buildForEach(ctx.Ident().getText(), collectionExp.getText(), body);
				parseRes.getStartPositions().put(res.getCollectionExpression(), collectionExp.start.getStartIndex());
				parseRes.getEndPositions().put(res.getCollectionExpression(), collectionExp.stop.getStopIndex());
			}
			parseRes.getStartPositions().put(res, ctx.start.getStartIndex());
			parseRes.getEndPositions().put(res, ctx.stop.getStopIndex());
			return res;
		}

		@Override
		public Statement visitRWhile(RWhileContext ctx) {
			Block body = (new BlockVisitor(parseRes)).visit(ctx.rBlock());
			While res = ModelBuilder.singleton.buildWhile(ctx.expression().getText(), body);
			parseRes.getStartPositions().put(res, ctx.start.getStartIndex());
			parseRes.getEndPositions().put(res, ctx.stop.getStopIndex());
			parseRes.getStartPositions().put(res.getCondition(), ctx.expression().start.getStartIndex());
			parseRes.getEndPositions().put(res.getCondition(), ctx.expression().stop.getStopIndex());
			return res;
		}

		@Override
		public Statement visitRExpression(RExpressionContext ctx) {

			ExpressionContext exp = ctx.expression();

			Statement res = null;
			if (exp instanceof NavContext) {
				NavigationSegmentContext navSegment = ((NavContext) exp).navigationSegment();
				if (navSegment instanceof CallOrApplyContext) {
					CallExpContext call = ((CallOrApplyContext) navSegment).callExp();
					if (call instanceof ServiceCallContext) {
						String serviceName = ((ServiceCallContext) call).Ident().getText();

						String target = "";
						String feature = "";
						ExpressionContext beforeCall = ((NavContext) exp).expression();
						if (beforeCall instanceof NavContext) {
							NavigationSegmentContext featurePart = ((NavContext) beforeCall).navigationSegment();
							if (featurePart instanceof FeatureContext) {
								feature = ((FeatureContext) featurePart).Ident().getText();
								target = ((NavContext) beforeCall).expression().getText();
							}
						}

						List<ExpressionContext> params = ((ServiceCallContext) call).expressionSequence().expression();

						if (serviceName.equals("add") && params.size() == 1) {
							res = ModelBuilder.singleton.buildFeatureInsert(target, feature, params.get(0).getText());
							parseRes.getStartPositions().put(((FeatureInsert) res).getTarget(),
									((NavContext) beforeCall).expression().start.getStartIndex());
							parseRes.getEndPositions().put(((FeatureInsert) res).getTarget(),
									((NavContext) beforeCall).expression().stop.getStopIndex());
							parseRes.getStartPositions().put(((FeatureInsert) res).getValue(),
									params.get(0).start.getStartIndex());
							parseRes.getEndPositions().put(((FeatureInsert) res).getValue(),
									params.get(0).stop.getStopIndex());
						} else if (serviceName.equals("remove") && params.size() == 1) {
							res = ModelBuilder.singleton.buildFeatureRemove(target, feature, params.get(0).getText());
							parseRes.getStartPositions().put(((FeatureRemove) res).getTarget(),
									((NavContext) beforeCall).expression().start.getStartIndex());
							parseRes.getEndPositions().put(((FeatureRemove) res).getTarget(),
									((NavContext) beforeCall).expression().stop.getStopIndex());
							parseRes.getStartPositions().put(((FeatureRemove) res).getValue(),
									params.get(0).start.getStartIndex());
							parseRes.getEndPositions().put(((FeatureRemove) res).getValue(),
									params.get(0).stop.getStopIndex());
						} else if (serviceName.equals("put") && params.size() == 2) {
							res = ModelBuilder.singleton.buildFeaturePut(target, feature, params.get(0).getText(),
									params.get(1).getText());
							parseRes.getStartPositions().put(((FeaturePut) res).getTarget(),
									((NavContext) beforeCall).expression().start.getStartIndex());
							parseRes.getEndPositions().put(((FeaturePut) res).getTarget(),
									((NavContext) beforeCall).expression().stop.getStopIndex());
							parseRes.getStartPositions().put(((FeaturePut) res).getKey(),
									params.get(0).start.getStartIndex());
							parseRes.getEndPositions().put(((FeaturePut) res).getKey(),
									params.get(0).stop.getStopIndex());
							parseRes.getStartPositions().put(((FeaturePut) res).getValue(),
									params.get(1).start.getStartIndex());
							parseRes.getEndPositions().put(((FeaturePut) res).getValue(),
									params.get(1).stop.getStopIndex());
						}
					}
				}
			}

			if (res == null) {
				res = ModelBuilder.singleton.buildExpressionStatement(exp.getText());
				parseRes.getStartPositions().put(((ExpressionStatement) res).getExpression(),
						exp.start.getStartIndex());
				parseRes.getEndPositions().put(((ExpressionStatement) res).getExpression(), exp.stop.getStopIndex());
			}

			parseRes.getStartPositions().put(res, ctx.start.getStartIndex());
			parseRes.getEndPositions().put(res, ctx.stop.getStopIndex());
			return res;
		}
	}

	static class OpVisitor extends XtdAQLBaseVisitor<Behaviored> {

		ParseResult<ModelBehavior> parseRes;

		public OpVisitor(ParseResult<ModelBehavior> parseRes) {
			this.parseRes = parseRes;
		}

		@Override
		public Behaviored visitROperation(final ROperationContext ctx) {
			final String keyword = ctx.children.stream().filter(c -> c instanceof TerminalNode).findFirst().get().getText();
			
			final String returnType = ctx.type.getText();

			final String operationName = ctx.name.getText();

			List<Parameter> parameters = new ArrayList<Parameter>();
			if (ctx.parameters != null) {
				parameters = new ParamVisitor(parseRes).visit(ctx.parameters);
			}

			final Block body = new BlockVisitor(parseRes).visit(ctx.body);

			final String className = ctx.parent.getChild(1).getText();

			final List<String> tags = ctx.tags.stream().map(t -> t.Ident().getText()).collect(Collectors.toList());

			Behaviored res = null;
			if (keyword.equals("def")) {
				res = ModelBuilder.singleton.buildMethod(operationName, parameters, returnType, body, tags);
			} else if (keyword.equals("override")) {
				res = ModelBuilder.singleton.buildImplementation(className, operationName, parameters, returnType, body,
						tags);
			} else {
				// TODO: error: should not happen
				res = ModelBuilder.singleton.buildMethod(operationName, parameters, returnType, body, tags);
			}

			parseRes.getStartPositions().put(res, ctx.start.getStartIndex());
			parseRes.getEndPositions().put(res, ctx.stop.getStopIndex());
			return res;
		}

	}

	static class ParamVisitor extends XtdAQLBaseVisitor<List<Parameter>> {

		ParseResult<ModelBehavior> parseRes;

		public ParamVisitor(ParseResult<ModelBehavior> parseRes) {
			this.parseRes = parseRes;
		}

		@Override
		public List<Parameter> visitRParameters(RParametersContext ctx) {
			VarVisitor subVisitor = new VarVisitor(parseRes);
			List<Parameter> res = ctx.rVariable().stream().map(var -> subVisitor.visit(var))
					.collect(Collectors.toList());
			parseRes.getStartPositions().put(res, ctx.start.getStartIndex());
			parseRes.getEndPositions().put(res, ctx.stop.getStopIndex());
			return res;
		}
	}

	static class VarVisitor extends XtdAQLBaseVisitor<Parameter> {

		ParseResult<ModelBehavior> parseRes;

		public VarVisitor(ParseResult<ModelBehavior> parseRes) {
			this.parseRes = parseRes;
		}

		@Override
		public Parameter visitRVariable(RVariableContext ctx) {
			String typeName = null;
			if (ctx.type.qualified() == null) { // String type
				typeName = ctx.type.typeLiteral().getText();
			} else {
				typeName = ctx.type.qualified().getText();
			}

			String name = ctx.Ident().getText();

			Parameter res = ModelBuilder.singleton.buildParameter(typeName, name);
			parseRes.getStartPositions().put(res, ctx.start.getStartIndex());
			parseRes.getEndPositions().put(res, ctx.stop.getStopIndex());
			return res;
		}
	}

	static class ClassVisitor extends XtdAQLBaseVisitor<ExtendedClass> {

		ParseResult<ModelBehavior> parseRes;
		private ModelBehavior modelBehavior;
		
		Map<String,ModelBehavior> importedBehaviors;
		
		public ClassVisitor(ParseResult<ModelBehavior> parseRes, ModelBehavior modelBehavior, Map<String,ModelBehavior> importedBehaviors) {
			this.parseRes = parseRes;
			this.modelBehavior = modelBehavior;
			this.importedBehaviors = importedBehaviors;
		}

		@Override
		public ExtendedClass visitRClass(RClassContext ctx) {
			String name = ctx.name.getText();
			AttributeVisitor subVisitor1 = new AttributeVisitor(parseRes);
			List<VariableDeclaration> attributes = ctx.rAttribute().stream()
					.map(attr -> (VariableDeclaration) subVisitor1.visitRAttribute(attr)).collect(Collectors.toList());
			OpVisitor subVisitor2 = new OpVisitor(parseRes);
			List<Behaviored> operations = ctx.rOperation().stream().map(op -> subVisitor2.visit(op))
					.collect(Collectors.toList());
			ExtendedClass res = ModelBuilder.singleton.buildExtendedClass(name,attributes,operations,this.modelBehavior);
			
			if(ctx.qualified().size() == 2 ){
				String extendName = ctx.qualified().get(1).getText();
				if(ModelBuilder.isQualified(extendName)){
					String xtdName = ModelBuilder.getLastSegment(extendName);
					String qualifying = ModelBuilder.getQualifyingPart(extendName);
					ModelBehavior superBhv = importedBehaviors.get(qualifying);
					if(superBhv != null){
						Optional<ExtendedClass> superCls = 
							superBhv
							.getClassExtensions()
							.stream()
							.filter(cls -> cls.getBaseClass().getName().equals(xtdName))
							.findFirst();
						if(superCls.isPresent()){
							res.getExtends().add(superCls.get());
						}
					}
				}
			}
			
			parseRes.getStartPositions().put(res,ctx.start.getStartIndex());
			parseRes.getEndPositions().put(res,ctx.stop.getStopIndex());
			return res;
		}
	}

	static class AttributeVisitor extends XtdAQLBaseVisitor<VariableDeclaration> {

		ParseResult<ModelBehavior> parseRes;

		public AttributeVisitor(ParseResult<ModelBehavior> parseRes) {
			this.parseRes = parseRes;
		}

		@Override
		public VariableDeclaration visitRAttribute(RAttributeContext ctx) {
			String initialValue = null;
			if (ctx.expression() != null) {
				initialValue = ctx.expression().getText();
			}

			String typeName = null;
			if (ctx.type.qualified() == null) { // String type
				typeName = ctx.type.typeLiteral().getText();
			} else {
				typeName = ctx.type.qualified().getText();
			}

			String name = ctx.Ident().getText();

			VariableDeclaration res = ModelBuilder.singleton.buildVariableDecl(name, initialValue, typeName);
			parseRes.getStartPositions().put(res, ctx.start.getStartIndex());
			parseRes.getEndPositions().put(res, ctx.stop.getStopIndex());
			if (res.getInitialValue() != null) {
				parseRes.getStartPositions().put(res.getInitialValue(), ctx.expression().start.getStartIndex());
				parseRes.getEndPositions().put(res.getInitialValue(), ctx.expression().stop.getStopIndex());
			}
			return res;
		}
	}

	static class ServiceVisitor extends XtdAQLBaseVisitor<String> {
		@Override
		public String visitRImportService(RImportServiceContext ctx) {
			String rawText = ctx.getText();
			rawText = rawText.replaceFirst("use", "");
			rawText = rawText.replaceFirst(";", "");
			rawText.replaceAll("\\t\\r\\n", "");
			return rawText;
		}
	}

	static class ImportSyntaxVisitor extends XtdAQLBaseVisitor<ImportSyntax> {

		@Override
		public ImportSyntax visitRImportSyntax(RImportSyntaxContext ctx) {
			ImportSyntax importSyntax = ImplementationFactory.eINSTANCE.createImportSyntax();
			importSyntax.setUri(ctx.uri.getText().substring(1, ctx.uri.getText().length() - 1));
			importSyntax.setName(ctx.name.getText());
			return importSyntax;
		}

	}

	static class ModelBehaviorVisitor extends XtdAQLBaseVisitor<ModelBehavior> {

		ParseResult<ModelBehavior> parseRes;
		AstBuilder currentBuilder;
		Map<String,EPackage> namespaces;
		
		public ModelBehaviorVisitor(ParseResult<ModelBehavior> parseRes, Map<String,EPackage> namespaces, AstBuilder builder) {
			this.parseRes = parseRes;
			this.namespaces = namespaces;
			this.currentBuilder = builder;
		}

		@Override
		public ModelBehavior visitRRoot(RRootContext ctx) {
			
			ImplementationFactory factory = (ImplementationFactory) ImplementationPackage.eINSTANCE.getEFactoryInstance();
			ModelBehavior res = factory.createModelBehavior();
			res.setName(ctx.name.getText());
			res.getImportSyntaxes().addAll(ctx.rImportSyntax().stream().map(is -> new ImportSyntaxVisitor().visit(is))
					.collect(Collectors.toList()));
			
			/*
			 * Resolve syntax mapping
			 */
			ctx
			.rImportSyntax()
			.stream()
			.forEach(importCtx -> {
				String uri = importCtx.STRING().getText();
				String namespace = importCtx.Ident().getText();
				
				Optional<EPackage> searchPkg = ModelBuilder.singleton.resolveUri(uri);
				if(searchPkg.isPresent()){
					namespaces.putIfAbsent(namespace,searchPkg.get());
				}
			});
			namespaces
			.entrySet()
			.stream()
			.forEach(entry -> {
				ImportSyntax importSyntax = factory.createImportSyntax();
				importSyntax.setName(entry.getKey());
				importSyntax.setUri(entry.getValue().getNsURI());
			});
			
			/*
			 * Visit imported Behaviors
			 */
			Map<String,ModelBehavior> importedBehaviors = new HashMap<String,ModelBehavior>(); 
			ctx
			.rImportSemantic()
			.stream()
			.forEach(importCtx -> {
				String behaviorID = importCtx.qualified().getText();
				String behaviorNs = importCtx.Ident().get(0).getText();
				String importPkgNs = importCtx.Ident().get(1).getText();
				String currentPkgNs = importCtx.Ident().get(2).getText();
				
				Optional<File> file = currentBuilder.resolve(behaviorID);
				if(file.isPresent()){
					Map<String,EPackage> newNamespaces = new HashMap<String,EPackage>();
					newNamespaces.put(importPkgNs, namespaces.get(currentPkgNs));
					String fileContent = AstBuilder.getFileContent(file.get().getPath());
					ParseResult<ModelBehavior> importedBhv = currentBuilder.parse(fileContent, newNamespaces); //TODO: merge error msg
					importedBehaviors.put(behaviorNs, importedBhv.getRoot());
				}
			});
			
			/*
			 * Visit class extensions
			 */
			ClassVisitor subVisitor = new ClassVisitor(parseRes, res, importedBehaviors);
			
			res.getClassExtensions().addAll(
					ctx
					.rClass()
					.stream()
					.map(cls -> subVisitor.visit(cls))
					.collect(Collectors.toList())
					);
			ServiceVisitor serviceVisitor = new ServiceVisitor();
			res.getServices().addAll(
					ctx.rImportService().stream().map(srv -> serviceVisitor.visit(srv)).collect(Collectors.toList()));
			if (parseRes.getRoot() != null) {
				parseRes.getStartPositions().put(res, ctx.start.getStartIndex());
				parseRes.getEndPositions().put(res, ctx.stop.getStopIndex());
			}
			return res;
		}
	}
	
	public static ParseResult<ModelBehavior> visit(RRootContext rootCtx, Map<String,EPackage> initNamespaces, AstBuilder builder) {
		ParseResult<ModelBehavior> result = new ParseResult<ModelBehavior>();
		result.setDiagnostic(new BasicDiagnostic());
		ModelBehavior root = (new ModelBehaviorVisitor(result,initNamespaces,builder)).visit(rootCtx);
		result.setRoot(root);
		return result;
	}
}