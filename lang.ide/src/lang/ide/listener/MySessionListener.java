package lang.ide.listener;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.acceleo.query.ast.AstPackage;
import org.eclipse.acceleo.query.runtime.IQueryEnvironment;
import org.eclipse.acceleo.query.runtime.Query;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.description.RepresentationExtensionDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

import implementation.ImplementationPackage;
import implementation.ModelBehavior;
import lang.LangInterpreter;
import lang.core.parser.AstBuilder;
import lang.core.parser.visitor.ParseResult;
import lang.core.resource.AntlrResourceFactory;
import lang.ide.resource.WorkbenchResourceFactory;
import lang.ide.services.Services;

public class MySessionListener implements SessionManagerListener{

	public static final String ECORE_VP_EXTENSION = "MyExtension";
	public static final String IMPLEM_EXTENSION = "mydsl";
	public static final String DSL_EXTENSION = "dsl";

	@Override
	public void notifyAddSession(Session newSession) {
		
		initEnvironment(newSession);
		
		System.out.println("Session is added");
	}

	@Override
	public void notifyRemoveSession(Session removedSession) {
		System.out.println("Session is removed");
	}

	@Override
	public void viewpointSelected(Viewpoint selectedSirius) {
		
		
		System.out.println("Viewpoint is selected");
	}

	@Override
	public void viewpointDeselected(Viewpoint deselectedSirius) {
		System.out.println("Viewpoint is deselected");
	}

	@Override
	public void notify(Session updated, int notification) {
		System.out.println("Session is notified");
	}
	
	private void initEnvironment(Session session) {
		final TransactionalEditingDomain editingDomain = session.getTransactionalEditingDomain();
		ResourceSet rs = editingDomain.getResourceSet();
		
		LangInterpreter interpreter = new LangInterpreter();
		rs.getResourceFactoryRegistry()
			.getExtensionToFactoryMap()
			.put("dsl", new WorkbenchResourceFactory(interpreter.getQueryEnvironment(),rs));
	}
}
