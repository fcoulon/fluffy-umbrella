/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.ecoretools.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.ecoretools.parser.antlr.internal.InternalAleParser;
import org.eclipse.ecoretools.services.AleGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class AleParser extends AbstractAntlrParser {

	@Inject
	private AleGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAleParser createParser(XtextTokenStream stream) {
		return new InternalAleParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "rRoot";
	}

	public AleGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AleGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
