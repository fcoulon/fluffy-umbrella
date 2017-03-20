package lang.core.parser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Dsl {
	List<String> allSyntaxes = new ArrayList<String>();
	List<String> allSemantics = new ArrayList<String>();
	
	public Dsl(List<String> syntaxes, List<String> semantics) {
		this.allSyntaxes.addAll(syntaxes);
		this.allSemantics.addAll(semantics);
	}
	
	public Dsl(String dslFile) throws FileNotFoundException {
		this(new FileInputStream(dslFile));
	}
	
	public Dsl(InputStream input) {
		Properties dslProp = new Properties();
		try {
			dslProp.load(input);
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String allSyntaxes = (String) dslProp.get("syntax");
		String allBehaviors = (String) dslProp.get("behavior");
		
		String[] syntaxes = allSyntaxes.split(",");
		String[] behaviors = allBehaviors.split(",");
		
		this.allSyntaxes.addAll(Arrays.asList(syntaxes));
		this.allSemantics.addAll(Arrays.asList(behaviors));
	}
	
	public List<String> getAllSemantics() {
		return allSemantics;
	}
	
	public List<String> getAllSyntaxes() {
		return allSyntaxes;
	}
}
