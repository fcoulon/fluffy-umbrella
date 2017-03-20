package lang.ide.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;

import implementation.ModelBehavior;
import lang.core.parser.Dsl;
import lang.core.parser.DslBuilder;
import lang.core.parser.visitor.ParseResult;
import lang.core.resource.AntlrResource;
import lang.ide.WorkbenchDsl;

public class WorkbenchResource extends AntlrResource { //FIXME: code duplication

	public WorkbenchResource(URI uri, DslBuilder parser) {
		super(uri, parser);
	}
	
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		Dsl dslFile = new WorkbenchDsl(inputStream);
		List<ParseResult<ModelBehavior>> newParseResult = parser.parse(dslFile);
		
		if(newParseResult != null) { //TODO: check no parse error
			parseResult = newParseResult;
			List<ModelBehavior> newContent = parseResult.stream().map(pr -> pr.getRoot()).collect(Collectors.toList());
			getContents().addAll(newContent);
		}
	}

}
