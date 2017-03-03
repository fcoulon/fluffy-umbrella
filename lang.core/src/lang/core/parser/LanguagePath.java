package lang.core.parser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.EPackage;
import java.io.File;

/**
 * Scope of Language elements
 */
public class LanguagePath {
	
//	/**
//	 * EPackages in the scope
//	 */
//	List<EPackage> syntaxRegistry;
	
	/**
	 * Behavior ID to File
	 */
	Map<String,File> behaviorRegistry;
	
	public LanguagePath(List<File> behaviors) {
		behaviorRegistry = new HashMap<String,File>();
		behaviors
		.stream()
		.forEach(file -> {
			String fileContent = AstBuilder.getFileContent(file.getPath());
			String ID = AstBuilder.getBehaviorID(fileContent);
			behaviorRegistry.put(ID, file);
		});
	}
//	
//	public Optional<EPackage> getPackage(String uri) {
//		return syntaxRegistry.stream().filter(p -> p.getNsURI().equals(uri)).findFirst();
//	}
	
	public Optional<File> getBehavior(String ID) {
		return Optional.ofNullable(behaviorRegistry.get(ID));
	}
}
