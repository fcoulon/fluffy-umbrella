package lang.core.parser;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;

import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import org.eclipse.acceleo.query.runtime.IQueryEnvironment;

import implementation.ModelBehavior;
import lang.core.parser.XtdAQLParser.RRootContext;
import lang.core.parser.visitor.ModelBuilder;
import lang.core.parser.visitor.ParseResult;
import lang.core.parser.visitor.Visitors;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * This class parse ".implem" file and produce model intance of Implementation metamodel
 */
public class AstBuilder {
	
	/*
	 * Behavior & Syntax registry
	 */
	LanguagePath languagePath;
	
	public AstBuilder(IQueryEnvironment qryEnv, LanguagePath languagePath) {
		ModelBuilder.createSingleton(qryEnv);
		this.languagePath = languagePath;
	}
	
	public AstBuilder(IQueryEnvironment qryEnv) {
		ModelBuilder.createSingleton(qryEnv);
		this.languagePath = new LanguagePath(new ArrayList<File>());
	}
	
	public ParseResult<ModelBehavior> parse(String program) {
		return parse(program, new HashMap<String,EPackage>());
	}
	
	public ParseResult<ModelBehavior> parse(String program, Map<String,EPackage> initNamespace) {
		//FIXME: manage cycle
		
		UnbufferedCharStream input = new UnbufferedCharStream(new StringReader(program), program.length());
		XtdAQLLexer lexer = new XtdAQLLexer(input);
		lexer.setTokenFactory(new CommonTokenFactory(true));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		XtdAQLParser parser = new XtdAQLParser(tokens);
		RRootContext rootCtx  = parser.rRoot();
		
		return Visitors.visit(rootCtx,initNamespace,this);
	}
	
	public static String getBehaviorID(String program) { 
		//TODO: use cache for File -> RRootContext
		UnbufferedCharStream input = new UnbufferedCharStream(new StringReader(program), program.length());
		XtdAQLLexer lexer = new XtdAQLLexer(input);
		lexer.setTokenFactory(new CommonTokenFactory(true));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		XtdAQLParser parser = new XtdAQLParser(tokens);
		RRootContext rootCtx  = parser.rRoot();
		return rootCtx.Qualified().getText();
	}
	
	public Optional<File> resolve(String behaviorID) {
		return Optional.ofNullable(languagePath.behaviorRegistry.get(behaviorID));
	}
	
	public static String getFileContent(String implementionPath){
		String fileContent = "";
		try {
			fileContent = new String(Files.readAllBytes(Paths.get(implementionPath)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileContent;
	}
}