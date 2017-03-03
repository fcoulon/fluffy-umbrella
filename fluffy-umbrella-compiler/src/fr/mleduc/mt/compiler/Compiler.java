package fr.mleduc.mt.compiler;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * 
 * This compiler compiles a given semantic, which conform itself to a bunch of
 * syntaxes, to a bunch of (conforming) target syntaxes.
 * 
 * @author mleduc
 *
 */
public class Compiler {

	public GenModel saveGenModel(final ResourceSetImpl resSet, final String languageName, final EPackage rootPackage,
			String projectName) {
		/*
		 * Final step: Generating the emf code from the ecore generated
		 */

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

		// resSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));

		final GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
		genModel.getForeignModel().add("http://" + languageName);
		genModel.setModelName("MODELNAMETEST");
		genModel.setModelPluginID("ModelPluginIDTest");
		genModel.getForeignModel().add(rootPackage.getNsURI());
		genModel.initialize(Collections.singleton(rootPackage));
		genModel.setModelDirectory("/" + projectName + "/src");

		final URI createURI = URI
				.createPlatformResourceURI("/" + projectName + "/src-gen/" + languageName + ".genmodel", true);
		final Resource res = resSet.createResource(createURI);

		res.getContents().add(genModel);

		try {
			res.save(null);

		} catch (final IOException e) {
			e.printStackTrace();
		}

		return genModel;
	}

	public EPackage initializeLanguageEcore(final Map<String, EPackage> syntaxes, final String languageName,
			ResourceSetImpl resSet, String projectName) {
		/*
		 * First step: copying the target syntaxes to a working directory
		 * 
		 */

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());

		final URI createUri = URI.createPlatformResourceURI("/" + projectName + "/src-gen/" + languageName + ".ecore",
				true);
		final Resource res = resSet.createResource(createUri);
		final EPackage rootPackage = EcoreFactory.eINSTANCE.createEPackage();
		rootPackage.setName(languageName);
		rootPackage.setNsPrefix(languageName);
		rootPackage.setNsURI("http://" + languageName);
		res.getContents().add(rootPackage);
		for (final Entry<String, EPackage> ePackage : syntaxes.entrySet()) {

			final EPackage copy = EcoreUtil.copy(ePackage.getValue());
			for (EPackage eSubPackage : copy.getESubpackages()) {
				final String initialName = eSubPackage.getName();
				eSubPackage.setName(languageName + ePackage.getKey() + initialName);
				eSubPackage.setNsPrefix(languageName + copy.getNsPrefix());
				eSubPackage.setNsURI("http://" + languageName + "/" + initialName);
			}

			final String initialName = ePackage.getKey();
			copy.setName(languageName + initialName);
			copy.setNsPrefix(languageName + copy.getNsPrefix());
			copy.setNsURI("http://" + languageName + "/" + initialName);
			rootPackage.getESubpackages().add(copy);
		}

		try {
			res.save(null);
		} catch (final IOException e) {
			e.printStackTrace();
		}

		return rootPackage;
	}

	public void proceedToGeneration(GenModel genModel) {
		genModel.reconcile();
		genModel.setCanGenerate(true);
		genModel.setValidateModel(true);
		genModel.setUpdateClasspath(true);

		org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory.Descriptor.Registry reg = GeneratorAdapterFactory.Descriptor.Registry.INSTANCE;
		Generator generator = new Generator(reg);
		generator.setInput(genModel);

		generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, new NullMonitorImplementation(this));

	}
}
