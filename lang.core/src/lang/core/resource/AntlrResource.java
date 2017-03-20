package lang.core.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import implementation.ModelBehavior;
import lang.core.parser.Dsl;
import lang.core.parser.DslBuilder;
import lang.core.parser.visitor.ParseResult;

public class AntlrResource extends ResourceImpl{

	DslBuilder parser;
	List<ParseResult<ModelBehavior>> parseResult;
	
	public AntlrResource(URI uri, DslBuilder parser) {
		super(uri);
		this.parser = parser;
	}
	
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		Dsl dslFile = new Dsl(inputStream);
		List<ParseResult<ModelBehavior>> newParseResult = parser.parse(dslFile);
		
		if(newParseResult != null) { //TODO: check no parse error
			unload();
			parseResult = newParseResult;
			List<ModelBehavior> newContent = parseResult.stream().map(pr -> pr.getRoot()).collect(Collectors.toList());
			getContents().addAll(newContent);
		}
	}
	
	@Override
	protected void doUnload() {
		super.doUnload();
		//TODO: remove parse result?
	}
	
	@Override
	public void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		//FIXME: need a serializer
	}
	
	public List<ParseResult<ModelBehavior>> getParseResult() {
		return parseResult;
	}
}
