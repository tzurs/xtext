package org.eclipse.xtext.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.idea.lang.XtextElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.services.XtextGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalXtextParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'grammar'", "'with'", "','", "'hidden'", "'('", "')'", "'.'", "'generate'", "'as'", "'import'", "'fragment'", "'*'", "'returns'", "':'", "';'", "'['", "']'", "'::'", "'|'", "'&'", "'?'", "'+'", "'{'", "'='", "'+='", "'current'", "'}'", "'!'", "'=>'", "'->'", "'?='", "'terminal'", "'EOF'", "'..'", "'enum'"
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


        public PsiInternalXtextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalXtextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalXtextParser.tokenNames; }
    public String getGrammarFileName() { return "../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g"; }



    	protected XtextGrammarAccess grammarAccess;

    	protected XtextElementTypeProvider elementTypeProvider;

    	public PsiInternalXtextParser(PsiBuilder builder, TokenStream input, XtextElementTypeProvider elementTypeProvider, XtextGrammarAccess grammarAccess) {
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:52:1: entryRuleGrammar : ruleGrammar EOF ;
    public final void entryRuleGrammar() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:52:17: ( ruleGrammar EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:53:2: ruleGrammar EOF
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:58:1: ruleGrammar : (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ ) ;
    public final void ruleGrammar() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_definesHiddenTokens_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:58:12: ( (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:59:2: (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:59:2: (otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+ )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:60:3: otherlv_0= 'grammar' ( (lv_name_1_0= ruleGrammarID ) ) (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )? ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )? ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )* ( (lv_rules_13_0= ruleAbstractRule ) )+
            {

            			markLeaf(elementTypeProvider.getGrammar_GrammarKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleGrammar76); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:67:3: ( (lv_name_1_0= ruleGrammarID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:68:4: (lv_name_1_0= ruleGrammarID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:68:4: (lv_name_1_0= ruleGrammarID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:69:5: lv_name_1_0= ruleGrammarID
            {

            					markComposite(elementTypeProvider.getGrammar_NameGrammarIDParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleGrammarID_in_ruleGrammar103);
            ruleGrammarID();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:78:3: (otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:79:4: otherlv_2= 'with' ( ( ruleGrammarID ) ) (otherlv_4= ',' ( ( ruleGrammarID ) ) )*
                    {

                    				markLeaf(elementTypeProvider.getGrammar_WithKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGrammar134); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:86:4: ( ( ruleGrammarID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:87:5: ( ruleGrammarID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:87:5: ( ruleGrammarID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:88:6: ruleGrammarID
                    {

                    						markComposite(elementTypeProvider.getGrammar_UsedGrammarsGrammarCrossReference_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleGrammarID_in_ruleGrammar164);
                    ruleGrammarID();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:97:4: (otherlv_4= ',' ( ( ruleGrammarID ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:98:5: otherlv_4= ',' ( ( ruleGrammarID ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getGrammar_CommaKeyword_2_2_0ElementType());
                    	    				
                    	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGrammar201); 

                    	    					doneLeaf(otherlv_4);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:105:5: ( ( ruleGrammarID ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:106:6: ( ruleGrammarID )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:106:6: ( ruleGrammarID )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:107:7: ruleGrammarID
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

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:118:3: ( ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:119:4: ( (lv_definesHiddenTokens_6_0= 'hidden' ) ) otherlv_7= '(' ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= ')'
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:119:4: ( (lv_definesHiddenTokens_6_0= 'hidden' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:120:5: (lv_definesHiddenTokens_6_0= 'hidden' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:120:5: (lv_definesHiddenTokens_6_0= 'hidden' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:121:6: lv_definesHiddenTokens_6_0= 'hidden'
                    {

                    						markLeaf(elementTypeProvider.getGrammar_DefinesHiddenTokensHiddenKeyword_3_0_0ElementType());
                    					
                    lv_definesHiddenTokens_6_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGrammar299); 

                    						doneLeaf(lv_definesHiddenTokens_6_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getGrammar_LeftParenthesisKeyword_3_1ElementType());
                    			
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGrammar329); 

                    				doneLeaf(otherlv_7);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:137:4: ( ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:138:5: ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:138:5: ( (otherlv_8= RULE_ID ) )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:139:6: (otherlv_8= RULE_ID )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:139:6: (otherlv_8= RULE_ID )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:140:7: otherlv_8= RULE_ID
                            {

                            							markLeaf(elementTypeProvider.getGrammar_HiddenTokensAbstractRuleCrossReference_3_2_0_0ElementType());
                            						
                            otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGrammar370); 

                            							doneLeaf(otherlv_8);
                            						

                            }


                            }

                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:149:5: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==13) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:150:6: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                            	    {

                            	    						markLeaf(elementTypeProvider.getGrammar_CommaKeyword_3_2_1_0ElementType());
                            	    					
                            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGrammar413); 

                            	    						doneLeaf(otherlv_9);
                            	    					
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:157:6: ( (otherlv_10= RULE_ID ) )
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:158:7: (otherlv_10= RULE_ID )
                            	    {
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:158:7: (otherlv_10= RULE_ID )
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:159:8: otherlv_10= RULE_ID
                            	    {

                            	    								markLeaf(elementTypeProvider.getGrammar_HiddenTokensAbstractRuleCrossReference_3_2_1_1_0ElementType());
                            	    							
                            	    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGrammar455); 

                            	    								doneLeaf(otherlv_10);
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }


                    				markLeaf(elementTypeProvider.getGrammar_RightParenthesisKeyword_3_3ElementType());
                    			
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGrammar504); 

                    				doneLeaf(otherlv_11);
                    			

                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:178:3: ( (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18||LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:179:4: (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration )
            	    {
            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:179:4: (lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration )
            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:180:5: lv_metamodelDeclarations_12_0= ruleAbstractMetamodelDeclaration
            	    {

            	    					markComposite(elementTypeProvider.getGrammar_MetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0ElementType());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_ruleAbstractMetamodelDeclaration_in_ruleGrammar537);
            	    ruleAbstractMetamodelDeclaration();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:189:3: ( (lv_rules_13_0= ruleAbstractRule ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==21||LA7_0==42||LA7_0==45) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:190:4: (lv_rules_13_0= ruleAbstractRule )
            	    {
            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:190:4: (lv_rules_13_0= ruleAbstractRule )
            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:191:5: lv_rules_13_0= ruleAbstractRule
            	    {

            	    					markComposite(elementTypeProvider.getGrammar_RulesAbstractRuleParserRuleCall_5_0ElementType());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_ruleAbstractRule_in_ruleGrammar576);
            	    ruleAbstractRule();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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


    // $ANTLR start "entryRuleGrammarID"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:204:1: entryRuleGrammarID : ruleGrammarID EOF ;
    public final void entryRuleGrammarID() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:204:19: ( ruleGrammarID EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:205:2: ruleGrammarID EOF
            {
             markComposite(elementTypeProvider.getGrammarIDElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrammarID_in_entryRuleGrammarID608);
            ruleGrammarID();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrammarID611); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:210:1: ruleGrammarID : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final void ruleGrammarID() throws RecognitionException {
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:210:14: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:211:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:211:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:212:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {

            			markLeaf(elementTypeProvider.getGrammarID_IDTerminalRuleCall_0ElementType());
            		
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGrammarID630); 

            			doneLeaf(this_ID_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:219:3: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:220:4: kw= '.' this_ID_2= RULE_ID
            	    {

            	    				markLeaf(elementTypeProvider.getGrammarID_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGrammarID650); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getGrammarID_IDTerminalRuleCall_1_1ElementType());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGrammarID667); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:239:1: entryRuleAbstractRule : ruleAbstractRule EOF ;
    public final void entryRuleAbstractRule() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:239:22: ( ruleAbstractRule EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:240:2: ruleAbstractRule EOF
            {
             markComposite(elementTypeProvider.getAbstractRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractRule_in_entryRuleAbstractRule693);
            ruleAbstractRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractRule696); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:245:1: ruleAbstractRule : ( ruleParserRule | ruleTerminalRule | ruleEnumRule ) ;
    public final void ruleAbstractRule() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:245:17: ( ( ruleParserRule | ruleTerminalRule | ruleEnumRule ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:246:2: ( ruleParserRule | ruleTerminalRule | ruleEnumRule )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:246:2: ( ruleParserRule | ruleTerminalRule | ruleEnumRule )
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
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:247:3: ruleParserRule
                    {

                    			markComposite(elementTypeProvider.getAbstractRule_ParserRuleParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleParserRule_in_ruleAbstractRule713);
                    ruleParserRule();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:255:3: ruleTerminalRule
                    {

                    			markComposite(elementTypeProvider.getAbstractRule_TerminalRuleParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleTerminalRule_in_ruleAbstractRule733);
                    ruleTerminalRule();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:263:3: ruleEnumRule
                    {

                    			markComposite(elementTypeProvider.getAbstractRule_EnumRuleParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleEnumRule_in_ruleAbstractRule753);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:274:1: entryRuleAbstractMetamodelDeclaration : ruleAbstractMetamodelDeclaration EOF ;
    public final void entryRuleAbstractMetamodelDeclaration() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:274:38: ( ruleAbstractMetamodelDeclaration EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:275:2: ruleAbstractMetamodelDeclaration EOF
            {
             markComposite(elementTypeProvider.getAbstractMetamodelDeclarationElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractMetamodelDeclaration_in_entryRuleAbstractMetamodelDeclaration773);
            ruleAbstractMetamodelDeclaration();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractMetamodelDeclaration776); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:280:1: ruleAbstractMetamodelDeclaration : ( ruleGeneratedMetamodel | ruleReferencedMetamodel ) ;
    public final void ruleAbstractMetamodelDeclaration() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:280:33: ( ( ruleGeneratedMetamodel | ruleReferencedMetamodel ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:281:2: ( ruleGeneratedMetamodel | ruleReferencedMetamodel )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:281:2: ( ruleGeneratedMetamodel | ruleReferencedMetamodel )
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
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:282:3: ruleGeneratedMetamodel
                    {

                    			markComposite(elementTypeProvider.getAbstractMetamodelDeclaration_GeneratedMetamodelParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleGeneratedMetamodel_in_ruleAbstractMetamodelDeclaration793);
                    ruleGeneratedMetamodel();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:290:3: ruleReferencedMetamodel
                    {

                    			markComposite(elementTypeProvider.getAbstractMetamodelDeclaration_ReferencedMetamodelParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleReferencedMetamodel_in_ruleAbstractMetamodelDeclaration813);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:301:1: entryRuleGeneratedMetamodel : ruleGeneratedMetamodel EOF ;
    public final void entryRuleGeneratedMetamodel() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:301:28: ( ruleGeneratedMetamodel EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:302:2: ruleGeneratedMetamodel EOF
            {
             markComposite(elementTypeProvider.getGeneratedMetamodelElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleGeneratedMetamodel_in_entryRuleGeneratedMetamodel833);
            ruleGeneratedMetamodel();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGeneratedMetamodel836); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:307:1: ruleGeneratedMetamodel : (otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) ;
    public final void ruleGeneratedMetamodel() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:307:23: ( (otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:308:2: (otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:308:2: (otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:309:3: otherlv_0= 'generate' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
            {

            			markLeaf(elementTypeProvider.getGeneratedMetamodel_GenerateKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGeneratedMetamodel855); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:316:3: ( (lv_name_1_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:317:4: (lv_name_1_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:317:4: (lv_name_1_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:318:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getGeneratedMetamodel_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGeneratedMetamodel882); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:327:3: ( (otherlv_2= RULE_STRING ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:328:4: (otherlv_2= RULE_STRING )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:328:4: (otherlv_2= RULE_STRING )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:329:5: otherlv_2= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getGeneratedMetamodel_EPackageEPackageCrossReference_2_0ElementType());
            				
            otherlv_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleGeneratedMetamodel920); 

            					doneLeaf(otherlv_2);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:338:3: (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:339:4: otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getGeneratedMetamodel_AsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGeneratedMetamodel951); 

                    				doneLeaf(otherlv_3);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:346:4: ( (lv_alias_4_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:347:5: (lv_alias_4_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:347:5: (lv_alias_4_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:348:6: lv_alias_4_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getGeneratedMetamodel_AliasIDTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_alias_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGeneratedMetamodel983); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:362:1: entryRuleReferencedMetamodel : ruleReferencedMetamodel EOF ;
    public final void entryRuleReferencedMetamodel() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:362:29: ( ruleReferencedMetamodel EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:363:2: ruleReferencedMetamodel EOF
            {
             markComposite(elementTypeProvider.getReferencedMetamodelElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferencedMetamodel_in_entryRuleReferencedMetamodel1022);
            ruleReferencedMetamodel();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferencedMetamodel1025); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:368:1: ruleReferencedMetamodel : (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? ) ;
    public final void ruleReferencedMetamodel() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:368:24: ( (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:369:2: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:369:2: (otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:370:3: otherlv_0= 'import' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )?
            {

            			markLeaf(elementTypeProvider.getReferencedMetamodel_ImportKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleReferencedMetamodel1044); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:377:3: ( (otherlv_1= RULE_STRING ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:378:4: (otherlv_1= RULE_STRING )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:378:4: (otherlv_1= RULE_STRING )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:379:5: otherlv_1= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getReferencedMetamodel_EPackageEPackageCrossReference_1_0ElementType());
            				
            otherlv_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleReferencedMetamodel1071); 

            					doneLeaf(otherlv_1);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:388:3: (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:389:4: otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getReferencedMetamodel_AsKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleReferencedMetamodel1102); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:396:4: ( (lv_alias_3_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:397:5: (lv_alias_3_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:397:5: (lv_alias_3_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:398:6: lv_alias_3_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getReferencedMetamodel_AliasIDTerminalRuleCall_2_1_0ElementType());
                    					
                    lv_alias_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleReferencedMetamodel1134); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:412:1: entryRuleParserRule : ruleParserRule EOF ;
    public final void entryRuleParserRule() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:412:20: ( ruleParserRule EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:413:2: ruleParserRule EOF
            {
             markComposite(elementTypeProvider.getParserRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParserRule_in_entryRuleParserRule1173);
            ruleParserRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParserRule1176); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:418:1: ruleParserRule : ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | ( ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_8_0= 'hidden' ) ) otherlv_9= '(' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= ')' )? otherlv_14= ':' ( (lv_alternatives_15_0= ruleAlternatives ) ) otherlv_16= ';' ) ;
    public final void ruleParserRule() throws RecognitionException {
        Token lv_fragment_0_0=null;
        Token lv_wildcard_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token lv_definesHiddenTokens_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:418:15: ( ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | ( ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_8_0= 'hidden' ) ) otherlv_9= '(' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= ')' )? otherlv_14= ':' ( (lv_alternatives_15_0= ruleAlternatives ) ) otherlv_16= ';' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:419:2: ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | ( ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_8_0= 'hidden' ) ) otherlv_9= '(' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= ')' )? otherlv_14= ':' ( (lv_alternatives_15_0= ruleAlternatives ) ) otherlv_16= ';' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:419:2: ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | ( ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_8_0= 'hidden' ) ) otherlv_9= '(' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= ')' )? otherlv_14= ':' ( (lv_alternatives_15_0= ruleAlternatives ) ) otherlv_16= ';' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:420:3: ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | ( ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_8_0= 'hidden' ) ) otherlv_9= '(' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= ')' )? otherlv_14= ':' ( (lv_alternatives_15_0= ruleAlternatives ) ) otherlv_16= ';'
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:420:3: ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) ) | ( ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? ) )
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
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:421:4: ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:421:4: ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:422:5: ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:422:5: ( (lv_fragment_0_0= 'fragment' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:423:6: (lv_fragment_0_0= 'fragment' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:423:6: (lv_fragment_0_0= 'fragment' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:424:7: lv_fragment_0_0= 'fragment'
                    {

                    							markLeaf(elementTypeProvider.getParserRule_FragmentFragmentKeyword_0_0_0_0ElementType());
                    						
                    lv_fragment_0_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParserRule1225); 

                    							doneLeaf(lv_fragment_0_0);
                    						

                    }


                    }


                    					markComposite(elementTypeProvider.getParserRule_RuleNameAndParamsParserRuleCall_0_0_1ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_ruleRuleNameAndParams_in_ruleParserRule1258);
                    ruleRuleNameAndParams();

                    state._fsp--;


                    					doneComposite();
                    				
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:440:5: ( ( (lv_wildcard_2_0= '*' ) ) | (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )? )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==22) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==14||(LA14_0>=23 && LA14_0<=24)) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:441:6: ( (lv_wildcard_2_0= '*' ) )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:441:6: ( (lv_wildcard_2_0= '*' ) )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:442:7: (lv_wildcard_2_0= '*' )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:442:7: (lv_wildcard_2_0= '*' )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:443:8: lv_wildcard_2_0= '*'
                            {

                            								markLeaf(elementTypeProvider.getParserRule_WildcardAsteriskKeyword_0_0_2_0_0ElementType());
                            							
                            lv_wildcard_2_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParserRule1305); 

                            								doneLeaf(lv_wildcard_2_0);
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:453:6: (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )?
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:453:6: (otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) ) )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==23) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:454:7: otherlv_3= 'returns' ( (lv_type_4_0= ruleTypeRef ) )
                                    {

                                    							markLeaf(elementTypeProvider.getParserRule_ReturnsKeyword_0_0_2_1_0ElementType());
                                    						
                                    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleParserRule1365); 

                                    							doneLeaf(otherlv_3);
                                    						
                                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:461:7: ( (lv_type_4_0= ruleTypeRef ) )
                                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:462:8: (lv_type_4_0= ruleTypeRef )
                                    {
                                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:462:8: (lv_type_4_0= ruleTypeRef )
                                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:463:9: lv_type_4_0= ruleTypeRef
                                    {

                                    									markComposite(elementTypeProvider.getParserRule_TypeTypeRefParserRuleCall_0_0_2_1_1_0ElementType());
                                    								
                                    pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleParserRule1412);
                                    ruleTypeRef();

                                    state._fsp--;


                                    									doneComposite();
                                    								

                                    }


                                    }


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
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:476:4: ( ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:476:4: ( ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )? )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:477:5: ruleRuleNameAndParams (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )?
                    {

                    					markComposite(elementTypeProvider.getParserRule_RuleNameAndParamsParserRuleCall_0_1_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_ruleRuleNameAndParams_in_ruleParserRule1484);
                    ruleRuleNameAndParams();

                    state._fsp--;


                    					doneComposite();
                    				
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:484:5: (otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==23) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:485:6: otherlv_6= 'returns' ( (lv_type_7_0= ruleTypeRef ) )
                            {

                            						markLeaf(elementTypeProvider.getParserRule_ReturnsKeyword_0_1_1_0ElementType());
                            					
                            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleParserRule1512); 

                            						doneLeaf(otherlv_6);
                            					
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:492:6: ( (lv_type_7_0= ruleTypeRef ) )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:493:7: (lv_type_7_0= ruleTypeRef )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:493:7: (lv_type_7_0= ruleTypeRef )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:494:8: lv_type_7_0= ruleTypeRef
                            {

                            								markComposite(elementTypeProvider.getParserRule_TypeTypeRefParserRuleCall_0_1_1_1_0ElementType());
                            							
                            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleParserRule1554);
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

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:506:3: ( ( (lv_definesHiddenTokens_8_0= 'hidden' ) ) otherlv_9= '(' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:507:4: ( (lv_definesHiddenTokens_8_0= 'hidden' ) ) otherlv_9= '(' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= ')'
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:507:4: ( (lv_definesHiddenTokens_8_0= 'hidden' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:508:5: (lv_definesHiddenTokens_8_0= 'hidden' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:508:5: (lv_definesHiddenTokens_8_0= 'hidden' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:509:6: lv_definesHiddenTokens_8_0= 'hidden'
                    {

                    						markLeaf(elementTypeProvider.getParserRule_DefinesHiddenTokensHiddenKeyword_1_0_0ElementType());
                    					
                    lv_definesHiddenTokens_8_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParserRule1625); 

                    						doneLeaf(lv_definesHiddenTokens_8_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getParserRule_LeftParenthesisKeyword_1_1ElementType());
                    			
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParserRule1655); 

                    				doneLeaf(otherlv_9);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:525:4: ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:526:5: ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:526:5: ( (otherlv_10= RULE_ID ) )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:527:6: (otherlv_10= RULE_ID )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:527:6: (otherlv_10= RULE_ID )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:528:7: otherlv_10= RULE_ID
                            {

                            							markLeaf(elementTypeProvider.getParserRule_HiddenTokensAbstractRuleCrossReference_1_2_0_0ElementType());
                            						
                            otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParserRule1696); 

                            							doneLeaf(otherlv_10);
                            						

                            }


                            }

                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:537:5: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==13) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:538:6: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                            	    {

                            	    						markLeaf(elementTypeProvider.getParserRule_CommaKeyword_1_2_1_0ElementType());
                            	    					
                            	    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParserRule1739); 

                            	    						doneLeaf(otherlv_11);
                            	    					
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:545:6: ( (otherlv_12= RULE_ID ) )
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:546:7: (otherlv_12= RULE_ID )
                            	    {
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:546:7: (otherlv_12= RULE_ID )
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:547:8: otherlv_12= RULE_ID
                            	    {

                            	    								markLeaf(elementTypeProvider.getParserRule_HiddenTokensAbstractRuleCrossReference_1_2_1_1_0ElementType());
                            	    							
                            	    otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParserRule1781); 

                            	    								doneLeaf(otherlv_12);
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }


                    				markLeaf(elementTypeProvider.getParserRule_RightParenthesisKeyword_1_3ElementType());
                    			
                    otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParserRule1830); 

                    				doneLeaf(otherlv_13);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getParserRule_ColonKeyword_2ElementType());
            		
            otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleParserRule1850); 

            			doneLeaf(otherlv_14);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:573:3: ( (lv_alternatives_15_0= ruleAlternatives ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:574:4: (lv_alternatives_15_0= ruleAlternatives )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:574:4: (lv_alternatives_15_0= ruleAlternatives )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:575:5: lv_alternatives_15_0= ruleAlternatives
            {

            					markComposite(elementTypeProvider.getParserRule_AlternativesAlternativesParserRuleCall_3_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_ruleParserRule1877);
            ruleAlternatives();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getParserRule_SemicolonKeyword_4ElementType());
            		
            otherlv_16=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleParserRule1902); 

            			doneLeaf(otherlv_16);
            		

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


    // $ANTLR start "ruleRuleNameAndParams"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:596:1: ruleRuleNameAndParams : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )? ) ;
    public final void ruleRuleNameAndParams() throws RecognitionException {
        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:596:22: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:597:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:597:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:598:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )?
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:598:3: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:599:4: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:599:4: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:600:5: lv_name_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getRuleNameAndParams_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRuleNameAndParams1943); 

            					doneLeaf(lv_name_0_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:609:3: (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:610:4: otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']'
                    {

                    				markLeaf(elementTypeProvider.getRuleNameAndParams_LeftSquareBracketKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRuleNameAndParams1974); 

                    				doneLeaf(otherlv_1);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:617:4: ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:618:5: ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:618:5: ( (lv_parameters_2_0= ruleParameter ) )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:619:6: (lv_parameters_2_0= ruleParameter )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:619:6: (lv_parameters_2_0= ruleParameter )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:620:7: lv_parameters_2_0= ruleParameter
                            {

                            							markComposite(elementTypeProvider.getRuleNameAndParams_ParametersParameterParserRuleCall_1_1_0_0ElementType());
                            						
                            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleRuleNameAndParams2015);
                            ruleParameter();

                            state._fsp--;


                            							doneComposite();
                            						

                            }


                            }

                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:629:5: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==13) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:630:6: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                            	    {

                            	    						markLeaf(elementTypeProvider.getRuleNameAndParams_CommaKeyword_1_1_1_0ElementType());
                            	    					
                            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRuleNameAndParams2058); 

                            	    						doneLeaf(otherlv_3);
                            	    					
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:637:6: ( (lv_parameters_4_0= ruleParameter ) )
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:638:7: (lv_parameters_4_0= ruleParameter )
                            	    {
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:638:7: (lv_parameters_4_0= ruleParameter )
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:639:8: lv_parameters_4_0= ruleParameter
                            	    {

                            	    								markComposite(elementTypeProvider.getRuleNameAndParams_ParametersParameterParserRuleCall_1_1_1_1_0ElementType());
                            	    							
                            	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleRuleNameAndParams2100);
                            	    ruleParameter();

                            	    state._fsp--;


                            	    								doneComposite();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);


                            }
                            break;

                    }


                    				markLeaf(elementTypeProvider.getRuleNameAndParams_RightSquareBracketKeyword_1_2ElementType());
                    			
                    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRuleNameAndParams2149); 

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


    // $ANTLR start "entryRuleParameter"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:662:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:662:19: ( ruleParameter EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:663:2: ruleParameter EOF
            {
             markComposite(elementTypeProvider.getParameterElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter2175);
            ruleParameter();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter2178); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:668:1: ruleParameter : ( (lv_name_0_0= RULE_ID ) ) ;
    public final void ruleParameter() throws RecognitionException {
        Token lv_name_0_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:668:14: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:669:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:669:2: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:670:3: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:670:3: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:671:4: lv_name_0_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getParameter_NameIDTerminalRuleCall_0ElementType());
            			
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParameter2203); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:683:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:683:17: ( ruleTypeRef EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:684:2: ruleTypeRef EOF
            {
             markComposite(elementTypeProvider.getTypeRefElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_entryRuleTypeRef2228);
            ruleTypeRef();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeRef2231); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:689:1: ruleTypeRef : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final void ruleTypeRef() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:689:12: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:690:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:690:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:691:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:691:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==28) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:692:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:692:4: ( (otherlv_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:693:5: (otherlv_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:693:5: (otherlv_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:694:6: otherlv_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getTypeRef_MetamodelAbstractMetamodelDeclarationCrossReference_0_0_0ElementType());
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeRef2271); 

                    						doneLeaf(otherlv_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getTypeRef_ColonColonKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTypeRef2301); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:711:3: ( (otherlv_2= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:712:4: (otherlv_2= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:712:4: (otherlv_2= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:713:5: otherlv_2= RULE_ID
            {

            					markLeaf(elementTypeProvider.getTypeRef_ClassifierEClassifierCrossReference_1_0ElementType());
            				
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeRef2334); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:726:1: entryRuleAlternatives : ruleAlternatives EOF ;
    public final void entryRuleAlternatives() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:726:22: ( ruleAlternatives EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:727:2: ruleAlternatives EOF
            {
             markComposite(elementTypeProvider.getAlternativesElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_entryRuleAlternatives2365);
            ruleAlternatives();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAlternatives2368); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:732:1: ruleAlternatives : ( ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? ) ;
    public final void ruleAlternatives() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:732:17: ( ( ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:733:2: ( ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:733:2: ( ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:734:3: ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getAlternatives_ConditionalBranchParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleConditionalBranch_in_ruleAlternatives2385);
            ruleConditionalBranch();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:741:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:742:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:742:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:743:5: 
                    {

                    					precedeComposite(elementTypeProvider.getAlternatives_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:748:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==29) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:749:5: otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getAlternatives_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAlternatives2428); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:756:5: ( (lv_elements_3_0= ruleConditionalBranch ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:757:6: (lv_elements_3_0= ruleConditionalBranch )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:757:6: (lv_elements_3_0= ruleConditionalBranch )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:758:7: lv_elements_3_0= ruleConditionalBranch
                    	    {

                    	    							markComposite(elementTypeProvider.getAlternatives_ElementsConditionalBranchParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleConditionalBranch_in_ruleAlternatives2465);
                    	    ruleConditionalBranch();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:773:1: entryRuleConditionalBranch : ruleConditionalBranch EOF ;
    public final void entryRuleConditionalBranch() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:773:27: ( ruleConditionalBranch EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:774:2: ruleConditionalBranch EOF
            {
             markComposite(elementTypeProvider.getConditionalBranchElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditionalBranch_in_entryRuleConditionalBranch2513);
            ruleConditionalBranch();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditionalBranch2516); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:779:1: ruleConditionalBranch : ( ruleUnorderedGroup | ( () otherlv_2= '[' ( (lv_guardConditions_3_0= ruleGuardCondition ) ) (otherlv_4= ',' ( (lv_guardConditions_5_0= ruleGuardCondition ) ) )* otherlv_6= ']' ( (lv_elements_7_0= ruleAbstractToken ) )+ ) ) ;
    public final void ruleConditionalBranch() throws RecognitionException {
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:779:22: ( ( ruleUnorderedGroup | ( () otherlv_2= '[' ( (lv_guardConditions_3_0= ruleGuardCondition ) ) (otherlv_4= ',' ( (lv_guardConditions_5_0= ruleGuardCondition ) ) )* otherlv_6= ']' ( (lv_elements_7_0= ruleAbstractToken ) )+ ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:780:2: ( ruleUnorderedGroup | ( () otherlv_2= '[' ( (lv_guardConditions_3_0= ruleGuardCondition ) ) (otherlv_4= ',' ( (lv_guardConditions_5_0= ruleGuardCondition ) ) )* otherlv_6= ']' ( (lv_elements_7_0= ruleAbstractToken ) )+ ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:780:2: ( ruleUnorderedGroup | ( () otherlv_2= '[' ( (lv_guardConditions_3_0= ruleGuardCondition ) ) (otherlv_4= ',' ( (lv_guardConditions_5_0= ruleGuardCondition ) ) )* otherlv_6= ']' ( (lv_elements_7_0= ruleAbstractToken ) )+ ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||LA28_0==15||LA28_0==33||(LA28_0>=39 && LA28_0<=40)) ) {
                alt28=1;
            }
            else if ( (LA28_0==26) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:781:3: ruleUnorderedGroup
                    {

                    			markComposite(elementTypeProvider.getConditionalBranch_UnorderedGroupParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroup_in_ruleConditionalBranch2533);
                    ruleUnorderedGroup();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:789:3: ( () otherlv_2= '[' ( (lv_guardConditions_3_0= ruleGuardCondition ) ) (otherlv_4= ',' ( (lv_guardConditions_5_0= ruleGuardCondition ) ) )* otherlv_6= ']' ( (lv_elements_7_0= ruleAbstractToken ) )+ )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:789:3: ( () otherlv_2= '[' ( (lv_guardConditions_3_0= ruleGuardCondition ) ) (otherlv_4= ',' ( (lv_guardConditions_5_0= ruleGuardCondition ) ) )* otherlv_6= ']' ( (lv_elements_7_0= ruleAbstractToken ) )+ )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:790:4: () otherlv_2= '[' ( (lv_guardConditions_3_0= ruleGuardCondition ) ) (otherlv_4= ',' ( (lv_guardConditions_5_0= ruleGuardCondition ) ) )* otherlv_6= ']' ( (lv_elements_7_0= ruleAbstractToken ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:790:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:791:5: 
                    {

                    					precedeComposite(elementTypeProvider.getConditionalBranch_GroupAction_1_0ElementType());
                    					doneComposite();
                    				

                    }


                    				markLeaf(elementTypeProvider.getConditionalBranch_LeftSquareBracketKeyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleConditionalBranch2577); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:803:4: ( (lv_guardConditions_3_0= ruleGuardCondition ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:804:5: (lv_guardConditions_3_0= ruleGuardCondition )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:804:5: (lv_guardConditions_3_0= ruleGuardCondition )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:805:6: lv_guardConditions_3_0= ruleGuardCondition
                    {

                    						markComposite(elementTypeProvider.getConditionalBranch_GuardConditionsGuardConditionParserRuleCall_1_2_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleGuardCondition_in_ruleConditionalBranch2609);
                    ruleGuardCondition();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:814:4: (otherlv_4= ',' ( (lv_guardConditions_5_0= ruleGuardCondition ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==13) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:815:5: otherlv_4= ',' ( (lv_guardConditions_5_0= ruleGuardCondition ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getConditionalBranch_CommaKeyword_1_3_0ElementType());
                    	    				
                    	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConditionalBranch2646); 

                    	    					doneLeaf(otherlv_4);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:822:5: ( (lv_guardConditions_5_0= ruleGuardCondition ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:823:6: (lv_guardConditions_5_0= ruleGuardCondition )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:823:6: (lv_guardConditions_5_0= ruleGuardCondition )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:824:7: lv_guardConditions_5_0= ruleGuardCondition
                    	    {

                    	    							markComposite(elementTypeProvider.getConditionalBranch_GuardConditionsGuardConditionParserRuleCall_1_3_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuardCondition_in_ruleConditionalBranch2683);
                    	    ruleGuardCondition();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    				markLeaf(elementTypeProvider.getConditionalBranch_RightSquareBracketKeyword_1_4ElementType());
                    			
                    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleConditionalBranch2722); 

                    				doneLeaf(otherlv_6);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:841:4: ( (lv_elements_7_0= ruleAbstractToken ) )+
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
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:842:5: (lv_elements_7_0= ruleAbstractToken )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:842:5: (lv_elements_7_0= ruleAbstractToken )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:843:6: lv_elements_7_0= ruleAbstractToken
                    	    {

                    	    						markComposite(elementTypeProvider.getConditionalBranch_ElementsAbstractTokenParserRuleCall_1_5_0ElementType());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractToken_in_ruleConditionalBranch2754);
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


    // $ANTLR start "entryRuleGuardCondition"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:857:1: entryRuleGuardCondition : ruleGuardCondition EOF ;
    public final void entryRuleGuardCondition() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:857:24: ( ruleGuardCondition EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:858:2: ruleGuardCondition EOF
            {
             markComposite(elementTypeProvider.getGuardConditionElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuardCondition_in_entryRuleGuardCondition2793);
            ruleGuardCondition();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGuardCondition2796); 

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
    // $ANTLR end "entryRuleGuardCondition"


    // $ANTLR start "ruleGuardCondition"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:863:1: ruleGuardCondition : ( ( (lv_passIfTrue_0_0= ruleLiteralValue ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final void ruleGuardCondition() throws RecognitionException {
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:863:19: ( ( ( (lv_passIfTrue_0_0= ruleLiteralValue ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:864:2: ( ( (lv_passIfTrue_0_0= ruleLiteralValue ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:864:2: ( ( (lv_passIfTrue_0_0= ruleLiteralValue ) ) ( (otherlv_1= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:865:3: ( (lv_passIfTrue_0_0= ruleLiteralValue ) ) ( (otherlv_1= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:865:3: ( (lv_passIfTrue_0_0= ruleLiteralValue ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:866:4: (lv_passIfTrue_0_0= ruleLiteralValue )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:866:4: (lv_passIfTrue_0_0= ruleLiteralValue )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:867:5: lv_passIfTrue_0_0= ruleLiteralValue
            {

            					markComposite(elementTypeProvider.getGuardCondition_PassIfTrueLiteralValueParserRuleCall_0_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleLiteralValue_in_ruleGuardCondition2828);
            ruleLiteralValue();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:876:3: ( (otherlv_1= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:877:4: (otherlv_1= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:877:4: (otherlv_1= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:878:5: otherlv_1= RULE_ID
            {

            					markLeaf(elementTypeProvider.getGuardCondition_ParameterParameterCrossReference_1_0ElementType());
            				
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGuardCondition2866); 

            					doneLeaf(otherlv_1);
            				

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
    // $ANTLR end "ruleGuardCondition"


    // $ANTLR start "entryRuleUnorderedGroup"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:891:1: entryRuleUnorderedGroup : ruleUnorderedGroup EOF ;
    public final void entryRuleUnorderedGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:891:24: ( ruleUnorderedGroup EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:892:2: ruleUnorderedGroup EOF
            {
             markComposite(elementTypeProvider.getUnorderedGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroup_in_entryRuleUnorderedGroup2897);
            ruleUnorderedGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnorderedGroup2900); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:897:1: ruleUnorderedGroup : ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? ) ;
    public final void ruleUnorderedGroup() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:897:19: ( ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:898:2: ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:898:2: ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:899:3: ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getUnorderedGroup_GroupParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleUnorderedGroup2917);
            ruleGroup();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:906:3: ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:907:4: () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:907:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:908:5: 
                    {

                    					precedeComposite(elementTypeProvider.getUnorderedGroup_UnorderedGroupElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:913:4: (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==30) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:914:5: otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getUnorderedGroup_AmpersandKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleUnorderedGroup2960); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:921:5: ( (lv_elements_3_0= ruleGroup ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:922:6: (lv_elements_3_0= ruleGroup )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:922:6: (lv_elements_3_0= ruleGroup )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:923:7: lv_elements_3_0= ruleGroup
                    	    {

                    	    							markComposite(elementTypeProvider.getUnorderedGroup_ElementsGroupParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleUnorderedGroup2997);
                    	    ruleGroup();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:938:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:938:15: ( ruleGroup EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:939:2: ruleGroup EOF
            {
             markComposite(elementTypeProvider.getGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup3045);
            ruleGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup3048); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:944:1: ruleGroup : ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? ) ;
    public final void ruleGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:944:10: ( ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:945:2: ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:945:2: ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:946:3: ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )?
            {

            			markComposite(elementTypeProvider.getGroup_AbstractTokenParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAbstractToken_in_ruleGroup3065);
            ruleAbstractToken();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:953:3: ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_STRING)||LA32_0==15||LA32_0==33||(LA32_0>=39 && LA32_0<=40)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:954:4: () ( (lv_elements_2_0= ruleAbstractToken ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:954:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:955:5: 
                    {

                    					precedeComposite(elementTypeProvider.getGroup_GroupElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:960:4: ( (lv_elements_2_0= ruleAbstractToken ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING)||LA31_0==15||LA31_0==33||(LA31_0>=39 && LA31_0<=40)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:961:5: (lv_elements_2_0= ruleAbstractToken )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:961:5: (lv_elements_2_0= ruleAbstractToken )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:962:6: lv_elements_2_0= ruleAbstractToken
                    	    {

                    	    						markComposite(elementTypeProvider.getGroup_ElementsAbstractTokenParserRuleCall_1_1_0ElementType());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractToken_in_ruleGroup3116);
                    	    ruleAbstractToken();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:976:1: entryRuleAbstractToken : ruleAbstractToken EOF ;
    public final void entryRuleAbstractToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:976:23: ( ruleAbstractToken EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:977:2: ruleAbstractToken EOF
            {
             markComposite(elementTypeProvider.getAbstractTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractToken_in_entryRuleAbstractToken3156);
            ruleAbstractToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractToken3159); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:982:1: ruleAbstractToken : ( ruleAbstractTokenWithCardinality | ruleAction ) ;
    public final void ruleAbstractToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:982:18: ( ( ruleAbstractTokenWithCardinality | ruleAction ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:983:2: ( ruleAbstractTokenWithCardinality | ruleAction )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:983:2: ( ruleAbstractTokenWithCardinality | ruleAction )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_STRING)||LA33_0==15||(LA33_0>=39 && LA33_0<=40)) ) {
                alt33=1;
            }
            else if ( (LA33_0==33) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:984:3: ruleAbstractTokenWithCardinality
                    {

                    			markComposite(elementTypeProvider.getAbstractToken_AbstractTokenWithCardinalityParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractTokenWithCardinality_in_ruleAbstractToken3176);
                    ruleAbstractTokenWithCardinality();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:992:3: ruleAction
                    {

                    			markComposite(elementTypeProvider.getAbstractToken_ActionParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleAbstractToken3196);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1003:1: entryRuleAbstractTokenWithCardinality : ruleAbstractTokenWithCardinality EOF ;
    public final void entryRuleAbstractTokenWithCardinality() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1003:38: ( ruleAbstractTokenWithCardinality EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1004:2: ruleAbstractTokenWithCardinality EOF
            {
             markComposite(elementTypeProvider.getAbstractTokenWithCardinalityElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractTokenWithCardinality_in_entryRuleAbstractTokenWithCardinality3216);
            ruleAbstractTokenWithCardinality();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractTokenWithCardinality3219); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1009:1: ruleAbstractTokenWithCardinality : ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) ;
    public final void ruleAbstractTokenWithCardinality() throws RecognitionException {
        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1009:33: ( ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1010:2: ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1010:2: ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1011:3: ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1011:3: ( ruleAssignment | ruleAbstractTerminal )
            int alt34=2;
            switch ( input.LA(1) ) {
            case 39:
                {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==RULE_ID) ) {
                    int LA34_5 = input.LA(3);

                    if ( ((LA34_5>=34 && LA34_5<=35)||LA34_5==41) ) {
                        alt34=1;
                    }
                    else if ( (LA34_5==EOF||(LA34_5>=RULE_ID && LA34_5<=RULE_STRING)||(LA34_5>=15 && LA34_5<=16)||LA34_5==22||LA34_5==25||(LA34_5>=29 && LA34_5<=33)||(LA34_5>=39 && LA34_5<=40)) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA34_1==RULE_STRING||LA34_1==15) ) {
                    alt34=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                int LA34_2 = input.LA(2);

                if ( (LA34_2==RULE_STRING||LA34_2==15) ) {
                    alt34=2;
                }
                else if ( (LA34_2==RULE_ID) ) {
                    int LA34_5 = input.LA(3);

                    if ( ((LA34_5>=34 && LA34_5<=35)||LA34_5==41) ) {
                        alt34=1;
                    }
                    else if ( (LA34_5==EOF||(LA34_5>=RULE_ID && LA34_5<=RULE_STRING)||(LA34_5>=15 && LA34_5<=16)||LA34_5==22||LA34_5==25||(LA34_5>=29 && LA34_5<=33)||(LA34_5>=39 && LA34_5<=40)) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA34_3 = input.LA(2);

                if ( ((LA34_3>=34 && LA34_3<=35)||LA34_3==41) ) {
                    alt34=1;
                }
                else if ( (LA34_3==EOF||(LA34_3>=RULE_ID && LA34_3<=RULE_STRING)||(LA34_3>=15 && LA34_3<=16)||LA34_3==22||(LA34_3>=25 && LA34_3<=26)||(LA34_3>=28 && LA34_3<=33)||(LA34_3>=39 && LA34_3<=40)) ) {
                    alt34=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 15:
                {
                alt34=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1012:4: ruleAssignment
                    {

                    				markComposite(elementTypeProvider.getAbstractTokenWithCardinality_AssignmentParserRuleCall_0_0ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleAbstractTokenWithCardinality3242);
                    ruleAssignment();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1020:4: ruleAbstractTerminal
                    {

                    				markComposite(elementTypeProvider.getAbstractTokenWithCardinality_AbstractTerminalParserRuleCall_0_1ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractTerminal_in_ruleAbstractTokenWithCardinality3266);
                    ruleAbstractTerminal();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1028:3: ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==22||(LA36_0>=31 && LA36_0<=32)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1029:4: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1029:4: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1030:5: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1030:5: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    int alt35=3;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt35=1;
                        }
                        break;
                    case 22:
                        {
                        alt35=2;
                        }
                        break;
                    case 32:
                        {
                        alt35=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }

                    switch (alt35) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1031:6: lv_cardinality_2_1= '?'
                            {

                            						markLeaf(elementTypeProvider.getAbstractTokenWithCardinality_CardinalityQuestionMarkKeyword_1_0_0ElementType());
                            					
                            lv_cardinality_2_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAbstractTokenWithCardinality3306); 

                            						doneLeaf(lv_cardinality_2_1);
                            					

                            }
                            break;
                        case 2 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1039:6: lv_cardinality_2_2= '*'
                            {

                            						markLeaf(elementTypeProvider.getAbstractTokenWithCardinality_CardinalityAsteriskKeyword_1_0_1ElementType());
                            					
                            lv_cardinality_2_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAbstractTokenWithCardinality3340); 

                            						doneLeaf(lv_cardinality_2_2);
                            					

                            }
                            break;
                        case 3 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1047:6: lv_cardinality_2_3= '+'
                            {

                            						markLeaf(elementTypeProvider.getAbstractTokenWithCardinality_CardinalityPlusSignKeyword_1_0_2ElementType());
                            					
                            lv_cardinality_2_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAbstractTokenWithCardinality3374); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1061:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1061:16: ( ruleAction EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1062:2: ruleAction EOF
            {
             markComposite(elementTypeProvider.getActionElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction3413);
            ruleAction();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction3416); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1067:1: ruleAction : (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) ;
    public final void ruleAction() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_feature_3_0=null;
        Token lv_operator_4_1=null;
        Token lv_operator_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1067:11: ( (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1068:2: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1068:2: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1069:3: otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}'
            {

            			markLeaf(elementTypeProvider.getAction_LeftCurlyBracketKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAction3435); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1076:3: ( (lv_type_1_0= ruleTypeRef ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1077:4: (lv_type_1_0= ruleTypeRef )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1077:4: (lv_type_1_0= ruleTypeRef )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1078:5: lv_type_1_0= ruleTypeRef
            {

            					markComposite(elementTypeProvider.getAction_TypeTypeRefParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleAction3462);
            ruleTypeRef();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1087:3: (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==17) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1088:4: otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current'
                    {

                    				markLeaf(elementTypeProvider.getAction_FullStopKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAction3493); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1095:4: ( (lv_feature_3_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1096:5: (lv_feature_3_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1096:5: (lv_feature_3_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1097:6: lv_feature_3_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getAction_FeatureIDTerminalRuleCall_2_1_0ElementType());
                    					
                    lv_feature_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAction3525); 

                    						doneLeaf(lv_feature_3_0);
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1106:4: ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1107:5: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1107:5: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1108:6: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1108:6: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==34) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==35) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1109:7: lv_operator_4_1= '='
                            {

                            							markLeaf(elementTypeProvider.getAction_OperatorEqualsSignKeyword_2_2_0_0ElementType());
                            						
                            lv_operator_4_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAction3579); 

                            							doneLeaf(lv_operator_4_1);
                            						

                            }
                            break;
                        case 2 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1117:7: lv_operator_4_2= '+='
                            {

                            							markLeaf(elementTypeProvider.getAction_OperatorPlusSignEqualsSignKeyword_2_2_0_1ElementType());
                            						
                            lv_operator_4_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAction3617); 

                            							doneLeaf(lv_operator_4_2);
                            						

                            }
                            break;

                    }


                    }


                    }


                    				markLeaf(elementTypeProvider.getAction_CurrentKeyword_2_3ElementType());
                    			
                    otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAction3655); 

                    				doneLeaf(otherlv_5);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getAction_RightCurlyBracketKeyword_3ElementType());
            		
            otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAction3675); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1146:1: entryRuleAbstractTerminal : ruleAbstractTerminal EOF ;
    public final void entryRuleAbstractTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1146:26: ( ruleAbstractTerminal EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1147:2: ruleAbstractTerminal EOF
            {
             markComposite(elementTypeProvider.getAbstractTerminalElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractTerminal_in_entryRuleAbstractTerminal3695);
            ruleAbstractTerminal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractTerminal3698); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1152:1: ruleAbstractTerminal : ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup ) ;
    public final void ruleAbstractTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1152:21: ( ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1153:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1153:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup )
            int alt39=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt39=1;
                }
                break;
            case RULE_ID:
                {
                alt39=2;
                }
                break;
            case 15:
                {
                alt39=3;
                }
                break;
            case 39:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt39=5;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt39=4;
                    }
                    break;
                case 15:
                    {
                    alt39=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 4, input);

                    throw nvae;
                }

                }
                break;
            case 40:
                {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt39=6;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt39=4;
                    }
                    break;
                case RULE_ID:
                    {
                    alt39=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 5, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1154:3: ruleKeyword
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_KeywordParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleAbstractTerminal3715);
                    ruleKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1162:3: ruleRuleCall
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_RuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleAbstractTerminal3735);
                    ruleRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1170:3: ruleParenthesizedElement
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_ParenthesizedElementParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedElement_in_ruleAbstractTerminal3755);
                    ruleParenthesizedElement();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1178:3: rulePredicatedKeyword
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_PredicatedKeywordParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_rulePredicatedKeyword_in_ruleAbstractTerminal3775);
                    rulePredicatedKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 5 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1186:3: rulePredicatedRuleCall
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_PredicatedRuleCallParserRuleCall_4ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_rulePredicatedRuleCall_in_ruleAbstractTerminal3795);
                    rulePredicatedRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 6 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1194:3: rulePredicatedGroup
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_PredicatedGroupParserRuleCall_5ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_rulePredicatedGroup_in_ruleAbstractTerminal3815);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1205:1: entryRuleKeyword : ruleKeyword EOF ;
    public final void entryRuleKeyword() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1205:17: ( ruleKeyword EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1206:2: ruleKeyword EOF
            {
             markComposite(elementTypeProvider.getKeywordElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_entryRuleKeyword3835);
            ruleKeyword();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyword3838); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1211:1: ruleKeyword : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final void ruleKeyword() throws RecognitionException {
        Token lv_value_0_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1211:12: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1212:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1212:2: ( (lv_value_0_0= RULE_STRING ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1213:3: (lv_value_0_0= RULE_STRING )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1213:3: (lv_value_0_0= RULE_STRING )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1214:4: lv_value_0_0= RULE_STRING
            {

            				markLeaf(elementTypeProvider.getKeyword_ValueSTRINGTerminalRuleCall_0ElementType());
            			
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleKeyword3863); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1226:1: entryRuleRuleCall : ruleRuleCall EOF ;
    public final void entryRuleRuleCall() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1226:18: ( ruleRuleCall EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1227:2: ruleRuleCall EOF
            {
             markComposite(elementTypeProvider.getRuleCallElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_entryRuleRuleCall3888);
            ruleRuleCall();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRuleCall3891); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1232:1: ruleRuleCall : ( ( ( ruleRuleID ) ) (otherlv_1= '[' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= ']' )? ) ;
    public final void ruleRuleCall() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1232:13: ( ( ( ( ruleRuleID ) ) (otherlv_1= '[' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= ']' )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1233:2: ( ( ( ruleRuleID ) ) (otherlv_1= '[' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= ']' )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1233:2: ( ( ( ruleRuleID ) ) (otherlv_1= '[' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= ']' )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1234:3: ( ( ruleRuleID ) ) (otherlv_1= '[' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= ']' )?
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1234:3: ( ( ruleRuleID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1235:4: ( ruleRuleID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1235:4: ( ruleRuleID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1236:5: ruleRuleID
            {

            					markComposite(elementTypeProvider.getRuleCall_RuleAbstractRuleCrossReference_0_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleRuleID_in_ruleRuleCall3921);
            ruleRuleID();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1245:3: (otherlv_1= '[' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= ']' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==26) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1246:4: otherlv_1= '[' ( (lv_arguments_2_0= ruleNamedArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )* otherlv_5= ']'
                    {

                    				markLeaf(elementTypeProvider.getRuleCall_LeftSquareBracketKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRuleCall3952); 

                    				doneLeaf(otherlv_1);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1253:4: ( (lv_arguments_2_0= ruleNamedArgument ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1254:5: (lv_arguments_2_0= ruleNamedArgument )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1254:5: (lv_arguments_2_0= ruleNamedArgument )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1255:6: lv_arguments_2_0= ruleNamedArgument
                    {

                    						markComposite(elementTypeProvider.getRuleCall_ArgumentsNamedArgumentParserRuleCall_1_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleNamedArgument_in_ruleRuleCall3984);
                    ruleNamedArgument();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1264:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==13) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1265:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleNamedArgument ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getRuleCall_CommaKeyword_1_2_0ElementType());
                    	    				
                    	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRuleCall4021); 

                    	    					doneLeaf(otherlv_3);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1272:5: ( (lv_arguments_4_0= ruleNamedArgument ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1273:6: (lv_arguments_4_0= ruleNamedArgument )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1273:6: (lv_arguments_4_0= ruleNamedArgument )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1274:7: lv_arguments_4_0= ruleNamedArgument
                    	    {

                    	    							markComposite(elementTypeProvider.getRuleCall_ArgumentsNamedArgumentParserRuleCall_1_2_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleNamedArgument_in_ruleRuleCall4058);
                    	    ruleNamedArgument();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    				markLeaf(elementTypeProvider.getRuleCall_RightSquareBracketKeyword_1_3ElementType());
                    			
                    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRuleCall4097); 

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
    // $ANTLR end "ruleRuleCall"


    // $ANTLR start "entryRuleLiteralValue"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1296:1: entryRuleLiteralValue : ruleLiteralValue EOF ;
    public final void entryRuleLiteralValue() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1296:22: ( ruleLiteralValue EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1297:2: ruleLiteralValue EOF
            {
             markComposite(elementTypeProvider.getLiteralValueElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue4123);
            ruleLiteralValue();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralValue4126); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1302:1: ruleLiteralValue : (kw= '!' | kw= '+' ) ;
    public final void ruleLiteralValue() throws RecognitionException {
        Token kw=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1302:17: ( (kw= '!' | kw= '+' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1303:2: (kw= '!' | kw= '+' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1303:2: (kw= '!' | kw= '+' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            else if ( (LA42_0==32) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1304:3: kw= '!'
                    {

                    			markLeaf(elementTypeProvider.getLiteralValue_ExclamationMarkKeyword_0ElementType());
                    		
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleLiteralValue4145); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1312:3: kw= '+'
                    {

                    			markLeaf(elementTypeProvider.getLiteralValue_PlusSignKeyword_1ElementType());
                    		
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleLiteralValue4167); 

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


    // $ANTLR start "entryRuleNamedArgument"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1323:1: entryRuleNamedArgument : ruleNamedArgument EOF ;
    public final void entryRuleNamedArgument() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1323:23: ( ruleNamedArgument EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1324:2: ruleNamedArgument EOF
            {
             markComposite(elementTypeProvider.getNamedArgumentElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedArgument_in_entryRuleNamedArgument4187);
            ruleNamedArgument();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedArgument4190); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1329:1: ruleNamedArgument : ( ( ( (lv_literalValue_0_0= ruleLiteralValue ) ) ( (otherlv_1= RULE_ID ) ) ) | ( ( (otherlv_2= RULE_ID ) ) ( ( (lv_explicitValue_3_0= '=' ) ) ( (otherlv_4= RULE_ID ) ) )? ) ) ;
    public final void ruleNamedArgument() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_explicitValue_3_0=null;
        Token otherlv_4=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1329:18: ( ( ( ( (lv_literalValue_0_0= ruleLiteralValue ) ) ( (otherlv_1= RULE_ID ) ) ) | ( ( (otherlv_2= RULE_ID ) ) ( ( (lv_explicitValue_3_0= '=' ) ) ( (otherlv_4= RULE_ID ) ) )? ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1330:2: ( ( ( (lv_literalValue_0_0= ruleLiteralValue ) ) ( (otherlv_1= RULE_ID ) ) ) | ( ( (otherlv_2= RULE_ID ) ) ( ( (lv_explicitValue_3_0= '=' ) ) ( (otherlv_4= RULE_ID ) ) )? ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1330:2: ( ( ( (lv_literalValue_0_0= ruleLiteralValue ) ) ( (otherlv_1= RULE_ID ) ) ) | ( ( (otherlv_2= RULE_ID ) ) ( ( (lv_explicitValue_3_0= '=' ) ) ( (otherlv_4= RULE_ID ) ) )? ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==32||LA44_0==38) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1331:3: ( ( (lv_literalValue_0_0= ruleLiteralValue ) ) ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1331:3: ( ( (lv_literalValue_0_0= ruleLiteralValue ) ) ( (otherlv_1= RULE_ID ) ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1332:4: ( (lv_literalValue_0_0= ruleLiteralValue ) ) ( (otherlv_1= RULE_ID ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1332:4: ( (lv_literalValue_0_0= ruleLiteralValue ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1333:5: (lv_literalValue_0_0= ruleLiteralValue )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1333:5: (lv_literalValue_0_0= ruleLiteralValue )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1334:6: lv_literalValue_0_0= ruleLiteralValue
                    {

                    						markComposite(elementTypeProvider.getNamedArgument_LiteralValueLiteralValueParserRuleCall_0_0_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralValue_in_ruleNamedArgument4230);
                    ruleLiteralValue();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1343:4: ( (otherlv_1= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1344:5: (otherlv_1= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1344:5: (otherlv_1= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1345:6: otherlv_1= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getNamedArgument_ParameterParameterCrossReference_0_1_0ElementType());
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedArgument4275); 

                    						doneLeaf(otherlv_1);
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1356:3: ( ( (otherlv_2= RULE_ID ) ) ( ( (lv_explicitValue_3_0= '=' ) ) ( (otherlv_4= RULE_ID ) ) )? )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1356:3: ( ( (otherlv_2= RULE_ID ) ) ( ( (lv_explicitValue_3_0= '=' ) ) ( (otherlv_4= RULE_ID ) ) )? )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1357:4: ( (otherlv_2= RULE_ID ) ) ( ( (lv_explicitValue_3_0= '=' ) ) ( (otherlv_4= RULE_ID ) ) )?
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1357:4: ( (otherlv_2= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1358:5: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1358:5: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1359:6: otherlv_2= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getNamedArgument_ParameterParameterCrossReference_1_0_0ElementType());
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedArgument4336); 

                    						doneLeaf(otherlv_2);
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1368:4: ( ( (lv_explicitValue_3_0= '=' ) ) ( (otherlv_4= RULE_ID ) ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==34) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1369:5: ( (lv_explicitValue_3_0= '=' ) ) ( (otherlv_4= RULE_ID ) )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1369:5: ( (lv_explicitValue_3_0= '=' ) )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1370:6: (lv_explicitValue_3_0= '=' )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1370:6: (lv_explicitValue_3_0= '=' )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1371:7: lv_explicitValue_3_0= '='
                            {

                            							markLeaf(elementTypeProvider.getNamedArgument_ExplicitValueEqualsSignKeyword_1_1_0_0ElementType());
                            						
                            lv_explicitValue_3_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleNamedArgument4390); 

                            							doneLeaf(lv_explicitValue_3_0);
                            						

                            }


                            }

                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1380:5: ( (otherlv_4= RULE_ID ) )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1381:6: (otherlv_4= RULE_ID )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1381:6: (otherlv_4= RULE_ID )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1382:7: otherlv_4= RULE_ID
                            {

                            							markLeaf(elementTypeProvider.getNamedArgument_ValueParameterCrossReference_1_1_1_0ElementType());
                            						
                            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedArgument4442); 

                            							doneLeaf(otherlv_4);
                            						

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleNamedArgument"


    // $ANTLR start "entryRuleTerminalRuleCall"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1397:1: entryRuleTerminalRuleCall : ruleTerminalRuleCall EOF ;
    public final void entryRuleTerminalRuleCall() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1397:26: ( ruleTerminalRuleCall EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1398:2: ruleTerminalRuleCall EOF
            {
             markComposite(elementTypeProvider.getTerminalRuleCallElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalRuleCall_in_entryRuleTerminalRuleCall4489);
            ruleTerminalRuleCall();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalRuleCall4492); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1403:1: ruleTerminalRuleCall : ( ( ruleRuleID ) ) ;
    public final void ruleTerminalRuleCall() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1403:21: ( ( ( ruleRuleID ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1404:2: ( ( ruleRuleID ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1404:2: ( ( ruleRuleID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1405:3: ( ruleRuleID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1405:3: ( ruleRuleID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1406:4: ruleRuleID
            {

            				markComposite(elementTypeProvider.getTerminalRuleCall_RuleAbstractRuleCrossReference_0ElementType());
            			
            pushFollow(FollowSets000.FOLLOW_ruleRuleID_in_ruleTerminalRuleCall4515);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1418:1: entryRuleRuleID : ruleRuleID EOF ;
    public final void entryRuleRuleID() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1418:16: ( ruleRuleID EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1419:2: ruleRuleID EOF
            {
             markComposite(elementTypeProvider.getRuleIDElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleRuleID_in_entryRuleRuleID4540);
            ruleRuleID();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRuleID4543); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1424:1: ruleRuleID : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final void ruleRuleID() throws RecognitionException {
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1424:11: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1425:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1425:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1426:3: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {

            			markLeaf(elementTypeProvider.getRuleID_IDTerminalRuleCall_0ElementType());
            		
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRuleID4562); 

            			doneLeaf(this_ID_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1433:3: (kw= '::' this_ID_2= RULE_ID )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==28) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1434:4: kw= '::' this_ID_2= RULE_ID
            	    {

            	    				markLeaf(elementTypeProvider.getRuleID_ColonColonKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRuleID4582); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getRuleID_IDTerminalRuleCall_1_1ElementType());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRuleID4599); 

            	    				doneLeaf(this_ID_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1453:1: entryRulePredicatedKeyword : rulePredicatedKeyword EOF ;
    public final void entryRulePredicatedKeyword() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1453:27: ( rulePredicatedKeyword EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1454:2: rulePredicatedKeyword EOF
            {
             markComposite(elementTypeProvider.getPredicatedKeywordElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicatedKeyword_in_entryRulePredicatedKeyword4625);
            rulePredicatedKeyword();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicatedKeyword4628); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1459:1: rulePredicatedKeyword : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final void rulePredicatedKeyword() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token lv_value_2_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1459:22: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1460:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1460:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1461:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1461:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==39) ) {
                alt46=1;
            }
            else if ( (LA46_0==40) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1462:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1462:4: ( (lv_predicated_0_0= '=>' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1463:5: (lv_predicated_0_0= '=>' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1463:5: (lv_predicated_0_0= '=>' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1464:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedKeyword_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePredicatedKeyword4668); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1474:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1474:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1475:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1475:5: (lv_firstSetPredicated_1_0= '->' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1476:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedKeyword_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePredicatedKeyword4722); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1486:3: ( (lv_value_2_0= RULE_STRING ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1487:4: (lv_value_2_0= RULE_STRING )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1487:4: (lv_value_2_0= RULE_STRING )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1488:5: lv_value_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getPredicatedKeyword_ValueSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePredicatedKeyword4767); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1501:1: entryRulePredicatedRuleCall : rulePredicatedRuleCall EOF ;
    public final void entryRulePredicatedRuleCall() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1501:28: ( rulePredicatedRuleCall EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1502:2: rulePredicatedRuleCall EOF
            {
             markComposite(elementTypeProvider.getPredicatedRuleCallElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicatedRuleCall_in_entryRulePredicatedRuleCall4798);
            rulePredicatedRuleCall();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicatedRuleCall4801); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1507:1: rulePredicatedRuleCall : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final void rulePredicatedRuleCall() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1507:23: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1508:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1508:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1509:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1509:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==39) ) {
                alt47=1;
            }
            else if ( (LA47_0==40) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1510:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1510:4: ( (lv_predicated_0_0= '=>' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1511:5: (lv_predicated_0_0= '=>' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1511:5: (lv_predicated_0_0= '=>' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1512:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedRuleCall_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePredicatedRuleCall4841); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1522:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1522:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1523:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1523:5: (lv_firstSetPredicated_1_0= '->' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1524:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedRuleCall_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePredicatedRuleCall4895); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1534:3: ( (otherlv_2= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1535:4: (otherlv_2= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1535:4: (otherlv_2= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1536:5: otherlv_2= RULE_ID
            {

            					markLeaf(elementTypeProvider.getPredicatedRuleCall_RuleAbstractRuleCrossReference_1_0ElementType());
            				
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePredicatedRuleCall4940); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1549:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1549:20: ( ruleAssignment EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1550:2: ruleAssignment EOF
            {
             markComposite(elementTypeProvider.getAssignmentElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment4971);
            ruleAssignment();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment4974); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1555:1: ruleAssignment : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) ) ;
    public final void ruleAssignment() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token lv_feature_2_0=null;
        Token lv_operator_3_1=null;
        Token lv_operator_3_2=null;
        Token lv_operator_3_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1555:15: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1556:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1556:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1557:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1557:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )?
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==39) ) {
                alt48=1;
            }
            else if ( (LA48_0==40) ) {
                alt48=2;
            }
            switch (alt48) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1558:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1558:4: ( (lv_predicated_0_0= '=>' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1559:5: (lv_predicated_0_0= '=>' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1559:5: (lv_predicated_0_0= '=>' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1560:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getAssignment_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAssignment5014); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1570:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1570:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1571:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1571:5: (lv_firstSetPredicated_1_0= '->' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1572:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getAssignment_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssignment5068); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1582:3: ( (lv_feature_2_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1583:4: (lv_feature_2_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1583:4: (lv_feature_2_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1584:5: lv_feature_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getAssignment_FeatureIDTerminalRuleCall_1_0ElementType());
            				
            lv_feature_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment5114); 

            					doneLeaf(lv_feature_2_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1593:3: ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1594:4: ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1594:4: ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1595:5: (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1595:5: (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt49=1;
                }
                break;
            case 34:
                {
                alt49=2;
                }
                break;
            case 41:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1596:6: lv_operator_3_1= '+='
                    {

                    						markLeaf(elementTypeProvider.getAssignment_OperatorPlusSignEqualsSignKeyword_2_0_0ElementType());
                    					
                    lv_operator_3_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAssignment5160); 

                    						doneLeaf(lv_operator_3_1);
                    					

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1604:6: lv_operator_3_2= '='
                    {

                    						markLeaf(elementTypeProvider.getAssignment_OperatorEqualsSignKeyword_2_0_1ElementType());
                    					
                    lv_operator_3_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAssignment5194); 

                    						doneLeaf(lv_operator_3_2);
                    					

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1612:6: lv_operator_3_3= '?='
                    {

                    						markLeaf(elementTypeProvider.getAssignment_OperatorQuestionMarkEqualsSignKeyword_2_0_2ElementType());
                    					
                    lv_operator_3_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssignment5228); 

                    						doneLeaf(lv_operator_3_3);
                    					

                    }
                    break;

            }


            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1622:3: ( (lv_terminal_4_0= ruleAssignableTerminal ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1623:4: (lv_terminal_4_0= ruleAssignableTerminal )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1623:4: (lv_terminal_4_0= ruleAssignableTerminal )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1624:5: lv_terminal_4_0= ruleAssignableTerminal
            {

            					markComposite(elementTypeProvider.getAssignment_TerminalAssignableTerminalParserRuleCall_3_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_ruleAssignment5273);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1637:1: entryRuleAssignableTerminal : ruleAssignableTerminal EOF ;
    public final void entryRuleAssignableTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1637:28: ( ruleAssignableTerminal EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1638:2: ruleAssignableTerminal EOF
            {
             markComposite(elementTypeProvider.getAssignableTerminalElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_entryRuleAssignableTerminal5304);
            ruleAssignableTerminal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignableTerminal5307); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1643:1: ruleAssignableTerminal : ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference ) ;
    public final void ruleAssignableTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1643:23: ( ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1644:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1644:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference )
            int alt50=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt50=1;
                }
                break;
            case RULE_ID:
                {
                alt50=2;
                }
                break;
            case 15:
                {
                alt50=3;
                }
                break;
            case 26:
                {
                alt50=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1645:3: ruleKeyword
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_KeywordParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleAssignableTerminal5324);
                    ruleKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1653:3: ruleRuleCall
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_RuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleAssignableTerminal5344);
                    ruleRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1661:3: ruleParenthesizedAssignableElement
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_ParenthesizedAssignableElementParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedAssignableElement_in_ruleAssignableTerminal5364);
                    ruleParenthesizedAssignableElement();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1669:3: ruleCrossReference
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_CrossReferenceParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleCrossReference_in_ruleAssignableTerminal5384);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1680:1: entryRuleParenthesizedAssignableElement : ruleParenthesizedAssignableElement EOF ;
    public final void entryRuleParenthesizedAssignableElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1680:40: ( ruleParenthesizedAssignableElement EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1681:2: ruleParenthesizedAssignableElement EOF
            {
             markComposite(elementTypeProvider.getParenthesizedAssignableElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedAssignableElement_in_entryRuleParenthesizedAssignableElement5404);
            ruleParenthesizedAssignableElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedAssignableElement5407); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1686:1: ruleParenthesizedAssignableElement : (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' ) ;
    public final void ruleParenthesizedAssignableElement() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1686:35: ( (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1687:2: (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1687:2: (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1688:3: otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')'
            {

            			markLeaf(elementTypeProvider.getParenthesizedAssignableElement_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedAssignableElement5426); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParenthesizedAssignableElement_AssignableAlternativesParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAssignableAlternatives_in_ruleParenthesizedAssignableElement5438);
            ruleAssignableAlternatives();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParenthesizedAssignableElement_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParenthesizedAssignableElement5452); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1713:1: entryRuleAssignableAlternatives : ruleAssignableAlternatives EOF ;
    public final void entryRuleAssignableAlternatives() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1713:32: ( ruleAssignableAlternatives EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1714:2: ruleAssignableAlternatives EOF
            {
             markComposite(elementTypeProvider.getAssignableAlternativesElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignableAlternatives_in_entryRuleAssignableAlternatives5472);
            ruleAssignableAlternatives();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignableAlternatives5475); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1719:1: ruleAssignableAlternatives : ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? ) ;
    public final void ruleAssignableAlternatives() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1719:27: ( ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1720:2: ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1720:2: ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1721:3: ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getAssignableAlternatives_AssignableTerminalParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives5492);
            ruleAssignableTerminal();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1728:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==29) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1729:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1729:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1730:5: 
                    {

                    					precedeComposite(elementTypeProvider.getAssignableAlternatives_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1735:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==29) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1736:5: otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getAssignableAlternatives_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAssignableAlternatives5535); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1743:5: ( (lv_elements_3_0= ruleAssignableTerminal ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1744:6: (lv_elements_3_0= ruleAssignableTerminal )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1744:6: (lv_elements_3_0= ruleAssignableTerminal )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1745:7: lv_elements_3_0= ruleAssignableTerminal
                    	    {

                    	    							markComposite(elementTypeProvider.getAssignableAlternatives_ElementsAssignableTerminalParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives5572);
                    	    ruleAssignableTerminal();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt51 >= 1 ) break loop51;
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                throw eee;
                        }
                        cnt51++;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1760:1: entryRuleCrossReference : ruleCrossReference EOF ;
    public final void entryRuleCrossReference() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1760:24: ( ruleCrossReference EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1761:2: ruleCrossReference EOF
            {
             markComposite(elementTypeProvider.getCrossReferenceElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleCrossReference_in_entryRuleCrossReference5620);
            ruleCrossReference();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCrossReference5623); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1766:1: ruleCrossReference : (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) ;
    public final void ruleCrossReference() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1766:19: ( (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1767:2: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1767:2: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1768:3: otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']'
            {

            			markLeaf(elementTypeProvider.getCrossReference_LeftSquareBracketKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCrossReference5642); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1775:3: ( (lv_type_1_0= ruleTypeRef ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1776:4: (lv_type_1_0= ruleTypeRef )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1776:4: (lv_type_1_0= ruleTypeRef )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1777:5: lv_type_1_0= ruleTypeRef
            {

            					markComposite(elementTypeProvider.getCrossReference_TypeTypeRefParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleCrossReference5669);
            ruleTypeRef();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1786:3: (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==29) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1787:4: otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    {

                    				markLeaf(elementTypeProvider.getCrossReference_VerticalLineKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCrossReference5700); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1794:4: ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1795:5: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1795:5: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1796:6: lv_terminal_3_0= ruleCrossReferenceableTerminal
                    {

                    						markComposite(elementTypeProvider.getCrossReference_TerminalCrossReferenceableTerminalParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleCrossReferenceableTerminal_in_ruleCrossReference5732);
                    ruleCrossReferenceableTerminal();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getCrossReference_RightSquareBracketKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCrossReference5765); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1817:1: entryRuleCrossReferenceableTerminal : ruleCrossReferenceableTerminal EOF ;
    public final void entryRuleCrossReferenceableTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1817:36: ( ruleCrossReferenceableTerminal EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1818:2: ruleCrossReferenceableTerminal EOF
            {
             markComposite(elementTypeProvider.getCrossReferenceableTerminalElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleCrossReferenceableTerminal_in_entryRuleCrossReferenceableTerminal5785);
            ruleCrossReferenceableTerminal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCrossReferenceableTerminal5788); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1823:1: ruleCrossReferenceableTerminal : ( ruleKeyword | ruleRuleCall ) ;
    public final void ruleCrossReferenceableTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1823:31: ( ( ruleKeyword | ruleRuleCall ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1824:2: ( ruleKeyword | ruleRuleCall )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1824:2: ( ruleKeyword | ruleRuleCall )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_STRING) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_ID) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1825:3: ruleKeyword
                    {

                    			markComposite(elementTypeProvider.getCrossReferenceableTerminal_KeywordParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleCrossReferenceableTerminal5805);
                    ruleKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1833:3: ruleRuleCall
                    {

                    			markComposite(elementTypeProvider.getCrossReferenceableTerminal_RuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleCrossReferenceableTerminal5825);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1844:1: entryRuleParenthesizedElement : ruleParenthesizedElement EOF ;
    public final void entryRuleParenthesizedElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1844:30: ( ruleParenthesizedElement EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1845:2: ruleParenthesizedElement EOF
            {
             markComposite(elementTypeProvider.getParenthesizedElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement5845);
            ruleParenthesizedElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedElement5848); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1850:1: ruleParenthesizedElement : (otherlv_0= '(' ruleAlternatives otherlv_2= ')' ) ;
    public final void ruleParenthesizedElement() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1850:25: ( (otherlv_0= '(' ruleAlternatives otherlv_2= ')' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1851:2: (otherlv_0= '(' ruleAlternatives otherlv_2= ')' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1851:2: (otherlv_0= '(' ruleAlternatives otherlv_2= ')' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1852:3: otherlv_0= '(' ruleAlternatives otherlv_2= ')'
            {

            			markLeaf(elementTypeProvider.getParenthesizedElement_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedElement5867); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParenthesizedElement_AlternativesParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_ruleParenthesizedElement5879);
            ruleAlternatives();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParenthesizedElement_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParenthesizedElement5893); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1877:1: entryRulePredicatedGroup : rulePredicatedGroup EOF ;
    public final void entryRulePredicatedGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1877:25: ( rulePredicatedGroup EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1878:2: rulePredicatedGroup EOF
            {
             markComposite(elementTypeProvider.getPredicatedGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicatedGroup_in_entryRulePredicatedGroup5913);
            rulePredicatedGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicatedGroup5916); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1883:1: rulePredicatedGroup : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' ) ;
    public final void rulePredicatedGroup() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1883:20: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1884:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1884:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1885:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')'
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1885:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==39) ) {
                alt55=1;
            }
            else if ( (LA55_0==40) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1886:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1886:4: ( (lv_predicated_0_0= '=>' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1887:5: (lv_predicated_0_0= '=>' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1887:5: (lv_predicated_0_0= '=>' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1888:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedGroup_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePredicatedGroup5956); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1898:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1898:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1899:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1899:5: (lv_firstSetPredicated_1_0= '->' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1900:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedGroup_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePredicatedGroup6010); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getPredicatedGroup_LeftParenthesisKeyword_1ElementType());
            		
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePredicatedGroup6042); 

            			doneLeaf(otherlv_2);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1917:3: ( (lv_elements_3_0= ruleAlternatives ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1918:4: (lv_elements_3_0= ruleAlternatives )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1918:4: (lv_elements_3_0= ruleAlternatives )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1919:5: lv_elements_3_0= ruleAlternatives
            {

            					markComposite(elementTypeProvider.getPredicatedGroup_ElementsAlternativesParserRuleCall_2_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_rulePredicatedGroup6069);
            ruleAlternatives();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getPredicatedGroup_RightParenthesisKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePredicatedGroup6094); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1939:1: entryRuleTerminalRule : ruleTerminalRule EOF ;
    public final void entryRuleTerminalRule() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1939:22: ( ruleTerminalRule EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1940:2: ruleTerminalRule EOF
            {
             markComposite(elementTypeProvider.getTerminalRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalRule_in_entryRuleTerminalRule6114);
            ruleTerminalRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalRule6117); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1945:1: ruleTerminalRule : (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' ) ;
    public final void ruleTerminalRule() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_fragment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1945:17: ( (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1946:2: (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1946:2: (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1947:3: otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';'
            {

            			markLeaf(elementTypeProvider.getTerminalRule_TerminalKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleTerminalRule6136); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1954:3: ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==21) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_ID) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1955:4: ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1955:4: ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1956:5: ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1956:5: ( (lv_fragment_1_0= 'fragment' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1957:6: (lv_fragment_1_0= 'fragment' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1957:6: (lv_fragment_1_0= 'fragment' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1958:7: lv_fragment_1_0= 'fragment'
                    {

                    							markLeaf(elementTypeProvider.getTerminalRule_FragmentFragmentKeyword_1_0_0_0ElementType());
                    						
                    lv_fragment_1_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTerminalRule6180); 

                    							doneLeaf(lv_fragment_1_0);
                    						

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1967:5: ( (lv_name_2_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1968:6: (lv_name_2_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1968:6: (lv_name_2_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1969:7: lv_name_2_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getTerminalRule_NameIDTerminalRuleCall_1_0_1_0ElementType());
                    						
                    lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTerminalRule6232); 

                    							doneLeaf(lv_name_2_0);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1980:4: ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1980:4: ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1981:5: ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )?
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1981:5: ( (lv_name_3_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1982:6: (lv_name_3_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1982:6: (lv_name_3_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1983:7: lv_name_3_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getTerminalRule_NameIDTerminalRuleCall_1_1_0_0ElementType());
                    						
                    lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTerminalRule6303); 

                    							doneLeaf(lv_name_3_0);
                    						

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1992:5: (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==23) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1993:6: otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) )
                            {

                            						markLeaf(elementTypeProvider.getTerminalRule_ReturnsKeyword_1_1_1_0ElementType());
                            					
                            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTerminalRule6346); 

                            						doneLeaf(otherlv_4);
                            					
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2000:6: ( (lv_type_5_0= ruleTypeRef ) )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2001:7: (lv_type_5_0= ruleTypeRef )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2001:7: (lv_type_5_0= ruleTypeRef )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2002:8: lv_type_5_0= ruleTypeRef
                            {

                            								markComposite(elementTypeProvider.getTerminalRule_TypeTypeRefParserRuleCall_1_1_1_1_0ElementType());
                            							
                            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleTerminalRule6388);
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
            		
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTerminalRule6438); 

            			doneLeaf(otherlv_6);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2021:3: ( (lv_alternatives_7_0= ruleTerminalAlternatives ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2022:4: (lv_alternatives_7_0= ruleTerminalAlternatives )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2022:4: (lv_alternatives_7_0= ruleTerminalAlternatives )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2023:5: lv_alternatives_7_0= ruleTerminalAlternatives
            {

            					markComposite(elementTypeProvider.getTerminalRule_AlternativesTerminalAlternativesParserRuleCall_3_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTerminalAlternatives_in_ruleTerminalRule6465);
            ruleTerminalAlternatives();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getTerminalRule_SemicolonKeyword_4ElementType());
            		
            otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTerminalRule6490); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2043:1: entryRuleTerminalAlternatives : ruleTerminalAlternatives EOF ;
    public final void entryRuleTerminalAlternatives() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2043:30: ( ruleTerminalAlternatives EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2044:2: ruleTerminalAlternatives EOF
            {
             markComposite(elementTypeProvider.getTerminalAlternativesElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalAlternatives_in_entryRuleTerminalAlternatives6510);
            ruleTerminalAlternatives();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalAlternatives6513); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2049:1: ruleTerminalAlternatives : ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? ) ;
    public final void ruleTerminalAlternatives() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2049:25: ( ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2050:2: ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2050:2: ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2051:3: ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getTerminalAlternatives_TerminalGroupParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives6530);
            ruleTerminalGroup();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2058:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==29) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2059:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2059:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2060:5: 
                    {

                    					precedeComposite(elementTypeProvider.getTerminalAlternatives_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2065:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==29) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2066:5: otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getTerminalAlternatives_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTerminalAlternatives6573); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2073:5: ( (lv_elements_3_0= ruleTerminalGroup ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2074:6: (lv_elements_3_0= ruleTerminalGroup )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2074:6: (lv_elements_3_0= ruleTerminalGroup )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2075:7: lv_elements_3_0= ruleTerminalGroup
                    	    {

                    	    							markComposite(elementTypeProvider.getTerminalAlternatives_ElementsTerminalGroupParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives6610);
                    	    ruleTerminalGroup();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt58 >= 1 ) break loop58;
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2090:1: entryRuleTerminalGroup : ruleTerminalGroup EOF ;
    public final void entryRuleTerminalGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2090:23: ( ruleTerminalGroup EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2091:2: ruleTerminalGroup EOF
            {
             markComposite(elementTypeProvider.getTerminalGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalGroup_in_entryRuleTerminalGroup6658);
            ruleTerminalGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalGroup6661); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2096:1: ruleTerminalGroup : ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? ) ;
    public final void ruleTerminalGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2096:18: ( ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2097:2: ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2097:2: ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2098:3: ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )?
            {

            			markComposite(elementTypeProvider.getTerminalGroup_TerminalTokenParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerminalToken_in_ruleTerminalGroup6678);
            ruleTerminalToken();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2105:3: ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_STRING)||LA61_0==15||LA61_0==17||LA61_0==38||LA61_0==40||LA61_0==43) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2106:4: () ( (lv_elements_2_0= ruleTerminalToken ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2106:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2107:5: 
                    {

                    					precedeComposite(elementTypeProvider.getTerminalGroup_GroupElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2112:4: ( (lv_elements_2_0= ruleTerminalToken ) )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_STRING)||LA60_0==15||LA60_0==17||LA60_0==38||LA60_0==40||LA60_0==43) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2113:5: (lv_elements_2_0= ruleTerminalToken )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2113:5: (lv_elements_2_0= ruleTerminalToken )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2114:6: lv_elements_2_0= ruleTerminalToken
                    	    {

                    	    						markComposite(elementTypeProvider.getTerminalGroup_ElementsTerminalTokenParserRuleCall_1_1_0ElementType());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_ruleTerminalToken_in_ruleTerminalGroup6729);
                    	    ruleTerminalToken();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2128:1: entryRuleTerminalToken : ruleTerminalToken EOF ;
    public final void entryRuleTerminalToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2128:23: ( ruleTerminalToken EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2129:2: ruleTerminalToken EOF
            {
             markComposite(elementTypeProvider.getTerminalTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalToken_in_entryRuleTerminalToken6769);
            ruleTerminalToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalToken6772); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2134:1: ruleTerminalToken : ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) ;
    public final void ruleTerminalToken() throws RecognitionException {
        Token lv_cardinality_1_1=null;
        Token lv_cardinality_1_2=null;
        Token lv_cardinality_1_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2134:18: ( ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2135:2: ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2135:2: ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2136:3: ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            {

            			markComposite(elementTypeProvider.getTerminalToken_TerminalTokenElementParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_ruleTerminalToken6789);
            ruleTerminalTokenElement();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2143:3: ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==22||(LA63_0>=31 && LA63_0<=32)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2144:4: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2144:4: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2145:5: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2145:5: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    int alt62=3;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt62=1;
                        }
                        break;
                    case 22:
                        {
                        alt62=2;
                        }
                        break;
                    case 32:
                        {
                        alt62=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }

                    switch (alt62) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2146:6: lv_cardinality_1_1= '?'
                            {

                            						markLeaf(elementTypeProvider.getTerminalToken_CardinalityQuestionMarkKeyword_1_0_0ElementType());
                            					
                            lv_cardinality_1_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTerminalToken6824); 

                            						doneLeaf(lv_cardinality_1_1);
                            					

                            }
                            break;
                        case 2 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2154:6: lv_cardinality_1_2= '*'
                            {

                            						markLeaf(elementTypeProvider.getTerminalToken_CardinalityAsteriskKeyword_1_0_1ElementType());
                            					
                            lv_cardinality_1_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTerminalToken6858); 

                            						doneLeaf(lv_cardinality_1_2);
                            					

                            }
                            break;
                        case 3 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2162:6: lv_cardinality_1_3= '+'
                            {

                            						markLeaf(elementTypeProvider.getTerminalToken_CardinalityPlusSignKeyword_1_0_2ElementType());
                            					
                            lv_cardinality_1_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTerminalToken6892); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2176:1: entryRuleTerminalTokenElement : ruleTerminalTokenElement EOF ;
    public final void entryRuleTerminalTokenElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2176:30: ( ruleTerminalTokenElement EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2177:2: ruleTerminalTokenElement EOF
            {
             markComposite(elementTypeProvider.getTerminalTokenElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_entryRuleTerminalTokenElement6931);
            ruleTerminalTokenElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalTokenElement6934); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2182:1: ruleTerminalTokenElement : ( ruleCharacterRange | ruleTerminalRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF ) ;
    public final void ruleTerminalTokenElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2182:25: ( ( ruleCharacterRange | ruleTerminalRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2183:2: ( ruleCharacterRange | ruleTerminalRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2183:2: ( ruleCharacterRange | ruleTerminalRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF )
            int alt64=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt64=1;
                }
                break;
            case RULE_ID:
                {
                alt64=2;
                }
                break;
            case 15:
                {
                alt64=3;
                }
                break;
            case 38:
            case 40:
                {
                alt64=4;
                }
                break;
            case 17:
                {
                alt64=5;
                }
                break;
            case 43:
                {
                alt64=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2184:3: ruleCharacterRange
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_CharacterRangeParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleCharacterRange_in_ruleTerminalTokenElement6951);
                    ruleCharacterRange();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2192:3: ruleTerminalRuleCall
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_TerminalRuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleTerminalRuleCall_in_ruleTerminalTokenElement6971);
                    ruleTerminalRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2200:3: ruleParenthesizedTerminalElement
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_ParenthesizedTerminalElementParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedTerminalElement_in_ruleTerminalTokenElement6991);
                    ruleParenthesizedTerminalElement();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2208:3: ruleAbstractNegatedToken
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_AbstractNegatedTokenParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNegatedToken_in_ruleTerminalTokenElement7011);
                    ruleAbstractNegatedToken();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 5 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2216:3: ruleWildcard
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_WildcardParserRuleCall_4ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleWildcard_in_ruleTerminalTokenElement7031);
                    ruleWildcard();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 6 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2224:3: ruleEOF
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_EOFParserRuleCall_5ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleEOF_in_ruleTerminalTokenElement7051);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2235:1: entryRuleParenthesizedTerminalElement : ruleParenthesizedTerminalElement EOF ;
    public final void entryRuleParenthesizedTerminalElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2235:38: ( ruleParenthesizedTerminalElement EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2236:2: ruleParenthesizedTerminalElement EOF
            {
             markComposite(elementTypeProvider.getParenthesizedTerminalElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedTerminalElement_in_entryRuleParenthesizedTerminalElement7071);
            ruleParenthesizedTerminalElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedTerminalElement7074); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2241:1: ruleParenthesizedTerminalElement : (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' ) ;
    public final void ruleParenthesizedTerminalElement() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2241:33: ( (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2242:2: (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2242:2: (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2243:3: otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')'
            {

            			markLeaf(elementTypeProvider.getParenthesizedTerminalElement_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedTerminalElement7093); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParenthesizedTerminalElement_TerminalAlternativesParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerminalAlternatives_in_ruleParenthesizedTerminalElement7105);
            ruleTerminalAlternatives();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParenthesizedTerminalElement_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParenthesizedTerminalElement7119); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2268:1: entryRuleAbstractNegatedToken : ruleAbstractNegatedToken EOF ;
    public final void entryRuleAbstractNegatedToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2268:30: ( ruleAbstractNegatedToken EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2269:2: ruleAbstractNegatedToken EOF
            {
             markComposite(elementTypeProvider.getAbstractNegatedTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNegatedToken_in_entryRuleAbstractNegatedToken7139);
            ruleAbstractNegatedToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNegatedToken7142); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2274:1: ruleAbstractNegatedToken : ( ruleNegatedToken | ruleUntilToken ) ;
    public final void ruleAbstractNegatedToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2274:25: ( ( ruleNegatedToken | ruleUntilToken ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2275:2: ( ruleNegatedToken | ruleUntilToken )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2275:2: ( ruleNegatedToken | ruleUntilToken )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==38) ) {
                alt65=1;
            }
            else if ( (LA65_0==40) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2276:3: ruleNegatedToken
                    {

                    			markComposite(elementTypeProvider.getAbstractNegatedToken_NegatedTokenParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleNegatedToken_in_ruleAbstractNegatedToken7159);
                    ruleNegatedToken();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2284:3: ruleUntilToken
                    {

                    			markComposite(elementTypeProvider.getAbstractNegatedToken_UntilTokenParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleUntilToken_in_ruleAbstractNegatedToken7179);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2295:1: entryRuleNegatedToken : ruleNegatedToken EOF ;
    public final void entryRuleNegatedToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2295:22: ( ruleNegatedToken EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2296:2: ruleNegatedToken EOF
            {
             markComposite(elementTypeProvider.getNegatedTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNegatedToken_in_entryRuleNegatedToken7199);
            ruleNegatedToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegatedToken7202); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2301:1: ruleNegatedToken : (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final void ruleNegatedToken() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2301:17: ( (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2302:2: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2302:2: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2303:3: otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {

            			markLeaf(elementTypeProvider.getNegatedToken_ExclamationMarkKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleNegatedToken7221); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2310:3: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2311:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2311:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2312:5: lv_terminal_1_0= ruleTerminalTokenElement
            {

            					markComposite(elementTypeProvider.getNegatedToken_TerminalTerminalTokenElementParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_ruleNegatedToken7248);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2325:1: entryRuleUntilToken : ruleUntilToken EOF ;
    public final void entryRuleUntilToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2325:20: ( ruleUntilToken EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2326:2: ruleUntilToken EOF
            {
             markComposite(elementTypeProvider.getUntilTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleUntilToken_in_entryRuleUntilToken7279);
            ruleUntilToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUntilToken7282); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2331:1: ruleUntilToken : (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final void ruleUntilToken() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2331:15: ( (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2332:2: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2332:2: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2333:3: otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {

            			markLeaf(elementTypeProvider.getUntilToken_HyphenMinusGreaterThanSignKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleUntilToken7301); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2340:3: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2341:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2341:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2342:5: lv_terminal_1_0= ruleTerminalTokenElement
            {

            					markComposite(elementTypeProvider.getUntilToken_TerminalTerminalTokenElementParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_ruleUntilToken7328);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2355:1: entryRuleWildcard : ruleWildcard EOF ;
    public final void entryRuleWildcard() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2355:18: ( ruleWildcard EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2356:2: ruleWildcard EOF
            {
             markComposite(elementTypeProvider.getWildcardElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleWildcard_in_entryRuleWildcard7359);
            ruleWildcard();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWildcard7362); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2361:1: ruleWildcard : ( () otherlv_1= '.' ) ;
    public final void ruleWildcard() throws RecognitionException {
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2361:13: ( ( () otherlv_1= '.' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2362:2: ( () otherlv_1= '.' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2362:2: ( () otherlv_1= '.' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2363:3: () otherlv_1= '.'
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2363:3: ()
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2364:4: 
            {

            				precedeComposite(elementTypeProvider.getWildcard_WildcardAction_0ElementType());
            				doneComposite();
            			

            }


            			markLeaf(elementTypeProvider.getWildcard_FullStopKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWildcard7394); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2380:1: entryRuleEOF : ruleEOF EOF ;
    public final void entryRuleEOF() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2380:13: ( ruleEOF EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2381:2: ruleEOF EOF
            {
             markComposite(elementTypeProvider.getEOFElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleEOF_in_entryRuleEOF7414);
            ruleEOF();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEOF7417); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2386:1: ruleEOF : ( () otherlv_1= 'EOF' ) ;
    public final void ruleEOF() throws RecognitionException {
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2386:8: ( ( () otherlv_1= 'EOF' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2387:2: ( () otherlv_1= 'EOF' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2387:2: ( () otherlv_1= 'EOF' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2388:3: () otherlv_1= 'EOF'
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2388:3: ()
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2389:4: 
            {

            				precedeComposite(elementTypeProvider.getEOF_EOFAction_0ElementType());
            				doneComposite();
            			

            }


            			markLeaf(elementTypeProvider.getEOF_EOFKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEOF7449); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2405:1: entryRuleCharacterRange : ruleCharacterRange EOF ;
    public final void entryRuleCharacterRange() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2405:24: ( ruleCharacterRange EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2406:2: ruleCharacterRange EOF
            {
             markComposite(elementTypeProvider.getCharacterRangeElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleCharacterRange_in_entryRuleCharacterRange7469);
            ruleCharacterRange();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCharacterRange7472); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2411:1: ruleCharacterRange : ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) ;
    public final void ruleCharacterRange() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2411:19: ( ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2412:2: ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2412:2: ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2413:3: ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            {

            			markComposite(elementTypeProvider.getCharacterRange_KeywordParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleCharacterRange7489);
            ruleKeyword();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2420:3: ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==44) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2421:4: () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2421:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2422:5: 
                    {

                    					precedeComposite(elementTypeProvider.getCharacterRange_CharacterRangeLeftAction_1_0ElementType());
                    					doneComposite();
                    				

                    }


                    				markLeaf(elementTypeProvider.getCharacterRange_FullStopFullStopKeyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleCharacterRange7525); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2434:4: ( (lv_right_3_0= ruleKeyword ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2435:5: (lv_right_3_0= ruleKeyword )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2435:5: (lv_right_3_0= ruleKeyword )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2436:6: lv_right_3_0= ruleKeyword
                    {

                    						markComposite(elementTypeProvider.getCharacterRange_RightKeywordParserRuleCall_1_2_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleCharacterRange7557);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2450:1: entryRuleEnumRule : ruleEnumRule EOF ;
    public final void entryRuleEnumRule() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2450:18: ( ruleEnumRule EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2451:2: ruleEnumRule EOF
            {
             markComposite(elementTypeProvider.getEnumRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumRule_in_entryRuleEnumRule7596);
            ruleEnumRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumRule7599); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2456:1: ruleEnumRule : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' ) ;
    public final void ruleEnumRule() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2456:13: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2457:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2457:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2458:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';'
            {

            			markLeaf(elementTypeProvider.getEnumRule_EnumKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEnumRule7618); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2465:3: ( (lv_name_1_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2466:4: (lv_name_1_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2466:4: (lv_name_1_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2467:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getEnumRule_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumRule7645); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2476:3: (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==23) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2477:4: otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) )
                    {

                    				markLeaf(elementTypeProvider.getEnumRule_ReturnsKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEnumRule7676); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2484:4: ( (lv_type_3_0= ruleTypeRef ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2485:5: (lv_type_3_0= ruleTypeRef )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2485:5: (lv_type_3_0= ruleTypeRef )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2486:6: lv_type_3_0= ruleTypeRef
                    {

                    						markComposite(elementTypeProvider.getEnumRule_TypeTypeRefParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleEnumRule7708);
                    ruleTypeRef();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getEnumRule_ColonKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEnumRule7741); 

            			doneLeaf(otherlv_4);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2503:3: ( (lv_alternatives_5_0= ruleEnumLiterals ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2504:4: (lv_alternatives_5_0= ruleEnumLiterals )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2504:4: (lv_alternatives_5_0= ruleEnumLiterals )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2505:5: lv_alternatives_5_0= ruleEnumLiterals
            {

            					markComposite(elementTypeProvider.getEnumRule_AlternativesEnumLiteralsParserRuleCall_4_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiterals_in_ruleEnumRule7768);
            ruleEnumLiterals();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEnumRule_SemicolonKeyword_5ElementType());
            		
            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEnumRule7793); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2525:1: entryRuleEnumLiterals : ruleEnumLiterals EOF ;
    public final void entryRuleEnumLiterals() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2525:22: ( ruleEnumLiterals EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2526:2: ruleEnumLiterals EOF
            {
             markComposite(elementTypeProvider.getEnumLiteralsElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiterals_in_entryRuleEnumLiterals7813);
            ruleEnumLiterals();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumLiterals7816); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2531:1: ruleEnumLiterals : ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) ;
    public final void ruleEnumLiterals() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2531:17: ( ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2532:2: ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2532:2: ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2533:3: ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getEnumLiterals_EnumLiteralDeclarationParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals7833);
            ruleEnumLiteralDeclaration();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2540:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==29) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2541:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2541:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2542:5: 
                    {

                    					precedeComposite(elementTypeProvider.getEnumLiterals_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2547:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+
                    int cnt68=0;
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==29) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2548:5: otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getEnumLiterals_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEnumLiterals7876); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2555:5: ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2556:6: (lv_elements_3_0= ruleEnumLiteralDeclaration )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2556:6: (lv_elements_3_0= ruleEnumLiteralDeclaration )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2557:7: lv_elements_3_0= ruleEnumLiteralDeclaration
                    	    {

                    	    							markComposite(elementTypeProvider.getEnumLiterals_ElementsEnumLiteralDeclarationParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals7913);
                    	    ruleEnumLiteralDeclaration();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt68 >= 1 ) break loop68;
                                EarlyExitException eee =
                                    new EarlyExitException(68, input);
                                throw eee;
                        }
                        cnt68++;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2572:1: entryRuleEnumLiteralDeclaration : ruleEnumLiteralDeclaration EOF ;
    public final void entryRuleEnumLiteralDeclaration() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2572:32: ( ruleEnumLiteralDeclaration EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2573:2: ruleEnumLiteralDeclaration EOF
            {
             markComposite(elementTypeProvider.getEnumLiteralDeclarationElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDeclaration_in_entryRuleEnumLiteralDeclaration7961);
            ruleEnumLiteralDeclaration();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumLiteralDeclaration7964); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2578:1: ruleEnumLiteralDeclaration : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) ;
    public final void ruleEnumLiteralDeclaration() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2578:27: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2579:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2579:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2580:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2580:3: ( (otherlv_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2581:4: (otherlv_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2581:4: (otherlv_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2582:5: otherlv_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getEnumLiteralDeclaration_EnumLiteralEEnumLiteralCrossReference_0_0ElementType());
            				
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumLiteralDeclaration7996); 

            					doneLeaf(otherlv_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2591:3: (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==34) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2592:4: otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) )
                    {

                    				markLeaf(elementTypeProvider.getEnumLiteralDeclaration_EqualsSignKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEnumLiteralDeclaration8027); 

                    				doneLeaf(otherlv_1);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2599:4: ( (lv_literal_2_0= ruleKeyword ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2600:5: (lv_literal_2_0= ruleKeyword )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2600:5: (lv_literal_2_0= ruleKeyword )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2601:6: lv_literal_2_0= ruleKeyword
                    {

                    						markComposite(elementTypeProvider.getEnumLiteralDeclaration_LiteralKeywordParserRuleCall_1_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleEnumLiteralDeclaration8059);
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
        public static final BitSet FOLLOW_14_in_ruleGrammar299 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGrammar329 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGrammar370 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleGrammar413 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGrammar455 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_ruleGrammar504 = new BitSet(new long[]{0x0000240000345010L});
        public static final BitSet FOLLOW_ruleAbstractMetamodelDeclaration_in_ruleGrammar537 = new BitSet(new long[]{0x0000240000345010L});
        public static final BitSet FOLLOW_ruleAbstractRule_in_ruleGrammar576 = new BitSet(new long[]{0x0000240000345012L});
        public static final BitSet FOLLOW_ruleGrammarID_in_entryRuleGrammarID608 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrammarID611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGrammarID630 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleGrammarID650 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGrammarID667 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleAbstractRule_in_entryRuleAbstractRule693 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractRule696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParserRule_in_ruleAbstractRule713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalRule_in_ruleAbstractRule733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumRule_in_ruleAbstractRule753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractMetamodelDeclaration_in_entryRuleAbstractMetamodelDeclaration773 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractMetamodelDeclaration776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneratedMetamodel_in_ruleAbstractMetamodelDeclaration793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferencedMetamodel_in_ruleAbstractMetamodelDeclaration813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneratedMetamodel_in_entryRuleGeneratedMetamodel833 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGeneratedMetamodel836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleGeneratedMetamodel855 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGeneratedMetamodel882 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleGeneratedMetamodel920 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleGeneratedMetamodel951 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGeneratedMetamodel983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferencedMetamodel_in_entryRuleReferencedMetamodel1022 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferencedMetamodel1025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleReferencedMetamodel1044 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleReferencedMetamodel1071 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleReferencedMetamodel1102 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleReferencedMetamodel1134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParserRule_in_entryRuleParserRule1173 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParserRule1176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleParserRule1225 = new BitSet(new long[]{0x0000000000200010L});
        public static final BitSet FOLLOW_ruleRuleNameAndParams_in_ruleParserRule1258 = new BitSet(new long[]{0x0000000001C04000L});
        public static final BitSet FOLLOW_22_in_ruleParserRule1305 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_23_in_ruleParserRule1365 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleParserRule1412 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_ruleRuleNameAndParams_in_ruleParserRule1484 = new BitSet(new long[]{0x0000000001804000L});
        public static final BitSet FOLLOW_23_in_ruleParserRule1512 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleParserRule1554 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_14_in_ruleParserRule1625 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleParserRule1655 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParserRule1696 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleParserRule1739 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParserRule1781 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_ruleParserRule1830 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleParserRule1850 = new BitSet(new long[]{0x0000018204008030L});
        public static final BitSet FOLLOW_ruleAlternatives_in_ruleParserRule1877 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleParserRule1902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRuleNameAndParams1943 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleRuleNameAndParams1974 = new BitSet(new long[]{0x0000000008000010L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleRuleNameAndParams2015 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_13_in_ruleRuleNameAndParams2058 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleRuleNameAndParams2100 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_27_in_ruleRuleNameAndParams2149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2175 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter2178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef2228 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef2231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeRef2271 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleTypeRef2301 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeRef2334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives2365 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives2368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionalBranch_in_ruleAlternatives2385 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleAlternatives2428 = new BitSet(new long[]{0x0000018204008030L});
        public static final BitSet FOLLOW_ruleConditionalBranch_in_ruleAlternatives2465 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleConditionalBranch_in_entryRuleConditionalBranch2513 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditionalBranch2516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroup_in_ruleConditionalBranch2533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleConditionalBranch2577 = new BitSet(new long[]{0x0000004100000000L});
        public static final BitSet FOLLOW_ruleGuardCondition_in_ruleConditionalBranch2609 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_13_in_ruleConditionalBranch2646 = new BitSet(new long[]{0x0000004100000000L});
        public static final BitSet FOLLOW_ruleGuardCondition_in_ruleConditionalBranch2683 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_27_in_ruleConditionalBranch2722 = new BitSet(new long[]{0x0000018200008030L});
        public static final BitSet FOLLOW_ruleAbstractToken_in_ruleConditionalBranch2754 = new BitSet(new long[]{0x0000018200008032L});
        public static final BitSet FOLLOW_ruleGuardCondition_in_entryRuleGuardCondition2793 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGuardCondition2796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralValue_in_ruleGuardCondition2828 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGuardCondition2866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroup_in_entryRuleUnorderedGroup2897 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedGroup2900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleUnorderedGroup2917 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleUnorderedGroup2960 = new BitSet(new long[]{0x0000018200008030L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleUnorderedGroup2997 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup3045 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup3048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractToken_in_ruleGroup3065 = new BitSet(new long[]{0x0000018200008032L});
        public static final BitSet FOLLOW_ruleAbstractToken_in_ruleGroup3116 = new BitSet(new long[]{0x0000018200008032L});
        public static final BitSet FOLLOW_ruleAbstractToken_in_entryRuleAbstractToken3156 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractToken3159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractTokenWithCardinality_in_ruleAbstractToken3176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_ruleAbstractToken3196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractTokenWithCardinality_in_entryRuleAbstractTokenWithCardinality3216 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractTokenWithCardinality3219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleAbstractTokenWithCardinality3242 = new BitSet(new long[]{0x0000000180400002L});
        public static final BitSet FOLLOW_ruleAbstractTerminal_in_ruleAbstractTokenWithCardinality3266 = new BitSet(new long[]{0x0000000180400002L});
        public static final BitSet FOLLOW_31_in_ruleAbstractTokenWithCardinality3306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAbstractTokenWithCardinality3340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleAbstractTokenWithCardinality3374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction3413 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction3416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleAction3435 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleAction3462 = new BitSet(new long[]{0x0000002000020000L});
        public static final BitSet FOLLOW_17_in_ruleAction3493 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAction3525 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_34_in_ruleAction3579 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_35_in_ruleAction3617 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleAction3655 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleAction3675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractTerminal_in_entryRuleAbstractTerminal3695 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractTerminal3698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleAbstractTerminal3715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleAbstractTerminal3735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedElement_in_ruleAbstractTerminal3755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedKeyword_in_ruleAbstractTerminal3775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedRuleCall_in_ruleAbstractTerminal3795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedGroup_in_ruleAbstractTerminal3815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_entryRuleKeyword3835 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyword3838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleKeyword3863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_entryRuleRuleCall3888 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRuleCall3891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleID_in_ruleRuleCall3921 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleRuleCall3952 = new BitSet(new long[]{0x0000004100000010L});
        public static final BitSet FOLLOW_ruleNamedArgument_in_ruleRuleCall3984 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_13_in_ruleRuleCall4021 = new BitSet(new long[]{0x0000004100000010L});
        public static final BitSet FOLLOW_ruleNamedArgument_in_ruleRuleCall4058 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_27_in_ruleRuleCall4097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue4123 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue4126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleLiteralValue4145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleLiteralValue4167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedArgument_in_entryRuleNamedArgument4187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedArgument4190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralValue_in_ruleNamedArgument4230 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedArgument4275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedArgument4336 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleNamedArgument4390 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedArgument4442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalRuleCall_in_entryRuleTerminalRuleCall4489 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalRuleCall4492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleID_in_ruleTerminalRuleCall4515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleID_in_entryRuleRuleID4540 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRuleID4543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRuleID4562 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleRuleID4582 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRuleID4599 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rulePredicatedKeyword_in_entryRulePredicatedKeyword4625 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicatedKeyword4628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rulePredicatedKeyword4668 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_40_in_rulePredicatedKeyword4722 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePredicatedKeyword4767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedRuleCall_in_entryRulePredicatedRuleCall4798 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicatedRuleCall4801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rulePredicatedRuleCall4841 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_40_in_rulePredicatedRuleCall4895 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePredicatedRuleCall4940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment4971 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment4974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleAssignment5014 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_40_in_ruleAssignment5068 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment5114 = new BitSet(new long[]{0x0000020C00000000L});
        public static final BitSet FOLLOW_35_in_ruleAssignment5160 = new BitSet(new long[]{0x0000000004008030L});
        public static final BitSet FOLLOW_34_in_ruleAssignment5194 = new BitSet(new long[]{0x0000000004008030L});
        public static final BitSet FOLLOW_41_in_ruleAssignment5228 = new BitSet(new long[]{0x0000000004008030L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_ruleAssignment5273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_entryRuleAssignableTerminal5304 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignableTerminal5307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleAssignableTerminal5324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleAssignableTerminal5344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedAssignableElement_in_ruleAssignableTerminal5364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCrossReference_in_ruleAssignableTerminal5384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedAssignableElement_in_entryRuleParenthesizedAssignableElement5404 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedAssignableElement5407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedAssignableElement5426 = new BitSet(new long[]{0x0000000004008030L});
        public static final BitSet FOLLOW_ruleAssignableAlternatives_in_ruleParenthesizedAssignableElement5438 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParenthesizedAssignableElement5452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignableAlternatives_in_entryRuleAssignableAlternatives5472 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignableAlternatives5475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives5492 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleAssignableAlternatives5535 = new BitSet(new long[]{0x0000000004008030L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives5572 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleCrossReference_in_entryRuleCrossReference5620 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCrossReference5623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleCrossReference5642 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleCrossReference5669 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_29_in_ruleCrossReference5700 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleCrossReferenceableTerminal_in_ruleCrossReference5732 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleCrossReference5765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCrossReferenceableTerminal_in_entryRuleCrossReferenceableTerminal5785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCrossReferenceableTerminal5788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleCrossReferenceableTerminal5805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleCrossReferenceableTerminal5825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement5845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedElement5848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedElement5867 = new BitSet(new long[]{0x0000018204008030L});
        public static final BitSet FOLLOW_ruleAlternatives_in_ruleParenthesizedElement5879 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParenthesizedElement5893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedGroup_in_entryRulePredicatedGroup5913 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicatedGroup5916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rulePredicatedGroup5956 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_40_in_rulePredicatedGroup6010 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePredicatedGroup6042 = new BitSet(new long[]{0x0000018204008030L});
        public static final BitSet FOLLOW_ruleAlternatives_in_rulePredicatedGroup6069 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePredicatedGroup6094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalRule_in_entryRuleTerminalRule6114 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalRule6117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleTerminalRule6136 = new BitSet(new long[]{0x0000000000200010L});
        public static final BitSet FOLLOW_21_in_ruleTerminalRule6180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalRule6232 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalRule6303 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleTerminalRule6346 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleTerminalRule6388 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTerminalRule6438 = new BitSet(new long[]{0x0000094000028030L});
        public static final BitSet FOLLOW_ruleTerminalAlternatives_in_ruleTerminalRule6465 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleTerminalRule6490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalAlternatives_in_entryRuleTerminalAlternatives6510 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalAlternatives6513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives6530 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleTerminalAlternatives6573 = new BitSet(new long[]{0x0000094000028030L});
        public static final BitSet FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives6610 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleTerminalGroup_in_entryRuleTerminalGroup6658 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalGroup6661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalToken_in_ruleTerminalGroup6678 = new BitSet(new long[]{0x0000094000028032L});
        public static final BitSet FOLLOW_ruleTerminalToken_in_ruleTerminalGroup6729 = new BitSet(new long[]{0x0000094000028032L});
        public static final BitSet FOLLOW_ruleTerminalToken_in_entryRuleTerminalToken6769 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalToken6772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_ruleTerminalToken6789 = new BitSet(new long[]{0x0000000180400002L});
        public static final BitSet FOLLOW_31_in_ruleTerminalToken6824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleTerminalToken6858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleTerminalToken6892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_entryRuleTerminalTokenElement6931 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalTokenElement6934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterRange_in_ruleTerminalTokenElement6951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalRuleCall_in_ruleTerminalTokenElement6971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedTerminalElement_in_ruleTerminalTokenElement6991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNegatedToken_in_ruleTerminalTokenElement7011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcard_in_ruleTerminalTokenElement7031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEOF_in_ruleTerminalTokenElement7051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedTerminalElement_in_entryRuleParenthesizedTerminalElement7071 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedTerminalElement7074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedTerminalElement7093 = new BitSet(new long[]{0x0000094000028030L});
        public static final BitSet FOLLOW_ruleTerminalAlternatives_in_ruleParenthesizedTerminalElement7105 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParenthesizedTerminalElement7119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNegatedToken_in_entryRuleAbstractNegatedToken7139 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNegatedToken7142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegatedToken_in_ruleAbstractNegatedToken7159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUntilToken_in_ruleAbstractNegatedToken7179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegatedToken_in_entryRuleNegatedToken7199 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegatedToken7202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleNegatedToken7221 = new BitSet(new long[]{0x0000094000028030L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_ruleNegatedToken7248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUntilToken_in_entryRuleUntilToken7279 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUntilToken7282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleUntilToken7301 = new BitSet(new long[]{0x0000094000028030L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_ruleUntilToken7328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcard_in_entryRuleWildcard7359 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWildcard7362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleWildcard7394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEOF_in_entryRuleEOF7414 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEOF7417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEOF7449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterRange_in_entryRuleCharacterRange7469 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCharacterRange7472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleCharacterRange7489 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_44_in_ruleCharacterRange7525 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleCharacterRange7557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumRule_in_entryRuleEnumRule7596 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumRule7599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEnumRule7618 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumRule7645 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleEnumRule7676 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleEnumRule7708 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleEnumRule7741 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumLiterals_in_ruleEnumRule7768 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleEnumRule7793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumLiterals_in_entryRuleEnumLiterals7813 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiterals7816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals7833 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleEnumLiterals7876 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals7913 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleEnumLiteralDeclaration_in_entryRuleEnumLiteralDeclaration7961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteralDeclaration7964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLiteralDeclaration7996 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleEnumLiteralDeclaration8027 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleEnumLiteralDeclaration8059 = new BitSet(new long[]{0x0000000000000002L});
    }


}