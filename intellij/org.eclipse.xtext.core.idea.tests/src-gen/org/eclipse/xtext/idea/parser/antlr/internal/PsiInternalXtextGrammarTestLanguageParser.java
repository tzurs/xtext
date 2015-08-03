package org.eclipse.xtext.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.idea.lang.XtextGrammarTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.services.XtextGrammarTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalXtextGrammarTestLanguageParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'grammar'", "'with'", "','", "'hidden'", "'('", "')'", "'.'", "'generate'", "'as'", "'import'", "'fragment'", "'*'", "':'", "';'", "'['", "']'", "'returns'", "'::'", "'|'", "'&'", "'?'", "'+'", "'{'", "'='", "'+='", "'current'", "'}'", "'!'", "'=>'", "'->'", "'?='", "'terminal'", "'EOF'", "'..'", "'enum'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public PsiInternalXtextGrammarTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalXtextGrammarTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalXtextGrammarTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g"; }



    	protected XtextGrammarTestLanguageGrammarAccess grammarAccess;

    	protected XtextGrammarTestLanguageElementTypeProvider elementTypeProvider;

    	public PsiInternalXtextGrammarTestLanguageParser(PsiBuilder builder, TokenStream input, XtextGrammarTestLanguageElementTypeProvider elementTypeProvider, XtextGrammarTestLanguageGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Grammar";
    	}




    // $ANTLR start "entryRuleGrammar"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:52:1: entryRuleGrammar : ruleGrammar EOF ;
    public final void entryRuleGrammar() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:52:17: ( ruleGrammar EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:53:2: ruleGrammar EOF
            {
             markComposite(elementTypeProvider.getGrammarElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrammar_in_entryRuleGrammar54);
            ruleGrammar();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrammar57); 

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
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:58:1: ruleGrammar : (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ruleHiddenClause )? ( (lv_metamodelDeclarations_7_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_8_0= ruleAbstractRule ) )+ ) ;
    public final void ruleGrammar() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:58:12: ( (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ruleHiddenClause )? ( (lv_metamodelDeclarations_7_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_8_0= ruleAbstractRule ) )+ ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:59:2: (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ruleHiddenClause )? ( (lv_metamodelDeclarations_7_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_8_0= ruleAbstractRule ) )+ )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:59:2: (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ruleHiddenClause )? ( (lv_metamodelDeclarations_7_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_8_0= ruleAbstractRule ) )+ )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:60:3: otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ruleHiddenClause )? ( (lv_metamodelDeclarations_7_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_8_0= ruleAbstractRule ) )+
            {

            			markLeaf(elementTypeProvider.getGrammar_GrammarKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleGrammar76); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:67:3: ( (lv_name_1_0= ruleGrammarID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:68:4: (lv_name_1_0= ruleGrammarID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:68:4: (lv_name_1_0= ruleGrammarID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:69:5: lv_name_1_0= ruleGrammarID
            {

            					markComposite(elementTypeProvider.getGrammar_NameGrammarIDParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleGrammarID_in_ruleGrammar103);
            ruleGrammarID();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:78:3: (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:79:4: otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )*
                    {

                    				markLeaf(elementTypeProvider.getGrammar_WithKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGrammar134); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:86:4: ( ( ruleGrammarID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:87:5: ( ruleGrammarID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:87:5: ( ruleGrammarID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:88:6: ruleGrammarID
                    {

                    						markComposite(elementTypeProvider.getGrammar_UsedGrammarsGrammarCrossReference_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleGrammarID_in_ruleGrammar164);
                    ruleGrammarID();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:97:4: (otherlv_4= ',' ( ( ruleGrammarID ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:98:5: otherlv_4= ',' ( ( ruleGrammarID ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getGrammar_CommaKeyword_2_2_0ElementType());
                    	    				
                    	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGrammar201); 

                    	    					doneLeaf(otherlv_4);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:105:5: ( ( ruleGrammarID ) )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:106:6: ( ruleGrammarID )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:106:6: ( ruleGrammarID )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:107:7: ruleGrammarID
                    	    {

                    	    							markComposite(elementTypeProvider.getGrammar_UsedGrammarsGrammarCrossReference_2_2_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleGrammarID_in_ruleGrammar236);
                    	    ruleGrammarID();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:118:3: ( ruleHiddenClause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:119:4: ruleHiddenClause
                    {

                    				markComposite(elementTypeProvider.getGrammar_HiddenClauseParserRuleCall_3ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_ruleHiddenClause_in_ruleGrammar282);
                    ruleHiddenClause();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:127:3: ( (lv_metamodelDeclarations_7_0= ruleAbstractMetamodelDeclaration ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18||LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:128:4: (lv_metamodelDeclarations_7_0= ruleAbstractMetamodelDeclaration )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:128:4: (lv_metamodelDeclarations_7_0= ruleAbstractMetamodelDeclaration )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:129:5: lv_metamodelDeclarations_7_0= ruleAbstractMetamodelDeclaration
            	    {

            	    					markComposite(elementTypeProvider.getGrammar_MetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0ElementType());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_ruleAbstractMetamodelDeclaration_in_ruleGrammar315);
            	    ruleAbstractMetamodelDeclaration();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:138:3: ( (lv_rules_8_0= ruleAbstractRule ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==21||LA5_0==42||LA5_0==45) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:139:4: (lv_rules_8_0= ruleAbstractRule )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:139:4: (lv_rules_8_0= ruleAbstractRule )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:140:5: lv_rules_8_0= ruleAbstractRule
            	    {

            	    					markComposite(elementTypeProvider.getGrammar_RulesAbstractRuleParserRuleCall_5_0ElementType());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_ruleAbstractRule_in_ruleGrammar354);
            	    ruleAbstractRule();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


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
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleHiddenClause"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:153:1: entryRuleHiddenClause : ruleHiddenClause EOF ;
    public final void entryRuleHiddenClause() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:153:22: ( ruleHiddenClause EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:154:2: ruleHiddenClause EOF
            {
             markComposite(elementTypeProvider.getHiddenClauseElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleHiddenClause_in_entryRuleHiddenClause386);
            ruleHiddenClause();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHiddenClause389); 

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
    // $ANTLR end "entryRuleHiddenClause"


    // $ANTLR start "ruleHiddenClause"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:159:1: ruleHiddenClause : ( ( (lv_definesHiddenTokens_0_0= 'hidden' ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ')' ) ;
    public final void ruleHiddenClause() throws RecognitionException {
        Token lv_definesHiddenTokens_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:159:17: ( ( ( (lv_definesHiddenTokens_0_0= 'hidden' ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ')' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:160:2: ( ( (lv_definesHiddenTokens_0_0= 'hidden' ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ')' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:160:2: ( ( (lv_definesHiddenTokens_0_0= 'hidden' ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ')' )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:161:3: ( (lv_definesHiddenTokens_0_0= 'hidden' ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ')'
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:161:3: ( (lv_definesHiddenTokens_0_0= 'hidden' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:162:4: (lv_definesHiddenTokens_0_0= 'hidden' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:162:4: (lv_definesHiddenTokens_0_0= 'hidden' )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:163:5: lv_definesHiddenTokens_0_0= 'hidden'
            {

            					markLeaf(elementTypeProvider.getHiddenClause_DefinesHiddenTokensHiddenKeyword_0_0ElementType());
            				
            lv_definesHiddenTokens_0_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleHiddenClause421); 

            					doneLeaf(lv_definesHiddenTokens_0_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getHiddenClause_LeftParenthesisKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHiddenClause446); 

            			doneLeaf(otherlv_1);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:179:3: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:180:4: ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:180:4: ( (otherlv_2= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:181:5: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:181:5: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:182:6: otherlv_2= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getHiddenClause_HiddenTokensAbstractRuleCrossReference_2_0_0ElementType());
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleHiddenClause481); 

                    						doneLeaf(otherlv_2);
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:191:4: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==13) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:192:5: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getHiddenClause_CommaKeyword_2_1_0ElementType());
                    	    				
                    	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleHiddenClause518); 

                    	    					doneLeaf(otherlv_3);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:199:5: ( (otherlv_4= RULE_ID ) )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:200:6: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:200:6: (otherlv_4= RULE_ID )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:201:7: otherlv_4= RULE_ID
                    	    {

                    	    							markLeaf(elementTypeProvider.getHiddenClause_HiddenTokensAbstractRuleCrossReference_2_1_1_0ElementType());
                    	    						
                    	    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleHiddenClause555); 

                    	    							doneLeaf(otherlv_4);
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getHiddenClause_RightParenthesisKeyword_3ElementType());
            		
            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleHiddenClause597); 

            			doneLeaf(otherlv_5);
            		

            }


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
    // $ANTLR end "ruleHiddenClause"


    // $ANTLR start "entryRuleGrammarID"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:223:1: entryRuleGrammarID : ruleGrammarID EOF ;
    public final void entryRuleGrammarID() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:223:19: ( ruleGrammarID EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:224:2: ruleGrammarID EOF
            {
             markComposite(elementTypeProvider.getGrammarIDElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrammarID_in_entryRuleGrammarID617);
            ruleGrammarID();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrammarID620); 

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
    // $ANTLR end "entryRuleGrammarID"


    // $ANTLR start "ruleGrammarID"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:229:1: ruleGrammarID : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final void ruleGrammarID() throws RecognitionException {
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:229:14: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:230:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:230:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:231:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {

            			markLeaf(elementTypeProvider.getGrammarID_IDTerminalRuleCall_0ElementType());
            		
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGrammarID639); 

            			doneLeaf(this_ID_0);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:238:3: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:239:4: kw= '.' this_ID_2= RULE_ID
            	    {

            	    				markLeaf(elementTypeProvider.getGrammarID_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGrammarID659); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getGrammarID_IDTerminalRuleCall_1_1ElementType());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGrammarID676); 

            	    				doneLeaf(this_ID_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


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
    // $ANTLR end "ruleGrammarID"


    // $ANTLR start "entryRuleAbstractRule"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:258:1: entryRuleAbstractRule : ruleAbstractRule EOF ;
    public final void entryRuleAbstractRule() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:258:22: ( ruleAbstractRule EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:259:2: ruleAbstractRule EOF
            {
             markComposite(elementTypeProvider.getAbstractRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractRule_in_entryRuleAbstractRule702);
            ruleAbstractRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractRule705); 

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
    // $ANTLR end "entryRuleAbstractRule"


    // $ANTLR start "ruleAbstractRule"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:264:1: ruleAbstractRule : ( ruleParserRule | ruleTerminalRule | ruleEnumRule ) ;
    public final void ruleAbstractRule() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:264:17: ( ( ruleParserRule | ruleTerminalRule | ruleEnumRule ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:265:2: ( ruleParserRule | ruleTerminalRule | ruleEnumRule )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:265:2: ( ruleParserRule | ruleTerminalRule | ruleEnumRule )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 21:
                {
                alt9=1;
                }
                break;
            case 42:
                {
                alt9=2;
                }
                break;
            case 45:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:266:3: ruleParserRule
                    {

                    			markComposite(elementTypeProvider.getAbstractRule_ParserRuleParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleParserRule_in_ruleAbstractRule722);
                    ruleParserRule();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:274:3: ruleTerminalRule
                    {

                    			markComposite(elementTypeProvider.getAbstractRule_TerminalRuleParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleTerminalRule_in_ruleAbstractRule742);
                    ruleTerminalRule();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:282:3: ruleEnumRule
                    {

                    			markComposite(elementTypeProvider.getAbstractRule_EnumRuleParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleEnumRule_in_ruleAbstractRule762);
                    ruleEnumRule();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


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
    // $ANTLR end "ruleAbstractRule"


    // $ANTLR start "entryRuleAbstractMetamodelDeclaration"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:293:1: entryRuleAbstractMetamodelDeclaration : ruleAbstractMetamodelDeclaration EOF ;
    public final void entryRuleAbstractMetamodelDeclaration() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:293:38: ( ruleAbstractMetamodelDeclaration EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:294:2: ruleAbstractMetamodelDeclaration EOF
            {
             markComposite(elementTypeProvider.getAbstractMetamodelDeclarationElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractMetamodelDeclaration_in_entryRuleAbstractMetamodelDeclaration782);
            ruleAbstractMetamodelDeclaration();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractMetamodelDeclaration785); 

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
    // $ANTLR end "entryRuleAbstractMetamodelDeclaration"


    // $ANTLR start "ruleAbstractMetamodelDeclaration"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:299:1: ruleAbstractMetamodelDeclaration : ( ruleGeneratedMetamodel | ruleReferencedMetamodel ) ;
    public final void ruleAbstractMetamodelDeclaration() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:299:33: ( ( ruleGeneratedMetamodel | ruleReferencedMetamodel ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:300:2: ( ruleGeneratedMetamodel | ruleReferencedMetamodel )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:300:2: ( ruleGeneratedMetamodel | ruleReferencedMetamodel )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:301:3: ruleGeneratedMetamodel
                    {

                    			markComposite(elementTypeProvider.getAbstractMetamodelDeclaration_GeneratedMetamodelParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleGeneratedMetamodel_in_ruleAbstractMetamodelDeclaration802);
                    ruleGeneratedMetamodel();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:309:3: ruleReferencedMetamodel
                    {

                    			markComposite(elementTypeProvider.getAbstractMetamodelDeclaration_ReferencedMetamodelParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleReferencedMetamodel_in_ruleAbstractMetamodelDeclaration822);
                    ruleReferencedMetamodel();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


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
    // $ANTLR end "ruleAbstractMetamodelDeclaration"


    // $ANTLR start "entryRuleGeneratedMetamodel"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:320:1: entryRuleGeneratedMetamodel : ruleGeneratedMetamodel EOF ;
    public final void entryRuleGeneratedMetamodel() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:320:28: ( ruleGeneratedMetamodel EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:321:2: ruleGeneratedMetamodel EOF
            {
             markComposite(elementTypeProvider.getGeneratedMetamodelElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleGeneratedMetamodel_in_entryRuleGeneratedMetamodel842);
            ruleGeneratedMetamodel();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGeneratedMetamodel845); 

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
    // $ANTLR end "entryRuleGeneratedMetamodel"


    // $ANTLR start "ruleGeneratedMetamodel"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:326:1: ruleGeneratedMetamodel : (otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) ;
    public final void ruleGeneratedMetamodel() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:326:23: ( (otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:327:2: (otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:327:2: (otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:328:3: otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
            {

            			markLeaf(elementTypeProvider.getGeneratedMetamodel_GenerateKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGeneratedMetamodel864); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:335:3: ( (lv_name_1_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:336:4: (lv_name_1_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:336:4: (lv_name_1_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:337:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getGeneratedMetamodel_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGeneratedMetamodel891); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:346:3: ( (otherlv_2= RULE_STRING ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:347:4: (otherlv_2= RULE_STRING )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:347:4: (otherlv_2= RULE_STRING )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:348:5: otherlv_2= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getGeneratedMetamodel_EPackageEPackageCrossReference_2_0ElementType());
            				
            otherlv_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleGeneratedMetamodel929); 

            					doneLeaf(otherlv_2);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:357:3: (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:358:4: otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getGeneratedMetamodel_AsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGeneratedMetamodel960); 

                    				doneLeaf(otherlv_3);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:365:4: ( (lv_alias_4_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:366:5: (lv_alias_4_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:366:5: (lv_alias_4_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:367:6: lv_alias_4_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getGeneratedMetamodel_AliasIDTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_alias_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGeneratedMetamodel992); 

                    						doneLeaf(lv_alias_4_0);
                    					

                    }


                    }


                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleGeneratedMetamodel"


    // $ANTLR start "entryRuleReferencedMetamodel"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:381:1: entryRuleReferencedMetamodel : ruleReferencedMetamodel EOF ;
    public final void entryRuleReferencedMetamodel() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:381:29: ( ruleReferencedMetamodel EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:382:2: ruleReferencedMetamodel EOF
            {
             markComposite(elementTypeProvider.getReferencedMetamodelElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferencedMetamodel_in_entryRuleReferencedMetamodel1031);
            ruleReferencedMetamodel();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferencedMetamodel1034); 

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
    // $ANTLR end "entryRuleReferencedMetamodel"


    // $ANTLR start "ruleReferencedMetamodel"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:387:1: ruleReferencedMetamodel : (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? ) ;
    public final void ruleReferencedMetamodel() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:387:24: ( (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:388:2: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:388:2: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:389:3: otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )?
            {

            			markLeaf(elementTypeProvider.getReferencedMetamodel_ImportKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleReferencedMetamodel1053); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:396:3: ( (otherlv_1= RULE_STRING ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:397:4: (otherlv_1= RULE_STRING )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:397:4: (otherlv_1= RULE_STRING )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:398:5: otherlv_1= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getReferencedMetamodel_EPackageEPackageCrossReference_1_0ElementType());
            				
            otherlv_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleReferencedMetamodel1080); 

            					doneLeaf(otherlv_1);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:407:3: (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:408:4: otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getReferencedMetamodel_AsKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleReferencedMetamodel1111); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:415:4: ( (lv_alias_3_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:416:5: (lv_alias_3_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:416:5: (lv_alias_3_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:417:6: lv_alias_3_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getReferencedMetamodel_AliasIDTerminalRuleCall_2_1_0ElementType());
                    					
                    lv_alias_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleReferencedMetamodel1143); 

                    						doneLeaf(lv_alias_3_0);
                    					

                    }


                    }


                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleReferencedMetamodel"


    // $ANTLR start "entryRuleParserRule"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:431:1: entryRuleParserRule : ruleParserRule EOF ;
    public final void entryRuleParserRule() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:431:20: ( ruleParserRule EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:432:2: ruleParserRule EOF
            {
             markComposite(elementTypeProvider.getParserRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParserRule_in_entryRuleParserRule1182);
            ruleParserRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParserRule1185); 

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
    // $ANTLR end "entryRuleParserRule"


    // $ANTLR start "ruleParserRule"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:437:1: ruleParserRule : ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | ( ruleReturnsClause )? ) ) | ( ruleRuleNameAndParams ( ruleReturnsClause )? ) ) ( ruleHiddenClause )? otherlv_7= ':' ( (lv_alternatives_8_0= ruleAlternatives ) ) otherlv_9= ';' ) ;
    public final void ruleParserRule() throws RecognitionException {
        Token lv_fragment_0_0=null;
        Token lv_wildcard_2_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:437:15: ( ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | ( ruleReturnsClause )? ) ) | ( ruleRuleNameAndParams ( ruleReturnsClause )? ) ) ( ruleHiddenClause )? otherlv_7= ':' ( (lv_alternatives_8_0= ruleAlternatives ) ) otherlv_9= ';' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:438:2: ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | ( ruleReturnsClause )? ) ) | ( ruleRuleNameAndParams ( ruleReturnsClause )? ) ) ( ruleHiddenClause )? otherlv_7= ':' ( (lv_alternatives_8_0= ruleAlternatives ) ) otherlv_9= ';' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:438:2: ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | ( ruleReturnsClause )? ) ) | ( ruleRuleNameAndParams ( ruleReturnsClause )? ) ) ( ruleHiddenClause )? otherlv_7= ':' ( (lv_alternatives_8_0= ruleAlternatives ) ) otherlv_9= ';' )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:439:3: ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | ( ruleReturnsClause )? ) ) | ( ruleRuleNameAndParams ( ruleReturnsClause )? ) ) ( ruleHiddenClause )? otherlv_7= ':' ( (lv_alternatives_8_0= ruleAlternatives ) ) otherlv_9= ';'
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:439:3: ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | ( ruleReturnsClause )? ) ) | ( ruleRuleNameAndParams ( ruleReturnsClause )? ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:440:4: ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | ( ruleReturnsClause )? ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:440:4: ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | ( ruleReturnsClause )? ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:441:5: ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | ( ruleReturnsClause )? )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:441:5: ( (lv_fragment_0_0= 'fragment' ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:442:6: (lv_fragment_0_0= 'fragment' )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:442:6: (lv_fragment_0_0= 'fragment' )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:443:7: lv_fragment_0_0= 'fragment'
                    {

                    							markLeaf(elementTypeProvider.getParserRule_FragmentFragmentKeyword_0_0_0_0ElementType());
                    						
                    lv_fragment_0_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParserRule1234); 

                    							doneLeaf(lv_fragment_0_0);
                    						

                    }


                    }


                    					markComposite(elementTypeProvider.getParserRule_RuleNameAndParamsParserRuleCall_0_0_1ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_ruleRuleNameAndParams_in_ruleParserRule1267);
                    ruleRuleNameAndParams();

                    state._fsp--;


                    					doneComposite();
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:459:5: ( ( (lv_wildcard_2_0= '*' ) ) | ( ruleReturnsClause )? )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==22) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==14||LA14_0==23||LA14_0==27) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:460:6: ( (lv_wildcard_2_0= '*' ) )
                            {
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:460:6: ( (lv_wildcard_2_0= '*' ) )
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:461:7: (lv_wildcard_2_0= '*' )
                            {
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:461:7: (lv_wildcard_2_0= '*' )
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:462:8: lv_wildcard_2_0= '*'
                            {

                            								markLeaf(elementTypeProvider.getParserRule_WildcardAsteriskKeyword_0_0_2_0_0ElementType());
                            							
                            lv_wildcard_2_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParserRule1314); 

                            								doneLeaf(lv_wildcard_2_0);
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:472:6: ( ruleReturnsClause )?
                            {
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:472:6: ( ruleReturnsClause )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==27) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:473:7: ruleReturnsClause
                                    {

                                    							markComposite(elementTypeProvider.getParserRule_ReturnsClauseParserRuleCall_0_0_2_1ElementType());
                                    						
                                    pushFollow(FollowSets000.FOLLOW_ruleReturnsClause_in_ruleParserRule1372);
                                    ruleReturnsClause();

                                    state._fsp--;


                                    							doneComposite();
                                    						

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:484:4: ( ruleRuleNameAndParams ( ruleReturnsClause )? )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:484:4: ( ruleRuleNameAndParams ( ruleReturnsClause )? )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:485:5: ruleRuleNameAndParams ( ruleReturnsClause )?
                    {

                    					markComposite(elementTypeProvider.getParserRule_RuleNameAndParamsParserRuleCall_0_1_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_ruleRuleNameAndParams_in_ruleParserRule1425);
                    ruleRuleNameAndParams();

                    state._fsp--;


                    					doneComposite();
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:492:5: ( ruleReturnsClause )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==27) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:493:6: ruleReturnsClause
                            {

                            						markComposite(elementTypeProvider.getParserRule_ReturnsClauseParserRuleCall_0_1_1ElementType());
                            					
                            pushFollow(FollowSets000.FOLLOW_ruleReturnsClause_in_ruleParserRule1451);
                            ruleReturnsClause();

                            state._fsp--;


                            						doneComposite();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:503:3: ( ruleHiddenClause )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:504:4: ruleHiddenClause
                    {

                    				markComposite(elementTypeProvider.getParserRule_HiddenClauseParserRuleCall_1ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_ruleHiddenClause_in_ruleParserRule1488);
                    ruleHiddenClause();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getParserRule_ColonKeyword_2ElementType());
            		
            otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleParserRule1508); 

            			doneLeaf(otherlv_7);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:519:3: ( (lv_alternatives_8_0= ruleAlternatives ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:520:4: (lv_alternatives_8_0= ruleAlternatives )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:520:4: (lv_alternatives_8_0= ruleAlternatives )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:521:5: lv_alternatives_8_0= ruleAlternatives
            {

            					markComposite(elementTypeProvider.getParserRule_AlternativesAlternativesParserRuleCall_3_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_ruleParserRule1535);
            ruleAlternatives();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getParserRule_SemicolonKeyword_4ElementType());
            		
            otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleParserRule1560); 

            			doneLeaf(otherlv_9);
            		

            }


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
    // $ANTLR end "ruleParserRule"


    // $ANTLR start "entryRuleRuleNameAndParams"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:541:1: entryRuleRuleNameAndParams : ruleRuleNameAndParams EOF ;
    public final void entryRuleRuleNameAndParams() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:541:27: ( ruleRuleNameAndParams EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:542:2: ruleRuleNameAndParams EOF
            {
             markComposite(elementTypeProvider.getRuleNameAndParamsElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleRuleNameAndParams_in_entryRuleRuleNameAndParams1580);
            ruleRuleNameAndParams();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRuleNameAndParams1583); 

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
    // $ANTLR end "entryRuleRuleNameAndParams"


    // $ANTLR start "ruleRuleNameAndParams"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:547:1: ruleRuleNameAndParams : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )? ) ;
    public final void ruleRuleNameAndParams() throws RecognitionException {
        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:547:22: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:548:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:548:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:549:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )?
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:549:3: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:550:4: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:550:4: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:551:5: lv_name_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getRuleNameAndParams_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRuleNameAndParams1615); 

            					doneLeaf(lv_name_0_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:560:3: (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:561:4: otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']'
                    {

                    				markLeaf(elementTypeProvider.getRuleNameAndParams_LeftSquareBracketKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRuleNameAndParams1646); 

                    				doneLeaf(otherlv_1);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:568:4: ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:569:5: ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                            {
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:569:5: ( (lv_parameters_2_0= ruleParameter ) )
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:570:6: (lv_parameters_2_0= ruleParameter )
                            {
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:570:6: (lv_parameters_2_0= ruleParameter )
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:571:7: lv_parameters_2_0= ruleParameter
                            {

                            							markComposite(elementTypeProvider.getRuleNameAndParams_ParametersParameterParserRuleCall_1_1_0_0ElementType());
                            						
                            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleRuleNameAndParams1687);
                            ruleParameter();

                            state._fsp--;


                            							doneComposite();
                            						

                            }


                            }

                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:580:5: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==13) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:581:6: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                            	    {

                            	    						markLeaf(elementTypeProvider.getRuleNameAndParams_CommaKeyword_1_1_1_0ElementType());
                            	    					
                            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRuleNameAndParams1730); 

                            	    						doneLeaf(otherlv_3);
                            	    					
                            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:588:6: ( (lv_parameters_4_0= ruleParameter ) )
                            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:589:7: (lv_parameters_4_0= ruleParameter )
                            	    {
                            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:589:7: (lv_parameters_4_0= ruleParameter )
                            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:590:8: lv_parameters_4_0= ruleParameter
                            	    {

                            	    								markComposite(elementTypeProvider.getRuleNameAndParams_ParametersParameterParserRuleCall_1_1_1_1_0ElementType());
                            	    							
                            	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleRuleNameAndParams1772);
                            	    ruleParameter();

                            	    state._fsp--;


                            	    								doneComposite();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);


                            }
                            break;

                    }


                    				markLeaf(elementTypeProvider.getRuleNameAndParams_RightSquareBracketKeyword_1_2ElementType());
                    			
                    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRuleNameAndParams1821); 

                    				doneLeaf(otherlv_5);
                    			

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleRuleNameAndParams"


    // $ANTLR start "entryRuleReturnsClause"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:613:1: entryRuleReturnsClause : ruleReturnsClause EOF ;
    public final void entryRuleReturnsClause() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:613:23: ( ruleReturnsClause EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:614:2: ruleReturnsClause EOF
            {
             markComposite(elementTypeProvider.getReturnsClauseElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleReturnsClause_in_entryRuleReturnsClause1847);
            ruleReturnsClause();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReturnsClause1850); 

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
    // $ANTLR end "entryRuleReturnsClause"


    // $ANTLR start "ruleReturnsClause"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:619:1: ruleReturnsClause : (otherlv_0= 'returns' ( (lv_type_1_0= ruleTypeRef ) ) ) ;
    public final void ruleReturnsClause() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:619:18: ( (otherlv_0= 'returns' ( (lv_type_1_0= ruleTypeRef ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:620:2: (otherlv_0= 'returns' ( (lv_type_1_0= ruleTypeRef ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:620:2: (otherlv_0= 'returns' ( (lv_type_1_0= ruleTypeRef ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:621:3: otherlv_0= 'returns' ( (lv_type_1_0= ruleTypeRef ) )
            {

            			markLeaf(elementTypeProvider.getReturnsClause_ReturnsKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleReturnsClause1869); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:628:3: ( (lv_type_1_0= ruleTypeRef ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:629:4: (lv_type_1_0= ruleTypeRef )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:629:4: (lv_type_1_0= ruleTypeRef )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:630:5: lv_type_1_0= ruleTypeRef
            {

            					markComposite(elementTypeProvider.getReturnsClause_TypeTypeRefParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleReturnsClause1896);
            ruleTypeRef();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


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
    // $ANTLR end "ruleReturnsClause"


    // $ANTLR start "entryRuleParameter"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:643:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:643:19: ( ruleParameter EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:644:2: ruleParameter EOF
            {
             markComposite(elementTypeProvider.getParameterElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter1927);
            ruleParameter();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter1930); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:649:1: ruleParameter : ( (lv_name_0_0= RULE_ID ) ) ;
    public final void ruleParameter() throws RecognitionException {
        Token lv_name_0_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:649:14: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:650:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:650:2: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:651:3: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:651:3: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:652:4: lv_name_0_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getParameter_NameIDTerminalRuleCall_0ElementType());
            			
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParameter1955); 

            				doneLeaf(lv_name_0_0);
            			

            }


            }


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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTypeRef"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:664:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:664:17: ( ruleTypeRef EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:665:2: ruleTypeRef EOF
            {
             markComposite(elementTypeProvider.getTypeRefElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_entryRuleTypeRef1980);
            ruleTypeRef();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeRef1983); 

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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:670:1: ruleTypeRef : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final void ruleTypeRef() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:670:12: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:671:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:671:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:672:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:672:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==28) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:673:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:673:4: ( (otherlv_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:674:5: (otherlv_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:674:5: (otherlv_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:675:6: otherlv_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getTypeRef_MetamodelAbstractMetamodelDeclarationCrossReference_0_0_0ElementType());
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeRef2023); 

                    						doneLeaf(otherlv_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getTypeRef_ColonColonKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTypeRef2053); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:692:3: ( (otherlv_2= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:693:4: (otherlv_2= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:693:4: (otherlv_2= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:694:5: otherlv_2= RULE_ID
            {

            					markLeaf(elementTypeProvider.getTypeRef_ClassifierEClassifierCrossReference_1_0ElementType());
            				
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeRef2086); 

            					doneLeaf(otherlv_2);
            				

            }


            }


            }


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
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleAlternatives"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:707:1: entryRuleAlternatives : ruleAlternatives EOF ;
    public final void entryRuleAlternatives() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:707:22: ( ruleAlternatives EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:708:2: ruleAlternatives EOF
            {
             markComposite(elementTypeProvider.getAlternativesElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_entryRuleAlternatives2117);
            ruleAlternatives();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAlternatives2120); 

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
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:713:1: ruleAlternatives : ( ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? ) ;
    public final void ruleAlternatives() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:713:17: ( ( ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:714:2: ( ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:714:2: ( ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:715:3: ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getAlternatives_ConditionalBranchParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleConditionalBranch_in_ruleAlternatives2137);
            ruleConditionalBranch();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:722:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:723:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:723:4: ()
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:724:5: 
                    {

                    					precedeComposite(elementTypeProvider.getAlternatives_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:729:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==29) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:730:5: otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getAlternatives_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAlternatives2180); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:737:5: ( (lv_elements_3_0= ruleConditionalBranch ) )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:738:6: (lv_elements_3_0= ruleConditionalBranch )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:738:6: (lv_elements_3_0= ruleConditionalBranch )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:739:7: lv_elements_3_0= ruleConditionalBranch
                    	    {

                    	    							markComposite(elementTypeProvider.getAlternatives_ElementsConditionalBranchParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleConditionalBranch_in_ruleAlternatives2217);
                    	    ruleConditionalBranch();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);


                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleConditionalBranch"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:754:1: entryRuleConditionalBranch : ruleConditionalBranch EOF ;
    public final void entryRuleConditionalBranch() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:754:27: ( ruleConditionalBranch EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:755:2: ruleConditionalBranch EOF
            {
             markComposite(elementTypeProvider.getConditionalBranchElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditionalBranch_in_entryRuleConditionalBranch2265);
            ruleConditionalBranch();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditionalBranch2268); 

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
    // $ANTLR end "entryRuleConditionalBranch"


    // $ANTLR start "ruleConditionalBranch"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:760:1: ruleConditionalBranch : ( ruleUnorderedGroup | ( () otherlv_2= '[' ( (lv_filtered_3_0= ruleInverseLiteralValue ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ( (lv_guardedElement_6_0= ruleUnorderedGroup ) ) ) ) ;
    public final void ruleConditionalBranch() throws RecognitionException {
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:760:22: ( ( ruleUnorderedGroup | ( () otherlv_2= '[' ( (lv_filtered_3_0= ruleInverseLiteralValue ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ( (lv_guardedElement_6_0= ruleUnorderedGroup ) ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:761:2: ( ruleUnorderedGroup | ( () otherlv_2= '[' ( (lv_filtered_3_0= ruleInverseLiteralValue ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ( (lv_guardedElement_6_0= ruleUnorderedGroup ) ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:761:2: ( ruleUnorderedGroup | ( () otherlv_2= '[' ( (lv_filtered_3_0= ruleInverseLiteralValue ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ( (lv_guardedElement_6_0= ruleUnorderedGroup ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)||LA24_0==15||LA24_0==33||(LA24_0>=39 && LA24_0<=40)) ) {
                alt24=1;
            }
            else if ( (LA24_0==25) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:762:3: ruleUnorderedGroup
                    {

                    			markComposite(elementTypeProvider.getConditionalBranch_UnorderedGroupParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroup_in_ruleConditionalBranch2285);
                    ruleUnorderedGroup();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:770:3: ( () otherlv_2= '[' ( (lv_filtered_3_0= ruleInverseLiteralValue ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ( (lv_guardedElement_6_0= ruleUnorderedGroup ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:770:3: ( () otherlv_2= '[' ( (lv_filtered_3_0= ruleInverseLiteralValue ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ( (lv_guardedElement_6_0= ruleUnorderedGroup ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:771:4: () otherlv_2= '[' ( (lv_filtered_3_0= ruleInverseLiteralValue ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ( (lv_guardedElement_6_0= ruleUnorderedGroup ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:771:4: ()
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:772:5: 
                    {

                    					precedeComposite(elementTypeProvider.getConditionalBranch_ConditionalBranchAction_1_0ElementType());
                    					doneComposite();
                    				

                    }


                    				markLeaf(elementTypeProvider.getConditionalBranch_LeftSquareBracketKeyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleConditionalBranch2329); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:784:4: ( (lv_filtered_3_0= ruleInverseLiteralValue ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:785:5: (lv_filtered_3_0= ruleInverseLiteralValue )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:785:5: (lv_filtered_3_0= ruleInverseLiteralValue )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:786:6: lv_filtered_3_0= ruleInverseLiteralValue
                    {

                    						markComposite(elementTypeProvider.getConditionalBranch_FilteredInverseLiteralValueParserRuleCall_1_2_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleInverseLiteralValue_in_ruleConditionalBranch2361);
                    ruleInverseLiteralValue();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:795:4: ( (otherlv_4= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:796:5: (otherlv_4= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:796:5: (otherlv_4= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:797:6: otherlv_4= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getConditionalBranch_ParameterParameterCrossReference_1_3_0ElementType());
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConditionalBranch2406); 

                    						doneLeaf(otherlv_4);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getConditionalBranch_RightSquareBracketKeyword_1_4ElementType());
                    			
                    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleConditionalBranch2436); 

                    				doneLeaf(otherlv_5);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:813:4: ( (lv_guardedElement_6_0= ruleUnorderedGroup ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:814:5: (lv_guardedElement_6_0= ruleUnorderedGroup )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:814:5: (lv_guardedElement_6_0= ruleUnorderedGroup )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:815:6: lv_guardedElement_6_0= ruleUnorderedGroup
                    {

                    						markComposite(elementTypeProvider.getConditionalBranch_GuardedElementUnorderedGroupParserRuleCall_1_5_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroup_in_ruleConditionalBranch2468);
                    ruleUnorderedGroup();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleConditionalBranch"


    // $ANTLR start "entryRuleUnorderedGroup"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:829:1: entryRuleUnorderedGroup : ruleUnorderedGroup EOF ;
    public final void entryRuleUnorderedGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:829:24: ( ruleUnorderedGroup EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:830:2: ruleUnorderedGroup EOF
            {
             markComposite(elementTypeProvider.getUnorderedGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroup_in_entryRuleUnorderedGroup2506);
            ruleUnorderedGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnorderedGroup2509); 

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
    // $ANTLR end "entryRuleUnorderedGroup"


    // $ANTLR start "ruleUnorderedGroup"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:835:1: ruleUnorderedGroup : ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? ) ;
    public final void ruleUnorderedGroup() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:835:19: ( ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:836:2: ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:836:2: ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:837:3: ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getUnorderedGroup_GroupParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleUnorderedGroup2526);
            ruleGroup();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:844:3: ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:845:4: () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:845:4: ()
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:846:5: 
                    {

                    					precedeComposite(elementTypeProvider.getUnorderedGroup_UnorderedGroupElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:851:4: (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==30) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:852:5: otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getUnorderedGroup_AmpersandKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleUnorderedGroup2569); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:859:5: ( (lv_elements_3_0= ruleGroup ) )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:860:6: (lv_elements_3_0= ruleGroup )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:860:6: (lv_elements_3_0= ruleGroup )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:861:7: lv_elements_3_0= ruleGroup
                    	    {

                    	    							markComposite(elementTypeProvider.getUnorderedGroup_ElementsGroupParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleUnorderedGroup2606);
                    	    ruleGroup();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);


                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleUnorderedGroup"


    // $ANTLR start "entryRuleGroup"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:876:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:876:15: ( ruleGroup EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:877:2: ruleGroup EOF
            {
             markComposite(elementTypeProvider.getGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup2654);
            ruleGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup2657); 

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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:882:1: ruleGroup : ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? ) ;
    public final void ruleGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:882:10: ( ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:883:2: ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:883:2: ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:884:3: ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )?
            {

            			markComposite(elementTypeProvider.getGroup_AbstractTokenParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAbstractToken_in_ruleGroup2674);
            ruleAbstractToken();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:891:3: ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||LA28_0==15||LA28_0==33||(LA28_0>=39 && LA28_0<=40)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:892:4: () ( (lv_elements_2_0= ruleAbstractToken ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:892:4: ()
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:893:5: 
                    {

                    					precedeComposite(elementTypeProvider.getGroup_GroupElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:898:4: ( (lv_elements_2_0= ruleAbstractToken ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_STRING)||LA27_0==15||LA27_0==33||(LA27_0>=39 && LA27_0<=40)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:899:5: (lv_elements_2_0= ruleAbstractToken )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:899:5: (lv_elements_2_0= ruleAbstractToken )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:900:6: lv_elements_2_0= ruleAbstractToken
                    	    {

                    	    						markComposite(elementTypeProvider.getGroup_ElementsAbstractTokenParserRuleCall_1_1_0ElementType());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractToken_in_ruleGroup2725);
                    	    ruleAbstractToken();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);


                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleAbstractToken"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:914:1: entryRuleAbstractToken : ruleAbstractToken EOF ;
    public final void entryRuleAbstractToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:914:23: ( ruleAbstractToken EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:915:2: ruleAbstractToken EOF
            {
             markComposite(elementTypeProvider.getAbstractTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractToken_in_entryRuleAbstractToken2765);
            ruleAbstractToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractToken2768); 

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
    // $ANTLR end "entryRuleAbstractToken"


    // $ANTLR start "ruleAbstractToken"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:920:1: ruleAbstractToken : ( ruleAbstractTokenWithCardinality | ruleAction ) ;
    public final void ruleAbstractToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:920:18: ( ( ruleAbstractTokenWithCardinality | ruleAction ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:921:2: ( ruleAbstractTokenWithCardinality | ruleAction )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:921:2: ( ruleAbstractTokenWithCardinality | ruleAction )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_STRING)||LA29_0==15||(LA29_0>=39 && LA29_0<=40)) ) {
                alt29=1;
            }
            else if ( (LA29_0==33) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:922:3: ruleAbstractTokenWithCardinality
                    {

                    			markComposite(elementTypeProvider.getAbstractToken_AbstractTokenWithCardinalityParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractTokenWithCardinality_in_ruleAbstractToken2785);
                    ruleAbstractTokenWithCardinality();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:930:3: ruleAction
                    {

                    			markComposite(elementTypeProvider.getAbstractToken_ActionParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleAbstractToken2805);
                    ruleAction();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


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
    // $ANTLR end "ruleAbstractToken"


    // $ANTLR start "entryRuleAbstractTokenWithCardinality"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:941:1: entryRuleAbstractTokenWithCardinality : ruleAbstractTokenWithCardinality EOF ;
    public final void entryRuleAbstractTokenWithCardinality() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:941:38: ( ruleAbstractTokenWithCardinality EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:942:2: ruleAbstractTokenWithCardinality EOF
            {
             markComposite(elementTypeProvider.getAbstractTokenWithCardinalityElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractTokenWithCardinality_in_entryRuleAbstractTokenWithCardinality2825);
            ruleAbstractTokenWithCardinality();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractTokenWithCardinality2828); 

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
    // $ANTLR end "entryRuleAbstractTokenWithCardinality"


    // $ANTLR start "ruleAbstractTokenWithCardinality"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:947:1: ruleAbstractTokenWithCardinality : ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) ;
    public final void ruleAbstractTokenWithCardinality() throws RecognitionException {
        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:947:33: ( ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:948:2: ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:948:2: ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:949:3: ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:949:3: ( ruleAssignment | ruleAbstractTerminal )
            int alt30=2;
            switch ( input.LA(1) ) {
            case 39:
                {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==RULE_STRING||LA30_1==15) ) {
                    alt30=2;
                }
                else if ( (LA30_1==RULE_ID) ) {
                    int LA30_5 = input.LA(3);

                    if ( ((LA30_5>=34 && LA30_5<=35)||LA30_5==41) ) {
                        alt30=1;
                    }
                    else if ( (LA30_5==EOF||(LA30_5>=RULE_ID && LA30_5<=RULE_STRING)||(LA30_5>=15 && LA30_5<=16)||LA30_5==22||LA30_5==24||(LA30_5>=29 && LA30_5<=33)||(LA30_5>=39 && LA30_5<=40)) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==RULE_ID) ) {
                    int LA30_5 = input.LA(3);

                    if ( ((LA30_5>=34 && LA30_5<=35)||LA30_5==41) ) {
                        alt30=1;
                    }
                    else if ( (LA30_5==EOF||(LA30_5>=RULE_ID && LA30_5<=RULE_STRING)||(LA30_5>=15 && LA30_5<=16)||LA30_5==22||LA30_5==24||(LA30_5>=29 && LA30_5<=33)||(LA30_5>=39 && LA30_5<=40)) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA30_2==RULE_STRING||LA30_2==15) ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA30_3 = input.LA(2);

                if ( ((LA30_3>=34 && LA30_3<=35)||LA30_3==41) ) {
                    alt30=1;
                }
                else if ( (LA30_3==EOF||(LA30_3>=RULE_ID && LA30_3<=RULE_STRING)||(LA30_3>=15 && LA30_3<=16)||LA30_3==22||(LA30_3>=24 && LA30_3<=25)||(LA30_3>=28 && LA30_3<=33)||(LA30_3>=39 && LA30_3<=40)) ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 15:
                {
                alt30=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:950:4: ruleAssignment
                    {

                    				markComposite(elementTypeProvider.getAbstractTokenWithCardinality_AssignmentParserRuleCall_0_0ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleAbstractTokenWithCardinality2851);
                    ruleAssignment();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:958:4: ruleAbstractTerminal
                    {

                    				markComposite(elementTypeProvider.getAbstractTokenWithCardinality_AbstractTerminalParserRuleCall_0_1ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractTerminal_in_ruleAbstractTokenWithCardinality2875);
                    ruleAbstractTerminal();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:966:3: ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==22||(LA32_0>=31 && LA32_0<=32)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:967:4: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:967:4: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:968:5: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:968:5: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    int alt31=3;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt31=1;
                        }
                        break;
                    case 22:
                        {
                        alt31=2;
                        }
                        break;
                    case 32:
                        {
                        alt31=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:969:6: lv_cardinality_2_1= '?'
                            {

                            						markLeaf(elementTypeProvider.getAbstractTokenWithCardinality_CardinalityQuestionMarkKeyword_1_0_0ElementType());
                            					
                            lv_cardinality_2_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAbstractTokenWithCardinality2915); 

                            						doneLeaf(lv_cardinality_2_1);
                            					

                            }
                            break;
                        case 2 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:977:6: lv_cardinality_2_2= '*'
                            {

                            						markLeaf(elementTypeProvider.getAbstractTokenWithCardinality_CardinalityAsteriskKeyword_1_0_1ElementType());
                            					
                            lv_cardinality_2_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAbstractTokenWithCardinality2949); 

                            						doneLeaf(lv_cardinality_2_2);
                            					

                            }
                            break;
                        case 3 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:985:6: lv_cardinality_2_3= '+'
                            {

                            						markLeaf(elementTypeProvider.getAbstractTokenWithCardinality_CardinalityPlusSignKeyword_1_0_2ElementType());
                            					
                            lv_cardinality_2_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAbstractTokenWithCardinality2983); 

                            						doneLeaf(lv_cardinality_2_3);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleAbstractTokenWithCardinality"


    // $ANTLR start "entryRuleAction"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:999:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:999:16: ( ruleAction EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1000:2: ruleAction EOF
            {
             markComposite(elementTypeProvider.getActionElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction3022);
            ruleAction();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction3025); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1005:1: ruleAction : (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) ;
    public final void ruleAction() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_feature_3_0=null;
        Token lv_operator_4_1=null;
        Token lv_operator_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1005:11: ( (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1006:2: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1006:2: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1007:3: otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}'
            {

            			markLeaf(elementTypeProvider.getAction_LeftCurlyBracketKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAction3044); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1014:3: ( (lv_type_1_0= ruleTypeRef ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1015:4: (lv_type_1_0= ruleTypeRef )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1015:4: (lv_type_1_0= ruleTypeRef )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1016:5: lv_type_1_0= ruleTypeRef
            {

            					markComposite(elementTypeProvider.getAction_TypeTypeRefParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleAction3071);
            ruleTypeRef();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1025:3: (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==17) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1026:4: otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current'
                    {

                    				markLeaf(elementTypeProvider.getAction_FullStopKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAction3102); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1033:4: ( (lv_feature_3_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1034:5: (lv_feature_3_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1034:5: (lv_feature_3_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1035:6: lv_feature_3_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getAction_FeatureIDTerminalRuleCall_2_1_0ElementType());
                    					
                    lv_feature_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAction3134); 

                    						doneLeaf(lv_feature_3_0);
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1044:4: ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1045:5: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1045:5: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1046:6: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1046:6: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==34) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==35) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1047:7: lv_operator_4_1= '='
                            {

                            							markLeaf(elementTypeProvider.getAction_OperatorEqualsSignKeyword_2_2_0_0ElementType());
                            						
                            lv_operator_4_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAction3188); 

                            							doneLeaf(lv_operator_4_1);
                            						

                            }
                            break;
                        case 2 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1055:7: lv_operator_4_2= '+='
                            {

                            							markLeaf(elementTypeProvider.getAction_OperatorPlusSignEqualsSignKeyword_2_2_0_1ElementType());
                            						
                            lv_operator_4_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAction3226); 

                            							doneLeaf(lv_operator_4_2);
                            						

                            }
                            break;

                    }


                    }


                    }


                    				markLeaf(elementTypeProvider.getAction_CurrentKeyword_2_3ElementType());
                    			
                    otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAction3264); 

                    				doneLeaf(otherlv_5);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getAction_RightCurlyBracketKeyword_3ElementType());
            		
            otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAction3284); 

            			doneLeaf(otherlv_6);
            		

            }


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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAbstractTerminal"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1084:1: entryRuleAbstractTerminal : ruleAbstractTerminal EOF ;
    public final void entryRuleAbstractTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1084:26: ( ruleAbstractTerminal EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1085:2: ruleAbstractTerminal EOF
            {
             markComposite(elementTypeProvider.getAbstractTerminalElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractTerminal_in_entryRuleAbstractTerminal3304);
            ruleAbstractTerminal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractTerminal3307); 

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
    // $ANTLR end "entryRuleAbstractTerminal"


    // $ANTLR start "ruleAbstractTerminal"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1090:1: ruleAbstractTerminal : ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup ) ;
    public final void ruleAbstractTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1090:21: ( ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1091:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1091:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup )
            int alt35=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt35=1;
                }
                break;
            case RULE_ID:
                {
                alt35=2;
                }
                break;
            case 15:
                {
                alt35=3;
                }
                break;
            case 39:
                {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt35=6;
                    }
                    break;
                case RULE_ID:
                    {
                    alt35=5;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt35=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 4, input);

                    throw nvae;
                }

                }
                break;
            case 40:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    alt35=4;
                    }
                    break;
                case 15:
                    {
                    alt35=6;
                    }
                    break;
                case RULE_ID:
                    {
                    alt35=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 5, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1092:3: ruleKeyword
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_KeywordParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleAbstractTerminal3324);
                    ruleKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1100:3: ruleRuleCall
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_RuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleAbstractTerminal3344);
                    ruleRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1108:3: ruleParenthesizedElement
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_ParenthesizedElementParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedElement_in_ruleAbstractTerminal3364);
                    ruleParenthesizedElement();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1116:3: rulePredicatedKeyword
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_PredicatedKeywordParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_rulePredicatedKeyword_in_ruleAbstractTerminal3384);
                    rulePredicatedKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 5 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1124:3: rulePredicatedRuleCall
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_PredicatedRuleCallParserRuleCall_4ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_rulePredicatedRuleCall_in_ruleAbstractTerminal3404);
                    rulePredicatedRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 6 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1132:3: rulePredicatedGroup
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_PredicatedGroupParserRuleCall_5ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_rulePredicatedGroup_in_ruleAbstractTerminal3424);
                    rulePredicatedGroup();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


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
    // $ANTLR end "ruleAbstractTerminal"


    // $ANTLR start "entryRuleKeyword"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1143:1: entryRuleKeyword : ruleKeyword EOF ;
    public final void entryRuleKeyword() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1143:17: ( ruleKeyword EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1144:2: ruleKeyword EOF
            {
             markComposite(elementTypeProvider.getKeywordElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_entryRuleKeyword3444);
            ruleKeyword();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyword3447); 

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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1149:1: ruleKeyword : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final void ruleKeyword() throws RecognitionException {
        Token lv_value_0_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1149:12: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1150:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1150:2: ( (lv_value_0_0= RULE_STRING ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1151:3: (lv_value_0_0= RULE_STRING )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1151:3: (lv_value_0_0= RULE_STRING )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1152:4: lv_value_0_0= RULE_STRING
            {

            				markLeaf(elementTypeProvider.getKeyword_ValueSTRINGTerminalRuleCall_0ElementType());
            			
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleKeyword3472); 

            				doneLeaf(lv_value_0_0);
            			

            }


            }


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
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleRuleCall"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1164:1: entryRuleRuleCall : ruleRuleCall EOF ;
    public final void entryRuleRuleCall() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1164:18: ( ruleRuleCall EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1165:2: ruleRuleCall EOF
            {
             markComposite(elementTypeProvider.getRuleCallElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_entryRuleRuleCall3497);
            ruleRuleCall();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRuleCall3500); 

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
    // $ANTLR end "entryRuleRuleCall"


    // $ANTLR start "ruleRuleCall"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1170:1: ruleRuleCall : ( () ( ( ruleRuleID ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleNamedArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) ) )* otherlv_6= ']' )? ) ;
    public final void ruleRuleCall() throws RecognitionException {
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1170:13: ( ( () ( ( ruleRuleID ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleNamedArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) ) )* otherlv_6= ']' )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1171:2: ( () ( ( ruleRuleID ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleNamedArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) ) )* otherlv_6= ']' )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1171:2: ( () ( ( ruleRuleID ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleNamedArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) ) )* otherlv_6= ']' )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1172:3: () ( ( ruleRuleID ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleNamedArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) ) )* otherlv_6= ']' )?
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1172:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1173:4: 
            {

            				precedeComposite(elementTypeProvider.getRuleCall_RuleCallAction_0ElementType());
            				doneComposite();
            			

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1178:3: ( ( ruleRuleID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1179:4: ( ruleRuleID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1179:4: ( ruleRuleID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1180:5: ruleRuleID
            {

            					markComposite(elementTypeProvider.getRuleCall_RuleAbstractRuleCrossReference_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleRuleID_in_ruleRuleCall3543);
            ruleRuleID();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1189:3: (otherlv_2= '[' ( (lv_arguments_3_0= ruleNamedArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) ) )* otherlv_6= ']' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==25) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1190:4: otherlv_2= '[' ( (lv_arguments_3_0= ruleNamedArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) ) )* otherlv_6= ']'
                    {

                    				markLeaf(elementTypeProvider.getRuleCall_LeftSquareBracketKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRuleCall3574); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1197:4: ( (lv_arguments_3_0= ruleNamedArgument ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1198:5: (lv_arguments_3_0= ruleNamedArgument )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1198:5: (lv_arguments_3_0= ruleNamedArgument )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1199:6: lv_arguments_3_0= ruleNamedArgument
                    {

                    						markComposite(elementTypeProvider.getRuleCall_ArgumentsNamedArgumentParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleNamedArgument_in_ruleRuleCall3606);
                    ruleNamedArgument();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1208:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==13) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1209:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getRuleCall_CommaKeyword_2_2_0ElementType());
                    	    				
                    	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRuleCall3643); 

                    	    					doneLeaf(otherlv_4);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1216:5: ( (lv_arguments_5_0= ruleNamedArgument ) )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1217:6: (lv_arguments_5_0= ruleNamedArgument )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1217:6: (lv_arguments_5_0= ruleNamedArgument )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1218:7: lv_arguments_5_0= ruleNamedArgument
                    	    {

                    	    							markComposite(elementTypeProvider.getRuleCall_ArgumentsNamedArgumentParserRuleCall_2_2_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleNamedArgument_in_ruleRuleCall3680);
                    	    ruleNamedArgument();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    				markLeaf(elementTypeProvider.getRuleCall_RightSquareBracketKeyword_2_3ElementType());
                    			
                    otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRuleCall3719); 

                    				doneLeaf(otherlv_6);
                    			

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleRuleCall"


    // $ANTLR start "entryRuleLiteralValue"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1240:1: entryRuleLiteralValue : ruleLiteralValue EOF ;
    public final void entryRuleLiteralValue() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1240:22: ( ruleLiteralValue EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1241:2: ruleLiteralValue EOF
            {
             markComposite(elementTypeProvider.getLiteralValueElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue3745);
            ruleLiteralValue();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralValue3748); 

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
    // $ANTLR end "entryRuleLiteralValue"


    // $ANTLR start "ruleLiteralValue"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1246:1: ruleLiteralValue : (kw= '!' | kw= '+' ) ;
    public final void ruleLiteralValue() throws RecognitionException {
        Token kw=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1246:17: ( (kw= '!' | kw= '+' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1247:2: (kw= '!' | kw= '+' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1247:2: (kw= '!' | kw= '+' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            else if ( (LA38_0==32) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1248:3: kw= '!'
                    {

                    			markLeaf(elementTypeProvider.getLiteralValue_ExclamationMarkKeyword_0ElementType());
                    		
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleLiteralValue3767); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1256:3: kw= '+'
                    {

                    			markLeaf(elementTypeProvider.getLiteralValue_PlusSignKeyword_1ElementType());
                    		
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleLiteralValue3789); 

                    			doneLeaf(kw);
                    		

                    }
                    break;

            }


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
    // $ANTLR end "ruleLiteralValue"


    // $ANTLR start "entryRuleInverseLiteralValue"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1267:1: entryRuleInverseLiteralValue : ruleInverseLiteralValue EOF ;
    public final void entryRuleInverseLiteralValue() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1267:29: ( ruleInverseLiteralValue EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1268:2: ruleInverseLiteralValue EOF
            {
             markComposite(elementTypeProvider.getInverseLiteralValueElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleInverseLiteralValue_in_entryRuleInverseLiteralValue3809);
            ruleInverseLiteralValue();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInverseLiteralValue3812); 

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
    // $ANTLR end "entryRuleInverseLiteralValue"


    // $ANTLR start "ruleInverseLiteralValue"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1273:1: ruleInverseLiteralValue : ruleLiteralValue ;
    public final void ruleInverseLiteralValue() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1273:24: ( ruleLiteralValue )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1274:2: ruleLiteralValue
            {

            		markComposite(elementTypeProvider.getInverseLiteralValue_LiteralValueParserRuleCallElementType());
            	
            pushFollow(FollowSets000.FOLLOW_ruleLiteralValue_in_ruleInverseLiteralValue3824);
            ruleLiteralValue();

            state._fsp--;


            		doneComposite();
            	

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
    // $ANTLR end "ruleInverseLiteralValue"


    // $ANTLR start "entryRuleNamedArgument"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1284:1: entryRuleNamedArgument : ruleNamedArgument EOF ;
    public final void entryRuleNamedArgument() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1284:23: ( ruleNamedArgument EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1285:2: ruleNamedArgument EOF
            {
             markComposite(elementTypeProvider.getNamedArgumentElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedArgument_in_entryRuleNamedArgument3840);
            ruleNamedArgument();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedArgument3843); 

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
    // $ANTLR end "entryRuleNamedArgument"


    // $ANTLR start "ruleNamedArgument"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1290:1: ruleNamedArgument : ( () ( ( ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) ) ) ;
    public final void ruleNamedArgument() throws RecognitionException {
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1290:18: ( ( () ( ( ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1291:2: ( () ( ( ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1291:2: ( () ( ( ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1292:3: () ( ( ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1292:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1293:4: 
            {

            				precedeComposite(elementTypeProvider.getNamedArgument_NamedArgumentAction_0ElementType());
            				doneComposite();
            			

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1298:3: ( ( ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==32||LA40_0==38) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID) ) {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==34) ) {
                    alt40=2;
                }
                else if ( (LA40_2==EOF||LA40_2==13||LA40_2==26) ) {
                    alt40=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1299:4: ( ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1299:4: ( ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1300:5: ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1300:5: ( (lv_literalValue_1_0= ruleLiteralValue ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==32||LA39_0==38) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1301:6: (lv_literalValue_1_0= ruleLiteralValue )
                            {
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1301:6: (lv_literalValue_1_0= ruleLiteralValue )
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1302:7: lv_literalValue_1_0= ruleLiteralValue
                            {

                            							markComposite(elementTypeProvider.getNamedArgument_LiteralValueLiteralValueParserRuleCall_1_0_0_0ElementType());
                            						
                            pushFollow(FollowSets000.FOLLOW_ruleLiteralValue_in_ruleNamedArgument3905);
                            ruleLiteralValue();

                            state._fsp--;


                            							doneComposite();
                            						

                            }


                            }
                            break;

                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1311:5: ( (otherlv_2= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1312:6: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1312:6: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1313:7: otherlv_2= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getNamedArgument_ParameterParameterCrossReference_1_0_1_0ElementType());
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedArgument3958); 

                    							doneLeaf(otherlv_2);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1324:4: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1324:4: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1325:5: ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1325:5: ( (otherlv_3= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1326:6: (otherlv_3= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1326:6: (otherlv_3= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1327:7: otherlv_3= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getNamedArgument_ParameterParameterCrossReference_1_1_0_0ElementType());
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedArgument4029); 

                    							doneLeaf(otherlv_3);
                    						

                    }


                    }


                    					markLeaf(elementTypeProvider.getNamedArgument_EqualsSignKeyword_1_1_1ElementType());
                    				
                    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleNamedArgument4064); 

                    					doneLeaf(otherlv_4);
                    				
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1343:5: ( (otherlv_5= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1344:6: (otherlv_5= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1344:6: (otherlv_5= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1345:7: otherlv_5= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getNamedArgument_ValueParameterCrossReference_1_1_2_0ElementType());
                    						
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedArgument4101); 

                    							doneLeaf(otherlv_5);
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleNamedArgument"


    // $ANTLR start "entryRuleTerminalRuleCall"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1360:1: entryRuleTerminalRuleCall : ruleTerminalRuleCall EOF ;
    public final void entryRuleTerminalRuleCall() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1360:26: ( ruleTerminalRuleCall EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1361:2: ruleTerminalRuleCall EOF
            {
             markComposite(elementTypeProvider.getTerminalRuleCallElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalRuleCall_in_entryRuleTerminalRuleCall4147);
            ruleTerminalRuleCall();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalRuleCall4150); 

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
    // $ANTLR end "entryRuleTerminalRuleCall"


    // $ANTLR start "ruleTerminalRuleCall"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1366:1: ruleTerminalRuleCall : ( ( ruleRuleID ) ) ;
    public final void ruleTerminalRuleCall() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1366:21: ( ( ( ruleRuleID ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1367:2: ( ( ruleRuleID ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1367:2: ( ( ruleRuleID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1368:3: ( ruleRuleID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1368:3: ( ruleRuleID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1369:4: ruleRuleID
            {

            				markComposite(elementTypeProvider.getTerminalRuleCall_RuleAbstractRuleCrossReference_0ElementType());
            			
            pushFollow(FollowSets000.FOLLOW_ruleRuleID_in_ruleTerminalRuleCall4173);
            ruleRuleID();

            state._fsp--;


            				doneComposite();
            			

            }


            }


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
    // $ANTLR end "ruleTerminalRuleCall"


    // $ANTLR start "entryRuleRuleID"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1381:1: entryRuleRuleID : ruleRuleID EOF ;
    public final void entryRuleRuleID() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1381:16: ( ruleRuleID EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1382:2: ruleRuleID EOF
            {
             markComposite(elementTypeProvider.getRuleIDElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleRuleID_in_entryRuleRuleID4198);
            ruleRuleID();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRuleID4201); 

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
    // $ANTLR end "entryRuleRuleID"


    // $ANTLR start "ruleRuleID"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1387:1: ruleRuleID : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final void ruleRuleID() throws RecognitionException {
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1387:11: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1388:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1388:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1389:3: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {

            			markLeaf(elementTypeProvider.getRuleID_IDTerminalRuleCall_0ElementType());
            		
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRuleID4220); 

            			doneLeaf(this_ID_0);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1396:3: (kw= '::' this_ID_2= RULE_ID )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==28) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1397:4: kw= '::' this_ID_2= RULE_ID
            	    {

            	    				markLeaf(elementTypeProvider.getRuleID_ColonColonKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRuleID4240); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getRuleID_IDTerminalRuleCall_1_1ElementType());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRuleID4257); 

            	    				doneLeaf(this_ID_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


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
    // $ANTLR end "ruleRuleID"


    // $ANTLR start "entryRulePredicatedKeyword"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1416:1: entryRulePredicatedKeyword : rulePredicatedKeyword EOF ;
    public final void entryRulePredicatedKeyword() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1416:27: ( rulePredicatedKeyword EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1417:2: rulePredicatedKeyword EOF
            {
             markComposite(elementTypeProvider.getPredicatedKeywordElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicatedKeyword_in_entryRulePredicatedKeyword4283);
            rulePredicatedKeyword();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicatedKeyword4286); 

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
    // $ANTLR end "entryRulePredicatedKeyword"


    // $ANTLR start "rulePredicatedKeyword"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1422:1: rulePredicatedKeyword : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final void rulePredicatedKeyword() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token lv_value_2_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1422:22: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1423:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1423:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1424:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1424:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==39) ) {
                alt42=1;
            }
            else if ( (LA42_0==40) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1425:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1425:4: ( (lv_predicated_0_0= '=>' ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1426:5: (lv_predicated_0_0= '=>' )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1426:5: (lv_predicated_0_0= '=>' )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1427:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedKeyword_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePredicatedKeyword4326); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1437:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1437:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1438:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1438:5: (lv_firstSetPredicated_1_0= '->' )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1439:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedKeyword_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePredicatedKeyword4380); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1449:3: ( (lv_value_2_0= RULE_STRING ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1450:4: (lv_value_2_0= RULE_STRING )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1450:4: (lv_value_2_0= RULE_STRING )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1451:5: lv_value_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getPredicatedKeyword_ValueSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePredicatedKeyword4425); 

            					doneLeaf(lv_value_2_0);
            				

            }


            }


            }


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
    // $ANTLR end "rulePredicatedKeyword"


    // $ANTLR start "entryRulePredicatedRuleCall"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1464:1: entryRulePredicatedRuleCall : rulePredicatedRuleCall EOF ;
    public final void entryRulePredicatedRuleCall() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1464:28: ( rulePredicatedRuleCall EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1465:2: rulePredicatedRuleCall EOF
            {
             markComposite(elementTypeProvider.getPredicatedRuleCallElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicatedRuleCall_in_entryRulePredicatedRuleCall4456);
            rulePredicatedRuleCall();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicatedRuleCall4459); 

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
    // $ANTLR end "entryRulePredicatedRuleCall"


    // $ANTLR start "rulePredicatedRuleCall"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1470:1: rulePredicatedRuleCall : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final void rulePredicatedRuleCall() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1470:23: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1471:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1471:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1472:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1472:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==39) ) {
                alt43=1;
            }
            else if ( (LA43_0==40) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1473:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1473:4: ( (lv_predicated_0_0= '=>' ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1474:5: (lv_predicated_0_0= '=>' )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1474:5: (lv_predicated_0_0= '=>' )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1475:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedRuleCall_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePredicatedRuleCall4499); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1485:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1485:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1486:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1486:5: (lv_firstSetPredicated_1_0= '->' )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1487:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedRuleCall_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePredicatedRuleCall4553); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1497:3: ( (otherlv_2= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1498:4: (otherlv_2= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1498:4: (otherlv_2= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1499:5: otherlv_2= RULE_ID
            {

            					markLeaf(elementTypeProvider.getPredicatedRuleCall_RuleAbstractRuleCrossReference_1_0ElementType());
            				
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePredicatedRuleCall4598); 

            					doneLeaf(otherlv_2);
            				

            }


            }


            }


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
    // $ANTLR end "rulePredicatedRuleCall"


    // $ANTLR start "entryRuleAssignment"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1512:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1512:20: ( ruleAssignment EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1513:2: ruleAssignment EOF
            {
             markComposite(elementTypeProvider.getAssignmentElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment4629);
            ruleAssignment();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment4632); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1518:1: ruleAssignment : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) ) ;
    public final void ruleAssignment() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token lv_feature_2_0=null;
        Token lv_operator_3_1=null;
        Token lv_operator_3_2=null;
        Token lv_operator_3_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1518:15: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1519:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1519:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1520:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1520:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )?
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            else if ( (LA44_0==40) ) {
                alt44=2;
            }
            switch (alt44) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1521:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1521:4: ( (lv_predicated_0_0= '=>' ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1522:5: (lv_predicated_0_0= '=>' )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1522:5: (lv_predicated_0_0= '=>' )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1523:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getAssignment_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAssignment4672); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1533:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1533:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1534:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1534:5: (lv_firstSetPredicated_1_0= '->' )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1535:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getAssignment_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssignment4726); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1545:3: ( (lv_feature_2_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1546:4: (lv_feature_2_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1546:4: (lv_feature_2_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1547:5: lv_feature_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getAssignment_FeatureIDTerminalRuleCall_1_0ElementType());
            				
            lv_feature_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment4772); 

            					doneLeaf(lv_feature_2_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1556:3: ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1557:4: ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1557:4: ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1558:5: (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1558:5: (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt45=1;
                }
                break;
            case 34:
                {
                alt45=2;
                }
                break;
            case 41:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1559:6: lv_operator_3_1= '+='
                    {

                    						markLeaf(elementTypeProvider.getAssignment_OperatorPlusSignEqualsSignKeyword_2_0_0ElementType());
                    					
                    lv_operator_3_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAssignment4818); 

                    						doneLeaf(lv_operator_3_1);
                    					

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1567:6: lv_operator_3_2= '='
                    {

                    						markLeaf(elementTypeProvider.getAssignment_OperatorEqualsSignKeyword_2_0_1ElementType());
                    					
                    lv_operator_3_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAssignment4852); 

                    						doneLeaf(lv_operator_3_2);
                    					

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1575:6: lv_operator_3_3= '?='
                    {

                    						markLeaf(elementTypeProvider.getAssignment_OperatorQuestionMarkEqualsSignKeyword_2_0_2ElementType());
                    					
                    lv_operator_3_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssignment4886); 

                    						doneLeaf(lv_operator_3_3);
                    					

                    }
                    break;

            }


            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1585:3: ( (lv_terminal_4_0= ruleAssignableTerminal ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1586:4: (lv_terminal_4_0= ruleAssignableTerminal )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1586:4: (lv_terminal_4_0= ruleAssignableTerminal )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1587:5: lv_terminal_4_0= ruleAssignableTerminal
            {

            					markComposite(elementTypeProvider.getAssignment_TerminalAssignableTerminalParserRuleCall_3_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_ruleAssignment4931);
            ruleAssignableTerminal();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssignableTerminal"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1600:1: entryRuleAssignableTerminal : ruleAssignableTerminal EOF ;
    public final void entryRuleAssignableTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1600:28: ( ruleAssignableTerminal EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1601:2: ruleAssignableTerminal EOF
            {
             markComposite(elementTypeProvider.getAssignableTerminalElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_entryRuleAssignableTerminal4962);
            ruleAssignableTerminal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignableTerminal4965); 

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
    // $ANTLR end "entryRuleAssignableTerminal"


    // $ANTLR start "ruleAssignableTerminal"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1606:1: ruleAssignableTerminal : ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference ) ;
    public final void ruleAssignableTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1606:23: ( ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1607:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1607:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference )
            int alt46=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt46=1;
                }
                break;
            case RULE_ID:
                {
                alt46=2;
                }
                break;
            case 15:
                {
                alt46=3;
                }
                break;
            case 25:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1608:3: ruleKeyword
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_KeywordParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleAssignableTerminal4982);
                    ruleKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1616:3: ruleRuleCall
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_RuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleAssignableTerminal5002);
                    ruleRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1624:3: ruleParenthesizedAssignableElement
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_ParenthesizedAssignableElementParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedAssignableElement_in_ruleAssignableTerminal5022);
                    ruleParenthesizedAssignableElement();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1632:3: ruleCrossReference
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_CrossReferenceParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleCrossReference_in_ruleAssignableTerminal5042);
                    ruleCrossReference();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


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
    // $ANTLR end "ruleAssignableTerminal"


    // $ANTLR start "entryRuleParenthesizedAssignableElement"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1643:1: entryRuleParenthesizedAssignableElement : ruleParenthesizedAssignableElement EOF ;
    public final void entryRuleParenthesizedAssignableElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1643:40: ( ruleParenthesizedAssignableElement EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1644:2: ruleParenthesizedAssignableElement EOF
            {
             markComposite(elementTypeProvider.getParenthesizedAssignableElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedAssignableElement_in_entryRuleParenthesizedAssignableElement5062);
            ruleParenthesizedAssignableElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedAssignableElement5065); 

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
    // $ANTLR end "entryRuleParenthesizedAssignableElement"


    // $ANTLR start "ruleParenthesizedAssignableElement"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1649:1: ruleParenthesizedAssignableElement : (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' ) ;
    public final void ruleParenthesizedAssignableElement() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1649:35: ( (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1650:2: (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1650:2: (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1651:3: otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')'
            {

            			markLeaf(elementTypeProvider.getParenthesizedAssignableElement_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedAssignableElement5084); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParenthesizedAssignableElement_AssignableAlternativesParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAssignableAlternatives_in_ruleParenthesizedAssignableElement5096);
            ruleAssignableAlternatives();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParenthesizedAssignableElement_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParenthesizedAssignableElement5110); 

            			doneLeaf(otherlv_2);
            		

            }


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
    // $ANTLR end "ruleParenthesizedAssignableElement"


    // $ANTLR start "entryRuleAssignableAlternatives"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1676:1: entryRuleAssignableAlternatives : ruleAssignableAlternatives EOF ;
    public final void entryRuleAssignableAlternatives() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1676:32: ( ruleAssignableAlternatives EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1677:2: ruleAssignableAlternatives EOF
            {
             markComposite(elementTypeProvider.getAssignableAlternativesElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignableAlternatives_in_entryRuleAssignableAlternatives5130);
            ruleAssignableAlternatives();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignableAlternatives5133); 

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
    // $ANTLR end "entryRuleAssignableAlternatives"


    // $ANTLR start "ruleAssignableAlternatives"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1682:1: ruleAssignableAlternatives : ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? ) ;
    public final void ruleAssignableAlternatives() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1682:27: ( ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1683:2: ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1683:2: ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1684:3: ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getAssignableAlternatives_AssignableTerminalParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives5150);
            ruleAssignableTerminal();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1691:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==29) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1692:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1692:4: ()
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1693:5: 
                    {

                    					precedeComposite(elementTypeProvider.getAssignableAlternatives_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1698:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==29) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1699:5: otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getAssignableAlternatives_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAssignableAlternatives5193); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1706:5: ( (lv_elements_3_0= ruleAssignableTerminal ) )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1707:6: (lv_elements_3_0= ruleAssignableTerminal )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1707:6: (lv_elements_3_0= ruleAssignableTerminal )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1708:7: lv_elements_3_0= ruleAssignableTerminal
                    	    {

                    	    							markComposite(elementTypeProvider.getAssignableAlternatives_ElementsAssignableTerminalParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives5230);
                    	    ruleAssignableTerminal();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);


                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleAssignableAlternatives"


    // $ANTLR start "entryRuleCrossReference"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1723:1: entryRuleCrossReference : ruleCrossReference EOF ;
    public final void entryRuleCrossReference() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1723:24: ( ruleCrossReference EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1724:2: ruleCrossReference EOF
            {
             markComposite(elementTypeProvider.getCrossReferenceElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleCrossReference_in_entryRuleCrossReference5278);
            ruleCrossReference();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCrossReference5281); 

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
    // $ANTLR end "entryRuleCrossReference"


    // $ANTLR start "ruleCrossReference"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1729:1: ruleCrossReference : (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) ;
    public final void ruleCrossReference() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1729:19: ( (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1730:2: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1730:2: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1731:3: otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']'
            {

            			markLeaf(elementTypeProvider.getCrossReference_LeftSquareBracketKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCrossReference5300); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1738:3: ( (lv_type_1_0= ruleTypeRef ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1739:4: (lv_type_1_0= ruleTypeRef )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1739:4: (lv_type_1_0= ruleTypeRef )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1740:5: lv_type_1_0= ruleTypeRef
            {

            					markComposite(elementTypeProvider.getCrossReference_TypeTypeRefParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleCrossReference5327);
            ruleTypeRef();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1749:3: (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==29) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1750:4: otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    {

                    				markLeaf(elementTypeProvider.getCrossReference_VerticalLineKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCrossReference5358); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1757:4: ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1758:5: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1758:5: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1759:6: lv_terminal_3_0= ruleCrossReferenceableTerminal
                    {

                    						markComposite(elementTypeProvider.getCrossReference_TerminalCrossReferenceableTerminalParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleCrossReferenceableTerminal_in_ruleCrossReference5390);
                    ruleCrossReferenceableTerminal();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getCrossReference_RightSquareBracketKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCrossReference5423); 

            			doneLeaf(otherlv_4);
            		

            }


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
    // $ANTLR end "ruleCrossReference"


    // $ANTLR start "entryRuleCrossReferenceableTerminal"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1780:1: entryRuleCrossReferenceableTerminal : ruleCrossReferenceableTerminal EOF ;
    public final void entryRuleCrossReferenceableTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1780:36: ( ruleCrossReferenceableTerminal EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1781:2: ruleCrossReferenceableTerminal EOF
            {
             markComposite(elementTypeProvider.getCrossReferenceableTerminalElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleCrossReferenceableTerminal_in_entryRuleCrossReferenceableTerminal5443);
            ruleCrossReferenceableTerminal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCrossReferenceableTerminal5446); 

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
    // $ANTLR end "entryRuleCrossReferenceableTerminal"


    // $ANTLR start "ruleCrossReferenceableTerminal"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1786:1: ruleCrossReferenceableTerminal : ( ruleKeyword | ruleRuleCall ) ;
    public final void ruleCrossReferenceableTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1786:31: ( ( ruleKeyword | ruleRuleCall ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1787:2: ( ruleKeyword | ruleRuleCall )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1787:2: ( ruleKeyword | ruleRuleCall )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_STRING) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_ID) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1788:3: ruleKeyword
                    {

                    			markComposite(elementTypeProvider.getCrossReferenceableTerminal_KeywordParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleCrossReferenceableTerminal5463);
                    ruleKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1796:3: ruleRuleCall
                    {

                    			markComposite(elementTypeProvider.getCrossReferenceableTerminal_RuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleCrossReferenceableTerminal5483);
                    ruleRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


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
    // $ANTLR end "ruleCrossReferenceableTerminal"


    // $ANTLR start "entryRuleParenthesizedElement"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1807:1: entryRuleParenthesizedElement : ruleParenthesizedElement EOF ;
    public final void entryRuleParenthesizedElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1807:30: ( ruleParenthesizedElement EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1808:2: ruleParenthesizedElement EOF
            {
             markComposite(elementTypeProvider.getParenthesizedElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement5503);
            ruleParenthesizedElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedElement5506); 

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
    // $ANTLR end "entryRuleParenthesizedElement"


    // $ANTLR start "ruleParenthesizedElement"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1813:1: ruleParenthesizedElement : (otherlv_0= '(' ruleAlternatives otherlv_2= ')' ) ;
    public final void ruleParenthesizedElement() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1813:25: ( (otherlv_0= '(' ruleAlternatives otherlv_2= ')' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1814:2: (otherlv_0= '(' ruleAlternatives otherlv_2= ')' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1814:2: (otherlv_0= '(' ruleAlternatives otherlv_2= ')' )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1815:3: otherlv_0= '(' ruleAlternatives otherlv_2= ')'
            {

            			markLeaf(elementTypeProvider.getParenthesizedElement_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedElement5525); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParenthesizedElement_AlternativesParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_ruleParenthesizedElement5537);
            ruleAlternatives();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParenthesizedElement_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParenthesizedElement5551); 

            			doneLeaf(otherlv_2);
            		

            }


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
    // $ANTLR end "ruleParenthesizedElement"


    // $ANTLR start "entryRulePredicatedGroup"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1840:1: entryRulePredicatedGroup : rulePredicatedGroup EOF ;
    public final void entryRulePredicatedGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1840:25: ( rulePredicatedGroup EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1841:2: rulePredicatedGroup EOF
            {
             markComposite(elementTypeProvider.getPredicatedGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicatedGroup_in_entryRulePredicatedGroup5571);
            rulePredicatedGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicatedGroup5574); 

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
    // $ANTLR end "entryRulePredicatedGroup"


    // $ANTLR start "rulePredicatedGroup"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1846:1: rulePredicatedGroup : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' ) ;
    public final void rulePredicatedGroup() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1846:20: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1847:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1847:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1848:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')'
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1848:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==39) ) {
                alt51=1;
            }
            else if ( (LA51_0==40) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1849:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1849:4: ( (lv_predicated_0_0= '=>' ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1850:5: (lv_predicated_0_0= '=>' )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1850:5: (lv_predicated_0_0= '=>' )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1851:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedGroup_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePredicatedGroup5614); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1861:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1861:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1862:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1862:5: (lv_firstSetPredicated_1_0= '->' )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1863:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedGroup_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePredicatedGroup5668); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getPredicatedGroup_LeftParenthesisKeyword_1ElementType());
            		
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePredicatedGroup5700); 

            			doneLeaf(otherlv_2);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1880:3: ( (lv_elements_3_0= ruleAlternatives ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1881:4: (lv_elements_3_0= ruleAlternatives )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1881:4: (lv_elements_3_0= ruleAlternatives )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1882:5: lv_elements_3_0= ruleAlternatives
            {

            					markComposite(elementTypeProvider.getPredicatedGroup_ElementsAlternativesParserRuleCall_2_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_rulePredicatedGroup5727);
            ruleAlternatives();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getPredicatedGroup_RightParenthesisKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePredicatedGroup5752); 

            			doneLeaf(otherlv_4);
            		

            }


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
    // $ANTLR end "rulePredicatedGroup"


    // $ANTLR start "entryRuleTerminalRule"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1902:1: entryRuleTerminalRule : ruleTerminalRule EOF ;
    public final void entryRuleTerminalRule() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1902:22: ( ruleTerminalRule EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1903:2: ruleTerminalRule EOF
            {
             markComposite(elementTypeProvider.getTerminalRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalRule_in_entryRuleTerminalRule5772);
            ruleTerminalRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalRule5775); 

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
    // $ANTLR end "entryRuleTerminalRule"


    // $ANTLR start "ruleTerminalRule"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1908:1: ruleTerminalRule : (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' ) ;
    public final void ruleTerminalRule() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_fragment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1908:17: ( (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1909:2: (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1909:2: (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1910:3: otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';'
            {

            			markLeaf(elementTypeProvider.getTerminalRule_TerminalKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleTerminalRule5794); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1917:3: ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==21) ) {
                alt53=1;
            }
            else if ( (LA53_0==RULE_ID) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1918:4: ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1918:4: ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1919:5: ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1919:5: ( (lv_fragment_1_0= 'fragment' ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1920:6: (lv_fragment_1_0= 'fragment' )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1920:6: (lv_fragment_1_0= 'fragment' )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1921:7: lv_fragment_1_0= 'fragment'
                    {

                    							markLeaf(elementTypeProvider.getTerminalRule_FragmentFragmentKeyword_1_0_0_0ElementType());
                    						
                    lv_fragment_1_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTerminalRule5838); 

                    							doneLeaf(lv_fragment_1_0);
                    						

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1930:5: ( (lv_name_2_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1931:6: (lv_name_2_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1931:6: (lv_name_2_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1932:7: lv_name_2_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getTerminalRule_NameIDTerminalRuleCall_1_0_1_0ElementType());
                    						
                    lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTerminalRule5890); 

                    							doneLeaf(lv_name_2_0);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1943:4: ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1943:4: ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1944:5: ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )?
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1944:5: ( (lv_name_3_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1945:6: (lv_name_3_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1945:6: (lv_name_3_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1946:7: lv_name_3_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getTerminalRule_NameIDTerminalRuleCall_1_1_0_0ElementType());
                    						
                    lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTerminalRule5961); 

                    							doneLeaf(lv_name_3_0);
                    						

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1955:5: (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==27) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1956:6: otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) )
                            {

                            						markLeaf(elementTypeProvider.getTerminalRule_ReturnsKeyword_1_1_1_0ElementType());
                            					
                            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTerminalRule6004); 

                            						doneLeaf(otherlv_4);
                            					
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1963:6: ( (lv_type_5_0= ruleTypeRef ) )
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1964:7: (lv_type_5_0= ruleTypeRef )
                            {
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1964:7: (lv_type_5_0= ruleTypeRef )
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1965:8: lv_type_5_0= ruleTypeRef
                            {

                            								markComposite(elementTypeProvider.getTerminalRule_TypeTypeRefParserRuleCall_1_1_1_1_0ElementType());
                            							
                            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleTerminalRule6046);
                            ruleTypeRef();

                            state._fsp--;


                            								doneComposite();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getTerminalRule_ColonKeyword_2ElementType());
            		
            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTerminalRule6096); 

            			doneLeaf(otherlv_6);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1984:3: ( (lv_alternatives_7_0= ruleTerminalAlternatives ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1985:4: (lv_alternatives_7_0= ruleTerminalAlternatives )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1985:4: (lv_alternatives_7_0= ruleTerminalAlternatives )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:1986:5: lv_alternatives_7_0= ruleTerminalAlternatives
            {

            					markComposite(elementTypeProvider.getTerminalRule_AlternativesTerminalAlternativesParserRuleCall_3_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTerminalAlternatives_in_ruleTerminalRule6123);
            ruleTerminalAlternatives();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getTerminalRule_SemicolonKeyword_4ElementType());
            		
            otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTerminalRule6148); 

            			doneLeaf(otherlv_8);
            		

            }


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
    // $ANTLR end "ruleTerminalRule"


    // $ANTLR start "entryRuleTerminalAlternatives"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2006:1: entryRuleTerminalAlternatives : ruleTerminalAlternatives EOF ;
    public final void entryRuleTerminalAlternatives() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2006:30: ( ruleTerminalAlternatives EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2007:2: ruleTerminalAlternatives EOF
            {
             markComposite(elementTypeProvider.getTerminalAlternativesElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalAlternatives_in_entryRuleTerminalAlternatives6168);
            ruleTerminalAlternatives();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalAlternatives6171); 

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
    // $ANTLR end "entryRuleTerminalAlternatives"


    // $ANTLR start "ruleTerminalAlternatives"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2012:1: ruleTerminalAlternatives : ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? ) ;
    public final void ruleTerminalAlternatives() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2012:25: ( ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2013:2: ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2013:2: ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2014:3: ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getTerminalAlternatives_TerminalGroupParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives6188);
            ruleTerminalGroup();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2021:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==29) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2022:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2022:4: ()
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2023:5: 
                    {

                    					precedeComposite(elementTypeProvider.getTerminalAlternatives_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2028:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+
                    int cnt54=0;
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==29) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2029:5: otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getTerminalAlternatives_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTerminalAlternatives6231); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2036:5: ( (lv_elements_3_0= ruleTerminalGroup ) )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2037:6: (lv_elements_3_0= ruleTerminalGroup )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2037:6: (lv_elements_3_0= ruleTerminalGroup )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2038:7: lv_elements_3_0= ruleTerminalGroup
                    	    {

                    	    							markComposite(elementTypeProvider.getTerminalAlternatives_ElementsTerminalGroupParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives6268);
                    	    ruleTerminalGroup();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt54 >= 1 ) break loop54;
                                EarlyExitException eee =
                                    new EarlyExitException(54, input);
                                throw eee;
                        }
                        cnt54++;
                    } while (true);


                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleTerminalAlternatives"


    // $ANTLR start "entryRuleTerminalGroup"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2053:1: entryRuleTerminalGroup : ruleTerminalGroup EOF ;
    public final void entryRuleTerminalGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2053:23: ( ruleTerminalGroup EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2054:2: ruleTerminalGroup EOF
            {
             markComposite(elementTypeProvider.getTerminalGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalGroup_in_entryRuleTerminalGroup6316);
            ruleTerminalGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalGroup6319); 

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
    // $ANTLR end "entryRuleTerminalGroup"


    // $ANTLR start "ruleTerminalGroup"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2059:1: ruleTerminalGroup : ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? ) ;
    public final void ruleTerminalGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2059:18: ( ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2060:2: ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2060:2: ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2061:3: ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )?
            {

            			markComposite(elementTypeProvider.getTerminalGroup_TerminalTokenParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerminalToken_in_ruleTerminalGroup6336);
            ruleTerminalToken();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2068:3: ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||LA57_0==15||LA57_0==17||LA57_0==38||LA57_0==40||LA57_0==43) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2069:4: () ( (lv_elements_2_0= ruleTerminalToken ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2069:4: ()
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2070:5: 
                    {

                    					precedeComposite(elementTypeProvider.getTerminalGroup_GroupElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2075:4: ( (lv_elements_2_0= ruleTerminalToken ) )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_STRING)||LA56_0==15||LA56_0==17||LA56_0==38||LA56_0==40||LA56_0==43) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2076:5: (lv_elements_2_0= ruleTerminalToken )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2076:5: (lv_elements_2_0= ruleTerminalToken )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2077:6: lv_elements_2_0= ruleTerminalToken
                    	    {

                    	    						markComposite(elementTypeProvider.getTerminalGroup_ElementsTerminalTokenParserRuleCall_1_1_0ElementType());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_ruleTerminalToken_in_ruleTerminalGroup6387);
                    	    ruleTerminalToken();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt56 >= 1 ) break loop56;
                                EarlyExitException eee =
                                    new EarlyExitException(56, input);
                                throw eee;
                        }
                        cnt56++;
                    } while (true);


                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleTerminalGroup"


    // $ANTLR start "entryRuleTerminalToken"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2091:1: entryRuleTerminalToken : ruleTerminalToken EOF ;
    public final void entryRuleTerminalToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2091:23: ( ruleTerminalToken EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2092:2: ruleTerminalToken EOF
            {
             markComposite(elementTypeProvider.getTerminalTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalToken_in_entryRuleTerminalToken6427);
            ruleTerminalToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalToken6430); 

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
    // $ANTLR end "entryRuleTerminalToken"


    // $ANTLR start "ruleTerminalToken"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2097:1: ruleTerminalToken : ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) ;
    public final void ruleTerminalToken() throws RecognitionException {
        Token lv_cardinality_1_1=null;
        Token lv_cardinality_1_2=null;
        Token lv_cardinality_1_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2097:18: ( ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2098:2: ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2098:2: ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2099:3: ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            {

            			markComposite(elementTypeProvider.getTerminalToken_TerminalTokenElementParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_ruleTerminalToken6447);
            ruleTerminalTokenElement();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2106:3: ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==22||(LA59_0>=31 && LA59_0<=32)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2107:4: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2107:4: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2108:5: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2108:5: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    int alt58=3;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt58=1;
                        }
                        break;
                    case 22:
                        {
                        alt58=2;
                        }
                        break;
                    case 32:
                        {
                        alt58=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }

                    switch (alt58) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2109:6: lv_cardinality_1_1= '?'
                            {

                            						markLeaf(elementTypeProvider.getTerminalToken_CardinalityQuestionMarkKeyword_1_0_0ElementType());
                            					
                            lv_cardinality_1_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTerminalToken6482); 

                            						doneLeaf(lv_cardinality_1_1);
                            					

                            }
                            break;
                        case 2 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2117:6: lv_cardinality_1_2= '*'
                            {

                            						markLeaf(elementTypeProvider.getTerminalToken_CardinalityAsteriskKeyword_1_0_1ElementType());
                            					
                            lv_cardinality_1_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTerminalToken6516); 

                            						doneLeaf(lv_cardinality_1_2);
                            					

                            }
                            break;
                        case 3 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2125:6: lv_cardinality_1_3= '+'
                            {

                            						markLeaf(elementTypeProvider.getTerminalToken_CardinalityPlusSignKeyword_1_0_2ElementType());
                            					
                            lv_cardinality_1_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTerminalToken6550); 

                            						doneLeaf(lv_cardinality_1_3);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleTerminalToken"


    // $ANTLR start "entryRuleTerminalTokenElement"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2139:1: entryRuleTerminalTokenElement : ruleTerminalTokenElement EOF ;
    public final void entryRuleTerminalTokenElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2139:30: ( ruleTerminalTokenElement EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2140:2: ruleTerminalTokenElement EOF
            {
             markComposite(elementTypeProvider.getTerminalTokenElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_entryRuleTerminalTokenElement6589);
            ruleTerminalTokenElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalTokenElement6592); 

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
    // $ANTLR end "entryRuleTerminalTokenElement"


    // $ANTLR start "ruleTerminalTokenElement"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2145:1: ruleTerminalTokenElement : ( ruleCharacterRange | ruleTerminalRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF ) ;
    public final void ruleTerminalTokenElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2145:25: ( ( ruleCharacterRange | ruleTerminalRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2146:2: ( ruleCharacterRange | ruleTerminalRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2146:2: ( ruleCharacterRange | ruleTerminalRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF )
            int alt60=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt60=1;
                }
                break;
            case RULE_ID:
                {
                alt60=2;
                }
                break;
            case 15:
                {
                alt60=3;
                }
                break;
            case 38:
            case 40:
                {
                alt60=4;
                }
                break;
            case 17:
                {
                alt60=5;
                }
                break;
            case 43:
                {
                alt60=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2147:3: ruleCharacterRange
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_CharacterRangeParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleCharacterRange_in_ruleTerminalTokenElement6609);
                    ruleCharacterRange();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2155:3: ruleTerminalRuleCall
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_TerminalRuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleTerminalRuleCall_in_ruleTerminalTokenElement6629);
                    ruleTerminalRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2163:3: ruleParenthesizedTerminalElement
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_ParenthesizedTerminalElementParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedTerminalElement_in_ruleTerminalTokenElement6649);
                    ruleParenthesizedTerminalElement();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2171:3: ruleAbstractNegatedToken
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_AbstractNegatedTokenParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNegatedToken_in_ruleTerminalTokenElement6669);
                    ruleAbstractNegatedToken();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 5 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2179:3: ruleWildcard
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_WildcardParserRuleCall_4ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleWildcard_in_ruleTerminalTokenElement6689);
                    ruleWildcard();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 6 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2187:3: ruleEOF
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_EOFParserRuleCall_5ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleEOF_in_ruleTerminalTokenElement6709);
                    ruleEOF();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


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
    // $ANTLR end "ruleTerminalTokenElement"


    // $ANTLR start "entryRuleParenthesizedTerminalElement"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2198:1: entryRuleParenthesizedTerminalElement : ruleParenthesizedTerminalElement EOF ;
    public final void entryRuleParenthesizedTerminalElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2198:38: ( ruleParenthesizedTerminalElement EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2199:2: ruleParenthesizedTerminalElement EOF
            {
             markComposite(elementTypeProvider.getParenthesizedTerminalElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedTerminalElement_in_entryRuleParenthesizedTerminalElement6729);
            ruleParenthesizedTerminalElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedTerminalElement6732); 

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
    // $ANTLR end "entryRuleParenthesizedTerminalElement"


    // $ANTLR start "ruleParenthesizedTerminalElement"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2204:1: ruleParenthesizedTerminalElement : (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' ) ;
    public final void ruleParenthesizedTerminalElement() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2204:33: ( (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2205:2: (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2205:2: (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2206:3: otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')'
            {

            			markLeaf(elementTypeProvider.getParenthesizedTerminalElement_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedTerminalElement6751); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParenthesizedTerminalElement_TerminalAlternativesParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerminalAlternatives_in_ruleParenthesizedTerminalElement6763);
            ruleTerminalAlternatives();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParenthesizedTerminalElement_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParenthesizedTerminalElement6777); 

            			doneLeaf(otherlv_2);
            		

            }


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
    // $ANTLR end "ruleParenthesizedTerminalElement"


    // $ANTLR start "entryRuleAbstractNegatedToken"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2231:1: entryRuleAbstractNegatedToken : ruleAbstractNegatedToken EOF ;
    public final void entryRuleAbstractNegatedToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2231:30: ( ruleAbstractNegatedToken EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2232:2: ruleAbstractNegatedToken EOF
            {
             markComposite(elementTypeProvider.getAbstractNegatedTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNegatedToken_in_entryRuleAbstractNegatedToken6797);
            ruleAbstractNegatedToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNegatedToken6800); 

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
    // $ANTLR end "entryRuleAbstractNegatedToken"


    // $ANTLR start "ruleAbstractNegatedToken"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2237:1: ruleAbstractNegatedToken : ( ruleNegatedToken | ruleUntilToken ) ;
    public final void ruleAbstractNegatedToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2237:25: ( ( ruleNegatedToken | ruleUntilToken ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2238:2: ( ruleNegatedToken | ruleUntilToken )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2238:2: ( ruleNegatedToken | ruleUntilToken )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==38) ) {
                alt61=1;
            }
            else if ( (LA61_0==40) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2239:3: ruleNegatedToken
                    {

                    			markComposite(elementTypeProvider.getAbstractNegatedToken_NegatedTokenParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleNegatedToken_in_ruleAbstractNegatedToken6817);
                    ruleNegatedToken();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2247:3: ruleUntilToken
                    {

                    			markComposite(elementTypeProvider.getAbstractNegatedToken_UntilTokenParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleUntilToken_in_ruleAbstractNegatedToken6837);
                    ruleUntilToken();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


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
    // $ANTLR end "ruleAbstractNegatedToken"


    // $ANTLR start "entryRuleNegatedToken"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2258:1: entryRuleNegatedToken : ruleNegatedToken EOF ;
    public final void entryRuleNegatedToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2258:22: ( ruleNegatedToken EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2259:2: ruleNegatedToken EOF
            {
             markComposite(elementTypeProvider.getNegatedTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNegatedToken_in_entryRuleNegatedToken6857);
            ruleNegatedToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegatedToken6860); 

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
    // $ANTLR end "entryRuleNegatedToken"


    // $ANTLR start "ruleNegatedToken"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2264:1: ruleNegatedToken : (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final void ruleNegatedToken() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2264:17: ( (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2265:2: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2265:2: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2266:3: otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {

            			markLeaf(elementTypeProvider.getNegatedToken_ExclamationMarkKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleNegatedToken6879); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2273:3: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2274:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2274:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2275:5: lv_terminal_1_0= ruleTerminalTokenElement
            {

            					markComposite(elementTypeProvider.getNegatedToken_TerminalTerminalTokenElementParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_ruleNegatedToken6906);
            ruleTerminalTokenElement();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


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
    // $ANTLR end "ruleNegatedToken"


    // $ANTLR start "entryRuleUntilToken"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2288:1: entryRuleUntilToken : ruleUntilToken EOF ;
    public final void entryRuleUntilToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2288:20: ( ruleUntilToken EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2289:2: ruleUntilToken EOF
            {
             markComposite(elementTypeProvider.getUntilTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleUntilToken_in_entryRuleUntilToken6937);
            ruleUntilToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUntilToken6940); 

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
    // $ANTLR end "entryRuleUntilToken"


    // $ANTLR start "ruleUntilToken"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2294:1: ruleUntilToken : (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final void ruleUntilToken() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2294:15: ( (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2295:2: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2295:2: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2296:3: otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {

            			markLeaf(elementTypeProvider.getUntilToken_HyphenMinusGreaterThanSignKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleUntilToken6959); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2303:3: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2304:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2304:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2305:5: lv_terminal_1_0= ruleTerminalTokenElement
            {

            					markComposite(elementTypeProvider.getUntilToken_TerminalTerminalTokenElementParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_ruleUntilToken6986);
            ruleTerminalTokenElement();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


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
    // $ANTLR end "ruleUntilToken"


    // $ANTLR start "entryRuleWildcard"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2318:1: entryRuleWildcard : ruleWildcard EOF ;
    public final void entryRuleWildcard() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2318:18: ( ruleWildcard EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2319:2: ruleWildcard EOF
            {
             markComposite(elementTypeProvider.getWildcardElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleWildcard_in_entryRuleWildcard7017);
            ruleWildcard();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWildcard7020); 

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
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2324:1: ruleWildcard : ( () otherlv_1= '.' ) ;
    public final void ruleWildcard() throws RecognitionException {
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2324:13: ( ( () otherlv_1= '.' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2325:2: ( () otherlv_1= '.' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2325:2: ( () otherlv_1= '.' )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2326:3: () otherlv_1= '.'
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2326:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2327:4: 
            {

            				precedeComposite(elementTypeProvider.getWildcard_WildcardAction_0ElementType());
            				doneComposite();
            			

            }


            			markLeaf(elementTypeProvider.getWildcard_FullStopKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWildcard7052); 

            			doneLeaf(otherlv_1);
            		

            }


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
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleEOF"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2343:1: entryRuleEOF : ruleEOF EOF ;
    public final void entryRuleEOF() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2343:13: ( ruleEOF EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2344:2: ruleEOF EOF
            {
             markComposite(elementTypeProvider.getEOFElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleEOF_in_entryRuleEOF7072);
            ruleEOF();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEOF7075); 

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
    // $ANTLR end "entryRuleEOF"


    // $ANTLR start "ruleEOF"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2349:1: ruleEOF : ( () otherlv_1= 'EOF' ) ;
    public final void ruleEOF() throws RecognitionException {
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2349:8: ( ( () otherlv_1= 'EOF' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2350:2: ( () otherlv_1= 'EOF' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2350:2: ( () otherlv_1= 'EOF' )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2351:3: () otherlv_1= 'EOF'
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2351:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2352:4: 
            {

            				precedeComposite(elementTypeProvider.getEOF_EOFAction_0ElementType());
            				doneComposite();
            			

            }


            			markLeaf(elementTypeProvider.getEOF_EOFKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEOF7107); 

            			doneLeaf(otherlv_1);
            		

            }


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
    // $ANTLR end "ruleEOF"


    // $ANTLR start "entryRuleCharacterRange"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2368:1: entryRuleCharacterRange : ruleCharacterRange EOF ;
    public final void entryRuleCharacterRange() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2368:24: ( ruleCharacterRange EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2369:2: ruleCharacterRange EOF
            {
             markComposite(elementTypeProvider.getCharacterRangeElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleCharacterRange_in_entryRuleCharacterRange7127);
            ruleCharacterRange();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCharacterRange7130); 

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
    // $ANTLR end "entryRuleCharacterRange"


    // $ANTLR start "ruleCharacterRange"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2374:1: ruleCharacterRange : ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) ;
    public final void ruleCharacterRange() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2374:19: ( ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2375:2: ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2375:2: ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2376:3: ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            {

            			markComposite(elementTypeProvider.getCharacterRange_KeywordParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleCharacterRange7147);
            ruleKeyword();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2383:3: ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==44) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2384:4: () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2384:4: ()
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2385:5: 
                    {

                    					precedeComposite(elementTypeProvider.getCharacterRange_CharacterRangeLeftAction_1_0ElementType());
                    					doneComposite();
                    				

                    }


                    				markLeaf(elementTypeProvider.getCharacterRange_FullStopFullStopKeyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleCharacterRange7183); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2397:4: ( (lv_right_3_0= ruleKeyword ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2398:5: (lv_right_3_0= ruleKeyword )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2398:5: (lv_right_3_0= ruleKeyword )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2399:6: lv_right_3_0= ruleKeyword
                    {

                    						markComposite(elementTypeProvider.getCharacterRange_RightKeywordParserRuleCall_1_2_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleCharacterRange7215);
                    ruleKeyword();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleCharacterRange"


    // $ANTLR start "entryRuleEnumRule"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2413:1: entryRuleEnumRule : ruleEnumRule EOF ;
    public final void entryRuleEnumRule() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2413:18: ( ruleEnumRule EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2414:2: ruleEnumRule EOF
            {
             markComposite(elementTypeProvider.getEnumRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumRule_in_entryRuleEnumRule7254);
            ruleEnumRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumRule7257); 

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
    // $ANTLR end "entryRuleEnumRule"


    // $ANTLR start "ruleEnumRule"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2419:1: ruleEnumRule : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' ) ;
    public final void ruleEnumRule() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2419:13: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2420:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2420:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2421:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';'
            {

            			markLeaf(elementTypeProvider.getEnumRule_EnumKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEnumRule7276); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2428:3: ( (lv_name_1_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2429:4: (lv_name_1_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2429:4: (lv_name_1_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2430:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getEnumRule_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumRule7303); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2439:3: (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==27) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2440:4: otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) )
                    {

                    				markLeaf(elementTypeProvider.getEnumRule_ReturnsKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEnumRule7334); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2447:4: ( (lv_type_3_0= ruleTypeRef ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2448:5: (lv_type_3_0= ruleTypeRef )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2448:5: (lv_type_3_0= ruleTypeRef )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2449:6: lv_type_3_0= ruleTypeRef
                    {

                    						markComposite(elementTypeProvider.getEnumRule_TypeTypeRefParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleEnumRule7366);
                    ruleTypeRef();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getEnumRule_ColonKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEnumRule7399); 

            			doneLeaf(otherlv_4);
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2466:3: ( (lv_alternatives_5_0= ruleEnumLiterals ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2467:4: (lv_alternatives_5_0= ruleEnumLiterals )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2467:4: (lv_alternatives_5_0= ruleEnumLiterals )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2468:5: lv_alternatives_5_0= ruleEnumLiterals
            {

            					markComposite(elementTypeProvider.getEnumRule_AlternativesEnumLiteralsParserRuleCall_4_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiterals_in_ruleEnumRule7426);
            ruleEnumLiterals();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEnumRule_SemicolonKeyword_5ElementType());
            		
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEnumRule7451); 

            			doneLeaf(otherlv_6);
            		

            }


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
    // $ANTLR end "ruleEnumRule"


    // $ANTLR start "entryRuleEnumLiterals"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2488:1: entryRuleEnumLiterals : ruleEnumLiterals EOF ;
    public final void entryRuleEnumLiterals() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2488:22: ( ruleEnumLiterals EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2489:2: ruleEnumLiterals EOF
            {
             markComposite(elementTypeProvider.getEnumLiteralsElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiterals_in_entryRuleEnumLiterals7471);
            ruleEnumLiterals();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumLiterals7474); 

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
    // $ANTLR end "entryRuleEnumLiterals"


    // $ANTLR start "ruleEnumLiterals"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2494:1: ruleEnumLiterals : ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) ;
    public final void ruleEnumLiterals() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2494:17: ( ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2495:2: ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2495:2: ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2496:3: ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getEnumLiterals_EnumLiteralDeclarationParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals7491);
            ruleEnumLiteralDeclaration();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2503:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==29) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2504:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2504:4: ()
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2505:5: 
                    {

                    					precedeComposite(elementTypeProvider.getEnumLiterals_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2510:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==29) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2511:5: otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getEnumLiterals_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEnumLiterals7534); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2518:5: ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2519:6: (lv_elements_3_0= ruleEnumLiteralDeclaration )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2519:6: (lv_elements_3_0= ruleEnumLiteralDeclaration )
                    	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2520:7: lv_elements_3_0= ruleEnumLiteralDeclaration
                    	    {

                    	    							markComposite(elementTypeProvider.getEnumLiterals_ElementsEnumLiteralDeclarationParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals7571);
                    	    ruleEnumLiteralDeclaration();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt64 >= 1 ) break loop64;
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);


                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleEnumLiterals"


    // $ANTLR start "entryRuleEnumLiteralDeclaration"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2535:1: entryRuleEnumLiteralDeclaration : ruleEnumLiteralDeclaration EOF ;
    public final void entryRuleEnumLiteralDeclaration() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2535:32: ( ruleEnumLiteralDeclaration EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2536:2: ruleEnumLiteralDeclaration EOF
            {
             markComposite(elementTypeProvider.getEnumLiteralDeclarationElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDeclaration_in_entryRuleEnumLiteralDeclaration7619);
            ruleEnumLiteralDeclaration();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumLiteralDeclaration7622); 

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
    // $ANTLR end "entryRuleEnumLiteralDeclaration"


    // $ANTLR start "ruleEnumLiteralDeclaration"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2541:1: ruleEnumLiteralDeclaration : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) ;
    public final void ruleEnumLiteralDeclaration() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2541:27: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2542:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2542:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2543:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2543:3: ( (otherlv_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2544:4: (otherlv_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2544:4: (otherlv_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2545:5: otherlv_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getEnumLiteralDeclaration_EnumLiteralEEnumLiteralCrossReference_0_0ElementType());
            				
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumLiteralDeclaration7654); 

            					doneLeaf(otherlv_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2554:3: (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==34) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2555:4: otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) )
                    {

                    				markLeaf(elementTypeProvider.getEnumLiteralDeclaration_EqualsSignKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEnumLiteralDeclaration7685); 

                    				doneLeaf(otherlv_1);
                    			
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2562:4: ( (lv_literal_2_0= ruleKeyword ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2563:5: (lv_literal_2_0= ruleKeyword )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2563:5: (lv_literal_2_0= ruleKeyword )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtextGrammarTestLanguage.g:2564:6: lv_literal_2_0= ruleKeyword
                    {

                    						markComposite(elementTypeProvider.getEnumLiteralDeclaration_LiteralKeywordParserRuleCall_1_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleEnumLiteralDeclaration7717);
                    ruleKeyword();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleEnumLiteralDeclaration"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGrammar_in_entryRuleGrammar54 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrammar57 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleGrammar76 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleGrammarID_in_ruleGrammar103 = new BitSet(new long[]{0x0000240000345010L});
        public static final BitSet FOLLOW_12_in_ruleGrammar134 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleGrammarID_in_ruleGrammar164 = new BitSet(new long[]{0x0000240000347010L});
        public static final BitSet FOLLOW_13_in_ruleGrammar201 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleGrammarID_in_ruleGrammar236 = new BitSet(new long[]{0x0000240000347010L});
        public static final BitSet FOLLOW_ruleHiddenClause_in_ruleGrammar282 = new BitSet(new long[]{0x0000240000345010L});
        public static final BitSet FOLLOW_ruleAbstractMetamodelDeclaration_in_ruleGrammar315 = new BitSet(new long[]{0x0000240000345010L});
        public static final BitSet FOLLOW_ruleAbstractRule_in_ruleGrammar354 = new BitSet(new long[]{0x0000240000345012L});
        public static final BitSet FOLLOW_ruleHiddenClause_in_entryRuleHiddenClause386 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHiddenClause389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleHiddenClause421 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleHiddenClause446 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleHiddenClause481 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleHiddenClause518 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleHiddenClause555 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_ruleHiddenClause597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGrammarID_in_entryRuleGrammarID617 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrammarID620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGrammarID639 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleGrammarID659 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGrammarID676 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleAbstractRule_in_entryRuleAbstractRule702 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractRule705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParserRule_in_ruleAbstractRule722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalRule_in_ruleAbstractRule742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumRule_in_ruleAbstractRule762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractMetamodelDeclaration_in_entryRuleAbstractMetamodelDeclaration782 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractMetamodelDeclaration785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneratedMetamodel_in_ruleAbstractMetamodelDeclaration802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferencedMetamodel_in_ruleAbstractMetamodelDeclaration822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneratedMetamodel_in_entryRuleGeneratedMetamodel842 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGeneratedMetamodel845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleGeneratedMetamodel864 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGeneratedMetamodel891 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleGeneratedMetamodel929 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleGeneratedMetamodel960 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGeneratedMetamodel992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferencedMetamodel_in_entryRuleReferencedMetamodel1031 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferencedMetamodel1034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleReferencedMetamodel1053 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleReferencedMetamodel1080 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleReferencedMetamodel1111 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleReferencedMetamodel1143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParserRule_in_entryRuleParserRule1182 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParserRule1185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleParserRule1234 = new BitSet(new long[]{0x0000000000200010L});
        public static final BitSet FOLLOW_ruleRuleNameAndParams_in_ruleParserRule1267 = new BitSet(new long[]{0x0000000008C04000L});
        public static final BitSet FOLLOW_22_in_ruleParserRule1314 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_ruleReturnsClause_in_ruleParserRule1372 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_ruleRuleNameAndParams_in_ruleParserRule1425 = new BitSet(new long[]{0x0000000008804000L});
        public static final BitSet FOLLOW_ruleReturnsClause_in_ruleParserRule1451 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_ruleHiddenClause_in_ruleParserRule1488 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleParserRule1508 = new BitSet(new long[]{0x0000018202008030L});
        public static final BitSet FOLLOW_ruleAlternatives_in_ruleParserRule1535 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleParserRule1560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleNameAndParams_in_entryRuleRuleNameAndParams1580 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRuleNameAndParams1583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRuleNameAndParams1615 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleRuleNameAndParams1646 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleRuleNameAndParams1687 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_13_in_ruleRuleNameAndParams1730 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleRuleNameAndParams1772 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_26_in_ruleRuleNameAndParams1821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReturnsClause_in_entryRuleReturnsClause1847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReturnsClause1850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleReturnsClause1869 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleReturnsClause1896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1927 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter1930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef1980 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef1983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeRef2023 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleTypeRef2053 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeRef2086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives2117 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives2120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionalBranch_in_ruleAlternatives2137 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleAlternatives2180 = new BitSet(new long[]{0x0000018202008030L});
        public static final BitSet FOLLOW_ruleConditionalBranch_in_ruleAlternatives2217 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleConditionalBranch_in_entryRuleConditionalBranch2265 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditionalBranch2268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroup_in_ruleConditionalBranch2285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleConditionalBranch2329 = new BitSet(new long[]{0x0000004100000000L});
        public static final BitSet FOLLOW_ruleInverseLiteralValue_in_ruleConditionalBranch2361 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConditionalBranch2406 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleConditionalBranch2436 = new BitSet(new long[]{0x0000018200008030L});
        public static final BitSet FOLLOW_ruleUnorderedGroup_in_ruleConditionalBranch2468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroup_in_entryRuleUnorderedGroup2506 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedGroup2509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleUnorderedGroup2526 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleUnorderedGroup2569 = new BitSet(new long[]{0x0000018200008030L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleUnorderedGroup2606 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup2654 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup2657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractToken_in_ruleGroup2674 = new BitSet(new long[]{0x0000018200008032L});
        public static final BitSet FOLLOW_ruleAbstractToken_in_ruleGroup2725 = new BitSet(new long[]{0x0000018200008032L});
        public static final BitSet FOLLOW_ruleAbstractToken_in_entryRuleAbstractToken2765 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractToken2768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractTokenWithCardinality_in_ruleAbstractToken2785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_ruleAbstractToken2805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractTokenWithCardinality_in_entryRuleAbstractTokenWithCardinality2825 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractTokenWithCardinality2828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleAbstractTokenWithCardinality2851 = new BitSet(new long[]{0x0000000180400002L});
        public static final BitSet FOLLOW_ruleAbstractTerminal_in_ruleAbstractTokenWithCardinality2875 = new BitSet(new long[]{0x0000000180400002L});
        public static final BitSet FOLLOW_31_in_ruleAbstractTokenWithCardinality2915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAbstractTokenWithCardinality2949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleAbstractTokenWithCardinality2983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction3022 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction3025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleAction3044 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleAction3071 = new BitSet(new long[]{0x0000002000020000L});
        public static final BitSet FOLLOW_17_in_ruleAction3102 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAction3134 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_34_in_ruleAction3188 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_35_in_ruleAction3226 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleAction3264 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleAction3284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractTerminal_in_entryRuleAbstractTerminal3304 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractTerminal3307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleAbstractTerminal3324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleAbstractTerminal3344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedElement_in_ruleAbstractTerminal3364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedKeyword_in_ruleAbstractTerminal3384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedRuleCall_in_ruleAbstractTerminal3404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedGroup_in_ruleAbstractTerminal3424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_entryRuleKeyword3444 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyword3447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleKeyword3472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_entryRuleRuleCall3497 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRuleCall3500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleID_in_ruleRuleCall3543 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleRuleCall3574 = new BitSet(new long[]{0x0000004100000010L});
        public static final BitSet FOLLOW_ruleNamedArgument_in_ruleRuleCall3606 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_13_in_ruleRuleCall3643 = new BitSet(new long[]{0x0000004100000010L});
        public static final BitSet FOLLOW_ruleNamedArgument_in_ruleRuleCall3680 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_26_in_ruleRuleCall3719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue3745 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue3748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleLiteralValue3767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleLiteralValue3789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInverseLiteralValue_in_entryRuleInverseLiteralValue3809 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInverseLiteralValue3812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralValue_in_ruleInverseLiteralValue3824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedArgument_in_entryRuleNamedArgument3840 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedArgument3843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralValue_in_ruleNamedArgument3905 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedArgument3958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedArgument4029 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleNamedArgument4064 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedArgument4101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalRuleCall_in_entryRuleTerminalRuleCall4147 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalRuleCall4150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleID_in_ruleTerminalRuleCall4173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleID_in_entryRuleRuleID4198 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRuleID4201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRuleID4220 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleRuleID4240 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRuleID4257 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rulePredicatedKeyword_in_entryRulePredicatedKeyword4283 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicatedKeyword4286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rulePredicatedKeyword4326 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_40_in_rulePredicatedKeyword4380 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePredicatedKeyword4425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedRuleCall_in_entryRulePredicatedRuleCall4456 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicatedRuleCall4459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rulePredicatedRuleCall4499 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_40_in_rulePredicatedRuleCall4553 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePredicatedRuleCall4598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment4629 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment4632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleAssignment4672 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_40_in_ruleAssignment4726 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment4772 = new BitSet(new long[]{0x0000020C00000000L});
        public static final BitSet FOLLOW_35_in_ruleAssignment4818 = new BitSet(new long[]{0x0000000002008030L});
        public static final BitSet FOLLOW_34_in_ruleAssignment4852 = new BitSet(new long[]{0x0000000002008030L});
        public static final BitSet FOLLOW_41_in_ruleAssignment4886 = new BitSet(new long[]{0x0000000002008030L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_ruleAssignment4931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_entryRuleAssignableTerminal4962 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignableTerminal4965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleAssignableTerminal4982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleAssignableTerminal5002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedAssignableElement_in_ruleAssignableTerminal5022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCrossReference_in_ruleAssignableTerminal5042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedAssignableElement_in_entryRuleParenthesizedAssignableElement5062 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedAssignableElement5065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedAssignableElement5084 = new BitSet(new long[]{0x0000000002008030L});
        public static final BitSet FOLLOW_ruleAssignableAlternatives_in_ruleParenthesizedAssignableElement5096 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParenthesizedAssignableElement5110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignableAlternatives_in_entryRuleAssignableAlternatives5130 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignableAlternatives5133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives5150 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleAssignableAlternatives5193 = new BitSet(new long[]{0x0000000002008030L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives5230 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleCrossReference_in_entryRuleCrossReference5278 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCrossReference5281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleCrossReference5300 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleCrossReference5327 = new BitSet(new long[]{0x0000000024000000L});
        public static final BitSet FOLLOW_29_in_ruleCrossReference5358 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleCrossReferenceableTerminal_in_ruleCrossReference5390 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleCrossReference5423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCrossReferenceableTerminal_in_entryRuleCrossReferenceableTerminal5443 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCrossReferenceableTerminal5446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleCrossReferenceableTerminal5463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleCrossReferenceableTerminal5483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement5503 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedElement5506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedElement5525 = new BitSet(new long[]{0x0000018202008030L});
        public static final BitSet FOLLOW_ruleAlternatives_in_ruleParenthesizedElement5537 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParenthesizedElement5551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedGroup_in_entryRulePredicatedGroup5571 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicatedGroup5574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rulePredicatedGroup5614 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_40_in_rulePredicatedGroup5668 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePredicatedGroup5700 = new BitSet(new long[]{0x0000018202008030L});
        public static final BitSet FOLLOW_ruleAlternatives_in_rulePredicatedGroup5727 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePredicatedGroup5752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalRule_in_entryRuleTerminalRule5772 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalRule5775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleTerminalRule5794 = new BitSet(new long[]{0x0000000000200010L});
        public static final BitSet FOLLOW_21_in_ruleTerminalRule5838 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalRule5890 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalRule5961 = new BitSet(new long[]{0x0000000008800000L});
        public static final BitSet FOLLOW_27_in_ruleTerminalRule6004 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleTerminalRule6046 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleTerminalRule6096 = new BitSet(new long[]{0x0000094000028030L});
        public static final BitSet FOLLOW_ruleTerminalAlternatives_in_ruleTerminalRule6123 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTerminalRule6148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalAlternatives_in_entryRuleTerminalAlternatives6168 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalAlternatives6171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives6188 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleTerminalAlternatives6231 = new BitSet(new long[]{0x0000094000028030L});
        public static final BitSet FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives6268 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleTerminalGroup_in_entryRuleTerminalGroup6316 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalGroup6319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalToken_in_ruleTerminalGroup6336 = new BitSet(new long[]{0x0000094000028032L});
        public static final BitSet FOLLOW_ruleTerminalToken_in_ruleTerminalGroup6387 = new BitSet(new long[]{0x0000094000028032L});
        public static final BitSet FOLLOW_ruleTerminalToken_in_entryRuleTerminalToken6427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalToken6430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_ruleTerminalToken6447 = new BitSet(new long[]{0x0000000180400002L});
        public static final BitSet FOLLOW_31_in_ruleTerminalToken6482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleTerminalToken6516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleTerminalToken6550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_entryRuleTerminalTokenElement6589 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalTokenElement6592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterRange_in_ruleTerminalTokenElement6609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalRuleCall_in_ruleTerminalTokenElement6629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedTerminalElement_in_ruleTerminalTokenElement6649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNegatedToken_in_ruleTerminalTokenElement6669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcard_in_ruleTerminalTokenElement6689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEOF_in_ruleTerminalTokenElement6709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedTerminalElement_in_entryRuleParenthesizedTerminalElement6729 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedTerminalElement6732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedTerminalElement6751 = new BitSet(new long[]{0x0000094000028030L});
        public static final BitSet FOLLOW_ruleTerminalAlternatives_in_ruleParenthesizedTerminalElement6763 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParenthesizedTerminalElement6777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNegatedToken_in_entryRuleAbstractNegatedToken6797 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNegatedToken6800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegatedToken_in_ruleAbstractNegatedToken6817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUntilToken_in_ruleAbstractNegatedToken6837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegatedToken_in_entryRuleNegatedToken6857 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegatedToken6860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleNegatedToken6879 = new BitSet(new long[]{0x0000094000028030L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_ruleNegatedToken6906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUntilToken_in_entryRuleUntilToken6937 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUntilToken6940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleUntilToken6959 = new BitSet(new long[]{0x0000094000028030L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_ruleUntilToken6986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcard_in_entryRuleWildcard7017 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWildcard7020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleWildcard7052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEOF_in_entryRuleEOF7072 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEOF7075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEOF7107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterRange_in_entryRuleCharacterRange7127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCharacterRange7130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleCharacterRange7147 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_44_in_ruleCharacterRange7183 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleCharacterRange7215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumRule_in_entryRuleEnumRule7254 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumRule7257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEnumRule7276 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumRule7303 = new BitSet(new long[]{0x0000000008800000L});
        public static final BitSet FOLLOW_27_in_ruleEnumRule7334 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleEnumRule7366 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleEnumRule7399 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumLiterals_in_ruleEnumRule7426 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleEnumRule7451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumLiterals_in_entryRuleEnumLiterals7471 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiterals7474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals7491 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleEnumLiterals7534 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals7571 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleEnumLiteralDeclaration_in_entryRuleEnumLiteralDeclaration7619 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteralDeclaration7622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLiteralDeclaration7654 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleEnumLiteralDeclaration7685 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleEnumLiteralDeclaration7717 = new BitSet(new long[]{0x0000000000000002L});
    }


}