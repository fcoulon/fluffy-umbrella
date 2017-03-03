package fluffyumbrellacompiler.ui.popup.actions;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.mleduc.mt.compiler.Compiler;
import implementation.ModelBehavior;

public class XAQLCompile implements IObjectActionDelegate {

	private Shell shell;
	private final IFile selectedIFile = null;

	/**
	 * Constructor for Action1.
	 */
	public XAQLCompile() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(final IAction action, final IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(final IAction action) {

		try {
			final String fileContent = new String(
					Files.readAllBytes(this.selectedIFile.getFullPath().toFile().toPath()));

			final Compiler compiler = new Compiler(fileContent);

			final Map<String, EPackage> syntaxes = compiler.getListSyntaxes();

			final ModelBehavior language = compiler.getRoot();

			final ResourceSetImpl resSet = new ResourceSetImpl();
			// TODO: replace fsm by the language name (or project name)
			EPackage languagePackage = compiler.initializeLanguageEcore(syntaxes, "fsm", resSet, language.getName());

			// TODO : alterate the language package with the semantical
			// constructions defined in the body

			GenModel languageGenerator = compiler.saveGenModel(resSet, language.getName(), languagePackage, "fsm");

			compiler.proceedToGeneration(languageGenerator);

		} catch (final IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(final IAction action, final ISelection selection) {
	}

}
