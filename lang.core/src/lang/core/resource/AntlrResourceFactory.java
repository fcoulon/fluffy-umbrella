package lang.core.resource;

import org.eclipse.acceleo.query.runtime.IQueryEnvironment;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import lang.core.parser.DslBuilder;

public class AntlrResourceFactory implements Resource.Factory{
	
	IQueryEnvironment qryEnv;

	public AntlrResourceFactory(IQueryEnvironment qryEnv) {
		this.qryEnv = qryEnv;
	}

	@Override
	public Resource createResource(URI uri) {
		return new AntlrResource(uri,new DslBuilder(qryEnv));
	}
	
}
