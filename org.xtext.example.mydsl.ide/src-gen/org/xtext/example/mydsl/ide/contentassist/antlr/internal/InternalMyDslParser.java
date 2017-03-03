package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_STRING", "RULE_INT", "RULE_REAL", "RULE_MULTOP", "RULE_ID", "RULE_LETTER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def'", "'override'", "'+'", "'-'", "'<='", "'>='", "'!='", "'<>'", "'='", "'=='", "'<'", "'>'", "'select'", "'reject'", "'collect'", "'any'", "'exists'", "'forAll'", "'isUnique'", "'one'", "'sortedBy'", "'closure'", "'true'", "'false'", "'null'", "'String'", "'Integer'", "'Real'", "'Boolean'", "'behavior'", "'.'", "'import'", "'syntax'", "'as'", "';'", "'semantic'", "'('", "'=>'", "')'", "'service'", "'class'", "'{'", "'}'", "'@'", "','", "':='", "'for'", "'in'", "'['", "'..'", "']'", "'if'", "'else'", "'while'", "'and'", "'or'", "'xor'", "'implies'", "'->'", "'not'", "'then'", "'endif'", "'let'", "':'", "'|'", "'Sequence{'", "'OrderedSet{'", "'::'", "'Sequence('", "'OrderedSet('"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=9;
    public static final int RULE_REAL=7;
    public static final int RULE_IDENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_LETTER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_MULTOP=8;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulerRoot"
    // InternalMyDsl.g:54:1: entryRulerRoot : rulerRoot EOF ;
    public final void entryRulerRoot() throws RecognitionException {
        try {
            // InternalMyDsl.g:55:1: ( rulerRoot EOF )
            // InternalMyDsl.g:56:1: rulerRoot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRRootRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerRoot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRRootRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerRoot"


    // $ANTLR start "rulerRoot"
    // InternalMyDsl.g:63:1: rulerRoot : ( ( rule__RRoot__Group__0 ) ) ;
    public final void rulerRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:67:2: ( ( ( rule__RRoot__Group__0 ) ) )
            // InternalMyDsl.g:68:2: ( ( rule__RRoot__Group__0 ) )
            {
            // InternalMyDsl.g:68:2: ( ( rule__RRoot__Group__0 ) )
            // InternalMyDsl.g:69:3: ( rule__RRoot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRRootAccess().getGroup()); 
            }
            // InternalMyDsl.g:70:3: ( rule__RRoot__Group__0 )
            // InternalMyDsl.g:70:4: rule__RRoot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RRoot__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRRootAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerRoot"


    // $ANTLR start "entryRuleQualified"
    // InternalMyDsl.g:79:1: entryRuleQualified : ruleQualified EOF ;
    public final void entryRuleQualified() throws RecognitionException {
        try {
            // InternalMyDsl.g:80:1: ( ruleQualified EOF )
            // InternalMyDsl.g:81:1: ruleQualified EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualified();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualified"


    // $ANTLR start "ruleQualified"
    // InternalMyDsl.g:88:1: ruleQualified : ( ( rule__Qualified__Group__0 ) ) ;
    public final void ruleQualified() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:92:2: ( ( ( rule__Qualified__Group__0 ) ) )
            // InternalMyDsl.g:93:2: ( ( rule__Qualified__Group__0 ) )
            {
            // InternalMyDsl.g:93:2: ( ( rule__Qualified__Group__0 ) )
            // InternalMyDsl.g:94:3: ( rule__Qualified__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedAccess().getGroup()); 
            }
            // InternalMyDsl.g:95:3: ( rule__Qualified__Group__0 )
            // InternalMyDsl.g:95:4: rule__Qualified__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Qualified__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualified"


    // $ANTLR start "entryRulerImportSyntax"
    // InternalMyDsl.g:104:1: entryRulerImportSyntax : rulerImportSyntax EOF ;
    public final void entryRulerImportSyntax() throws RecognitionException {
        try {
            // InternalMyDsl.g:105:1: ( rulerImportSyntax EOF )
            // InternalMyDsl.g:106:1: rulerImportSyntax EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSyntaxRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerImportSyntax();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSyntaxRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerImportSyntax"


    // $ANTLR start "rulerImportSyntax"
    // InternalMyDsl.g:113:1: rulerImportSyntax : ( ( rule__RImportSyntax__Group__0 ) ) ;
    public final void rulerImportSyntax() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:117:2: ( ( ( rule__RImportSyntax__Group__0 ) ) )
            // InternalMyDsl.g:118:2: ( ( rule__RImportSyntax__Group__0 ) )
            {
            // InternalMyDsl.g:118:2: ( ( rule__RImportSyntax__Group__0 ) )
            // InternalMyDsl.g:119:3: ( rule__RImportSyntax__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSyntaxAccess().getGroup()); 
            }
            // InternalMyDsl.g:120:3: ( rule__RImportSyntax__Group__0 )
            // InternalMyDsl.g:120:4: rule__RImportSyntax__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RImportSyntax__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSyntaxAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerImportSyntax"


    // $ANTLR start "entryRulerImportSemantic"
    // InternalMyDsl.g:129:1: entryRulerImportSemantic : rulerImportSemantic EOF ;
    public final void entryRulerImportSemantic() throws RecognitionException {
        try {
            // InternalMyDsl.g:130:1: ( rulerImportSemantic EOF )
            // InternalMyDsl.g:131:1: rulerImportSemantic EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSemanticRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerImportSemantic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSemanticRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerImportSemantic"


    // $ANTLR start "rulerImportSemantic"
    // InternalMyDsl.g:138:1: rulerImportSemantic : ( ( rule__RImportSemantic__Group__0 ) ) ;
    public final void rulerImportSemantic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:142:2: ( ( ( rule__RImportSemantic__Group__0 ) ) )
            // InternalMyDsl.g:143:2: ( ( rule__RImportSemantic__Group__0 ) )
            {
            // InternalMyDsl.g:143:2: ( ( rule__RImportSemantic__Group__0 ) )
            // InternalMyDsl.g:144:3: ( rule__RImportSemantic__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSemanticAccess().getGroup()); 
            }
            // InternalMyDsl.g:145:3: ( rule__RImportSemantic__Group__0 )
            // InternalMyDsl.g:145:4: rule__RImportSemantic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RImportSemantic__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSemanticAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerImportSemantic"


    // $ANTLR start "entryRulerImportService"
    // InternalMyDsl.g:154:1: entryRulerImportService : rulerImportService EOF ;
    public final void entryRulerImportService() throws RecognitionException {
        try {
            // InternalMyDsl.g:155:1: ( rulerImportService EOF )
            // InternalMyDsl.g:156:1: rulerImportService EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerImportService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportServiceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerImportService"


    // $ANTLR start "rulerImportService"
    // InternalMyDsl.g:163:1: rulerImportService : ( ( rule__RImportService__Group__0 ) ) ;
    public final void rulerImportService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:167:2: ( ( ( rule__RImportService__Group__0 ) ) )
            // InternalMyDsl.g:168:2: ( ( rule__RImportService__Group__0 ) )
            {
            // InternalMyDsl.g:168:2: ( ( rule__RImportService__Group__0 ) )
            // InternalMyDsl.g:169:3: ( rule__RImportService__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportServiceAccess().getGroup()); 
            }
            // InternalMyDsl.g:170:3: ( rule__RImportService__Group__0 )
            // InternalMyDsl.g:170:4: rule__RImportService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RImportService__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportServiceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerImportService"


    // $ANTLR start "entryRulerClass"
    // InternalMyDsl.g:179:1: entryRulerClass : rulerClass EOF ;
    public final void entryRulerClass() throws RecognitionException {
        try {
            // InternalMyDsl.g:180:1: ( rulerClass EOF )
            // InternalMyDsl.g:181:1: rulerClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRClassRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRClassRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerClass"


    // $ANTLR start "rulerClass"
    // InternalMyDsl.g:188:1: rulerClass : ( ( rule__RClass__Group__0 ) ) ;
    public final void rulerClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:192:2: ( ( ( rule__RClass__Group__0 ) ) )
            // InternalMyDsl.g:193:2: ( ( rule__RClass__Group__0 ) )
            {
            // InternalMyDsl.g:193:2: ( ( rule__RClass__Group__0 ) )
            // InternalMyDsl.g:194:3: ( rule__RClass__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRClassAccess().getGroup()); 
            }
            // InternalMyDsl.g:195:3: ( rule__RClass__Group__0 )
            // InternalMyDsl.g:195:4: rule__RClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RClass__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRClassAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerClass"


    // $ANTLR start "entryRulerOperation"
    // InternalMyDsl.g:204:1: entryRulerOperation : rulerOperation EOF ;
    public final void entryRulerOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:205:1: ( rulerOperation EOF )
            // InternalMyDsl.g:206:1: rulerOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getROperationRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getROperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerOperation"


    // $ANTLR start "rulerOperation"
    // InternalMyDsl.g:213:1: rulerOperation : ( ( rule__ROperation__Group__0 ) ) ;
    public final void rulerOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:217:2: ( ( ( rule__ROperation__Group__0 ) ) )
            // InternalMyDsl.g:218:2: ( ( rule__ROperation__Group__0 ) )
            {
            // InternalMyDsl.g:218:2: ( ( rule__ROperation__Group__0 ) )
            // InternalMyDsl.g:219:3: ( rule__ROperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getROperationAccess().getGroup()); 
            }
            // InternalMyDsl.g:220:3: ( rule__ROperation__Group__0 )
            // InternalMyDsl.g:220:4: rule__ROperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ROperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getROperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerOperation"


    // $ANTLR start "entryRulerTag"
    // InternalMyDsl.g:229:1: entryRulerTag : rulerTag EOF ;
    public final void entryRulerTag() throws RecognitionException {
        try {
            // InternalMyDsl.g:230:1: ( rulerTag EOF )
            // InternalMyDsl.g:231:1: rulerTag EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRTagRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRTagRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerTag"


    // $ANTLR start "rulerTag"
    // InternalMyDsl.g:238:1: rulerTag : ( ( rule__RTag__Group__0 ) ) ;
    public final void rulerTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:242:2: ( ( ( rule__RTag__Group__0 ) ) )
            // InternalMyDsl.g:243:2: ( ( rule__RTag__Group__0 ) )
            {
            // InternalMyDsl.g:243:2: ( ( rule__RTag__Group__0 ) )
            // InternalMyDsl.g:244:3: ( rule__RTag__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRTagAccess().getGroup()); 
            }
            // InternalMyDsl.g:245:3: ( rule__RTag__Group__0 )
            // InternalMyDsl.g:245:4: rule__RTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RTag__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRTagAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerTag"


    // $ANTLR start "entryRulerParameters"
    // InternalMyDsl.g:254:1: entryRulerParameters : rulerParameters EOF ;
    public final void entryRulerParameters() throws RecognitionException {
        try {
            // InternalMyDsl.g:255:1: ( rulerParameters EOF )
            // InternalMyDsl.g:256:1: rulerParameters EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerParameters();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRParametersRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerParameters"


    // $ANTLR start "rulerParameters"
    // InternalMyDsl.g:263:1: rulerParameters : ( ( rule__RParameters__Group__0 ) ) ;
    public final void rulerParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:267:2: ( ( ( rule__RParameters__Group__0 ) ) )
            // InternalMyDsl.g:268:2: ( ( rule__RParameters__Group__0 ) )
            {
            // InternalMyDsl.g:268:2: ( ( rule__RParameters__Group__0 ) )
            // InternalMyDsl.g:269:3: ( rule__RParameters__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRParametersAccess().getGroup()); 
            }
            // InternalMyDsl.g:270:3: ( rule__RParameters__Group__0 )
            // InternalMyDsl.g:270:4: rule__RParameters__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RParameters__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRParametersAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerParameters"


    // $ANTLR start "entryRulerVariable"
    // InternalMyDsl.g:279:1: entryRulerVariable : rulerVariable EOF ;
    public final void entryRulerVariable() throws RecognitionException {
        try {
            // InternalMyDsl.g:280:1: ( rulerVariable EOF )
            // InternalMyDsl.g:281:1: rulerVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerVariable"


    // $ANTLR start "rulerVariable"
    // InternalMyDsl.g:288:1: rulerVariable : ( ( rule__RVariable__Group__0 ) ) ;
    public final void rulerVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:292:2: ( ( ( rule__RVariable__Group__0 ) ) )
            // InternalMyDsl.g:293:2: ( ( rule__RVariable__Group__0 ) )
            {
            // InternalMyDsl.g:293:2: ( ( rule__RVariable__Group__0 ) )
            // InternalMyDsl.g:294:3: ( rule__RVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRVariableAccess().getGroup()); 
            }
            // InternalMyDsl.g:295:3: ( rule__RVariable__Group__0 )
            // InternalMyDsl.g:295:4: rule__RVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RVariable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerVariable"


    // $ANTLR start "entryRulerAttribute"
    // InternalMyDsl.g:304:1: entryRulerAttribute : rulerAttribute EOF ;
    public final void entryRulerAttribute() throws RecognitionException {
        try {
            // InternalMyDsl.g:305:1: ( rulerAttribute EOF )
            // InternalMyDsl.g:306:1: rulerAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRAttributeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerAttribute"


    // $ANTLR start "rulerAttribute"
    // InternalMyDsl.g:313:1: rulerAttribute : ( ( rule__RAttribute__Group__0 ) ) ;
    public final void rulerAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:317:2: ( ( ( rule__RAttribute__Group__0 ) ) )
            // InternalMyDsl.g:318:2: ( ( rule__RAttribute__Group__0 ) )
            {
            // InternalMyDsl.g:318:2: ( ( rule__RAttribute__Group__0 ) )
            // InternalMyDsl.g:319:3: ( rule__RAttribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRAttributeAccess().getGroup()); 
            }
            // InternalMyDsl.g:320:3: ( rule__RAttribute__Group__0 )
            // InternalMyDsl.g:320:4: rule__RAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RAttribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRAttributeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerAttribute"


    // $ANTLR start "entryRulerStatement"
    // InternalMyDsl.g:329:1: entryRulerStatement : rulerStatement EOF ;
    public final void entryRulerStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:330:1: ( rulerStatement EOF )
            // InternalMyDsl.g:331:1: rulerStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerStatement"


    // $ANTLR start "rulerStatement"
    // InternalMyDsl.g:338:1: rulerStatement : ( ( rule__RStatement__Alternatives ) ) ;
    public final void rulerStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:342:2: ( ( ( rule__RStatement__Alternatives ) ) )
            // InternalMyDsl.g:343:2: ( ( rule__RStatement__Alternatives ) )
            {
            // InternalMyDsl.g:343:2: ( ( rule__RStatement__Alternatives ) )
            // InternalMyDsl.g:344:3: ( rule__RStatement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRStatementAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:345:3: ( rule__RStatement__Alternatives )
            // InternalMyDsl.g:345:4: rule__RStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RStatement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerStatement"


    // $ANTLR start "entryRulerVarDecl"
    // InternalMyDsl.g:354:1: entryRulerVarDecl : rulerVarDecl EOF ;
    public final void entryRulerVarDecl() throws RecognitionException {
        try {
            // InternalMyDsl.g:355:1: ( rulerVarDecl EOF )
            // InternalMyDsl.g:356:1: rulerVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerVarDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRVarDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerVarDecl"


    // $ANTLR start "rulerVarDecl"
    // InternalMyDsl.g:363:1: rulerVarDecl : ( ( rule__RVarDecl__Group__0 ) ) ;
    public final void rulerVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:367:2: ( ( ( rule__RVarDecl__Group__0 ) ) )
            // InternalMyDsl.g:368:2: ( ( rule__RVarDecl__Group__0 ) )
            {
            // InternalMyDsl.g:368:2: ( ( rule__RVarDecl__Group__0 ) )
            // InternalMyDsl.g:369:3: ( rule__RVarDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRVarDeclAccess().getGroup()); 
            }
            // InternalMyDsl.g:370:3: ( rule__RVarDecl__Group__0 )
            // InternalMyDsl.g:370:4: rule__RVarDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RVarDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRVarDeclAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerVarDecl"


    // $ANTLR start "entryRulerAssign"
    // InternalMyDsl.g:379:1: entryRulerAssign : rulerAssign EOF ;
    public final void entryRulerAssign() throws RecognitionException {
        try {
            // InternalMyDsl.g:380:1: ( rulerAssign EOF )
            // InternalMyDsl.g:381:1: rulerAssign EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRAssignRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerAssign"


    // $ANTLR start "rulerAssign"
    // InternalMyDsl.g:388:1: rulerAssign : ( ( rule__RAssign__Group__0 ) ) ;
    public final void rulerAssign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:392:2: ( ( ( rule__RAssign__Group__0 ) ) )
            // InternalMyDsl.g:393:2: ( ( rule__RAssign__Group__0 ) )
            {
            // InternalMyDsl.g:393:2: ( ( rule__RAssign__Group__0 ) )
            // InternalMyDsl.g:394:3: ( rule__RAssign__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRAssignAccess().getGroup()); 
            }
            // InternalMyDsl.g:395:3: ( rule__RAssign__Group__0 )
            // InternalMyDsl.g:395:4: rule__RAssign__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RAssign__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRAssignAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerAssign"


    // $ANTLR start "entryRulerForEach"
    // InternalMyDsl.g:404:1: entryRulerForEach : rulerForEach EOF ;
    public final void entryRulerForEach() throws RecognitionException {
        try {
            // InternalMyDsl.g:405:1: ( rulerForEach EOF )
            // InternalMyDsl.g:406:1: rulerForEach EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRForEachRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerForEach();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRForEachRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerForEach"


    // $ANTLR start "rulerForEach"
    // InternalMyDsl.g:413:1: rulerForEach : ( ( rule__RForEach__Group__0 ) ) ;
    public final void rulerForEach() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:417:2: ( ( ( rule__RForEach__Group__0 ) ) )
            // InternalMyDsl.g:418:2: ( ( rule__RForEach__Group__0 ) )
            {
            // InternalMyDsl.g:418:2: ( ( rule__RForEach__Group__0 ) )
            // InternalMyDsl.g:419:3: ( rule__RForEach__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRForEachAccess().getGroup()); 
            }
            // InternalMyDsl.g:420:3: ( rule__RForEach__Group__0 )
            // InternalMyDsl.g:420:4: rule__RForEach__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RForEach__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRForEachAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerForEach"


    // $ANTLR start "entryRulerCollection"
    // InternalMyDsl.g:429:1: entryRulerCollection : rulerCollection EOF ;
    public final void entryRulerCollection() throws RecognitionException {
        try {
            // InternalMyDsl.g:430:1: ( rulerCollection EOF )
            // InternalMyDsl.g:431:1: rulerCollection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRCollectionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerCollection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRCollectionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerCollection"


    // $ANTLR start "rulerCollection"
    // InternalMyDsl.g:438:1: rulerCollection : ( ( rule__RCollection__Alternatives ) ) ;
    public final void rulerCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:442:2: ( ( ( rule__RCollection__Alternatives ) ) )
            // InternalMyDsl.g:443:2: ( ( rule__RCollection__Alternatives ) )
            {
            // InternalMyDsl.g:443:2: ( ( rule__RCollection__Alternatives ) )
            // InternalMyDsl.g:444:3: ( rule__RCollection__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRCollectionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:445:3: ( rule__RCollection__Alternatives )
            // InternalMyDsl.g:445:4: rule__RCollection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RCollection__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRCollectionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerCollection"


    // $ANTLR start "entryRulerBlock"
    // InternalMyDsl.g:454:1: entryRulerBlock : rulerBlock EOF ;
    public final void entryRulerBlock() throws RecognitionException {
        try {
            // InternalMyDsl.g:455:1: ( rulerBlock EOF )
            // InternalMyDsl.g:456:1: rulerBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerBlock"


    // $ANTLR start "rulerBlock"
    // InternalMyDsl.g:463:1: rulerBlock : ( ( rule__RBlock__Group__0 ) ) ;
    public final void rulerBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:467:2: ( ( ( rule__RBlock__Group__0 ) ) )
            // InternalMyDsl.g:468:2: ( ( rule__RBlock__Group__0 ) )
            {
            // InternalMyDsl.g:468:2: ( ( rule__RBlock__Group__0 ) )
            // InternalMyDsl.g:469:3: ( rule__RBlock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRBlockAccess().getGroup()); 
            }
            // InternalMyDsl.g:470:3: ( rule__RBlock__Group__0 )
            // InternalMyDsl.g:470:4: rule__RBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RBlock__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRBlockAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerBlock"


    // $ANTLR start "entryRulerIf"
    // InternalMyDsl.g:479:1: entryRulerIf : rulerIf EOF ;
    public final void entryRulerIf() throws RecognitionException {
        try {
            // InternalMyDsl.g:480:1: ( rulerIf EOF )
            // InternalMyDsl.g:481:1: rulerIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRIfRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRIfRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerIf"


    // $ANTLR start "rulerIf"
    // InternalMyDsl.g:488:1: rulerIf : ( ( rule__RIf__Group__0 ) ) ;
    public final void rulerIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:492:2: ( ( ( rule__RIf__Group__0 ) ) )
            // InternalMyDsl.g:493:2: ( ( rule__RIf__Group__0 ) )
            {
            // InternalMyDsl.g:493:2: ( ( rule__RIf__Group__0 ) )
            // InternalMyDsl.g:494:3: ( rule__RIf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRIfAccess().getGroup()); 
            }
            // InternalMyDsl.g:495:3: ( rule__RIf__Group__0 )
            // InternalMyDsl.g:495:4: rule__RIf__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RIf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRIfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerIf"


    // $ANTLR start "entryRulerWhile"
    // InternalMyDsl.g:504:1: entryRulerWhile : rulerWhile EOF ;
    public final void entryRulerWhile() throws RecognitionException {
        try {
            // InternalMyDsl.g:505:1: ( rulerWhile EOF )
            // InternalMyDsl.g:506:1: rulerWhile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRWhileRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerWhile"


    // $ANTLR start "rulerWhile"
    // InternalMyDsl.g:513:1: rulerWhile : ( ( rule__RWhile__Group__0 ) ) ;
    public final void rulerWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:517:2: ( ( ( rule__RWhile__Group__0 ) ) )
            // InternalMyDsl.g:518:2: ( ( rule__RWhile__Group__0 ) )
            {
            // InternalMyDsl.g:518:2: ( ( rule__RWhile__Group__0 ) )
            // InternalMyDsl.g:519:3: ( rule__RWhile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRWhileAccess().getGroup()); 
            }
            // InternalMyDsl.g:520:3: ( rule__RWhile__Group__0 )
            // InternalMyDsl.g:520:4: rule__RWhile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RWhile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRWhileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerWhile"


    // $ANTLR start "entryRulerExpression"
    // InternalMyDsl.g:529:1: entryRulerExpression : rulerExpression EOF ;
    public final void entryRulerExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:530:1: ( rulerExpression EOF )
            // InternalMyDsl.g:531:1: rulerExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerExpression"


    // $ANTLR start "rulerExpression"
    // InternalMyDsl.g:538:1: rulerExpression : ( ( rule__RExpression__Group__0 ) ) ;
    public final void rulerExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:542:2: ( ( ( rule__RExpression__Group__0 ) ) )
            // InternalMyDsl.g:543:2: ( ( rule__RExpression__Group__0 ) )
            {
            // InternalMyDsl.g:543:2: ( ( rule__RExpression__Group__0 ) )
            // InternalMyDsl.g:544:3: ( rule__RExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:545:3: ( rule__RExpression__Group__0 )
            // InternalMyDsl.g:545:4: rule__RExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerExpression"


    // $ANTLR start "entryRuleexpression"
    // InternalMyDsl.g:554:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:555:1: ( ruleexpression EOF )
            // InternalMyDsl.g:556:1: ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalMyDsl.g:563:1: ruleexpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalMyDsl.g:568:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalMyDsl.g:568:2: ( ( rule__Expression__Group__0 ) )
            // InternalMyDsl.g:569:3: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:570:3: ( rule__Expression__Group__0 )
            // InternalMyDsl.g:570:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulerecExpression"
    // InternalMyDsl.g:579:1: entryRulerecExpression : rulerecExpression EOF ;
    public final void entryRulerecExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:580:1: ( rulerecExpression EOF )
            // InternalMyDsl.g:581:1: rulerecExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerecExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerecExpression"


    // $ANTLR start "rulerecExpression"
    // InternalMyDsl.g:588:1: rulerecExpression : ( ( rule__RecExpression__Group__0 ) ) ;
    public final void rulerecExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:592:2: ( ( ( rule__RecExpression__Group__0 ) ) )
            // InternalMyDsl.g:593:2: ( ( rule__RecExpression__Group__0 ) )
            {
            // InternalMyDsl.g:593:2: ( ( rule__RecExpression__Group__0 ) )
            // InternalMyDsl.g:594:3: ( rule__RecExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getGroup()); 
            }
            // InternalMyDsl.g:595:3: ( rule__RecExpression__Group__0 )
            // InternalMyDsl.g:595:4: rule__RecExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerecExpression"


    // $ANTLR start "entryRulenavigationSegment"
    // InternalMyDsl.g:604:1: entryRulenavigationSegment : rulenavigationSegment EOF ;
    public final void entryRulenavigationSegment() throws RecognitionException {
        try {
            // InternalMyDsl.g:605:1: ( rulenavigationSegment EOF )
            // InternalMyDsl.g:606:1: rulenavigationSegment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationSegmentRule()); 
            }
            pushFollow(FOLLOW_1);
            rulenavigationSegment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationSegmentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenavigationSegment"


    // $ANTLR start "rulenavigationSegment"
    // InternalMyDsl.g:613:1: rulenavigationSegment : ( ( rule__NavigationSegment__Alternatives ) ) ;
    public final void rulenavigationSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:617:2: ( ( ( rule__NavigationSegment__Alternatives ) ) )
            // InternalMyDsl.g:618:2: ( ( rule__NavigationSegment__Alternatives ) )
            {
            // InternalMyDsl.g:618:2: ( ( rule__NavigationSegment__Alternatives ) )
            // InternalMyDsl.g:619:3: ( rule__NavigationSegment__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationSegmentAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:620:3: ( rule__NavigationSegment__Alternatives )
            // InternalMyDsl.g:620:4: rule__NavigationSegment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NavigationSegment__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationSegmentAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenavigationSegment"


    // $ANTLR start "entryRulenonLeftRecExpression"
    // InternalMyDsl.g:629:1: entryRulenonLeftRecExpression : rulenonLeftRecExpression EOF ;
    public final void entryRulenonLeftRecExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:630:1: ( rulenonLeftRecExpression EOF )
            // InternalMyDsl.g:631:1: rulenonLeftRecExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulenonLeftRecExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenonLeftRecExpression"


    // $ANTLR start "rulenonLeftRecExpression"
    // InternalMyDsl.g:638:1: rulenonLeftRecExpression : ( ( rule__NonLeftRecExpression__Alternatives ) ) ;
    public final void rulenonLeftRecExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:642:2: ( ( ( rule__NonLeftRecExpression__Alternatives ) ) )
            // InternalMyDsl.g:643:2: ( ( rule__NonLeftRecExpression__Alternatives ) )
            {
            // InternalMyDsl.g:643:2: ( ( rule__NonLeftRecExpression__Alternatives ) )
            // InternalMyDsl.g:644:3: ( rule__NonLeftRecExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:645:3: ( rule__NonLeftRecExpression__Alternatives )
            // InternalMyDsl.g:645:4: rule__NonLeftRecExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenonLeftRecExpression"


    // $ANTLR start "entryRulebinding"
    // InternalMyDsl.g:654:1: entryRulebinding : rulebinding EOF ;
    public final void entryRulebinding() throws RecognitionException {
        try {
            // InternalMyDsl.g:655:1: ( rulebinding EOF )
            // InternalMyDsl.g:656:1: rulebinding EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRule()); 
            }
            pushFollow(FOLLOW_1);
            rulebinding();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebinding"


    // $ANTLR start "rulebinding"
    // InternalMyDsl.g:663:1: rulebinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void rulebinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:667:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalMyDsl.g:668:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalMyDsl.g:668:2: ( ( rule__Binding__Group__0 ) )
            // InternalMyDsl.g:669:3: ( rule__Binding__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getGroup()); 
            }
            // InternalMyDsl.g:670:3: ( rule__Binding__Group__0 )
            // InternalMyDsl.g:670:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebinding"


    // $ANTLR start "entryRuleaddOp"
    // InternalMyDsl.g:679:1: entryRuleaddOp : ruleaddOp EOF ;
    public final void entryRuleaddOp() throws RecognitionException {
        try {
            // InternalMyDsl.g:680:1: ( ruleaddOp EOF )
            // InternalMyDsl.g:681:1: ruleaddOp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOpRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleaddOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOpRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleaddOp"


    // $ANTLR start "ruleaddOp"
    // InternalMyDsl.g:688:1: ruleaddOp : ( ( rule__AddOp__Alternatives ) ) ;
    public final void ruleaddOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:2: ( ( ( rule__AddOp__Alternatives ) ) )
            // InternalMyDsl.g:693:2: ( ( rule__AddOp__Alternatives ) )
            {
            // InternalMyDsl.g:693:2: ( ( rule__AddOp__Alternatives ) )
            // InternalMyDsl.g:694:3: ( rule__AddOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOpAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:695:3: ( rule__AddOp__Alternatives )
            // InternalMyDsl.g:695:4: rule__AddOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AddOp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddOpAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleaddOp"


    // $ANTLR start "entryRulecompOp"
    // InternalMyDsl.g:704:1: entryRulecompOp : rulecompOp EOF ;
    public final void entryRulecompOp() throws RecognitionException {
        try {
            // InternalMyDsl.g:705:1: ( rulecompOp EOF )
            // InternalMyDsl.g:706:1: rulecompOp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOpRule()); 
            }
            pushFollow(FOLLOW_1);
            rulecompOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOpRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecompOp"


    // $ANTLR start "rulecompOp"
    // InternalMyDsl.g:713:1: rulecompOp : ( ( rule__CompOp__Alternatives ) ) ;
    public final void rulecompOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:717:2: ( ( ( rule__CompOp__Alternatives ) ) )
            // InternalMyDsl.g:718:2: ( ( rule__CompOp__Alternatives ) )
            {
            // InternalMyDsl.g:718:2: ( ( rule__CompOp__Alternatives ) )
            // InternalMyDsl.g:719:3: ( rule__CompOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOpAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:720:3: ( rule__CompOp__Alternatives )
            // InternalMyDsl.g:720:4: rule__CompOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompOp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOpAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecompOp"


    // $ANTLR start "entryRulecallExp"
    // InternalMyDsl.g:729:1: entryRulecallExp : rulecallExp EOF ;
    public final void entryRulecallExp() throws RecognitionException {
        try {
            // InternalMyDsl.g:730:1: ( rulecallExp EOF )
            // InternalMyDsl.g:731:1: rulecallExp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallExpRule()); 
            }
            pushFollow(FOLLOW_1);
            rulecallExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallExpRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecallExp"


    // $ANTLR start "rulecallExp"
    // InternalMyDsl.g:738:1: rulecallExp : ( ( rule__CallExp__Alternatives ) ) ;
    public final void rulecallExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:2: ( ( ( rule__CallExp__Alternatives ) ) )
            // InternalMyDsl.g:743:2: ( ( rule__CallExp__Alternatives ) )
            {
            // InternalMyDsl.g:743:2: ( ( rule__CallExp__Alternatives ) )
            // InternalMyDsl.g:744:3: ( rule__CallExp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallExpAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:745:3: ( rule__CallExp__Alternatives )
            // InternalMyDsl.g:745:4: rule__CallExp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CallExp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallExpAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecallExp"


    // $ANTLR start "entryRulelambdaExpression"
    // InternalMyDsl.g:754:1: entryRulelambdaExpression : rulelambdaExpression EOF ;
    public final void entryRulelambdaExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:755:1: ( rulelambdaExpression EOF )
            // InternalMyDsl.g:756:1: rulelambdaExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulelambdaExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulelambdaExpression"


    // $ANTLR start "rulelambdaExpression"
    // InternalMyDsl.g:763:1: rulelambdaExpression : ( ruleexpression ) ;
    public final void rulelambdaExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:2: ( ( ruleexpression ) )
            // InternalMyDsl.g:768:2: ( ruleexpression )
            {
            // InternalMyDsl.g:768:2: ( ruleexpression )
            // InternalMyDsl.g:769:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLambdaExpressionAccess().getExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLambdaExpressionAccess().getExpressionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulelambdaExpression"


    // $ANTLR start "entryRulecollectionIterator"
    // InternalMyDsl.g:779:1: entryRulecollectionIterator : rulecollectionIterator EOF ;
    public final void entryRulecollectionIterator() throws RecognitionException {
        try {
            // InternalMyDsl.g:780:1: ( rulecollectionIterator EOF )
            // InternalMyDsl.g:781:1: rulecollectionIterator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionIteratorRule()); 
            }
            pushFollow(FOLLOW_1);
            rulecollectionIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionIteratorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecollectionIterator"


    // $ANTLR start "rulecollectionIterator"
    // InternalMyDsl.g:788:1: rulecollectionIterator : ( ( rule__CollectionIterator__Alternatives ) ) ;
    public final void rulecollectionIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:792:2: ( ( ( rule__CollectionIterator__Alternatives ) ) )
            // InternalMyDsl.g:793:2: ( ( rule__CollectionIterator__Alternatives ) )
            {
            // InternalMyDsl.g:793:2: ( ( rule__CollectionIterator__Alternatives ) )
            // InternalMyDsl.g:794:3: ( rule__CollectionIterator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionIteratorAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:795:3: ( rule__CollectionIterator__Alternatives )
            // InternalMyDsl.g:795:4: rule__CollectionIterator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CollectionIterator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionIteratorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecollectionIterator"


    // $ANTLR start "entryRuleexpressionSequence"
    // InternalMyDsl.g:804:1: entryRuleexpressionSequence : ruleexpressionSequence EOF ;
    public final void entryRuleexpressionSequence() throws RecognitionException {
        try {
            // InternalMyDsl.g:805:1: ( ruleexpressionSequence EOF )
            // InternalMyDsl.g:806:1: ruleexpressionSequence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionSequenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleexpressionSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionSequenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleexpressionSequence"


    // $ANTLR start "ruleexpressionSequence"
    // InternalMyDsl.g:813:1: ruleexpressionSequence : ( ( rule__ExpressionSequence__Group__0 )? ) ;
    public final void ruleexpressionSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:817:2: ( ( ( rule__ExpressionSequence__Group__0 )? ) )
            // InternalMyDsl.g:818:2: ( ( rule__ExpressionSequence__Group__0 )? )
            {
            // InternalMyDsl.g:818:2: ( ( rule__ExpressionSequence__Group__0 )? )
            // InternalMyDsl.g:819:3: ( rule__ExpressionSequence__Group__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionSequenceAccess().getGroup()); 
            }
            // InternalMyDsl.g:820:3: ( rule__ExpressionSequence__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_IDENT && LA1_0<=RULE_REAL)||LA1_0==18||(LA1_0>=37 && LA1_0<=43)||LA1_0==51||LA1_0==56||LA1_0==66||LA1_0==74||LA1_0==77||(LA1_0>=80 && LA1_0<=81)||(LA1_0>=83 && LA1_0<=84)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:820:4: rule__ExpressionSequence__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionSequence__Group__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionSequenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleexpressionSequence"


    // $ANTLR start "entryRulevariableDefinition"
    // InternalMyDsl.g:829:1: entryRulevariableDefinition : rulevariableDefinition EOF ;
    public final void entryRulevariableDefinition() throws RecognitionException {
        try {
            // InternalMyDsl.g:830:1: ( rulevariableDefinition EOF )
            // InternalMyDsl.g:831:1: rulevariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevariableDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariableDefinition"


    // $ANTLR start "rulevariableDefinition"
    // InternalMyDsl.g:838:1: rulevariableDefinition : ( ( rule__VariableDefinition__Group__0 ) ) ;
    public final void rulevariableDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:842:2: ( ( ( rule__VariableDefinition__Group__0 ) ) )
            // InternalMyDsl.g:843:2: ( ( rule__VariableDefinition__Group__0 ) )
            {
            // InternalMyDsl.g:843:2: ( ( rule__VariableDefinition__Group__0 ) )
            // InternalMyDsl.g:844:3: ( rule__VariableDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDefinitionAccess().getGroup()); 
            }
            // InternalMyDsl.g:845:3: ( rule__VariableDefinition__Group__0 )
            // InternalMyDsl.g:845:4: rule__VariableDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariableDefinition"


    // $ANTLR start "entryRuleliteral"
    // InternalMyDsl.g:854:1: entryRuleliteral : ruleliteral EOF ;
    public final void entryRuleliteral() throws RecognitionException {
        try {
            // InternalMyDsl.g:855:1: ( ruleliteral EOF )
            // InternalMyDsl.g:856:1: ruleliteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleliteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleliteral"


    // $ANTLR start "ruleliteral"
    // InternalMyDsl.g:863:1: ruleliteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleliteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:867:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalMyDsl.g:868:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalMyDsl.g:868:2: ( ( rule__Literal__Alternatives ) )
            // InternalMyDsl.g:869:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:870:3: ( rule__Literal__Alternatives )
            // InternalMyDsl.g:870:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleliteral"


    // $ANTLR start "entryRuletypeLiteral"
    // InternalMyDsl.g:879:1: entryRuletypeLiteral : ruletypeLiteral EOF ;
    public final void entryRuletypeLiteral() throws RecognitionException {
        try {
            // InternalMyDsl.g:880:1: ( ruletypeLiteral EOF )
            // InternalMyDsl.g:881:1: ruletypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruletypeLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletypeLiteral"


    // $ANTLR start "ruletypeLiteral"
    // InternalMyDsl.g:888:1: ruletypeLiteral : ( ( rule__TypeLiteral__Alternatives ) ) ;
    public final void ruletypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:892:2: ( ( ( rule__TypeLiteral__Alternatives ) ) )
            // InternalMyDsl.g:893:2: ( ( rule__TypeLiteral__Alternatives ) )
            {
            // InternalMyDsl.g:893:2: ( ( rule__TypeLiteral__Alternatives ) )
            // InternalMyDsl.g:894:3: ( rule__TypeLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLiteralAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:895:3: ( rule__TypeLiteral__Alternatives )
            // InternalMyDsl.g:895:4: rule__TypeLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletypeLiteral"


    // $ANTLR start "entryRuleclassifierTypeRule"
    // InternalMyDsl.g:904:1: entryRuleclassifierTypeRule : ruleclassifierTypeRule EOF ;
    public final void entryRuleclassifierTypeRule() throws RecognitionException {
        try {
            // InternalMyDsl.g:905:1: ( ruleclassifierTypeRule EOF )
            // InternalMyDsl.g:906:1: ruleclassifierTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleclassifierTypeRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierTypeRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleclassifierTypeRule"


    // $ANTLR start "ruleclassifierTypeRule"
    // InternalMyDsl.g:913:1: ruleclassifierTypeRule : ( ( rule__ClassifierTypeRule__Alternatives ) ) ;
    public final void ruleclassifierTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:917:2: ( ( ( rule__ClassifierTypeRule__Alternatives ) ) )
            // InternalMyDsl.g:918:2: ( ( rule__ClassifierTypeRule__Alternatives ) )
            {
            // InternalMyDsl.g:918:2: ( ( rule__ClassifierTypeRule__Alternatives ) )
            // InternalMyDsl.g:919:3: ( rule__ClassifierTypeRule__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierTypeRuleAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:920:3: ( rule__ClassifierTypeRule__Alternatives )
            // InternalMyDsl.g:920:4: rule__ClassifierTypeRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClassifierTypeRule__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierTypeRuleAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleclassifierTypeRule"


    // $ANTLR start "rule__ROperation__Alternatives_1"
    // InternalMyDsl.g:928:1: rule__ROperation__Alternatives_1 : ( ( 'def' ) | ( 'override' ) );
    public final void rule__ROperation__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:932:1: ( ( 'def' ) | ( 'override' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:933:2: ( 'def' )
                    {
                    // InternalMyDsl.g:933:2: ( 'def' )
                    // InternalMyDsl.g:934:3: 'def'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getROperationAccess().getDefKeyword_1_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getROperationAccess().getDefKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:939:2: ( 'override' )
                    {
                    // InternalMyDsl.g:939:2: ( 'override' )
                    // InternalMyDsl.g:940:3: 'override'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getROperationAccess().getOverrideKeyword_1_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getROperationAccess().getOverrideKeyword_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Alternatives_1"


    // $ANTLR start "rule__RStatement__Alternatives"
    // InternalMyDsl.g:949:1: rule__RStatement__Alternatives : ( ( rulerVarDecl ) | ( rulerAssign ) | ( rulerForEach ) | ( rulerWhile ) | ( rulerIf ) | ( rulerExpression ) );
    public final void rule__RStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:953:1: ( ( rulerVarDecl ) | ( rulerAssign ) | ( rulerForEach ) | ( rulerWhile ) | ( rulerIf ) | ( rulerExpression ) )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:954:2: ( rulerVarDecl )
                    {
                    // InternalMyDsl.g:954:2: ( rulerVarDecl )
                    // InternalMyDsl.g:955:3: rulerVarDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRStatementAccess().getRVarDeclParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulerVarDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRStatementAccess().getRVarDeclParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:960:2: ( rulerAssign )
                    {
                    // InternalMyDsl.g:960:2: ( rulerAssign )
                    // InternalMyDsl.g:961:3: rulerAssign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRStatementAccess().getRAssignParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulerAssign();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRStatementAccess().getRAssignParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:966:2: ( rulerForEach )
                    {
                    // InternalMyDsl.g:966:2: ( rulerForEach )
                    // InternalMyDsl.g:967:3: rulerForEach
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRStatementAccess().getRForEachParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulerForEach();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRStatementAccess().getRForEachParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:972:2: ( rulerWhile )
                    {
                    // InternalMyDsl.g:972:2: ( rulerWhile )
                    // InternalMyDsl.g:973:3: rulerWhile
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRStatementAccess().getRWhileParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulerWhile();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRStatementAccess().getRWhileParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:978:2: ( rulerIf )
                    {
                    // InternalMyDsl.g:978:2: ( rulerIf )
                    // InternalMyDsl.g:979:3: rulerIf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRStatementAccess().getRIfParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulerIf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRStatementAccess().getRIfParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:984:2: ( rulerExpression )
                    {
                    // InternalMyDsl.g:984:2: ( rulerExpression )
                    // InternalMyDsl.g:985:3: rulerExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRStatementAccess().getRExpressionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulerExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRStatementAccess().getRExpressionParserRuleCall_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RStatement__Alternatives"


    // $ANTLR start "rule__RCollection__Alternatives"
    // InternalMyDsl.g:994:1: rule__RCollection__Alternatives : ( ( ( rule__RCollection__Group_0__0 ) ) | ( ruleexpression ) );
    public final void rule__RCollection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:998:1: ( ( ( rule__RCollection__Group_0__0 ) ) | ( ruleexpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==63) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_IDENT && LA4_0<=RULE_REAL)||LA4_0==18||(LA4_0>=37 && LA4_0<=43)||LA4_0==51||LA4_0==56||LA4_0==66||LA4_0==74||LA4_0==77||(LA4_0>=80 && LA4_0<=81)||(LA4_0>=83 && LA4_0<=84)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:999:2: ( ( rule__RCollection__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:999:2: ( ( rule__RCollection__Group_0__0 ) )
                    // InternalMyDsl.g:1000:3: ( rule__RCollection__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRCollectionAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:1001:3: ( rule__RCollection__Group_0__0 )
                    // InternalMyDsl.g:1001:4: rule__RCollection__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RCollection__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRCollectionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1005:2: ( ruleexpression )
                    {
                    // InternalMyDsl.g:1005:2: ( ruleexpression )
                    // InternalMyDsl.g:1006:3: ruleexpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRCollectionAccess().getExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleexpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRCollectionAccess().getExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RCollection__Alternatives"


    // $ANTLR start "rule__RecExpression__Alternatives_0"
    // InternalMyDsl.g:1015:1: rule__RecExpression__Alternatives_0 : ( ( rulenavigationSegment ) | ( ( rule__RecExpression__Group_0_1__0 ) ) | ( ( rule__RecExpression__Group_0_2__0 ) ) | ( ( rule__RecExpression__Group_0_3__0 ) ) | ( ( rule__RecExpression__Group_0_4__0 ) ) | ( ( rule__RecExpression__Group_0_5__0 ) ) | ( ( rule__RecExpression__Group_0_6__0 ) ) | ( ( rule__RecExpression__Group_0_7__0 ) ) );
    public final void rule__RecExpression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1019:1: ( ( rulenavigationSegment ) | ( ( rule__RecExpression__Group_0_1__0 ) ) | ( ( rule__RecExpression__Group_0_2__0 ) ) | ( ( rule__RecExpression__Group_0_3__0 ) ) | ( ( rule__RecExpression__Group_0_4__0 ) ) | ( ( rule__RecExpression__Group_0_5__0 ) ) | ( ( rule__RecExpression__Group_0_6__0 ) ) | ( ( rule__RecExpression__Group_0_7__0 ) ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 45:
            case 73:
                {
                alt5=1;
                }
                break;
            case RULE_MULTOP:
                {
                alt5=2;
                }
                break;
            case 17:
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt5=4;
                }
                break;
            case 69:
                {
                alt5=5;
                }
                break;
            case 70:
                {
                alt5=6;
                }
                break;
            case 71:
                {
                alt5=7;
                }
                break;
            case 72:
                {
                alt5=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1020:2: ( rulenavigationSegment )
                    {
                    // InternalMyDsl.g:1020:2: ( rulenavigationSegment )
                    // InternalMyDsl.g:1021:3: rulenavigationSegment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecExpressionAccess().getNavigationSegmentParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulenavigationSegment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecExpressionAccess().getNavigationSegmentParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1026:2: ( ( rule__RecExpression__Group_0_1__0 ) )
                    {
                    // InternalMyDsl.g:1026:2: ( ( rule__RecExpression__Group_0_1__0 ) )
                    // InternalMyDsl.g:1027:3: ( rule__RecExpression__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecExpressionAccess().getGroup_0_1()); 
                    }
                    // InternalMyDsl.g:1028:3: ( rule__RecExpression__Group_0_1__0 )
                    // InternalMyDsl.g:1028:4: rule__RecExpression__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecExpression__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecExpressionAccess().getGroup_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1032:2: ( ( rule__RecExpression__Group_0_2__0 ) )
                    {
                    // InternalMyDsl.g:1032:2: ( ( rule__RecExpression__Group_0_2__0 ) )
                    // InternalMyDsl.g:1033:3: ( rule__RecExpression__Group_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecExpressionAccess().getGroup_0_2()); 
                    }
                    // InternalMyDsl.g:1034:3: ( rule__RecExpression__Group_0_2__0 )
                    // InternalMyDsl.g:1034:4: rule__RecExpression__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecExpression__Group_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecExpressionAccess().getGroup_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1038:2: ( ( rule__RecExpression__Group_0_3__0 ) )
                    {
                    // InternalMyDsl.g:1038:2: ( ( rule__RecExpression__Group_0_3__0 ) )
                    // InternalMyDsl.g:1039:3: ( rule__RecExpression__Group_0_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecExpressionAccess().getGroup_0_3()); 
                    }
                    // InternalMyDsl.g:1040:3: ( rule__RecExpression__Group_0_3__0 )
                    // InternalMyDsl.g:1040:4: rule__RecExpression__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecExpression__Group_0_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecExpressionAccess().getGroup_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1044:2: ( ( rule__RecExpression__Group_0_4__0 ) )
                    {
                    // InternalMyDsl.g:1044:2: ( ( rule__RecExpression__Group_0_4__0 ) )
                    // InternalMyDsl.g:1045:3: ( rule__RecExpression__Group_0_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecExpressionAccess().getGroup_0_4()); 
                    }
                    // InternalMyDsl.g:1046:3: ( rule__RecExpression__Group_0_4__0 )
                    // InternalMyDsl.g:1046:4: rule__RecExpression__Group_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecExpression__Group_0_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecExpressionAccess().getGroup_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1050:2: ( ( rule__RecExpression__Group_0_5__0 ) )
                    {
                    // InternalMyDsl.g:1050:2: ( ( rule__RecExpression__Group_0_5__0 ) )
                    // InternalMyDsl.g:1051:3: ( rule__RecExpression__Group_0_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecExpressionAccess().getGroup_0_5()); 
                    }
                    // InternalMyDsl.g:1052:3: ( rule__RecExpression__Group_0_5__0 )
                    // InternalMyDsl.g:1052:4: rule__RecExpression__Group_0_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecExpression__Group_0_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecExpressionAccess().getGroup_0_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1056:2: ( ( rule__RecExpression__Group_0_6__0 ) )
                    {
                    // InternalMyDsl.g:1056:2: ( ( rule__RecExpression__Group_0_6__0 ) )
                    // InternalMyDsl.g:1057:3: ( rule__RecExpression__Group_0_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecExpressionAccess().getGroup_0_6()); 
                    }
                    // InternalMyDsl.g:1058:3: ( rule__RecExpression__Group_0_6__0 )
                    // InternalMyDsl.g:1058:4: rule__RecExpression__Group_0_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecExpression__Group_0_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecExpressionAccess().getGroup_0_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1062:2: ( ( rule__RecExpression__Group_0_7__0 ) )
                    {
                    // InternalMyDsl.g:1062:2: ( ( rule__RecExpression__Group_0_7__0 ) )
                    // InternalMyDsl.g:1063:3: ( rule__RecExpression__Group_0_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecExpressionAccess().getGroup_0_7()); 
                    }
                    // InternalMyDsl.g:1064:3: ( rule__RecExpression__Group_0_7__0 )
                    // InternalMyDsl.g:1064:4: rule__RecExpression__Group_0_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecExpression__Group_0_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecExpressionAccess().getGroup_0_7()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Alternatives_0"


    // $ANTLR start "rule__NavigationSegment__Alternatives"
    // InternalMyDsl.g:1072:1: rule__NavigationSegment__Alternatives : ( ( ( rule__NavigationSegment__Group_0__0 ) ) | ( ( rule__NavigationSegment__Group_1__0 ) ) | ( ( rule__NavigationSegment__Group_2__0 ) ) );
    public final void rule__NavigationSegment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( ( ( rule__NavigationSegment__Group_0__0 ) ) | ( ( rule__NavigationSegment__Group_1__0 ) ) | ( ( rule__NavigationSegment__Group_2__0 ) ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==45) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=27 && LA6_1<=36)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==RULE_IDENT) ) {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==51) ) {
                        alt6=2;
                    }
                    else if ( (LA6_4==EOF||LA6_4==RULE_MULTOP||(LA6_4>=17 && LA6_4<=26)||LA6_4==45||LA6_4==49||LA6_4==53||LA6_4==57||(LA6_4>=59 && LA6_4<=60)||LA6_4==62||LA6_4==67||(LA6_4>=69 && LA6_4<=73)||(LA6_4>=75 && LA6_4<=76)) ) {
                        alt6=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==73) ) {
                alt6=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1077:2: ( ( rule__NavigationSegment__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1077:2: ( ( rule__NavigationSegment__Group_0__0 ) )
                    // InternalMyDsl.g:1078:3: ( rule__NavigationSegment__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNavigationSegmentAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:1079:3: ( rule__NavigationSegment__Group_0__0 )
                    // InternalMyDsl.g:1079:4: rule__NavigationSegment__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigationSegment__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNavigationSegmentAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1083:2: ( ( rule__NavigationSegment__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:1083:2: ( ( rule__NavigationSegment__Group_1__0 ) )
                    // InternalMyDsl.g:1084:3: ( rule__NavigationSegment__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNavigationSegmentAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:1085:3: ( rule__NavigationSegment__Group_1__0 )
                    // InternalMyDsl.g:1085:4: rule__NavigationSegment__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigationSegment__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNavigationSegmentAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1089:2: ( ( rule__NavigationSegment__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:1089:2: ( ( rule__NavigationSegment__Group_2__0 ) )
                    // InternalMyDsl.g:1090:3: ( rule__NavigationSegment__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNavigationSegmentAccess().getGroup_2()); 
                    }
                    // InternalMyDsl.g:1091:3: ( rule__NavigationSegment__Group_2__0 )
                    // InternalMyDsl.g:1091:4: rule__NavigationSegment__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigationSegment__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNavigationSegmentAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationSegment__Alternatives"


    // $ANTLR start "rule__NonLeftRecExpression__Alternatives"
    // InternalMyDsl.g:1099:1: rule__NonLeftRecExpression__Alternatives : ( ( ( rule__NonLeftRecExpression__Group_0__0 ) ) | ( ( rule__NonLeftRecExpression__Group_1__0 ) ) | ( RULE_IDENT ) | ( ruleliteral ) | ( ( rule__NonLeftRecExpression__Group_4__0 ) ) | ( ( rule__NonLeftRecExpression__Group_5__0 ) ) | ( ( rule__NonLeftRecExpression__Group_6__0 ) ) );
    public final void rule__NonLeftRecExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1103:1: ( ( ( rule__NonLeftRecExpression__Group_0__0 ) ) | ( ( rule__NonLeftRecExpression__Group_1__0 ) ) | ( RULE_IDENT ) | ( ruleliteral ) | ( ( rule__NonLeftRecExpression__Group_4__0 ) ) | ( ( rule__NonLeftRecExpression__Group_5__0 ) ) | ( ( rule__NonLeftRecExpression__Group_6__0 ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case RULE_IDENT:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==78||LA7_3==82) ) {
                    alt7=4;
                }
                else if ( (LA7_3==EOF||LA7_3==RULE_MULTOP||(LA7_3>=17 && LA7_3<=26)||LA7_3==45||LA7_3==49||LA7_3==53||LA7_3==57||(LA7_3>=59 && LA7_3<=60)||LA7_3==62||LA7_3==67||(LA7_3>=69 && LA7_3<=73)||(LA7_3>=75 && LA7_3<=76)) ) {
                    alt7=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_REAL:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 56:
            case 80:
            case 81:
            case 83:
            case 84:
                {
                alt7=4;
                }
                break;
            case 51:
                {
                alt7=5;
                }
                break;
            case 66:
                {
                alt7=6;
                }
                break;
            case 77:
                {
                alt7=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1104:2: ( ( rule__NonLeftRecExpression__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1104:2: ( ( rule__NonLeftRecExpression__Group_0__0 ) )
                    // InternalMyDsl.g:1105:3: ( rule__NonLeftRecExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonLeftRecExpressionAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:1106:3: ( rule__NonLeftRecExpression__Group_0__0 )
                    // InternalMyDsl.g:1106:4: rule__NonLeftRecExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonLeftRecExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonLeftRecExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1110:2: ( ( rule__NonLeftRecExpression__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:1110:2: ( ( rule__NonLeftRecExpression__Group_1__0 ) )
                    // InternalMyDsl.g:1111:3: ( rule__NonLeftRecExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonLeftRecExpressionAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:1112:3: ( rule__NonLeftRecExpression__Group_1__0 )
                    // InternalMyDsl.g:1112:4: rule__NonLeftRecExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonLeftRecExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonLeftRecExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1116:2: ( RULE_IDENT )
                    {
                    // InternalMyDsl.g:1116:2: ( RULE_IDENT )
                    // InternalMyDsl.g:1117:3: RULE_IDENT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonLeftRecExpressionAccess().getIdentTerminalRuleCall_2()); 
                    }
                    match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonLeftRecExpressionAccess().getIdentTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1122:2: ( ruleliteral )
                    {
                    // InternalMyDsl.g:1122:2: ( ruleliteral )
                    // InternalMyDsl.g:1123:3: ruleliteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonLeftRecExpressionAccess().getLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleliteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonLeftRecExpressionAccess().getLiteralParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1128:2: ( ( rule__NonLeftRecExpression__Group_4__0 ) )
                    {
                    // InternalMyDsl.g:1128:2: ( ( rule__NonLeftRecExpression__Group_4__0 ) )
                    // InternalMyDsl.g:1129:3: ( rule__NonLeftRecExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonLeftRecExpressionAccess().getGroup_4()); 
                    }
                    // InternalMyDsl.g:1130:3: ( rule__NonLeftRecExpression__Group_4__0 )
                    // InternalMyDsl.g:1130:4: rule__NonLeftRecExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonLeftRecExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonLeftRecExpressionAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1134:2: ( ( rule__NonLeftRecExpression__Group_5__0 ) )
                    {
                    // InternalMyDsl.g:1134:2: ( ( rule__NonLeftRecExpression__Group_5__0 ) )
                    // InternalMyDsl.g:1135:3: ( rule__NonLeftRecExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonLeftRecExpressionAccess().getGroup_5()); 
                    }
                    // InternalMyDsl.g:1136:3: ( rule__NonLeftRecExpression__Group_5__0 )
                    // InternalMyDsl.g:1136:4: rule__NonLeftRecExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonLeftRecExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonLeftRecExpressionAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1140:2: ( ( rule__NonLeftRecExpression__Group_6__0 ) )
                    {
                    // InternalMyDsl.g:1140:2: ( ( rule__NonLeftRecExpression__Group_6__0 ) )
                    // InternalMyDsl.g:1141:3: ( rule__NonLeftRecExpression__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonLeftRecExpressionAccess().getGroup_6()); 
                    }
                    // InternalMyDsl.g:1142:3: ( rule__NonLeftRecExpression__Group_6__0 )
                    // InternalMyDsl.g:1142:4: rule__NonLeftRecExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonLeftRecExpression__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonLeftRecExpressionAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Alternatives"


    // $ANTLR start "rule__AddOp__Alternatives"
    // InternalMyDsl.g:1150:1: rule__AddOp__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__AddOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1154:1: ( ( '+' ) | ( '-' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1155:2: ( '+' )
                    {
                    // InternalMyDsl.g:1155:2: ( '+' )
                    // InternalMyDsl.g:1156:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddOpAccess().getPlusSignKeyword_0()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddOpAccess().getPlusSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1161:2: ( '-' )
                    {
                    // InternalMyDsl.g:1161:2: ( '-' )
                    // InternalMyDsl.g:1162:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddOpAccess().getHyphenMinusKeyword_1()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddOpAccess().getHyphenMinusKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOp__Alternatives"


    // $ANTLR start "rule__CompOp__Alternatives"
    // InternalMyDsl.g:1171:1: rule__CompOp__Alternatives : ( ( '<=' ) | ( '>=' ) | ( '!=' ) | ( '<>' ) | ( '=' ) | ( '==' ) | ( '<' ) | ( '>' ) );
    public final void rule__CompOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1175:1: ( ( '<=' ) | ( '>=' ) | ( '!=' ) | ( '<>' ) | ( '=' ) | ( '==' ) | ( '<' ) | ( '>' ) )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 23:
                {
                alt9=5;
                }
                break;
            case 24:
                {
                alt9=6;
                }
                break;
            case 25:
                {
                alt9=7;
                }
                break;
            case 26:
                {
                alt9=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1176:2: ( '<=' )
                    {
                    // InternalMyDsl.g:1176:2: ( '<=' )
                    // InternalMyDsl.g:1177:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpAccess().getLessThanSignEqualsSignKeyword_0()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpAccess().getLessThanSignEqualsSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1182:2: ( '>=' )
                    {
                    // InternalMyDsl.g:1182:2: ( '>=' )
                    // InternalMyDsl.g:1183:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpAccess().getGreaterThanSignEqualsSignKeyword_1()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpAccess().getGreaterThanSignEqualsSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1188:2: ( '!=' )
                    {
                    // InternalMyDsl.g:1188:2: ( '!=' )
                    // InternalMyDsl.g:1189:3: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpAccess().getExclamationMarkEqualsSignKeyword_2()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpAccess().getExclamationMarkEqualsSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1194:2: ( '<>' )
                    {
                    // InternalMyDsl.g:1194:2: ( '<>' )
                    // InternalMyDsl.g:1195:3: '<>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpAccess().getLessThanSignGreaterThanSignKeyword_3()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpAccess().getLessThanSignGreaterThanSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1200:2: ( '=' )
                    {
                    // InternalMyDsl.g:1200:2: ( '=' )
                    // InternalMyDsl.g:1201:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpAccess().getEqualsSignKeyword_4()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpAccess().getEqualsSignKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1206:2: ( '==' )
                    {
                    // InternalMyDsl.g:1206:2: ( '==' )
                    // InternalMyDsl.g:1207:3: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpAccess().getEqualsSignEqualsSignKeyword_5()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpAccess().getEqualsSignEqualsSignKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1212:2: ( '<' )
                    {
                    // InternalMyDsl.g:1212:2: ( '<' )
                    // InternalMyDsl.g:1213:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpAccess().getLessThanSignKeyword_6()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpAccess().getLessThanSignKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1218:2: ( '>' )
                    {
                    // InternalMyDsl.g:1218:2: ( '>' )
                    // InternalMyDsl.g:1219:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpAccess().getGreaterThanSignKeyword_7()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpAccess().getGreaterThanSignKeyword_7()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOp__Alternatives"


    // $ANTLR start "rule__CallExp__Alternatives"
    // InternalMyDsl.g:1228:1: rule__CallExp__Alternatives : ( ( ( rule__CallExp__Group_0__0 ) ) | ( ( rule__CallExp__Group_1__0 ) ) );
    public final void rule__CallExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( ( ( rule__CallExp__Group_0__0 ) ) | ( ( rule__CallExp__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=27 && LA10_0<=36)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_IDENT) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1233:2: ( ( rule__CallExp__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1233:2: ( ( rule__CallExp__Group_0__0 ) )
                    // InternalMyDsl.g:1234:3: ( rule__CallExp__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallExpAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:1235:3: ( rule__CallExp__Group_0__0 )
                    // InternalMyDsl.g:1235:4: rule__CallExp__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CallExp__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCallExpAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1239:2: ( ( rule__CallExp__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:1239:2: ( ( rule__CallExp__Group_1__0 ) )
                    // InternalMyDsl.g:1240:3: ( rule__CallExp__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallExpAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:1241:3: ( rule__CallExp__Group_1__0 )
                    // InternalMyDsl.g:1241:4: rule__CallExp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CallExp__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCallExpAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Alternatives"


    // $ANTLR start "rule__CollectionIterator__Alternatives"
    // InternalMyDsl.g:1249:1: rule__CollectionIterator__Alternatives : ( ( 'select' ) | ( 'reject' ) | ( 'collect' ) | ( 'any' ) | ( 'exists' ) | ( 'forAll' ) | ( 'isUnique' ) | ( 'one' ) | ( 'sortedBy' ) | ( 'closure' ) );
    public final void rule__CollectionIterator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1253:1: ( ( 'select' ) | ( 'reject' ) | ( 'collect' ) | ( 'any' ) | ( 'exists' ) | ( 'forAll' ) | ( 'isUnique' ) | ( 'one' ) | ( 'sortedBy' ) | ( 'closure' ) )
            int alt11=10;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 29:
                {
                alt11=3;
                }
                break;
            case 30:
                {
                alt11=4;
                }
                break;
            case 31:
                {
                alt11=5;
                }
                break;
            case 32:
                {
                alt11=6;
                }
                break;
            case 33:
                {
                alt11=7;
                }
                break;
            case 34:
                {
                alt11=8;
                }
                break;
            case 35:
                {
                alt11=9;
                }
                break;
            case 36:
                {
                alt11=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1254:2: ( 'select' )
                    {
                    // InternalMyDsl.g:1254:2: ( 'select' )
                    // InternalMyDsl.g:1255:3: 'select'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCollectionIteratorAccess().getSelectKeyword_0()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCollectionIteratorAccess().getSelectKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1260:2: ( 'reject' )
                    {
                    // InternalMyDsl.g:1260:2: ( 'reject' )
                    // InternalMyDsl.g:1261:3: 'reject'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCollectionIteratorAccess().getRejectKeyword_1()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCollectionIteratorAccess().getRejectKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1266:2: ( 'collect' )
                    {
                    // InternalMyDsl.g:1266:2: ( 'collect' )
                    // InternalMyDsl.g:1267:3: 'collect'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCollectionIteratorAccess().getCollectKeyword_2()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCollectionIteratorAccess().getCollectKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1272:2: ( 'any' )
                    {
                    // InternalMyDsl.g:1272:2: ( 'any' )
                    // InternalMyDsl.g:1273:3: 'any'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCollectionIteratorAccess().getAnyKeyword_3()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCollectionIteratorAccess().getAnyKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1278:2: ( 'exists' )
                    {
                    // InternalMyDsl.g:1278:2: ( 'exists' )
                    // InternalMyDsl.g:1279:3: 'exists'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCollectionIteratorAccess().getExistsKeyword_4()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCollectionIteratorAccess().getExistsKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1284:2: ( 'forAll' )
                    {
                    // InternalMyDsl.g:1284:2: ( 'forAll' )
                    // InternalMyDsl.g:1285:3: 'forAll'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCollectionIteratorAccess().getForAllKeyword_5()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCollectionIteratorAccess().getForAllKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1290:2: ( 'isUnique' )
                    {
                    // InternalMyDsl.g:1290:2: ( 'isUnique' )
                    // InternalMyDsl.g:1291:3: 'isUnique'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCollectionIteratorAccess().getIsUniqueKeyword_6()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCollectionIteratorAccess().getIsUniqueKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1296:2: ( 'one' )
                    {
                    // InternalMyDsl.g:1296:2: ( 'one' )
                    // InternalMyDsl.g:1297:3: 'one'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCollectionIteratorAccess().getOneKeyword_7()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCollectionIteratorAccess().getOneKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1302:2: ( 'sortedBy' )
                    {
                    // InternalMyDsl.g:1302:2: ( 'sortedBy' )
                    // InternalMyDsl.g:1303:3: 'sortedBy'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCollectionIteratorAccess().getSortedByKeyword_8()); 
                    }
                    match(input,35,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCollectionIteratorAccess().getSortedByKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1308:2: ( 'closure' )
                    {
                    // InternalMyDsl.g:1308:2: ( 'closure' )
                    // InternalMyDsl.g:1309:3: 'closure'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCollectionIteratorAccess().getClosureKeyword_9()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCollectionIteratorAccess().getClosureKeyword_9()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionIterator__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalMyDsl.g:1318:1: rule__Literal__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) | ( RULE_REAL ) | ( 'true' ) | ( 'false' ) | ( 'null' ) | ( ( rule__Literal__Group_6__0 ) ) | ( ( rule__Literal__Group_7__0 ) ) | ( ( rule__Literal__Group_8__0 ) ) | ( ( rule__Literal__Group_9__0 ) ) | ( ruletypeLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1322:1: ( ( RULE_STRING ) | ( RULE_INT ) | ( RULE_REAL ) | ( 'true' ) | ( 'false' ) | ( 'null' ) | ( ( rule__Literal__Group_6__0 ) ) | ( ( rule__Literal__Group_7__0 ) ) | ( ( rule__Literal__Group_8__0 ) ) | ( ( rule__Literal__Group_9__0 ) ) | ( ruletypeLiteral ) )
            int alt12=11;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1323:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:1323:2: ( RULE_STRING )
                    // InternalMyDsl.g:1324:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1329:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:1329:2: ( RULE_INT )
                    // InternalMyDsl.g:1330:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_1()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1335:2: ( RULE_REAL )
                    {
                    // InternalMyDsl.g:1335:2: ( RULE_REAL )
                    // InternalMyDsl.g:1336:3: RULE_REAL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getRealTerminalRuleCall_2()); 
                    }
                    match(input,RULE_REAL,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getRealTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1341:2: ( 'true' )
                    {
                    // InternalMyDsl.g:1341:2: ( 'true' )
                    // InternalMyDsl.g:1342:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getTrueKeyword_3()); 
                    }
                    match(input,37,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getTrueKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1347:2: ( 'false' )
                    {
                    // InternalMyDsl.g:1347:2: ( 'false' )
                    // InternalMyDsl.g:1348:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFalseKeyword_4()); 
                    }
                    match(input,38,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getFalseKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1353:2: ( 'null' )
                    {
                    // InternalMyDsl.g:1353:2: ( 'null' )
                    // InternalMyDsl.g:1354:3: 'null'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getNullKeyword_5()); 
                    }
                    match(input,39,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getNullKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1359:2: ( ( rule__Literal__Group_6__0 ) )
                    {
                    // InternalMyDsl.g:1359:2: ( ( rule__Literal__Group_6__0 ) )
                    // InternalMyDsl.g:1360:3: ( rule__Literal__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_6()); 
                    }
                    // InternalMyDsl.g:1361:3: ( rule__Literal__Group_6__0 )
                    // InternalMyDsl.g:1361:4: rule__Literal__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1365:2: ( ( rule__Literal__Group_7__0 ) )
                    {
                    // InternalMyDsl.g:1365:2: ( ( rule__Literal__Group_7__0 ) )
                    // InternalMyDsl.g:1366:3: ( rule__Literal__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_7()); 
                    }
                    // InternalMyDsl.g:1367:3: ( rule__Literal__Group_7__0 )
                    // InternalMyDsl.g:1367:4: rule__Literal__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1371:2: ( ( rule__Literal__Group_8__0 ) )
                    {
                    // InternalMyDsl.g:1371:2: ( ( rule__Literal__Group_8__0 ) )
                    // InternalMyDsl.g:1372:3: ( rule__Literal__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_8()); 
                    }
                    // InternalMyDsl.g:1373:3: ( rule__Literal__Group_8__0 )
                    // InternalMyDsl.g:1373:4: rule__Literal__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1377:2: ( ( rule__Literal__Group_9__0 ) )
                    {
                    // InternalMyDsl.g:1377:2: ( ( rule__Literal__Group_9__0 ) )
                    // InternalMyDsl.g:1378:3: ( rule__Literal__Group_9__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_9()); 
                    }
                    // InternalMyDsl.g:1379:3: ( rule__Literal__Group_9__0 )
                    // InternalMyDsl.g:1379:4: rule__Literal__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:1383:2: ( ruletypeLiteral )
                    {
                    // InternalMyDsl.g:1383:2: ( ruletypeLiteral )
                    // InternalMyDsl.g:1384:3: ruletypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getTypeLiteralParserRuleCall_10()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruletypeLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getTypeLiteralParserRuleCall_10()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__TypeLiteral__Alternatives"
    // InternalMyDsl.g:1393:1: rule__TypeLiteral__Alternatives : ( ( 'String' ) | ( 'Integer' ) | ( 'Real' ) | ( 'Boolean' ) | ( ( rule__TypeLiteral__Group_4__0 ) ) | ( ( rule__TypeLiteral__Group_5__0 ) ) | ( ruleclassifierTypeRule ) | ( ( rule__TypeLiteral__Group_7__0 ) ) );
    public final void rule__TypeLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1397:1: ( ( 'String' ) | ( 'Integer' ) | ( 'Real' ) | ( 'Boolean' ) | ( ( rule__TypeLiteral__Group_4__0 ) ) | ( ( rule__TypeLiteral__Group_5__0 ) ) | ( ruleclassifierTypeRule ) | ( ( rule__TypeLiteral__Group_7__0 ) ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt13=1;
                }
                break;
            case 41:
                {
                alt13=2;
                }
                break;
            case 42:
                {
                alt13=3;
                }
                break;
            case 43:
                {
                alt13=4;
                }
                break;
            case 83:
                {
                alt13=5;
                }
                break;
            case 84:
                {
                alt13=6;
                }
                break;
            case RULE_IDENT:
                {
                alt13=7;
                }
                break;
            case 56:
                {
                alt13=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1398:2: ( 'String' )
                    {
                    // InternalMyDsl.g:1398:2: ( 'String' )
                    // InternalMyDsl.g:1399:3: 'String'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLiteralAccess().getStringKeyword_0()); 
                    }
                    match(input,40,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeLiteralAccess().getStringKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1404:2: ( 'Integer' )
                    {
                    // InternalMyDsl.g:1404:2: ( 'Integer' )
                    // InternalMyDsl.g:1405:3: 'Integer'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLiteralAccess().getIntegerKeyword_1()); 
                    }
                    match(input,41,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeLiteralAccess().getIntegerKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1410:2: ( 'Real' )
                    {
                    // InternalMyDsl.g:1410:2: ( 'Real' )
                    // InternalMyDsl.g:1411:3: 'Real'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLiteralAccess().getRealKeyword_2()); 
                    }
                    match(input,42,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeLiteralAccess().getRealKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1416:2: ( 'Boolean' )
                    {
                    // InternalMyDsl.g:1416:2: ( 'Boolean' )
                    // InternalMyDsl.g:1417:3: 'Boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLiteralAccess().getBooleanKeyword_3()); 
                    }
                    match(input,43,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeLiteralAccess().getBooleanKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1422:2: ( ( rule__TypeLiteral__Group_4__0 ) )
                    {
                    // InternalMyDsl.g:1422:2: ( ( rule__TypeLiteral__Group_4__0 ) )
                    // InternalMyDsl.g:1423:3: ( rule__TypeLiteral__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLiteralAccess().getGroup_4()); 
                    }
                    // InternalMyDsl.g:1424:3: ( rule__TypeLiteral__Group_4__0 )
                    // InternalMyDsl.g:1424:4: rule__TypeLiteral__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeLiteral__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeLiteralAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1428:2: ( ( rule__TypeLiteral__Group_5__0 ) )
                    {
                    // InternalMyDsl.g:1428:2: ( ( rule__TypeLiteral__Group_5__0 ) )
                    // InternalMyDsl.g:1429:3: ( rule__TypeLiteral__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLiteralAccess().getGroup_5()); 
                    }
                    // InternalMyDsl.g:1430:3: ( rule__TypeLiteral__Group_5__0 )
                    // InternalMyDsl.g:1430:4: rule__TypeLiteral__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeLiteral__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeLiteralAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1434:2: ( ruleclassifierTypeRule )
                    {
                    // InternalMyDsl.g:1434:2: ( ruleclassifierTypeRule )
                    // InternalMyDsl.g:1435:3: ruleclassifierTypeRule
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLiteralAccess().getClassifierTypeRuleParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleclassifierTypeRule();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeLiteralAccess().getClassifierTypeRuleParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1440:2: ( ( rule__TypeLiteral__Group_7__0 ) )
                    {
                    // InternalMyDsl.g:1440:2: ( ( rule__TypeLiteral__Group_7__0 ) )
                    // InternalMyDsl.g:1441:3: ( rule__TypeLiteral__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeLiteralAccess().getGroup_7()); 
                    }
                    // InternalMyDsl.g:1442:3: ( rule__TypeLiteral__Group_7__0 )
                    // InternalMyDsl.g:1442:4: rule__TypeLiteral__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeLiteral__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeLiteralAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Alternatives"


    // $ANTLR start "rule__ClassifierTypeRule__Alternatives"
    // InternalMyDsl.g:1450:1: rule__ClassifierTypeRule__Alternatives : ( ( ( rule__ClassifierTypeRule__Group_0__0 ) ) | ( ( rule__ClassifierTypeRule__Group_1__0 ) ) );
    public final void rule__ClassifierTypeRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1454:1: ( ( ( rule__ClassifierTypeRule__Group_0__0 ) ) | ( ( rule__ClassifierTypeRule__Group_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_IDENT) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==82) ) {
                    alt14=1;
                }
                else if ( (LA14_1==78) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1455:2: ( ( rule__ClassifierTypeRule__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1455:2: ( ( rule__ClassifierTypeRule__Group_0__0 ) )
                    // InternalMyDsl.g:1456:3: ( rule__ClassifierTypeRule__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassifierTypeRuleAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:1457:3: ( rule__ClassifierTypeRule__Group_0__0 )
                    // InternalMyDsl.g:1457:4: rule__ClassifierTypeRule__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassifierTypeRule__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassifierTypeRuleAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1461:2: ( ( rule__ClassifierTypeRule__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:1461:2: ( ( rule__ClassifierTypeRule__Group_1__0 ) )
                    // InternalMyDsl.g:1462:3: ( rule__ClassifierTypeRule__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassifierTypeRuleAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:1463:3: ( rule__ClassifierTypeRule__Group_1__0 )
                    // InternalMyDsl.g:1463:4: rule__ClassifierTypeRule__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassifierTypeRule__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassifierTypeRuleAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierTypeRule__Alternatives"


    // $ANTLR start "rule__RRoot__Group__0"
    // InternalMyDsl.g:1471:1: rule__RRoot__Group__0 : rule__RRoot__Group__0__Impl rule__RRoot__Group__1 ;
    public final void rule__RRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1475:1: ( rule__RRoot__Group__0__Impl rule__RRoot__Group__1 )
            // InternalMyDsl.g:1476:2: rule__RRoot__Group__0__Impl rule__RRoot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RRoot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RRoot__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__Group__0"


    // $ANTLR start "rule__RRoot__Group__0__Impl"
    // InternalMyDsl.g:1483:1: rule__RRoot__Group__0__Impl : ( 'behavior' ) ;
    public final void rule__RRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1487:1: ( ( 'behavior' ) )
            // InternalMyDsl.g:1488:1: ( 'behavior' )
            {
            // InternalMyDsl.g:1488:1: ( 'behavior' )
            // InternalMyDsl.g:1489:2: 'behavior'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRRootAccess().getBehaviorKeyword_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRRootAccess().getBehaviorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__Group__0__Impl"


    // $ANTLR start "rule__RRoot__Group__1"
    // InternalMyDsl.g:1498:1: rule__RRoot__Group__1 : rule__RRoot__Group__1__Impl rule__RRoot__Group__2 ;
    public final void rule__RRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( rule__RRoot__Group__1__Impl rule__RRoot__Group__2 )
            // InternalMyDsl.g:1503:2: rule__RRoot__Group__1__Impl rule__RRoot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RRoot__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RRoot__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__Group__1"


    // $ANTLR start "rule__RRoot__Group__1__Impl"
    // InternalMyDsl.g:1510:1: rule__RRoot__Group__1__Impl : ( ( rule__RRoot__BehaviourAssignment_1 ) ) ;
    public final void rule__RRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( ( ( rule__RRoot__BehaviourAssignment_1 ) ) )
            // InternalMyDsl.g:1515:1: ( ( rule__RRoot__BehaviourAssignment_1 ) )
            {
            // InternalMyDsl.g:1515:1: ( ( rule__RRoot__BehaviourAssignment_1 ) )
            // InternalMyDsl.g:1516:2: ( rule__RRoot__BehaviourAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRRootAccess().getBehaviourAssignment_1()); 
            }
            // InternalMyDsl.g:1517:2: ( rule__RRoot__BehaviourAssignment_1 )
            // InternalMyDsl.g:1517:3: rule__RRoot__BehaviourAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RRoot__BehaviourAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRRootAccess().getBehaviourAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__Group__1__Impl"


    // $ANTLR start "rule__RRoot__Group__2"
    // InternalMyDsl.g:1525:1: rule__RRoot__Group__2 : rule__RRoot__Group__2__Impl rule__RRoot__Group__3 ;
    public final void rule__RRoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( rule__RRoot__Group__2__Impl rule__RRoot__Group__3 )
            // InternalMyDsl.g:1530:2: rule__RRoot__Group__2__Impl rule__RRoot__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__RRoot__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RRoot__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__Group__2"


    // $ANTLR start "rule__RRoot__Group__2__Impl"
    // InternalMyDsl.g:1537:1: rule__RRoot__Group__2__Impl : ( ( rule__RRoot__SyntaxesAssignment_2 )* ) ;
    public final void rule__RRoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1541:1: ( ( ( rule__RRoot__SyntaxesAssignment_2 )* ) )
            // InternalMyDsl.g:1542:1: ( ( rule__RRoot__SyntaxesAssignment_2 )* )
            {
            // InternalMyDsl.g:1542:1: ( ( rule__RRoot__SyntaxesAssignment_2 )* )
            // InternalMyDsl.g:1543:2: ( rule__RRoot__SyntaxesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRRootAccess().getSyntaxesAssignment_2()); 
            }
            // InternalMyDsl.g:1544:2: ( rule__RRoot__SyntaxesAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==46) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==47) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1544:3: rule__RRoot__SyntaxesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__RRoot__SyntaxesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRRootAccess().getSyntaxesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__Group__2__Impl"


    // $ANTLR start "rule__RRoot__Group__3"
    // InternalMyDsl.g:1552:1: rule__RRoot__Group__3 : rule__RRoot__Group__3__Impl rule__RRoot__Group__4 ;
    public final void rule__RRoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( rule__RRoot__Group__3__Impl rule__RRoot__Group__4 )
            // InternalMyDsl.g:1557:2: rule__RRoot__Group__3__Impl rule__RRoot__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__RRoot__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RRoot__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__Group__3"


    // $ANTLR start "rule__RRoot__Group__3__Impl"
    // InternalMyDsl.g:1564:1: rule__RRoot__Group__3__Impl : ( ( rule__RRoot__SemanticsAssignment_3 )* ) ;
    public final void rule__RRoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1568:1: ( ( ( rule__RRoot__SemanticsAssignment_3 )* ) )
            // InternalMyDsl.g:1569:1: ( ( rule__RRoot__SemanticsAssignment_3 )* )
            {
            // InternalMyDsl.g:1569:1: ( ( rule__RRoot__SemanticsAssignment_3 )* )
            // InternalMyDsl.g:1570:2: ( rule__RRoot__SemanticsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRRootAccess().getSemanticsAssignment_3()); 
            }
            // InternalMyDsl.g:1571:2: ( rule__RRoot__SemanticsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==46) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==50) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1571:3: rule__RRoot__SemanticsAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__RRoot__SemanticsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRRootAccess().getSemanticsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__Group__3__Impl"


    // $ANTLR start "rule__RRoot__Group__4"
    // InternalMyDsl.g:1579:1: rule__RRoot__Group__4 : rule__RRoot__Group__4__Impl rule__RRoot__Group__5 ;
    public final void rule__RRoot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1583:1: ( rule__RRoot__Group__4__Impl rule__RRoot__Group__5 )
            // InternalMyDsl.g:1584:2: rule__RRoot__Group__4__Impl rule__RRoot__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__RRoot__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RRoot__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__Group__4"


    // $ANTLR start "rule__RRoot__Group__4__Impl"
    // InternalMyDsl.g:1591:1: rule__RRoot__Group__4__Impl : ( ( rule__RRoot__ServicesAssignment_4 )* ) ;
    public final void rule__RRoot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1595:1: ( ( ( rule__RRoot__ServicesAssignment_4 )* ) )
            // InternalMyDsl.g:1596:1: ( ( rule__RRoot__ServicesAssignment_4 )* )
            {
            // InternalMyDsl.g:1596:1: ( ( rule__RRoot__ServicesAssignment_4 )* )
            // InternalMyDsl.g:1597:2: ( rule__RRoot__ServicesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRRootAccess().getServicesAssignment_4()); 
            }
            // InternalMyDsl.g:1598:2: ( rule__RRoot__ServicesAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==46) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1598:3: rule__RRoot__ServicesAssignment_4
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__RRoot__ServicesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRRootAccess().getServicesAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__Group__4__Impl"


    // $ANTLR start "rule__RRoot__Group__5"
    // InternalMyDsl.g:1606:1: rule__RRoot__Group__5 : rule__RRoot__Group__5__Impl ;
    public final void rule__RRoot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( rule__RRoot__Group__5__Impl )
            // InternalMyDsl.g:1611:2: rule__RRoot__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RRoot__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__Group__5"


    // $ANTLR start "rule__RRoot__Group__5__Impl"
    // InternalMyDsl.g:1617:1: rule__RRoot__Group__5__Impl : ( ( rule__RRoot__XtendedClassesAssignment_5 )* ) ;
    public final void rule__RRoot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1621:1: ( ( ( rule__RRoot__XtendedClassesAssignment_5 )* ) )
            // InternalMyDsl.g:1622:1: ( ( rule__RRoot__XtendedClassesAssignment_5 )* )
            {
            // InternalMyDsl.g:1622:1: ( ( rule__RRoot__XtendedClassesAssignment_5 )* )
            // InternalMyDsl.g:1623:2: ( rule__RRoot__XtendedClassesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRRootAccess().getXtendedClassesAssignment_5()); 
            }
            // InternalMyDsl.g:1624:2: ( rule__RRoot__XtendedClassesAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==55) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1624:3: rule__RRoot__XtendedClassesAssignment_5
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RRoot__XtendedClassesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRRootAccess().getXtendedClassesAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__Group__5__Impl"


    // $ANTLR start "rule__Qualified__Group__0"
    // InternalMyDsl.g:1633:1: rule__Qualified__Group__0 : rule__Qualified__Group__0__Impl rule__Qualified__Group__1 ;
    public final void rule__Qualified__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1637:1: ( rule__Qualified__Group__0__Impl rule__Qualified__Group__1 )
            // InternalMyDsl.g:1638:2: rule__Qualified__Group__0__Impl rule__Qualified__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Qualified__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qualified__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified__Group__0"


    // $ANTLR start "rule__Qualified__Group__0__Impl"
    // InternalMyDsl.g:1645:1: rule__Qualified__Group__0__Impl : ( RULE_IDENT ) ;
    public final void rule__Qualified__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1649:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:1650:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:1650:1: ( RULE_IDENT )
            // InternalMyDsl.g:1651:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedAccess().getIdentTerminalRuleCall_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedAccess().getIdentTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified__Group__0__Impl"


    // $ANTLR start "rule__Qualified__Group__1"
    // InternalMyDsl.g:1660:1: rule__Qualified__Group__1 : rule__Qualified__Group__1__Impl ;
    public final void rule__Qualified__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( rule__Qualified__Group__1__Impl )
            // InternalMyDsl.g:1665:2: rule__Qualified__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualified__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified__Group__1"


    // $ANTLR start "rule__Qualified__Group__1__Impl"
    // InternalMyDsl.g:1671:1: rule__Qualified__Group__1__Impl : ( ( rule__Qualified__Group_1__0 ) ) ;
    public final void rule__Qualified__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1675:1: ( ( ( rule__Qualified__Group_1__0 ) ) )
            // InternalMyDsl.g:1676:1: ( ( rule__Qualified__Group_1__0 ) )
            {
            // InternalMyDsl.g:1676:1: ( ( rule__Qualified__Group_1__0 ) )
            // InternalMyDsl.g:1677:2: ( rule__Qualified__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedAccess().getGroup_1()); 
            }
            // InternalMyDsl.g:1678:2: ( rule__Qualified__Group_1__0 )
            // InternalMyDsl.g:1678:3: rule__Qualified__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Qualified__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified__Group__1__Impl"


    // $ANTLR start "rule__Qualified__Group_1__0"
    // InternalMyDsl.g:1687:1: rule__Qualified__Group_1__0 : rule__Qualified__Group_1__0__Impl rule__Qualified__Group_1__1 ;
    public final void rule__Qualified__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1691:1: ( rule__Qualified__Group_1__0__Impl rule__Qualified__Group_1__1 )
            // InternalMyDsl.g:1692:2: rule__Qualified__Group_1__0__Impl rule__Qualified__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Qualified__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qualified__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified__Group_1__0"


    // $ANTLR start "rule__Qualified__Group_1__0__Impl"
    // InternalMyDsl.g:1699:1: rule__Qualified__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Qualified__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1703:1: ( ( '.' ) )
            // InternalMyDsl.g:1704:1: ( '.' )
            {
            // InternalMyDsl.g:1704:1: ( '.' )
            // InternalMyDsl.g:1705:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedAccess().getFullStopKeyword_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified__Group_1__0__Impl"


    // $ANTLR start "rule__Qualified__Group_1__1"
    // InternalMyDsl.g:1714:1: rule__Qualified__Group_1__1 : rule__Qualified__Group_1__1__Impl ;
    public final void rule__Qualified__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( rule__Qualified__Group_1__1__Impl )
            // InternalMyDsl.g:1719:2: rule__Qualified__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualified__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified__Group_1__1"


    // $ANTLR start "rule__Qualified__Group_1__1__Impl"
    // InternalMyDsl.g:1725:1: rule__Qualified__Group_1__1__Impl : ( RULE_IDENT ) ;
    public final void rule__Qualified__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1729:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:1730:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:1730:1: ( RULE_IDENT )
            // InternalMyDsl.g:1731:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedAccess().getIdentTerminalRuleCall_1_1()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedAccess().getIdentTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualified__Group_1__1__Impl"


    // $ANTLR start "rule__RImportSyntax__Group__0"
    // InternalMyDsl.g:1741:1: rule__RImportSyntax__Group__0 : rule__RImportSyntax__Group__0__Impl rule__RImportSyntax__Group__1 ;
    public final void rule__RImportSyntax__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( rule__RImportSyntax__Group__0__Impl rule__RImportSyntax__Group__1 )
            // InternalMyDsl.g:1746:2: rule__RImportSyntax__Group__0__Impl rule__RImportSyntax__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RImportSyntax__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportSyntax__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSyntax__Group__0"


    // $ANTLR start "rule__RImportSyntax__Group__0__Impl"
    // InternalMyDsl.g:1753:1: rule__RImportSyntax__Group__0__Impl : ( 'import' ) ;
    public final void rule__RImportSyntax__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1757:1: ( ( 'import' ) )
            // InternalMyDsl.g:1758:1: ( 'import' )
            {
            // InternalMyDsl.g:1758:1: ( 'import' )
            // InternalMyDsl.g:1759:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSyntaxAccess().getImportKeyword_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSyntaxAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSyntax__Group__0__Impl"


    // $ANTLR start "rule__RImportSyntax__Group__1"
    // InternalMyDsl.g:1768:1: rule__RImportSyntax__Group__1 : rule__RImportSyntax__Group__1__Impl rule__RImportSyntax__Group__2 ;
    public final void rule__RImportSyntax__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1772:1: ( rule__RImportSyntax__Group__1__Impl rule__RImportSyntax__Group__2 )
            // InternalMyDsl.g:1773:2: rule__RImportSyntax__Group__1__Impl rule__RImportSyntax__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__RImportSyntax__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportSyntax__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSyntax__Group__1"


    // $ANTLR start "rule__RImportSyntax__Group__1__Impl"
    // InternalMyDsl.g:1780:1: rule__RImportSyntax__Group__1__Impl : ( 'syntax' ) ;
    public final void rule__RImportSyntax__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1784:1: ( ( 'syntax' ) )
            // InternalMyDsl.g:1785:1: ( 'syntax' )
            {
            // InternalMyDsl.g:1785:1: ( 'syntax' )
            // InternalMyDsl.g:1786:2: 'syntax'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSyntaxAccess().getSyntaxKeyword_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSyntaxAccess().getSyntaxKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSyntax__Group__1__Impl"


    // $ANTLR start "rule__RImportSyntax__Group__2"
    // InternalMyDsl.g:1795:1: rule__RImportSyntax__Group__2 : rule__RImportSyntax__Group__2__Impl rule__RImportSyntax__Group__3 ;
    public final void rule__RImportSyntax__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1799:1: ( rule__RImportSyntax__Group__2__Impl rule__RImportSyntax__Group__3 )
            // InternalMyDsl.g:1800:2: rule__RImportSyntax__Group__2__Impl rule__RImportSyntax__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__RImportSyntax__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportSyntax__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSyntax__Group__2"


    // $ANTLR start "rule__RImportSyntax__Group__2__Impl"
    // InternalMyDsl.g:1807:1: rule__RImportSyntax__Group__2__Impl : ( ( rule__RImportSyntax__UriAssignment_2 ) ) ;
    public final void rule__RImportSyntax__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1811:1: ( ( ( rule__RImportSyntax__UriAssignment_2 ) ) )
            // InternalMyDsl.g:1812:1: ( ( rule__RImportSyntax__UriAssignment_2 ) )
            {
            // InternalMyDsl.g:1812:1: ( ( rule__RImportSyntax__UriAssignment_2 ) )
            // InternalMyDsl.g:1813:2: ( rule__RImportSyntax__UriAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSyntaxAccess().getUriAssignment_2()); 
            }
            // InternalMyDsl.g:1814:2: ( rule__RImportSyntax__UriAssignment_2 )
            // InternalMyDsl.g:1814:3: rule__RImportSyntax__UriAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RImportSyntax__UriAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSyntaxAccess().getUriAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSyntax__Group__2__Impl"


    // $ANTLR start "rule__RImportSyntax__Group__3"
    // InternalMyDsl.g:1822:1: rule__RImportSyntax__Group__3 : rule__RImportSyntax__Group__3__Impl rule__RImportSyntax__Group__4 ;
    public final void rule__RImportSyntax__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( rule__RImportSyntax__Group__3__Impl rule__RImportSyntax__Group__4 )
            // InternalMyDsl.g:1827:2: rule__RImportSyntax__Group__3__Impl rule__RImportSyntax__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__RImportSyntax__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportSyntax__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSyntax__Group__3"


    // $ANTLR start "rule__RImportSyntax__Group__3__Impl"
    // InternalMyDsl.g:1834:1: rule__RImportSyntax__Group__3__Impl : ( 'as' ) ;
    public final void rule__RImportSyntax__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1838:1: ( ( 'as' ) )
            // InternalMyDsl.g:1839:1: ( 'as' )
            {
            // InternalMyDsl.g:1839:1: ( 'as' )
            // InternalMyDsl.g:1840:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSyntaxAccess().getAsKeyword_3()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSyntaxAccess().getAsKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSyntax__Group__3__Impl"


    // $ANTLR start "rule__RImportSyntax__Group__4"
    // InternalMyDsl.g:1849:1: rule__RImportSyntax__Group__4 : rule__RImportSyntax__Group__4__Impl rule__RImportSyntax__Group__5 ;
    public final void rule__RImportSyntax__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1853:1: ( rule__RImportSyntax__Group__4__Impl rule__RImportSyntax__Group__5 )
            // InternalMyDsl.g:1854:2: rule__RImportSyntax__Group__4__Impl rule__RImportSyntax__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__RImportSyntax__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportSyntax__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSyntax__Group__4"


    // $ANTLR start "rule__RImportSyntax__Group__4__Impl"
    // InternalMyDsl.g:1861:1: rule__RImportSyntax__Group__4__Impl : ( ( rule__RImportSyntax__NameAssignment_4 ) ) ;
    public final void rule__RImportSyntax__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1865:1: ( ( ( rule__RImportSyntax__NameAssignment_4 ) ) )
            // InternalMyDsl.g:1866:1: ( ( rule__RImportSyntax__NameAssignment_4 ) )
            {
            // InternalMyDsl.g:1866:1: ( ( rule__RImportSyntax__NameAssignment_4 ) )
            // InternalMyDsl.g:1867:2: ( rule__RImportSyntax__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSyntaxAccess().getNameAssignment_4()); 
            }
            // InternalMyDsl.g:1868:2: ( rule__RImportSyntax__NameAssignment_4 )
            // InternalMyDsl.g:1868:3: rule__RImportSyntax__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RImportSyntax__NameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSyntaxAccess().getNameAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSyntax__Group__4__Impl"


    // $ANTLR start "rule__RImportSyntax__Group__5"
    // InternalMyDsl.g:1876:1: rule__RImportSyntax__Group__5 : rule__RImportSyntax__Group__5__Impl ;
    public final void rule__RImportSyntax__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1880:1: ( rule__RImportSyntax__Group__5__Impl )
            // InternalMyDsl.g:1881:2: rule__RImportSyntax__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RImportSyntax__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSyntax__Group__5"


    // $ANTLR start "rule__RImportSyntax__Group__5__Impl"
    // InternalMyDsl.g:1887:1: rule__RImportSyntax__Group__5__Impl : ( ';' ) ;
    public final void rule__RImportSyntax__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1891:1: ( ( ';' ) )
            // InternalMyDsl.g:1892:1: ( ';' )
            {
            // InternalMyDsl.g:1892:1: ( ';' )
            // InternalMyDsl.g:1893:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSyntaxAccess().getSemicolonKeyword_5()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSyntaxAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSyntax__Group__5__Impl"


    // $ANTLR start "rule__RImportSemantic__Group__0"
    // InternalMyDsl.g:1903:1: rule__RImportSemantic__Group__0 : rule__RImportSemantic__Group__0__Impl rule__RImportSemantic__Group__1 ;
    public final void rule__RImportSemantic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( rule__RImportSemantic__Group__0__Impl rule__RImportSemantic__Group__1 )
            // InternalMyDsl.g:1908:2: rule__RImportSemantic__Group__0__Impl rule__RImportSemantic__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__RImportSemantic__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportSemantic__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__0"


    // $ANTLR start "rule__RImportSemantic__Group__0__Impl"
    // InternalMyDsl.g:1915:1: rule__RImportSemantic__Group__0__Impl : ( 'import' ) ;
    public final void rule__RImportSemantic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1919:1: ( ( 'import' ) )
            // InternalMyDsl.g:1920:1: ( 'import' )
            {
            // InternalMyDsl.g:1920:1: ( 'import' )
            // InternalMyDsl.g:1921:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSemanticAccess().getImportKeyword_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSemanticAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__0__Impl"


    // $ANTLR start "rule__RImportSemantic__Group__1"
    // InternalMyDsl.g:1930:1: rule__RImportSemantic__Group__1 : rule__RImportSemantic__Group__1__Impl rule__RImportSemantic__Group__2 ;
    public final void rule__RImportSemantic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1934:1: ( rule__RImportSemantic__Group__1__Impl rule__RImportSemantic__Group__2 )
            // InternalMyDsl.g:1935:2: rule__RImportSemantic__Group__1__Impl rule__RImportSemantic__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RImportSemantic__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportSemantic__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__1"


    // $ANTLR start "rule__RImportSemantic__Group__1__Impl"
    // InternalMyDsl.g:1942:1: rule__RImportSemantic__Group__1__Impl : ( 'semantic' ) ;
    public final void rule__RImportSemantic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1946:1: ( ( 'semantic' ) )
            // InternalMyDsl.g:1947:1: ( 'semantic' )
            {
            // InternalMyDsl.g:1947:1: ( 'semantic' )
            // InternalMyDsl.g:1948:2: 'semantic'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSemanticAccess().getSemanticKeyword_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSemanticAccess().getSemanticKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__1__Impl"


    // $ANTLR start "rule__RImportSemantic__Group__2"
    // InternalMyDsl.g:1957:1: rule__RImportSemantic__Group__2 : rule__RImportSemantic__Group__2__Impl rule__RImportSemantic__Group__3 ;
    public final void rule__RImportSemantic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( rule__RImportSemantic__Group__2__Impl rule__RImportSemantic__Group__3 )
            // InternalMyDsl.g:1962:2: rule__RImportSemantic__Group__2__Impl rule__RImportSemantic__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__RImportSemantic__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportSemantic__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__2"


    // $ANTLR start "rule__RImportSemantic__Group__2__Impl"
    // InternalMyDsl.g:1969:1: rule__RImportSemantic__Group__2__Impl : ( ruleQualified ) ;
    public final void rule__RImportSemantic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1973:1: ( ( ruleQualified ) )
            // InternalMyDsl.g:1974:1: ( ruleQualified )
            {
            // InternalMyDsl.g:1974:1: ( ruleQualified )
            // InternalMyDsl.g:1975:2: ruleQualified
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSemanticAccess().getQualifiedParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualified();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSemanticAccess().getQualifiedParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__2__Impl"


    // $ANTLR start "rule__RImportSemantic__Group__3"
    // InternalMyDsl.g:1984:1: rule__RImportSemantic__Group__3 : rule__RImportSemantic__Group__3__Impl rule__RImportSemantic__Group__4 ;
    public final void rule__RImportSemantic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( rule__RImportSemantic__Group__3__Impl rule__RImportSemantic__Group__4 )
            // InternalMyDsl.g:1989:2: rule__RImportSemantic__Group__3__Impl rule__RImportSemantic__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__RImportSemantic__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportSemantic__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__3"


    // $ANTLR start "rule__RImportSemantic__Group__3__Impl"
    // InternalMyDsl.g:1996:1: rule__RImportSemantic__Group__3__Impl : ( 'as' ) ;
    public final void rule__RImportSemantic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2000:1: ( ( 'as' ) )
            // InternalMyDsl.g:2001:1: ( 'as' )
            {
            // InternalMyDsl.g:2001:1: ( 'as' )
            // InternalMyDsl.g:2002:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSemanticAccess().getAsKeyword_3()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSemanticAccess().getAsKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__3__Impl"


    // $ANTLR start "rule__RImportSemantic__Group__4"
    // InternalMyDsl.g:2011:1: rule__RImportSemantic__Group__4 : rule__RImportSemantic__Group__4__Impl rule__RImportSemantic__Group__5 ;
    public final void rule__RImportSemantic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2015:1: ( rule__RImportSemantic__Group__4__Impl rule__RImportSemantic__Group__5 )
            // InternalMyDsl.g:2016:2: rule__RImportSemantic__Group__4__Impl rule__RImportSemantic__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__RImportSemantic__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportSemantic__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__4"


    // $ANTLR start "rule__RImportSemantic__Group__4__Impl"
    // InternalMyDsl.g:2023:1: rule__RImportSemantic__Group__4__Impl : ( RULE_IDENT ) ;
    public final void rule__RImportSemantic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2027:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:2028:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:2028:1: ( RULE_IDENT )
            // InternalMyDsl.g:2029:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSemanticAccess().getIdentTerminalRuleCall_4()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSemanticAccess().getIdentTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__4__Impl"


    // $ANTLR start "rule__RImportSemantic__Group__5"
    // InternalMyDsl.g:2038:1: rule__RImportSemantic__Group__5 : rule__RImportSemantic__Group__5__Impl rule__RImportSemantic__Group__6 ;
    public final void rule__RImportSemantic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2042:1: ( rule__RImportSemantic__Group__5__Impl rule__RImportSemantic__Group__6 )
            // InternalMyDsl.g:2043:2: rule__RImportSemantic__Group__5__Impl rule__RImportSemantic__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__RImportSemantic__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportSemantic__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__5"


    // $ANTLR start "rule__RImportSemantic__Group__5__Impl"
    // InternalMyDsl.g:2050:1: rule__RImportSemantic__Group__5__Impl : ( '(' ) ;
    public final void rule__RImportSemantic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2054:1: ( ( '(' ) )
            // InternalMyDsl.g:2055:1: ( '(' )
            {
            // InternalMyDsl.g:2055:1: ( '(' )
            // InternalMyDsl.g:2056:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSemanticAccess().getLeftParenthesisKeyword_5()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSemanticAccess().getLeftParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__5__Impl"


    // $ANTLR start "rule__RImportSemantic__Group__6"
    // InternalMyDsl.g:2065:1: rule__RImportSemantic__Group__6 : rule__RImportSemantic__Group__6__Impl rule__RImportSemantic__Group__7 ;
    public final void rule__RImportSemantic__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2069:1: ( rule__RImportSemantic__Group__6__Impl rule__RImportSemantic__Group__7 )
            // InternalMyDsl.g:2070:2: rule__RImportSemantic__Group__6__Impl rule__RImportSemantic__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__RImportSemantic__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportSemantic__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__6"


    // $ANTLR start "rule__RImportSemantic__Group__6__Impl"
    // InternalMyDsl.g:2077:1: rule__RImportSemantic__Group__6__Impl : ( RULE_IDENT ) ;
    public final void rule__RImportSemantic__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2081:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:2082:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:2082:1: ( RULE_IDENT )
            // InternalMyDsl.g:2083:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSemanticAccess().getIdentTerminalRuleCall_6()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSemanticAccess().getIdentTerminalRuleCall_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__6__Impl"


    // $ANTLR start "rule__RImportSemantic__Group__7"
    // InternalMyDsl.g:2092:1: rule__RImportSemantic__Group__7 : rule__RImportSemantic__Group__7__Impl rule__RImportSemantic__Group__8 ;
    public final void rule__RImportSemantic__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2096:1: ( rule__RImportSemantic__Group__7__Impl rule__RImportSemantic__Group__8 )
            // InternalMyDsl.g:2097:2: rule__RImportSemantic__Group__7__Impl rule__RImportSemantic__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__RImportSemantic__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportSemantic__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__7"


    // $ANTLR start "rule__RImportSemantic__Group__7__Impl"
    // InternalMyDsl.g:2104:1: rule__RImportSemantic__Group__7__Impl : ( '=>' ) ;
    public final void rule__RImportSemantic__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2108:1: ( ( '=>' ) )
            // InternalMyDsl.g:2109:1: ( '=>' )
            {
            // InternalMyDsl.g:2109:1: ( '=>' )
            // InternalMyDsl.g:2110:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSemanticAccess().getEqualsSignGreaterThanSignKeyword_7()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSemanticAccess().getEqualsSignGreaterThanSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__7__Impl"


    // $ANTLR start "rule__RImportSemantic__Group__8"
    // InternalMyDsl.g:2119:1: rule__RImportSemantic__Group__8 : rule__RImportSemantic__Group__8__Impl rule__RImportSemantic__Group__9 ;
    public final void rule__RImportSemantic__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2123:1: ( rule__RImportSemantic__Group__8__Impl rule__RImportSemantic__Group__9 )
            // InternalMyDsl.g:2124:2: rule__RImportSemantic__Group__8__Impl rule__RImportSemantic__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__RImportSemantic__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportSemantic__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__8"


    // $ANTLR start "rule__RImportSemantic__Group__8__Impl"
    // InternalMyDsl.g:2131:1: rule__RImportSemantic__Group__8__Impl : ( RULE_IDENT ) ;
    public final void rule__RImportSemantic__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2135:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:2136:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:2136:1: ( RULE_IDENT )
            // InternalMyDsl.g:2137:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSemanticAccess().getIdentTerminalRuleCall_8()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSemanticAccess().getIdentTerminalRuleCall_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__8__Impl"


    // $ANTLR start "rule__RImportSemantic__Group__9"
    // InternalMyDsl.g:2146:1: rule__RImportSemantic__Group__9 : rule__RImportSemantic__Group__9__Impl rule__RImportSemantic__Group__10 ;
    public final void rule__RImportSemantic__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2150:1: ( rule__RImportSemantic__Group__9__Impl rule__RImportSemantic__Group__10 )
            // InternalMyDsl.g:2151:2: rule__RImportSemantic__Group__9__Impl rule__RImportSemantic__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__RImportSemantic__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportSemantic__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__9"


    // $ANTLR start "rule__RImportSemantic__Group__9__Impl"
    // InternalMyDsl.g:2158:1: rule__RImportSemantic__Group__9__Impl : ( ')' ) ;
    public final void rule__RImportSemantic__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2162:1: ( ( ')' ) )
            // InternalMyDsl.g:2163:1: ( ')' )
            {
            // InternalMyDsl.g:2163:1: ( ')' )
            // InternalMyDsl.g:2164:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSemanticAccess().getRightParenthesisKeyword_9()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSemanticAccess().getRightParenthesisKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__9__Impl"


    // $ANTLR start "rule__RImportSemantic__Group__10"
    // InternalMyDsl.g:2173:1: rule__RImportSemantic__Group__10 : rule__RImportSemantic__Group__10__Impl ;
    public final void rule__RImportSemantic__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2177:1: ( rule__RImportSemantic__Group__10__Impl )
            // InternalMyDsl.g:2178:2: rule__RImportSemantic__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RImportSemantic__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__10"


    // $ANTLR start "rule__RImportSemantic__Group__10__Impl"
    // InternalMyDsl.g:2184:1: rule__RImportSemantic__Group__10__Impl : ( ';' ) ;
    public final void rule__RImportSemantic__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2188:1: ( ( ';' ) )
            // InternalMyDsl.g:2189:1: ( ';' )
            {
            // InternalMyDsl.g:2189:1: ( ';' )
            // InternalMyDsl.g:2190:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSemanticAccess().getSemicolonKeyword_10()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSemanticAccess().getSemicolonKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSemantic__Group__10__Impl"


    // $ANTLR start "rule__RImportService__Group__0"
    // InternalMyDsl.g:2200:1: rule__RImportService__Group__0 : rule__RImportService__Group__0__Impl rule__RImportService__Group__1 ;
    public final void rule__RImportService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2204:1: ( rule__RImportService__Group__0__Impl rule__RImportService__Group__1 )
            // InternalMyDsl.g:2205:2: rule__RImportService__Group__0__Impl rule__RImportService__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__RImportService__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportService__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportService__Group__0"


    // $ANTLR start "rule__RImportService__Group__0__Impl"
    // InternalMyDsl.g:2212:1: rule__RImportService__Group__0__Impl : ( 'import' ) ;
    public final void rule__RImportService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2216:1: ( ( 'import' ) )
            // InternalMyDsl.g:2217:1: ( 'import' )
            {
            // InternalMyDsl.g:2217:1: ( 'import' )
            // InternalMyDsl.g:2218:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportServiceAccess().getImportKeyword_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportServiceAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportService__Group__0__Impl"


    // $ANTLR start "rule__RImportService__Group__1"
    // InternalMyDsl.g:2227:1: rule__RImportService__Group__1 : rule__RImportService__Group__1__Impl rule__RImportService__Group__2 ;
    public final void rule__RImportService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2231:1: ( rule__RImportService__Group__1__Impl rule__RImportService__Group__2 )
            // InternalMyDsl.g:2232:2: rule__RImportService__Group__1__Impl rule__RImportService__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RImportService__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportService__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportService__Group__1"


    // $ANTLR start "rule__RImportService__Group__1__Impl"
    // InternalMyDsl.g:2239:1: rule__RImportService__Group__1__Impl : ( 'service' ) ;
    public final void rule__RImportService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2243:1: ( ( 'service' ) )
            // InternalMyDsl.g:2244:1: ( 'service' )
            {
            // InternalMyDsl.g:2244:1: ( 'service' )
            // InternalMyDsl.g:2245:2: 'service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportServiceAccess().getServiceKeyword_1()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportServiceAccess().getServiceKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportService__Group__1__Impl"


    // $ANTLR start "rule__RImportService__Group__2"
    // InternalMyDsl.g:2254:1: rule__RImportService__Group__2 : rule__RImportService__Group__2__Impl rule__RImportService__Group__3 ;
    public final void rule__RImportService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2258:1: ( rule__RImportService__Group__2__Impl rule__RImportService__Group__3 )
            // InternalMyDsl.g:2259:2: rule__RImportService__Group__2__Impl rule__RImportService__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RImportService__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RImportService__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportService__Group__2"


    // $ANTLR start "rule__RImportService__Group__2__Impl"
    // InternalMyDsl.g:2266:1: rule__RImportService__Group__2__Impl : ( ruleQualified ) ;
    public final void rule__RImportService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2270:1: ( ( ruleQualified ) )
            // InternalMyDsl.g:2271:1: ( ruleQualified )
            {
            // InternalMyDsl.g:2271:1: ( ruleQualified )
            // InternalMyDsl.g:2272:2: ruleQualified
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportServiceAccess().getQualifiedParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualified();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportServiceAccess().getQualifiedParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportService__Group__2__Impl"


    // $ANTLR start "rule__RImportService__Group__3"
    // InternalMyDsl.g:2281:1: rule__RImportService__Group__3 : rule__RImportService__Group__3__Impl ;
    public final void rule__RImportService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( rule__RImportService__Group__3__Impl )
            // InternalMyDsl.g:2286:2: rule__RImportService__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RImportService__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportService__Group__3"


    // $ANTLR start "rule__RImportService__Group__3__Impl"
    // InternalMyDsl.g:2292:1: rule__RImportService__Group__3__Impl : ( ';' ) ;
    public final void rule__RImportService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2296:1: ( ( ';' ) )
            // InternalMyDsl.g:2297:1: ( ';' )
            {
            // InternalMyDsl.g:2297:1: ( ';' )
            // InternalMyDsl.g:2298:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportServiceAccess().getSemicolonKeyword_3()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportServiceAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportService__Group__3__Impl"


    // $ANTLR start "rule__RClass__Group__0"
    // InternalMyDsl.g:2308:1: rule__RClass__Group__0 : rule__RClass__Group__0__Impl rule__RClass__Group__1 ;
    public final void rule__RClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( rule__RClass__Group__0__Impl rule__RClass__Group__1 )
            // InternalMyDsl.g:2313:2: rule__RClass__Group__0__Impl rule__RClass__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__RClass__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RClass__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__Group__0"


    // $ANTLR start "rule__RClass__Group__0__Impl"
    // InternalMyDsl.g:2320:1: rule__RClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__RClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2324:1: ( ( 'class' ) )
            // InternalMyDsl.g:2325:1: ( 'class' )
            {
            // InternalMyDsl.g:2325:1: ( 'class' )
            // InternalMyDsl.g:2326:2: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRClassAccess().getClassKeyword_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRClassAccess().getClassKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__Group__0__Impl"


    // $ANTLR start "rule__RClass__Group__1"
    // InternalMyDsl.g:2335:1: rule__RClass__Group__1 : rule__RClass__Group__1__Impl rule__RClass__Group__2 ;
    public final void rule__RClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2339:1: ( rule__RClass__Group__1__Impl rule__RClass__Group__2 )
            // InternalMyDsl.g:2340:2: rule__RClass__Group__1__Impl rule__RClass__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__RClass__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RClass__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__Group__1"


    // $ANTLR start "rule__RClass__Group__1__Impl"
    // InternalMyDsl.g:2347:1: rule__RClass__Group__1__Impl : ( ( rule__RClass__SyntaxAssignment_1 ) ) ;
    public final void rule__RClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2351:1: ( ( ( rule__RClass__SyntaxAssignment_1 ) ) )
            // InternalMyDsl.g:2352:1: ( ( rule__RClass__SyntaxAssignment_1 ) )
            {
            // InternalMyDsl.g:2352:1: ( ( rule__RClass__SyntaxAssignment_1 ) )
            // InternalMyDsl.g:2353:2: ( rule__RClass__SyntaxAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRClassAccess().getSyntaxAssignment_1()); 
            }
            // InternalMyDsl.g:2354:2: ( rule__RClass__SyntaxAssignment_1 )
            // InternalMyDsl.g:2354:3: rule__RClass__SyntaxAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RClass__SyntaxAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRClassAccess().getSyntaxAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__Group__1__Impl"


    // $ANTLR start "rule__RClass__Group__2"
    // InternalMyDsl.g:2362:1: rule__RClass__Group__2 : rule__RClass__Group__2__Impl rule__RClass__Group__3 ;
    public final void rule__RClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2366:1: ( rule__RClass__Group__2__Impl rule__RClass__Group__3 )
            // InternalMyDsl.g:2367:2: rule__RClass__Group__2__Impl rule__RClass__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__RClass__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RClass__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__Group__2"


    // $ANTLR start "rule__RClass__Group__2__Impl"
    // InternalMyDsl.g:2374:1: rule__RClass__Group__2__Impl : ( '.' ) ;
    public final void rule__RClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2378:1: ( ( '.' ) )
            // InternalMyDsl.g:2379:1: ( '.' )
            {
            // InternalMyDsl.g:2379:1: ( '.' )
            // InternalMyDsl.g:2380:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRClassAccess().getFullStopKeyword_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRClassAccess().getFullStopKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__Group__2__Impl"


    // $ANTLR start "rule__RClass__Group__3"
    // InternalMyDsl.g:2389:1: rule__RClass__Group__3 : rule__RClass__Group__3__Impl rule__RClass__Group__4 ;
    public final void rule__RClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2393:1: ( rule__RClass__Group__3__Impl rule__RClass__Group__4 )
            // InternalMyDsl.g:2394:2: rule__RClass__Group__3__Impl rule__RClass__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__RClass__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RClass__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__Group__3"


    // $ANTLR start "rule__RClass__Group__3__Impl"
    // InternalMyDsl.g:2401:1: rule__RClass__Group__3__Impl : ( ( rule__RClass__NameAssignment_3 ) ) ;
    public final void rule__RClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2405:1: ( ( ( rule__RClass__NameAssignment_3 ) ) )
            // InternalMyDsl.g:2406:1: ( ( rule__RClass__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:2406:1: ( ( rule__RClass__NameAssignment_3 ) )
            // InternalMyDsl.g:2407:2: ( rule__RClass__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRClassAccess().getNameAssignment_3()); 
            }
            // InternalMyDsl.g:2408:2: ( rule__RClass__NameAssignment_3 )
            // InternalMyDsl.g:2408:3: rule__RClass__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RClass__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRClassAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__Group__3__Impl"


    // $ANTLR start "rule__RClass__Group__4"
    // InternalMyDsl.g:2416:1: rule__RClass__Group__4 : rule__RClass__Group__4__Impl rule__RClass__Group__5 ;
    public final void rule__RClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2420:1: ( rule__RClass__Group__4__Impl rule__RClass__Group__5 )
            // InternalMyDsl.g:2421:2: rule__RClass__Group__4__Impl rule__RClass__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__RClass__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RClass__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__Group__4"


    // $ANTLR start "rule__RClass__Group__4__Impl"
    // InternalMyDsl.g:2428:1: rule__RClass__Group__4__Impl : ( '{' ) ;
    public final void rule__RClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2432:1: ( ( '{' ) )
            // InternalMyDsl.g:2433:1: ( '{' )
            {
            // InternalMyDsl.g:2433:1: ( '{' )
            // InternalMyDsl.g:2434:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRClassAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRClassAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__Group__4__Impl"


    // $ANTLR start "rule__RClass__Group__5"
    // InternalMyDsl.g:2443:1: rule__RClass__Group__5 : rule__RClass__Group__5__Impl rule__RClass__Group__6 ;
    public final void rule__RClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2447:1: ( rule__RClass__Group__5__Impl rule__RClass__Group__6 )
            // InternalMyDsl.g:2448:2: rule__RClass__Group__5__Impl rule__RClass__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__RClass__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RClass__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__Group__5"


    // $ANTLR start "rule__RClass__Group__5__Impl"
    // InternalMyDsl.g:2455:1: rule__RClass__Group__5__Impl : ( ( rule__RClass__AttributesAssignment_5 )* ) ;
    public final void rule__RClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2459:1: ( ( ( rule__RClass__AttributesAssignment_5 )* ) )
            // InternalMyDsl.g:2460:1: ( ( rule__RClass__AttributesAssignment_5 )* )
            {
            // InternalMyDsl.g:2460:1: ( ( rule__RClass__AttributesAssignment_5 )* )
            // InternalMyDsl.g:2461:2: ( rule__RClass__AttributesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRClassAccess().getAttributesAssignment_5()); 
            }
            // InternalMyDsl.g:2462:2: ( rule__RClass__AttributesAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_IDENT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:2462:3: rule__RClass__AttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__RClass__AttributesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRClassAccess().getAttributesAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__Group__5__Impl"


    // $ANTLR start "rule__RClass__Group__6"
    // InternalMyDsl.g:2470:1: rule__RClass__Group__6 : rule__RClass__Group__6__Impl rule__RClass__Group__7 ;
    public final void rule__RClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2474:1: ( rule__RClass__Group__6__Impl rule__RClass__Group__7 )
            // InternalMyDsl.g:2475:2: rule__RClass__Group__6__Impl rule__RClass__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__RClass__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RClass__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__Group__6"


    // $ANTLR start "rule__RClass__Group__6__Impl"
    // InternalMyDsl.g:2482:1: rule__RClass__Group__6__Impl : ( ( rule__RClass__OperationsAssignment_6 )* ) ;
    public final void rule__RClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2486:1: ( ( ( rule__RClass__OperationsAssignment_6 )* ) )
            // InternalMyDsl.g:2487:1: ( ( rule__RClass__OperationsAssignment_6 )* )
            {
            // InternalMyDsl.g:2487:1: ( ( rule__RClass__OperationsAssignment_6 )* )
            // InternalMyDsl.g:2488:2: ( rule__RClass__OperationsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRClassAccess().getOperationsAssignment_6()); 
            }
            // InternalMyDsl.g:2489:2: ( rule__RClass__OperationsAssignment_6 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=15 && LA20_0<=16)||LA20_0==58) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2489:3: rule__RClass__OperationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__RClass__OperationsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRClassAccess().getOperationsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__Group__6__Impl"


    // $ANTLR start "rule__RClass__Group__7"
    // InternalMyDsl.g:2497:1: rule__RClass__Group__7 : rule__RClass__Group__7__Impl ;
    public final void rule__RClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2501:1: ( rule__RClass__Group__7__Impl )
            // InternalMyDsl.g:2502:2: rule__RClass__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RClass__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__Group__7"


    // $ANTLR start "rule__RClass__Group__7__Impl"
    // InternalMyDsl.g:2508:1: rule__RClass__Group__7__Impl : ( '}' ) ;
    public final void rule__RClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2512:1: ( ( '}' ) )
            // InternalMyDsl.g:2513:1: ( '}' )
            {
            // InternalMyDsl.g:2513:1: ( '}' )
            // InternalMyDsl.g:2514:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRClassAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRClassAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__Group__7__Impl"


    // $ANTLR start "rule__ROperation__Group__0"
    // InternalMyDsl.g:2524:1: rule__ROperation__Group__0 : rule__ROperation__Group__0__Impl rule__ROperation__Group__1 ;
    public final void rule__ROperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2528:1: ( rule__ROperation__Group__0__Impl rule__ROperation__Group__1 )
            // InternalMyDsl.g:2529:2: rule__ROperation__Group__0__Impl rule__ROperation__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ROperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ROperation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Group__0"


    // $ANTLR start "rule__ROperation__Group__0__Impl"
    // InternalMyDsl.g:2536:1: rule__ROperation__Group__0__Impl : ( ( rulerTag )* ) ;
    public final void rule__ROperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2540:1: ( ( ( rulerTag )* ) )
            // InternalMyDsl.g:2541:1: ( ( rulerTag )* )
            {
            // InternalMyDsl.g:2541:1: ( ( rulerTag )* )
            // InternalMyDsl.g:2542:2: ( rulerTag )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getROperationAccess().getRTagParserRuleCall_0()); 
            }
            // InternalMyDsl.g:2543:2: ( rulerTag )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==58) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2543:3: rulerTag
            	    {
            	    pushFollow(FOLLOW_23);
            	    rulerTag();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getROperationAccess().getRTagParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Group__0__Impl"


    // $ANTLR start "rule__ROperation__Group__1"
    // InternalMyDsl.g:2551:1: rule__ROperation__Group__1 : rule__ROperation__Group__1__Impl rule__ROperation__Group__2 ;
    public final void rule__ROperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2555:1: ( rule__ROperation__Group__1__Impl rule__ROperation__Group__2 )
            // InternalMyDsl.g:2556:2: rule__ROperation__Group__1__Impl rule__ROperation__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ROperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ROperation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Group__1"


    // $ANTLR start "rule__ROperation__Group__1__Impl"
    // InternalMyDsl.g:2563:1: rule__ROperation__Group__1__Impl : ( ( rule__ROperation__Alternatives_1 ) ) ;
    public final void rule__ROperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2567:1: ( ( ( rule__ROperation__Alternatives_1 ) ) )
            // InternalMyDsl.g:2568:1: ( ( rule__ROperation__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2568:1: ( ( rule__ROperation__Alternatives_1 ) )
            // InternalMyDsl.g:2569:2: ( rule__ROperation__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getROperationAccess().getAlternatives_1()); 
            }
            // InternalMyDsl.g:2570:2: ( rule__ROperation__Alternatives_1 )
            // InternalMyDsl.g:2570:3: rule__ROperation__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ROperation__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getROperationAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Group__1__Impl"


    // $ANTLR start "rule__ROperation__Group__2"
    // InternalMyDsl.g:2578:1: rule__ROperation__Group__2 : rule__ROperation__Group__2__Impl rule__ROperation__Group__3 ;
    public final void rule__ROperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2582:1: ( rule__ROperation__Group__2__Impl rule__ROperation__Group__3 )
            // InternalMyDsl.g:2583:2: rule__ROperation__Group__2__Impl rule__ROperation__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ROperation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ROperation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Group__2"


    // $ANTLR start "rule__ROperation__Group__2__Impl"
    // InternalMyDsl.g:2590:1: rule__ROperation__Group__2__Impl : ( ( rule__ROperation__TypeAssignment_2 ) ) ;
    public final void rule__ROperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2594:1: ( ( ( rule__ROperation__TypeAssignment_2 ) ) )
            // InternalMyDsl.g:2595:1: ( ( rule__ROperation__TypeAssignment_2 ) )
            {
            // InternalMyDsl.g:2595:1: ( ( rule__ROperation__TypeAssignment_2 ) )
            // InternalMyDsl.g:2596:2: ( rule__ROperation__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getROperationAccess().getTypeAssignment_2()); 
            }
            // InternalMyDsl.g:2597:2: ( rule__ROperation__TypeAssignment_2 )
            // InternalMyDsl.g:2597:3: rule__ROperation__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ROperation__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getROperationAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Group__2__Impl"


    // $ANTLR start "rule__ROperation__Group__3"
    // InternalMyDsl.g:2605:1: rule__ROperation__Group__3 : rule__ROperation__Group__3__Impl rule__ROperation__Group__4 ;
    public final void rule__ROperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2609:1: ( rule__ROperation__Group__3__Impl rule__ROperation__Group__4 )
            // InternalMyDsl.g:2610:2: rule__ROperation__Group__3__Impl rule__ROperation__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ROperation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ROperation__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Group__3"


    // $ANTLR start "rule__ROperation__Group__3__Impl"
    // InternalMyDsl.g:2617:1: rule__ROperation__Group__3__Impl : ( ( rule__ROperation__NameAssignment_3 ) ) ;
    public final void rule__ROperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2621:1: ( ( ( rule__ROperation__NameAssignment_3 ) ) )
            // InternalMyDsl.g:2622:1: ( ( rule__ROperation__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:2622:1: ( ( rule__ROperation__NameAssignment_3 ) )
            // InternalMyDsl.g:2623:2: ( rule__ROperation__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getROperationAccess().getNameAssignment_3()); 
            }
            // InternalMyDsl.g:2624:2: ( rule__ROperation__NameAssignment_3 )
            // InternalMyDsl.g:2624:3: rule__ROperation__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ROperation__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getROperationAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Group__3__Impl"


    // $ANTLR start "rule__ROperation__Group__4"
    // InternalMyDsl.g:2632:1: rule__ROperation__Group__4 : rule__ROperation__Group__4__Impl rule__ROperation__Group__5 ;
    public final void rule__ROperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2636:1: ( rule__ROperation__Group__4__Impl rule__ROperation__Group__5 )
            // InternalMyDsl.g:2637:2: rule__ROperation__Group__4__Impl rule__ROperation__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__ROperation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ROperation__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Group__4"


    // $ANTLR start "rule__ROperation__Group__4__Impl"
    // InternalMyDsl.g:2644:1: rule__ROperation__Group__4__Impl : ( '(' ) ;
    public final void rule__ROperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2648:1: ( ( '(' ) )
            // InternalMyDsl.g:2649:1: ( '(' )
            {
            // InternalMyDsl.g:2649:1: ( '(' )
            // InternalMyDsl.g:2650:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getROperationAccess().getLeftParenthesisKeyword_4()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getROperationAccess().getLeftParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Group__4__Impl"


    // $ANTLR start "rule__ROperation__Group__5"
    // InternalMyDsl.g:2659:1: rule__ROperation__Group__5 : rule__ROperation__Group__5__Impl rule__ROperation__Group__6 ;
    public final void rule__ROperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2663:1: ( rule__ROperation__Group__5__Impl rule__ROperation__Group__6 )
            // InternalMyDsl.g:2664:2: rule__ROperation__Group__5__Impl rule__ROperation__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__ROperation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ROperation__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Group__5"


    // $ANTLR start "rule__ROperation__Group__5__Impl"
    // InternalMyDsl.g:2671:1: rule__ROperation__Group__5__Impl : ( ( rule__ROperation__ParamListAssignment_5 )? ) ;
    public final void rule__ROperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2675:1: ( ( ( rule__ROperation__ParamListAssignment_5 )? ) )
            // InternalMyDsl.g:2676:1: ( ( rule__ROperation__ParamListAssignment_5 )? )
            {
            // InternalMyDsl.g:2676:1: ( ( rule__ROperation__ParamListAssignment_5 )? )
            // InternalMyDsl.g:2677:2: ( rule__ROperation__ParamListAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getROperationAccess().getParamListAssignment_5()); 
            }
            // InternalMyDsl.g:2678:2: ( rule__ROperation__ParamListAssignment_5 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_IDENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2678:3: rule__ROperation__ParamListAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ROperation__ParamListAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getROperationAccess().getParamListAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Group__5__Impl"


    // $ANTLR start "rule__ROperation__Group__6"
    // InternalMyDsl.g:2686:1: rule__ROperation__Group__6 : rule__ROperation__Group__6__Impl rule__ROperation__Group__7 ;
    public final void rule__ROperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2690:1: ( rule__ROperation__Group__6__Impl rule__ROperation__Group__7 )
            // InternalMyDsl.g:2691:2: rule__ROperation__Group__6__Impl rule__ROperation__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__ROperation__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ROperation__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Group__6"


    // $ANTLR start "rule__ROperation__Group__6__Impl"
    // InternalMyDsl.g:2698:1: rule__ROperation__Group__6__Impl : ( ')' ) ;
    public final void rule__ROperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2702:1: ( ( ')' ) )
            // InternalMyDsl.g:2703:1: ( ')' )
            {
            // InternalMyDsl.g:2703:1: ( ')' )
            // InternalMyDsl.g:2704:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getROperationAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getROperationAccess().getRightParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Group__6__Impl"


    // $ANTLR start "rule__ROperation__Group__7"
    // InternalMyDsl.g:2713:1: rule__ROperation__Group__7 : rule__ROperation__Group__7__Impl ;
    public final void rule__ROperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2717:1: ( rule__ROperation__Group__7__Impl )
            // InternalMyDsl.g:2718:2: rule__ROperation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ROperation__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Group__7"


    // $ANTLR start "rule__ROperation__Group__7__Impl"
    // InternalMyDsl.g:2724:1: rule__ROperation__Group__7__Impl : ( ( rule__ROperation__BodyAssignment_7 ) ) ;
    public final void rule__ROperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2728:1: ( ( ( rule__ROperation__BodyAssignment_7 ) ) )
            // InternalMyDsl.g:2729:1: ( ( rule__ROperation__BodyAssignment_7 ) )
            {
            // InternalMyDsl.g:2729:1: ( ( rule__ROperation__BodyAssignment_7 ) )
            // InternalMyDsl.g:2730:2: ( rule__ROperation__BodyAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getROperationAccess().getBodyAssignment_7()); 
            }
            // InternalMyDsl.g:2731:2: ( rule__ROperation__BodyAssignment_7 )
            // InternalMyDsl.g:2731:3: rule__ROperation__BodyAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ROperation__BodyAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getROperationAccess().getBodyAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__Group__7__Impl"


    // $ANTLR start "rule__RTag__Group__0"
    // InternalMyDsl.g:2740:1: rule__RTag__Group__0 : rule__RTag__Group__0__Impl rule__RTag__Group__1 ;
    public final void rule__RTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2744:1: ( rule__RTag__Group__0__Impl rule__RTag__Group__1 )
            // InternalMyDsl.g:2745:2: rule__RTag__Group__0__Impl rule__RTag__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RTag__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RTag__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTag__Group__0"


    // $ANTLR start "rule__RTag__Group__0__Impl"
    // InternalMyDsl.g:2752:1: rule__RTag__Group__0__Impl : ( '@' ) ;
    public final void rule__RTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2756:1: ( ( '@' ) )
            // InternalMyDsl.g:2757:1: ( '@' )
            {
            // InternalMyDsl.g:2757:1: ( '@' )
            // InternalMyDsl.g:2758:2: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRTagAccess().getCommercialAtKeyword_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRTagAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTag__Group__0__Impl"


    // $ANTLR start "rule__RTag__Group__1"
    // InternalMyDsl.g:2767:1: rule__RTag__Group__1 : rule__RTag__Group__1__Impl ;
    public final void rule__RTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2771:1: ( rule__RTag__Group__1__Impl )
            // InternalMyDsl.g:2772:2: rule__RTag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RTag__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTag__Group__1"


    // $ANTLR start "rule__RTag__Group__1__Impl"
    // InternalMyDsl.g:2778:1: rule__RTag__Group__1__Impl : ( RULE_IDENT ) ;
    public final void rule__RTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2782:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:2783:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:2783:1: ( RULE_IDENT )
            // InternalMyDsl.g:2784:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRTagAccess().getIdentTerminalRuleCall_1()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRTagAccess().getIdentTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTag__Group__1__Impl"


    // $ANTLR start "rule__RParameters__Group__0"
    // InternalMyDsl.g:2794:1: rule__RParameters__Group__0 : rule__RParameters__Group__0__Impl rule__RParameters__Group__1 ;
    public final void rule__RParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2798:1: ( rule__RParameters__Group__0__Impl rule__RParameters__Group__1 )
            // InternalMyDsl.g:2799:2: rule__RParameters__Group__0__Impl rule__RParameters__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__RParameters__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RParameters__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RParameters__Group__0"


    // $ANTLR start "rule__RParameters__Group__0__Impl"
    // InternalMyDsl.g:2806:1: rule__RParameters__Group__0__Impl : ( ( rule__RParameters__ParamsAssignment_0 ) ) ;
    public final void rule__RParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2810:1: ( ( ( rule__RParameters__ParamsAssignment_0 ) ) )
            // InternalMyDsl.g:2811:1: ( ( rule__RParameters__ParamsAssignment_0 ) )
            {
            // InternalMyDsl.g:2811:1: ( ( rule__RParameters__ParamsAssignment_0 ) )
            // InternalMyDsl.g:2812:2: ( rule__RParameters__ParamsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRParametersAccess().getParamsAssignment_0()); 
            }
            // InternalMyDsl.g:2813:2: ( rule__RParameters__ParamsAssignment_0 )
            // InternalMyDsl.g:2813:3: rule__RParameters__ParamsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RParameters__ParamsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRParametersAccess().getParamsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RParameters__Group__0__Impl"


    // $ANTLR start "rule__RParameters__Group__1"
    // InternalMyDsl.g:2821:1: rule__RParameters__Group__1 : rule__RParameters__Group__1__Impl ;
    public final void rule__RParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2825:1: ( rule__RParameters__Group__1__Impl )
            // InternalMyDsl.g:2826:2: rule__RParameters__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RParameters__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RParameters__Group__1"


    // $ANTLR start "rule__RParameters__Group__1__Impl"
    // InternalMyDsl.g:2832:1: rule__RParameters__Group__1__Impl : ( ( rule__RParameters__Group_1__0 )* ) ;
    public final void rule__RParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2836:1: ( ( ( rule__RParameters__Group_1__0 )* ) )
            // InternalMyDsl.g:2837:1: ( ( rule__RParameters__Group_1__0 )* )
            {
            // InternalMyDsl.g:2837:1: ( ( rule__RParameters__Group_1__0 )* )
            // InternalMyDsl.g:2838:2: ( rule__RParameters__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRParametersAccess().getGroup_1()); 
            }
            // InternalMyDsl.g:2839:2: ( rule__RParameters__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==59) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:2839:3: rule__RParameters__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__RParameters__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRParametersAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RParameters__Group__1__Impl"


    // $ANTLR start "rule__RParameters__Group_1__0"
    // InternalMyDsl.g:2848:1: rule__RParameters__Group_1__0 : rule__RParameters__Group_1__0__Impl rule__RParameters__Group_1__1 ;
    public final void rule__RParameters__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2852:1: ( rule__RParameters__Group_1__0__Impl rule__RParameters__Group_1__1 )
            // InternalMyDsl.g:2853:2: rule__RParameters__Group_1__0__Impl rule__RParameters__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__RParameters__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RParameters__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RParameters__Group_1__0"


    // $ANTLR start "rule__RParameters__Group_1__0__Impl"
    // InternalMyDsl.g:2860:1: rule__RParameters__Group_1__0__Impl : ( ',' ) ;
    public final void rule__RParameters__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2864:1: ( ( ',' ) )
            // InternalMyDsl.g:2865:1: ( ',' )
            {
            // InternalMyDsl.g:2865:1: ( ',' )
            // InternalMyDsl.g:2866:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRParametersAccess().getCommaKeyword_1_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRParametersAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RParameters__Group_1__0__Impl"


    // $ANTLR start "rule__RParameters__Group_1__1"
    // InternalMyDsl.g:2875:1: rule__RParameters__Group_1__1 : rule__RParameters__Group_1__1__Impl ;
    public final void rule__RParameters__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2879:1: ( rule__RParameters__Group_1__1__Impl )
            // InternalMyDsl.g:2880:2: rule__RParameters__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RParameters__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RParameters__Group_1__1"


    // $ANTLR start "rule__RParameters__Group_1__1__Impl"
    // InternalMyDsl.g:2886:1: rule__RParameters__Group_1__1__Impl : ( ( rule__RParameters__ParamsAssignment_1_1 ) ) ;
    public final void rule__RParameters__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2890:1: ( ( ( rule__RParameters__ParamsAssignment_1_1 ) ) )
            // InternalMyDsl.g:2891:1: ( ( rule__RParameters__ParamsAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2891:1: ( ( rule__RParameters__ParamsAssignment_1_1 ) )
            // InternalMyDsl.g:2892:2: ( rule__RParameters__ParamsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRParametersAccess().getParamsAssignment_1_1()); 
            }
            // InternalMyDsl.g:2893:2: ( rule__RParameters__ParamsAssignment_1_1 )
            // InternalMyDsl.g:2893:3: rule__RParameters__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RParameters__ParamsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRParametersAccess().getParamsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RParameters__Group_1__1__Impl"


    // $ANTLR start "rule__RVariable__Group__0"
    // InternalMyDsl.g:2902:1: rule__RVariable__Group__0 : rule__RVariable__Group__0__Impl rule__RVariable__Group__1 ;
    public final void rule__RVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2906:1: ( rule__RVariable__Group__0__Impl rule__RVariable__Group__1 )
            // InternalMyDsl.g:2907:2: rule__RVariable__Group__0__Impl rule__RVariable__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RVariable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVariable__Group__0"


    // $ANTLR start "rule__RVariable__Group__0__Impl"
    // InternalMyDsl.g:2914:1: rule__RVariable__Group__0__Impl : ( ( rule__RVariable__TypeAssignment_0 ) ) ;
    public final void rule__RVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2918:1: ( ( ( rule__RVariable__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:2919:1: ( ( rule__RVariable__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2919:1: ( ( rule__RVariable__TypeAssignment_0 ) )
            // InternalMyDsl.g:2920:2: ( rule__RVariable__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRVariableAccess().getTypeAssignment_0()); 
            }
            // InternalMyDsl.g:2921:2: ( rule__RVariable__TypeAssignment_0 )
            // InternalMyDsl.g:2921:3: rule__RVariable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RVariable__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRVariableAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVariable__Group__0__Impl"


    // $ANTLR start "rule__RVariable__Group__1"
    // InternalMyDsl.g:2929:1: rule__RVariable__Group__1 : rule__RVariable__Group__1__Impl ;
    public final void rule__RVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2933:1: ( rule__RVariable__Group__1__Impl )
            // InternalMyDsl.g:2934:2: rule__RVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVariable__Group__1"


    // $ANTLR start "rule__RVariable__Group__1__Impl"
    // InternalMyDsl.g:2940:1: rule__RVariable__Group__1__Impl : ( ( rule__RVariable__NameAssignment_1 ) ) ;
    public final void rule__RVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2944:1: ( ( ( rule__RVariable__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2945:1: ( ( rule__RVariable__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2945:1: ( ( rule__RVariable__NameAssignment_1 ) )
            // InternalMyDsl.g:2946:2: ( rule__RVariable__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRVariableAccess().getNameAssignment_1()); 
            }
            // InternalMyDsl.g:2947:2: ( rule__RVariable__NameAssignment_1 )
            // InternalMyDsl.g:2947:3: rule__RVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RVariable__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRVariableAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVariable__Group__1__Impl"


    // $ANTLR start "rule__RAttribute__Group__0"
    // InternalMyDsl.g:2956:1: rule__RAttribute__Group__0 : rule__RAttribute__Group__0__Impl rule__RAttribute__Group__1 ;
    public final void rule__RAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2960:1: ( rule__RAttribute__Group__0__Impl rule__RAttribute__Group__1 )
            // InternalMyDsl.g:2961:2: rule__RAttribute__Group__0__Impl rule__RAttribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RAttribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RAttribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAttribute__Group__0"


    // $ANTLR start "rule__RAttribute__Group__0__Impl"
    // InternalMyDsl.g:2968:1: rule__RAttribute__Group__0__Impl : ( ( rule__RAttribute__TypeAssignment_0 ) ) ;
    public final void rule__RAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2972:1: ( ( ( rule__RAttribute__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:2973:1: ( ( rule__RAttribute__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2973:1: ( ( rule__RAttribute__TypeAssignment_0 ) )
            // InternalMyDsl.g:2974:2: ( rule__RAttribute__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRAttributeAccess().getTypeAssignment_0()); 
            }
            // InternalMyDsl.g:2975:2: ( rule__RAttribute__TypeAssignment_0 )
            // InternalMyDsl.g:2975:3: rule__RAttribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RAttribute__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRAttributeAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAttribute__Group__0__Impl"


    // $ANTLR start "rule__RAttribute__Group__1"
    // InternalMyDsl.g:2983:1: rule__RAttribute__Group__1 : rule__RAttribute__Group__1__Impl rule__RAttribute__Group__2 ;
    public final void rule__RAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2987:1: ( rule__RAttribute__Group__1__Impl rule__RAttribute__Group__2 )
            // InternalMyDsl.g:2988:2: rule__RAttribute__Group__1__Impl rule__RAttribute__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__RAttribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RAttribute__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAttribute__Group__1"


    // $ANTLR start "rule__RAttribute__Group__1__Impl"
    // InternalMyDsl.g:2995:1: rule__RAttribute__Group__1__Impl : ( ( rule__RAttribute__NameAssignment_1 ) ) ;
    public final void rule__RAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2999:1: ( ( ( rule__RAttribute__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3000:1: ( ( rule__RAttribute__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3000:1: ( ( rule__RAttribute__NameAssignment_1 ) )
            // InternalMyDsl.g:3001:2: ( rule__RAttribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRAttributeAccess().getNameAssignment_1()); 
            }
            // InternalMyDsl.g:3002:2: ( rule__RAttribute__NameAssignment_1 )
            // InternalMyDsl.g:3002:3: rule__RAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RAttribute__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRAttributeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAttribute__Group__1__Impl"


    // $ANTLR start "rule__RAttribute__Group__2"
    // InternalMyDsl.g:3010:1: rule__RAttribute__Group__2 : rule__RAttribute__Group__2__Impl rule__RAttribute__Group__3 ;
    public final void rule__RAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3014:1: ( rule__RAttribute__Group__2__Impl rule__RAttribute__Group__3 )
            // InternalMyDsl.g:3015:2: rule__RAttribute__Group__2__Impl rule__RAttribute__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__RAttribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RAttribute__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAttribute__Group__2"


    // $ANTLR start "rule__RAttribute__Group__2__Impl"
    // InternalMyDsl.g:3022:1: rule__RAttribute__Group__2__Impl : ( ( rule__RAttribute__Group_2__0 )? ) ;
    public final void rule__RAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3026:1: ( ( ( rule__RAttribute__Group_2__0 )? ) )
            // InternalMyDsl.g:3027:1: ( ( rule__RAttribute__Group_2__0 )? )
            {
            // InternalMyDsl.g:3027:1: ( ( rule__RAttribute__Group_2__0 )? )
            // InternalMyDsl.g:3028:2: ( rule__RAttribute__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRAttributeAccess().getGroup_2()); 
            }
            // InternalMyDsl.g:3029:2: ( rule__RAttribute__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==60) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:3029:3: rule__RAttribute__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RAttribute__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRAttributeAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAttribute__Group__2__Impl"


    // $ANTLR start "rule__RAttribute__Group__3"
    // InternalMyDsl.g:3037:1: rule__RAttribute__Group__3 : rule__RAttribute__Group__3__Impl ;
    public final void rule__RAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3041:1: ( rule__RAttribute__Group__3__Impl )
            // InternalMyDsl.g:3042:2: rule__RAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RAttribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAttribute__Group__3"


    // $ANTLR start "rule__RAttribute__Group__3__Impl"
    // InternalMyDsl.g:3048:1: rule__RAttribute__Group__3__Impl : ( ';' ) ;
    public final void rule__RAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3052:1: ( ( ';' ) )
            // InternalMyDsl.g:3053:1: ( ';' )
            {
            // InternalMyDsl.g:3053:1: ( ';' )
            // InternalMyDsl.g:3054:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRAttributeAccess().getSemicolonKeyword_3()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRAttributeAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAttribute__Group__3__Impl"


    // $ANTLR start "rule__RAttribute__Group_2__0"
    // InternalMyDsl.g:3064:1: rule__RAttribute__Group_2__0 : rule__RAttribute__Group_2__0__Impl rule__RAttribute__Group_2__1 ;
    public final void rule__RAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3068:1: ( rule__RAttribute__Group_2__0__Impl rule__RAttribute__Group_2__1 )
            // InternalMyDsl.g:3069:2: rule__RAttribute__Group_2__0__Impl rule__RAttribute__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__RAttribute__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RAttribute__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAttribute__Group_2__0"


    // $ANTLR start "rule__RAttribute__Group_2__0__Impl"
    // InternalMyDsl.g:3076:1: rule__RAttribute__Group_2__0__Impl : ( ':=' ) ;
    public final void rule__RAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3080:1: ( ( ':=' ) )
            // InternalMyDsl.g:3081:1: ( ':=' )
            {
            // InternalMyDsl.g:3081:1: ( ':=' )
            // InternalMyDsl.g:3082:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRAttributeAccess().getColonEqualsSignKeyword_2_0()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRAttributeAccess().getColonEqualsSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAttribute__Group_2__0__Impl"


    // $ANTLR start "rule__RAttribute__Group_2__1"
    // InternalMyDsl.g:3091:1: rule__RAttribute__Group_2__1 : rule__RAttribute__Group_2__1__Impl ;
    public final void rule__RAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3095:1: ( rule__RAttribute__Group_2__1__Impl )
            // InternalMyDsl.g:3096:2: rule__RAttribute__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RAttribute__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAttribute__Group_2__1"


    // $ANTLR start "rule__RAttribute__Group_2__1__Impl"
    // InternalMyDsl.g:3102:1: rule__RAttribute__Group_2__1__Impl : ( ruleexpression ) ;
    public final void rule__RAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3106:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:3107:1: ( ruleexpression )
            {
            // InternalMyDsl.g:3107:1: ( ruleexpression )
            // InternalMyDsl.g:3108:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRAttributeAccess().getExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRAttributeAccess().getExpressionParserRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAttribute__Group_2__1__Impl"


    // $ANTLR start "rule__RVarDecl__Group__0"
    // InternalMyDsl.g:3118:1: rule__RVarDecl__Group__0 : rule__RVarDecl__Group__0__Impl rule__RVarDecl__Group__1 ;
    public final void rule__RVarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3122:1: ( rule__RVarDecl__Group__0__Impl rule__RVarDecl__Group__1 )
            // InternalMyDsl.g:3123:2: rule__RVarDecl__Group__0__Impl rule__RVarDecl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RVarDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RVarDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVarDecl__Group__0"


    // $ANTLR start "rule__RVarDecl__Group__0__Impl"
    // InternalMyDsl.g:3130:1: rule__RVarDecl__Group__0__Impl : ( RULE_IDENT ) ;
    public final void rule__RVarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3134:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:3135:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:3135:1: ( RULE_IDENT )
            // InternalMyDsl.g:3136:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRVarDeclAccess().getIdentTerminalRuleCall_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRVarDeclAccess().getIdentTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVarDecl__Group__0__Impl"


    // $ANTLR start "rule__RVarDecl__Group__1"
    // InternalMyDsl.g:3145:1: rule__RVarDecl__Group__1 : rule__RVarDecl__Group__1__Impl rule__RVarDecl__Group__2 ;
    public final void rule__RVarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3149:1: ( rule__RVarDecl__Group__1__Impl rule__RVarDecl__Group__2 )
            // InternalMyDsl.g:3150:2: rule__RVarDecl__Group__1__Impl rule__RVarDecl__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__RVarDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RVarDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVarDecl__Group__1"


    // $ANTLR start "rule__RVarDecl__Group__1__Impl"
    // InternalMyDsl.g:3157:1: rule__RVarDecl__Group__1__Impl : ( RULE_IDENT ) ;
    public final void rule__RVarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3161:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:3162:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:3162:1: ( RULE_IDENT )
            // InternalMyDsl.g:3163:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRVarDeclAccess().getIdentTerminalRuleCall_1()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRVarDeclAccess().getIdentTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVarDecl__Group__1__Impl"


    // $ANTLR start "rule__RVarDecl__Group__2"
    // InternalMyDsl.g:3172:1: rule__RVarDecl__Group__2 : rule__RVarDecl__Group__2__Impl rule__RVarDecl__Group__3 ;
    public final void rule__RVarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3176:1: ( rule__RVarDecl__Group__2__Impl rule__RVarDecl__Group__3 )
            // InternalMyDsl.g:3177:2: rule__RVarDecl__Group__2__Impl rule__RVarDecl__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__RVarDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RVarDecl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVarDecl__Group__2"


    // $ANTLR start "rule__RVarDecl__Group__2__Impl"
    // InternalMyDsl.g:3184:1: rule__RVarDecl__Group__2__Impl : ( ( rule__RVarDecl__Group_2__0 )? ) ;
    public final void rule__RVarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3188:1: ( ( ( rule__RVarDecl__Group_2__0 )? ) )
            // InternalMyDsl.g:3189:1: ( ( rule__RVarDecl__Group_2__0 )? )
            {
            // InternalMyDsl.g:3189:1: ( ( rule__RVarDecl__Group_2__0 )? )
            // InternalMyDsl.g:3190:2: ( rule__RVarDecl__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRVarDeclAccess().getGroup_2()); 
            }
            // InternalMyDsl.g:3191:2: ( rule__RVarDecl__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==60) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:3191:3: rule__RVarDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RVarDecl__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRVarDeclAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVarDecl__Group__2__Impl"


    // $ANTLR start "rule__RVarDecl__Group__3"
    // InternalMyDsl.g:3199:1: rule__RVarDecl__Group__3 : rule__RVarDecl__Group__3__Impl ;
    public final void rule__RVarDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3203:1: ( rule__RVarDecl__Group__3__Impl )
            // InternalMyDsl.g:3204:2: rule__RVarDecl__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RVarDecl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVarDecl__Group__3"


    // $ANTLR start "rule__RVarDecl__Group__3__Impl"
    // InternalMyDsl.g:3210:1: rule__RVarDecl__Group__3__Impl : ( ';' ) ;
    public final void rule__RVarDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3214:1: ( ( ';' ) )
            // InternalMyDsl.g:3215:1: ( ';' )
            {
            // InternalMyDsl.g:3215:1: ( ';' )
            // InternalMyDsl.g:3216:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRVarDeclAccess().getSemicolonKeyword_3()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRVarDeclAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVarDecl__Group__3__Impl"


    // $ANTLR start "rule__RVarDecl__Group_2__0"
    // InternalMyDsl.g:3226:1: rule__RVarDecl__Group_2__0 : rule__RVarDecl__Group_2__0__Impl rule__RVarDecl__Group_2__1 ;
    public final void rule__RVarDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3230:1: ( rule__RVarDecl__Group_2__0__Impl rule__RVarDecl__Group_2__1 )
            // InternalMyDsl.g:3231:2: rule__RVarDecl__Group_2__0__Impl rule__RVarDecl__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__RVarDecl__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RVarDecl__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVarDecl__Group_2__0"


    // $ANTLR start "rule__RVarDecl__Group_2__0__Impl"
    // InternalMyDsl.g:3238:1: rule__RVarDecl__Group_2__0__Impl : ( ':=' ) ;
    public final void rule__RVarDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3242:1: ( ( ':=' ) )
            // InternalMyDsl.g:3243:1: ( ':=' )
            {
            // InternalMyDsl.g:3243:1: ( ':=' )
            // InternalMyDsl.g:3244:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRVarDeclAccess().getColonEqualsSignKeyword_2_0()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRVarDeclAccess().getColonEqualsSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVarDecl__Group_2__0__Impl"


    // $ANTLR start "rule__RVarDecl__Group_2__1"
    // InternalMyDsl.g:3253:1: rule__RVarDecl__Group_2__1 : rule__RVarDecl__Group_2__1__Impl ;
    public final void rule__RVarDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3257:1: ( rule__RVarDecl__Group_2__1__Impl )
            // InternalMyDsl.g:3258:2: rule__RVarDecl__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RVarDecl__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVarDecl__Group_2__1"


    // $ANTLR start "rule__RVarDecl__Group_2__1__Impl"
    // InternalMyDsl.g:3264:1: rule__RVarDecl__Group_2__1__Impl : ( ruleexpression ) ;
    public final void rule__RVarDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3268:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:3269:1: ( ruleexpression )
            {
            // InternalMyDsl.g:3269:1: ( ruleexpression )
            // InternalMyDsl.g:3270:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRVarDeclAccess().getExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRVarDeclAccess().getExpressionParserRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVarDecl__Group_2__1__Impl"


    // $ANTLR start "rule__RAssign__Group__0"
    // InternalMyDsl.g:3280:1: rule__RAssign__Group__0 : rule__RAssign__Group__0__Impl rule__RAssign__Group__1 ;
    public final void rule__RAssign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3284:1: ( rule__RAssign__Group__0__Impl rule__RAssign__Group__1 )
            // InternalMyDsl.g:3285:2: rule__RAssign__Group__0__Impl rule__RAssign__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__RAssign__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RAssign__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAssign__Group__0"


    // $ANTLR start "rule__RAssign__Group__0__Impl"
    // InternalMyDsl.g:3292:1: rule__RAssign__Group__0__Impl : ( ruleexpression ) ;
    public final void rule__RAssign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3296:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:3297:1: ( ruleexpression )
            {
            // InternalMyDsl.g:3297:1: ( ruleexpression )
            // InternalMyDsl.g:3298:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRAssignAccess().getExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRAssignAccess().getExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAssign__Group__0__Impl"


    // $ANTLR start "rule__RAssign__Group__1"
    // InternalMyDsl.g:3307:1: rule__RAssign__Group__1 : rule__RAssign__Group__1__Impl rule__RAssign__Group__2 ;
    public final void rule__RAssign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3311:1: ( rule__RAssign__Group__1__Impl rule__RAssign__Group__2 )
            // InternalMyDsl.g:3312:2: rule__RAssign__Group__1__Impl rule__RAssign__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__RAssign__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RAssign__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAssign__Group__1"


    // $ANTLR start "rule__RAssign__Group__1__Impl"
    // InternalMyDsl.g:3319:1: rule__RAssign__Group__1__Impl : ( ':=' ) ;
    public final void rule__RAssign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3323:1: ( ( ':=' ) )
            // InternalMyDsl.g:3324:1: ( ':=' )
            {
            // InternalMyDsl.g:3324:1: ( ':=' )
            // InternalMyDsl.g:3325:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRAssignAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRAssignAccess().getColonEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAssign__Group__1__Impl"


    // $ANTLR start "rule__RAssign__Group__2"
    // InternalMyDsl.g:3334:1: rule__RAssign__Group__2 : rule__RAssign__Group__2__Impl rule__RAssign__Group__3 ;
    public final void rule__RAssign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3338:1: ( rule__RAssign__Group__2__Impl rule__RAssign__Group__3 )
            // InternalMyDsl.g:3339:2: rule__RAssign__Group__2__Impl rule__RAssign__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RAssign__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RAssign__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAssign__Group__2"


    // $ANTLR start "rule__RAssign__Group__2__Impl"
    // InternalMyDsl.g:3346:1: rule__RAssign__Group__2__Impl : ( ruleexpression ) ;
    public final void rule__RAssign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3350:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:3351:1: ( ruleexpression )
            {
            // InternalMyDsl.g:3351:1: ( ruleexpression )
            // InternalMyDsl.g:3352:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRAssignAccess().getExpressionParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRAssignAccess().getExpressionParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAssign__Group__2__Impl"


    // $ANTLR start "rule__RAssign__Group__3"
    // InternalMyDsl.g:3361:1: rule__RAssign__Group__3 : rule__RAssign__Group__3__Impl ;
    public final void rule__RAssign__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3365:1: ( rule__RAssign__Group__3__Impl )
            // InternalMyDsl.g:3366:2: rule__RAssign__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RAssign__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAssign__Group__3"


    // $ANTLR start "rule__RAssign__Group__3__Impl"
    // InternalMyDsl.g:3372:1: rule__RAssign__Group__3__Impl : ( ';' ) ;
    public final void rule__RAssign__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3376:1: ( ( ';' ) )
            // InternalMyDsl.g:3377:1: ( ';' )
            {
            // InternalMyDsl.g:3377:1: ( ';' )
            // InternalMyDsl.g:3378:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRAssignAccess().getSemicolonKeyword_3()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRAssignAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAssign__Group__3__Impl"


    // $ANTLR start "rule__RForEach__Group__0"
    // InternalMyDsl.g:3388:1: rule__RForEach__Group__0 : rule__RForEach__Group__0__Impl rule__RForEach__Group__1 ;
    public final void rule__RForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3392:1: ( rule__RForEach__Group__0__Impl rule__RForEach__Group__1 )
            // InternalMyDsl.g:3393:2: rule__RForEach__Group__0__Impl rule__RForEach__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__RForEach__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RForEach__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RForEach__Group__0"


    // $ANTLR start "rule__RForEach__Group__0__Impl"
    // InternalMyDsl.g:3400:1: rule__RForEach__Group__0__Impl : ( 'for' ) ;
    public final void rule__RForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3404:1: ( ( 'for' ) )
            // InternalMyDsl.g:3405:1: ( 'for' )
            {
            // InternalMyDsl.g:3405:1: ( 'for' )
            // InternalMyDsl.g:3406:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRForEachAccess().getForKeyword_0()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRForEachAccess().getForKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RForEach__Group__0__Impl"


    // $ANTLR start "rule__RForEach__Group__1"
    // InternalMyDsl.g:3415:1: rule__RForEach__Group__1 : rule__RForEach__Group__1__Impl rule__RForEach__Group__2 ;
    public final void rule__RForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3419:1: ( rule__RForEach__Group__1__Impl rule__RForEach__Group__2 )
            // InternalMyDsl.g:3420:2: rule__RForEach__Group__1__Impl rule__RForEach__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RForEach__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RForEach__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RForEach__Group__1"


    // $ANTLR start "rule__RForEach__Group__1__Impl"
    // InternalMyDsl.g:3427:1: rule__RForEach__Group__1__Impl : ( '(' ) ;
    public final void rule__RForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3431:1: ( ( '(' ) )
            // InternalMyDsl.g:3432:1: ( '(' )
            {
            // InternalMyDsl.g:3432:1: ( '(' )
            // InternalMyDsl.g:3433:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRForEachAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRForEachAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RForEach__Group__1__Impl"


    // $ANTLR start "rule__RForEach__Group__2"
    // InternalMyDsl.g:3442:1: rule__RForEach__Group__2 : rule__RForEach__Group__2__Impl rule__RForEach__Group__3 ;
    public final void rule__RForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3446:1: ( rule__RForEach__Group__2__Impl rule__RForEach__Group__3 )
            // InternalMyDsl.g:3447:2: rule__RForEach__Group__2__Impl rule__RForEach__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__RForEach__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RForEach__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RForEach__Group__2"


    // $ANTLR start "rule__RForEach__Group__2__Impl"
    // InternalMyDsl.g:3454:1: rule__RForEach__Group__2__Impl : ( RULE_IDENT ) ;
    public final void rule__RForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3458:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:3459:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:3459:1: ( RULE_IDENT )
            // InternalMyDsl.g:3460:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRForEachAccess().getIdentTerminalRuleCall_2()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRForEachAccess().getIdentTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RForEach__Group__2__Impl"


    // $ANTLR start "rule__RForEach__Group__3"
    // InternalMyDsl.g:3469:1: rule__RForEach__Group__3 : rule__RForEach__Group__3__Impl rule__RForEach__Group__4 ;
    public final void rule__RForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3473:1: ( rule__RForEach__Group__3__Impl rule__RForEach__Group__4 )
            // InternalMyDsl.g:3474:2: rule__RForEach__Group__3__Impl rule__RForEach__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__RForEach__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RForEach__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RForEach__Group__3"


    // $ANTLR start "rule__RForEach__Group__3__Impl"
    // InternalMyDsl.g:3481:1: rule__RForEach__Group__3__Impl : ( 'in' ) ;
    public final void rule__RForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3485:1: ( ( 'in' ) )
            // InternalMyDsl.g:3486:1: ( 'in' )
            {
            // InternalMyDsl.g:3486:1: ( 'in' )
            // InternalMyDsl.g:3487:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRForEachAccess().getInKeyword_3()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRForEachAccess().getInKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RForEach__Group__3__Impl"


    // $ANTLR start "rule__RForEach__Group__4"
    // InternalMyDsl.g:3496:1: rule__RForEach__Group__4 : rule__RForEach__Group__4__Impl rule__RForEach__Group__5 ;
    public final void rule__RForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3500:1: ( rule__RForEach__Group__4__Impl rule__RForEach__Group__5 )
            // InternalMyDsl.g:3501:2: rule__RForEach__Group__4__Impl rule__RForEach__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__RForEach__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RForEach__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RForEach__Group__4"


    // $ANTLR start "rule__RForEach__Group__4__Impl"
    // InternalMyDsl.g:3508:1: rule__RForEach__Group__4__Impl : ( rulerCollection ) ;
    public final void rule__RForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3512:1: ( ( rulerCollection ) )
            // InternalMyDsl.g:3513:1: ( rulerCollection )
            {
            // InternalMyDsl.g:3513:1: ( rulerCollection )
            // InternalMyDsl.g:3514:2: rulerCollection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRForEachAccess().getRCollectionParserRuleCall_4()); 
            }
            pushFollow(FOLLOW_2);
            rulerCollection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRForEachAccess().getRCollectionParserRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RForEach__Group__4__Impl"


    // $ANTLR start "rule__RForEach__Group__5"
    // InternalMyDsl.g:3523:1: rule__RForEach__Group__5 : rule__RForEach__Group__5__Impl rule__RForEach__Group__6 ;
    public final void rule__RForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3527:1: ( rule__RForEach__Group__5__Impl rule__RForEach__Group__6 )
            // InternalMyDsl.g:3528:2: rule__RForEach__Group__5__Impl rule__RForEach__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__RForEach__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RForEach__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RForEach__Group__5"


    // $ANTLR start "rule__RForEach__Group__5__Impl"
    // InternalMyDsl.g:3535:1: rule__RForEach__Group__5__Impl : ( ')' ) ;
    public final void rule__RForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3539:1: ( ( ')' ) )
            // InternalMyDsl.g:3540:1: ( ')' )
            {
            // InternalMyDsl.g:3540:1: ( ')' )
            // InternalMyDsl.g:3541:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRForEachAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRForEachAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RForEach__Group__5__Impl"


    // $ANTLR start "rule__RForEach__Group__6"
    // InternalMyDsl.g:3550:1: rule__RForEach__Group__6 : rule__RForEach__Group__6__Impl ;
    public final void rule__RForEach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3554:1: ( rule__RForEach__Group__6__Impl )
            // InternalMyDsl.g:3555:2: rule__RForEach__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RForEach__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RForEach__Group__6"


    // $ANTLR start "rule__RForEach__Group__6__Impl"
    // InternalMyDsl.g:3561:1: rule__RForEach__Group__6__Impl : ( rulerBlock ) ;
    public final void rule__RForEach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3565:1: ( ( rulerBlock ) )
            // InternalMyDsl.g:3566:1: ( rulerBlock )
            {
            // InternalMyDsl.g:3566:1: ( rulerBlock )
            // InternalMyDsl.g:3567:2: rulerBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRForEachAccess().getRBlockParserRuleCall_6()); 
            }
            pushFollow(FOLLOW_2);
            rulerBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRForEachAccess().getRBlockParserRuleCall_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RForEach__Group__6__Impl"


    // $ANTLR start "rule__RCollection__Group_0__0"
    // InternalMyDsl.g:3577:1: rule__RCollection__Group_0__0 : rule__RCollection__Group_0__0__Impl rule__RCollection__Group_0__1 ;
    public final void rule__RCollection__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3581:1: ( rule__RCollection__Group_0__0__Impl rule__RCollection__Group_0__1 )
            // InternalMyDsl.g:3582:2: rule__RCollection__Group_0__0__Impl rule__RCollection__Group_0__1
            {
            pushFollow(FOLLOW_32);
            rule__RCollection__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RCollection__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RCollection__Group_0__0"


    // $ANTLR start "rule__RCollection__Group_0__0__Impl"
    // InternalMyDsl.g:3589:1: rule__RCollection__Group_0__0__Impl : ( '[' ) ;
    public final void rule__RCollection__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3593:1: ( ( '[' ) )
            // InternalMyDsl.g:3594:1: ( '[' )
            {
            // InternalMyDsl.g:3594:1: ( '[' )
            // InternalMyDsl.g:3595:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRCollectionAccess().getLeftSquareBracketKeyword_0_0()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRCollectionAccess().getLeftSquareBracketKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RCollection__Group_0__0__Impl"


    // $ANTLR start "rule__RCollection__Group_0__1"
    // InternalMyDsl.g:3604:1: rule__RCollection__Group_0__1 : rule__RCollection__Group_0__1__Impl rule__RCollection__Group_0__2 ;
    public final void rule__RCollection__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3608:1: ( rule__RCollection__Group_0__1__Impl rule__RCollection__Group_0__2 )
            // InternalMyDsl.g:3609:2: rule__RCollection__Group_0__1__Impl rule__RCollection__Group_0__2
            {
            pushFollow(FOLLOW_33);
            rule__RCollection__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RCollection__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RCollection__Group_0__1"


    // $ANTLR start "rule__RCollection__Group_0__1__Impl"
    // InternalMyDsl.g:3616:1: rule__RCollection__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__RCollection__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3620:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3621:1: ( RULE_INT )
            {
            // InternalMyDsl.g:3621:1: ( RULE_INT )
            // InternalMyDsl.g:3622:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRCollectionAccess().getINTTerminalRuleCall_0_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRCollectionAccess().getINTTerminalRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RCollection__Group_0__1__Impl"


    // $ANTLR start "rule__RCollection__Group_0__2"
    // InternalMyDsl.g:3631:1: rule__RCollection__Group_0__2 : rule__RCollection__Group_0__2__Impl rule__RCollection__Group_0__3 ;
    public final void rule__RCollection__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3635:1: ( rule__RCollection__Group_0__2__Impl rule__RCollection__Group_0__3 )
            // InternalMyDsl.g:3636:2: rule__RCollection__Group_0__2__Impl rule__RCollection__Group_0__3
            {
            pushFollow(FOLLOW_32);
            rule__RCollection__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RCollection__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RCollection__Group_0__2"


    // $ANTLR start "rule__RCollection__Group_0__2__Impl"
    // InternalMyDsl.g:3643:1: rule__RCollection__Group_0__2__Impl : ( '..' ) ;
    public final void rule__RCollection__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3647:1: ( ( '..' ) )
            // InternalMyDsl.g:3648:1: ( '..' )
            {
            // InternalMyDsl.g:3648:1: ( '..' )
            // InternalMyDsl.g:3649:2: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRCollectionAccess().getFullStopFullStopKeyword_0_2()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRCollectionAccess().getFullStopFullStopKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RCollection__Group_0__2__Impl"


    // $ANTLR start "rule__RCollection__Group_0__3"
    // InternalMyDsl.g:3658:1: rule__RCollection__Group_0__3 : rule__RCollection__Group_0__3__Impl rule__RCollection__Group_0__4 ;
    public final void rule__RCollection__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3662:1: ( rule__RCollection__Group_0__3__Impl rule__RCollection__Group_0__4 )
            // InternalMyDsl.g:3663:2: rule__RCollection__Group_0__3__Impl rule__RCollection__Group_0__4
            {
            pushFollow(FOLLOW_34);
            rule__RCollection__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RCollection__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RCollection__Group_0__3"


    // $ANTLR start "rule__RCollection__Group_0__3__Impl"
    // InternalMyDsl.g:3670:1: rule__RCollection__Group_0__3__Impl : ( RULE_INT ) ;
    public final void rule__RCollection__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3674:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3675:1: ( RULE_INT )
            {
            // InternalMyDsl.g:3675:1: ( RULE_INT )
            // InternalMyDsl.g:3676:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRCollectionAccess().getINTTerminalRuleCall_0_3()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRCollectionAccess().getINTTerminalRuleCall_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RCollection__Group_0__3__Impl"


    // $ANTLR start "rule__RCollection__Group_0__4"
    // InternalMyDsl.g:3685:1: rule__RCollection__Group_0__4 : rule__RCollection__Group_0__4__Impl ;
    public final void rule__RCollection__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3689:1: ( rule__RCollection__Group_0__4__Impl )
            // InternalMyDsl.g:3690:2: rule__RCollection__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RCollection__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RCollection__Group_0__4"


    // $ANTLR start "rule__RCollection__Group_0__4__Impl"
    // InternalMyDsl.g:3696:1: rule__RCollection__Group_0__4__Impl : ( ']' ) ;
    public final void rule__RCollection__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3700:1: ( ( ']' ) )
            // InternalMyDsl.g:3701:1: ( ']' )
            {
            // InternalMyDsl.g:3701:1: ( ']' )
            // InternalMyDsl.g:3702:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRCollectionAccess().getRightSquareBracketKeyword_0_4()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRCollectionAccess().getRightSquareBracketKeyword_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RCollection__Group_0__4__Impl"


    // $ANTLR start "rule__RBlock__Group__0"
    // InternalMyDsl.g:3712:1: rule__RBlock__Group__0 : rule__RBlock__Group__0__Impl rule__RBlock__Group__1 ;
    public final void rule__RBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3716:1: ( rule__RBlock__Group__0__Impl rule__RBlock__Group__1 )
            // InternalMyDsl.g:3717:2: rule__RBlock__Group__0__Impl rule__RBlock__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__RBlock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RBlock__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBlock__Group__0"


    // $ANTLR start "rule__RBlock__Group__0__Impl"
    // InternalMyDsl.g:3724:1: rule__RBlock__Group__0__Impl : ( '{' ) ;
    public final void rule__RBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3728:1: ( ( '{' ) )
            // InternalMyDsl.g:3729:1: ( '{' )
            {
            // InternalMyDsl.g:3729:1: ( '{' )
            // InternalMyDsl.g:3730:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRBlockAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRBlockAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBlock__Group__0__Impl"


    // $ANTLR start "rule__RBlock__Group__1"
    // InternalMyDsl.g:3739:1: rule__RBlock__Group__1 : rule__RBlock__Group__1__Impl rule__RBlock__Group__2 ;
    public final void rule__RBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3743:1: ( rule__RBlock__Group__1__Impl rule__RBlock__Group__2 )
            // InternalMyDsl.g:3744:2: rule__RBlock__Group__1__Impl rule__RBlock__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__RBlock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RBlock__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBlock__Group__1"


    // $ANTLR start "rule__RBlock__Group__1__Impl"
    // InternalMyDsl.g:3751:1: rule__RBlock__Group__1__Impl : ( ( rule__RBlock__Group_1__0 )? ) ;
    public final void rule__RBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3755:1: ( ( ( rule__RBlock__Group_1__0 )? ) )
            // InternalMyDsl.g:3756:1: ( ( rule__RBlock__Group_1__0 )? )
            {
            // InternalMyDsl.g:3756:1: ( ( rule__RBlock__Group_1__0 )? )
            // InternalMyDsl.g:3757:2: ( rule__RBlock__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRBlockAccess().getGroup_1()); 
            }
            // InternalMyDsl.g:3758:2: ( rule__RBlock__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_IDENT && LA26_0<=RULE_REAL)||LA26_0==18||(LA26_0>=37 && LA26_0<=43)||LA26_0==51||LA26_0==56||LA26_0==61||LA26_0==66||LA26_0==68||LA26_0==74||LA26_0==77||(LA26_0>=80 && LA26_0<=81)||(LA26_0>=83 && LA26_0<=84)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:3758:3: rule__RBlock__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RBlock__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRBlockAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBlock__Group__1__Impl"


    // $ANTLR start "rule__RBlock__Group__2"
    // InternalMyDsl.g:3766:1: rule__RBlock__Group__2 : rule__RBlock__Group__2__Impl ;
    public final void rule__RBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3770:1: ( rule__RBlock__Group__2__Impl )
            // InternalMyDsl.g:3771:2: rule__RBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RBlock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBlock__Group__2"


    // $ANTLR start "rule__RBlock__Group__2__Impl"
    // InternalMyDsl.g:3777:1: rule__RBlock__Group__2__Impl : ( '}' ) ;
    public final void rule__RBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3781:1: ( ( '}' ) )
            // InternalMyDsl.g:3782:1: ( '}' )
            {
            // InternalMyDsl.g:3782:1: ( '}' )
            // InternalMyDsl.g:3783:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRBlockAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRBlockAccess().getRightCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBlock__Group__2__Impl"


    // $ANTLR start "rule__RBlock__Group_1__0"
    // InternalMyDsl.g:3793:1: rule__RBlock__Group_1__0 : rule__RBlock__Group_1__0__Impl rule__RBlock__Group_1__1 ;
    public final void rule__RBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3797:1: ( rule__RBlock__Group_1__0__Impl rule__RBlock__Group_1__1 )
            // InternalMyDsl.g:3798:2: rule__RBlock__Group_1__0__Impl rule__RBlock__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__RBlock__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RBlock__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBlock__Group_1__0"


    // $ANTLR start "rule__RBlock__Group_1__0__Impl"
    // InternalMyDsl.g:3805:1: rule__RBlock__Group_1__0__Impl : ( rulerStatement ) ;
    public final void rule__RBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3809:1: ( ( rulerStatement ) )
            // InternalMyDsl.g:3810:1: ( rulerStatement )
            {
            // InternalMyDsl.g:3810:1: ( rulerStatement )
            // InternalMyDsl.g:3811:2: rulerStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRBlockAccess().getRStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRBlockAccess().getRStatementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBlock__Group_1__0__Impl"


    // $ANTLR start "rule__RBlock__Group_1__1"
    // InternalMyDsl.g:3820:1: rule__RBlock__Group_1__1 : rule__RBlock__Group_1__1__Impl ;
    public final void rule__RBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3824:1: ( rule__RBlock__Group_1__1__Impl )
            // InternalMyDsl.g:3825:2: rule__RBlock__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RBlock__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBlock__Group_1__1"


    // $ANTLR start "rule__RBlock__Group_1__1__Impl"
    // InternalMyDsl.g:3831:1: rule__RBlock__Group_1__1__Impl : ( ( rulerStatement )* ) ;
    public final void rule__RBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3835:1: ( ( ( rulerStatement )* ) )
            // InternalMyDsl.g:3836:1: ( ( rulerStatement )* )
            {
            // InternalMyDsl.g:3836:1: ( ( rulerStatement )* )
            // InternalMyDsl.g:3837:2: ( rulerStatement )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRBlockAccess().getRStatementParserRuleCall_1_1()); 
            }
            // InternalMyDsl.g:3838:2: ( rulerStatement )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_IDENT && LA27_0<=RULE_REAL)||LA27_0==18||(LA27_0>=37 && LA27_0<=43)||LA27_0==51||LA27_0==56||LA27_0==61||LA27_0==66||LA27_0==68||LA27_0==74||LA27_0==77||(LA27_0>=80 && LA27_0<=81)||(LA27_0>=83 && LA27_0<=84)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:3838:3: rulerStatement
            	    {
            	    pushFollow(FOLLOW_37);
            	    rulerStatement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRBlockAccess().getRStatementParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBlock__Group_1__1__Impl"


    // $ANTLR start "rule__RIf__Group__0"
    // InternalMyDsl.g:3847:1: rule__RIf__Group__0 : rule__RIf__Group__0__Impl rule__RIf__Group__1 ;
    public final void rule__RIf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3851:1: ( rule__RIf__Group__0__Impl rule__RIf__Group__1 )
            // InternalMyDsl.g:3852:2: rule__RIf__Group__0__Impl rule__RIf__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__RIf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RIf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIf__Group__0"


    // $ANTLR start "rule__RIf__Group__0__Impl"
    // InternalMyDsl.g:3859:1: rule__RIf__Group__0__Impl : ( 'if' ) ;
    public final void rule__RIf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3863:1: ( ( 'if' ) )
            // InternalMyDsl.g:3864:1: ( 'if' )
            {
            // InternalMyDsl.g:3864:1: ( 'if' )
            // InternalMyDsl.g:3865:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRIfAccess().getIfKeyword_0()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRIfAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIf__Group__0__Impl"


    // $ANTLR start "rule__RIf__Group__1"
    // InternalMyDsl.g:3874:1: rule__RIf__Group__1 : rule__RIf__Group__1__Impl rule__RIf__Group__2 ;
    public final void rule__RIf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3878:1: ( rule__RIf__Group__1__Impl rule__RIf__Group__2 )
            // InternalMyDsl.g:3879:2: rule__RIf__Group__1__Impl rule__RIf__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__RIf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RIf__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIf__Group__1"


    // $ANTLR start "rule__RIf__Group__1__Impl"
    // InternalMyDsl.g:3886:1: rule__RIf__Group__1__Impl : ( '(' ) ;
    public final void rule__RIf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3890:1: ( ( '(' ) )
            // InternalMyDsl.g:3891:1: ( '(' )
            {
            // InternalMyDsl.g:3891:1: ( '(' )
            // InternalMyDsl.g:3892:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRIfAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRIfAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIf__Group__1__Impl"


    // $ANTLR start "rule__RIf__Group__2"
    // InternalMyDsl.g:3901:1: rule__RIf__Group__2 : rule__RIf__Group__2__Impl rule__RIf__Group__3 ;
    public final void rule__RIf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3905:1: ( rule__RIf__Group__2__Impl rule__RIf__Group__3 )
            // InternalMyDsl.g:3906:2: rule__RIf__Group__2__Impl rule__RIf__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__RIf__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RIf__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIf__Group__2"


    // $ANTLR start "rule__RIf__Group__2__Impl"
    // InternalMyDsl.g:3913:1: rule__RIf__Group__2__Impl : ( ruleexpression ) ;
    public final void rule__RIf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3917:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:3918:1: ( ruleexpression )
            {
            // InternalMyDsl.g:3918:1: ( ruleexpression )
            // InternalMyDsl.g:3919:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRIfAccess().getExpressionParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRIfAccess().getExpressionParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIf__Group__2__Impl"


    // $ANTLR start "rule__RIf__Group__3"
    // InternalMyDsl.g:3928:1: rule__RIf__Group__3 : rule__RIf__Group__3__Impl rule__RIf__Group__4 ;
    public final void rule__RIf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3932:1: ( rule__RIf__Group__3__Impl rule__RIf__Group__4 )
            // InternalMyDsl.g:3933:2: rule__RIf__Group__3__Impl rule__RIf__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__RIf__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RIf__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIf__Group__3"


    // $ANTLR start "rule__RIf__Group__3__Impl"
    // InternalMyDsl.g:3940:1: rule__RIf__Group__3__Impl : ( ')' ) ;
    public final void rule__RIf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3944:1: ( ( ')' ) )
            // InternalMyDsl.g:3945:1: ( ')' )
            {
            // InternalMyDsl.g:3945:1: ( ')' )
            // InternalMyDsl.g:3946:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRIfAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRIfAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIf__Group__3__Impl"


    // $ANTLR start "rule__RIf__Group__4"
    // InternalMyDsl.g:3955:1: rule__RIf__Group__4 : rule__RIf__Group__4__Impl rule__RIf__Group__5 ;
    public final void rule__RIf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3959:1: ( rule__RIf__Group__4__Impl rule__RIf__Group__5 )
            // InternalMyDsl.g:3960:2: rule__RIf__Group__4__Impl rule__RIf__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__RIf__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RIf__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIf__Group__4"


    // $ANTLR start "rule__RIf__Group__4__Impl"
    // InternalMyDsl.g:3967:1: rule__RIf__Group__4__Impl : ( rulerBlock ) ;
    public final void rule__RIf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3971:1: ( ( rulerBlock ) )
            // InternalMyDsl.g:3972:1: ( rulerBlock )
            {
            // InternalMyDsl.g:3972:1: ( rulerBlock )
            // InternalMyDsl.g:3973:2: rulerBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRIfAccess().getRBlockParserRuleCall_4()); 
            }
            pushFollow(FOLLOW_2);
            rulerBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRIfAccess().getRBlockParserRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIf__Group__4__Impl"


    // $ANTLR start "rule__RIf__Group__5"
    // InternalMyDsl.g:3982:1: rule__RIf__Group__5 : rule__RIf__Group__5__Impl ;
    public final void rule__RIf__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3986:1: ( rule__RIf__Group__5__Impl )
            // InternalMyDsl.g:3987:2: rule__RIf__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RIf__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIf__Group__5"


    // $ANTLR start "rule__RIf__Group__5__Impl"
    // InternalMyDsl.g:3993:1: rule__RIf__Group__5__Impl : ( ( rule__RIf__Group_5__0 )? ) ;
    public final void rule__RIf__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3997:1: ( ( ( rule__RIf__Group_5__0 )? ) )
            // InternalMyDsl.g:3998:1: ( ( rule__RIf__Group_5__0 )? )
            {
            // InternalMyDsl.g:3998:1: ( ( rule__RIf__Group_5__0 )? )
            // InternalMyDsl.g:3999:2: ( rule__RIf__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRIfAccess().getGroup_5()); 
            }
            // InternalMyDsl.g:4000:2: ( rule__RIf__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==67) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:4000:3: rule__RIf__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RIf__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRIfAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIf__Group__5__Impl"


    // $ANTLR start "rule__RIf__Group_5__0"
    // InternalMyDsl.g:4009:1: rule__RIf__Group_5__0 : rule__RIf__Group_5__0__Impl rule__RIf__Group_5__1 ;
    public final void rule__RIf__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4013:1: ( rule__RIf__Group_5__0__Impl rule__RIf__Group_5__1 )
            // InternalMyDsl.g:4014:2: rule__RIf__Group_5__0__Impl rule__RIf__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__RIf__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RIf__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIf__Group_5__0"


    // $ANTLR start "rule__RIf__Group_5__0__Impl"
    // InternalMyDsl.g:4021:1: rule__RIf__Group_5__0__Impl : ( 'else' ) ;
    public final void rule__RIf__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4025:1: ( ( 'else' ) )
            // InternalMyDsl.g:4026:1: ( 'else' )
            {
            // InternalMyDsl.g:4026:1: ( 'else' )
            // InternalMyDsl.g:4027:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRIfAccess().getElseKeyword_5_0()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRIfAccess().getElseKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIf__Group_5__0__Impl"


    // $ANTLR start "rule__RIf__Group_5__1"
    // InternalMyDsl.g:4036:1: rule__RIf__Group_5__1 : rule__RIf__Group_5__1__Impl ;
    public final void rule__RIf__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4040:1: ( rule__RIf__Group_5__1__Impl )
            // InternalMyDsl.g:4041:2: rule__RIf__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RIf__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIf__Group_5__1"


    // $ANTLR start "rule__RIf__Group_5__1__Impl"
    // InternalMyDsl.g:4047:1: rule__RIf__Group_5__1__Impl : ( rulerBlock ) ;
    public final void rule__RIf__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4051:1: ( ( rulerBlock ) )
            // InternalMyDsl.g:4052:1: ( rulerBlock )
            {
            // InternalMyDsl.g:4052:1: ( rulerBlock )
            // InternalMyDsl.g:4053:2: rulerBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRIfAccess().getRBlockParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_2);
            rulerBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRIfAccess().getRBlockParserRuleCall_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIf__Group_5__1__Impl"


    // $ANTLR start "rule__RWhile__Group__0"
    // InternalMyDsl.g:4063:1: rule__RWhile__Group__0 : rule__RWhile__Group__0__Impl rule__RWhile__Group__1 ;
    public final void rule__RWhile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4067:1: ( rule__RWhile__Group__0__Impl rule__RWhile__Group__1 )
            // InternalMyDsl.g:4068:2: rule__RWhile__Group__0__Impl rule__RWhile__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__RWhile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RWhile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RWhile__Group__0"


    // $ANTLR start "rule__RWhile__Group__0__Impl"
    // InternalMyDsl.g:4075:1: rule__RWhile__Group__0__Impl : ( 'while' ) ;
    public final void rule__RWhile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4079:1: ( ( 'while' ) )
            // InternalMyDsl.g:4080:1: ( 'while' )
            {
            // InternalMyDsl.g:4080:1: ( 'while' )
            // InternalMyDsl.g:4081:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRWhileAccess().getWhileKeyword_0()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRWhileAccess().getWhileKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RWhile__Group__0__Impl"


    // $ANTLR start "rule__RWhile__Group__1"
    // InternalMyDsl.g:4090:1: rule__RWhile__Group__1 : rule__RWhile__Group__1__Impl rule__RWhile__Group__2 ;
    public final void rule__RWhile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4094:1: ( rule__RWhile__Group__1__Impl rule__RWhile__Group__2 )
            // InternalMyDsl.g:4095:2: rule__RWhile__Group__1__Impl rule__RWhile__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__RWhile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RWhile__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RWhile__Group__1"


    // $ANTLR start "rule__RWhile__Group__1__Impl"
    // InternalMyDsl.g:4102:1: rule__RWhile__Group__1__Impl : ( '(' ) ;
    public final void rule__RWhile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4106:1: ( ( '(' ) )
            // InternalMyDsl.g:4107:1: ( '(' )
            {
            // InternalMyDsl.g:4107:1: ( '(' )
            // InternalMyDsl.g:4108:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRWhileAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRWhileAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RWhile__Group__1__Impl"


    // $ANTLR start "rule__RWhile__Group__2"
    // InternalMyDsl.g:4117:1: rule__RWhile__Group__2 : rule__RWhile__Group__2__Impl rule__RWhile__Group__3 ;
    public final void rule__RWhile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4121:1: ( rule__RWhile__Group__2__Impl rule__RWhile__Group__3 )
            // InternalMyDsl.g:4122:2: rule__RWhile__Group__2__Impl rule__RWhile__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__RWhile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RWhile__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RWhile__Group__2"


    // $ANTLR start "rule__RWhile__Group__2__Impl"
    // InternalMyDsl.g:4129:1: rule__RWhile__Group__2__Impl : ( ruleexpression ) ;
    public final void rule__RWhile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4133:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:4134:1: ( ruleexpression )
            {
            // InternalMyDsl.g:4134:1: ( ruleexpression )
            // InternalMyDsl.g:4135:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRWhileAccess().getExpressionParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRWhileAccess().getExpressionParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RWhile__Group__2__Impl"


    // $ANTLR start "rule__RWhile__Group__3"
    // InternalMyDsl.g:4144:1: rule__RWhile__Group__3 : rule__RWhile__Group__3__Impl rule__RWhile__Group__4 ;
    public final void rule__RWhile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4148:1: ( rule__RWhile__Group__3__Impl rule__RWhile__Group__4 )
            // InternalMyDsl.g:4149:2: rule__RWhile__Group__3__Impl rule__RWhile__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__RWhile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RWhile__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RWhile__Group__3"


    // $ANTLR start "rule__RWhile__Group__3__Impl"
    // InternalMyDsl.g:4156:1: rule__RWhile__Group__3__Impl : ( ')' ) ;
    public final void rule__RWhile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4160:1: ( ( ')' ) )
            // InternalMyDsl.g:4161:1: ( ')' )
            {
            // InternalMyDsl.g:4161:1: ( ')' )
            // InternalMyDsl.g:4162:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRWhileAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRWhileAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RWhile__Group__3__Impl"


    // $ANTLR start "rule__RWhile__Group__4"
    // InternalMyDsl.g:4171:1: rule__RWhile__Group__4 : rule__RWhile__Group__4__Impl ;
    public final void rule__RWhile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4175:1: ( rule__RWhile__Group__4__Impl )
            // InternalMyDsl.g:4176:2: rule__RWhile__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RWhile__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RWhile__Group__4"


    // $ANTLR start "rule__RWhile__Group__4__Impl"
    // InternalMyDsl.g:4182:1: rule__RWhile__Group__4__Impl : ( rulerBlock ) ;
    public final void rule__RWhile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4186:1: ( ( rulerBlock ) )
            // InternalMyDsl.g:4187:1: ( rulerBlock )
            {
            // InternalMyDsl.g:4187:1: ( rulerBlock )
            // InternalMyDsl.g:4188:2: rulerBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRWhileAccess().getRBlockParserRuleCall_4()); 
            }
            pushFollow(FOLLOW_2);
            rulerBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRWhileAccess().getRBlockParserRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RWhile__Group__4__Impl"


    // $ANTLR start "rule__RExpression__Group__0"
    // InternalMyDsl.g:4198:1: rule__RExpression__Group__0 : rule__RExpression__Group__0__Impl rule__RExpression__Group__1 ;
    public final void rule__RExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4202:1: ( rule__RExpression__Group__0__Impl rule__RExpression__Group__1 )
            // InternalMyDsl.g:4203:2: rule__RExpression__Group__0__Impl rule__RExpression__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RExpression__Group__0"


    // $ANTLR start "rule__RExpression__Group__0__Impl"
    // InternalMyDsl.g:4210:1: rule__RExpression__Group__0__Impl : ( ruleexpression ) ;
    public final void rule__RExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4214:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:4215:1: ( ruleexpression )
            {
            // InternalMyDsl.g:4215:1: ( ruleexpression )
            // InternalMyDsl.g:4216:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRExpressionAccess().getExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRExpressionAccess().getExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RExpression__Group__0__Impl"


    // $ANTLR start "rule__RExpression__Group__1"
    // InternalMyDsl.g:4225:1: rule__RExpression__Group__1 : rule__RExpression__Group__1__Impl ;
    public final void rule__RExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4229:1: ( rule__RExpression__Group__1__Impl )
            // InternalMyDsl.g:4230:2: rule__RExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RExpression__Group__1"


    // $ANTLR start "rule__RExpression__Group__1__Impl"
    // InternalMyDsl.g:4236:1: rule__RExpression__Group__1__Impl : ( ';' ) ;
    public final void rule__RExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4240:1: ( ( ';' ) )
            // InternalMyDsl.g:4241:1: ( ';' )
            {
            // InternalMyDsl.g:4241:1: ( ';' )
            // InternalMyDsl.g:4242:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRExpressionAccess().getSemicolonKeyword_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRExpressionAccess().getSemicolonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RExpression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalMyDsl.g:4252:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4256:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMyDsl.g:4257:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalMyDsl.g:4264:1: rule__Expression__Group__0__Impl : ( rulenonLeftRecExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4268:1: ( ( rulenonLeftRecExpression ) )
            // InternalMyDsl.g:4269:1: ( rulenonLeftRecExpression )
            {
            // InternalMyDsl.g:4269:1: ( rulenonLeftRecExpression )
            // InternalMyDsl.g:4270:2: rulenonLeftRecExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getNonLeftRecExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulenonLeftRecExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getNonLeftRecExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalMyDsl.g:4279:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4283:1: ( rule__Expression__Group__1__Impl )
            // InternalMyDsl.g:4284:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalMyDsl.g:4290:1: rule__Expression__Group__1__Impl : ( ( rulerecExpression )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4294:1: ( ( ( rulerecExpression )? ) )
            // InternalMyDsl.g:4295:1: ( ( rulerecExpression )? )
            {
            // InternalMyDsl.g:4295:1: ( ( rulerecExpression )? )
            // InternalMyDsl.g:4296:2: ( rulerecExpression )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getRecExpressionParserRuleCall_1()); 
            }
            // InternalMyDsl.g:4297:2: ( rulerecExpression )?
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:4297:3: rulerecExpression
                    {
                    pushFollow(FOLLOW_2);
                    rulerecExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getRecExpressionParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__RecExpression__Group__0"
    // InternalMyDsl.g:4306:1: rule__RecExpression__Group__0 : rule__RecExpression__Group__0__Impl rule__RecExpression__Group__1 ;
    public final void rule__RecExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4310:1: ( rule__RecExpression__Group__0__Impl rule__RecExpression__Group__1 )
            // InternalMyDsl.g:4311:2: rule__RecExpression__Group__0__Impl rule__RecExpression__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__RecExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group__0"


    // $ANTLR start "rule__RecExpression__Group__0__Impl"
    // InternalMyDsl.g:4318:1: rule__RecExpression__Group__0__Impl : ( ( rule__RecExpression__Alternatives_0 ) ) ;
    public final void rule__RecExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4322:1: ( ( ( rule__RecExpression__Alternatives_0 ) ) )
            // InternalMyDsl.g:4323:1: ( ( rule__RecExpression__Alternatives_0 ) )
            {
            // InternalMyDsl.g:4323:1: ( ( rule__RecExpression__Alternatives_0 ) )
            // InternalMyDsl.g:4324:2: ( rule__RecExpression__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getAlternatives_0()); 
            }
            // InternalMyDsl.g:4325:2: ( rule__RecExpression__Alternatives_0 )
            // InternalMyDsl.g:4325:3: rule__RecExpression__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__RecExpression__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group__0__Impl"


    // $ANTLR start "rule__RecExpression__Group__1"
    // InternalMyDsl.g:4333:1: rule__RecExpression__Group__1 : rule__RecExpression__Group__1__Impl ;
    public final void rule__RecExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4337:1: ( rule__RecExpression__Group__1__Impl )
            // InternalMyDsl.g:4338:2: rule__RecExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group__1"


    // $ANTLR start "rule__RecExpression__Group__1__Impl"
    // InternalMyDsl.g:4344:1: rule__RecExpression__Group__1__Impl : ( ( rulerecExpression )? ) ;
    public final void rule__RecExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4348:1: ( ( ( rulerecExpression )? ) )
            // InternalMyDsl.g:4349:1: ( ( rulerecExpression )? )
            {
            // InternalMyDsl.g:4349:1: ( ( rulerecExpression )? )
            // InternalMyDsl.g:4350:2: ( rulerecExpression )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getRecExpressionParserRuleCall_1()); 
            }
            // InternalMyDsl.g:4351:2: ( rulerecExpression )?
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:4351:3: rulerecExpression
                    {
                    pushFollow(FOLLOW_2);
                    rulerecExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getRecExpressionParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group__1__Impl"


    // $ANTLR start "rule__RecExpression__Group_0_1__0"
    // InternalMyDsl.g:4360:1: rule__RecExpression__Group_0_1__0 : rule__RecExpression__Group_0_1__0__Impl rule__RecExpression__Group_0_1__1 ;
    public final void rule__RecExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4364:1: ( rule__RecExpression__Group_0_1__0__Impl rule__RecExpression__Group_0_1__1 )
            // InternalMyDsl.g:4365:2: rule__RecExpression__Group_0_1__0__Impl rule__RecExpression__Group_0_1__1
            {
            pushFollow(FOLLOW_28);
            rule__RecExpression__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_1__0"


    // $ANTLR start "rule__RecExpression__Group_0_1__0__Impl"
    // InternalMyDsl.g:4372:1: rule__RecExpression__Group_0_1__0__Impl : ( RULE_MULTOP ) ;
    public final void rule__RecExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4376:1: ( ( RULE_MULTOP ) )
            // InternalMyDsl.g:4377:1: ( RULE_MULTOP )
            {
            // InternalMyDsl.g:4377:1: ( RULE_MULTOP )
            // InternalMyDsl.g:4378:2: RULE_MULTOP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getMultOpTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_MULTOP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getMultOpTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_1__0__Impl"


    // $ANTLR start "rule__RecExpression__Group_0_1__1"
    // InternalMyDsl.g:4387:1: rule__RecExpression__Group_0_1__1 : rule__RecExpression__Group_0_1__1__Impl ;
    public final void rule__RecExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4391:1: ( rule__RecExpression__Group_0_1__1__Impl )
            // InternalMyDsl.g:4392:2: rule__RecExpression__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_1__1"


    // $ANTLR start "rule__RecExpression__Group_0_1__1__Impl"
    // InternalMyDsl.g:4398:1: rule__RecExpression__Group_0_1__1__Impl : ( ruleexpression ) ;
    public final void rule__RecExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4402:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:4403:1: ( ruleexpression )
            {
            // InternalMyDsl.g:4403:1: ( ruleexpression )
            // InternalMyDsl.g:4404:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_1__1__Impl"


    // $ANTLR start "rule__RecExpression__Group_0_2__0"
    // InternalMyDsl.g:4414:1: rule__RecExpression__Group_0_2__0 : rule__RecExpression__Group_0_2__0__Impl rule__RecExpression__Group_0_2__1 ;
    public final void rule__RecExpression__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4418:1: ( rule__RecExpression__Group_0_2__0__Impl rule__RecExpression__Group_0_2__1 )
            // InternalMyDsl.g:4419:2: rule__RecExpression__Group_0_2__0__Impl rule__RecExpression__Group_0_2__1
            {
            pushFollow(FOLLOW_28);
            rule__RecExpression__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_2__0"


    // $ANTLR start "rule__RecExpression__Group_0_2__0__Impl"
    // InternalMyDsl.g:4426:1: rule__RecExpression__Group_0_2__0__Impl : ( ruleaddOp ) ;
    public final void rule__RecExpression__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4430:1: ( ( ruleaddOp ) )
            // InternalMyDsl.g:4431:1: ( ruleaddOp )
            {
            // InternalMyDsl.g:4431:1: ( ruleaddOp )
            // InternalMyDsl.g:4432:2: ruleaddOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getAddOpParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleaddOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getAddOpParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_2__0__Impl"


    // $ANTLR start "rule__RecExpression__Group_0_2__1"
    // InternalMyDsl.g:4441:1: rule__RecExpression__Group_0_2__1 : rule__RecExpression__Group_0_2__1__Impl ;
    public final void rule__RecExpression__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4445:1: ( rule__RecExpression__Group_0_2__1__Impl )
            // InternalMyDsl.g:4446:2: rule__RecExpression__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_2__1"


    // $ANTLR start "rule__RecExpression__Group_0_2__1__Impl"
    // InternalMyDsl.g:4452:1: rule__RecExpression__Group_0_2__1__Impl : ( ruleexpression ) ;
    public final void rule__RecExpression__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4456:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:4457:1: ( ruleexpression )
            {
            // InternalMyDsl.g:4457:1: ( ruleexpression )
            // InternalMyDsl.g:4458:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_2_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_2__1__Impl"


    // $ANTLR start "rule__RecExpression__Group_0_3__0"
    // InternalMyDsl.g:4468:1: rule__RecExpression__Group_0_3__0 : rule__RecExpression__Group_0_3__0__Impl rule__RecExpression__Group_0_3__1 ;
    public final void rule__RecExpression__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4472:1: ( rule__RecExpression__Group_0_3__0__Impl rule__RecExpression__Group_0_3__1 )
            // InternalMyDsl.g:4473:2: rule__RecExpression__Group_0_3__0__Impl rule__RecExpression__Group_0_3__1
            {
            pushFollow(FOLLOW_28);
            rule__RecExpression__Group_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group_0_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_3__0"


    // $ANTLR start "rule__RecExpression__Group_0_3__0__Impl"
    // InternalMyDsl.g:4480:1: rule__RecExpression__Group_0_3__0__Impl : ( rulecompOp ) ;
    public final void rule__RecExpression__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4484:1: ( ( rulecompOp ) )
            // InternalMyDsl.g:4485:1: ( rulecompOp )
            {
            // InternalMyDsl.g:4485:1: ( rulecompOp )
            // InternalMyDsl.g:4486:2: rulecompOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getCompOpParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulecompOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getCompOpParserRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_3__0__Impl"


    // $ANTLR start "rule__RecExpression__Group_0_3__1"
    // InternalMyDsl.g:4495:1: rule__RecExpression__Group_0_3__1 : rule__RecExpression__Group_0_3__1__Impl ;
    public final void rule__RecExpression__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4499:1: ( rule__RecExpression__Group_0_3__1__Impl )
            // InternalMyDsl.g:4500:2: rule__RecExpression__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group_0_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_3__1"


    // $ANTLR start "rule__RecExpression__Group_0_3__1__Impl"
    // InternalMyDsl.g:4506:1: rule__RecExpression__Group_0_3__1__Impl : ( ruleexpression ) ;
    public final void rule__RecExpression__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4510:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:4511:1: ( ruleexpression )
            {
            // InternalMyDsl.g:4511:1: ( ruleexpression )
            // InternalMyDsl.g:4512:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_3_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_3__1__Impl"


    // $ANTLR start "rule__RecExpression__Group_0_4__0"
    // InternalMyDsl.g:4522:1: rule__RecExpression__Group_0_4__0 : rule__RecExpression__Group_0_4__0__Impl rule__RecExpression__Group_0_4__1 ;
    public final void rule__RecExpression__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4526:1: ( rule__RecExpression__Group_0_4__0__Impl rule__RecExpression__Group_0_4__1 )
            // InternalMyDsl.g:4527:2: rule__RecExpression__Group_0_4__0__Impl rule__RecExpression__Group_0_4__1
            {
            pushFollow(FOLLOW_28);
            rule__RecExpression__Group_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group_0_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_4__0"


    // $ANTLR start "rule__RecExpression__Group_0_4__0__Impl"
    // InternalMyDsl.g:4534:1: rule__RecExpression__Group_0_4__0__Impl : ( 'and' ) ;
    public final void rule__RecExpression__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4538:1: ( ( 'and' ) )
            // InternalMyDsl.g:4539:1: ( 'and' )
            {
            // InternalMyDsl.g:4539:1: ( 'and' )
            // InternalMyDsl.g:4540:2: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getAndKeyword_0_4_0()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getAndKeyword_0_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_4__0__Impl"


    // $ANTLR start "rule__RecExpression__Group_0_4__1"
    // InternalMyDsl.g:4549:1: rule__RecExpression__Group_0_4__1 : rule__RecExpression__Group_0_4__1__Impl ;
    public final void rule__RecExpression__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4553:1: ( rule__RecExpression__Group_0_4__1__Impl )
            // InternalMyDsl.g:4554:2: rule__RecExpression__Group_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group_0_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_4__1"


    // $ANTLR start "rule__RecExpression__Group_0_4__1__Impl"
    // InternalMyDsl.g:4560:1: rule__RecExpression__Group_0_4__1__Impl : ( ruleexpression ) ;
    public final void rule__RecExpression__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4564:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:4565:1: ( ruleexpression )
            {
            // InternalMyDsl.g:4565:1: ( ruleexpression )
            // InternalMyDsl.g:4566:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_4_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_4__1__Impl"


    // $ANTLR start "rule__RecExpression__Group_0_5__0"
    // InternalMyDsl.g:4576:1: rule__RecExpression__Group_0_5__0 : rule__RecExpression__Group_0_5__0__Impl rule__RecExpression__Group_0_5__1 ;
    public final void rule__RecExpression__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4580:1: ( rule__RecExpression__Group_0_5__0__Impl rule__RecExpression__Group_0_5__1 )
            // InternalMyDsl.g:4581:2: rule__RecExpression__Group_0_5__0__Impl rule__RecExpression__Group_0_5__1
            {
            pushFollow(FOLLOW_28);
            rule__RecExpression__Group_0_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group_0_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_5__0"


    // $ANTLR start "rule__RecExpression__Group_0_5__0__Impl"
    // InternalMyDsl.g:4588:1: rule__RecExpression__Group_0_5__0__Impl : ( 'or' ) ;
    public final void rule__RecExpression__Group_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4592:1: ( ( 'or' ) )
            // InternalMyDsl.g:4593:1: ( 'or' )
            {
            // InternalMyDsl.g:4593:1: ( 'or' )
            // InternalMyDsl.g:4594:2: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getOrKeyword_0_5_0()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getOrKeyword_0_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_5__0__Impl"


    // $ANTLR start "rule__RecExpression__Group_0_5__1"
    // InternalMyDsl.g:4603:1: rule__RecExpression__Group_0_5__1 : rule__RecExpression__Group_0_5__1__Impl ;
    public final void rule__RecExpression__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4607:1: ( rule__RecExpression__Group_0_5__1__Impl )
            // InternalMyDsl.g:4608:2: rule__RecExpression__Group_0_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group_0_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_5__1"


    // $ANTLR start "rule__RecExpression__Group_0_5__1__Impl"
    // InternalMyDsl.g:4614:1: rule__RecExpression__Group_0_5__1__Impl : ( ruleexpression ) ;
    public final void rule__RecExpression__Group_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4618:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:4619:1: ( ruleexpression )
            {
            // InternalMyDsl.g:4619:1: ( ruleexpression )
            // InternalMyDsl.g:4620:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_5_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_5__1__Impl"


    // $ANTLR start "rule__RecExpression__Group_0_6__0"
    // InternalMyDsl.g:4630:1: rule__RecExpression__Group_0_6__0 : rule__RecExpression__Group_0_6__0__Impl rule__RecExpression__Group_0_6__1 ;
    public final void rule__RecExpression__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4634:1: ( rule__RecExpression__Group_0_6__0__Impl rule__RecExpression__Group_0_6__1 )
            // InternalMyDsl.g:4635:2: rule__RecExpression__Group_0_6__0__Impl rule__RecExpression__Group_0_6__1
            {
            pushFollow(FOLLOW_28);
            rule__RecExpression__Group_0_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group_0_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_6__0"


    // $ANTLR start "rule__RecExpression__Group_0_6__0__Impl"
    // InternalMyDsl.g:4642:1: rule__RecExpression__Group_0_6__0__Impl : ( 'xor' ) ;
    public final void rule__RecExpression__Group_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4646:1: ( ( 'xor' ) )
            // InternalMyDsl.g:4647:1: ( 'xor' )
            {
            // InternalMyDsl.g:4647:1: ( 'xor' )
            // InternalMyDsl.g:4648:2: 'xor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getXorKeyword_0_6_0()); 
            }
            match(input,71,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getXorKeyword_0_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_6__0__Impl"


    // $ANTLR start "rule__RecExpression__Group_0_6__1"
    // InternalMyDsl.g:4657:1: rule__RecExpression__Group_0_6__1 : rule__RecExpression__Group_0_6__1__Impl ;
    public final void rule__RecExpression__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4661:1: ( rule__RecExpression__Group_0_6__1__Impl )
            // InternalMyDsl.g:4662:2: rule__RecExpression__Group_0_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group_0_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_6__1"


    // $ANTLR start "rule__RecExpression__Group_0_6__1__Impl"
    // InternalMyDsl.g:4668:1: rule__RecExpression__Group_0_6__1__Impl : ( ruleexpression ) ;
    public final void rule__RecExpression__Group_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4672:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:4673:1: ( ruleexpression )
            {
            // InternalMyDsl.g:4673:1: ( ruleexpression )
            // InternalMyDsl.g:4674:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_6_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_6__1__Impl"


    // $ANTLR start "rule__RecExpression__Group_0_7__0"
    // InternalMyDsl.g:4684:1: rule__RecExpression__Group_0_7__0 : rule__RecExpression__Group_0_7__0__Impl rule__RecExpression__Group_0_7__1 ;
    public final void rule__RecExpression__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4688:1: ( rule__RecExpression__Group_0_7__0__Impl rule__RecExpression__Group_0_7__1 )
            // InternalMyDsl.g:4689:2: rule__RecExpression__Group_0_7__0__Impl rule__RecExpression__Group_0_7__1
            {
            pushFollow(FOLLOW_28);
            rule__RecExpression__Group_0_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group_0_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_7__0"


    // $ANTLR start "rule__RecExpression__Group_0_7__0__Impl"
    // InternalMyDsl.g:4696:1: rule__RecExpression__Group_0_7__0__Impl : ( 'implies' ) ;
    public final void rule__RecExpression__Group_0_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4700:1: ( ( 'implies' ) )
            // InternalMyDsl.g:4701:1: ( 'implies' )
            {
            // InternalMyDsl.g:4701:1: ( 'implies' )
            // InternalMyDsl.g:4702:2: 'implies'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getImpliesKeyword_0_7_0()); 
            }
            match(input,72,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getImpliesKeyword_0_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_7__0__Impl"


    // $ANTLR start "rule__RecExpression__Group_0_7__1"
    // InternalMyDsl.g:4711:1: rule__RecExpression__Group_0_7__1 : rule__RecExpression__Group_0_7__1__Impl ;
    public final void rule__RecExpression__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4715:1: ( rule__RecExpression__Group_0_7__1__Impl )
            // InternalMyDsl.g:4716:2: rule__RecExpression__Group_0_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecExpression__Group_0_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_7__1"


    // $ANTLR start "rule__RecExpression__Group_0_7__1__Impl"
    // InternalMyDsl.g:4722:1: rule__RecExpression__Group_0_7__1__Impl : ( ruleexpression ) ;
    public final void rule__RecExpression__Group_0_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4726:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:4727:1: ( ruleexpression )
            {
            // InternalMyDsl.g:4727:1: ( ruleexpression )
            // InternalMyDsl.g:4728:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_7_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecExpression__Group_0_7__1__Impl"


    // $ANTLR start "rule__NavigationSegment__Group_0__0"
    // InternalMyDsl.g:4738:1: rule__NavigationSegment__Group_0__0 : rule__NavigationSegment__Group_0__0__Impl rule__NavigationSegment__Group_0__1 ;
    public final void rule__NavigationSegment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4742:1: ( rule__NavigationSegment__Group_0__0__Impl rule__NavigationSegment__Group_0__1 )
            // InternalMyDsl.g:4743:2: rule__NavigationSegment__Group_0__0__Impl rule__NavigationSegment__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__NavigationSegment__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NavigationSegment__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationSegment__Group_0__0"


    // $ANTLR start "rule__NavigationSegment__Group_0__0__Impl"
    // InternalMyDsl.g:4750:1: rule__NavigationSegment__Group_0__0__Impl : ( '.' ) ;
    public final void rule__NavigationSegment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4754:1: ( ( '.' ) )
            // InternalMyDsl.g:4755:1: ( '.' )
            {
            // InternalMyDsl.g:4755:1: ( '.' )
            // InternalMyDsl.g:4756:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationSegmentAccess().getFullStopKeyword_0_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationSegmentAccess().getFullStopKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationSegment__Group_0__0__Impl"


    // $ANTLR start "rule__NavigationSegment__Group_0__1"
    // InternalMyDsl.g:4765:1: rule__NavigationSegment__Group_0__1 : rule__NavigationSegment__Group_0__1__Impl ;
    public final void rule__NavigationSegment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4769:1: ( rule__NavigationSegment__Group_0__1__Impl )
            // InternalMyDsl.g:4770:2: rule__NavigationSegment__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigationSegment__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationSegment__Group_0__1"


    // $ANTLR start "rule__NavigationSegment__Group_0__1__Impl"
    // InternalMyDsl.g:4776:1: rule__NavigationSegment__Group_0__1__Impl : ( RULE_IDENT ) ;
    public final void rule__NavigationSegment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4780:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:4781:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:4781:1: ( RULE_IDENT )
            // InternalMyDsl.g:4782:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationSegmentAccess().getIdentTerminalRuleCall_0_1()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationSegmentAccess().getIdentTerminalRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationSegment__Group_0__1__Impl"


    // $ANTLR start "rule__NavigationSegment__Group_1__0"
    // InternalMyDsl.g:4792:1: rule__NavigationSegment__Group_1__0 : rule__NavigationSegment__Group_1__0__Impl rule__NavigationSegment__Group_1__1 ;
    public final void rule__NavigationSegment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4796:1: ( rule__NavigationSegment__Group_1__0__Impl rule__NavigationSegment__Group_1__1 )
            // InternalMyDsl.g:4797:2: rule__NavigationSegment__Group_1__0__Impl rule__NavigationSegment__Group_1__1
            {
            pushFollow(FOLLOW_40);
            rule__NavigationSegment__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NavigationSegment__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationSegment__Group_1__0"


    // $ANTLR start "rule__NavigationSegment__Group_1__0__Impl"
    // InternalMyDsl.g:4804:1: rule__NavigationSegment__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NavigationSegment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4808:1: ( ( '.' ) )
            // InternalMyDsl.g:4809:1: ( '.' )
            {
            // InternalMyDsl.g:4809:1: ( '.' )
            // InternalMyDsl.g:4810:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationSegmentAccess().getFullStopKeyword_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationSegmentAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationSegment__Group_1__0__Impl"


    // $ANTLR start "rule__NavigationSegment__Group_1__1"
    // InternalMyDsl.g:4819:1: rule__NavigationSegment__Group_1__1 : rule__NavigationSegment__Group_1__1__Impl ;
    public final void rule__NavigationSegment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4823:1: ( rule__NavigationSegment__Group_1__1__Impl )
            // InternalMyDsl.g:4824:2: rule__NavigationSegment__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigationSegment__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationSegment__Group_1__1"


    // $ANTLR start "rule__NavigationSegment__Group_1__1__Impl"
    // InternalMyDsl.g:4830:1: rule__NavigationSegment__Group_1__1__Impl : ( rulecallExp ) ;
    public final void rule__NavigationSegment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4834:1: ( ( rulecallExp ) )
            // InternalMyDsl.g:4835:1: ( rulecallExp )
            {
            // InternalMyDsl.g:4835:1: ( rulecallExp )
            // InternalMyDsl.g:4836:2: rulecallExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationSegmentAccess().getCallExpParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            rulecallExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationSegmentAccess().getCallExpParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationSegment__Group_1__1__Impl"


    // $ANTLR start "rule__NavigationSegment__Group_2__0"
    // InternalMyDsl.g:4846:1: rule__NavigationSegment__Group_2__0 : rule__NavigationSegment__Group_2__0__Impl rule__NavigationSegment__Group_2__1 ;
    public final void rule__NavigationSegment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4850:1: ( rule__NavigationSegment__Group_2__0__Impl rule__NavigationSegment__Group_2__1 )
            // InternalMyDsl.g:4851:2: rule__NavigationSegment__Group_2__0__Impl rule__NavigationSegment__Group_2__1
            {
            pushFollow(FOLLOW_40);
            rule__NavigationSegment__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NavigationSegment__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationSegment__Group_2__0"


    // $ANTLR start "rule__NavigationSegment__Group_2__0__Impl"
    // InternalMyDsl.g:4858:1: rule__NavigationSegment__Group_2__0__Impl : ( '->' ) ;
    public final void rule__NavigationSegment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4862:1: ( ( '->' ) )
            // InternalMyDsl.g:4863:1: ( '->' )
            {
            // InternalMyDsl.g:4863:1: ( '->' )
            // InternalMyDsl.g:4864:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationSegmentAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 
            }
            match(input,73,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationSegmentAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationSegment__Group_2__0__Impl"


    // $ANTLR start "rule__NavigationSegment__Group_2__1"
    // InternalMyDsl.g:4873:1: rule__NavigationSegment__Group_2__1 : rule__NavigationSegment__Group_2__1__Impl ;
    public final void rule__NavigationSegment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4877:1: ( rule__NavigationSegment__Group_2__1__Impl )
            // InternalMyDsl.g:4878:2: rule__NavigationSegment__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigationSegment__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationSegment__Group_2__1"


    // $ANTLR start "rule__NavigationSegment__Group_2__1__Impl"
    // InternalMyDsl.g:4884:1: rule__NavigationSegment__Group_2__1__Impl : ( rulecallExp ) ;
    public final void rule__NavigationSegment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4888:1: ( ( rulecallExp ) )
            // InternalMyDsl.g:4889:1: ( rulecallExp )
            {
            // InternalMyDsl.g:4889:1: ( rulecallExp )
            // InternalMyDsl.g:4890:2: rulecallExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationSegmentAccess().getCallExpParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_2);
            rulecallExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationSegmentAccess().getCallExpParserRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationSegment__Group_2__1__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_0__0"
    // InternalMyDsl.g:4900:1: rule__NonLeftRecExpression__Group_0__0 : rule__NonLeftRecExpression__Group_0__0__Impl rule__NonLeftRecExpression__Group_0__1 ;
    public final void rule__NonLeftRecExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4904:1: ( rule__NonLeftRecExpression__Group_0__0__Impl rule__NonLeftRecExpression__Group_0__1 )
            // InternalMyDsl.g:4905:2: rule__NonLeftRecExpression__Group_0__0__Impl rule__NonLeftRecExpression__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__NonLeftRecExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_0__0"


    // $ANTLR start "rule__NonLeftRecExpression__Group_0__0__Impl"
    // InternalMyDsl.g:4912:1: rule__NonLeftRecExpression__Group_0__0__Impl : ( 'not' ) ;
    public final void rule__NonLeftRecExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4916:1: ( ( 'not' ) )
            // InternalMyDsl.g:4917:1: ( 'not' )
            {
            // InternalMyDsl.g:4917:1: ( 'not' )
            // InternalMyDsl.g:4918:2: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getNotKeyword_0_0()); 
            }
            match(input,74,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getNotKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_0__0__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_0__1"
    // InternalMyDsl.g:4927:1: rule__NonLeftRecExpression__Group_0__1 : rule__NonLeftRecExpression__Group_0__1__Impl ;
    public final void rule__NonLeftRecExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4931:1: ( rule__NonLeftRecExpression__Group_0__1__Impl )
            // InternalMyDsl.g:4932:2: rule__NonLeftRecExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_0__1"


    // $ANTLR start "rule__NonLeftRecExpression__Group_0__1__Impl"
    // InternalMyDsl.g:4938:1: rule__NonLeftRecExpression__Group_0__1__Impl : ( ruleexpression ) ;
    public final void rule__NonLeftRecExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4942:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:4943:1: ( ruleexpression )
            {
            // InternalMyDsl.g:4943:1: ( ruleexpression )
            // InternalMyDsl.g:4944:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_0__1__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_1__0"
    // InternalMyDsl.g:4954:1: rule__NonLeftRecExpression__Group_1__0 : rule__NonLeftRecExpression__Group_1__0__Impl rule__NonLeftRecExpression__Group_1__1 ;
    public final void rule__NonLeftRecExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4958:1: ( rule__NonLeftRecExpression__Group_1__0__Impl rule__NonLeftRecExpression__Group_1__1 )
            // InternalMyDsl.g:4959:2: rule__NonLeftRecExpression__Group_1__0__Impl rule__NonLeftRecExpression__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__NonLeftRecExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_1__0"


    // $ANTLR start "rule__NonLeftRecExpression__Group_1__0__Impl"
    // InternalMyDsl.g:4966:1: rule__NonLeftRecExpression__Group_1__0__Impl : ( '-' ) ;
    public final void rule__NonLeftRecExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4970:1: ( ( '-' ) )
            // InternalMyDsl.g:4971:1: ( '-' )
            {
            // InternalMyDsl.g:4971:1: ( '-' )
            // InternalMyDsl.g:4972:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getHyphenMinusKeyword_1_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getHyphenMinusKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_1__0__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_1__1"
    // InternalMyDsl.g:4981:1: rule__NonLeftRecExpression__Group_1__1 : rule__NonLeftRecExpression__Group_1__1__Impl ;
    public final void rule__NonLeftRecExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4985:1: ( rule__NonLeftRecExpression__Group_1__1__Impl )
            // InternalMyDsl.g:4986:2: rule__NonLeftRecExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_1__1"


    // $ANTLR start "rule__NonLeftRecExpression__Group_1__1__Impl"
    // InternalMyDsl.g:4992:1: rule__NonLeftRecExpression__Group_1__1__Impl : ( ruleexpression ) ;
    public final void rule__NonLeftRecExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4996:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:4997:1: ( ruleexpression )
            {
            // InternalMyDsl.g:4997:1: ( ruleexpression )
            // InternalMyDsl.g:4998:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_1__1__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_4__0"
    // InternalMyDsl.g:5008:1: rule__NonLeftRecExpression__Group_4__0 : rule__NonLeftRecExpression__Group_4__0__Impl rule__NonLeftRecExpression__Group_4__1 ;
    public final void rule__NonLeftRecExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5012:1: ( rule__NonLeftRecExpression__Group_4__0__Impl rule__NonLeftRecExpression__Group_4__1 )
            // InternalMyDsl.g:5013:2: rule__NonLeftRecExpression__Group_4__0__Impl rule__NonLeftRecExpression__Group_4__1
            {
            pushFollow(FOLLOW_28);
            rule__NonLeftRecExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_4__0"


    // $ANTLR start "rule__NonLeftRecExpression__Group_4__0__Impl"
    // InternalMyDsl.g:5020:1: rule__NonLeftRecExpression__Group_4__0__Impl : ( '(' ) ;
    public final void rule__NonLeftRecExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5024:1: ( ( '(' ) )
            // InternalMyDsl.g:5025:1: ( '(' )
            {
            // InternalMyDsl.g:5025:1: ( '(' )
            // InternalMyDsl.g:5026:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getLeftParenthesisKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_4__0__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_4__1"
    // InternalMyDsl.g:5035:1: rule__NonLeftRecExpression__Group_4__1 : rule__NonLeftRecExpression__Group_4__1__Impl rule__NonLeftRecExpression__Group_4__2 ;
    public final void rule__NonLeftRecExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5039:1: ( rule__NonLeftRecExpression__Group_4__1__Impl rule__NonLeftRecExpression__Group_4__2 )
            // InternalMyDsl.g:5040:2: rule__NonLeftRecExpression__Group_4__1__Impl rule__NonLeftRecExpression__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__NonLeftRecExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_4__1"


    // $ANTLR start "rule__NonLeftRecExpression__Group_4__1__Impl"
    // InternalMyDsl.g:5047:1: rule__NonLeftRecExpression__Group_4__1__Impl : ( ruleexpression ) ;
    public final void rule__NonLeftRecExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5051:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:5052:1: ( ruleexpression )
            {
            // InternalMyDsl.g:5052:1: ( ruleexpression )
            // InternalMyDsl.g:5053:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_4_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_4__1__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_4__2"
    // InternalMyDsl.g:5062:1: rule__NonLeftRecExpression__Group_4__2 : rule__NonLeftRecExpression__Group_4__2__Impl ;
    public final void rule__NonLeftRecExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5066:1: ( rule__NonLeftRecExpression__Group_4__2__Impl )
            // InternalMyDsl.g:5067:2: rule__NonLeftRecExpression__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_4__2"


    // $ANTLR start "rule__NonLeftRecExpression__Group_4__2__Impl"
    // InternalMyDsl.g:5073:1: rule__NonLeftRecExpression__Group_4__2__Impl : ( ')' ) ;
    public final void rule__NonLeftRecExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5077:1: ( ( ')' ) )
            // InternalMyDsl.g:5078:1: ( ')' )
            {
            // InternalMyDsl.g:5078:1: ( ')' )
            // InternalMyDsl.g:5079:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getRightParenthesisKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_4__2__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_5__0"
    // InternalMyDsl.g:5089:1: rule__NonLeftRecExpression__Group_5__0 : rule__NonLeftRecExpression__Group_5__0__Impl rule__NonLeftRecExpression__Group_5__1 ;
    public final void rule__NonLeftRecExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5093:1: ( rule__NonLeftRecExpression__Group_5__0__Impl rule__NonLeftRecExpression__Group_5__1 )
            // InternalMyDsl.g:5094:2: rule__NonLeftRecExpression__Group_5__0__Impl rule__NonLeftRecExpression__Group_5__1
            {
            pushFollow(FOLLOW_28);
            rule__NonLeftRecExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_5__0"


    // $ANTLR start "rule__NonLeftRecExpression__Group_5__0__Impl"
    // InternalMyDsl.g:5101:1: rule__NonLeftRecExpression__Group_5__0__Impl : ( 'if' ) ;
    public final void rule__NonLeftRecExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5105:1: ( ( 'if' ) )
            // InternalMyDsl.g:5106:1: ( 'if' )
            {
            // InternalMyDsl.g:5106:1: ( 'if' )
            // InternalMyDsl.g:5107:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getIfKeyword_5_0()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getIfKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_5__0__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_5__1"
    // InternalMyDsl.g:5116:1: rule__NonLeftRecExpression__Group_5__1 : rule__NonLeftRecExpression__Group_5__1__Impl rule__NonLeftRecExpression__Group_5__2 ;
    public final void rule__NonLeftRecExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5120:1: ( rule__NonLeftRecExpression__Group_5__1__Impl rule__NonLeftRecExpression__Group_5__2 )
            // InternalMyDsl.g:5121:2: rule__NonLeftRecExpression__Group_5__1__Impl rule__NonLeftRecExpression__Group_5__2
            {
            pushFollow(FOLLOW_41);
            rule__NonLeftRecExpression__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_5__1"


    // $ANTLR start "rule__NonLeftRecExpression__Group_5__1__Impl"
    // InternalMyDsl.g:5128:1: rule__NonLeftRecExpression__Group_5__1__Impl : ( ruleexpression ) ;
    public final void rule__NonLeftRecExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5132:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:5133:1: ( ruleexpression )
            {
            // InternalMyDsl.g:5133:1: ( ruleexpression )
            // InternalMyDsl.g:5134:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_5__1__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_5__2"
    // InternalMyDsl.g:5143:1: rule__NonLeftRecExpression__Group_5__2 : rule__NonLeftRecExpression__Group_5__2__Impl rule__NonLeftRecExpression__Group_5__3 ;
    public final void rule__NonLeftRecExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5147:1: ( rule__NonLeftRecExpression__Group_5__2__Impl rule__NonLeftRecExpression__Group_5__3 )
            // InternalMyDsl.g:5148:2: rule__NonLeftRecExpression__Group_5__2__Impl rule__NonLeftRecExpression__Group_5__3
            {
            pushFollow(FOLLOW_28);
            rule__NonLeftRecExpression__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_5__2"


    // $ANTLR start "rule__NonLeftRecExpression__Group_5__2__Impl"
    // InternalMyDsl.g:5155:1: rule__NonLeftRecExpression__Group_5__2__Impl : ( 'then' ) ;
    public final void rule__NonLeftRecExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5159:1: ( ( 'then' ) )
            // InternalMyDsl.g:5160:1: ( 'then' )
            {
            // InternalMyDsl.g:5160:1: ( 'then' )
            // InternalMyDsl.g:5161:2: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getThenKeyword_5_2()); 
            }
            match(input,75,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getThenKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_5__2__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_5__3"
    // InternalMyDsl.g:5170:1: rule__NonLeftRecExpression__Group_5__3 : rule__NonLeftRecExpression__Group_5__3__Impl rule__NonLeftRecExpression__Group_5__4 ;
    public final void rule__NonLeftRecExpression__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5174:1: ( rule__NonLeftRecExpression__Group_5__3__Impl rule__NonLeftRecExpression__Group_5__4 )
            // InternalMyDsl.g:5175:2: rule__NonLeftRecExpression__Group_5__3__Impl rule__NonLeftRecExpression__Group_5__4
            {
            pushFollow(FOLLOW_38);
            rule__NonLeftRecExpression__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_5__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_5__3"


    // $ANTLR start "rule__NonLeftRecExpression__Group_5__3__Impl"
    // InternalMyDsl.g:5182:1: rule__NonLeftRecExpression__Group_5__3__Impl : ( ruleexpression ) ;
    public final void rule__NonLeftRecExpression__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5186:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:5187:1: ( ruleexpression )
            {
            // InternalMyDsl.g:5187:1: ( ruleexpression )
            // InternalMyDsl.g:5188:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_5_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_5__3__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_5__4"
    // InternalMyDsl.g:5197:1: rule__NonLeftRecExpression__Group_5__4 : rule__NonLeftRecExpression__Group_5__4__Impl rule__NonLeftRecExpression__Group_5__5 ;
    public final void rule__NonLeftRecExpression__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5201:1: ( rule__NonLeftRecExpression__Group_5__4__Impl rule__NonLeftRecExpression__Group_5__5 )
            // InternalMyDsl.g:5202:2: rule__NonLeftRecExpression__Group_5__4__Impl rule__NonLeftRecExpression__Group_5__5
            {
            pushFollow(FOLLOW_28);
            rule__NonLeftRecExpression__Group_5__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_5__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_5__4"


    // $ANTLR start "rule__NonLeftRecExpression__Group_5__4__Impl"
    // InternalMyDsl.g:5209:1: rule__NonLeftRecExpression__Group_5__4__Impl : ( 'else' ) ;
    public final void rule__NonLeftRecExpression__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5213:1: ( ( 'else' ) )
            // InternalMyDsl.g:5214:1: ( 'else' )
            {
            // InternalMyDsl.g:5214:1: ( 'else' )
            // InternalMyDsl.g:5215:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getElseKeyword_5_4()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getElseKeyword_5_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_5__4__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_5__5"
    // InternalMyDsl.g:5224:1: rule__NonLeftRecExpression__Group_5__5 : rule__NonLeftRecExpression__Group_5__5__Impl rule__NonLeftRecExpression__Group_5__6 ;
    public final void rule__NonLeftRecExpression__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5228:1: ( rule__NonLeftRecExpression__Group_5__5__Impl rule__NonLeftRecExpression__Group_5__6 )
            // InternalMyDsl.g:5229:2: rule__NonLeftRecExpression__Group_5__5__Impl rule__NonLeftRecExpression__Group_5__6
            {
            pushFollow(FOLLOW_42);
            rule__NonLeftRecExpression__Group_5__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_5__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_5__5"


    // $ANTLR start "rule__NonLeftRecExpression__Group_5__5__Impl"
    // InternalMyDsl.g:5236:1: rule__NonLeftRecExpression__Group_5__5__Impl : ( ruleexpression ) ;
    public final void rule__NonLeftRecExpression__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5240:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:5241:1: ( ruleexpression )
            {
            // InternalMyDsl.g:5241:1: ( ruleexpression )
            // InternalMyDsl.g:5242:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_5_5()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_5_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_5__5__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_5__6"
    // InternalMyDsl.g:5251:1: rule__NonLeftRecExpression__Group_5__6 : rule__NonLeftRecExpression__Group_5__6__Impl ;
    public final void rule__NonLeftRecExpression__Group_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5255:1: ( rule__NonLeftRecExpression__Group_5__6__Impl )
            // InternalMyDsl.g:5256:2: rule__NonLeftRecExpression__Group_5__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_5__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_5__6"


    // $ANTLR start "rule__NonLeftRecExpression__Group_5__6__Impl"
    // InternalMyDsl.g:5262:1: rule__NonLeftRecExpression__Group_5__6__Impl : ( 'endif' ) ;
    public final void rule__NonLeftRecExpression__Group_5__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5266:1: ( ( 'endif' ) )
            // InternalMyDsl.g:5267:1: ( 'endif' )
            {
            // InternalMyDsl.g:5267:1: ( 'endif' )
            // InternalMyDsl.g:5268:2: 'endif'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getEndifKeyword_5_6()); 
            }
            match(input,76,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getEndifKeyword_5_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_5__6__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_6__0"
    // InternalMyDsl.g:5278:1: rule__NonLeftRecExpression__Group_6__0 : rule__NonLeftRecExpression__Group_6__0__Impl rule__NonLeftRecExpression__Group_6__1 ;
    public final void rule__NonLeftRecExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5282:1: ( rule__NonLeftRecExpression__Group_6__0__Impl rule__NonLeftRecExpression__Group_6__1 )
            // InternalMyDsl.g:5283:2: rule__NonLeftRecExpression__Group_6__0__Impl rule__NonLeftRecExpression__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__NonLeftRecExpression__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_6__0"


    // $ANTLR start "rule__NonLeftRecExpression__Group_6__0__Impl"
    // InternalMyDsl.g:5290:1: rule__NonLeftRecExpression__Group_6__0__Impl : ( 'let' ) ;
    public final void rule__NonLeftRecExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5294:1: ( ( 'let' ) )
            // InternalMyDsl.g:5295:1: ( 'let' )
            {
            // InternalMyDsl.g:5295:1: ( 'let' )
            // InternalMyDsl.g:5296:2: 'let'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getLetKeyword_6_0()); 
            }
            match(input,77,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getLetKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_6__0__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_6__1"
    // InternalMyDsl.g:5305:1: rule__NonLeftRecExpression__Group_6__1 : rule__NonLeftRecExpression__Group_6__1__Impl rule__NonLeftRecExpression__Group_6__2 ;
    public final void rule__NonLeftRecExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5309:1: ( rule__NonLeftRecExpression__Group_6__1__Impl rule__NonLeftRecExpression__Group_6__2 )
            // InternalMyDsl.g:5310:2: rule__NonLeftRecExpression__Group_6__1__Impl rule__NonLeftRecExpression__Group_6__2
            {
            pushFollow(FOLLOW_43);
            rule__NonLeftRecExpression__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_6__1"


    // $ANTLR start "rule__NonLeftRecExpression__Group_6__1__Impl"
    // InternalMyDsl.g:5317:1: rule__NonLeftRecExpression__Group_6__1__Impl : ( rulebinding ) ;
    public final void rule__NonLeftRecExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5321:1: ( ( rulebinding ) )
            // InternalMyDsl.g:5322:1: ( rulebinding )
            {
            // InternalMyDsl.g:5322:1: ( rulebinding )
            // InternalMyDsl.g:5323:2: rulebinding
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getBindingParserRuleCall_6_1()); 
            }
            pushFollow(FOLLOW_2);
            rulebinding();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getBindingParserRuleCall_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_6__1__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_6__2"
    // InternalMyDsl.g:5332:1: rule__NonLeftRecExpression__Group_6__2 : rule__NonLeftRecExpression__Group_6__2__Impl rule__NonLeftRecExpression__Group_6__3 ;
    public final void rule__NonLeftRecExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5336:1: ( rule__NonLeftRecExpression__Group_6__2__Impl rule__NonLeftRecExpression__Group_6__3 )
            // InternalMyDsl.g:5337:2: rule__NonLeftRecExpression__Group_6__2__Impl rule__NonLeftRecExpression__Group_6__3
            {
            pushFollow(FOLLOW_43);
            rule__NonLeftRecExpression__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_6__2"


    // $ANTLR start "rule__NonLeftRecExpression__Group_6__2__Impl"
    // InternalMyDsl.g:5344:1: rule__NonLeftRecExpression__Group_6__2__Impl : ( ( rule__NonLeftRecExpression__Group_6_2__0 )* ) ;
    public final void rule__NonLeftRecExpression__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5348:1: ( ( ( rule__NonLeftRecExpression__Group_6_2__0 )* ) )
            // InternalMyDsl.g:5349:1: ( ( rule__NonLeftRecExpression__Group_6_2__0 )* )
            {
            // InternalMyDsl.g:5349:1: ( ( rule__NonLeftRecExpression__Group_6_2__0 )* )
            // InternalMyDsl.g:5350:2: ( rule__NonLeftRecExpression__Group_6_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getGroup_6_2()); 
            }
            // InternalMyDsl.g:5351:2: ( rule__NonLeftRecExpression__Group_6_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==59) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:5351:3: rule__NonLeftRecExpression__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__NonLeftRecExpression__Group_6_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getGroup_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_6__2__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_6__3"
    // InternalMyDsl.g:5359:1: rule__NonLeftRecExpression__Group_6__3 : rule__NonLeftRecExpression__Group_6__3__Impl rule__NonLeftRecExpression__Group_6__4 ;
    public final void rule__NonLeftRecExpression__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5363:1: ( rule__NonLeftRecExpression__Group_6__3__Impl rule__NonLeftRecExpression__Group_6__4 )
            // InternalMyDsl.g:5364:2: rule__NonLeftRecExpression__Group_6__3__Impl rule__NonLeftRecExpression__Group_6__4
            {
            pushFollow(FOLLOW_28);
            rule__NonLeftRecExpression__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_6__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_6__3"


    // $ANTLR start "rule__NonLeftRecExpression__Group_6__3__Impl"
    // InternalMyDsl.g:5371:1: rule__NonLeftRecExpression__Group_6__3__Impl : ( 'in' ) ;
    public final void rule__NonLeftRecExpression__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5375:1: ( ( 'in' ) )
            // InternalMyDsl.g:5376:1: ( 'in' )
            {
            // InternalMyDsl.g:5376:1: ( 'in' )
            // InternalMyDsl.g:5377:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getInKeyword_6_3()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getInKeyword_6_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_6__3__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_6__4"
    // InternalMyDsl.g:5386:1: rule__NonLeftRecExpression__Group_6__4 : rule__NonLeftRecExpression__Group_6__4__Impl ;
    public final void rule__NonLeftRecExpression__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5390:1: ( rule__NonLeftRecExpression__Group_6__4__Impl )
            // InternalMyDsl.g:5391:2: rule__NonLeftRecExpression__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_6__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_6__4"


    // $ANTLR start "rule__NonLeftRecExpression__Group_6__4__Impl"
    // InternalMyDsl.g:5397:1: rule__NonLeftRecExpression__Group_6__4__Impl : ( ruleexpression ) ;
    public final void rule__NonLeftRecExpression__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5401:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:5402:1: ( ruleexpression )
            {
            // InternalMyDsl.g:5402:1: ( ruleexpression )
            // InternalMyDsl.g:5403:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_6_4()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_6_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_6__4__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_6_2__0"
    // InternalMyDsl.g:5413:1: rule__NonLeftRecExpression__Group_6_2__0 : rule__NonLeftRecExpression__Group_6_2__0__Impl rule__NonLeftRecExpression__Group_6_2__1 ;
    public final void rule__NonLeftRecExpression__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5417:1: ( rule__NonLeftRecExpression__Group_6_2__0__Impl rule__NonLeftRecExpression__Group_6_2__1 )
            // InternalMyDsl.g:5418:2: rule__NonLeftRecExpression__Group_6_2__0__Impl rule__NonLeftRecExpression__Group_6_2__1
            {
            pushFollow(FOLLOW_3);
            rule__NonLeftRecExpression__Group_6_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_6_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_6_2__0"


    // $ANTLR start "rule__NonLeftRecExpression__Group_6_2__0__Impl"
    // InternalMyDsl.g:5425:1: rule__NonLeftRecExpression__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__NonLeftRecExpression__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5429:1: ( ( ',' ) )
            // InternalMyDsl.g:5430:1: ( ',' )
            {
            // InternalMyDsl.g:5430:1: ( ',' )
            // InternalMyDsl.g:5431:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getCommaKeyword_6_2_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getCommaKeyword_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_6_2__0__Impl"


    // $ANTLR start "rule__NonLeftRecExpression__Group_6_2__1"
    // InternalMyDsl.g:5440:1: rule__NonLeftRecExpression__Group_6_2__1 : rule__NonLeftRecExpression__Group_6_2__1__Impl ;
    public final void rule__NonLeftRecExpression__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5444:1: ( rule__NonLeftRecExpression__Group_6_2__1__Impl )
            // InternalMyDsl.g:5445:2: rule__NonLeftRecExpression__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonLeftRecExpression__Group_6_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_6_2__1"


    // $ANTLR start "rule__NonLeftRecExpression__Group_6_2__1__Impl"
    // InternalMyDsl.g:5451:1: rule__NonLeftRecExpression__Group_6_2__1__Impl : ( rulebinding ) ;
    public final void rule__NonLeftRecExpression__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5455:1: ( ( rulebinding ) )
            // InternalMyDsl.g:5456:1: ( rulebinding )
            {
            // InternalMyDsl.g:5456:1: ( rulebinding )
            // InternalMyDsl.g:5457:2: rulebinding
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonLeftRecExpressionAccess().getBindingParserRuleCall_6_2_1()); 
            }
            pushFollow(FOLLOW_2);
            rulebinding();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonLeftRecExpressionAccess().getBindingParserRuleCall_6_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLeftRecExpression__Group_6_2__1__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalMyDsl.g:5467:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5471:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalMyDsl.g:5472:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Binding__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalMyDsl.g:5479:1: rule__Binding__Group__0__Impl : ( RULE_IDENT ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5483:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:5484:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:5484:1: ( RULE_IDENT )
            // InternalMyDsl.g:5485:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getIdentTerminalRuleCall_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getIdentTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalMyDsl.g:5494:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5498:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalMyDsl.g:5499:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__Binding__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalMyDsl.g:5506:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__Group_1__0 )? ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5510:1: ( ( ( rule__Binding__Group_1__0 )? ) )
            // InternalMyDsl.g:5511:1: ( ( rule__Binding__Group_1__0 )? )
            {
            // InternalMyDsl.g:5511:1: ( ( rule__Binding__Group_1__0 )? )
            // InternalMyDsl.g:5512:2: ( rule__Binding__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getGroup_1()); 
            }
            // InternalMyDsl.g:5513:2: ( rule__Binding__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==78) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:5513:3: rule__Binding__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Binding__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // InternalMyDsl.g:5521:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5525:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalMyDsl.g:5526:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Binding__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2"


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // InternalMyDsl.g:5533:1: rule__Binding__Group__2__Impl : ( '=' ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5537:1: ( ( '=' ) )
            // InternalMyDsl.g:5538:1: ( '=' )
            {
            // InternalMyDsl.g:5538:1: ( '=' )
            // InternalMyDsl.g:5539:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getEqualsSignKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__Binding__Group__3"
    // InternalMyDsl.g:5548:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5552:1: ( rule__Binding__Group__3__Impl )
            // InternalMyDsl.g:5553:2: rule__Binding__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3"


    // $ANTLR start "rule__Binding__Group__3__Impl"
    // InternalMyDsl.g:5559:1: rule__Binding__Group__3__Impl : ( ruleexpression ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5563:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:5564:1: ( ruleexpression )
            {
            // InternalMyDsl.g:5564:1: ( ruleexpression )
            // InternalMyDsl.g:5565:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getExpressionParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getExpressionParserRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3__Impl"


    // $ANTLR start "rule__Binding__Group_1__0"
    // InternalMyDsl.g:5575:1: rule__Binding__Group_1__0 : rule__Binding__Group_1__0__Impl rule__Binding__Group_1__1 ;
    public final void rule__Binding__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5579:1: ( rule__Binding__Group_1__0__Impl rule__Binding__Group_1__1 )
            // InternalMyDsl.g:5580:2: rule__Binding__Group_1__0__Impl rule__Binding__Group_1__1
            {
            pushFollow(FOLLOW_45);
            rule__Binding__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group_1__0"


    // $ANTLR start "rule__Binding__Group_1__0__Impl"
    // InternalMyDsl.g:5587:1: rule__Binding__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Binding__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5591:1: ( ( ':' ) )
            // InternalMyDsl.g:5592:1: ( ':' )
            {
            // InternalMyDsl.g:5592:1: ( ':' )
            // InternalMyDsl.g:5593:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getColonKeyword_1_0()); 
            }
            match(input,78,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getColonKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group_1__0__Impl"


    // $ANTLR start "rule__Binding__Group_1__1"
    // InternalMyDsl.g:5602:1: rule__Binding__Group_1__1 : rule__Binding__Group_1__1__Impl ;
    public final void rule__Binding__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5606:1: ( rule__Binding__Group_1__1__Impl )
            // InternalMyDsl.g:5607:2: rule__Binding__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group_1__1"


    // $ANTLR start "rule__Binding__Group_1__1__Impl"
    // InternalMyDsl.g:5613:1: rule__Binding__Group_1__1__Impl : ( ruletypeLiteral ) ;
    public final void rule__Binding__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5617:1: ( ( ruletypeLiteral ) )
            // InternalMyDsl.g:5618:1: ( ruletypeLiteral )
            {
            // InternalMyDsl.g:5618:1: ( ruletypeLiteral )
            // InternalMyDsl.g:5619:2: ruletypeLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getTypeLiteralParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruletypeLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getTypeLiteralParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group_1__1__Impl"


    // $ANTLR start "rule__CallExp__Group_0__0"
    // InternalMyDsl.g:5629:1: rule__CallExp__Group_0__0 : rule__CallExp__Group_0__0__Impl rule__CallExp__Group_0__1 ;
    public final void rule__CallExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5633:1: ( rule__CallExp__Group_0__0__Impl rule__CallExp__Group_0__1 )
            // InternalMyDsl.g:5634:2: rule__CallExp__Group_0__0__Impl rule__CallExp__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__CallExp__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CallExp__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_0__0"


    // $ANTLR start "rule__CallExp__Group_0__0__Impl"
    // InternalMyDsl.g:5641:1: rule__CallExp__Group_0__0__Impl : ( rulecollectionIterator ) ;
    public final void rule__CallExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5645:1: ( ( rulecollectionIterator ) )
            // InternalMyDsl.g:5646:1: ( rulecollectionIterator )
            {
            // InternalMyDsl.g:5646:1: ( rulecollectionIterator )
            // InternalMyDsl.g:5647:2: rulecollectionIterator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallExpAccess().getCollectionIteratorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulecollectionIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallExpAccess().getCollectionIteratorParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_0__0__Impl"


    // $ANTLR start "rule__CallExp__Group_0__1"
    // InternalMyDsl.g:5656:1: rule__CallExp__Group_0__1 : rule__CallExp__Group_0__1__Impl rule__CallExp__Group_0__2 ;
    public final void rule__CallExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5660:1: ( rule__CallExp__Group_0__1__Impl rule__CallExp__Group_0__2 )
            // InternalMyDsl.g:5661:2: rule__CallExp__Group_0__1__Impl rule__CallExp__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__CallExp__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CallExp__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_0__1"


    // $ANTLR start "rule__CallExp__Group_0__1__Impl"
    // InternalMyDsl.g:5668:1: rule__CallExp__Group_0__1__Impl : ( '(' ) ;
    public final void rule__CallExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5672:1: ( ( '(' ) )
            // InternalMyDsl.g:5673:1: ( '(' )
            {
            // InternalMyDsl.g:5673:1: ( '(' )
            // InternalMyDsl.g:5674:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallExpAccess().getLeftParenthesisKeyword_0_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallExpAccess().getLeftParenthesisKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_0__1__Impl"


    // $ANTLR start "rule__CallExp__Group_0__2"
    // InternalMyDsl.g:5683:1: rule__CallExp__Group_0__2 : rule__CallExp__Group_0__2__Impl rule__CallExp__Group_0__3 ;
    public final void rule__CallExp__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5687:1: ( rule__CallExp__Group_0__2__Impl rule__CallExp__Group_0__3 )
            // InternalMyDsl.g:5688:2: rule__CallExp__Group_0__2__Impl rule__CallExp__Group_0__3
            {
            pushFollow(FOLLOW_28);
            rule__CallExp__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CallExp__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_0__2"


    // $ANTLR start "rule__CallExp__Group_0__2__Impl"
    // InternalMyDsl.g:5695:1: rule__CallExp__Group_0__2__Impl : ( rulevariableDefinition ) ;
    public final void rule__CallExp__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5699:1: ( ( rulevariableDefinition ) )
            // InternalMyDsl.g:5700:1: ( rulevariableDefinition )
            {
            // InternalMyDsl.g:5700:1: ( rulevariableDefinition )
            // InternalMyDsl.g:5701:2: rulevariableDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallExpAccess().getVariableDefinitionParserRuleCall_0_2()); 
            }
            pushFollow(FOLLOW_2);
            rulevariableDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallExpAccess().getVariableDefinitionParserRuleCall_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_0__2__Impl"


    // $ANTLR start "rule__CallExp__Group_0__3"
    // InternalMyDsl.g:5710:1: rule__CallExp__Group_0__3 : rule__CallExp__Group_0__3__Impl rule__CallExp__Group_0__4 ;
    public final void rule__CallExp__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5714:1: ( rule__CallExp__Group_0__3__Impl rule__CallExp__Group_0__4 )
            // InternalMyDsl.g:5715:2: rule__CallExp__Group_0__3__Impl rule__CallExp__Group_0__4
            {
            pushFollow(FOLLOW_15);
            rule__CallExp__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CallExp__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_0__3"


    // $ANTLR start "rule__CallExp__Group_0__3__Impl"
    // InternalMyDsl.g:5722:1: rule__CallExp__Group_0__3__Impl : ( rulelambdaExpression ) ;
    public final void rule__CallExp__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5726:1: ( ( rulelambdaExpression ) )
            // InternalMyDsl.g:5727:1: ( rulelambdaExpression )
            {
            // InternalMyDsl.g:5727:1: ( rulelambdaExpression )
            // InternalMyDsl.g:5728:2: rulelambdaExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallExpAccess().getLambdaExpressionParserRuleCall_0_3()); 
            }
            pushFollow(FOLLOW_2);
            rulelambdaExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallExpAccess().getLambdaExpressionParserRuleCall_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_0__3__Impl"


    // $ANTLR start "rule__CallExp__Group_0__4"
    // InternalMyDsl.g:5737:1: rule__CallExp__Group_0__4 : rule__CallExp__Group_0__4__Impl ;
    public final void rule__CallExp__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5741:1: ( rule__CallExp__Group_0__4__Impl )
            // InternalMyDsl.g:5742:2: rule__CallExp__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallExp__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_0__4"


    // $ANTLR start "rule__CallExp__Group_0__4__Impl"
    // InternalMyDsl.g:5748:1: rule__CallExp__Group_0__4__Impl : ( ')' ) ;
    public final void rule__CallExp__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5752:1: ( ( ')' ) )
            // InternalMyDsl.g:5753:1: ( ')' )
            {
            // InternalMyDsl.g:5753:1: ( ')' )
            // InternalMyDsl.g:5754:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallExpAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallExpAccess().getRightParenthesisKeyword_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_0__4__Impl"


    // $ANTLR start "rule__CallExp__Group_1__0"
    // InternalMyDsl.g:5764:1: rule__CallExp__Group_1__0 : rule__CallExp__Group_1__0__Impl rule__CallExp__Group_1__1 ;
    public final void rule__CallExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5768:1: ( rule__CallExp__Group_1__0__Impl rule__CallExp__Group_1__1 )
            // InternalMyDsl.g:5769:2: rule__CallExp__Group_1__0__Impl rule__CallExp__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__CallExp__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CallExp__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_1__0"


    // $ANTLR start "rule__CallExp__Group_1__0__Impl"
    // InternalMyDsl.g:5776:1: rule__CallExp__Group_1__0__Impl : ( RULE_IDENT ) ;
    public final void rule__CallExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5780:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:5781:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:5781:1: ( RULE_IDENT )
            // InternalMyDsl.g:5782:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallExpAccess().getIdentTerminalRuleCall_1_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallExpAccess().getIdentTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_1__0__Impl"


    // $ANTLR start "rule__CallExp__Group_1__1"
    // InternalMyDsl.g:5791:1: rule__CallExp__Group_1__1 : rule__CallExp__Group_1__1__Impl rule__CallExp__Group_1__2 ;
    public final void rule__CallExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5795:1: ( rule__CallExp__Group_1__1__Impl rule__CallExp__Group_1__2 )
            // InternalMyDsl.g:5796:2: rule__CallExp__Group_1__1__Impl rule__CallExp__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__CallExp__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CallExp__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_1__1"


    // $ANTLR start "rule__CallExp__Group_1__1__Impl"
    // InternalMyDsl.g:5803:1: rule__CallExp__Group_1__1__Impl : ( '(' ) ;
    public final void rule__CallExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5807:1: ( ( '(' ) )
            // InternalMyDsl.g:5808:1: ( '(' )
            {
            // InternalMyDsl.g:5808:1: ( '(' )
            // InternalMyDsl.g:5809:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallExpAccess().getLeftParenthesisKeyword_1_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallExpAccess().getLeftParenthesisKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_1__1__Impl"


    // $ANTLR start "rule__CallExp__Group_1__2"
    // InternalMyDsl.g:5818:1: rule__CallExp__Group_1__2 : rule__CallExp__Group_1__2__Impl rule__CallExp__Group_1__3 ;
    public final void rule__CallExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5822:1: ( rule__CallExp__Group_1__2__Impl rule__CallExp__Group_1__3 )
            // InternalMyDsl.g:5823:2: rule__CallExp__Group_1__2__Impl rule__CallExp__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__CallExp__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CallExp__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_1__2"


    // $ANTLR start "rule__CallExp__Group_1__2__Impl"
    // InternalMyDsl.g:5830:1: rule__CallExp__Group_1__2__Impl : ( ruleexpressionSequence ) ;
    public final void rule__CallExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5834:1: ( ( ruleexpressionSequence ) )
            // InternalMyDsl.g:5835:1: ( ruleexpressionSequence )
            {
            // InternalMyDsl.g:5835:1: ( ruleexpressionSequence )
            // InternalMyDsl.g:5836:2: ruleexpressionSequence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallExpAccess().getExpressionSequenceParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpressionSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallExpAccess().getExpressionSequenceParserRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_1__2__Impl"


    // $ANTLR start "rule__CallExp__Group_1__3"
    // InternalMyDsl.g:5845:1: rule__CallExp__Group_1__3 : rule__CallExp__Group_1__3__Impl ;
    public final void rule__CallExp__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5849:1: ( rule__CallExp__Group_1__3__Impl )
            // InternalMyDsl.g:5850:2: rule__CallExp__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallExp__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_1__3"


    // $ANTLR start "rule__CallExp__Group_1__3__Impl"
    // InternalMyDsl.g:5856:1: rule__CallExp__Group_1__3__Impl : ( ')' ) ;
    public final void rule__CallExp__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5860:1: ( ( ')' ) )
            // InternalMyDsl.g:5861:1: ( ')' )
            {
            // InternalMyDsl.g:5861:1: ( ')' )
            // InternalMyDsl.g:5862:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallExpAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallExpAccess().getRightParenthesisKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExp__Group_1__3__Impl"


    // $ANTLR start "rule__ExpressionSequence__Group__0"
    // InternalMyDsl.g:5872:1: rule__ExpressionSequence__Group__0 : rule__ExpressionSequence__Group__0__Impl rule__ExpressionSequence__Group__1 ;
    public final void rule__ExpressionSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5876:1: ( rule__ExpressionSequence__Group__0__Impl rule__ExpressionSequence__Group__1 )
            // InternalMyDsl.g:5877:2: rule__ExpressionSequence__Group__0__Impl rule__ExpressionSequence__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ExpressionSequence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionSequence__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionSequence__Group__0"


    // $ANTLR start "rule__ExpressionSequence__Group__0__Impl"
    // InternalMyDsl.g:5884:1: rule__ExpressionSequence__Group__0__Impl : ( ruleexpression ) ;
    public final void rule__ExpressionSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5888:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:5889:1: ( ruleexpression )
            {
            // InternalMyDsl.g:5889:1: ( ruleexpression )
            // InternalMyDsl.g:5890:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionSequenceAccess().getExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionSequenceAccess().getExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionSequence__Group__0__Impl"


    // $ANTLR start "rule__ExpressionSequence__Group__1"
    // InternalMyDsl.g:5899:1: rule__ExpressionSequence__Group__1 : rule__ExpressionSequence__Group__1__Impl ;
    public final void rule__ExpressionSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5903:1: ( rule__ExpressionSequence__Group__1__Impl )
            // InternalMyDsl.g:5904:2: rule__ExpressionSequence__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionSequence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionSequence__Group__1"


    // $ANTLR start "rule__ExpressionSequence__Group__1__Impl"
    // InternalMyDsl.g:5910:1: rule__ExpressionSequence__Group__1__Impl : ( ( rule__ExpressionSequence__Group_1__0 )* ) ;
    public final void rule__ExpressionSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5914:1: ( ( ( rule__ExpressionSequence__Group_1__0 )* ) )
            // InternalMyDsl.g:5915:1: ( ( rule__ExpressionSequence__Group_1__0 )* )
            {
            // InternalMyDsl.g:5915:1: ( ( rule__ExpressionSequence__Group_1__0 )* )
            // InternalMyDsl.g:5916:2: ( rule__ExpressionSequence__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionSequenceAccess().getGroup_1()); 
            }
            // InternalMyDsl.g:5917:2: ( rule__ExpressionSequence__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==59) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:5917:3: rule__ExpressionSequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ExpressionSequence__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionSequenceAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionSequence__Group__1__Impl"


    // $ANTLR start "rule__ExpressionSequence__Group_1__0"
    // InternalMyDsl.g:5926:1: rule__ExpressionSequence__Group_1__0 : rule__ExpressionSequence__Group_1__0__Impl rule__ExpressionSequence__Group_1__1 ;
    public final void rule__ExpressionSequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5930:1: ( rule__ExpressionSequence__Group_1__0__Impl rule__ExpressionSequence__Group_1__1 )
            // InternalMyDsl.g:5931:2: rule__ExpressionSequence__Group_1__0__Impl rule__ExpressionSequence__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__ExpressionSequence__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionSequence__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionSequence__Group_1__0"


    // $ANTLR start "rule__ExpressionSequence__Group_1__0__Impl"
    // InternalMyDsl.g:5938:1: rule__ExpressionSequence__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ExpressionSequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5942:1: ( ( ',' ) )
            // InternalMyDsl.g:5943:1: ( ',' )
            {
            // InternalMyDsl.g:5943:1: ( ',' )
            // InternalMyDsl.g:5944:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionSequenceAccess().getCommaKeyword_1_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionSequenceAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionSequence__Group_1__0__Impl"


    // $ANTLR start "rule__ExpressionSequence__Group_1__1"
    // InternalMyDsl.g:5953:1: rule__ExpressionSequence__Group_1__1 : rule__ExpressionSequence__Group_1__1__Impl ;
    public final void rule__ExpressionSequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5957:1: ( rule__ExpressionSequence__Group_1__1__Impl )
            // InternalMyDsl.g:5958:2: rule__ExpressionSequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionSequence__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionSequence__Group_1__1"


    // $ANTLR start "rule__ExpressionSequence__Group_1__1__Impl"
    // InternalMyDsl.g:5964:1: rule__ExpressionSequence__Group_1__1__Impl : ( ruleexpression ) ;
    public final void rule__ExpressionSequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5968:1: ( ( ruleexpression ) )
            // InternalMyDsl.g:5969:1: ( ruleexpression )
            {
            // InternalMyDsl.g:5969:1: ( ruleexpression )
            // InternalMyDsl.g:5970:2: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionSequenceAccess().getExpressionParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionSequenceAccess().getExpressionParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionSequence__Group_1__1__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__0"
    // InternalMyDsl.g:5980:1: rule__VariableDefinition__Group__0 : rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1 ;
    public final void rule__VariableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5984:1: ( rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1 )
            // InternalMyDsl.g:5985:2: rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__VariableDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__0"


    // $ANTLR start "rule__VariableDefinition__Group__0__Impl"
    // InternalMyDsl.g:5992:1: rule__VariableDefinition__Group__0__Impl : ( RULE_IDENT ) ;
    public final void rule__VariableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5996:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:5997:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:5997:1: ( RULE_IDENT )
            // InternalMyDsl.g:5998:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDefinitionAccess().getIdentTerminalRuleCall_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDefinitionAccess().getIdentTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__0__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__1"
    // InternalMyDsl.g:6007:1: rule__VariableDefinition__Group__1 : rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2 ;
    public final void rule__VariableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6011:1: ( rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2 )
            // InternalMyDsl.g:6012:2: rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__VariableDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__1"


    // $ANTLR start "rule__VariableDefinition__Group__1__Impl"
    // InternalMyDsl.g:6019:1: rule__VariableDefinition__Group__1__Impl : ( ( rule__VariableDefinition__Group_1__0 )? ) ;
    public final void rule__VariableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6023:1: ( ( ( rule__VariableDefinition__Group_1__0 )? ) )
            // InternalMyDsl.g:6024:1: ( ( rule__VariableDefinition__Group_1__0 )? )
            {
            // InternalMyDsl.g:6024:1: ( ( rule__VariableDefinition__Group_1__0 )? )
            // InternalMyDsl.g:6025:2: ( rule__VariableDefinition__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDefinitionAccess().getGroup_1()); 
            }
            // InternalMyDsl.g:6026:2: ( rule__VariableDefinition__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==78) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:6026:3: rule__VariableDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDefinition__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDefinitionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__1__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__2"
    // InternalMyDsl.g:6034:1: rule__VariableDefinition__Group__2 : rule__VariableDefinition__Group__2__Impl ;
    public final void rule__VariableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6038:1: ( rule__VariableDefinition__Group__2__Impl )
            // InternalMyDsl.g:6039:2: rule__VariableDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__2"


    // $ANTLR start "rule__VariableDefinition__Group__2__Impl"
    // InternalMyDsl.g:6045:1: rule__VariableDefinition__Group__2__Impl : ( '|' ) ;
    public final void rule__VariableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6049:1: ( ( '|' ) )
            // InternalMyDsl.g:6050:1: ( '|' )
            {
            // InternalMyDsl.g:6050:1: ( '|' )
            // InternalMyDsl.g:6051:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDefinitionAccess().getVerticalLineKeyword_2()); 
            }
            match(input,79,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDefinitionAccess().getVerticalLineKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__2__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_1__0"
    // InternalMyDsl.g:6061:1: rule__VariableDefinition__Group_1__0 : rule__VariableDefinition__Group_1__0__Impl rule__VariableDefinition__Group_1__1 ;
    public final void rule__VariableDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6065:1: ( rule__VariableDefinition__Group_1__0__Impl rule__VariableDefinition__Group_1__1 )
            // InternalMyDsl.g:6066:2: rule__VariableDefinition__Group_1__0__Impl rule__VariableDefinition__Group_1__1
            {
            pushFollow(FOLLOW_45);
            rule__VariableDefinition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group_1__0"


    // $ANTLR start "rule__VariableDefinition__Group_1__0__Impl"
    // InternalMyDsl.g:6073:1: rule__VariableDefinition__Group_1__0__Impl : ( ':' ) ;
    public final void rule__VariableDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6077:1: ( ( ':' ) )
            // InternalMyDsl.g:6078:1: ( ':' )
            {
            // InternalMyDsl.g:6078:1: ( ':' )
            // InternalMyDsl.g:6079:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDefinitionAccess().getColonKeyword_1_0()); 
            }
            match(input,78,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDefinitionAccess().getColonKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_1__1"
    // InternalMyDsl.g:6088:1: rule__VariableDefinition__Group_1__1 : rule__VariableDefinition__Group_1__1__Impl ;
    public final void rule__VariableDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6092:1: ( rule__VariableDefinition__Group_1__1__Impl )
            // InternalMyDsl.g:6093:2: rule__VariableDefinition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group_1__1"


    // $ANTLR start "rule__VariableDefinition__Group_1__1__Impl"
    // InternalMyDsl.g:6099:1: rule__VariableDefinition__Group_1__1__Impl : ( ruletypeLiteral ) ;
    public final void rule__VariableDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6103:1: ( ( ruletypeLiteral ) )
            // InternalMyDsl.g:6104:1: ( ruletypeLiteral )
            {
            // InternalMyDsl.g:6104:1: ( ruletypeLiteral )
            // InternalMyDsl.g:6105:2: ruletypeLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDefinitionAccess().getTypeLiteralParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruletypeLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDefinitionAccess().getTypeLiteralParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__Literal__Group_6__0"
    // InternalMyDsl.g:6115:1: rule__Literal__Group_6__0 : rule__Literal__Group_6__0__Impl rule__Literal__Group_6__1 ;
    public final void rule__Literal__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6119:1: ( rule__Literal__Group_6__0__Impl rule__Literal__Group_6__1 )
            // InternalMyDsl.g:6120:2: rule__Literal__Group_6__0__Impl rule__Literal__Group_6__1
            {
            pushFollow(FOLLOW_28);
            rule__Literal__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_6__0"


    // $ANTLR start "rule__Literal__Group_6__0__Impl"
    // InternalMyDsl.g:6127:1: rule__Literal__Group_6__0__Impl : ( 'Sequence{' ) ;
    public final void rule__Literal__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6131:1: ( ( 'Sequence{' ) )
            // InternalMyDsl.g:6132:1: ( 'Sequence{' )
            {
            // InternalMyDsl.g:6132:1: ( 'Sequence{' )
            // InternalMyDsl.g:6133:2: 'Sequence{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getSequenceKeyword_6_0()); 
            }
            match(input,80,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getSequenceKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_6__0__Impl"


    // $ANTLR start "rule__Literal__Group_6__1"
    // InternalMyDsl.g:6142:1: rule__Literal__Group_6__1 : rule__Literal__Group_6__1__Impl rule__Literal__Group_6__2 ;
    public final void rule__Literal__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6146:1: ( rule__Literal__Group_6__1__Impl rule__Literal__Group_6__2 )
            // InternalMyDsl.g:6147:2: rule__Literal__Group_6__1__Impl rule__Literal__Group_6__2
            {
            pushFollow(FOLLOW_47);
            rule__Literal__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_6__1"


    // $ANTLR start "rule__Literal__Group_6__1__Impl"
    // InternalMyDsl.g:6154:1: rule__Literal__Group_6__1__Impl : ( ruleexpressionSequence ) ;
    public final void rule__Literal__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6158:1: ( ( ruleexpressionSequence ) )
            // InternalMyDsl.g:6159:1: ( ruleexpressionSequence )
            {
            // InternalMyDsl.g:6159:1: ( ruleexpressionSequence )
            // InternalMyDsl.g:6160:2: ruleexpressionSequence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getExpressionSequenceParserRuleCall_6_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpressionSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getExpressionSequenceParserRuleCall_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_6__1__Impl"


    // $ANTLR start "rule__Literal__Group_6__2"
    // InternalMyDsl.g:6169:1: rule__Literal__Group_6__2 : rule__Literal__Group_6__2__Impl ;
    public final void rule__Literal__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6173:1: ( rule__Literal__Group_6__2__Impl )
            // InternalMyDsl.g:6174:2: rule__Literal__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_6__2"


    // $ANTLR start "rule__Literal__Group_6__2__Impl"
    // InternalMyDsl.g:6180:1: rule__Literal__Group_6__2__Impl : ( '}' ) ;
    public final void rule__Literal__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6184:1: ( ( '}' ) )
            // InternalMyDsl.g:6185:1: ( '}' )
            {
            // InternalMyDsl.g:6185:1: ( '}' )
            // InternalMyDsl.g:6186:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_6_2()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_6__2__Impl"


    // $ANTLR start "rule__Literal__Group_7__0"
    // InternalMyDsl.g:6196:1: rule__Literal__Group_7__0 : rule__Literal__Group_7__0__Impl rule__Literal__Group_7__1 ;
    public final void rule__Literal__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6200:1: ( rule__Literal__Group_7__0__Impl rule__Literal__Group_7__1 )
            // InternalMyDsl.g:6201:2: rule__Literal__Group_7__0__Impl rule__Literal__Group_7__1
            {
            pushFollow(FOLLOW_28);
            rule__Literal__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_7__0"


    // $ANTLR start "rule__Literal__Group_7__0__Impl"
    // InternalMyDsl.g:6208:1: rule__Literal__Group_7__0__Impl : ( 'OrderedSet{' ) ;
    public final void rule__Literal__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6212:1: ( ( 'OrderedSet{' ) )
            // InternalMyDsl.g:6213:1: ( 'OrderedSet{' )
            {
            // InternalMyDsl.g:6213:1: ( 'OrderedSet{' )
            // InternalMyDsl.g:6214:2: 'OrderedSet{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getOrderedSetKeyword_7_0()); 
            }
            match(input,81,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getOrderedSetKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_7__0__Impl"


    // $ANTLR start "rule__Literal__Group_7__1"
    // InternalMyDsl.g:6223:1: rule__Literal__Group_7__1 : rule__Literal__Group_7__1__Impl rule__Literal__Group_7__2 ;
    public final void rule__Literal__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6227:1: ( rule__Literal__Group_7__1__Impl rule__Literal__Group_7__2 )
            // InternalMyDsl.g:6228:2: rule__Literal__Group_7__1__Impl rule__Literal__Group_7__2
            {
            pushFollow(FOLLOW_47);
            rule__Literal__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_7__1"


    // $ANTLR start "rule__Literal__Group_7__1__Impl"
    // InternalMyDsl.g:6235:1: rule__Literal__Group_7__1__Impl : ( ruleexpressionSequence ) ;
    public final void rule__Literal__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6239:1: ( ( ruleexpressionSequence ) )
            // InternalMyDsl.g:6240:1: ( ruleexpressionSequence )
            {
            // InternalMyDsl.g:6240:1: ( ruleexpressionSequence )
            // InternalMyDsl.g:6241:2: ruleexpressionSequence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getExpressionSequenceParserRuleCall_7_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpressionSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getExpressionSequenceParserRuleCall_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_7__1__Impl"


    // $ANTLR start "rule__Literal__Group_7__2"
    // InternalMyDsl.g:6250:1: rule__Literal__Group_7__2 : rule__Literal__Group_7__2__Impl ;
    public final void rule__Literal__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6254:1: ( rule__Literal__Group_7__2__Impl )
            // InternalMyDsl.g:6255:2: rule__Literal__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_7__2"


    // $ANTLR start "rule__Literal__Group_7__2__Impl"
    // InternalMyDsl.g:6261:1: rule__Literal__Group_7__2__Impl : ( '}' ) ;
    public final void rule__Literal__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6265:1: ( ( '}' ) )
            // InternalMyDsl.g:6266:1: ( '}' )
            {
            // InternalMyDsl.g:6266:1: ( '}' )
            // InternalMyDsl.g:6267:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_7_2()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_7__2__Impl"


    // $ANTLR start "rule__Literal__Group_8__0"
    // InternalMyDsl.g:6277:1: rule__Literal__Group_8__0 : rule__Literal__Group_8__0__Impl rule__Literal__Group_8__1 ;
    public final void rule__Literal__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6281:1: ( rule__Literal__Group_8__0__Impl rule__Literal__Group_8__1 )
            // InternalMyDsl.g:6282:2: rule__Literal__Group_8__0__Impl rule__Literal__Group_8__1
            {
            pushFollow(FOLLOW_48);
            rule__Literal__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_8__0"


    // $ANTLR start "rule__Literal__Group_8__0__Impl"
    // InternalMyDsl.g:6289:1: rule__Literal__Group_8__0__Impl : ( RULE_IDENT ) ;
    public final void rule__Literal__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6293:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:6294:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:6294:1: ( RULE_IDENT )
            // InternalMyDsl.g:6295:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_8_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_8__0__Impl"


    // $ANTLR start "rule__Literal__Group_8__1"
    // InternalMyDsl.g:6304:1: rule__Literal__Group_8__1 : rule__Literal__Group_8__1__Impl rule__Literal__Group_8__2 ;
    public final void rule__Literal__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6308:1: ( rule__Literal__Group_8__1__Impl rule__Literal__Group_8__2 )
            // InternalMyDsl.g:6309:2: rule__Literal__Group_8__1__Impl rule__Literal__Group_8__2
            {
            pushFollow(FOLLOW_3);
            rule__Literal__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_8__1"


    // $ANTLR start "rule__Literal__Group_8__1__Impl"
    // InternalMyDsl.g:6316:1: rule__Literal__Group_8__1__Impl : ( '::' ) ;
    public final void rule__Literal__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6320:1: ( ( '::' ) )
            // InternalMyDsl.g:6321:1: ( '::' )
            {
            // InternalMyDsl.g:6321:1: ( '::' )
            // InternalMyDsl.g:6322:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getColonColonKeyword_8_1()); 
            }
            match(input,82,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getColonColonKeyword_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_8__1__Impl"


    // $ANTLR start "rule__Literal__Group_8__2"
    // InternalMyDsl.g:6331:1: rule__Literal__Group_8__2 : rule__Literal__Group_8__2__Impl rule__Literal__Group_8__3 ;
    public final void rule__Literal__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6335:1: ( rule__Literal__Group_8__2__Impl rule__Literal__Group_8__3 )
            // InternalMyDsl.g:6336:2: rule__Literal__Group_8__2__Impl rule__Literal__Group_8__3
            {
            pushFollow(FOLLOW_48);
            rule__Literal__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_8__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_8__2"


    // $ANTLR start "rule__Literal__Group_8__2__Impl"
    // InternalMyDsl.g:6343:1: rule__Literal__Group_8__2__Impl : ( RULE_IDENT ) ;
    public final void rule__Literal__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6347:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:6348:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:6348:1: ( RULE_IDENT )
            // InternalMyDsl.g:6349:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_8_2()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_8_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_8__2__Impl"


    // $ANTLR start "rule__Literal__Group_8__3"
    // InternalMyDsl.g:6358:1: rule__Literal__Group_8__3 : rule__Literal__Group_8__3__Impl rule__Literal__Group_8__4 ;
    public final void rule__Literal__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6362:1: ( rule__Literal__Group_8__3__Impl rule__Literal__Group_8__4 )
            // InternalMyDsl.g:6363:2: rule__Literal__Group_8__3__Impl rule__Literal__Group_8__4
            {
            pushFollow(FOLLOW_3);
            rule__Literal__Group_8__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_8__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_8__3"


    // $ANTLR start "rule__Literal__Group_8__3__Impl"
    // InternalMyDsl.g:6370:1: rule__Literal__Group_8__3__Impl : ( '::' ) ;
    public final void rule__Literal__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6374:1: ( ( '::' ) )
            // InternalMyDsl.g:6375:1: ( '::' )
            {
            // InternalMyDsl.g:6375:1: ( '::' )
            // InternalMyDsl.g:6376:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getColonColonKeyword_8_3()); 
            }
            match(input,82,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getColonColonKeyword_8_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_8__3__Impl"


    // $ANTLR start "rule__Literal__Group_8__4"
    // InternalMyDsl.g:6385:1: rule__Literal__Group_8__4 : rule__Literal__Group_8__4__Impl ;
    public final void rule__Literal__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6389:1: ( rule__Literal__Group_8__4__Impl )
            // InternalMyDsl.g:6390:2: rule__Literal__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group_8__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_8__4"


    // $ANTLR start "rule__Literal__Group_8__4__Impl"
    // InternalMyDsl.g:6396:1: rule__Literal__Group_8__4__Impl : ( RULE_IDENT ) ;
    public final void rule__Literal__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6400:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:6401:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:6401:1: ( RULE_IDENT )
            // InternalMyDsl.g:6402:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_8_4()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_8_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_8__4__Impl"


    // $ANTLR start "rule__Literal__Group_9__0"
    // InternalMyDsl.g:6412:1: rule__Literal__Group_9__0 : rule__Literal__Group_9__0__Impl rule__Literal__Group_9__1 ;
    public final void rule__Literal__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6416:1: ( rule__Literal__Group_9__0__Impl rule__Literal__Group_9__1 )
            // InternalMyDsl.g:6417:2: rule__Literal__Group_9__0__Impl rule__Literal__Group_9__1
            {
            pushFollow(FOLLOW_48);
            rule__Literal__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_9__0"


    // $ANTLR start "rule__Literal__Group_9__0__Impl"
    // InternalMyDsl.g:6424:1: rule__Literal__Group_9__0__Impl : ( RULE_IDENT ) ;
    public final void rule__Literal__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6428:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:6429:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:6429:1: ( RULE_IDENT )
            // InternalMyDsl.g:6430:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_9_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_9__0__Impl"


    // $ANTLR start "rule__Literal__Group_9__1"
    // InternalMyDsl.g:6439:1: rule__Literal__Group_9__1 : rule__Literal__Group_9__1__Impl rule__Literal__Group_9__2 ;
    public final void rule__Literal__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6443:1: ( rule__Literal__Group_9__1__Impl rule__Literal__Group_9__2 )
            // InternalMyDsl.g:6444:2: rule__Literal__Group_9__1__Impl rule__Literal__Group_9__2
            {
            pushFollow(FOLLOW_3);
            rule__Literal__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_9__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_9__1"


    // $ANTLR start "rule__Literal__Group_9__1__Impl"
    // InternalMyDsl.g:6451:1: rule__Literal__Group_9__1__Impl : ( '::' ) ;
    public final void rule__Literal__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6455:1: ( ( '::' ) )
            // InternalMyDsl.g:6456:1: ( '::' )
            {
            // InternalMyDsl.g:6456:1: ( '::' )
            // InternalMyDsl.g:6457:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getColonColonKeyword_9_1()); 
            }
            match(input,82,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getColonColonKeyword_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_9__1__Impl"


    // $ANTLR start "rule__Literal__Group_9__2"
    // InternalMyDsl.g:6466:1: rule__Literal__Group_9__2 : rule__Literal__Group_9__2__Impl rule__Literal__Group_9__3 ;
    public final void rule__Literal__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6470:1: ( rule__Literal__Group_9__2__Impl rule__Literal__Group_9__3 )
            // InternalMyDsl.g:6471:2: rule__Literal__Group_9__2__Impl rule__Literal__Group_9__3
            {
            pushFollow(FOLLOW_49);
            rule__Literal__Group_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_9__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_9__2"


    // $ANTLR start "rule__Literal__Group_9__2__Impl"
    // InternalMyDsl.g:6478:1: rule__Literal__Group_9__2__Impl : ( RULE_IDENT ) ;
    public final void rule__Literal__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6482:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:6483:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:6483:1: ( RULE_IDENT )
            // InternalMyDsl.g:6484:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_9_2()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_9_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_9__2__Impl"


    // $ANTLR start "rule__Literal__Group_9__3"
    // InternalMyDsl.g:6493:1: rule__Literal__Group_9__3 : rule__Literal__Group_9__3__Impl ;
    public final void rule__Literal__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6497:1: ( rule__Literal__Group_9__3__Impl )
            // InternalMyDsl.g:6498:2: rule__Literal__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group_9__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_9__3"


    // $ANTLR start "rule__Literal__Group_9__3__Impl"
    // InternalMyDsl.g:6504:1: rule__Literal__Group_9__3__Impl : ( ':' ) ;
    public final void rule__Literal__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6508:1: ( ( ':' ) )
            // InternalMyDsl.g:6509:1: ( ':' )
            {
            // InternalMyDsl.g:6509:1: ( ':' )
            // InternalMyDsl.g:6510:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getColonKeyword_9_3()); 
            }
            match(input,78,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getColonKeyword_9_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_9__3__Impl"


    // $ANTLR start "rule__TypeLiteral__Group_4__0"
    // InternalMyDsl.g:6520:1: rule__TypeLiteral__Group_4__0 : rule__TypeLiteral__Group_4__0__Impl rule__TypeLiteral__Group_4__1 ;
    public final void rule__TypeLiteral__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6524:1: ( rule__TypeLiteral__Group_4__0__Impl rule__TypeLiteral__Group_4__1 )
            // InternalMyDsl.g:6525:2: rule__TypeLiteral__Group_4__0__Impl rule__TypeLiteral__Group_4__1
            {
            pushFollow(FOLLOW_45);
            rule__TypeLiteral__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeLiteral__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_4__0"


    // $ANTLR start "rule__TypeLiteral__Group_4__0__Impl"
    // InternalMyDsl.g:6532:1: rule__TypeLiteral__Group_4__0__Impl : ( 'Sequence(' ) ;
    public final void rule__TypeLiteral__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6536:1: ( ( 'Sequence(' ) )
            // InternalMyDsl.g:6537:1: ( 'Sequence(' )
            {
            // InternalMyDsl.g:6537:1: ( 'Sequence(' )
            // InternalMyDsl.g:6538:2: 'Sequence('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLiteralAccess().getSequenceKeyword_4_0()); 
            }
            match(input,83,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLiteralAccess().getSequenceKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_4__0__Impl"


    // $ANTLR start "rule__TypeLiteral__Group_4__1"
    // InternalMyDsl.g:6547:1: rule__TypeLiteral__Group_4__1 : rule__TypeLiteral__Group_4__1__Impl rule__TypeLiteral__Group_4__2 ;
    public final void rule__TypeLiteral__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6551:1: ( rule__TypeLiteral__Group_4__1__Impl rule__TypeLiteral__Group_4__2 )
            // InternalMyDsl.g:6552:2: rule__TypeLiteral__Group_4__1__Impl rule__TypeLiteral__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__TypeLiteral__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeLiteral__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_4__1"


    // $ANTLR start "rule__TypeLiteral__Group_4__1__Impl"
    // InternalMyDsl.g:6559:1: rule__TypeLiteral__Group_4__1__Impl : ( ruletypeLiteral ) ;
    public final void rule__TypeLiteral__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6563:1: ( ( ruletypeLiteral ) )
            // InternalMyDsl.g:6564:1: ( ruletypeLiteral )
            {
            // InternalMyDsl.g:6564:1: ( ruletypeLiteral )
            // InternalMyDsl.g:6565:2: ruletypeLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLiteralAccess().getTypeLiteralParserRuleCall_4_1()); 
            }
            pushFollow(FOLLOW_2);
            ruletypeLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLiteralAccess().getTypeLiteralParserRuleCall_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_4__1__Impl"


    // $ANTLR start "rule__TypeLiteral__Group_4__2"
    // InternalMyDsl.g:6574:1: rule__TypeLiteral__Group_4__2 : rule__TypeLiteral__Group_4__2__Impl ;
    public final void rule__TypeLiteral__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6578:1: ( rule__TypeLiteral__Group_4__2__Impl )
            // InternalMyDsl.g:6579:2: rule__TypeLiteral__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeLiteral__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_4__2"


    // $ANTLR start "rule__TypeLiteral__Group_4__2__Impl"
    // InternalMyDsl.g:6585:1: rule__TypeLiteral__Group_4__2__Impl : ( ')' ) ;
    public final void rule__TypeLiteral__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6589:1: ( ( ')' ) )
            // InternalMyDsl.g:6590:1: ( ')' )
            {
            // InternalMyDsl.g:6590:1: ( ')' )
            // InternalMyDsl.g:6591:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLiteralAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLiteralAccess().getRightParenthesisKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_4__2__Impl"


    // $ANTLR start "rule__TypeLiteral__Group_5__0"
    // InternalMyDsl.g:6601:1: rule__TypeLiteral__Group_5__0 : rule__TypeLiteral__Group_5__0__Impl rule__TypeLiteral__Group_5__1 ;
    public final void rule__TypeLiteral__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6605:1: ( rule__TypeLiteral__Group_5__0__Impl rule__TypeLiteral__Group_5__1 )
            // InternalMyDsl.g:6606:2: rule__TypeLiteral__Group_5__0__Impl rule__TypeLiteral__Group_5__1
            {
            pushFollow(FOLLOW_45);
            rule__TypeLiteral__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeLiteral__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_5__0"


    // $ANTLR start "rule__TypeLiteral__Group_5__0__Impl"
    // InternalMyDsl.g:6613:1: rule__TypeLiteral__Group_5__0__Impl : ( 'OrderedSet(' ) ;
    public final void rule__TypeLiteral__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6617:1: ( ( 'OrderedSet(' ) )
            // InternalMyDsl.g:6618:1: ( 'OrderedSet(' )
            {
            // InternalMyDsl.g:6618:1: ( 'OrderedSet(' )
            // InternalMyDsl.g:6619:2: 'OrderedSet('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLiteralAccess().getOrderedSetKeyword_5_0()); 
            }
            match(input,84,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLiteralAccess().getOrderedSetKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_5__0__Impl"


    // $ANTLR start "rule__TypeLiteral__Group_5__1"
    // InternalMyDsl.g:6628:1: rule__TypeLiteral__Group_5__1 : rule__TypeLiteral__Group_5__1__Impl rule__TypeLiteral__Group_5__2 ;
    public final void rule__TypeLiteral__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6632:1: ( rule__TypeLiteral__Group_5__1__Impl rule__TypeLiteral__Group_5__2 )
            // InternalMyDsl.g:6633:2: rule__TypeLiteral__Group_5__1__Impl rule__TypeLiteral__Group_5__2
            {
            pushFollow(FOLLOW_15);
            rule__TypeLiteral__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeLiteral__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_5__1"


    // $ANTLR start "rule__TypeLiteral__Group_5__1__Impl"
    // InternalMyDsl.g:6640:1: rule__TypeLiteral__Group_5__1__Impl : ( ruletypeLiteral ) ;
    public final void rule__TypeLiteral__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6644:1: ( ( ruletypeLiteral ) )
            // InternalMyDsl.g:6645:1: ( ruletypeLiteral )
            {
            // InternalMyDsl.g:6645:1: ( ruletypeLiteral )
            // InternalMyDsl.g:6646:2: ruletypeLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLiteralAccess().getTypeLiteralParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_2);
            ruletypeLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLiteralAccess().getTypeLiteralParserRuleCall_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_5__1__Impl"


    // $ANTLR start "rule__TypeLiteral__Group_5__2"
    // InternalMyDsl.g:6655:1: rule__TypeLiteral__Group_5__2 : rule__TypeLiteral__Group_5__2__Impl ;
    public final void rule__TypeLiteral__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6659:1: ( rule__TypeLiteral__Group_5__2__Impl )
            // InternalMyDsl.g:6660:2: rule__TypeLiteral__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeLiteral__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_5__2"


    // $ANTLR start "rule__TypeLiteral__Group_5__2__Impl"
    // InternalMyDsl.g:6666:1: rule__TypeLiteral__Group_5__2__Impl : ( ')' ) ;
    public final void rule__TypeLiteral__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6670:1: ( ( ')' ) )
            // InternalMyDsl.g:6671:1: ( ')' )
            {
            // InternalMyDsl.g:6671:1: ( ')' )
            // InternalMyDsl.g:6672:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLiteralAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLiteralAccess().getRightParenthesisKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_5__2__Impl"


    // $ANTLR start "rule__TypeLiteral__Group_7__0"
    // InternalMyDsl.g:6682:1: rule__TypeLiteral__Group_7__0 : rule__TypeLiteral__Group_7__0__Impl rule__TypeLiteral__Group_7__1 ;
    public final void rule__TypeLiteral__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6686:1: ( rule__TypeLiteral__Group_7__0__Impl rule__TypeLiteral__Group_7__1 )
            // InternalMyDsl.g:6687:2: rule__TypeLiteral__Group_7__0__Impl rule__TypeLiteral__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__TypeLiteral__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeLiteral__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_7__0"


    // $ANTLR start "rule__TypeLiteral__Group_7__0__Impl"
    // InternalMyDsl.g:6694:1: rule__TypeLiteral__Group_7__0__Impl : ( '{' ) ;
    public final void rule__TypeLiteral__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6698:1: ( ( '{' ) )
            // InternalMyDsl.g:6699:1: ( '{' )
            {
            // InternalMyDsl.g:6699:1: ( '{' )
            // InternalMyDsl.g:6700:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLiteralAccess().getLeftCurlyBracketKeyword_7_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLiteralAccess().getLeftCurlyBracketKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_7__0__Impl"


    // $ANTLR start "rule__TypeLiteral__Group_7__1"
    // InternalMyDsl.g:6709:1: rule__TypeLiteral__Group_7__1 : rule__TypeLiteral__Group_7__1__Impl rule__TypeLiteral__Group_7__2 ;
    public final void rule__TypeLiteral__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6713:1: ( rule__TypeLiteral__Group_7__1__Impl rule__TypeLiteral__Group_7__2 )
            // InternalMyDsl.g:6714:2: rule__TypeLiteral__Group_7__1__Impl rule__TypeLiteral__Group_7__2
            {
            pushFollow(FOLLOW_50);
            rule__TypeLiteral__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeLiteral__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_7__1"


    // $ANTLR start "rule__TypeLiteral__Group_7__1__Impl"
    // InternalMyDsl.g:6721:1: rule__TypeLiteral__Group_7__1__Impl : ( ruleclassifierTypeRule ) ;
    public final void rule__TypeLiteral__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6725:1: ( ( ruleclassifierTypeRule ) )
            // InternalMyDsl.g:6726:1: ( ruleclassifierTypeRule )
            {
            // InternalMyDsl.g:6726:1: ( ruleclassifierTypeRule )
            // InternalMyDsl.g:6727:2: ruleclassifierTypeRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLiteralAccess().getClassifierTypeRuleParserRuleCall_7_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleclassifierTypeRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLiteralAccess().getClassifierTypeRuleParserRuleCall_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_7__1__Impl"


    // $ANTLR start "rule__TypeLiteral__Group_7__2"
    // InternalMyDsl.g:6736:1: rule__TypeLiteral__Group_7__2 : rule__TypeLiteral__Group_7__2__Impl rule__TypeLiteral__Group_7__3 ;
    public final void rule__TypeLiteral__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6740:1: ( rule__TypeLiteral__Group_7__2__Impl rule__TypeLiteral__Group_7__3 )
            // InternalMyDsl.g:6741:2: rule__TypeLiteral__Group_7__2__Impl rule__TypeLiteral__Group_7__3
            {
            pushFollow(FOLLOW_50);
            rule__TypeLiteral__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeLiteral__Group_7__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_7__2"


    // $ANTLR start "rule__TypeLiteral__Group_7__2__Impl"
    // InternalMyDsl.g:6748:1: rule__TypeLiteral__Group_7__2__Impl : ( ( rule__TypeLiteral__Group_7_2__0 )* ) ;
    public final void rule__TypeLiteral__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6752:1: ( ( ( rule__TypeLiteral__Group_7_2__0 )* ) )
            // InternalMyDsl.g:6753:1: ( ( rule__TypeLiteral__Group_7_2__0 )* )
            {
            // InternalMyDsl.g:6753:1: ( ( rule__TypeLiteral__Group_7_2__0 )* )
            // InternalMyDsl.g:6754:2: ( rule__TypeLiteral__Group_7_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLiteralAccess().getGroup_7_2()); 
            }
            // InternalMyDsl.g:6755:2: ( rule__TypeLiteral__Group_7_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==79) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMyDsl.g:6755:3: rule__TypeLiteral__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__TypeLiteral__Group_7_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLiteralAccess().getGroup_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_7__2__Impl"


    // $ANTLR start "rule__TypeLiteral__Group_7__3"
    // InternalMyDsl.g:6763:1: rule__TypeLiteral__Group_7__3 : rule__TypeLiteral__Group_7__3__Impl ;
    public final void rule__TypeLiteral__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6767:1: ( rule__TypeLiteral__Group_7__3__Impl )
            // InternalMyDsl.g:6768:2: rule__TypeLiteral__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeLiteral__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_7__3"


    // $ANTLR start "rule__TypeLiteral__Group_7__3__Impl"
    // InternalMyDsl.g:6774:1: rule__TypeLiteral__Group_7__3__Impl : ( '}' ) ;
    public final void rule__TypeLiteral__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6778:1: ( ( '}' ) )
            // InternalMyDsl.g:6779:1: ( '}' )
            {
            // InternalMyDsl.g:6779:1: ( '}' )
            // InternalMyDsl.g:6780:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLiteralAccess().getRightCurlyBracketKeyword_7_3()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLiteralAccess().getRightCurlyBracketKeyword_7_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_7__3__Impl"


    // $ANTLR start "rule__TypeLiteral__Group_7_2__0"
    // InternalMyDsl.g:6790:1: rule__TypeLiteral__Group_7_2__0 : rule__TypeLiteral__Group_7_2__0__Impl rule__TypeLiteral__Group_7_2__1 ;
    public final void rule__TypeLiteral__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6794:1: ( rule__TypeLiteral__Group_7_2__0__Impl rule__TypeLiteral__Group_7_2__1 )
            // InternalMyDsl.g:6795:2: rule__TypeLiteral__Group_7_2__0__Impl rule__TypeLiteral__Group_7_2__1
            {
            pushFollow(FOLLOW_3);
            rule__TypeLiteral__Group_7_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeLiteral__Group_7_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_7_2__0"


    // $ANTLR start "rule__TypeLiteral__Group_7_2__0__Impl"
    // InternalMyDsl.g:6802:1: rule__TypeLiteral__Group_7_2__0__Impl : ( '|' ) ;
    public final void rule__TypeLiteral__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6806:1: ( ( '|' ) )
            // InternalMyDsl.g:6807:1: ( '|' )
            {
            // InternalMyDsl.g:6807:1: ( '|' )
            // InternalMyDsl.g:6808:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLiteralAccess().getVerticalLineKeyword_7_2_0()); 
            }
            match(input,79,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLiteralAccess().getVerticalLineKeyword_7_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_7_2__0__Impl"


    // $ANTLR start "rule__TypeLiteral__Group_7_2__1"
    // InternalMyDsl.g:6817:1: rule__TypeLiteral__Group_7_2__1 : rule__TypeLiteral__Group_7_2__1__Impl ;
    public final void rule__TypeLiteral__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6821:1: ( rule__TypeLiteral__Group_7_2__1__Impl )
            // InternalMyDsl.g:6822:2: rule__TypeLiteral__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeLiteral__Group_7_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_7_2__1"


    // $ANTLR start "rule__TypeLiteral__Group_7_2__1__Impl"
    // InternalMyDsl.g:6828:1: rule__TypeLiteral__Group_7_2__1__Impl : ( ruleclassifierTypeRule ) ;
    public final void rule__TypeLiteral__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6832:1: ( ( ruleclassifierTypeRule ) )
            // InternalMyDsl.g:6833:1: ( ruleclassifierTypeRule )
            {
            // InternalMyDsl.g:6833:1: ( ruleclassifierTypeRule )
            // InternalMyDsl.g:6834:2: ruleclassifierTypeRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeLiteralAccess().getClassifierTypeRuleParserRuleCall_7_2_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleclassifierTypeRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeLiteralAccess().getClassifierTypeRuleParserRuleCall_7_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Group_7_2__1__Impl"


    // $ANTLR start "rule__ClassifierTypeRule__Group_0__0"
    // InternalMyDsl.g:6844:1: rule__ClassifierTypeRule__Group_0__0 : rule__ClassifierTypeRule__Group_0__0__Impl rule__ClassifierTypeRule__Group_0__1 ;
    public final void rule__ClassifierTypeRule__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6848:1: ( rule__ClassifierTypeRule__Group_0__0__Impl rule__ClassifierTypeRule__Group_0__1 )
            // InternalMyDsl.g:6849:2: rule__ClassifierTypeRule__Group_0__0__Impl rule__ClassifierTypeRule__Group_0__1
            {
            pushFollow(FOLLOW_48);
            rule__ClassifierTypeRule__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ClassifierTypeRule__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierTypeRule__Group_0__0"


    // $ANTLR start "rule__ClassifierTypeRule__Group_0__0__Impl"
    // InternalMyDsl.g:6856:1: rule__ClassifierTypeRule__Group_0__0__Impl : ( RULE_IDENT ) ;
    public final void rule__ClassifierTypeRule__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6860:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:6861:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:6861:1: ( RULE_IDENT )
            // InternalMyDsl.g:6862:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierTypeRuleAccess().getIdentTerminalRuleCall_0_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierTypeRuleAccess().getIdentTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierTypeRule__Group_0__0__Impl"


    // $ANTLR start "rule__ClassifierTypeRule__Group_0__1"
    // InternalMyDsl.g:6871:1: rule__ClassifierTypeRule__Group_0__1 : rule__ClassifierTypeRule__Group_0__1__Impl rule__ClassifierTypeRule__Group_0__2 ;
    public final void rule__ClassifierTypeRule__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6875:1: ( rule__ClassifierTypeRule__Group_0__1__Impl rule__ClassifierTypeRule__Group_0__2 )
            // InternalMyDsl.g:6876:2: rule__ClassifierTypeRule__Group_0__1__Impl rule__ClassifierTypeRule__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__ClassifierTypeRule__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ClassifierTypeRule__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierTypeRule__Group_0__1"


    // $ANTLR start "rule__ClassifierTypeRule__Group_0__1__Impl"
    // InternalMyDsl.g:6883:1: rule__ClassifierTypeRule__Group_0__1__Impl : ( '::' ) ;
    public final void rule__ClassifierTypeRule__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6887:1: ( ( '::' ) )
            // InternalMyDsl.g:6888:1: ( '::' )
            {
            // InternalMyDsl.g:6888:1: ( '::' )
            // InternalMyDsl.g:6889:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierTypeRuleAccess().getColonColonKeyword_0_1()); 
            }
            match(input,82,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierTypeRuleAccess().getColonColonKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierTypeRule__Group_0__1__Impl"


    // $ANTLR start "rule__ClassifierTypeRule__Group_0__2"
    // InternalMyDsl.g:6898:1: rule__ClassifierTypeRule__Group_0__2 : rule__ClassifierTypeRule__Group_0__2__Impl ;
    public final void rule__ClassifierTypeRule__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6902:1: ( rule__ClassifierTypeRule__Group_0__2__Impl )
            // InternalMyDsl.g:6903:2: rule__ClassifierTypeRule__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassifierTypeRule__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierTypeRule__Group_0__2"


    // $ANTLR start "rule__ClassifierTypeRule__Group_0__2__Impl"
    // InternalMyDsl.g:6909:1: rule__ClassifierTypeRule__Group_0__2__Impl : ( RULE_IDENT ) ;
    public final void rule__ClassifierTypeRule__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6913:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:6914:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:6914:1: ( RULE_IDENT )
            // InternalMyDsl.g:6915:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierTypeRuleAccess().getIdentTerminalRuleCall_0_2()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierTypeRuleAccess().getIdentTerminalRuleCall_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierTypeRule__Group_0__2__Impl"


    // $ANTLR start "rule__ClassifierTypeRule__Group_1__0"
    // InternalMyDsl.g:6925:1: rule__ClassifierTypeRule__Group_1__0 : rule__ClassifierTypeRule__Group_1__0__Impl rule__ClassifierTypeRule__Group_1__1 ;
    public final void rule__ClassifierTypeRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6929:1: ( rule__ClassifierTypeRule__Group_1__0__Impl rule__ClassifierTypeRule__Group_1__1 )
            // InternalMyDsl.g:6930:2: rule__ClassifierTypeRule__Group_1__0__Impl rule__ClassifierTypeRule__Group_1__1
            {
            pushFollow(FOLLOW_49);
            rule__ClassifierTypeRule__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ClassifierTypeRule__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierTypeRule__Group_1__0"


    // $ANTLR start "rule__ClassifierTypeRule__Group_1__0__Impl"
    // InternalMyDsl.g:6937:1: rule__ClassifierTypeRule__Group_1__0__Impl : ( RULE_IDENT ) ;
    public final void rule__ClassifierTypeRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6941:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:6942:1: ( RULE_IDENT )
            {
            // InternalMyDsl.g:6942:1: ( RULE_IDENT )
            // InternalMyDsl.g:6943:2: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierTypeRuleAccess().getIdentTerminalRuleCall_1_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierTypeRuleAccess().getIdentTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierTypeRule__Group_1__0__Impl"


    // $ANTLR start "rule__ClassifierTypeRule__Group_1__1"
    // InternalMyDsl.g:6952:1: rule__ClassifierTypeRule__Group_1__1 : rule__ClassifierTypeRule__Group_1__1__Impl ;
    public final void rule__ClassifierTypeRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6956:1: ( rule__ClassifierTypeRule__Group_1__1__Impl )
            // InternalMyDsl.g:6957:2: rule__ClassifierTypeRule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassifierTypeRule__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierTypeRule__Group_1__1"


    // $ANTLR start "rule__ClassifierTypeRule__Group_1__1__Impl"
    // InternalMyDsl.g:6963:1: rule__ClassifierTypeRule__Group_1__1__Impl : ( ':' ) ;
    public final void rule__ClassifierTypeRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6967:1: ( ( ':' ) )
            // InternalMyDsl.g:6968:1: ( ':' )
            {
            // InternalMyDsl.g:6968:1: ( ':' )
            // InternalMyDsl.g:6969:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierTypeRuleAccess().getColonKeyword_1_1()); 
            }
            match(input,78,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierTypeRuleAccess().getColonKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierTypeRule__Group_1__1__Impl"


    // $ANTLR start "rule__RRoot__BehaviourAssignment_1"
    // InternalMyDsl.g:6979:1: rule__RRoot__BehaviourAssignment_1 : ( ruleQualified ) ;
    public final void rule__RRoot__BehaviourAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6983:1: ( ( ruleQualified ) )
            // InternalMyDsl.g:6984:2: ( ruleQualified )
            {
            // InternalMyDsl.g:6984:2: ( ruleQualified )
            // InternalMyDsl.g:6985:3: ruleQualified
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRRootAccess().getBehaviourQualifiedParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualified();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRRootAccess().getBehaviourQualifiedParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__BehaviourAssignment_1"


    // $ANTLR start "rule__RRoot__SyntaxesAssignment_2"
    // InternalMyDsl.g:6994:1: rule__RRoot__SyntaxesAssignment_2 : ( rulerImportSyntax ) ;
    public final void rule__RRoot__SyntaxesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6998:1: ( ( rulerImportSyntax ) )
            // InternalMyDsl.g:6999:2: ( rulerImportSyntax )
            {
            // InternalMyDsl.g:6999:2: ( rulerImportSyntax )
            // InternalMyDsl.g:7000:3: rulerImportSyntax
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRRootAccess().getSyntaxesRImportSyntaxParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerImportSyntax();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRRootAccess().getSyntaxesRImportSyntaxParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__SyntaxesAssignment_2"


    // $ANTLR start "rule__RRoot__SemanticsAssignment_3"
    // InternalMyDsl.g:7009:1: rule__RRoot__SemanticsAssignment_3 : ( rulerImportSemantic ) ;
    public final void rule__RRoot__SemanticsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7013:1: ( ( rulerImportSemantic ) )
            // InternalMyDsl.g:7014:2: ( rulerImportSemantic )
            {
            // InternalMyDsl.g:7014:2: ( rulerImportSemantic )
            // InternalMyDsl.g:7015:3: rulerImportSemantic
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRRootAccess().getSemanticsRImportSemanticParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerImportSemantic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRRootAccess().getSemanticsRImportSemanticParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__SemanticsAssignment_3"


    // $ANTLR start "rule__RRoot__ServicesAssignment_4"
    // InternalMyDsl.g:7024:1: rule__RRoot__ServicesAssignment_4 : ( rulerImportService ) ;
    public final void rule__RRoot__ServicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7028:1: ( ( rulerImportService ) )
            // InternalMyDsl.g:7029:2: ( rulerImportService )
            {
            // InternalMyDsl.g:7029:2: ( rulerImportService )
            // InternalMyDsl.g:7030:3: rulerImportService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRRootAccess().getServicesRImportServiceParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerImportService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRRootAccess().getServicesRImportServiceParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__ServicesAssignment_4"


    // $ANTLR start "rule__RRoot__XtendedClassesAssignment_5"
    // InternalMyDsl.g:7039:1: rule__RRoot__XtendedClassesAssignment_5 : ( rulerClass ) ;
    public final void rule__RRoot__XtendedClassesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7043:1: ( ( rulerClass ) )
            // InternalMyDsl.g:7044:2: ( rulerClass )
            {
            // InternalMyDsl.g:7044:2: ( rulerClass )
            // InternalMyDsl.g:7045:3: rulerClass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRRootAccess().getXtendedClassesRClassParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRRootAccess().getXtendedClassesRClassParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RRoot__XtendedClassesAssignment_5"


    // $ANTLR start "rule__RImportSyntax__UriAssignment_2"
    // InternalMyDsl.g:7054:1: rule__RImportSyntax__UriAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RImportSyntax__UriAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7058:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:7059:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:7059:2: ( RULE_STRING )
            // InternalMyDsl.g:7060:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSyntaxAccess().getUriSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSyntaxAccess().getUriSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSyntax__UriAssignment_2"


    // $ANTLR start "rule__RImportSyntax__NameAssignment_4"
    // InternalMyDsl.g:7069:1: rule__RImportSyntax__NameAssignment_4 : ( RULE_IDENT ) ;
    public final void rule__RImportSyntax__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7073:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:7074:2: ( RULE_IDENT )
            {
            // InternalMyDsl.g:7074:2: ( RULE_IDENT )
            // InternalMyDsl.g:7075:3: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRImportSyntaxAccess().getNameIdentTerminalRuleCall_4_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRImportSyntaxAccess().getNameIdentTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImportSyntax__NameAssignment_4"


    // $ANTLR start "rule__RClass__SyntaxAssignment_1"
    // InternalMyDsl.g:7084:1: rule__RClass__SyntaxAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RClass__SyntaxAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7088:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7089:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7089:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7090:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRClassAccess().getSyntaxRImportSyntaxCrossReference_1_0()); 
            }
            // InternalMyDsl.g:7091:3: ( RULE_ID )
            // InternalMyDsl.g:7092:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRClassAccess().getSyntaxRImportSyntaxIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRClassAccess().getSyntaxRImportSyntaxIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRClassAccess().getSyntaxRImportSyntaxCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__SyntaxAssignment_1"


    // $ANTLR start "rule__RClass__NameAssignment_3"
    // InternalMyDsl.g:7103:1: rule__RClass__NameAssignment_3 : ( RULE_IDENT ) ;
    public final void rule__RClass__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7107:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:7108:2: ( RULE_IDENT )
            {
            // InternalMyDsl.g:7108:2: ( RULE_IDENT )
            // InternalMyDsl.g:7109:3: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRClassAccess().getNameIdentTerminalRuleCall_3_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRClassAccess().getNameIdentTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__NameAssignment_3"


    // $ANTLR start "rule__RClass__AttributesAssignment_5"
    // InternalMyDsl.g:7118:1: rule__RClass__AttributesAssignment_5 : ( rulerAttribute ) ;
    public final void rule__RClass__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7122:1: ( ( rulerAttribute ) )
            // InternalMyDsl.g:7123:2: ( rulerAttribute )
            {
            // InternalMyDsl.g:7123:2: ( rulerAttribute )
            // InternalMyDsl.g:7124:3: rulerAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRClassAccess().getAttributesRAttributeParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRClassAccess().getAttributesRAttributeParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__AttributesAssignment_5"


    // $ANTLR start "rule__RClass__OperationsAssignment_6"
    // InternalMyDsl.g:7133:1: rule__RClass__OperationsAssignment_6 : ( rulerOperation ) ;
    public final void rule__RClass__OperationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7137:1: ( ( rulerOperation ) )
            // InternalMyDsl.g:7138:2: ( rulerOperation )
            {
            // InternalMyDsl.g:7138:2: ( rulerOperation )
            // InternalMyDsl.g:7139:3: rulerOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRClassAccess().getOperationsROperationParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRClassAccess().getOperationsROperationParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RClass__OperationsAssignment_6"


    // $ANTLR start "rule__ROperation__TypeAssignment_2"
    // InternalMyDsl.g:7148:1: rule__ROperation__TypeAssignment_2 : ( RULE_IDENT ) ;
    public final void rule__ROperation__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7152:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:7153:2: ( RULE_IDENT )
            {
            // InternalMyDsl.g:7153:2: ( RULE_IDENT )
            // InternalMyDsl.g:7154:3: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getROperationAccess().getTypeIdentTerminalRuleCall_2_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getROperationAccess().getTypeIdentTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__TypeAssignment_2"


    // $ANTLR start "rule__ROperation__NameAssignment_3"
    // InternalMyDsl.g:7163:1: rule__ROperation__NameAssignment_3 : ( RULE_IDENT ) ;
    public final void rule__ROperation__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7167:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:7168:2: ( RULE_IDENT )
            {
            // InternalMyDsl.g:7168:2: ( RULE_IDENT )
            // InternalMyDsl.g:7169:3: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getROperationAccess().getNameIdentTerminalRuleCall_3_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getROperationAccess().getNameIdentTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__NameAssignment_3"


    // $ANTLR start "rule__ROperation__ParamListAssignment_5"
    // InternalMyDsl.g:7178:1: rule__ROperation__ParamListAssignment_5 : ( rulerParameters ) ;
    public final void rule__ROperation__ParamListAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7182:1: ( ( rulerParameters ) )
            // InternalMyDsl.g:7183:2: ( rulerParameters )
            {
            // InternalMyDsl.g:7183:2: ( rulerParameters )
            // InternalMyDsl.g:7184:3: rulerParameters
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getROperationAccess().getParamListRParametersParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerParameters();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getROperationAccess().getParamListRParametersParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__ParamListAssignment_5"


    // $ANTLR start "rule__ROperation__BodyAssignment_7"
    // InternalMyDsl.g:7193:1: rule__ROperation__BodyAssignment_7 : ( rulerBlock ) ;
    public final void rule__ROperation__BodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7197:1: ( ( rulerBlock ) )
            // InternalMyDsl.g:7198:2: ( rulerBlock )
            {
            // InternalMyDsl.g:7198:2: ( rulerBlock )
            // InternalMyDsl.g:7199:3: rulerBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getROperationAccess().getBodyRBlockParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getROperationAccess().getBodyRBlockParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ROperation__BodyAssignment_7"


    // $ANTLR start "rule__RParameters__ParamsAssignment_0"
    // InternalMyDsl.g:7208:1: rule__RParameters__ParamsAssignment_0 : ( rulerVariable ) ;
    public final void rule__RParameters__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7212:1: ( ( rulerVariable ) )
            // InternalMyDsl.g:7213:2: ( rulerVariable )
            {
            // InternalMyDsl.g:7213:2: ( rulerVariable )
            // InternalMyDsl.g:7214:3: rulerVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRParametersAccess().getParamsRVariableParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRParametersAccess().getParamsRVariableParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RParameters__ParamsAssignment_0"


    // $ANTLR start "rule__RParameters__ParamsAssignment_1_1"
    // InternalMyDsl.g:7223:1: rule__RParameters__ParamsAssignment_1_1 : ( rulerVariable ) ;
    public final void rule__RParameters__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7227:1: ( ( rulerVariable ) )
            // InternalMyDsl.g:7228:2: ( rulerVariable )
            {
            // InternalMyDsl.g:7228:2: ( rulerVariable )
            // InternalMyDsl.g:7229:3: rulerVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRParametersAccess().getParamsRVariableParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRParametersAccess().getParamsRVariableParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RParameters__ParamsAssignment_1_1"


    // $ANTLR start "rule__RVariable__TypeAssignment_0"
    // InternalMyDsl.g:7238:1: rule__RVariable__TypeAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__RVariable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7242:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:7243:2: ( RULE_IDENT )
            {
            // InternalMyDsl.g:7243:2: ( RULE_IDENT )
            // InternalMyDsl.g:7244:3: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRVariableAccess().getTypeIdentTerminalRuleCall_0_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRVariableAccess().getTypeIdentTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVariable__TypeAssignment_0"


    // $ANTLR start "rule__RVariable__NameAssignment_1"
    // InternalMyDsl.g:7253:1: rule__RVariable__NameAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__RVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7257:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:7258:2: ( RULE_IDENT )
            {
            // InternalMyDsl.g:7258:2: ( RULE_IDENT )
            // InternalMyDsl.g:7259:3: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRVariableAccess().getNameIdentTerminalRuleCall_1_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRVariableAccess().getNameIdentTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RVariable__NameAssignment_1"


    // $ANTLR start "rule__RAttribute__TypeAssignment_0"
    // InternalMyDsl.g:7268:1: rule__RAttribute__TypeAssignment_0 : ( RULE_IDENT ) ;
    public final void rule__RAttribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7272:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:7273:2: ( RULE_IDENT )
            {
            // InternalMyDsl.g:7273:2: ( RULE_IDENT )
            // InternalMyDsl.g:7274:3: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRAttributeAccess().getTypeIdentTerminalRuleCall_0_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRAttributeAccess().getTypeIdentTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAttribute__TypeAssignment_0"


    // $ANTLR start "rule__RAttribute__NameAssignment_1"
    // InternalMyDsl.g:7283:1: rule__RAttribute__NameAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__RAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7287:1: ( ( RULE_IDENT ) )
            // InternalMyDsl.g:7288:2: ( RULE_IDENT )
            {
            // InternalMyDsl.g:7288:2: ( RULE_IDENT )
            // InternalMyDsl.g:7289:3: RULE_IDENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRAttributeAccess().getNameIdentTerminalRuleCall_1_0()); 
            }
            match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRAttributeAccess().getNameIdentTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAttribute__NameAssignment_1"

    // $ANTLR start synpred3_InternalMyDsl
    public final void synpred3_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:954:2: ( ( rulerVarDecl ) )
        // InternalMyDsl.g:954:2: ( rulerVarDecl )
        {
        // InternalMyDsl.g:954:2: ( rulerVarDecl )
        // InternalMyDsl.g:955:3: rulerVarDecl
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getRStatementAccess().getRVarDeclParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        rulerVarDecl();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalMyDsl

    // $ANTLR start synpred4_InternalMyDsl
    public final void synpred4_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:960:2: ( ( rulerAssign ) )
        // InternalMyDsl.g:960:2: ( rulerAssign )
        {
        // InternalMyDsl.g:960:2: ( rulerAssign )
        // InternalMyDsl.g:961:3: rulerAssign
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getRStatementAccess().getRAssignParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        rulerAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalMyDsl

    // $ANTLR start synpred7_InternalMyDsl
    public final void synpred7_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:978:2: ( ( rulerIf ) )
        // InternalMyDsl.g:978:2: ( rulerIf )
        {
        // InternalMyDsl.g:978:2: ( rulerIf )
        // InternalMyDsl.g:979:3: rulerIf
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getRStatementAccess().getRIfParserRuleCall_4()); 
        }
        pushFollow(FOLLOW_2);
        rulerIf();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalMyDsl

    // $ANTLR start synpred74_InternalMyDsl
    public final void synpred74_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4297:3: ( rulerecExpression )
        // InternalMyDsl.g:4297:3: rulerecExpression
        {
        pushFollow(FOLLOW_2);
        rulerecExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_InternalMyDsl

    // $ANTLR start synpred75_InternalMyDsl
    public final void synpred75_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4351:3: ( rulerecExpression )
        // InternalMyDsl.g:4351:3: rulerecExpression
        {
        pushFollow(FOLLOW_2);
        rulerecExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_InternalMyDsl

    // Delegated rules

    public final boolean synpred7_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\1\4\25\0\6\uffff";
    static final String dfa_3s = "\1\124\25\0\6\uffff";
    static final String dfa_4s = "\26\uffff\1\3\1\4\1\1\1\2\1\6\1\5";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\4\1\5\1\6\12\uffff\1\3\22\uffff\1\7\1\10\1\11\1\14\1\15\1\16\1\17\7\uffff\1\23\4\uffff\1\22\4\uffff\1\26\4\uffff\1\24\1\uffff\1\27\5\uffff\1\2\2\uffff\1\25\2\uffff\1\12\1\13\1\uffff\1\20\1\21",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "949:1: rule__RStatement__Alternatives : ( ( rulerVarDecl ) | ( rulerAssign ) | ( rulerForEach ) | ( rulerWhile ) | ( rulerIf ) | ( rulerExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 24;}

                        else if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA3_9 = input.LA(1);

                         
                        int index3_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA3_10 = input.LA(1);

                         
                        int index3_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA3_11 = input.LA(1);

                         
                        int index3_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA3_12 = input.LA(1);

                         
                        int index3_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA3_13 = input.LA(1);

                         
                        int index3_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA3_14 = input.LA(1);

                         
                        int index3_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA3_15 = input.LA(1);

                         
                        int index3_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA3_16 = input.LA(1);

                         
                        int index3_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA3_17 = input.LA(1);

                         
                        int index3_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA3_18 = input.LA(1);

                         
                        int index3_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA3_19 = input.LA(1);

                         
                        int index3_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA3_20 = input.LA(1);

                         
                        int index3_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (synpred7_InternalMyDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA3_21 = input.LA(1);

                         
                        int index3_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index3_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\14\uffff\1\12\2\uffff";
    static final String dfa_9s = "\1\4\10\uffff\1\116\1\uffff\1\4\1\10\2\uffff";
    static final String dfa_10s = "\1\124\10\uffff\1\122\1\uffff\1\4\1\122\2\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\2\uffff\1\11\1\12";
    static final String dfa_12s = "\17\uffff}>";
    static final String[] dfa_13s = {
            "\1\11\1\1\1\2\1\3\35\uffff\1\4\1\5\1\6\4\12\14\uffff\1\12\27\uffff\1\7\1\10\1\uffff\2\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\3\uffff\1\13",
            "",
            "\1\14",
            "\1\12\10\uffff\12\12\22\uffff\1\12\3\uffff\1\12\3\uffff\1\12\3\uffff\1\12\1\uffff\2\12\1\uffff\1\12\4\uffff\1\12\1\uffff\5\12\1\uffff\2\12\1\uffff\1\16\3\uffff\1\15",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1318:1: rule__Literal__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) | ( RULE_REAL ) | ( 'true' ) | ( 'false' ) | ( 'null' ) | ( ( rule__Literal__Group_6__0 ) ) | ( ( rule__Literal__Group_7__0 ) ) | ( ( rule__Literal__Group_8__0 ) ) | ( ( rule__Literal__Group_9__0 ) ) | ( ruletypeLiteral ) );";
        }
    }
    static final String dfa_14s = "\24\uffff";
    static final String dfa_15s = "\1\22\23\uffff";
    static final String dfa_16s = "\1\10\21\0\2\uffff";
    static final String dfa_17s = "\1\114\21\0\2\uffff";
    static final String dfa_18s = "\22\uffff\1\2\1\1";
    static final String dfa_19s = "\1\uffff\1\11\1\10\1\5\1\14\1\3\1\0\1\13\1\4\1\2\1\12\1\6\1\1\1\7\1\15\1\16\1\17\1\20\2\uffff}>";
    static final String[] dfa_20s = {
            "\1\3\10\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\22\uffff\1\1\3\uffff\1\22\3\uffff\1\22\3\uffff\1\22\1\uffff\2\22\1\uffff\1\22\4\uffff\1\22\1\uffff\1\16\1\17\1\20\1\21\1\2\1\uffff\2\22",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "4297:2: ( rulerecExpression )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_6 = input.LA(1);

                         
                        int index29_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_12 = input.LA(1);

                         
                        int index29_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_9 = input.LA(1);

                         
                        int index29_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_5 = input.LA(1);

                         
                        int index29_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA29_8 = input.LA(1);

                         
                        int index29_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA29_3 = input.LA(1);

                         
                        int index29_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA29_11 = input.LA(1);

                         
                        int index29_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA29_13 = input.LA(1);

                         
                        int index29_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA29_10 = input.LA(1);

                         
                        int index29_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA29_7 = input.LA(1);

                         
                        int index29_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_7);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA29_4 = input.LA(1);

                         
                        int index29_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_4);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA29_14 = input.LA(1);

                         
                        int index29_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA29_15 = input.LA(1);

                         
                        int index29_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA29_16 = input.LA(1);

                         
                        int index29_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA29_17 = input.LA(1);

                         
                        int index29_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index29_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "4351:2: ( rulerecExpression )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_6 = input.LA(1);

                         
                        int index30_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_12 = input.LA(1);

                         
                        int index30_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_9 = input.LA(1);

                         
                        int index30_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_5 = input.LA(1);

                         
                        int index30_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_8 = input.LA(1);

                         
                        int index30_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA30_3 = input.LA(1);

                         
                        int index30_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA30_11 = input.LA(1);

                         
                        int index30_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA30_13 = input.LA(1);

                         
                        int index30_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA30_2 = input.LA(1);

                         
                        int index30_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_2);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA30_10 = input.LA(1);

                         
                        int index30_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA30_7 = input.LA(1);

                         
                        int index30_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_7);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA30_4 = input.LA(1);

                         
                        int index30_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_4);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA30_14 = input.LA(1);

                         
                        int index30_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA30_15 = input.LA(1);

                         
                        int index30_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA30_16 = input.LA(1);

                         
                        int index30_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA30_17 = input.LA(1);

                         
                        int index30_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index30_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0600000000018010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0400000000018002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0400000000018000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x01080FE0000400F0L,0x00000000001B2404L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x81080FE0000400F0L,0x00000000001B2404L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x23080FE0000400F0L,0x00000000001B2414L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x21080FE0000400F0L,0x00000000001B2414L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x21080FE0000400F2L,0x00000000001B2414L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200007FE0100L,0x00000000000003E0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001FF8000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x4800000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000800000L,0x0000000000004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x01000FE0000000F0L,0x00000000001B0000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0200000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});

}