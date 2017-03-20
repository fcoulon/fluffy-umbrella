package lang.ide.resource;

import org.eclipse.acceleo.query.runtime.IQueryEnvironment;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import lang.core.parser.DslBuilder;
import lang.core.resource.AntlrResource;
import lang.core.resource.AntlrResourceFactory;

public class WorkbenchResourceFactory extends AntlrResourceFactory {

	ResourceSet rs;
	
	public WorkbenchResourceFactory(IQueryEnvironment qryEnv, ResourceSet rs) {
		super(qryEnv);
		this.rs = rs;
	}

	@Override
	public Resource createResource(URI uri) {
		return new WorkbenchResource(uri,new DslBuilder(qryEnv,rs));
	}
	
}
