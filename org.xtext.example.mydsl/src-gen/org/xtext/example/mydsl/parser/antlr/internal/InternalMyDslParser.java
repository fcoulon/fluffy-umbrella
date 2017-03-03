package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_MULTOP", "RULE_REAL", "RULE_LETTER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'behavior'", "'.'", "'import'", "'syntax'", "'as'", "';'", "'semantic'", "'('", "'=>'", "')'", "'service'", "'class'", "'{'", "'}'", "'def'", "'override'", "'@'", "','", "':='", "'for'", "'in'", "'['", "'..'", "']'", "'if'", "'else'", "'while'", "'and'", "'or'", "'xor'", "'implies'", "'->'", "'not'", "'-'", "'then'", "'endif'", "'let'", "':'", "'='", "'+'", "'<='", "'>='", "'!='", "'<>'", "'=='", "'<'", "'>'", "'select'", "'reject'", "'collect'", "'any'", "'exists'", "'forAll'", "'isUnique'", "'one'", "'sortedBy'", "'closure'", "'|'", "'true'", "'false'", "'null'", "'Sequence{'", "'OrderedSet{'", "'::'", "'String'", "'Integer'", "'Real'", "'Boolean'", "'Sequence('", "'OrderedSet('"
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
    public static final int RULE_ID=6;
    public static final int RULE_REAL=9;
    public static final int RULE_IDENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "rRoot";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulerRoot"
    // InternalMyDsl.g:70:1: entryRulerRoot returns [EObject current=null] : iv_rulerRoot= rulerRoot EOF ;
    public final EObject entryRulerRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerRoot = null;


        try {
            // InternalMyDsl.g:70:46: (iv_rulerRoot= rulerRoot EOF )
            // InternalMyDsl.g:71:2: iv_rulerRoot= rulerRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRRootRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerRoot=rulerRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerRoot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerRoot"


    // $ANTLR start "rulerRoot"
    // InternalMyDsl.g:77:1: rulerRoot returns [EObject current=null] : (otherlv_0= 'behavior' ( (lv_behaviour_1_0= ruleQualified ) ) ( (lv_syntaxes_2_0= rulerImportSyntax ) )* ( (lv_semantics_3_0= rulerImportSemantic ) )* ( (lv_services_4_0= rulerImportService ) )* ( (lv_xtendedClasses_5_0= rulerClass ) )* ) ;
    public final EObject rulerRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_behaviour_1_0 = null;

        EObject lv_syntaxes_2_0 = null;

        AntlrDatatypeRuleToken lv_semantics_3_0 = null;

        AntlrDatatypeRuleToken lv_services_4_0 = null;

        EObject lv_xtendedClasses_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:83:2: ( (otherlv_0= 'behavior' ( (lv_behaviour_1_0= ruleQualified ) ) ( (lv_syntaxes_2_0= rulerImportSyntax ) )* ( (lv_semantics_3_0= rulerImportSemantic ) )* ( (lv_services_4_0= rulerImportService ) )* ( (lv_xtendedClasses_5_0= rulerClass ) )* ) )
            // InternalMyDsl.g:84:2: (otherlv_0= 'behavior' ( (lv_behaviour_1_0= ruleQualified ) ) ( (lv_syntaxes_2_0= rulerImportSyntax ) )* ( (lv_semantics_3_0= rulerImportSemantic ) )* ( (lv_services_4_0= rulerImportService ) )* ( (lv_xtendedClasses_5_0= rulerClass ) )* )
            {
            // InternalMyDsl.g:84:2: (otherlv_0= 'behavior' ( (lv_behaviour_1_0= ruleQualified ) ) ( (lv_syntaxes_2_0= rulerImportSyntax ) )* ( (lv_semantics_3_0= rulerImportSemantic ) )* ( (lv_services_4_0= rulerImportService ) )* ( (lv_xtendedClasses_5_0= rulerClass ) )* )
            // InternalMyDsl.g:85:3: otherlv_0= 'behavior' ( (lv_behaviour_1_0= ruleQualified ) ) ( (lv_syntaxes_2_0= rulerImportSyntax ) )* ( (lv_semantics_3_0= rulerImportSemantic ) )* ( (lv_services_4_0= rulerImportService ) )* ( (lv_xtendedClasses_5_0= rulerClass ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRRootAccess().getBehaviorKeyword_0());
              		
            }
            // InternalMyDsl.g:89:3: ( (lv_behaviour_1_0= ruleQualified ) )
            // InternalMyDsl.g:90:4: (lv_behaviour_1_0= ruleQualified )
            {
            // InternalMyDsl.g:90:4: (lv_behaviour_1_0= ruleQualified )
            // InternalMyDsl.g:91:5: lv_behaviour_1_0= ruleQualified
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRRootAccess().getBehaviourQualifiedParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_behaviour_1_0=ruleQualified();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRRootRule());
              					}
              					set(
              						current,
              						"behaviour",
              						lv_behaviour_1_0,
              						"org.xtext.example.mydsl.MyDsl.Qualified");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:108:3: ( (lv_syntaxes_2_0= rulerImportSyntax ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==18) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:109:4: (lv_syntaxes_2_0= rulerImportSyntax )
            	    {
            	    // InternalMyDsl.g:109:4: (lv_syntaxes_2_0= rulerImportSyntax )
            	    // InternalMyDsl.g:110:5: lv_syntaxes_2_0= rulerImportSyntax
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRRootAccess().getSyntaxesRImportSyntaxParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_syntaxes_2_0=rulerImportSyntax();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRRootRule());
            	      					}
            	      					add(
            	      						current,
            	      						"syntaxes",
            	      						lv_syntaxes_2_0,
            	      						"org.xtext.example.mydsl.MyDsl.rImportSyntax");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:127:3: ( (lv_semantics_3_0= rulerImportSemantic ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==21) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:128:4: (lv_semantics_3_0= rulerImportSemantic )
            	    {
            	    // InternalMyDsl.g:128:4: (lv_semantics_3_0= rulerImportSemantic )
            	    // InternalMyDsl.g:129:5: lv_semantics_3_0= rulerImportSemantic
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRRootAccess().getSemanticsRImportSemanticParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_semantics_3_0=rulerImportSemantic();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRRootRule());
            	      					}
            	      					add(
            	      						current,
            	      						"semantics",
            	      						lv_semantics_3_0,
            	      						"org.xtext.example.mydsl.MyDsl.rImportSemantic");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:146:3: ( (lv_services_4_0= rulerImportService ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:147:4: (lv_services_4_0= rulerImportService )
            	    {
            	    // InternalMyDsl.g:147:4: (lv_services_4_0= rulerImportService )
            	    // InternalMyDsl.g:148:5: lv_services_4_0= rulerImportService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRRootAccess().getServicesRImportServiceParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_services_4_0=rulerImportService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRRootRule());
            	      					}
            	      					add(
            	      						current,
            	      						"services",
            	      						lv_services_4_0,
            	      						"org.xtext.example.mydsl.MyDsl.rImportService");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:165:3: ( (lv_xtendedClasses_5_0= rulerClass ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:166:4: (lv_xtendedClasses_5_0= rulerClass )
            	    {
            	    // InternalMyDsl.g:166:4: (lv_xtendedClasses_5_0= rulerClass )
            	    // InternalMyDsl.g:167:5: lv_xtendedClasses_5_0= rulerClass
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRRootAccess().getXtendedClassesRClassParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_xtendedClasses_5_0=rulerClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRRootRule());
            	      					}
            	      					add(
            	      						current,
            	      						"xtendedClasses",
            	      						lv_xtendedClasses_5_0,
            	      						"org.xtext.example.mydsl.MyDsl.rClass");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerRoot"


    // $ANTLR start "entryRuleQualified"
    // InternalMyDsl.g:188:1: entryRuleQualified returns [String current=null] : iv_ruleQualified= ruleQualified EOF ;
    public final String entryRuleQualified() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualified = null;


        try {
            // InternalMyDsl.g:188:49: (iv_ruleQualified= ruleQualified EOF )
            // InternalMyDsl.g:189:2: iv_ruleQualified= ruleQualified EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualified=ruleQualified();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualified.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualified"


    // $ANTLR start "ruleQualified"
    // InternalMyDsl.g:195:1: ruleQualified returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Ident_0= RULE_IDENT (kw= '.' this_Ident_2= RULE_IDENT ) ) ;
    public final AntlrDatatypeRuleToken ruleQualified() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Ident_0=null;
        Token kw=null;
        Token this_Ident_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:201:2: ( (this_Ident_0= RULE_IDENT (kw= '.' this_Ident_2= RULE_IDENT ) ) )
            // InternalMyDsl.g:202:2: (this_Ident_0= RULE_IDENT (kw= '.' this_Ident_2= RULE_IDENT ) )
            {
            // InternalMyDsl.g:202:2: (this_Ident_0= RULE_IDENT (kw= '.' this_Ident_2= RULE_IDENT ) )
            // InternalMyDsl.g:203:3: this_Ident_0= RULE_IDENT (kw= '.' this_Ident_2= RULE_IDENT )
            {
            this_Ident_0=(Token)match(input,RULE_IDENT,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Ident_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_0, grammarAccess.getQualifiedAccess().getIdentTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:210:3: (kw= '.' this_Ident_2= RULE_IDENT )
            // InternalMyDsl.g:211:4: kw= '.' this_Ident_2= RULE_IDENT
            {
            kw=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getQualifiedAccess().getFullStopKeyword_1_0());
              			
            }
            this_Ident_2=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_Ident_2);
              			
            }
            if ( state.backtracking==0 ) {

              				newLeafNode(this_Ident_2, grammarAccess.getQualifiedAccess().getIdentTerminalRuleCall_1_1());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualified"


    // $ANTLR start "entryRulerImportSyntax"
    // InternalMyDsl.g:228:1: entryRulerImportSyntax returns [EObject current=null] : iv_rulerImportSyntax= rulerImportSyntax EOF ;
    public final EObject entryRulerImportSyntax() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerImportSyntax = null;


        try {
            // InternalMyDsl.g:228:54: (iv_rulerImportSyntax= rulerImportSyntax EOF )
            // InternalMyDsl.g:229:2: iv_rulerImportSyntax= rulerImportSyntax EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRImportSyntaxRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerImportSyntax=rulerImportSyntax();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerImportSyntax; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerImportSyntax"


    // $ANTLR start "rulerImportSyntax"
    // InternalMyDsl.g:235:1: rulerImportSyntax returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'syntax' ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= ';' ) ;
    public final EObject rulerImportSyntax() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_uri_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:241:2: ( (otherlv_0= 'import' otherlv_1= 'syntax' ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= ';' ) )
            // InternalMyDsl.g:242:2: (otherlv_0= 'import' otherlv_1= 'syntax' ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= ';' )
            {
            // InternalMyDsl.g:242:2: (otherlv_0= 'import' otherlv_1= 'syntax' ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= ';' )
            // InternalMyDsl.g:243:3: otherlv_0= 'import' otherlv_1= 'syntax' ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRImportSyntaxAccess().getImportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRImportSyntaxAccess().getSyntaxKeyword_1());
              		
            }
            // InternalMyDsl.g:251:3: ( (lv_uri_2_0= RULE_STRING ) )
            // InternalMyDsl.g:252:4: (lv_uri_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:252:4: (lv_uri_2_0= RULE_STRING )
            // InternalMyDsl.g:253:5: lv_uri_2_0= RULE_STRING
            {
            lv_uri_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_uri_2_0, grammarAccess.getRImportSyntaxAccess().getUriSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRImportSyntaxRule());
              					}
              					setWithLastConsumed(
              						current,
              						"uri",
              						lv_uri_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRImportSyntaxAccess().getAsKeyword_3());
              		
            }
            // InternalMyDsl.g:273:3: ( (lv_name_4_0= RULE_IDENT ) )
            // InternalMyDsl.g:274:4: (lv_name_4_0= RULE_IDENT )
            {
            // InternalMyDsl.g:274:4: (lv_name_4_0= RULE_IDENT )
            // InternalMyDsl.g:275:5: lv_name_4_0= RULE_IDENT
            {
            lv_name_4_0=(Token)match(input,RULE_IDENT,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getRImportSyntaxAccess().getNameIdentTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRImportSyntaxRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.xtext.example.mydsl.MyDsl.Ident");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRImportSyntaxAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerImportSyntax"


    // $ANTLR start "entryRulerImportSemantic"
    // InternalMyDsl.g:299:1: entryRulerImportSemantic returns [String current=null] : iv_rulerImportSemantic= rulerImportSemantic EOF ;
    public final String entryRulerImportSemantic() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerImportSemantic = null;


        try {
            // InternalMyDsl.g:299:55: (iv_rulerImportSemantic= rulerImportSemantic EOF )
            // InternalMyDsl.g:300:2: iv_rulerImportSemantic= rulerImportSemantic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRImportSemanticRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerImportSemantic=rulerImportSemantic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerImportSemantic.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerImportSemantic"


    // $ANTLR start "rulerImportSemantic"
    // InternalMyDsl.g:306:1: rulerImportSemantic returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'import' kw= 'semantic' this_Qualified_2= ruleQualified kw= 'as' this_Ident_4= RULE_IDENT kw= '(' this_Ident_6= RULE_IDENT kw= '=>' this_Ident_8= RULE_IDENT kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulerImportSemantic() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_Ident_4=null;
        Token this_Ident_6=null;
        Token this_Ident_8=null;
        AntlrDatatypeRuleToken this_Qualified_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:312:2: ( (kw= 'import' kw= 'semantic' this_Qualified_2= ruleQualified kw= 'as' this_Ident_4= RULE_IDENT kw= '(' this_Ident_6= RULE_IDENT kw= '=>' this_Ident_8= RULE_IDENT kw= ')' kw= ';' ) )
            // InternalMyDsl.g:313:2: (kw= 'import' kw= 'semantic' this_Qualified_2= ruleQualified kw= 'as' this_Ident_4= RULE_IDENT kw= '(' this_Ident_6= RULE_IDENT kw= '=>' this_Ident_8= RULE_IDENT kw= ')' kw= ';' )
            {
            // InternalMyDsl.g:313:2: (kw= 'import' kw= 'semantic' this_Qualified_2= ruleQualified kw= 'as' this_Ident_4= RULE_IDENT kw= '(' this_Ident_6= RULE_IDENT kw= '=>' this_Ident_8= RULE_IDENT kw= ')' kw= ';' )
            // InternalMyDsl.g:314:3: kw= 'import' kw= 'semantic' this_Qualified_2= ruleQualified kw= 'as' this_Ident_4= RULE_IDENT kw= '(' this_Ident_6= RULE_IDENT kw= '=>' this_Ident_8= RULE_IDENT kw= ')' kw= ';'
            {
            kw=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRImportSemanticAccess().getImportKeyword_0());
              		
            }
            kw=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRImportSemanticAccess().getSemanticKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRImportSemanticAccess().getQualifiedParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_9);
            this_Qualified_2=ruleQualified();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Qualified_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRImportSemanticAccess().getAsKeyword_3());
              		
            }
            this_Ident_4=(Token)match(input,RULE_IDENT,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Ident_4);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_4, grammarAccess.getRImportSemanticAccess().getIdentTerminalRuleCall_4());
              		
            }
            kw=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRImportSemanticAccess().getLeftParenthesisKeyword_5());
              		
            }
            this_Ident_6=(Token)match(input,RULE_IDENT,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Ident_6);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_6, grammarAccess.getRImportSemanticAccess().getIdentTerminalRuleCall_6());
              		
            }
            kw=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRImportSemanticAccess().getEqualsSignGreaterThanSignKeyword_7());
              		
            }
            this_Ident_8=(Token)match(input,RULE_IDENT,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Ident_8);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_8, grammarAccess.getRImportSemanticAccess().getIdentTerminalRuleCall_8());
              		
            }
            kw=(Token)match(input,24,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRImportSemanticAccess().getRightParenthesisKeyword_9());
              		
            }
            kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRImportSemanticAccess().getSemicolonKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerImportSemantic"


    // $ANTLR start "entryRulerImportService"
    // InternalMyDsl.g:384:1: entryRulerImportService returns [String current=null] : iv_rulerImportService= rulerImportService EOF ;
    public final String entryRulerImportService() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerImportService = null;


        try {
            // InternalMyDsl.g:384:54: (iv_rulerImportService= rulerImportService EOF )
            // InternalMyDsl.g:385:2: iv_rulerImportService= rulerImportService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRImportServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerImportService=rulerImportService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerImportService.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerImportService"


    // $ANTLR start "rulerImportService"
    // InternalMyDsl.g:391:1: rulerImportService returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'import' kw= 'service' this_Qualified_2= ruleQualified kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulerImportService() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Qualified_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:397:2: ( (kw= 'import' kw= 'service' this_Qualified_2= ruleQualified kw= ';' ) )
            // InternalMyDsl.g:398:2: (kw= 'import' kw= 'service' this_Qualified_2= ruleQualified kw= ';' )
            {
            // InternalMyDsl.g:398:2: (kw= 'import' kw= 'service' this_Qualified_2= ruleQualified kw= ';' )
            // InternalMyDsl.g:399:3: kw= 'import' kw= 'service' this_Qualified_2= ruleQualified kw= ';'
            {
            kw=(Token)match(input,17,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRImportServiceAccess().getImportKeyword_0());
              		
            }
            kw=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRImportServiceAccess().getServiceKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRImportServiceAccess().getQualifiedParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_10);
            this_Qualified_2=ruleQualified();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Qualified_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRImportServiceAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerImportService"


    // $ANTLR start "entryRulerClass"
    // InternalMyDsl.g:428:1: entryRulerClass returns [EObject current=null] : iv_rulerClass= rulerClass EOF ;
    public final EObject entryRulerClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerClass = null;


        try {
            // InternalMyDsl.g:428:47: (iv_rulerClass= rulerClass EOF )
            // InternalMyDsl.g:429:2: iv_rulerClass= rulerClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerClass=rulerClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerClass"


    // $ANTLR start "rulerClass"
    // InternalMyDsl.g:435:1: rulerClass returns [EObject current=null] : (otherlv_0= 'class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_IDENT ) ) otherlv_4= '{' ( (lv_attributes_5_0= rulerAttribute ) )* ( (lv_operations_6_0= rulerOperation ) )* otherlv_7= '}' ) ;
    public final EObject rulerClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_attributes_5_0 = null;

        EObject lv_operations_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:441:2: ( (otherlv_0= 'class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_IDENT ) ) otherlv_4= '{' ( (lv_attributes_5_0= rulerAttribute ) )* ( (lv_operations_6_0= rulerOperation ) )* otherlv_7= '}' ) )
            // InternalMyDsl.g:442:2: (otherlv_0= 'class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_IDENT ) ) otherlv_4= '{' ( (lv_attributes_5_0= rulerAttribute ) )* ( (lv_operations_6_0= rulerOperation ) )* otherlv_7= '}' )
            {
            // InternalMyDsl.g:442:2: (otherlv_0= 'class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_IDENT ) ) otherlv_4= '{' ( (lv_attributes_5_0= rulerAttribute ) )* ( (lv_operations_6_0= rulerOperation ) )* otherlv_7= '}' )
            // InternalMyDsl.g:443:3: otherlv_0= 'class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_IDENT ) ) otherlv_4= '{' ( (lv_attributes_5_0= rulerAttribute ) )* ( (lv_operations_6_0= rulerOperation ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRClassAccess().getClassKeyword_0());
              		
            }
            // InternalMyDsl.g:447:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:448:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:448:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:449:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRClassRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getRClassAccess().getSyntaxRImportSyntaxCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRClassAccess().getFullStopKeyword_2());
              		
            }
            // InternalMyDsl.g:467:3: ( (lv_name_3_0= RULE_IDENT ) )
            // InternalMyDsl.g:468:4: (lv_name_3_0= RULE_IDENT )
            {
            // InternalMyDsl.g:468:4: (lv_name_3_0= RULE_IDENT )
            // InternalMyDsl.g:469:5: lv_name_3_0= RULE_IDENT
            {
            lv_name_3_0=(Token)match(input,RULE_IDENT,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getRClassAccess().getNameIdentTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.xtext.example.mydsl.MyDsl.Ident");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRClassAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalMyDsl.g:489:3: ( (lv_attributes_5_0= rulerAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_IDENT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:490:4: (lv_attributes_5_0= rulerAttribute )
            	    {
            	    // InternalMyDsl.g:490:4: (lv_attributes_5_0= rulerAttribute )
            	    // InternalMyDsl.g:491:5: lv_attributes_5_0= rulerAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRClassAccess().getAttributesRAttributeParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_attributes_5_0=rulerAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attributes",
            	      						lv_attributes_5_0,
            	      						"org.xtext.example.mydsl.MyDsl.rAttribute");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalMyDsl.g:508:3: ( (lv_operations_6_0= rulerOperation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=29 && LA6_0<=31)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:509:4: (lv_operations_6_0= rulerOperation )
            	    {
            	    // InternalMyDsl.g:509:4: (lv_operations_6_0= rulerOperation )
            	    // InternalMyDsl.g:510:5: lv_operations_6_0= rulerOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRClassAccess().getOperationsROperationParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_operations_6_0=rulerOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"operations",
            	      						lv_operations_6_0,
            	      						"org.xtext.example.mydsl.MyDsl.rOperation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getRClassAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerClass"


    // $ANTLR start "entryRulerOperation"
    // InternalMyDsl.g:535:1: entryRulerOperation returns [EObject current=null] : iv_rulerOperation= rulerOperation EOF ;
    public final EObject entryRulerOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerOperation = null;


        try {
            // InternalMyDsl.g:535:51: (iv_rulerOperation= rulerOperation EOF )
            // InternalMyDsl.g:536:2: iv_rulerOperation= rulerOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getROperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerOperation=rulerOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerOperation"


    // $ANTLR start "rulerOperation"
    // InternalMyDsl.g:542:1: rulerOperation returns [EObject current=null] : ( ( rulerTag )* (otherlv_1= 'def' | otherlv_2= 'override' ) ( (lv_type_3_0= RULE_IDENT ) ) ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '(' ( (lv_paramList_6_0= rulerParameters ) )? otherlv_7= ')' ( (lv_body_8_0= rulerBlock ) ) ) ;
    public final EObject rulerOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_paramList_6_0 = null;

        AntlrDatatypeRuleToken lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:548:2: ( ( ( rulerTag )* (otherlv_1= 'def' | otherlv_2= 'override' ) ( (lv_type_3_0= RULE_IDENT ) ) ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '(' ( (lv_paramList_6_0= rulerParameters ) )? otherlv_7= ')' ( (lv_body_8_0= rulerBlock ) ) ) )
            // InternalMyDsl.g:549:2: ( ( rulerTag )* (otherlv_1= 'def' | otherlv_2= 'override' ) ( (lv_type_3_0= RULE_IDENT ) ) ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '(' ( (lv_paramList_6_0= rulerParameters ) )? otherlv_7= ')' ( (lv_body_8_0= rulerBlock ) ) )
            {
            // InternalMyDsl.g:549:2: ( ( rulerTag )* (otherlv_1= 'def' | otherlv_2= 'override' ) ( (lv_type_3_0= RULE_IDENT ) ) ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '(' ( (lv_paramList_6_0= rulerParameters ) )? otherlv_7= ')' ( (lv_body_8_0= rulerBlock ) ) )
            // InternalMyDsl.g:550:3: ( rulerTag )* (otherlv_1= 'def' | otherlv_2= 'override' ) ( (lv_type_3_0= RULE_IDENT ) ) ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '(' ( (lv_paramList_6_0= rulerParameters ) )? otherlv_7= ')' ( (lv_body_8_0= rulerBlock ) )
            {
            // InternalMyDsl.g:550:3: ( rulerTag )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:551:4: rulerTag
            	    {
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getROperationAccess().getRTagParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_20);
            	    rulerTag();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalMyDsl.g:562:3: (otherlv_1= 'def' | otherlv_2= 'override' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            else if ( (LA8_0==30) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:563:4: otherlv_1= 'def'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getROperationAccess().getDefKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:568:4: otherlv_2= 'override'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getROperationAccess().getOverrideKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalMyDsl.g:573:3: ( (lv_type_3_0= RULE_IDENT ) )
            // InternalMyDsl.g:574:4: (lv_type_3_0= RULE_IDENT )
            {
            // InternalMyDsl.g:574:4: (lv_type_3_0= RULE_IDENT )
            // InternalMyDsl.g:575:5: lv_type_3_0= RULE_IDENT
            {
            lv_type_3_0=(Token)match(input,RULE_IDENT,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_type_3_0, grammarAccess.getROperationAccess().getTypeIdentTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getROperationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"type",
              						lv_type_3_0,
              						"org.xtext.example.mydsl.MyDsl.Ident");
              				
            }

            }


            }

            // InternalMyDsl.g:591:3: ( (lv_name_4_0= RULE_IDENT ) )
            // InternalMyDsl.g:592:4: (lv_name_4_0= RULE_IDENT )
            {
            // InternalMyDsl.g:592:4: (lv_name_4_0= RULE_IDENT )
            // InternalMyDsl.g:593:5: lv_name_4_0= RULE_IDENT
            {
            lv_name_4_0=(Token)match(input,RULE_IDENT,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getROperationAccess().getNameIdentTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getROperationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.xtext.example.mydsl.MyDsl.Ident");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getROperationAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalMyDsl.g:613:3: ( (lv_paramList_6_0= rulerParameters ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_IDENT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:614:4: (lv_paramList_6_0= rulerParameters )
                    {
                    // InternalMyDsl.g:614:4: (lv_paramList_6_0= rulerParameters )
                    // InternalMyDsl.g:615:5: lv_paramList_6_0= rulerParameters
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getROperationAccess().getParamListRParametersParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    lv_paramList_6_0=rulerParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getROperationRule());
                      					}
                      					add(
                      						current,
                      						"paramList",
                      						lv_paramList_6_0,
                      						"org.xtext.example.mydsl.MyDsl.rParameters");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getROperationAccess().getRightParenthesisKeyword_6());
              		
            }
            // InternalMyDsl.g:636:3: ( (lv_body_8_0= rulerBlock ) )
            // InternalMyDsl.g:637:4: (lv_body_8_0= rulerBlock )
            {
            // InternalMyDsl.g:637:4: (lv_body_8_0= rulerBlock )
            // InternalMyDsl.g:638:5: lv_body_8_0= rulerBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getROperationAccess().getBodyRBlockParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_8_0=rulerBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getROperationRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_8_0,
              						"org.xtext.example.mydsl.MyDsl.rBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerOperation"


    // $ANTLR start "entryRulerTag"
    // InternalMyDsl.g:659:1: entryRulerTag returns [String current=null] : iv_rulerTag= rulerTag EOF ;
    public final String entryRulerTag() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerTag = null;


        try {
            // InternalMyDsl.g:659:44: (iv_rulerTag= rulerTag EOF )
            // InternalMyDsl.g:660:2: iv_rulerTag= rulerTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRTagRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerTag=rulerTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerTag.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerTag"


    // $ANTLR start "rulerTag"
    // InternalMyDsl.g:666:1: rulerTag returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@' this_Ident_1= RULE_IDENT ) ;
    public final AntlrDatatypeRuleToken rulerTag() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_Ident_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:672:2: ( (kw= '@' this_Ident_1= RULE_IDENT ) )
            // InternalMyDsl.g:673:2: (kw= '@' this_Ident_1= RULE_IDENT )
            {
            // InternalMyDsl.g:673:2: (kw= '@' this_Ident_1= RULE_IDENT )
            // InternalMyDsl.g:674:3: kw= '@' this_Ident_1= RULE_IDENT
            {
            kw=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRTagAccess().getCommercialAtKeyword_0());
              		
            }
            this_Ident_1=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Ident_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_1, grammarAccess.getRTagAccess().getIdentTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerTag"


    // $ANTLR start "entryRulerParameters"
    // InternalMyDsl.g:690:1: entryRulerParameters returns [EObject current=null] : iv_rulerParameters= rulerParameters EOF ;
    public final EObject entryRulerParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerParameters = null;


        try {
            // InternalMyDsl.g:690:52: (iv_rulerParameters= rulerParameters EOF )
            // InternalMyDsl.g:691:2: iv_rulerParameters= rulerParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerParameters=rulerParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerParameters; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerParameters"


    // $ANTLR start "rulerParameters"
    // InternalMyDsl.g:697:1: rulerParameters returns [EObject current=null] : ( ( (lv_params_0_0= rulerVariable ) ) (otherlv_1= ',' ( (lv_params_2_0= rulerVariable ) ) )* ) ;
    public final EObject rulerParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:703:2: ( ( ( (lv_params_0_0= rulerVariable ) ) (otherlv_1= ',' ( (lv_params_2_0= rulerVariable ) ) )* ) )
            // InternalMyDsl.g:704:2: ( ( (lv_params_0_0= rulerVariable ) ) (otherlv_1= ',' ( (lv_params_2_0= rulerVariable ) ) )* )
            {
            // InternalMyDsl.g:704:2: ( ( (lv_params_0_0= rulerVariable ) ) (otherlv_1= ',' ( (lv_params_2_0= rulerVariable ) ) )* )
            // InternalMyDsl.g:705:3: ( (lv_params_0_0= rulerVariable ) ) (otherlv_1= ',' ( (lv_params_2_0= rulerVariable ) ) )*
            {
            // InternalMyDsl.g:705:3: ( (lv_params_0_0= rulerVariable ) )
            // InternalMyDsl.g:706:4: (lv_params_0_0= rulerVariable )
            {
            // InternalMyDsl.g:706:4: (lv_params_0_0= rulerVariable )
            // InternalMyDsl.g:707:5: lv_params_0_0= rulerVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRParametersAccess().getParamsRVariableParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_params_0_0=rulerVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRParametersRule());
              					}
              					add(
              						current,
              						"params",
              						lv_params_0_0,
              						"org.xtext.example.mydsl.MyDsl.rVariable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:724:3: (otherlv_1= ',' ( (lv_params_2_0= rulerVariable ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:725:4: otherlv_1= ',' ( (lv_params_2_0= rulerVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getRParametersAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMyDsl.g:729:4: ( (lv_params_2_0= rulerVariable ) )
            	    // InternalMyDsl.g:730:5: (lv_params_2_0= rulerVariable )
            	    {
            	    // InternalMyDsl.g:730:5: (lv_params_2_0= rulerVariable )
            	    // InternalMyDsl.g:731:6: lv_params_2_0= rulerVariable
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRParametersAccess().getParamsRVariableParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_params_2_0=rulerVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRParametersRule());
            	      						}
            	      						add(
            	      							current,
            	      							"params",
            	      							lv_params_2_0,
            	      							"org.xtext.example.mydsl.MyDsl.rVariable");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerParameters"


    // $ANTLR start "entryRulerVariable"
    // InternalMyDsl.g:753:1: entryRulerVariable returns [EObject current=null] : iv_rulerVariable= rulerVariable EOF ;
    public final EObject entryRulerVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerVariable = null;


        try {
            // InternalMyDsl.g:753:50: (iv_rulerVariable= rulerVariable EOF )
            // InternalMyDsl.g:754:2: iv_rulerVariable= rulerVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerVariable=rulerVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerVariable"


    // $ANTLR start "rulerVariable"
    // InternalMyDsl.g:760:1: rulerVariable returns [EObject current=null] : ( ( (lv_type_0_0= RULE_IDENT ) ) ( (lv_name_1_0= RULE_IDENT ) ) ) ;
    public final EObject rulerVariable() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:766:2: ( ( ( (lv_type_0_0= RULE_IDENT ) ) ( (lv_name_1_0= RULE_IDENT ) ) ) )
            // InternalMyDsl.g:767:2: ( ( (lv_type_0_0= RULE_IDENT ) ) ( (lv_name_1_0= RULE_IDENT ) ) )
            {
            // InternalMyDsl.g:767:2: ( ( (lv_type_0_0= RULE_IDENT ) ) ( (lv_name_1_0= RULE_IDENT ) ) )
            // InternalMyDsl.g:768:3: ( (lv_type_0_0= RULE_IDENT ) ) ( (lv_name_1_0= RULE_IDENT ) )
            {
            // InternalMyDsl.g:768:3: ( (lv_type_0_0= RULE_IDENT ) )
            // InternalMyDsl.g:769:4: (lv_type_0_0= RULE_IDENT )
            {
            // InternalMyDsl.g:769:4: (lv_type_0_0= RULE_IDENT )
            // InternalMyDsl.g:770:5: lv_type_0_0= RULE_IDENT
            {
            lv_type_0_0=(Token)match(input,RULE_IDENT,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_type_0_0, grammarAccess.getRVariableAccess().getTypeIdentTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRVariableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.xtext.example.mydsl.MyDsl.Ident");
              				
            }

            }


            }

            // InternalMyDsl.g:786:3: ( (lv_name_1_0= RULE_IDENT ) )
            // InternalMyDsl.g:787:4: (lv_name_1_0= RULE_IDENT )
            {
            // InternalMyDsl.g:787:4: (lv_name_1_0= RULE_IDENT )
            // InternalMyDsl.g:788:5: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getRVariableAccess().getNameIdentTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRVariableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.mydsl.MyDsl.Ident");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerVariable"


    // $ANTLR start "entryRulerAttribute"
    // InternalMyDsl.g:808:1: entryRulerAttribute returns [EObject current=null] : iv_rulerAttribute= rulerAttribute EOF ;
    public final EObject entryRulerAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerAttribute = null;


        try {
            // InternalMyDsl.g:808:51: (iv_rulerAttribute= rulerAttribute EOF )
            // InternalMyDsl.g:809:2: iv_rulerAttribute= rulerAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerAttribute=rulerAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerAttribute"


    // $ANTLR start "rulerAttribute"
    // InternalMyDsl.g:815:1: rulerAttribute returns [EObject current=null] : ( ( (lv_type_0_0= RULE_IDENT ) ) ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= ':=' ruleexpression )? otherlv_4= ';' ) ;
    public final EObject rulerAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:821:2: ( ( ( (lv_type_0_0= RULE_IDENT ) ) ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= ':=' ruleexpression )? otherlv_4= ';' ) )
            // InternalMyDsl.g:822:2: ( ( (lv_type_0_0= RULE_IDENT ) ) ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= ':=' ruleexpression )? otherlv_4= ';' )
            {
            // InternalMyDsl.g:822:2: ( ( (lv_type_0_0= RULE_IDENT ) ) ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= ':=' ruleexpression )? otherlv_4= ';' )
            // InternalMyDsl.g:823:3: ( (lv_type_0_0= RULE_IDENT ) ) ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= ':=' ruleexpression )? otherlv_4= ';'
            {
            // InternalMyDsl.g:823:3: ( (lv_type_0_0= RULE_IDENT ) )
            // InternalMyDsl.g:824:4: (lv_type_0_0= RULE_IDENT )
            {
            // InternalMyDsl.g:824:4: (lv_type_0_0= RULE_IDENT )
            // InternalMyDsl.g:825:5: lv_type_0_0= RULE_IDENT
            {
            lv_type_0_0=(Token)match(input,RULE_IDENT,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_type_0_0, grammarAccess.getRAttributeAccess().getTypeIdentTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRAttributeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.xtext.example.mydsl.MyDsl.Ident");
              				
            }

            }


            }

            // InternalMyDsl.g:841:3: ( (lv_name_1_0= RULE_IDENT ) )
            // InternalMyDsl.g:842:4: (lv_name_1_0= RULE_IDENT )
            {
            // InternalMyDsl.g:842:4: (lv_name_1_0= RULE_IDENT )
            // InternalMyDsl.g:843:5: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getRAttributeAccess().getNameIdentTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRAttributeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.mydsl.MyDsl.Ident");
              				
            }

            }


            }

            // InternalMyDsl.g:859:3: (otherlv_2= ':=' ruleexpression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:860:4: otherlv_2= ':=' ruleexpression
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRAttributeAccess().getColonEqualsSignKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRAttributeAccess().getExpressionParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_10);
                    ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRAttributeAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerAttribute"


    // $ANTLR start "entryRulerStatement"
    // InternalMyDsl.g:883:1: entryRulerStatement returns [String current=null] : iv_rulerStatement= rulerStatement EOF ;
    public final String entryRulerStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerStatement = null;


        try {
            // InternalMyDsl.g:883:50: (iv_rulerStatement= rulerStatement EOF )
            // InternalMyDsl.g:884:2: iv_rulerStatement= rulerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerStatement=rulerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerStatement.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerStatement"


    // $ANTLR start "rulerStatement"
    // InternalMyDsl.g:890:1: rulerStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_rVarDecl_0= rulerVarDecl | this_rAssign_1= rulerAssign | this_rForEach_2= rulerForEach | this_rWhile_3= rulerWhile | this_rIf_4= rulerIf | this_rExpression_5= rulerExpression ) ;
    public final AntlrDatatypeRuleToken rulerStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_rVarDecl_0 = null;

        AntlrDatatypeRuleToken this_rAssign_1 = null;

        AntlrDatatypeRuleToken this_rForEach_2 = null;

        AntlrDatatypeRuleToken this_rWhile_3 = null;

        AntlrDatatypeRuleToken this_rIf_4 = null;

        AntlrDatatypeRuleToken this_rExpression_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:896:2: ( (this_rVarDecl_0= rulerVarDecl | this_rAssign_1= rulerAssign | this_rForEach_2= rulerForEach | this_rWhile_3= rulerWhile | this_rIf_4= rulerIf | this_rExpression_5= rulerExpression ) )
            // InternalMyDsl.g:897:2: (this_rVarDecl_0= rulerVarDecl | this_rAssign_1= rulerAssign | this_rForEach_2= rulerForEach | this_rWhile_3= rulerWhile | this_rIf_4= rulerIf | this_rExpression_5= rulerExpression )
            {
            // InternalMyDsl.g:897:2: (this_rVarDecl_0= rulerVarDecl | this_rAssign_1= rulerAssign | this_rForEach_2= rulerForEach | this_rWhile_3= rulerWhile | this_rIf_4= rulerIf | this_rExpression_5= rulerExpression )
            int alt12=6;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:898:3: this_rVarDecl_0= rulerVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRStatementAccess().getRVarDeclParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_rVarDecl_0=rulerVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_rVarDecl_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:909:3: this_rAssign_1= rulerAssign
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRStatementAccess().getRAssignParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_rAssign_1=rulerAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_rAssign_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:920:3: this_rForEach_2= rulerForEach
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRStatementAccess().getRForEachParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_rForEach_2=rulerForEach();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_rForEach_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:931:3: this_rWhile_3= rulerWhile
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRStatementAccess().getRWhileParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_rWhile_3=rulerWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_rWhile_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:942:3: this_rIf_4= rulerIf
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRStatementAccess().getRIfParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_rIf_4=rulerIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_rIf_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:953:3: this_rExpression_5= rulerExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRStatementAccess().getRExpressionParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_rExpression_5=rulerExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_rExpression_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerStatement"


    // $ANTLR start "entryRulerVarDecl"
    // InternalMyDsl.g:967:1: entryRulerVarDecl returns [String current=null] : iv_rulerVarDecl= rulerVarDecl EOF ;
    public final String entryRulerVarDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerVarDecl = null;


        try {
            // InternalMyDsl.g:967:48: (iv_rulerVarDecl= rulerVarDecl EOF )
            // InternalMyDsl.g:968:2: iv_rulerVarDecl= rulerVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerVarDecl=rulerVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerVarDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerVarDecl"


    // $ANTLR start "rulerVarDecl"
    // InternalMyDsl.g:974:1: rulerVarDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Ident_0= RULE_IDENT this_Ident_1= RULE_IDENT (kw= ':=' this_expression_3= ruleexpression )? kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulerVarDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Ident_0=null;
        Token this_Ident_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_expression_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:980:2: ( (this_Ident_0= RULE_IDENT this_Ident_1= RULE_IDENT (kw= ':=' this_expression_3= ruleexpression )? kw= ';' ) )
            // InternalMyDsl.g:981:2: (this_Ident_0= RULE_IDENT this_Ident_1= RULE_IDENT (kw= ':=' this_expression_3= ruleexpression )? kw= ';' )
            {
            // InternalMyDsl.g:981:2: (this_Ident_0= RULE_IDENT this_Ident_1= RULE_IDENT (kw= ':=' this_expression_3= ruleexpression )? kw= ';' )
            // InternalMyDsl.g:982:3: this_Ident_0= RULE_IDENT this_Ident_1= RULE_IDENT (kw= ':=' this_expression_3= ruleexpression )? kw= ';'
            {
            this_Ident_0=(Token)match(input,RULE_IDENT,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Ident_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_0, grammarAccess.getRVarDeclAccess().getIdentTerminalRuleCall_0());
              		
            }
            this_Ident_1=(Token)match(input,RULE_IDENT,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Ident_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_1, grammarAccess.getRVarDeclAccess().getIdentTerminalRuleCall_1());
              		
            }
            // InternalMyDsl.g:996:3: (kw= ':=' this_expression_3= ruleexpression )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:997:4: kw= ':=' this_expression_3= ruleexpression
                    {
                    kw=(Token)match(input,33,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getRVarDeclAccess().getColonEqualsSignKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRVarDeclAccess().getExpressionParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_10);
                    this_expression_3=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRVarDeclAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerVarDecl"


    // $ANTLR start "entryRulerAssign"
    // InternalMyDsl.g:1022:1: entryRulerAssign returns [String current=null] : iv_rulerAssign= rulerAssign EOF ;
    public final String entryRulerAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerAssign = null;


        try {
            // InternalMyDsl.g:1022:47: (iv_rulerAssign= rulerAssign EOF )
            // InternalMyDsl.g:1023:2: iv_rulerAssign= rulerAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerAssign=rulerAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerAssign.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerAssign"


    // $ANTLR start "rulerAssign"
    // InternalMyDsl.g:1029:1: rulerAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_expression_0= ruleexpression kw= ':=' this_expression_2= ruleexpression kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulerAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1035:2: ( (this_expression_0= ruleexpression kw= ':=' this_expression_2= ruleexpression kw= ';' ) )
            // InternalMyDsl.g:1036:2: (this_expression_0= ruleexpression kw= ':=' this_expression_2= ruleexpression kw= ';' )
            {
            // InternalMyDsl.g:1036:2: (this_expression_0= ruleexpression kw= ':=' this_expression_2= ruleexpression kw= ';' )
            // InternalMyDsl.g:1037:3: this_expression_0= ruleexpression kw= ':=' this_expression_2= ruleexpression kw= ';'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRAssignAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_expression_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,33,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRAssignAccess().getColonEqualsSignKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRAssignAccess().getExpressionParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_10);
            this_expression_2=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRAssignAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerAssign"


    // $ANTLR start "entryRulerForEach"
    // InternalMyDsl.g:1071:1: entryRulerForEach returns [String current=null] : iv_rulerForEach= rulerForEach EOF ;
    public final String entryRulerForEach() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerForEach = null;


        try {
            // InternalMyDsl.g:1071:48: (iv_rulerForEach= rulerForEach EOF )
            // InternalMyDsl.g:1072:2: iv_rulerForEach= rulerForEach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRForEachRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerForEach=rulerForEach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerForEach.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerForEach"


    // $ANTLR start "rulerForEach"
    // InternalMyDsl.g:1078:1: rulerForEach returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'for' kw= '(' this_Ident_2= RULE_IDENT kw= 'in' this_rCollection_4= rulerCollection kw= ')' this_rBlock_6= rulerBlock ) ;
    public final AntlrDatatypeRuleToken rulerForEach() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_Ident_2=null;
        AntlrDatatypeRuleToken this_rCollection_4 = null;

        AntlrDatatypeRuleToken this_rBlock_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1084:2: ( (kw= 'for' kw= '(' this_Ident_2= RULE_IDENT kw= 'in' this_rCollection_4= rulerCollection kw= ')' this_rBlock_6= rulerBlock ) )
            // InternalMyDsl.g:1085:2: (kw= 'for' kw= '(' this_Ident_2= RULE_IDENT kw= 'in' this_rCollection_4= rulerCollection kw= ')' this_rBlock_6= rulerBlock )
            {
            // InternalMyDsl.g:1085:2: (kw= 'for' kw= '(' this_Ident_2= RULE_IDENT kw= 'in' this_rCollection_4= rulerCollection kw= ')' this_rBlock_6= rulerBlock )
            // InternalMyDsl.g:1086:3: kw= 'for' kw= '(' this_Ident_2= RULE_IDENT kw= 'in' this_rCollection_4= rulerCollection kw= ')' this_rBlock_6= rulerBlock
            {
            kw=(Token)match(input,34,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRForEachAccess().getForKeyword_0());
              		
            }
            kw=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRForEachAccess().getLeftParenthesisKeyword_1());
              		
            }
            this_Ident_2=(Token)match(input,RULE_IDENT,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Ident_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_2, grammarAccess.getRForEachAccess().getIdentTerminalRuleCall_2());
              		
            }
            kw=(Token)match(input,35,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRForEachAccess().getInKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRForEachAccess().getRCollectionParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_14);
            this_rCollection_4=rulerCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_rCollection_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRForEachAccess().getRightParenthesisKeyword_5());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRForEachAccess().getRBlockParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_2);
            this_rBlock_6=rulerBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_rBlock_6);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerForEach"


    // $ANTLR start "entryRulerCollection"
    // InternalMyDsl.g:1137:1: entryRulerCollection returns [String current=null] : iv_rulerCollection= rulerCollection EOF ;
    public final String entryRulerCollection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerCollection = null;


        try {
            // InternalMyDsl.g:1137:51: (iv_rulerCollection= rulerCollection EOF )
            // InternalMyDsl.g:1138:2: iv_rulerCollection= rulerCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRCollectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerCollection=rulerCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerCollection.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerCollection"


    // $ANTLR start "rulerCollection"
    // InternalMyDsl.g:1144:1: rulerCollection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '[' this_INT_1= RULE_INT kw= '..' this_INT_3= RULE_INT kw= ']' ) | this_expression_5= ruleexpression ) ;
    public final AntlrDatatypeRuleToken rulerCollection() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        AntlrDatatypeRuleToken this_expression_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1150:2: ( ( (kw= '[' this_INT_1= RULE_INT kw= '..' this_INT_3= RULE_INT kw= ']' ) | this_expression_5= ruleexpression ) )
            // InternalMyDsl.g:1151:2: ( (kw= '[' this_INT_1= RULE_INT kw= '..' this_INT_3= RULE_INT kw= ']' ) | this_expression_5= ruleexpression )
            {
            // InternalMyDsl.g:1151:2: ( (kw= '[' this_INT_1= RULE_INT kw= '..' this_INT_3= RULE_INT kw= ']' ) | this_expression_5= ruleexpression )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_IDENT && LA14_0<=RULE_STRING)||LA14_0==RULE_INT||LA14_0==RULE_REAL||LA14_0==22||LA14_0==27||LA14_0==39||(LA14_0>=47 && LA14_0<=48)||LA14_0==51||(LA14_0>=73 && LA14_0<=77)||(LA14_0>=79 && LA14_0<=84)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1152:3: (kw= '[' this_INT_1= RULE_INT kw= '..' this_INT_3= RULE_INT kw= ']' )
                    {
                    // InternalMyDsl.g:1152:3: (kw= '[' this_INT_1= RULE_INT kw= '..' this_INT_3= RULE_INT kw= ']' )
                    // InternalMyDsl.g:1153:4: kw= '[' this_INT_1= RULE_INT kw= '..' this_INT_3= RULE_INT kw= ']'
                    {
                    kw=(Token)match(input,36,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getRCollectionAccess().getLeftSquareBracketKeyword_0_0());
                      			
                    }
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_1, grammarAccess.getRCollectionAccess().getINTTerminalRuleCall_0_1());
                      			
                    }
                    kw=(Token)match(input,37,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getRCollectionAccess().getFullStopFullStopKeyword_0_2());
                      			
                    }
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_3, grammarAccess.getRCollectionAccess().getINTTerminalRuleCall_0_3());
                      			
                    }
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getRCollectionAccess().getRightSquareBracketKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1184:3: this_expression_5= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRCollectionAccess().getExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_expression_5=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_expression_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerCollection"


    // $ANTLR start "entryRulerBlock"
    // InternalMyDsl.g:1198:1: entryRulerBlock returns [String current=null] : iv_rulerBlock= rulerBlock EOF ;
    public final String entryRulerBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerBlock = null;


        try {
            // InternalMyDsl.g:1198:46: (iv_rulerBlock= rulerBlock EOF )
            // InternalMyDsl.g:1199:2: iv_rulerBlock= rulerBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerBlock=rulerBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerBlock.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerBlock"


    // $ANTLR start "rulerBlock"
    // InternalMyDsl.g:1205:1: rulerBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' (this_rStatement_1= rulerStatement (this_rStatement_2= rulerStatement )* )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulerBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_rStatement_1 = null;

        AntlrDatatypeRuleToken this_rStatement_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1211:2: ( (kw= '{' (this_rStatement_1= rulerStatement (this_rStatement_2= rulerStatement )* )? kw= '}' ) )
            // InternalMyDsl.g:1212:2: (kw= '{' (this_rStatement_1= rulerStatement (this_rStatement_2= rulerStatement )* )? kw= '}' )
            {
            // InternalMyDsl.g:1212:2: (kw= '{' (this_rStatement_1= rulerStatement (this_rStatement_2= rulerStatement )* )? kw= '}' )
            // InternalMyDsl.g:1213:3: kw= '{' (this_rStatement_1= rulerStatement (this_rStatement_2= rulerStatement )* )? kw= '}'
            {
            kw=(Token)match(input,27,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalMyDsl.g:1218:3: (this_rStatement_1= rulerStatement (this_rStatement_2= rulerStatement )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_IDENT && LA16_0<=RULE_STRING)||LA16_0==RULE_INT||LA16_0==RULE_REAL||LA16_0==22||LA16_0==27||LA16_0==34||LA16_0==39||LA16_0==41||(LA16_0>=47 && LA16_0<=48)||LA16_0==51||(LA16_0>=73 && LA16_0<=77)||(LA16_0>=79 && LA16_0<=84)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1219:4: this_rStatement_1= rulerStatement (this_rStatement_2= rulerStatement )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRBlockAccess().getRStatementParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_rStatement_1=rulerStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_rStatement_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyDsl.g:1229:4: (this_rStatement_2= rulerStatement )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=RULE_IDENT && LA15_0<=RULE_STRING)||LA15_0==RULE_INT||LA15_0==RULE_REAL||LA15_0==22||LA15_0==27||LA15_0==34||LA15_0==39||LA15_0==41||(LA15_0>=47 && LA15_0<=48)||LA15_0==51||(LA15_0>=73 && LA15_0<=77)||(LA15_0>=79 && LA15_0<=84)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMyDsl.g:1230:5: this_rStatement_2= rulerStatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getRBlockAccess().getRStatementParserRuleCall_1_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_31);
                    	    this_rStatement_2=rulerStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_rStatement_2);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRBlockAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerBlock"


    // $ANTLR start "entryRulerIf"
    // InternalMyDsl.g:1251:1: entryRulerIf returns [String current=null] : iv_rulerIf= rulerIf EOF ;
    public final String entryRulerIf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerIf = null;


        try {
            // InternalMyDsl.g:1251:43: (iv_rulerIf= rulerIf EOF )
            // InternalMyDsl.g:1252:2: iv_rulerIf= rulerIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerIf=rulerIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerIf.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerIf"


    // $ANTLR start "rulerIf"
    // InternalMyDsl.g:1258:1: rulerIf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'if' kw= '(' this_expression_2= ruleexpression kw= ')' this_rBlock_4= rulerBlock (kw= 'else' this_rBlock_6= rulerBlock )? ) ;
    public final AntlrDatatypeRuleToken rulerIf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_rBlock_4 = null;

        AntlrDatatypeRuleToken this_rBlock_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1264:2: ( (kw= 'if' kw= '(' this_expression_2= ruleexpression kw= ')' this_rBlock_4= rulerBlock (kw= 'else' this_rBlock_6= rulerBlock )? ) )
            // InternalMyDsl.g:1265:2: (kw= 'if' kw= '(' this_expression_2= ruleexpression kw= ')' this_rBlock_4= rulerBlock (kw= 'else' this_rBlock_6= rulerBlock )? )
            {
            // InternalMyDsl.g:1265:2: (kw= 'if' kw= '(' this_expression_2= ruleexpression kw= ')' this_rBlock_4= rulerBlock (kw= 'else' this_rBlock_6= rulerBlock )? )
            // InternalMyDsl.g:1266:3: kw= 'if' kw= '(' this_expression_2= ruleexpression kw= ')' this_rBlock_4= rulerBlock (kw= 'else' this_rBlock_6= rulerBlock )?
            {
            kw=(Token)match(input,39,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRIfAccess().getIfKeyword_0());
              		
            }
            kw=(Token)match(input,22,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRIfAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRIfAccess().getExpressionParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_14);
            this_expression_2=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRIfAccess().getRightParenthesisKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRIfAccess().getRBlockParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_32);
            this_rBlock_4=rulerBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_rBlock_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:1301:3: (kw= 'else' this_rBlock_6= rulerBlock )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1302:4: kw= 'else' this_rBlock_6= rulerBlock
                    {
                    kw=(Token)match(input,40,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getRIfAccess().getElseKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRIfAccess().getRBlockParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_rBlock_6=rulerBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_rBlock_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerIf"


    // $ANTLR start "entryRulerWhile"
    // InternalMyDsl.g:1322:1: entryRulerWhile returns [String current=null] : iv_rulerWhile= rulerWhile EOF ;
    public final String entryRulerWhile() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerWhile = null;


        try {
            // InternalMyDsl.g:1322:46: (iv_rulerWhile= rulerWhile EOF )
            // InternalMyDsl.g:1323:2: iv_rulerWhile= rulerWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerWhile=rulerWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerWhile.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerWhile"


    // $ANTLR start "rulerWhile"
    // InternalMyDsl.g:1329:1: rulerWhile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'while' kw= '(' this_expression_2= ruleexpression kw= ')' this_rBlock_4= rulerBlock ) ;
    public final AntlrDatatypeRuleToken rulerWhile() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_rBlock_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1335:2: ( (kw= 'while' kw= '(' this_expression_2= ruleexpression kw= ')' this_rBlock_4= rulerBlock ) )
            // InternalMyDsl.g:1336:2: (kw= 'while' kw= '(' this_expression_2= ruleexpression kw= ')' this_rBlock_4= rulerBlock )
            {
            // InternalMyDsl.g:1336:2: (kw= 'while' kw= '(' this_expression_2= ruleexpression kw= ')' this_rBlock_4= rulerBlock )
            // InternalMyDsl.g:1337:3: kw= 'while' kw= '(' this_expression_2= ruleexpression kw= ')' this_rBlock_4= rulerBlock
            {
            kw=(Token)match(input,41,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRWhileAccess().getWhileKeyword_0());
              		
            }
            kw=(Token)match(input,22,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRWhileAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRWhileAccess().getExpressionParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_14);
            this_expression_2=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRWhileAccess().getRightParenthesisKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRWhileAccess().getRBlockParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_2);
            this_rBlock_4=rulerBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_rBlock_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerWhile"


    // $ANTLR start "entryRulerExpression"
    // InternalMyDsl.g:1376:1: entryRulerExpression returns [String current=null] : iv_rulerExpression= rulerExpression EOF ;
    public final String entryRulerExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerExpression = null;


        try {
            // InternalMyDsl.g:1376:51: (iv_rulerExpression= rulerExpression EOF )
            // InternalMyDsl.g:1377:2: iv_rulerExpression= rulerExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerExpression=rulerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerExpression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerExpression"


    // $ANTLR start "rulerExpression"
    // InternalMyDsl.g:1383:1: rulerExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_expression_0= ruleexpression kw= ';' ) ;
    public final AntlrDatatypeRuleToken rulerExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1389:2: ( (this_expression_0= ruleexpression kw= ';' ) )
            // InternalMyDsl.g:1390:2: (this_expression_0= ruleexpression kw= ';' )
            {
            // InternalMyDsl.g:1390:2: (this_expression_0= ruleexpression kw= ';' )
            // InternalMyDsl.g:1391:3: this_expression_0= ruleexpression kw= ';'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRExpressionAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_10);
            this_expression_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRExpressionAccess().getSemicolonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerExpression"


    // $ANTLR start "entryRuleexpression"
    // InternalMyDsl.g:1410:1: entryRuleexpression returns [String current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final String entryRuleexpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpression = null;


        try {
            // InternalMyDsl.g:1410:50: (iv_ruleexpression= ruleexpression EOF )
            // InternalMyDsl.g:1411:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalMyDsl.g:1417:1: ruleexpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_nonLeftRecExpression_0= rulenonLeftRecExpression (this_recExpression_1= rulerecExpression )? ) ;
    public final AntlrDatatypeRuleToken ruleexpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_nonLeftRecExpression_0 = null;

        AntlrDatatypeRuleToken this_recExpression_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1423:2: ( (this_nonLeftRecExpression_0= rulenonLeftRecExpression (this_recExpression_1= rulerecExpression )? ) )
            // InternalMyDsl.g:1424:2: (this_nonLeftRecExpression_0= rulenonLeftRecExpression (this_recExpression_1= rulerecExpression )? )
            {
            // InternalMyDsl.g:1424:2: (this_nonLeftRecExpression_0= rulenonLeftRecExpression (this_recExpression_1= rulerecExpression )? )
            // InternalMyDsl.g:1425:3: this_nonLeftRecExpression_0= rulenonLeftRecExpression (this_recExpression_1= rulerecExpression )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getNonLeftRecExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            this_nonLeftRecExpression_0=rulenonLeftRecExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_nonLeftRecExpression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:1435:3: (this_recExpression_1= rulerecExpression )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1436:4: this_recExpression_1= rulerecExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getRecExpressionParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_recExpression_1=rulerecExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_recExpression_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulerecExpression"
    // InternalMyDsl.g:1451:1: entryRulerecExpression returns [String current=null] : iv_rulerecExpression= rulerecExpression EOF ;
    public final String entryRulerecExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerecExpression = null;


        try {
            // InternalMyDsl.g:1451:53: (iv_rulerecExpression= rulerecExpression EOF )
            // InternalMyDsl.g:1452:2: iv_rulerecExpression= rulerecExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulerecExpression=rulerecExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerecExpression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerecExpression"


    // $ANTLR start "rulerecExpression"
    // InternalMyDsl.g:1458:1: rulerecExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_navigationSegment_0= rulenavigationSegment | (this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression ) | (this_addOp_3= ruleaddOp this_expression_4= ruleexpression ) | (this_compOp_5= rulecompOp this_expression_6= ruleexpression ) | (kw= 'and' this_expression_8= ruleexpression ) | (kw= 'or' this_expression_10= ruleexpression ) | (kw= 'xor' this_expression_12= ruleexpression ) | (kw= 'implies' this_expression_14= ruleexpression ) ) (this_recExpression_15= rulerecExpression )? ) ;
    public final AntlrDatatypeRuleToken rulerecExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MultOp_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_navigationSegment_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;

        AntlrDatatypeRuleToken this_addOp_3 = null;

        AntlrDatatypeRuleToken this_expression_4 = null;

        AntlrDatatypeRuleToken this_compOp_5 = null;

        AntlrDatatypeRuleToken this_expression_6 = null;

        AntlrDatatypeRuleToken this_expression_8 = null;

        AntlrDatatypeRuleToken this_expression_10 = null;

        AntlrDatatypeRuleToken this_expression_12 = null;

        AntlrDatatypeRuleToken this_expression_14 = null;

        AntlrDatatypeRuleToken this_recExpression_15 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1464:2: ( ( (this_navigationSegment_0= rulenavigationSegment | (this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression ) | (this_addOp_3= ruleaddOp this_expression_4= ruleexpression ) | (this_compOp_5= rulecompOp this_expression_6= ruleexpression ) | (kw= 'and' this_expression_8= ruleexpression ) | (kw= 'or' this_expression_10= ruleexpression ) | (kw= 'xor' this_expression_12= ruleexpression ) | (kw= 'implies' this_expression_14= ruleexpression ) ) (this_recExpression_15= rulerecExpression )? ) )
            // InternalMyDsl.g:1465:2: ( (this_navigationSegment_0= rulenavigationSegment | (this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression ) | (this_addOp_3= ruleaddOp this_expression_4= ruleexpression ) | (this_compOp_5= rulecompOp this_expression_6= ruleexpression ) | (kw= 'and' this_expression_8= ruleexpression ) | (kw= 'or' this_expression_10= ruleexpression ) | (kw= 'xor' this_expression_12= ruleexpression ) | (kw= 'implies' this_expression_14= ruleexpression ) ) (this_recExpression_15= rulerecExpression )? )
            {
            // InternalMyDsl.g:1465:2: ( (this_navigationSegment_0= rulenavigationSegment | (this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression ) | (this_addOp_3= ruleaddOp this_expression_4= ruleexpression ) | (this_compOp_5= rulecompOp this_expression_6= ruleexpression ) | (kw= 'and' this_expression_8= ruleexpression ) | (kw= 'or' this_expression_10= ruleexpression ) | (kw= 'xor' this_expression_12= ruleexpression ) | (kw= 'implies' this_expression_14= ruleexpression ) ) (this_recExpression_15= rulerecExpression )? )
            // InternalMyDsl.g:1466:3: (this_navigationSegment_0= rulenavigationSegment | (this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression ) | (this_addOp_3= ruleaddOp this_expression_4= ruleexpression ) | (this_compOp_5= rulecompOp this_expression_6= ruleexpression ) | (kw= 'and' this_expression_8= ruleexpression ) | (kw= 'or' this_expression_10= ruleexpression ) | (kw= 'xor' this_expression_12= ruleexpression ) | (kw= 'implies' this_expression_14= ruleexpression ) ) (this_recExpression_15= rulerecExpression )?
            {
            // InternalMyDsl.g:1466:3: (this_navigationSegment_0= rulenavigationSegment | (this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression ) | (this_addOp_3= ruleaddOp this_expression_4= ruleexpression ) | (this_compOp_5= rulecompOp this_expression_6= ruleexpression ) | (kw= 'and' this_expression_8= ruleexpression ) | (kw= 'or' this_expression_10= ruleexpression ) | (kw= 'xor' this_expression_12= ruleexpression ) | (kw= 'implies' this_expression_14= ruleexpression ) )
            int alt19=8;
            switch ( input.LA(1) ) {
            case 16:
            case 46:
                {
                alt19=1;
                }
                break;
            case RULE_MULTOP:
                {
                alt19=2;
                }
                break;
            case 48:
            case 54:
                {
                alt19=3;
                }
                break;
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt19=4;
                }
                break;
            case 42:
                {
                alt19=5;
                }
                break;
            case 43:
                {
                alt19=6;
                }
                break;
            case 44:
                {
                alt19=7;
                }
                break;
            case 45:
                {
                alt19=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1467:4: this_navigationSegment_0= rulenavigationSegment
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRecExpressionAccess().getNavigationSegmentParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_33);
                    this_navigationSegment_0=rulenavigationSegment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_navigationSegment_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1478:4: (this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression )
                    {
                    // InternalMyDsl.g:1478:4: (this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression )
                    // InternalMyDsl.g:1479:5: this_MultOp_1= RULE_MULTOP this_expression_2= ruleexpression
                    {
                    this_MultOp_1=(Token)match(input,RULE_MULTOP,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_MultOp_1);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_MultOp_1, grammarAccess.getRecExpressionAccess().getMultOpTerminalRuleCall_0_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_1_1());
                      				
                    }
                    pushFollow(FOLLOW_33);
                    this_expression_2=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_expression_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1498:4: (this_addOp_3= ruleaddOp this_expression_4= ruleexpression )
                    {
                    // InternalMyDsl.g:1498:4: (this_addOp_3= ruleaddOp this_expression_4= ruleexpression )
                    // InternalMyDsl.g:1499:5: this_addOp_3= ruleaddOp this_expression_4= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getAddOpParserRuleCall_0_2_0());
                      				
                    }
                    pushFollow(FOLLOW_24);
                    this_addOp_3=ruleaddOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_addOp_3);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_2_1());
                      				
                    }
                    pushFollow(FOLLOW_33);
                    this_expression_4=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_expression_4);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1521:4: (this_compOp_5= rulecompOp this_expression_6= ruleexpression )
                    {
                    // InternalMyDsl.g:1521:4: (this_compOp_5= rulecompOp this_expression_6= ruleexpression )
                    // InternalMyDsl.g:1522:5: this_compOp_5= rulecompOp this_expression_6= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getCompOpParserRuleCall_0_3_0());
                      				
                    }
                    pushFollow(FOLLOW_24);
                    this_compOp_5=rulecompOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_compOp_5);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_3_1());
                      				
                    }
                    pushFollow(FOLLOW_33);
                    this_expression_6=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_expression_6);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1544:4: (kw= 'and' this_expression_8= ruleexpression )
                    {
                    // InternalMyDsl.g:1544:4: (kw= 'and' this_expression_8= ruleexpression )
                    // InternalMyDsl.g:1545:5: kw= 'and' this_expression_8= ruleexpression
                    {
                    kw=(Token)match(input,42,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getRecExpressionAccess().getAndKeyword_0_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_4_1());
                      				
                    }
                    pushFollow(FOLLOW_33);
                    this_expression_8=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_expression_8);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1562:4: (kw= 'or' this_expression_10= ruleexpression )
                    {
                    // InternalMyDsl.g:1562:4: (kw= 'or' this_expression_10= ruleexpression )
                    // InternalMyDsl.g:1563:5: kw= 'or' this_expression_10= ruleexpression
                    {
                    kw=(Token)match(input,43,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getRecExpressionAccess().getOrKeyword_0_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_5_1());
                      				
                    }
                    pushFollow(FOLLOW_33);
                    this_expression_10=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_expression_10);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1580:4: (kw= 'xor' this_expression_12= ruleexpression )
                    {
                    // InternalMyDsl.g:1580:4: (kw= 'xor' this_expression_12= ruleexpression )
                    // InternalMyDsl.g:1581:5: kw= 'xor' this_expression_12= ruleexpression
                    {
                    kw=(Token)match(input,44,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getRecExpressionAccess().getXorKeyword_0_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_6_1());
                      				
                    }
                    pushFollow(FOLLOW_33);
                    this_expression_12=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_expression_12);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1598:4: (kw= 'implies' this_expression_14= ruleexpression )
                    {
                    // InternalMyDsl.g:1598:4: (kw= 'implies' this_expression_14= ruleexpression )
                    // InternalMyDsl.g:1599:5: kw= 'implies' this_expression_14= ruleexpression
                    {
                    kw=(Token)match(input,45,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getRecExpressionAccess().getImpliesKeyword_0_7_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRecExpressionAccess().getExpressionParserRuleCall_0_7_1());
                      				
                    }
                    pushFollow(FOLLOW_33);
                    this_expression_14=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_expression_14);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1616:3: (this_recExpression_15= rulerecExpression )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1617:4: this_recExpression_15= rulerecExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRecExpressionAccess().getRecExpressionParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_recExpression_15=rulerecExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_recExpression_15);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerecExpression"


    // $ANTLR start "entryRulenavigationSegment"
    // InternalMyDsl.g:1632:1: entryRulenavigationSegment returns [String current=null] : iv_rulenavigationSegment= rulenavigationSegment EOF ;
    public final String entryRulenavigationSegment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenavigationSegment = null;


        try {
            // InternalMyDsl.g:1632:57: (iv_rulenavigationSegment= rulenavigationSegment EOF )
            // InternalMyDsl.g:1633:2: iv_rulenavigationSegment= rulenavigationSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationSegmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulenavigationSegment=rulenavigationSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenavigationSegment.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenavigationSegment"


    // $ANTLR start "rulenavigationSegment"
    // InternalMyDsl.g:1639:1: rulenavigationSegment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' this_Ident_1= RULE_IDENT ) | (kw= '.' this_callExp_3= rulecallExp ) | (kw= '->' this_callExp_5= rulecallExp ) ) ;
    public final AntlrDatatypeRuleToken rulenavigationSegment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_Ident_1=null;
        AntlrDatatypeRuleToken this_callExp_3 = null;

        AntlrDatatypeRuleToken this_callExp_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1645:2: ( ( (kw= '.' this_Ident_1= RULE_IDENT ) | (kw= '.' this_callExp_3= rulecallExp ) | (kw= '->' this_callExp_5= rulecallExp ) ) )
            // InternalMyDsl.g:1646:2: ( (kw= '.' this_Ident_1= RULE_IDENT ) | (kw= '.' this_callExp_3= rulecallExp ) | (kw= '->' this_callExp_5= rulecallExp ) )
            {
            // InternalMyDsl.g:1646:2: ( (kw= '.' this_Ident_1= RULE_IDENT ) | (kw= '.' this_callExp_3= rulecallExp ) | (kw= '->' this_callExp_5= rulecallExp ) )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_IDENT) ) {
                    int LA21_3 = input.LA(3);

                    if ( (LA21_3==EOF||LA21_3==RULE_MULTOP||LA21_3==16||LA21_3==20||LA21_3==24||LA21_3==28||(LA21_3>=32 && LA21_3<=33)||LA21_3==35||LA21_3==40||(LA21_3>=42 && LA21_3<=46)||(LA21_3>=48 && LA21_3<=50)||(LA21_3>=53 && LA21_3<=61)) ) {
                        alt21=1;
                    }
                    else if ( (LA21_3==22) ) {
                        alt21=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA21_1>=62 && LA21_1<=71)) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==46) ) {
                alt21=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1647:3: (kw= '.' this_Ident_1= RULE_IDENT )
                    {
                    // InternalMyDsl.g:1647:3: (kw= '.' this_Ident_1= RULE_IDENT )
                    // InternalMyDsl.g:1648:4: kw= '.' this_Ident_1= RULE_IDENT
                    {
                    kw=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNavigationSegmentAccess().getFullStopKeyword_0_0());
                      			
                    }
                    this_Ident_1=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Ident_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_1, grammarAccess.getNavigationSegmentAccess().getIdentTerminalRuleCall_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1662:3: (kw= '.' this_callExp_3= rulecallExp )
                    {
                    // InternalMyDsl.g:1662:3: (kw= '.' this_callExp_3= rulecallExp )
                    // InternalMyDsl.g:1663:4: kw= '.' this_callExp_3= rulecallExp
                    {
                    kw=(Token)match(input,16,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNavigationSegmentAccess().getFullStopKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNavigationSegmentAccess().getCallExpParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_callExp_3=rulecallExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_callExp_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1680:3: (kw= '->' this_callExp_5= rulecallExp )
                    {
                    // InternalMyDsl.g:1680:3: (kw= '->' this_callExp_5= rulecallExp )
                    // InternalMyDsl.g:1681:4: kw= '->' this_callExp_5= rulecallExp
                    {
                    kw=(Token)match(input,46,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNavigationSegmentAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNavigationSegmentAccess().getCallExpParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_callExp_5=rulecallExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_callExp_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenavigationSegment"


    // $ANTLR start "entryRulenonLeftRecExpression"
    // InternalMyDsl.g:1701:1: entryRulenonLeftRecExpression returns [String current=null] : iv_rulenonLeftRecExpression= rulenonLeftRecExpression EOF ;
    public final String entryRulenonLeftRecExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenonLeftRecExpression = null;


        try {
            // InternalMyDsl.g:1701:60: (iv_rulenonLeftRecExpression= rulenonLeftRecExpression EOF )
            // InternalMyDsl.g:1702:2: iv_rulenonLeftRecExpression= rulenonLeftRecExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonLeftRecExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulenonLeftRecExpression=rulenonLeftRecExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenonLeftRecExpression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenonLeftRecExpression"


    // $ANTLR start "rulenonLeftRecExpression"
    // InternalMyDsl.g:1708:1: rulenonLeftRecExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'not' this_expression_1= ruleexpression ) | (kw= '-' this_expression_3= ruleexpression ) | this_Ident_4= RULE_IDENT | this_literal_5= ruleliteral | (kw= '(' this_expression_7= ruleexpression kw= ')' ) | (kw= 'if' this_expression_10= ruleexpression kw= 'then' this_expression_12= ruleexpression kw= 'else' this_expression_14= ruleexpression kw= 'endif' ) | (kw= 'let' this_binding_17= rulebinding (kw= ',' this_binding_19= rulebinding )* kw= 'in' this_expression_21= ruleexpression ) ) ;
    public final AntlrDatatypeRuleToken rulenonLeftRecExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_Ident_4=null;
        AntlrDatatypeRuleToken this_expression_1 = null;

        AntlrDatatypeRuleToken this_expression_3 = null;

        AntlrDatatypeRuleToken this_literal_5 = null;

        AntlrDatatypeRuleToken this_expression_7 = null;

        AntlrDatatypeRuleToken this_expression_10 = null;

        AntlrDatatypeRuleToken this_expression_12 = null;

        AntlrDatatypeRuleToken this_expression_14 = null;

        AntlrDatatypeRuleToken this_binding_17 = null;

        AntlrDatatypeRuleToken this_binding_19 = null;

        AntlrDatatypeRuleToken this_expression_21 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1714:2: ( ( (kw= 'not' this_expression_1= ruleexpression ) | (kw= '-' this_expression_3= ruleexpression ) | this_Ident_4= RULE_IDENT | this_literal_5= ruleliteral | (kw= '(' this_expression_7= ruleexpression kw= ')' ) | (kw= 'if' this_expression_10= ruleexpression kw= 'then' this_expression_12= ruleexpression kw= 'else' this_expression_14= ruleexpression kw= 'endif' ) | (kw= 'let' this_binding_17= rulebinding (kw= ',' this_binding_19= rulebinding )* kw= 'in' this_expression_21= ruleexpression ) ) )
            // InternalMyDsl.g:1715:2: ( (kw= 'not' this_expression_1= ruleexpression ) | (kw= '-' this_expression_3= ruleexpression ) | this_Ident_4= RULE_IDENT | this_literal_5= ruleliteral | (kw= '(' this_expression_7= ruleexpression kw= ')' ) | (kw= 'if' this_expression_10= ruleexpression kw= 'then' this_expression_12= ruleexpression kw= 'else' this_expression_14= ruleexpression kw= 'endif' ) | (kw= 'let' this_binding_17= rulebinding (kw= ',' this_binding_19= rulebinding )* kw= 'in' this_expression_21= ruleexpression ) )
            {
            // InternalMyDsl.g:1715:2: ( (kw= 'not' this_expression_1= ruleexpression ) | (kw= '-' this_expression_3= ruleexpression ) | this_Ident_4= RULE_IDENT | this_literal_5= ruleliteral | (kw= '(' this_expression_7= ruleexpression kw= ')' ) | (kw= 'if' this_expression_10= ruleexpression kw= 'then' this_expression_12= ruleexpression kw= 'else' this_expression_14= ruleexpression kw= 'endif' ) | (kw= 'let' this_binding_17= rulebinding (kw= ',' this_binding_19= rulebinding )* kw= 'in' this_expression_21= ruleexpression ) )
            int alt23=7;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt23=1;
                }
                break;
            case 48:
                {
                alt23=2;
                }
                break;
            case RULE_IDENT:
                {
                int LA23_3 = input.LA(2);

                if ( (LA23_3==52||LA23_3==78) ) {
                    alt23=4;
                }
                else if ( (LA23_3==EOF||LA23_3==RULE_MULTOP||LA23_3==16||LA23_3==20||LA23_3==24||LA23_3==28||(LA23_3>=32 && LA23_3<=33)||LA23_3==35||LA23_3==40||(LA23_3>=42 && LA23_3<=46)||(LA23_3>=48 && LA23_3<=50)||(LA23_3>=53 && LA23_3<=61)) ) {
                    alt23=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_REAL:
            case 27:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
                {
                alt23=4;
                }
                break;
            case 22:
                {
                alt23=5;
                }
                break;
            case 39:
                {
                alt23=6;
                }
                break;
            case 51:
                {
                alt23=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1716:3: (kw= 'not' this_expression_1= ruleexpression )
                    {
                    // InternalMyDsl.g:1716:3: (kw= 'not' this_expression_1= ruleexpression )
                    // InternalMyDsl.g:1717:4: kw= 'not' this_expression_1= ruleexpression
                    {
                    kw=(Token)match(input,47,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNonLeftRecExpressionAccess().getNotKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_expression_1=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1734:3: (kw= '-' this_expression_3= ruleexpression )
                    {
                    // InternalMyDsl.g:1734:3: (kw= '-' this_expression_3= ruleexpression )
                    // InternalMyDsl.g:1735:4: kw= '-' this_expression_3= ruleexpression
                    {
                    kw=(Token)match(input,48,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNonLeftRecExpressionAccess().getHyphenMinusKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_expression_3=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1752:3: this_Ident_4= RULE_IDENT
                    {
                    this_Ident_4=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Ident_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_Ident_4, grammarAccess.getNonLeftRecExpressionAccess().getIdentTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1760:3: this_literal_5= ruleliteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_literal_5=ruleliteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_literal_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1771:3: (kw= '(' this_expression_7= ruleexpression kw= ')' )
                    {
                    // InternalMyDsl.g:1771:3: (kw= '(' this_expression_7= ruleexpression kw= ')' )
                    // InternalMyDsl.g:1772:4: kw= '(' this_expression_7= ruleexpression kw= ')'
                    {
                    kw=(Token)match(input,22,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNonLeftRecExpressionAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_expression_7=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNonLeftRecExpressionAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1794:3: (kw= 'if' this_expression_10= ruleexpression kw= 'then' this_expression_12= ruleexpression kw= 'else' this_expression_14= ruleexpression kw= 'endif' )
                    {
                    // InternalMyDsl.g:1794:3: (kw= 'if' this_expression_10= ruleexpression kw= 'then' this_expression_12= ruleexpression kw= 'else' this_expression_14= ruleexpression kw= 'endif' )
                    // InternalMyDsl.g:1795:4: kw= 'if' this_expression_10= ruleexpression kw= 'then' this_expression_12= ruleexpression kw= 'else' this_expression_14= ruleexpression kw= 'endif'
                    {
                    kw=(Token)match(input,39,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNonLeftRecExpressionAccess().getIfKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_35);
                    this_expression_10=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,49,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNonLeftRecExpressionAccess().getThenKeyword_5_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_5_3());
                      			
                    }
                    pushFollow(FOLLOW_36);
                    this_expression_12=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_12);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,40,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNonLeftRecExpressionAccess().getElseKeyword_5_4());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_5_5());
                      			
                    }
                    pushFollow(FOLLOW_37);
                    this_expression_14=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_14);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNonLeftRecExpressionAccess().getEndifKeyword_5_6());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1847:3: (kw= 'let' this_binding_17= rulebinding (kw= ',' this_binding_19= rulebinding )* kw= 'in' this_expression_21= ruleexpression )
                    {
                    // InternalMyDsl.g:1847:3: (kw= 'let' this_binding_17= rulebinding (kw= ',' this_binding_19= rulebinding )* kw= 'in' this_expression_21= ruleexpression )
                    // InternalMyDsl.g:1848:4: kw= 'let' this_binding_17= rulebinding (kw= ',' this_binding_19= rulebinding )* kw= 'in' this_expression_21= ruleexpression
                    {
                    kw=(Token)match(input,51,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNonLeftRecExpressionAccess().getLetKeyword_6_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getBindingParserRuleCall_6_1());
                      			
                    }
                    pushFollow(FOLLOW_38);
                    this_binding_17=rulebinding();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_binding_17);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyDsl.g:1863:4: (kw= ',' this_binding_19= rulebinding )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==32) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalMyDsl.g:1864:5: kw= ',' this_binding_19= rulebinding
                    	    {
                    	    kw=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getNonLeftRecExpressionAccess().getCommaKeyword_6_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getBindingParserRuleCall_6_2_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_38);
                    	    this_binding_19=rulebinding();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_binding_19);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    kw=(Token)match(input,35,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNonLeftRecExpressionAccess().getInKeyword_6_3());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNonLeftRecExpressionAccess().getExpressionParserRuleCall_6_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_expression_21=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expression_21);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenonLeftRecExpression"


    // $ANTLR start "entryRulebinding"
    // InternalMyDsl.g:1900:1: entryRulebinding returns [String current=null] : iv_rulebinding= rulebinding EOF ;
    public final String entryRulebinding() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebinding = null;


        try {
            // InternalMyDsl.g:1900:47: (iv_rulebinding= rulebinding EOF )
            // InternalMyDsl.g:1901:2: iv_rulebinding= rulebinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebinding=rulebinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebinding.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebinding"


    // $ANTLR start "rulebinding"
    // InternalMyDsl.g:1907:1: rulebinding returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Ident_0= RULE_IDENT (kw= ':' this_typeLiteral_2= ruletypeLiteral )? kw= '=' this_expression_4= ruleexpression ) ;
    public final AntlrDatatypeRuleToken rulebinding() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Ident_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_typeLiteral_2 = null;

        AntlrDatatypeRuleToken this_expression_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1913:2: ( (this_Ident_0= RULE_IDENT (kw= ':' this_typeLiteral_2= ruletypeLiteral )? kw= '=' this_expression_4= ruleexpression ) )
            // InternalMyDsl.g:1914:2: (this_Ident_0= RULE_IDENT (kw= ':' this_typeLiteral_2= ruletypeLiteral )? kw= '=' this_expression_4= ruleexpression )
            {
            // InternalMyDsl.g:1914:2: (this_Ident_0= RULE_IDENT (kw= ':' this_typeLiteral_2= ruletypeLiteral )? kw= '=' this_expression_4= ruleexpression )
            // InternalMyDsl.g:1915:3: this_Ident_0= RULE_IDENT (kw= ':' this_typeLiteral_2= ruletypeLiteral )? kw= '=' this_expression_4= ruleexpression
            {
            this_Ident_0=(Token)match(input,RULE_IDENT,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Ident_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_0, grammarAccess.getBindingAccess().getIdentTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:1922:3: (kw= ':' this_typeLiteral_2= ruletypeLiteral )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==52) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1923:4: kw= ':' this_typeLiteral_2= ruletypeLiteral
                    {
                    kw=(Token)match(input,52,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getBindingAccess().getColonKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBindingAccess().getTypeLiteralParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_41);
                    this_typeLiteral_2=ruletypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_typeLiteral_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,53,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBindingAccess().getEqualsSignKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBindingAccess().getExpressionParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            this_expression_4=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_expression_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebinding"


    // $ANTLR start "entryRuleaddOp"
    // InternalMyDsl.g:1958:1: entryRuleaddOp returns [String current=null] : iv_ruleaddOp= ruleaddOp EOF ;
    public final String entryRuleaddOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleaddOp = null;


        try {
            // InternalMyDsl.g:1958:45: (iv_ruleaddOp= ruleaddOp EOF )
            // InternalMyDsl.g:1959:2: iv_ruleaddOp= ruleaddOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleaddOp=ruleaddOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleaddOp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleaddOp"


    // $ANTLR start "ruleaddOp"
    // InternalMyDsl.g:1965:1: ruleaddOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleaddOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1971:2: ( (kw= '+' | kw= '-' ) )
            // InternalMyDsl.g:1972:2: (kw= '+' | kw= '-' )
            {
            // InternalMyDsl.g:1972:2: (kw= '+' | kw= '-' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==54) ) {
                alt25=1;
            }
            else if ( (LA25_0==48) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1973:3: kw= '+'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAddOpAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1979:3: kw= '-'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAddOpAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleaddOp"


    // $ANTLR start "entryRulecompOp"
    // InternalMyDsl.g:1988:1: entryRulecompOp returns [String current=null] : iv_rulecompOp= rulecompOp EOF ;
    public final String entryRulecompOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecompOp = null;


        try {
            // InternalMyDsl.g:1988:46: (iv_rulecompOp= rulecompOp EOF )
            // InternalMyDsl.g:1989:2: iv_rulecompOp= rulecompOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecompOp=rulecompOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecompOp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecompOp"


    // $ANTLR start "rulecompOp"
    // InternalMyDsl.g:1995:1: rulecompOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<=' | kw= '>=' | kw= '!=' | kw= '<>' | kw= '=' | kw= '==' | kw= '<' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken rulecompOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2001:2: ( (kw= '<=' | kw= '>=' | kw= '!=' | kw= '<>' | kw= '=' | kw= '==' | kw= '<' | kw= '>' ) )
            // InternalMyDsl.g:2002:2: (kw= '<=' | kw= '>=' | kw= '!=' | kw= '<>' | kw= '=' | kw= '==' | kw= '<' | kw= '>' )
            {
            // InternalMyDsl.g:2002:2: (kw= '<=' | kw= '>=' | kw= '!=' | kw= '<>' | kw= '=' | kw= '==' | kw= '<' | kw= '>' )
            int alt26=8;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt26=1;
                }
                break;
            case 56:
                {
                alt26=2;
                }
                break;
            case 57:
                {
                alt26=3;
                }
                break;
            case 58:
                {
                alt26=4;
                }
                break;
            case 53:
                {
                alt26=5;
                }
                break;
            case 59:
                {
                alt26=6;
                }
                break;
            case 60:
                {
                alt26=7;
                }
                break;
            case 61:
                {
                alt26=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:2003:3: kw= '<='
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompOpAccess().getLessThanSignEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2009:3: kw= '>='
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompOpAccess().getGreaterThanSignEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2015:3: kw= '!='
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompOpAccess().getExclamationMarkEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2021:3: kw= '<>'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompOpAccess().getLessThanSignGreaterThanSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2027:3: kw= '='
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompOpAccess().getEqualsSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:2033:3: kw= '=='
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompOpAccess().getEqualsSignEqualsSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:2039:3: kw= '<'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompOpAccess().getLessThanSignKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:2045:3: kw= '>'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompOpAccess().getGreaterThanSignKeyword_7());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecompOp"


    // $ANTLR start "entryRulecallExp"
    // InternalMyDsl.g:2054:1: entryRulecallExp returns [String current=null] : iv_rulecallExp= rulecallExp EOF ;
    public final String entryRulecallExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecallExp = null;


        try {
            // InternalMyDsl.g:2054:47: (iv_rulecallExp= rulecallExp EOF )
            // InternalMyDsl.g:2055:2: iv_rulecallExp= rulecallExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallExpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecallExp=rulecallExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecallExp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecallExp"


    // $ANTLR start "rulecallExp"
    // InternalMyDsl.g:2061:1: rulecallExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_collectionIterator_0= rulecollectionIterator kw= '(' this_variableDefinition_2= rulevariableDefinition this_lambdaExpression_3= rulelambdaExpression kw= ')' ) | (this_Ident_5= RULE_IDENT kw= '(' this_expressionSequence_7= ruleexpressionSequence kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken rulecallExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_Ident_5=null;
        AntlrDatatypeRuleToken this_collectionIterator_0 = null;

        AntlrDatatypeRuleToken this_variableDefinition_2 = null;

        AntlrDatatypeRuleToken this_lambdaExpression_3 = null;

        AntlrDatatypeRuleToken this_expressionSequence_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2067:2: ( ( (this_collectionIterator_0= rulecollectionIterator kw= '(' this_variableDefinition_2= rulevariableDefinition this_lambdaExpression_3= rulelambdaExpression kw= ')' ) | (this_Ident_5= RULE_IDENT kw= '(' this_expressionSequence_7= ruleexpressionSequence kw= ')' ) ) )
            // InternalMyDsl.g:2068:2: ( (this_collectionIterator_0= rulecollectionIterator kw= '(' this_variableDefinition_2= rulevariableDefinition this_lambdaExpression_3= rulelambdaExpression kw= ')' ) | (this_Ident_5= RULE_IDENT kw= '(' this_expressionSequence_7= ruleexpressionSequence kw= ')' ) )
            {
            // InternalMyDsl.g:2068:2: ( (this_collectionIterator_0= rulecollectionIterator kw= '(' this_variableDefinition_2= rulevariableDefinition this_lambdaExpression_3= rulelambdaExpression kw= ')' ) | (this_Ident_5= RULE_IDENT kw= '(' this_expressionSequence_7= ruleexpressionSequence kw= ')' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=62 && LA27_0<=71)) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_IDENT) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:2069:3: (this_collectionIterator_0= rulecollectionIterator kw= '(' this_variableDefinition_2= rulevariableDefinition this_lambdaExpression_3= rulelambdaExpression kw= ')' )
                    {
                    // InternalMyDsl.g:2069:3: (this_collectionIterator_0= rulecollectionIterator kw= '(' this_variableDefinition_2= rulevariableDefinition this_lambdaExpression_3= rulelambdaExpression kw= ')' )
                    // InternalMyDsl.g:2070:4: this_collectionIterator_0= rulecollectionIterator kw= '(' this_variableDefinition_2= rulevariableDefinition this_lambdaExpression_3= rulelambdaExpression kw= ')'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallExpAccess().getCollectionIteratorParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_12);
                    this_collectionIterator_0=rulecollectionIterator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_collectionIterator_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCallExpAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallExpAccess().getVariableDefinitionParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_24);
                    this_variableDefinition_2=rulevariableDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_variableDefinition_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallExpAccess().getLambdaExpressionParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_lambdaExpression_3=rulelambdaExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_lambdaExpression_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCallExpAccess().getRightParenthesisKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2112:3: (this_Ident_5= RULE_IDENT kw= '(' this_expressionSequence_7= ruleexpressionSequence kw= ')' )
                    {
                    // InternalMyDsl.g:2112:3: (this_Ident_5= RULE_IDENT kw= '(' this_expressionSequence_7= ruleexpressionSequence kw= ')' )
                    // InternalMyDsl.g:2113:4: this_Ident_5= RULE_IDENT kw= '(' this_expressionSequence_7= ruleexpressionSequence kw= ')'
                    {
                    this_Ident_5=(Token)match(input,RULE_IDENT,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Ident_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_5, grammarAccess.getCallExpAccess().getIdentTerminalRuleCall_1_0());
                      			
                    }
                    kw=(Token)match(input,22,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCallExpAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallExpAccess().getExpressionSequenceParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_expressionSequence_7=ruleexpressionSequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expressionSequence_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCallExpAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecallExp"


    // $ANTLR start "entryRulelambdaExpression"
    // InternalMyDsl.g:2145:1: entryRulelambdaExpression returns [String current=null] : iv_rulelambdaExpression= rulelambdaExpression EOF ;
    public final String entryRulelambdaExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelambdaExpression = null;


        try {
            // InternalMyDsl.g:2145:56: (iv_rulelambdaExpression= rulelambdaExpression EOF )
            // InternalMyDsl.g:2146:2: iv_rulelambdaExpression= rulelambdaExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambdaExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulelambdaExpression=rulelambdaExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelambdaExpression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelambdaExpression"


    // $ANTLR start "rulelambdaExpression"
    // InternalMyDsl.g:2152:1: rulelambdaExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_expression_0= ruleexpression ;
    public final AntlrDatatypeRuleToken rulelambdaExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_expression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2158:2: (this_expression_0= ruleexpression )
            // InternalMyDsl.g:2159:2: this_expression_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getLambdaExpressionAccess().getExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_expression_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_expression_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelambdaExpression"


    // $ANTLR start "entryRulecollectionIterator"
    // InternalMyDsl.g:2172:1: entryRulecollectionIterator returns [String current=null] : iv_rulecollectionIterator= rulecollectionIterator EOF ;
    public final String entryRulecollectionIterator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecollectionIterator = null;


        try {
            // InternalMyDsl.g:2172:58: (iv_rulecollectionIterator= rulecollectionIterator EOF )
            // InternalMyDsl.g:2173:2: iv_rulecollectionIterator= rulecollectionIterator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionIteratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecollectionIterator=rulecollectionIterator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecollectionIterator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecollectionIterator"


    // $ANTLR start "rulecollectionIterator"
    // InternalMyDsl.g:2179:1: rulecollectionIterator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'select' | kw= 'reject' | kw= 'collect' | kw= 'any' | kw= 'exists' | kw= 'forAll' | kw= 'isUnique' | kw= 'one' | kw= 'sortedBy' | kw= 'closure' ) ;
    public final AntlrDatatypeRuleToken rulecollectionIterator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2185:2: ( (kw= 'select' | kw= 'reject' | kw= 'collect' | kw= 'any' | kw= 'exists' | kw= 'forAll' | kw= 'isUnique' | kw= 'one' | kw= 'sortedBy' | kw= 'closure' ) )
            // InternalMyDsl.g:2186:2: (kw= 'select' | kw= 'reject' | kw= 'collect' | kw= 'any' | kw= 'exists' | kw= 'forAll' | kw= 'isUnique' | kw= 'one' | kw= 'sortedBy' | kw= 'closure' )
            {
            // InternalMyDsl.g:2186:2: (kw= 'select' | kw= 'reject' | kw= 'collect' | kw= 'any' | kw= 'exists' | kw= 'forAll' | kw= 'isUnique' | kw= 'one' | kw= 'sortedBy' | kw= 'closure' )
            int alt28=10;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt28=1;
                }
                break;
            case 63:
                {
                alt28=2;
                }
                break;
            case 64:
                {
                alt28=3;
                }
                break;
            case 65:
                {
                alt28=4;
                }
                break;
            case 66:
                {
                alt28=5;
                }
                break;
            case 67:
                {
                alt28=6;
                }
                break;
            case 68:
                {
                alt28=7;
                }
                break;
            case 69:
                {
                alt28=8;
                }
                break;
            case 70:
                {
                alt28=9;
                }
                break;
            case 71:
                {
                alt28=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:2187:3: kw= 'select'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getSelectKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2193:3: kw= 'reject'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getRejectKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2199:3: kw= 'collect'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getCollectKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2205:3: kw= 'any'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getAnyKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2211:3: kw= 'exists'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getExistsKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:2217:3: kw= 'forAll'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getForAllKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:2223:3: kw= 'isUnique'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getIsUniqueKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:2229:3: kw= 'one'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getOneKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:2235:3: kw= 'sortedBy'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getSortedByKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:2241:3: kw= 'closure'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionIteratorAccess().getClosureKeyword_9());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecollectionIterator"


    // $ANTLR start "entryRuleexpressionSequence"
    // InternalMyDsl.g:2250:1: entryRuleexpressionSequence returns [String current=null] : iv_ruleexpressionSequence= ruleexpressionSequence EOF ;
    public final String entryRuleexpressionSequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpressionSequence = null;


        try {
            // InternalMyDsl.g:2250:58: (iv_ruleexpressionSequence= ruleexpressionSequence EOF )
            // InternalMyDsl.g:2251:2: iv_ruleexpressionSequence= ruleexpressionSequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionSequenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpressionSequence=ruleexpressionSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpressionSequence.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpressionSequence"


    // $ANTLR start "ruleexpressionSequence"
    // InternalMyDsl.g:2257:1: ruleexpressionSequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* )? ;
    public final AntlrDatatypeRuleToken ruleexpressionSequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expression_0 = null;

        AntlrDatatypeRuleToken this_expression_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2263:2: ( (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* )? )
            // InternalMyDsl.g:2264:2: (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* )?
            {
            // InternalMyDsl.g:2264:2: (this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_IDENT && LA30_0<=RULE_STRING)||LA30_0==RULE_INT||LA30_0==RULE_REAL||LA30_0==22||LA30_0==27||LA30_0==39||(LA30_0>=47 && LA30_0<=48)||LA30_0==51||(LA30_0>=73 && LA30_0<=77)||(LA30_0>=79 && LA30_0<=84)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:2265:3: this_expression_0= ruleexpression (kw= ',' this_expression_2= ruleexpression )*
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionSequenceAccess().getExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_22);
                    this_expression_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_expression_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }
                    // InternalMyDsl.g:2275:3: (kw= ',' this_expression_2= ruleexpression )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==32) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMyDsl.g:2276:4: kw= ',' this_expression_2= ruleexpression
                    	    {
                    	    kw=(Token)match(input,32,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				current.merge(kw);
                    	      				newLeafNode(kw, grammarAccess.getExpressionSequenceAccess().getCommaKeyword_1_0());
                    	      			
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      				newCompositeNode(grammarAccess.getExpressionSequenceAccess().getExpressionParserRuleCall_1_1());
                    	      			
                    	    }
                    	    pushFollow(FOLLOW_22);
                    	    this_expression_2=ruleexpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				current.merge(this_expression_2);
                    	      			
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      				afterParserOrEnumRuleCall();
                    	      			
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpressionSequence"


    // $ANTLR start "entryRulevariableDefinition"
    // InternalMyDsl.g:2296:1: entryRulevariableDefinition returns [String current=null] : iv_rulevariableDefinition= rulevariableDefinition EOF ;
    public final String entryRulevariableDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariableDefinition = null;


        try {
            // InternalMyDsl.g:2296:58: (iv_rulevariableDefinition= rulevariableDefinition EOF )
            // InternalMyDsl.g:2297:2: iv_rulevariableDefinition= rulevariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevariableDefinition=rulevariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevariableDefinition.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariableDefinition"


    // $ANTLR start "rulevariableDefinition"
    // InternalMyDsl.g:2303:1: rulevariableDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Ident_0= RULE_IDENT (kw= ':' this_typeLiteral_2= ruletypeLiteral )? kw= '|' ) ;
    public final AntlrDatatypeRuleToken rulevariableDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Ident_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_typeLiteral_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2309:2: ( (this_Ident_0= RULE_IDENT (kw= ':' this_typeLiteral_2= ruletypeLiteral )? kw= '|' ) )
            // InternalMyDsl.g:2310:2: (this_Ident_0= RULE_IDENT (kw= ':' this_typeLiteral_2= ruletypeLiteral )? kw= '|' )
            {
            // InternalMyDsl.g:2310:2: (this_Ident_0= RULE_IDENT (kw= ':' this_typeLiteral_2= ruletypeLiteral )? kw= '|' )
            // InternalMyDsl.g:2311:3: this_Ident_0= RULE_IDENT (kw= ':' this_typeLiteral_2= ruletypeLiteral )? kw= '|'
            {
            this_Ident_0=(Token)match(input,RULE_IDENT,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Ident_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Ident_0, grammarAccess.getVariableDefinitionAccess().getIdentTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:2318:3: (kw= ':' this_typeLiteral_2= ruletypeLiteral )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==52) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2319:4: kw= ':' this_typeLiteral_2= ruletypeLiteral
                    {
                    kw=(Token)match(input,52,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getVariableDefinitionAccess().getColonKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeLiteralParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_44);
                    this_typeLiteral_2=ruletypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_typeLiteral_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVariableDefinitionAccess().getVerticalLineKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariableDefinition"


    // $ANTLR start "entryRuleliteral"
    // InternalMyDsl.g:2344:1: entryRuleliteral returns [String current=null] : iv_ruleliteral= ruleliteral EOF ;
    public final String entryRuleliteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleliteral = null;


        try {
            // InternalMyDsl.g:2344:47: (iv_ruleliteral= ruleliteral EOF )
            // InternalMyDsl.g:2345:2: iv_ruleliteral= ruleliteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleliteral=ruleliteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleliteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleliteral"


    // $ANTLR start "ruleliteral"
    // InternalMyDsl.g:2351:1: ruleliteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_Real_2= RULE_REAL | kw= 'true' | kw= 'false' | kw= 'null' | (kw= 'Sequence{' this_expressionSequence_7= ruleexpressionSequence kw= '}' ) | (kw= 'OrderedSet{' this_expressionSequence_10= ruleexpressionSequence kw= '}' ) | (this_Ident_12= RULE_IDENT kw= '::' this_Ident_14= RULE_IDENT kw= '::' this_Ident_16= RULE_IDENT ) | (this_Ident_17= RULE_IDENT kw= '::' this_Ident_19= RULE_IDENT kw= ':' ) | this_typeLiteral_21= ruletypeLiteral ) ;
    public final AntlrDatatypeRuleToken ruleliteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;
        Token this_Real_2=null;
        Token kw=null;
        Token this_Ident_12=null;
        Token this_Ident_14=null;
        Token this_Ident_16=null;
        Token this_Ident_17=null;
        Token this_Ident_19=null;
        AntlrDatatypeRuleToken this_expressionSequence_7 = null;

        AntlrDatatypeRuleToken this_expressionSequence_10 = null;

        AntlrDatatypeRuleToken this_typeLiteral_21 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2357:2: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_Real_2= RULE_REAL | kw= 'true' | kw= 'false' | kw= 'null' | (kw= 'Sequence{' this_expressionSequence_7= ruleexpressionSequence kw= '}' ) | (kw= 'OrderedSet{' this_expressionSequence_10= ruleexpressionSequence kw= '}' ) | (this_Ident_12= RULE_IDENT kw= '::' this_Ident_14= RULE_IDENT kw= '::' this_Ident_16= RULE_IDENT ) | (this_Ident_17= RULE_IDENT kw= '::' this_Ident_19= RULE_IDENT kw= ':' ) | this_typeLiteral_21= ruletypeLiteral ) )
            // InternalMyDsl.g:2358:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_Real_2= RULE_REAL | kw= 'true' | kw= 'false' | kw= 'null' | (kw= 'Sequence{' this_expressionSequence_7= ruleexpressionSequence kw= '}' ) | (kw= 'OrderedSet{' this_expressionSequence_10= ruleexpressionSequence kw= '}' ) | (this_Ident_12= RULE_IDENT kw= '::' this_Ident_14= RULE_IDENT kw= '::' this_Ident_16= RULE_IDENT ) | (this_Ident_17= RULE_IDENT kw= '::' this_Ident_19= RULE_IDENT kw= ':' ) | this_typeLiteral_21= ruletypeLiteral )
            {
            // InternalMyDsl.g:2358:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_Real_2= RULE_REAL | kw= 'true' | kw= 'false' | kw= 'null' | (kw= 'Sequence{' this_expressionSequence_7= ruleexpressionSequence kw= '}' ) | (kw= 'OrderedSet{' this_expressionSequence_10= ruleexpressionSequence kw= '}' ) | (this_Ident_12= RULE_IDENT kw= '::' this_Ident_14= RULE_IDENT kw= '::' this_Ident_16= RULE_IDENT ) | (this_Ident_17= RULE_IDENT kw= '::' this_Ident_19= RULE_IDENT kw= ':' ) | this_typeLiteral_21= ruletypeLiteral )
            int alt32=11;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:2359:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2367:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_1, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2375:3: this_Real_2= RULE_REAL
                    {
                    this_Real_2=(Token)match(input,RULE_REAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Real_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_Real_2, grammarAccess.getLiteralAccess().getRealTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2383:3: kw= 'true'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLiteralAccess().getTrueKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2389:3: kw= 'false'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLiteralAccess().getFalseKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:2395:3: kw= 'null'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLiteralAccess().getNullKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:2401:3: (kw= 'Sequence{' this_expressionSequence_7= ruleexpressionSequence kw= '}' )
                    {
                    // InternalMyDsl.g:2401:3: (kw= 'Sequence{' this_expressionSequence_7= ruleexpressionSequence kw= '}' )
                    // InternalMyDsl.g:2402:4: kw= 'Sequence{' this_expressionSequence_7= ruleexpressionSequence kw= '}'
                    {
                    kw=(Token)match(input,76,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralAccess().getSequenceKeyword_6_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLiteralAccess().getExpressionSequenceParserRuleCall_6_1());
                      			
                    }
                    pushFollow(FOLLOW_46);
                    this_expressionSequence_7=ruleexpressionSequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expressionSequence_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_6_2());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:2424:3: (kw= 'OrderedSet{' this_expressionSequence_10= ruleexpressionSequence kw= '}' )
                    {
                    // InternalMyDsl.g:2424:3: (kw= 'OrderedSet{' this_expressionSequence_10= ruleexpressionSequence kw= '}' )
                    // InternalMyDsl.g:2425:4: kw= 'OrderedSet{' this_expressionSequence_10= ruleexpressionSequence kw= '}'
                    {
                    kw=(Token)match(input,77,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralAccess().getOrderedSetKeyword_7_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLiteralAccess().getExpressionSequenceParserRuleCall_7_1());
                      			
                    }
                    pushFollow(FOLLOW_46);
                    this_expressionSequence_10=ruleexpressionSequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_expressionSequence_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_7_2());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:2447:3: (this_Ident_12= RULE_IDENT kw= '::' this_Ident_14= RULE_IDENT kw= '::' this_Ident_16= RULE_IDENT )
                    {
                    // InternalMyDsl.g:2447:3: (this_Ident_12= RULE_IDENT kw= '::' this_Ident_14= RULE_IDENT kw= '::' this_Ident_16= RULE_IDENT )
                    // InternalMyDsl.g:2448:4: this_Ident_12= RULE_IDENT kw= '::' this_Ident_14= RULE_IDENT kw= '::' this_Ident_16= RULE_IDENT
                    {
                    this_Ident_12=(Token)match(input,RULE_IDENT,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Ident_12);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_12, grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_8_0());
                      			
                    }
                    kw=(Token)match(input,78,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralAccess().getColonColonKeyword_8_1());
                      			
                    }
                    this_Ident_14=(Token)match(input,RULE_IDENT,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Ident_14);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_14, grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_8_2());
                      			
                    }
                    kw=(Token)match(input,78,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralAccess().getColonColonKeyword_8_3());
                      			
                    }
                    this_Ident_16=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Ident_16);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_16, grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_8_4());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:2481:3: (this_Ident_17= RULE_IDENT kw= '::' this_Ident_19= RULE_IDENT kw= ':' )
                    {
                    // InternalMyDsl.g:2481:3: (this_Ident_17= RULE_IDENT kw= '::' this_Ident_19= RULE_IDENT kw= ':' )
                    // InternalMyDsl.g:2482:4: this_Ident_17= RULE_IDENT kw= '::' this_Ident_19= RULE_IDENT kw= ':'
                    {
                    this_Ident_17=(Token)match(input,RULE_IDENT,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Ident_17);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_17, grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_9_0());
                      			
                    }
                    kw=(Token)match(input,78,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralAccess().getColonColonKeyword_9_1());
                      			
                    }
                    this_Ident_19=(Token)match(input,RULE_IDENT,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Ident_19);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_19, grammarAccess.getLiteralAccess().getIdentTerminalRuleCall_9_2());
                      			
                    }
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralAccess().getColonKeyword_9_3());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:2508:3: this_typeLiteral_21= ruletypeLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getTypeLiteralParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_typeLiteral_21=ruletypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_typeLiteral_21);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleliteral"


    // $ANTLR start "entryRuletypeLiteral"
    // InternalMyDsl.g:2522:1: entryRuletypeLiteral returns [String current=null] : iv_ruletypeLiteral= ruletypeLiteral EOF ;
    public final String entryRuletypeLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletypeLiteral = null;


        try {
            // InternalMyDsl.g:2522:51: (iv_ruletypeLiteral= ruletypeLiteral EOF )
            // InternalMyDsl.g:2523:2: iv_ruletypeLiteral= ruletypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletypeLiteral=ruletypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypeLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletypeLiteral"


    // $ANTLR start "ruletypeLiteral"
    // InternalMyDsl.g:2529:1: ruletypeLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'Integer' | kw= 'Real' | kw= 'Boolean' | (kw= 'Sequence(' this_typeLiteral_5= ruletypeLiteral kw= ')' ) | (kw= 'OrderedSet(' this_typeLiteral_8= ruletypeLiteral kw= ')' ) | this_classifierTypeRule_10= ruleclassifierTypeRule | (kw= '{' this_classifierTypeRule_12= ruleclassifierTypeRule (kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule )* kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruletypeLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_typeLiteral_5 = null;

        AntlrDatatypeRuleToken this_typeLiteral_8 = null;

        AntlrDatatypeRuleToken this_classifierTypeRule_10 = null;

        AntlrDatatypeRuleToken this_classifierTypeRule_12 = null;

        AntlrDatatypeRuleToken this_classifierTypeRule_14 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2535:2: ( (kw= 'String' | kw= 'Integer' | kw= 'Real' | kw= 'Boolean' | (kw= 'Sequence(' this_typeLiteral_5= ruletypeLiteral kw= ')' ) | (kw= 'OrderedSet(' this_typeLiteral_8= ruletypeLiteral kw= ')' ) | this_classifierTypeRule_10= ruleclassifierTypeRule | (kw= '{' this_classifierTypeRule_12= ruleclassifierTypeRule (kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule )* kw= '}' ) ) )
            // InternalMyDsl.g:2536:2: (kw= 'String' | kw= 'Integer' | kw= 'Real' | kw= 'Boolean' | (kw= 'Sequence(' this_typeLiteral_5= ruletypeLiteral kw= ')' ) | (kw= 'OrderedSet(' this_typeLiteral_8= ruletypeLiteral kw= ')' ) | this_classifierTypeRule_10= ruleclassifierTypeRule | (kw= '{' this_classifierTypeRule_12= ruleclassifierTypeRule (kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule )* kw= '}' ) )
            {
            // InternalMyDsl.g:2536:2: (kw= 'String' | kw= 'Integer' | kw= 'Real' | kw= 'Boolean' | (kw= 'Sequence(' this_typeLiteral_5= ruletypeLiteral kw= ')' ) | (kw= 'OrderedSet(' this_typeLiteral_8= ruletypeLiteral kw= ')' ) | this_classifierTypeRule_10= ruleclassifierTypeRule | (kw= '{' this_classifierTypeRule_12= ruleclassifierTypeRule (kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule )* kw= '}' ) )
            int alt34=8;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt34=1;
                }
                break;
            case 80:
                {
                alt34=2;
                }
                break;
            case 81:
                {
                alt34=3;
                }
                break;
            case 82:
                {
                alt34=4;
                }
                break;
            case 83:
                {
                alt34=5;
                }
                break;
            case 84:
                {
                alt34=6;
                }
                break;
            case RULE_IDENT:
                {
                alt34=7;
                }
                break;
            case 27:
                {
                alt34=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:2537:3: kw= 'String'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getStringKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2543:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getIntegerKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2549:3: kw= 'Real'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getRealKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2555:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getBooleanKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2561:3: (kw= 'Sequence(' this_typeLiteral_5= ruletypeLiteral kw= ')' )
                    {
                    // InternalMyDsl.g:2561:3: (kw= 'Sequence(' this_typeLiteral_5= ruletypeLiteral kw= ')' )
                    // InternalMyDsl.g:2562:4: kw= 'Sequence(' this_typeLiteral_5= ruletypeLiteral kw= ')'
                    {
                    kw=(Token)match(input,83,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getSequenceKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeLiteralAccess().getTypeLiteralParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_typeLiteral_5=ruletypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_typeLiteral_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:2584:3: (kw= 'OrderedSet(' this_typeLiteral_8= ruletypeLiteral kw= ')' )
                    {
                    // InternalMyDsl.g:2584:3: (kw= 'OrderedSet(' this_typeLiteral_8= ruletypeLiteral kw= ')' )
                    // InternalMyDsl.g:2585:4: kw= 'OrderedSet(' this_typeLiteral_8= ruletypeLiteral kw= ')'
                    {
                    kw=(Token)match(input,84,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getOrderedSetKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeLiteralAccess().getTypeLiteralParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_typeLiteral_8=ruletypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_typeLiteral_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getRightParenthesisKeyword_5_2());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:2607:3: this_classifierTypeRule_10= ruleclassifierTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralAccess().getClassifierTypeRuleParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_classifierTypeRule_10=ruleclassifierTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_classifierTypeRule_10);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:2618:3: (kw= '{' this_classifierTypeRule_12= ruleclassifierTypeRule (kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule )* kw= '}' )
                    {
                    // InternalMyDsl.g:2618:3: (kw= '{' this_classifierTypeRule_12= ruleclassifierTypeRule (kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule )* kw= '}' )
                    // InternalMyDsl.g:2619:4: kw= '{' this_classifierTypeRule_12= ruleclassifierTypeRule (kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule )* kw= '}'
                    {
                    kw=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getLeftCurlyBracketKeyword_7_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeLiteralAccess().getClassifierTypeRuleParserRuleCall_7_1());
                      			
                    }
                    pushFollow(FOLLOW_49);
                    this_classifierTypeRule_12=ruleclassifierTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_classifierTypeRule_12);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyDsl.g:2634:4: (kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==72) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalMyDsl.g:2635:5: kw= '|' this_classifierTypeRule_14= ruleclassifierTypeRule
                    	    {
                    	    kw=(Token)match(input,72,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getVerticalLineKeyword_7_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getTypeLiteralAccess().getClassifierTypeRuleParserRuleCall_7_2_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_49);
                    	    this_classifierTypeRule_14=ruleclassifierTypeRule();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_classifierTypeRule_14);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getRightCurlyBracketKeyword_7_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletypeLiteral"


    // $ANTLR start "entryRuleclassifierTypeRule"
    // InternalMyDsl.g:2661:1: entryRuleclassifierTypeRule returns [String current=null] : iv_ruleclassifierTypeRule= ruleclassifierTypeRule EOF ;
    public final String entryRuleclassifierTypeRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleclassifierTypeRule = null;


        try {
            // InternalMyDsl.g:2661:58: (iv_ruleclassifierTypeRule= ruleclassifierTypeRule EOF )
            // InternalMyDsl.g:2662:2: iv_ruleclassifierTypeRule= ruleclassifierTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleclassifierTypeRule=ruleclassifierTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleclassifierTypeRule.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleclassifierTypeRule"


    // $ANTLR start "ruleclassifierTypeRule"
    // InternalMyDsl.g:2668:1: ruleclassifierTypeRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Ident_0= RULE_IDENT kw= '::' this_Ident_2= RULE_IDENT ) | (this_Ident_3= RULE_IDENT kw= ':' ) ) ;
    public final AntlrDatatypeRuleToken ruleclassifierTypeRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Ident_0=null;
        Token kw=null;
        Token this_Ident_2=null;
        Token this_Ident_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2674:2: ( ( (this_Ident_0= RULE_IDENT kw= '::' this_Ident_2= RULE_IDENT ) | (this_Ident_3= RULE_IDENT kw= ':' ) ) )
            // InternalMyDsl.g:2675:2: ( (this_Ident_0= RULE_IDENT kw= '::' this_Ident_2= RULE_IDENT ) | (this_Ident_3= RULE_IDENT kw= ':' ) )
            {
            // InternalMyDsl.g:2675:2: ( (this_Ident_0= RULE_IDENT kw= '::' this_Ident_2= RULE_IDENT ) | (this_Ident_3= RULE_IDENT kw= ':' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_IDENT) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==78) ) {
                    alt35=1;
                }
                else if ( (LA35_1==52) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:2676:3: (this_Ident_0= RULE_IDENT kw= '::' this_Ident_2= RULE_IDENT )
                    {
                    // InternalMyDsl.g:2676:3: (this_Ident_0= RULE_IDENT kw= '::' this_Ident_2= RULE_IDENT )
                    // InternalMyDsl.g:2677:4: this_Ident_0= RULE_IDENT kw= '::' this_Ident_2= RULE_IDENT
                    {
                    this_Ident_0=(Token)match(input,RULE_IDENT,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Ident_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_0, grammarAccess.getClassifierTypeRuleAccess().getIdentTerminalRuleCall_0_0());
                      			
                    }
                    kw=(Token)match(input,78,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getClassifierTypeRuleAccess().getColonColonKeyword_0_1());
                      			
                    }
                    this_Ident_2=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Ident_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_2, grammarAccess.getClassifierTypeRuleAccess().getIdentTerminalRuleCall_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2698:3: (this_Ident_3= RULE_IDENT kw= ':' )
                    {
                    // InternalMyDsl.g:2698:3: (this_Ident_3= RULE_IDENT kw= ':' )
                    // InternalMyDsl.g:2699:4: this_Ident_3= RULE_IDENT kw= ':'
                    {
                    this_Ident_3=(Token)match(input,RULE_IDENT,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Ident_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Ident_3, grammarAccess.getClassifierTypeRuleAccess().getIdentTerminalRuleCall_1_0());
                      			
                    }
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getClassifierTypeRuleAccess().getColonKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleclassifierTypeRule"

    // $ANTLR start synpred12_InternalMyDsl
    public final void synpred12_InternalMyDsl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_rVarDecl_0 = null;


        // InternalMyDsl.g:898:3: (this_rVarDecl_0= rulerVarDecl )
        // InternalMyDsl.g:898:3: this_rVarDecl_0= rulerVarDecl
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getRStatementAccess().getRVarDeclParserRuleCall_0());
          		
        }
        pushFollow(FOLLOW_2);
        this_rVarDecl_0=rulerVarDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalMyDsl

    // $ANTLR start synpred13_InternalMyDsl
    public final void synpred13_InternalMyDsl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_rAssign_1 = null;


        // InternalMyDsl.g:909:3: (this_rAssign_1= rulerAssign )
        // InternalMyDsl.g:909:3: this_rAssign_1= rulerAssign
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getRStatementAccess().getRAssignParserRuleCall_1());
          		
        }
        pushFollow(FOLLOW_2);
        this_rAssign_1=rulerAssign();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalMyDsl

    // $ANTLR start synpred16_InternalMyDsl
    public final void synpred16_InternalMyDsl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_rIf_4 = null;


        // InternalMyDsl.g:942:3: (this_rIf_4= rulerIf )
        // InternalMyDsl.g:942:3: this_rIf_4= rulerIf
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getRStatementAccess().getRIfParserRuleCall_4());
          		
        }
        pushFollow(FOLLOW_2);
        this_rIf_4=rulerIf();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalMyDsl

    // $ANTLR start synpred22_InternalMyDsl
    public final void synpred22_InternalMyDsl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_recExpression_1 = null;


        // InternalMyDsl.g:1436:4: (this_recExpression_1= rulerecExpression )
        // InternalMyDsl.g:1436:4: this_recExpression_1= rulerecExpression
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getExpressionAccess().getRecExpressionParserRuleCall_1());
          			
        }
        pushFollow(FOLLOW_2);
        this_recExpression_1=rulerecExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalMyDsl

    // $ANTLR start synpred30_InternalMyDsl
    public final void synpred30_InternalMyDsl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_recExpression_15 = null;


        // InternalMyDsl.g:1617:4: (this_recExpression_15= rulerecExpression )
        // InternalMyDsl.g:1617:4: this_recExpression_15= rulerecExpression
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getRecExpressionAccess().getRecExpressionParserRuleCall_1());
          			
        }
        pushFollow(FOLLOW_2);
        this_recExpression_15=rulerecExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalMyDsl

    // Delegated rules

    public final boolean synpred13_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\1\4\25\0\6\uffff";
    static final String dfa_3s = "\1\124\25\0\6\uffff";
    static final String dfa_4s = "\26\uffff\1\3\1\4\1\1\1\2\1\6\1\5";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\4\1\uffff\1\5\1\uffff\1\6\14\uffff\1\23\4\uffff\1\22\6\uffff\1\26\4\uffff\1\24\1\uffff\1\27\5\uffff\1\2\1\3\2\uffff\1\25\25\uffff\1\7\1\10\1\11\1\12\1\13\1\uffff\1\14\1\15\1\16\1\17\1\20\1\21",
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "897:2: (this_rVarDecl_0= rulerVarDecl | this_rAssign_1= rulerAssign | this_rForEach_2= rulerForEach | this_rWhile_3= rulerWhile | this_rIf_4= rulerIf | this_rExpression_5= rulerExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalMyDsl()) ) {s = 24;}

                        else if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_10 = input.LA(1);

                         
                        int index12_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_11 = input.LA(1);

                         
                        int index12_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_12 = input.LA(1);

                         
                        int index12_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_13 = input.LA(1);

                         
                        int index12_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_14 = input.LA(1);

                         
                        int index12_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_15 = input.LA(1);

                         
                        int index12_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_16 = input.LA(1);

                         
                        int index12_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_17 = input.LA(1);

                         
                        int index12_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_18 = input.LA(1);

                         
                        int index12_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_19 = input.LA(1);

                         
                        int index12_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_20 = input.LA(1);

                         
                        int index12_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (synpred16_InternalMyDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_21 = input.LA(1);

                         
                        int index12_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index12_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\24\uffff";
    static final String dfa_8s = "\1\22\23\uffff";
    static final String dfa_9s = "\1\10\21\0\2\uffff";
    static final String dfa_10s = "\1\75\21\0\2\uffff";
    static final String dfa_11s = "\22\uffff\1\2\1\1";
    static final String dfa_12s = "\1\uffff\1\13\1\15\1\10\1\5\1\11\1\6\1\7\1\0\1\2\1\16\1\20\1\12\1\17\1\3\1\14\1\4\1\1\2\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\7\uffff\1\1\3\uffff\1\22\3\uffff\1\22\3\uffff\1\22\3\uffff\2\22\1\uffff\1\22\4\uffff\1\22\1\uffff\1\16\1\17\1\20\1\21\1\2\1\uffff\1\5\2\22\2\uffff\1\12\1\4\1\6\1\7\1\10\1\11\1\13\1\14\1\15",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1435:3: (this_recExpression_1= rulerecExpression )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_17 = input.LA(1);

                         
                        int index18_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_17);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_14 = input.LA(1);

                         
                        int index18_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_16 = input.LA(1);

                         
                        int index18_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_16);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA18_12 = input.LA(1);

                         
                        int index18_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA18_1 = input.LA(1);

                         
                        int index18_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA18_15 = input.LA(1);

                         
                        int index18_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_15);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA18_10 = input.LA(1);

                         
                        int index18_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_10);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA18_13 = input.LA(1);

                         
                        int index18_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_13);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA18_11 = input.LA(1);

                         
                        int index18_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index18_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1616:3: (this_recExpression_15= rulerecExpression )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_8 = input.LA(1);

                         
                        int index20_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_17 = input.LA(1);

                         
                        int index20_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_17);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_9 = input.LA(1);

                         
                        int index20_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_14 = input.LA(1);

                         
                        int index20_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_16 = input.LA(1);

                         
                        int index20_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_16);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_4 = input.LA(1);

                         
                        int index20_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_6 = input.LA(1);

                         
                        int index20_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_7 = input.LA(1);

                         
                        int index20_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA20_3 = input.LA(1);

                         
                        int index20_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_3);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA20_5 = input.LA(1);

                         
                        int index20_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_5);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA20_12 = input.LA(1);

                         
                        int index20_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA20_1 = input.LA(1);

                         
                        int index20_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_1);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA20_15 = input.LA(1);

                         
                        int index20_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_15);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA20_2 = input.LA(1);

                         
                        int index20_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_2);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA20_10 = input.LA(1);

                         
                        int index20_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_10);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA20_13 = input.LA(1);

                         
                        int index20_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_13);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA20_11 = input.LA(1);

                         
                        int index20_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalMyDsl()) ) {s = 19;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index20_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\17\uffff";
    static final String dfa_15s = "\14\uffff\1\12\2\uffff";
    static final String dfa_16s = "\1\4\10\uffff\1\64\1\uffff\1\4\1\10\2\uffff";
    static final String dfa_17s = "\1\124\10\uffff\1\116\1\uffff\1\4\1\116\2\uffff";
    static final String dfa_18s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\2\uffff\1\12\1\11";
    static final String dfa_19s = "\17\uffff}>";
    static final String[] dfa_20s = {
            "\1\11\1\1\1\uffff\1\2\1\uffff\1\3\21\uffff\1\12\55\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\6\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\31\uffff\1\13",
            "",
            "\1\14",
            "\1\12\7\uffff\1\12\3\uffff\1\12\3\uffff\1\12\3\uffff\1\12\3\uffff\2\12\1\uffff\1\12\4\uffff\1\12\1\uffff\5\12\1\uffff\3\12\1\uffff\1\15\11\12\20\uffff\1\16",
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

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2358:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_Real_2= RULE_REAL | kw= 'true' | kw= 'false' | kw= 'null' | (kw= 'Sequence{' this_expressionSequence_7= ruleexpressionSequence kw= '}' ) | (kw= 'OrderedSet{' this_expressionSequence_10= ruleexpressionSequence kw= '}' ) | (this_Ident_12= RULE_IDENT kw= '::' this_Ident_14= RULE_IDENT kw= '::' this_Ident_16= RULE_IDENT ) | (this_Ident_17= RULE_IDENT kw= '::' this_Ident_19= RULE_IDENT kw= ':' ) | this_typeLiteral_21= ruletypeLiteral )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000F0000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00098080084002B0L,0x00000000001FBE00L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00098090084002B0L,0x00000000001FBE00L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00098284184002B0L,0x00000000001FBE00L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x3FE17C0000010102L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xC000000000000010L,0x00000000000000FFL});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000000080002B0L,0x00000000001FBE00L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00098080094002B0L,0x00000000001FBE00L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00098080184002B0L,0x00000000001FBE00L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000100L});

}