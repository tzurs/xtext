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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'grammar'", "'with'", "','", "'hidden'", "'('", "')'", "'.'", "'generate'", "'as'", "'import'", "'fragment'", "'*'", "'returns'", "':'", "';'", "'::'", "'|'", "'&'", "'?'", "'+'", "'{'", "'='", "'+='", "'current'", "'}'", "'=>'", "'->'", "'?='", "'['", "']'", "'terminal'", "'!'", "'EOF'", "'..'", "'enum'"
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

                if ( (LA7_0==RULE_ID||LA7_0==21||LA7_0==41||LA7_0==45) ) {
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
            case 41:
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:418:1: ruleParserRule : ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )? otherlv_13= ':' ( (lv_alternatives_14_0= ruleAlternatives ) ) otherlv_15= ';' ) ;
    public final void ruleParserRule() throws RecognitionException {
        Token lv_fragment_0_0=null;
        Token lv_name_1_0=null;
        Token lv_wildcard_2_0=null;
        Token lv_fragment_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_definesHiddenTokens_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:418:15: ( ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )? otherlv_13= ':' ( (lv_alternatives_14_0= ruleAlternatives ) ) otherlv_15= ';' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:419:2: ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )? otherlv_13= ':' ( (lv_alternatives_14_0= ruleAlternatives ) ) otherlv_15= ';' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:419:2: ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )? otherlv_13= ':' ( (lv_alternatives_14_0= ruleAlternatives ) ) otherlv_15= ';' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:420:3: ( ( ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )? otherlv_13= ':' ( (lv_alternatives_14_0= ruleAlternatives ) ) otherlv_15= ';'
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:420:3: ( ( ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_ID) ) {
                    int LA15_3 = input.LA(3);

                    if ( (LA15_3==14||(LA15_3>=23 && LA15_3<=24)) ) {
                        alt15=2;
                    }
                    else if ( (LA15_3==22) ) {
                        alt15=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:421:4: ( ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:421:4: ( ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:422:5: ( (lv_fragment_0_0= 'fragment' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_wildcard_2_0= '*' ) )
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

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:433:5: ( (lv_name_1_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:434:6: (lv_name_1_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:434:6: (lv_name_1_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:435:7: lv_name_1_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getParserRule_NameIDTerminalRuleCall_0_0_1_0ElementType());
                    						
                    lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParserRule1277); 

                    							doneLeaf(lv_name_1_0);
                    						

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:444:5: ( (lv_wildcard_2_0= '*' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:445:6: (lv_wildcard_2_0= '*' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:445:6: (lv_wildcard_2_0= '*' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:446:7: lv_wildcard_2_0= '*'
                    {

                    							markLeaf(elementTypeProvider.getParserRule_WildcardAsteriskKeyword_0_0_2_0ElementType());
                    						
                    lv_wildcard_2_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParserRule1329); 

                    							doneLeaf(lv_wildcard_2_0);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:457:4: ( ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:457:4: ( ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:458:5: ( (lv_fragment_3_0= 'fragment' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )?
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:458:5: ( (lv_fragment_3_0= 'fragment' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==21) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:459:6: (lv_fragment_3_0= 'fragment' )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:459:6: (lv_fragment_3_0= 'fragment' )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:460:7: lv_fragment_3_0= 'fragment'
                            {

                            							markLeaf(elementTypeProvider.getParserRule_FragmentFragmentKeyword_0_1_0_0ElementType());
                            						
                            lv_fragment_3_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParserRule1400); 

                            							doneLeaf(lv_fragment_3_0);
                            						

                            }


                            }
                            break;

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:469:5: ( (lv_name_4_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:470:6: (lv_name_4_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:470:6: (lv_name_4_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:471:7: lv_name_4_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getParserRule_NameIDTerminalRuleCall_0_1_1_0ElementType());
                    						
                    lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParserRule1453); 

                    							doneLeaf(lv_name_4_0);
                    						

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:480:5: (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==23) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:481:6: otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) )
                            {

                            						markLeaf(elementTypeProvider.getParserRule_ReturnsKeyword_0_1_2_0ElementType());
                            					
                            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleParserRule1496); 

                            						doneLeaf(otherlv_5);
                            					
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:488:6: ( (lv_type_6_0= ruleTypeRef ) )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:489:7: (lv_type_6_0= ruleTypeRef )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:489:7: (lv_type_6_0= ruleTypeRef )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:490:8: lv_type_6_0= ruleTypeRef
                            {

                            								markComposite(elementTypeProvider.getParserRule_TypeTypeRefParserRuleCall_0_1_2_1_0ElementType());
                            							
                            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleParserRule1538);
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

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:502:3: ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:503:4: ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')'
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:503:4: ( (lv_definesHiddenTokens_7_0= 'hidden' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:504:5: (lv_definesHiddenTokens_7_0= 'hidden' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:504:5: (lv_definesHiddenTokens_7_0= 'hidden' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:505:6: lv_definesHiddenTokens_7_0= 'hidden'
                    {

                    						markLeaf(elementTypeProvider.getParserRule_DefinesHiddenTokensHiddenKeyword_1_0_0ElementType());
                    					
                    lv_definesHiddenTokens_7_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParserRule1609); 

                    						doneLeaf(lv_definesHiddenTokens_7_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getParserRule_LeftParenthesisKeyword_1_1ElementType());
                    			
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParserRule1639); 

                    				doneLeaf(otherlv_8);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:521:4: ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:522:5: ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:522:5: ( (otherlv_9= RULE_ID ) )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:523:6: (otherlv_9= RULE_ID )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:523:6: (otherlv_9= RULE_ID )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:524:7: otherlv_9= RULE_ID
                            {

                            							markLeaf(elementTypeProvider.getParserRule_HiddenTokensAbstractRuleCrossReference_1_2_0_0ElementType());
                            						
                            otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParserRule1680); 

                            							doneLeaf(otherlv_9);
                            						

                            }


                            }

                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:533:5: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==13) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:534:6: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                            	    {

                            	    						markLeaf(elementTypeProvider.getParserRule_CommaKeyword_1_2_1_0ElementType());
                            	    					
                            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParserRule1723); 

                            	    						doneLeaf(otherlv_10);
                            	    					
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:541:6: ( (otherlv_11= RULE_ID ) )
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:542:7: (otherlv_11= RULE_ID )
                            	    {
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:542:7: (otherlv_11= RULE_ID )
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:543:8: otherlv_11= RULE_ID
                            	    {

                            	    								markLeaf(elementTypeProvider.getParserRule_HiddenTokensAbstractRuleCrossReference_1_2_1_1_0ElementType());
                            	    							
                            	    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParserRule1765); 

                            	    								doneLeaf(otherlv_11);
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }


                    				markLeaf(elementTypeProvider.getParserRule_RightParenthesisKeyword_1_3ElementType());
                    			
                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParserRule1814); 

                    				doneLeaf(otherlv_12);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getParserRule_ColonKeyword_2ElementType());
            		
            otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleParserRule1834); 

            			doneLeaf(otherlv_13);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:569:3: ( (lv_alternatives_14_0= ruleAlternatives ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:570:4: (lv_alternatives_14_0= ruleAlternatives )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:570:4: (lv_alternatives_14_0= ruleAlternatives )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:571:5: lv_alternatives_14_0= ruleAlternatives
            {

            					markComposite(elementTypeProvider.getParserRule_AlternativesAlternativesParserRuleCall_3_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_ruleParserRule1861);
            ruleAlternatives();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getParserRule_SemicolonKeyword_4ElementType());
            		
            otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleParserRule1886); 

            			doneLeaf(otherlv_15);
            		

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


    // $ANTLR start "entryRuleTypeRef"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:591:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:591:17: ( ruleTypeRef EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:592:2: ruleTypeRef EOF
            {
             markComposite(elementTypeProvider.getTypeRefElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_entryRuleTypeRef1906);
            ruleTypeRef();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeRef1909); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:597:1: ruleTypeRef : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final void ruleTypeRef() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:597:12: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:598:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:598:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:599:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:599:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==26) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:600:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:600:4: ( (otherlv_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:601:5: (otherlv_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:601:5: (otherlv_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:602:6: otherlv_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getTypeRef_MetamodelAbstractMetamodelDeclarationCrossReference_0_0_0ElementType());
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeRef1949); 

                    						doneLeaf(otherlv_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getTypeRef_ColonColonKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTypeRef1979); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:619:3: ( (otherlv_2= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:620:4: (otherlv_2= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:620:4: (otherlv_2= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:621:5: otherlv_2= RULE_ID
            {

            					markLeaf(elementTypeProvider.getTypeRef_ClassifierEClassifierCrossReference_1_0ElementType());
            				
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeRef2012); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:634:1: entryRuleAlternatives : ruleAlternatives EOF ;
    public final void entryRuleAlternatives() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:634:22: ( ruleAlternatives EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:635:2: ruleAlternatives EOF
            {
             markComposite(elementTypeProvider.getAlternativesElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_entryRuleAlternatives2043);
            ruleAlternatives();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAlternatives2046); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:640:1: ruleAlternatives : ( ruleUnorderedGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) ) )+ )? ) ;
    public final void ruleAlternatives() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:640:17: ( ( ruleUnorderedGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:641:2: ( ruleUnorderedGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:641:2: ( ruleUnorderedGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:642:3: ruleUnorderedGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getAlternatives_UnorderedGroupParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroup_in_ruleAlternatives2063);
            ruleUnorderedGroup();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:649:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) ) )+ )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:650:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:650:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:651:5: 
                    {

                    					precedeComposite(elementTypeProvider.getAlternatives_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:656:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==27) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:657:5: otherlv_2= '|' ( (lv_elements_3_0= ruleUnorderedGroup ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getAlternatives_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAlternatives2106); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:664:5: ( (lv_elements_3_0= ruleUnorderedGroup ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:665:6: (lv_elements_3_0= ruleUnorderedGroup )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:665:6: (lv_elements_3_0= ruleUnorderedGroup )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:666:7: lv_elements_3_0= ruleUnorderedGroup
                    	    {

                    	    							markComposite(elementTypeProvider.getAlternatives_ElementsUnorderedGroupParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroup_in_ruleAlternatives2143);
                    	    ruleUnorderedGroup();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
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


    // $ANTLR start "entryRuleUnorderedGroup"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:681:1: entryRuleUnorderedGroup : ruleUnorderedGroup EOF ;
    public final void entryRuleUnorderedGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:681:24: ( ruleUnorderedGroup EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:682:2: ruleUnorderedGroup EOF
            {
             markComposite(elementTypeProvider.getUnorderedGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroup_in_entryRuleUnorderedGroup2191);
            ruleUnorderedGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnorderedGroup2194); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:687:1: ruleUnorderedGroup : ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? ) ;
    public final void ruleUnorderedGroup() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:687:19: ( ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:688:2: ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:688:2: ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:689:3: ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getUnorderedGroup_GroupParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleUnorderedGroup2211);
            ruleGroup();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:696:3: ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:697:4: () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:697:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:698:5: 
                    {

                    					precedeComposite(elementTypeProvider.getUnorderedGroup_UnorderedGroupElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:703:4: (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==28) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:704:5: otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getUnorderedGroup_AmpersandKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleUnorderedGroup2254); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:711:5: ( (lv_elements_3_0= ruleGroup ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:712:6: (lv_elements_3_0= ruleGroup )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:712:6: (lv_elements_3_0= ruleGroup )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:713:7: lv_elements_3_0= ruleGroup
                    	    {

                    	    							markComposite(elementTypeProvider.getUnorderedGroup_ElementsGroupParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleUnorderedGroup2291);
                    	    ruleGroup();

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
    // $ANTLR end "ruleUnorderedGroup"


    // $ANTLR start "entryRuleGroup"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:728:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:728:15: ( ruleGroup EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:729:2: ruleGroup EOF
            {
             markComposite(elementTypeProvider.getGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup2339);
            ruleGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup2342); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:734:1: ruleGroup : ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? ) ;
    public final void ruleGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:734:10: ( ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:735:2: ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:735:2: ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:736:3: ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )?
            {

            			markComposite(elementTypeProvider.getGroup_AbstractTokenParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAbstractToken_in_ruleGroup2359);
            ruleAbstractToken();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:743:3: ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||LA25_0==15||LA25_0==31||(LA25_0>=36 && LA25_0<=37)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:744:4: () ( (lv_elements_2_0= ruleAbstractToken ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:744:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:745:5: 
                    {

                    					precedeComposite(elementTypeProvider.getGroup_GroupElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:750:4: ( (lv_elements_2_0= ruleAbstractToken ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)||LA24_0==15||LA24_0==31||(LA24_0>=36 && LA24_0<=37)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:751:5: (lv_elements_2_0= ruleAbstractToken )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:751:5: (lv_elements_2_0= ruleAbstractToken )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:752:6: lv_elements_2_0= ruleAbstractToken
                    	    {

                    	    						markComposite(elementTypeProvider.getGroup_ElementsAbstractTokenParserRuleCall_1_1_0ElementType());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractToken_in_ruleGroup2410);
                    	    ruleAbstractToken();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    					

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleAbstractToken"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:766:1: entryRuleAbstractToken : ruleAbstractToken EOF ;
    public final void entryRuleAbstractToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:766:23: ( ruleAbstractToken EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:767:2: ruleAbstractToken EOF
            {
             markComposite(elementTypeProvider.getAbstractTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractToken_in_entryRuleAbstractToken2450);
            ruleAbstractToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractToken2453); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:772:1: ruleAbstractToken : ( ruleAbstractTokenWithCardinality | ruleAction ) ;
    public final void ruleAbstractToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:772:18: ( ( ruleAbstractTokenWithCardinality | ruleAction ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:773:2: ( ruleAbstractTokenWithCardinality | ruleAction )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:773:2: ( ruleAbstractTokenWithCardinality | ruleAction )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)||LA26_0==15||(LA26_0>=36 && LA26_0<=37)) ) {
                alt26=1;
            }
            else if ( (LA26_0==31) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:774:3: ruleAbstractTokenWithCardinality
                    {

                    			markComposite(elementTypeProvider.getAbstractToken_AbstractTokenWithCardinalityParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractTokenWithCardinality_in_ruleAbstractToken2470);
                    ruleAbstractTokenWithCardinality();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:782:3: ruleAction
                    {

                    			markComposite(elementTypeProvider.getAbstractToken_ActionParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleAbstractToken2490);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:793:1: entryRuleAbstractTokenWithCardinality : ruleAbstractTokenWithCardinality EOF ;
    public final void entryRuleAbstractTokenWithCardinality() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:793:38: ( ruleAbstractTokenWithCardinality EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:794:2: ruleAbstractTokenWithCardinality EOF
            {
             markComposite(elementTypeProvider.getAbstractTokenWithCardinalityElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractTokenWithCardinality_in_entryRuleAbstractTokenWithCardinality2510);
            ruleAbstractTokenWithCardinality();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractTokenWithCardinality2513); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:799:1: ruleAbstractTokenWithCardinality : ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) ;
    public final void ruleAbstractTokenWithCardinality() throws RecognitionException {
        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:799:33: ( ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:800:2: ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:800:2: ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:801:3: ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:801:3: ( ruleAssignment | ruleAbstractTerminal )
            int alt27=2;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_STRING||LA27_1==15) ) {
                    alt27=2;
                }
                else if ( (LA27_1==RULE_ID) ) {
                    int LA27_5 = input.LA(3);

                    if ( ((LA27_5>=32 && LA27_5<=33)||LA27_5==38) ) {
                        alt27=1;
                    }
                    else if ( (LA27_5==EOF||(LA27_5>=RULE_ID && LA27_5<=RULE_STRING)||(LA27_5>=15 && LA27_5<=16)||LA27_5==22||LA27_5==25||(LA27_5>=27 && LA27_5<=31)||(LA27_5>=36 && LA27_5<=37)) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==RULE_ID) ) {
                    int LA27_5 = input.LA(3);

                    if ( ((LA27_5>=32 && LA27_5<=33)||LA27_5==38) ) {
                        alt27=1;
                    }
                    else if ( (LA27_5==EOF||(LA27_5>=RULE_ID && LA27_5<=RULE_STRING)||(LA27_5>=15 && LA27_5<=16)||LA27_5==22||LA27_5==25||(LA27_5>=27 && LA27_5<=31)||(LA27_5>=36 && LA27_5<=37)) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_2==RULE_STRING||LA27_2==15) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA27_3 = input.LA(2);

                if ( ((LA27_3>=32 && LA27_3<=33)||LA27_3==38) ) {
                    alt27=1;
                }
                else if ( (LA27_3==EOF||(LA27_3>=RULE_ID && LA27_3<=RULE_STRING)||(LA27_3>=15 && LA27_3<=16)||LA27_3==22||(LA27_3>=25 && LA27_3<=31)||(LA27_3>=36 && LA27_3<=37)) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 15:
                {
                alt27=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:802:4: ruleAssignment
                    {

                    				markComposite(elementTypeProvider.getAbstractTokenWithCardinality_AssignmentParserRuleCall_0_0ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleAbstractTokenWithCardinality2536);
                    ruleAssignment();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:810:4: ruleAbstractTerminal
                    {

                    				markComposite(elementTypeProvider.getAbstractTokenWithCardinality_AbstractTerminalParserRuleCall_0_1ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractTerminal_in_ruleAbstractTokenWithCardinality2560);
                    ruleAbstractTerminal();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:818:3: ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22||(LA29_0>=29 && LA29_0<=30)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:819:4: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:819:4: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:820:5: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:820:5: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    int alt28=3;
                    switch ( input.LA(1) ) {
                    case 29:
                        {
                        alt28=1;
                        }
                        break;
                    case 22:
                        {
                        alt28=2;
                        }
                        break;
                    case 30:
                        {
                        alt28=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }

                    switch (alt28) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:821:6: lv_cardinality_2_1= '?'
                            {

                            						markLeaf(elementTypeProvider.getAbstractTokenWithCardinality_CardinalityQuestionMarkKeyword_1_0_0ElementType());
                            					
                            lv_cardinality_2_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAbstractTokenWithCardinality2600); 

                            						doneLeaf(lv_cardinality_2_1);
                            					

                            }
                            break;
                        case 2 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:829:6: lv_cardinality_2_2= '*'
                            {

                            						markLeaf(elementTypeProvider.getAbstractTokenWithCardinality_CardinalityAsteriskKeyword_1_0_1ElementType());
                            					
                            lv_cardinality_2_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAbstractTokenWithCardinality2634); 

                            						doneLeaf(lv_cardinality_2_2);
                            					

                            }
                            break;
                        case 3 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:837:6: lv_cardinality_2_3= '+'
                            {

                            						markLeaf(elementTypeProvider.getAbstractTokenWithCardinality_CardinalityPlusSignKeyword_1_0_2ElementType());
                            					
                            lv_cardinality_2_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAbstractTokenWithCardinality2668); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:851:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:851:16: ( ruleAction EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:852:2: ruleAction EOF
            {
             markComposite(elementTypeProvider.getActionElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction2707);
            ruleAction();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction2710); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:857:1: ruleAction : (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) ;
    public final void ruleAction() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_feature_3_0=null;
        Token lv_operator_4_1=null;
        Token lv_operator_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:857:11: ( (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:858:2: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:858:2: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:859:3: otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}'
            {

            			markLeaf(elementTypeProvider.getAction_LeftCurlyBracketKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAction2729); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:866:3: ( (lv_type_1_0= ruleTypeRef ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:867:4: (lv_type_1_0= ruleTypeRef )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:867:4: (lv_type_1_0= ruleTypeRef )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:868:5: lv_type_1_0= ruleTypeRef
            {

            					markComposite(elementTypeProvider.getAction_TypeTypeRefParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleAction2756);
            ruleTypeRef();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:877:3: (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:878:4: otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current'
                    {

                    				markLeaf(elementTypeProvider.getAction_FullStopKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAction2787); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:885:4: ( (lv_feature_3_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:886:5: (lv_feature_3_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:886:5: (lv_feature_3_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:887:6: lv_feature_3_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getAction_FeatureIDTerminalRuleCall_2_1_0ElementType());
                    					
                    lv_feature_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAction2819); 

                    						doneLeaf(lv_feature_3_0);
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:896:4: ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:897:5: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:897:5: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:898:6: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:898:6: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==32) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==33) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:899:7: lv_operator_4_1= '='
                            {

                            							markLeaf(elementTypeProvider.getAction_OperatorEqualsSignKeyword_2_2_0_0ElementType());
                            						
                            lv_operator_4_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAction2873); 

                            							doneLeaf(lv_operator_4_1);
                            						

                            }
                            break;
                        case 2 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:907:7: lv_operator_4_2= '+='
                            {

                            							markLeaf(elementTypeProvider.getAction_OperatorPlusSignEqualsSignKeyword_2_2_0_1ElementType());
                            						
                            lv_operator_4_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAction2911); 

                            							doneLeaf(lv_operator_4_2);
                            						

                            }
                            break;

                    }


                    }


                    }


                    				markLeaf(elementTypeProvider.getAction_CurrentKeyword_2_3ElementType());
                    			
                    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAction2949); 

                    				doneLeaf(otherlv_5);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getAction_RightCurlyBracketKeyword_3ElementType());
            		
            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAction2969); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:936:1: entryRuleAbstractTerminal : ruleAbstractTerminal EOF ;
    public final void entryRuleAbstractTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:936:26: ( ruleAbstractTerminal EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:937:2: ruleAbstractTerminal EOF
            {
             markComposite(elementTypeProvider.getAbstractTerminalElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractTerminal_in_entryRuleAbstractTerminal2989);
            ruleAbstractTerminal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractTerminal2992); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:942:1: ruleAbstractTerminal : ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup ) ;
    public final void ruleAbstractTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:942:21: ( ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:943:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:943:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup )
            int alt32=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt32=1;
                }
                break;
            case RULE_ID:
                {
                alt32=2;
                }
                break;
            case 15:
                {
                alt32=3;
                }
                break;
            case 36:
                {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt32=6;
                    }
                    break;
                case RULE_ID:
                    {
                    alt32=5;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt32=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 4, input);

                    throw nvae;
                }

                }
                break;
            case 37:
                {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt32=6;
                    }
                    break;
                case RULE_ID:
                    {
                    alt32=5;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt32=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 5, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:944:3: ruleKeyword
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_KeywordParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleAbstractTerminal3009);
                    ruleKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:952:3: ruleRuleCall
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_RuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleAbstractTerminal3029);
                    ruleRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:960:3: ruleParenthesizedElement
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_ParenthesizedElementParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedElement_in_ruleAbstractTerminal3049);
                    ruleParenthesizedElement();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:968:3: rulePredicatedKeyword
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_PredicatedKeywordParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_rulePredicatedKeyword_in_ruleAbstractTerminal3069);
                    rulePredicatedKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 5 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:976:3: rulePredicatedRuleCall
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_PredicatedRuleCallParserRuleCall_4ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_rulePredicatedRuleCall_in_ruleAbstractTerminal3089);
                    rulePredicatedRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 6 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:984:3: rulePredicatedGroup
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_PredicatedGroupParserRuleCall_5ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_rulePredicatedGroup_in_ruleAbstractTerminal3109);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:995:1: entryRuleKeyword : ruleKeyword EOF ;
    public final void entryRuleKeyword() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:995:17: ( ruleKeyword EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:996:2: ruleKeyword EOF
            {
             markComposite(elementTypeProvider.getKeywordElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_entryRuleKeyword3129);
            ruleKeyword();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyword3132); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1001:1: ruleKeyword : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final void ruleKeyword() throws RecognitionException {
        Token lv_value_0_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1001:12: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1002:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1002:2: ( (lv_value_0_0= RULE_STRING ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1003:3: (lv_value_0_0= RULE_STRING )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1003:3: (lv_value_0_0= RULE_STRING )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1004:4: lv_value_0_0= RULE_STRING
            {

            				markLeaf(elementTypeProvider.getKeyword_ValueSTRINGTerminalRuleCall_0ElementType());
            			
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleKeyword3157); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1016:1: entryRuleRuleCall : ruleRuleCall EOF ;
    public final void entryRuleRuleCall() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1016:18: ( ruleRuleCall EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1017:2: ruleRuleCall EOF
            {
             markComposite(elementTypeProvider.getRuleCallElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_entryRuleRuleCall3182);
            ruleRuleCall();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRuleCall3185); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1022:1: ruleRuleCall : ( ( ruleRuleID ) ) ;
    public final void ruleRuleCall() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1022:13: ( ( ( ruleRuleID ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1023:2: ( ( ruleRuleID ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1023:2: ( ( ruleRuleID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1024:3: ( ruleRuleID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1024:3: ( ruleRuleID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1025:4: ruleRuleID
            {

            				markComposite(elementTypeProvider.getRuleCall_RuleAbstractRuleCrossReference_0ElementType());
            			
            pushFollow(FollowSets000.FOLLOW_ruleRuleID_in_ruleRuleCall3208);
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
    // $ANTLR end "ruleRuleCall"


    // $ANTLR start "entryRuleRuleID"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1037:1: entryRuleRuleID : ruleRuleID EOF ;
    public final void entryRuleRuleID() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1037:16: ( ruleRuleID EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1038:2: ruleRuleID EOF
            {
             markComposite(elementTypeProvider.getRuleIDElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleRuleID_in_entryRuleRuleID3233);
            ruleRuleID();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRuleID3236); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1043:1: ruleRuleID : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final void ruleRuleID() throws RecognitionException {
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1043:11: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1044:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1044:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1045:3: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {

            			markLeaf(elementTypeProvider.getRuleID_IDTerminalRuleCall_0ElementType());
            		
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRuleID3255); 

            			doneLeaf(this_ID_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1052:3: (kw= '::' this_ID_2= RULE_ID )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==26) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1053:4: kw= '::' this_ID_2= RULE_ID
            	    {

            	    				markLeaf(elementTypeProvider.getRuleID_ColonColonKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRuleID3275); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getRuleID_IDTerminalRuleCall_1_1ElementType());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRuleID3292); 

            	    				doneLeaf(this_ID_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1072:1: entryRulePredicatedKeyword : rulePredicatedKeyword EOF ;
    public final void entryRulePredicatedKeyword() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1072:27: ( rulePredicatedKeyword EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1073:2: rulePredicatedKeyword EOF
            {
             markComposite(elementTypeProvider.getPredicatedKeywordElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicatedKeyword_in_entryRulePredicatedKeyword3318);
            rulePredicatedKeyword();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicatedKeyword3321); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1078:1: rulePredicatedKeyword : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final void rulePredicatedKeyword() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token lv_value_2_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1078:22: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1079:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1079:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1080:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1080:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            else if ( (LA34_0==37) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1081:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1081:4: ( (lv_predicated_0_0= '=>' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1082:5: (lv_predicated_0_0= '=>' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1082:5: (lv_predicated_0_0= '=>' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1083:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedKeyword_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulePredicatedKeyword3361); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1093:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1093:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1094:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1094:5: (lv_firstSetPredicated_1_0= '->' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1095:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedKeyword_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_rulePredicatedKeyword3415); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1105:3: ( (lv_value_2_0= RULE_STRING ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1106:4: (lv_value_2_0= RULE_STRING )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1106:4: (lv_value_2_0= RULE_STRING )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1107:5: lv_value_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getPredicatedKeyword_ValueSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePredicatedKeyword3460); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1120:1: entryRulePredicatedRuleCall : rulePredicatedRuleCall EOF ;
    public final void entryRulePredicatedRuleCall() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1120:28: ( rulePredicatedRuleCall EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1121:2: rulePredicatedRuleCall EOF
            {
             markComposite(elementTypeProvider.getPredicatedRuleCallElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicatedRuleCall_in_entryRulePredicatedRuleCall3491);
            rulePredicatedRuleCall();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicatedRuleCall3494); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1126:1: rulePredicatedRuleCall : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final void rulePredicatedRuleCall() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1126:23: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1127:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1127:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1128:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1128:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            else if ( (LA35_0==37) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1129:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1129:4: ( (lv_predicated_0_0= '=>' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1130:5: (lv_predicated_0_0= '=>' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1130:5: (lv_predicated_0_0= '=>' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1131:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedRuleCall_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulePredicatedRuleCall3534); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1141:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1141:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1142:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1142:5: (lv_firstSetPredicated_1_0= '->' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1143:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedRuleCall_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_rulePredicatedRuleCall3588); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1153:3: ( (otherlv_2= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1154:4: (otherlv_2= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1154:4: (otherlv_2= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1155:5: otherlv_2= RULE_ID
            {

            					markLeaf(elementTypeProvider.getPredicatedRuleCall_RuleAbstractRuleCrossReference_1_0ElementType());
            				
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePredicatedRuleCall3633); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1168:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1168:20: ( ruleAssignment EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1169:2: ruleAssignment EOF
            {
             markComposite(elementTypeProvider.getAssignmentElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment3664);
            ruleAssignment();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment3667); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1174:1: ruleAssignment : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) ) ;
    public final void ruleAssignment() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token lv_feature_2_0=null;
        Token lv_operator_3_1=null;
        Token lv_operator_3_2=null;
        Token lv_operator_3_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1174:15: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1175:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1175:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1176:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1176:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )?
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            else if ( (LA36_0==37) ) {
                alt36=2;
            }
            switch (alt36) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1177:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1177:4: ( (lv_predicated_0_0= '=>' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1178:5: (lv_predicated_0_0= '=>' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1178:5: (lv_predicated_0_0= '=>' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1179:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getAssignment_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAssignment3707); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1189:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1189:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1190:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1190:5: (lv_firstSetPredicated_1_0= '->' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1191:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getAssignment_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAssignment3761); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1201:3: ( (lv_feature_2_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1202:4: (lv_feature_2_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1202:4: (lv_feature_2_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1203:5: lv_feature_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getAssignment_FeatureIDTerminalRuleCall_1_0ElementType());
            				
            lv_feature_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment3807); 

            					doneLeaf(lv_feature_2_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1212:3: ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1213:4: ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1213:4: ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1214:5: (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1214:5: (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt37=1;
                }
                break;
            case 32:
                {
                alt37=2;
                }
                break;
            case 38:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1215:6: lv_operator_3_1= '+='
                    {

                    						markLeaf(elementTypeProvider.getAssignment_OperatorPlusSignEqualsSignKeyword_2_0_0ElementType());
                    					
                    lv_operator_3_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAssignment3853); 

                    						doneLeaf(lv_operator_3_1);
                    					

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1223:6: lv_operator_3_2= '='
                    {

                    						markLeaf(elementTypeProvider.getAssignment_OperatorEqualsSignKeyword_2_0_1ElementType());
                    					
                    lv_operator_3_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAssignment3887); 

                    						doneLeaf(lv_operator_3_2);
                    					

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1231:6: lv_operator_3_3= '?='
                    {

                    						markLeaf(elementTypeProvider.getAssignment_OperatorQuestionMarkEqualsSignKeyword_2_0_2ElementType());
                    					
                    lv_operator_3_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleAssignment3921); 

                    						doneLeaf(lv_operator_3_3);
                    					

                    }
                    break;

            }


            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1241:3: ( (lv_terminal_4_0= ruleAssignableTerminal ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1242:4: (lv_terminal_4_0= ruleAssignableTerminal )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1242:4: (lv_terminal_4_0= ruleAssignableTerminal )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1243:5: lv_terminal_4_0= ruleAssignableTerminal
            {

            					markComposite(elementTypeProvider.getAssignment_TerminalAssignableTerminalParserRuleCall_3_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_ruleAssignment3966);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1256:1: entryRuleAssignableTerminal : ruleAssignableTerminal EOF ;
    public final void entryRuleAssignableTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1256:28: ( ruleAssignableTerminal EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1257:2: ruleAssignableTerminal EOF
            {
             markComposite(elementTypeProvider.getAssignableTerminalElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_entryRuleAssignableTerminal3997);
            ruleAssignableTerminal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignableTerminal4000); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1262:1: ruleAssignableTerminal : ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference ) ;
    public final void ruleAssignableTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1262:23: ( ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1263:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1263:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference )
            int alt38=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt38=1;
                }
                break;
            case RULE_ID:
                {
                alt38=2;
                }
                break;
            case 15:
                {
                alt38=3;
                }
                break;
            case 39:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1264:3: ruleKeyword
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_KeywordParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleAssignableTerminal4017);
                    ruleKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1272:3: ruleRuleCall
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_RuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleAssignableTerminal4037);
                    ruleRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1280:3: ruleParenthesizedAssignableElement
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_ParenthesizedAssignableElementParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedAssignableElement_in_ruleAssignableTerminal4057);
                    ruleParenthesizedAssignableElement();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1288:3: ruleCrossReference
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_CrossReferenceParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleCrossReference_in_ruleAssignableTerminal4077);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1299:1: entryRuleParenthesizedAssignableElement : ruleParenthesizedAssignableElement EOF ;
    public final void entryRuleParenthesizedAssignableElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1299:40: ( ruleParenthesizedAssignableElement EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1300:2: ruleParenthesizedAssignableElement EOF
            {
             markComposite(elementTypeProvider.getParenthesizedAssignableElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedAssignableElement_in_entryRuleParenthesizedAssignableElement4097);
            ruleParenthesizedAssignableElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedAssignableElement4100); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1305:1: ruleParenthesizedAssignableElement : (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' ) ;
    public final void ruleParenthesizedAssignableElement() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1305:35: ( (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1306:2: (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1306:2: (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1307:3: otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')'
            {

            			markLeaf(elementTypeProvider.getParenthesizedAssignableElement_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedAssignableElement4119); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParenthesizedAssignableElement_AssignableAlternativesParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAssignableAlternatives_in_ruleParenthesizedAssignableElement4131);
            ruleAssignableAlternatives();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParenthesizedAssignableElement_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParenthesizedAssignableElement4145); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1332:1: entryRuleAssignableAlternatives : ruleAssignableAlternatives EOF ;
    public final void entryRuleAssignableAlternatives() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1332:32: ( ruleAssignableAlternatives EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1333:2: ruleAssignableAlternatives EOF
            {
             markComposite(elementTypeProvider.getAssignableAlternativesElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignableAlternatives_in_entryRuleAssignableAlternatives4165);
            ruleAssignableAlternatives();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignableAlternatives4168); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1338:1: ruleAssignableAlternatives : ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? ) ;
    public final void ruleAssignableAlternatives() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1338:27: ( ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1339:2: ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1339:2: ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1340:3: ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getAssignableAlternatives_AssignableTerminalParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives4185);
            ruleAssignableTerminal();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1347:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==27) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1348:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1348:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1349:5: 
                    {

                    					precedeComposite(elementTypeProvider.getAssignableAlternatives_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1354:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==27) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1355:5: otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getAssignableAlternatives_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAssignableAlternatives4228); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1362:5: ( (lv_elements_3_0= ruleAssignableTerminal ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1363:6: (lv_elements_3_0= ruleAssignableTerminal )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1363:6: (lv_elements_3_0= ruleAssignableTerminal )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1364:7: lv_elements_3_0= ruleAssignableTerminal
                    	    {

                    	    							markComposite(elementTypeProvider.getAssignableAlternatives_ElementsAssignableTerminalParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives4265);
                    	    ruleAssignableTerminal();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1379:1: entryRuleCrossReference : ruleCrossReference EOF ;
    public final void entryRuleCrossReference() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1379:24: ( ruleCrossReference EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1380:2: ruleCrossReference EOF
            {
             markComposite(elementTypeProvider.getCrossReferenceElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleCrossReference_in_entryRuleCrossReference4313);
            ruleCrossReference();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCrossReference4316); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1385:1: ruleCrossReference : (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) ;
    public final void ruleCrossReference() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1385:19: ( (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1386:2: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1386:2: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1387:3: otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']'
            {

            			markLeaf(elementTypeProvider.getCrossReference_LeftSquareBracketKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCrossReference4335); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1394:3: ( (lv_type_1_0= ruleTypeRef ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1395:4: (lv_type_1_0= ruleTypeRef )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1395:4: (lv_type_1_0= ruleTypeRef )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1396:5: lv_type_1_0= ruleTypeRef
            {

            					markComposite(elementTypeProvider.getCrossReference_TypeTypeRefParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleCrossReference4362);
            ruleTypeRef();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1405:3: (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==27) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1406:4: otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    {

                    				markLeaf(elementTypeProvider.getCrossReference_VerticalLineKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCrossReference4393); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1413:4: ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1414:5: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1414:5: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1415:6: lv_terminal_3_0= ruleCrossReferenceableTerminal
                    {

                    						markComposite(elementTypeProvider.getCrossReference_TerminalCrossReferenceableTerminalParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleCrossReferenceableTerminal_in_ruleCrossReference4425);
                    ruleCrossReferenceableTerminal();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getCrossReference_RightSquareBracketKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCrossReference4458); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1436:1: entryRuleCrossReferenceableTerminal : ruleCrossReferenceableTerminal EOF ;
    public final void entryRuleCrossReferenceableTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1436:36: ( ruleCrossReferenceableTerminal EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1437:2: ruleCrossReferenceableTerminal EOF
            {
             markComposite(elementTypeProvider.getCrossReferenceableTerminalElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleCrossReferenceableTerminal_in_entryRuleCrossReferenceableTerminal4478);
            ruleCrossReferenceableTerminal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCrossReferenceableTerminal4481); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1442:1: ruleCrossReferenceableTerminal : ( ruleKeyword | ruleRuleCall ) ;
    public final void ruleCrossReferenceableTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1442:31: ( ( ruleKeyword | ruleRuleCall ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1443:2: ( ruleKeyword | ruleRuleCall )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1443:2: ( ruleKeyword | ruleRuleCall )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_ID) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1444:3: ruleKeyword
                    {

                    			markComposite(elementTypeProvider.getCrossReferenceableTerminal_KeywordParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleCrossReferenceableTerminal4498);
                    ruleKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1452:3: ruleRuleCall
                    {

                    			markComposite(elementTypeProvider.getCrossReferenceableTerminal_RuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleCrossReferenceableTerminal4518);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1463:1: entryRuleParenthesizedElement : ruleParenthesizedElement EOF ;
    public final void entryRuleParenthesizedElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1463:30: ( ruleParenthesizedElement EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1464:2: ruleParenthesizedElement EOF
            {
             markComposite(elementTypeProvider.getParenthesizedElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement4538);
            ruleParenthesizedElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedElement4541); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1469:1: ruleParenthesizedElement : (otherlv_0= '(' ruleAlternatives otherlv_2= ')' ) ;
    public final void ruleParenthesizedElement() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1469:25: ( (otherlv_0= '(' ruleAlternatives otherlv_2= ')' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1470:2: (otherlv_0= '(' ruleAlternatives otherlv_2= ')' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1470:2: (otherlv_0= '(' ruleAlternatives otherlv_2= ')' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1471:3: otherlv_0= '(' ruleAlternatives otherlv_2= ')'
            {

            			markLeaf(elementTypeProvider.getParenthesizedElement_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedElement4560); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParenthesizedElement_AlternativesParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_ruleParenthesizedElement4572);
            ruleAlternatives();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParenthesizedElement_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParenthesizedElement4586); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1496:1: entryRulePredicatedGroup : rulePredicatedGroup EOF ;
    public final void entryRulePredicatedGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1496:25: ( rulePredicatedGroup EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1497:2: rulePredicatedGroup EOF
            {
             markComposite(elementTypeProvider.getPredicatedGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicatedGroup_in_entryRulePredicatedGroup4606);
            rulePredicatedGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicatedGroup4609); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1502:1: rulePredicatedGroup : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' ) ;
    public final void rulePredicatedGroup() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1502:20: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1503:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1503:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1504:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')'
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1504:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==36) ) {
                alt43=1;
            }
            else if ( (LA43_0==37) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1505:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1505:4: ( (lv_predicated_0_0= '=>' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1506:5: (lv_predicated_0_0= '=>' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1506:5: (lv_predicated_0_0= '=>' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1507:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedGroup_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulePredicatedGroup4649); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1517:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1517:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1518:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1518:5: (lv_firstSetPredicated_1_0= '->' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1519:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedGroup_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_rulePredicatedGroup4703); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getPredicatedGroup_LeftParenthesisKeyword_1ElementType());
            		
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePredicatedGroup4735); 

            			doneLeaf(otherlv_2);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1536:3: ( (lv_elements_3_0= ruleAlternatives ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1537:4: (lv_elements_3_0= ruleAlternatives )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1537:4: (lv_elements_3_0= ruleAlternatives )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1538:5: lv_elements_3_0= ruleAlternatives
            {

            					markComposite(elementTypeProvider.getPredicatedGroup_ElementsAlternativesParserRuleCall_2_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_rulePredicatedGroup4762);
            ruleAlternatives();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getPredicatedGroup_RightParenthesisKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePredicatedGroup4787); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1558:1: entryRuleTerminalRule : ruleTerminalRule EOF ;
    public final void entryRuleTerminalRule() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1558:22: ( ruleTerminalRule EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1559:2: ruleTerminalRule EOF
            {
             markComposite(elementTypeProvider.getTerminalRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalRule_in_entryRuleTerminalRule4807);
            ruleTerminalRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalRule4810); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1564:1: ruleTerminalRule : (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' ) ;
    public final void ruleTerminalRule() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_fragment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1564:17: ( (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1565:2: (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1565:2: (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1566:3: otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';'
            {

            			markLeaf(elementTypeProvider.getTerminalRule_TerminalKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTerminalRule4829); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1573:3: ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==21) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_ID) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1574:4: ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1574:4: ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1575:5: ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1575:5: ( (lv_fragment_1_0= 'fragment' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1576:6: (lv_fragment_1_0= 'fragment' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1576:6: (lv_fragment_1_0= 'fragment' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1577:7: lv_fragment_1_0= 'fragment'
                    {

                    							markLeaf(elementTypeProvider.getTerminalRule_FragmentFragmentKeyword_1_0_0_0ElementType());
                    						
                    lv_fragment_1_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTerminalRule4873); 

                    							doneLeaf(lv_fragment_1_0);
                    						

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1586:5: ( (lv_name_2_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1587:6: (lv_name_2_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1587:6: (lv_name_2_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1588:7: lv_name_2_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getTerminalRule_NameIDTerminalRuleCall_1_0_1_0ElementType());
                    						
                    lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTerminalRule4925); 

                    							doneLeaf(lv_name_2_0);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1599:4: ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1599:4: ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1600:5: ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )?
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1600:5: ( (lv_name_3_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1601:6: (lv_name_3_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1601:6: (lv_name_3_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1602:7: lv_name_3_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getTerminalRule_NameIDTerminalRuleCall_1_1_0_0ElementType());
                    						
                    lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTerminalRule4996); 

                    							doneLeaf(lv_name_3_0);
                    						

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1611:5: (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==23) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1612:6: otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) )
                            {

                            						markLeaf(elementTypeProvider.getTerminalRule_ReturnsKeyword_1_1_1_0ElementType());
                            					
                            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTerminalRule5039); 

                            						doneLeaf(otherlv_4);
                            					
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1619:6: ( (lv_type_5_0= ruleTypeRef ) )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1620:7: (lv_type_5_0= ruleTypeRef )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1620:7: (lv_type_5_0= ruleTypeRef )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1621:8: lv_type_5_0= ruleTypeRef
                            {

                            								markComposite(elementTypeProvider.getTerminalRule_TypeTypeRefParserRuleCall_1_1_1_1_0ElementType());
                            							
                            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleTerminalRule5081);
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
            		
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTerminalRule5131); 

            			doneLeaf(otherlv_6);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1640:3: ( (lv_alternatives_7_0= ruleTerminalAlternatives ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1641:4: (lv_alternatives_7_0= ruleTerminalAlternatives )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1641:4: (lv_alternatives_7_0= ruleTerminalAlternatives )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1642:5: lv_alternatives_7_0= ruleTerminalAlternatives
            {

            					markComposite(elementTypeProvider.getTerminalRule_AlternativesTerminalAlternativesParserRuleCall_3_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTerminalAlternatives_in_ruleTerminalRule5158);
            ruleTerminalAlternatives();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getTerminalRule_SemicolonKeyword_4ElementType());
            		
            otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTerminalRule5183); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1662:1: entryRuleTerminalAlternatives : ruleTerminalAlternatives EOF ;
    public final void entryRuleTerminalAlternatives() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1662:30: ( ruleTerminalAlternatives EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1663:2: ruleTerminalAlternatives EOF
            {
             markComposite(elementTypeProvider.getTerminalAlternativesElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalAlternatives_in_entryRuleTerminalAlternatives5203);
            ruleTerminalAlternatives();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalAlternatives5206); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1668:1: ruleTerminalAlternatives : ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? ) ;
    public final void ruleTerminalAlternatives() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1668:25: ( ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1669:2: ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1669:2: ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1670:3: ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getTerminalAlternatives_TerminalGroupParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives5223);
            ruleTerminalGroup();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1677:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==27) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1678:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1678:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1679:5: 
                    {

                    					precedeComposite(elementTypeProvider.getTerminalAlternatives_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1684:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==27) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1685:5: otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getTerminalAlternatives_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTerminalAlternatives5266); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1692:5: ( (lv_elements_3_0= ruleTerminalGroup ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1693:6: (lv_elements_3_0= ruleTerminalGroup )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1693:6: (lv_elements_3_0= ruleTerminalGroup )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1694:7: lv_elements_3_0= ruleTerminalGroup
                    	    {

                    	    							markComposite(elementTypeProvider.getTerminalAlternatives_ElementsTerminalGroupParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives5303);
                    	    ruleTerminalGroup();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt46 >= 1 ) break loop46;
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1709:1: entryRuleTerminalGroup : ruleTerminalGroup EOF ;
    public final void entryRuleTerminalGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1709:23: ( ruleTerminalGroup EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1710:2: ruleTerminalGroup EOF
            {
             markComposite(elementTypeProvider.getTerminalGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalGroup_in_entryRuleTerminalGroup5351);
            ruleTerminalGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalGroup5354); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1715:1: ruleTerminalGroup : ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? ) ;
    public final void ruleTerminalGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1715:18: ( ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1716:2: ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1716:2: ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1717:3: ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )?
            {

            			markComposite(elementTypeProvider.getTerminalGroup_TerminalTokenParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerminalToken_in_ruleTerminalGroup5371);
            ruleTerminalToken();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1724:3: ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_STRING)||LA49_0==15||LA49_0==17||LA49_0==37||(LA49_0>=42 && LA49_0<=43)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1725:4: () ( (lv_elements_2_0= ruleTerminalToken ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1725:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1726:5: 
                    {

                    					precedeComposite(elementTypeProvider.getTerminalGroup_GroupElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1731:4: ( (lv_elements_2_0= ruleTerminalToken ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_STRING)||LA48_0==15||LA48_0==17||LA48_0==37||(LA48_0>=42 && LA48_0<=43)) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1732:5: (lv_elements_2_0= ruleTerminalToken )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1732:5: (lv_elements_2_0= ruleTerminalToken )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1733:6: lv_elements_2_0= ruleTerminalToken
                    	    {

                    	    						markComposite(elementTypeProvider.getTerminalGroup_ElementsTerminalTokenParserRuleCall_1_1_0ElementType());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_ruleTerminalToken_in_ruleTerminalGroup5422);
                    	    ruleTerminalToken();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1747:1: entryRuleTerminalToken : ruleTerminalToken EOF ;
    public final void entryRuleTerminalToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1747:23: ( ruleTerminalToken EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1748:2: ruleTerminalToken EOF
            {
             markComposite(elementTypeProvider.getTerminalTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalToken_in_entryRuleTerminalToken5462);
            ruleTerminalToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalToken5465); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1753:1: ruleTerminalToken : ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) ;
    public final void ruleTerminalToken() throws RecognitionException {
        Token lv_cardinality_1_1=null;
        Token lv_cardinality_1_2=null;
        Token lv_cardinality_1_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1753:18: ( ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1754:2: ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1754:2: ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1755:3: ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            {

            			markComposite(elementTypeProvider.getTerminalToken_TerminalTokenElementParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_ruleTerminalToken5482);
            ruleTerminalTokenElement();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1762:3: ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==22||(LA51_0>=29 && LA51_0<=30)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1763:4: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1763:4: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1764:5: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1764:5: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    int alt50=3;
                    switch ( input.LA(1) ) {
                    case 29:
                        {
                        alt50=1;
                        }
                        break;
                    case 22:
                        {
                        alt50=2;
                        }
                        break;
                    case 30:
                        {
                        alt50=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }

                    switch (alt50) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1765:6: lv_cardinality_1_1= '?'
                            {

                            						markLeaf(elementTypeProvider.getTerminalToken_CardinalityQuestionMarkKeyword_1_0_0ElementType());
                            					
                            lv_cardinality_1_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTerminalToken5517); 

                            						doneLeaf(lv_cardinality_1_1);
                            					

                            }
                            break;
                        case 2 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1773:6: lv_cardinality_1_2= '*'
                            {

                            						markLeaf(elementTypeProvider.getTerminalToken_CardinalityAsteriskKeyword_1_0_1ElementType());
                            					
                            lv_cardinality_1_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTerminalToken5551); 

                            						doneLeaf(lv_cardinality_1_2);
                            					

                            }
                            break;
                        case 3 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1781:6: lv_cardinality_1_3= '+'
                            {

                            						markLeaf(elementTypeProvider.getTerminalToken_CardinalityPlusSignKeyword_1_0_2ElementType());
                            					
                            lv_cardinality_1_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTerminalToken5585); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1795:1: entryRuleTerminalTokenElement : ruleTerminalTokenElement EOF ;
    public final void entryRuleTerminalTokenElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1795:30: ( ruleTerminalTokenElement EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1796:2: ruleTerminalTokenElement EOF
            {
             markComposite(elementTypeProvider.getTerminalTokenElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_entryRuleTerminalTokenElement5624);
            ruleTerminalTokenElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalTokenElement5627); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1801:1: ruleTerminalTokenElement : ( ruleCharacterRange | ruleRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF ) ;
    public final void ruleTerminalTokenElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1801:25: ( ( ruleCharacterRange | ruleRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1802:2: ( ruleCharacterRange | ruleRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1802:2: ( ruleCharacterRange | ruleRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF )
            int alt52=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt52=1;
                }
                break;
            case RULE_ID:
                {
                alt52=2;
                }
                break;
            case 15:
                {
                alt52=3;
                }
                break;
            case 37:
            case 42:
                {
                alt52=4;
                }
                break;
            case 17:
                {
                alt52=5;
                }
                break;
            case 43:
                {
                alt52=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1803:3: ruleCharacterRange
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_CharacterRangeParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleCharacterRange_in_ruleTerminalTokenElement5644);
                    ruleCharacterRange();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1811:3: ruleRuleCall
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_RuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleTerminalTokenElement5664);
                    ruleRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1819:3: ruleParenthesizedTerminalElement
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_ParenthesizedTerminalElementParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedTerminalElement_in_ruleTerminalTokenElement5684);
                    ruleParenthesizedTerminalElement();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1827:3: ruleAbstractNegatedToken
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_AbstractNegatedTokenParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNegatedToken_in_ruleTerminalTokenElement5704);
                    ruleAbstractNegatedToken();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 5 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1835:3: ruleWildcard
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_WildcardParserRuleCall_4ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleWildcard_in_ruleTerminalTokenElement5724);
                    ruleWildcard();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 6 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1843:3: ruleEOF
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_EOFParserRuleCall_5ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleEOF_in_ruleTerminalTokenElement5744);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1854:1: entryRuleParenthesizedTerminalElement : ruleParenthesizedTerminalElement EOF ;
    public final void entryRuleParenthesizedTerminalElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1854:38: ( ruleParenthesizedTerminalElement EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1855:2: ruleParenthesizedTerminalElement EOF
            {
             markComposite(elementTypeProvider.getParenthesizedTerminalElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedTerminalElement_in_entryRuleParenthesizedTerminalElement5764);
            ruleParenthesizedTerminalElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedTerminalElement5767); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1860:1: ruleParenthesizedTerminalElement : (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' ) ;
    public final void ruleParenthesizedTerminalElement() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1860:33: ( (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1861:2: (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1861:2: (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1862:3: otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')'
            {

            			markLeaf(elementTypeProvider.getParenthesizedTerminalElement_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedTerminalElement5786); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParenthesizedTerminalElement_TerminalAlternativesParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerminalAlternatives_in_ruleParenthesizedTerminalElement5798);
            ruleTerminalAlternatives();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParenthesizedTerminalElement_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParenthesizedTerminalElement5812); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1887:1: entryRuleAbstractNegatedToken : ruleAbstractNegatedToken EOF ;
    public final void entryRuleAbstractNegatedToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1887:30: ( ruleAbstractNegatedToken EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1888:2: ruleAbstractNegatedToken EOF
            {
             markComposite(elementTypeProvider.getAbstractNegatedTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNegatedToken_in_entryRuleAbstractNegatedToken5832);
            ruleAbstractNegatedToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNegatedToken5835); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1893:1: ruleAbstractNegatedToken : ( ruleNegatedToken | ruleUntilToken ) ;
    public final void ruleAbstractNegatedToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1893:25: ( ( ruleNegatedToken | ruleUntilToken ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1894:2: ( ruleNegatedToken | ruleUntilToken )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1894:2: ( ruleNegatedToken | ruleUntilToken )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==42) ) {
                alt53=1;
            }
            else if ( (LA53_0==37) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1895:3: ruleNegatedToken
                    {

                    			markComposite(elementTypeProvider.getAbstractNegatedToken_NegatedTokenParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleNegatedToken_in_ruleAbstractNegatedToken5852);
                    ruleNegatedToken();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1903:3: ruleUntilToken
                    {

                    			markComposite(elementTypeProvider.getAbstractNegatedToken_UntilTokenParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleUntilToken_in_ruleAbstractNegatedToken5872);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1914:1: entryRuleNegatedToken : ruleNegatedToken EOF ;
    public final void entryRuleNegatedToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1914:22: ( ruleNegatedToken EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1915:2: ruleNegatedToken EOF
            {
             markComposite(elementTypeProvider.getNegatedTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNegatedToken_in_entryRuleNegatedToken5892);
            ruleNegatedToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegatedToken5895); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1920:1: ruleNegatedToken : (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final void ruleNegatedToken() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1920:17: ( (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1921:2: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1921:2: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1922:3: otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {

            			markLeaf(elementTypeProvider.getNegatedToken_ExclamationMarkKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNegatedToken5914); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1929:3: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1930:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1930:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1931:5: lv_terminal_1_0= ruleTerminalTokenElement
            {

            					markComposite(elementTypeProvider.getNegatedToken_TerminalTerminalTokenElementParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_ruleNegatedToken5941);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1944:1: entryRuleUntilToken : ruleUntilToken EOF ;
    public final void entryRuleUntilToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1944:20: ( ruleUntilToken EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1945:2: ruleUntilToken EOF
            {
             markComposite(elementTypeProvider.getUntilTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleUntilToken_in_entryRuleUntilToken5972);
            ruleUntilToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUntilToken5975); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1950:1: ruleUntilToken : (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final void ruleUntilToken() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1950:15: ( (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1951:2: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1951:2: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1952:3: otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {

            			markLeaf(elementTypeProvider.getUntilToken_HyphenMinusGreaterThanSignKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleUntilToken5994); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1959:3: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1960:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1960:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1961:5: lv_terminal_1_0= ruleTerminalTokenElement
            {

            					markComposite(elementTypeProvider.getUntilToken_TerminalTerminalTokenElementParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_ruleUntilToken6021);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1974:1: entryRuleWildcard : ruleWildcard EOF ;
    public final void entryRuleWildcard() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1974:18: ( ruleWildcard EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1975:2: ruleWildcard EOF
            {
             markComposite(elementTypeProvider.getWildcardElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleWildcard_in_entryRuleWildcard6052);
            ruleWildcard();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWildcard6055); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1980:1: ruleWildcard : ( () otherlv_1= '.' ) ;
    public final void ruleWildcard() throws RecognitionException {
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1980:13: ( ( () otherlv_1= '.' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1981:2: ( () otherlv_1= '.' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1981:2: ( () otherlv_1= '.' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1982:3: () otherlv_1= '.'
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1982:3: ()
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1983:4: 
            {

            				precedeComposite(elementTypeProvider.getWildcard_WildcardAction_0ElementType());
            				doneComposite();
            			

            }


            			markLeaf(elementTypeProvider.getWildcard_FullStopKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWildcard6087); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1999:1: entryRuleEOF : ruleEOF EOF ;
    public final void entryRuleEOF() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1999:13: ( ruleEOF EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2000:2: ruleEOF EOF
            {
             markComposite(elementTypeProvider.getEOFElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleEOF_in_entryRuleEOF6107);
            ruleEOF();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEOF6110); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2005:1: ruleEOF : ( () otherlv_1= 'EOF' ) ;
    public final void ruleEOF() throws RecognitionException {
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2005:8: ( ( () otherlv_1= 'EOF' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2006:2: ( () otherlv_1= 'EOF' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2006:2: ( () otherlv_1= 'EOF' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2007:3: () otherlv_1= 'EOF'
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2007:3: ()
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2008:4: 
            {

            				precedeComposite(elementTypeProvider.getEOF_EOFAction_0ElementType());
            				doneComposite();
            			

            }


            			markLeaf(elementTypeProvider.getEOF_EOFKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEOF6142); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2024:1: entryRuleCharacterRange : ruleCharacterRange EOF ;
    public final void entryRuleCharacterRange() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2024:24: ( ruleCharacterRange EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2025:2: ruleCharacterRange EOF
            {
             markComposite(elementTypeProvider.getCharacterRangeElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleCharacterRange_in_entryRuleCharacterRange6162);
            ruleCharacterRange();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCharacterRange6165); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2030:1: ruleCharacterRange : ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) ;
    public final void ruleCharacterRange() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2030:19: ( ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2031:2: ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2031:2: ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2032:3: ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            {

            			markComposite(elementTypeProvider.getCharacterRange_KeywordParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleCharacterRange6182);
            ruleKeyword();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2039:3: ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==44) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2040:4: () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2040:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2041:5: 
                    {

                    					precedeComposite(elementTypeProvider.getCharacterRange_CharacterRangeLeftAction_1_0ElementType());
                    					doneComposite();
                    				

                    }


                    				markLeaf(elementTypeProvider.getCharacterRange_FullStopFullStopKeyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleCharacterRange6218); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2053:4: ( (lv_right_3_0= ruleKeyword ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2054:5: (lv_right_3_0= ruleKeyword )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2054:5: (lv_right_3_0= ruleKeyword )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2055:6: lv_right_3_0= ruleKeyword
                    {

                    						markComposite(elementTypeProvider.getCharacterRange_RightKeywordParserRuleCall_1_2_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleCharacterRange6250);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2069:1: entryRuleEnumRule : ruleEnumRule EOF ;
    public final void entryRuleEnumRule() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2069:18: ( ruleEnumRule EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2070:2: ruleEnumRule EOF
            {
             markComposite(elementTypeProvider.getEnumRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumRule_in_entryRuleEnumRule6289);
            ruleEnumRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumRule6292); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2075:1: ruleEnumRule : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' ) ;
    public final void ruleEnumRule() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2075:13: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2076:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2076:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2077:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';'
            {

            			markLeaf(elementTypeProvider.getEnumRule_EnumKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEnumRule6311); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2084:3: ( (lv_name_1_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2085:4: (lv_name_1_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2085:4: (lv_name_1_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2086:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getEnumRule_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumRule6338); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2095:3: (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==23) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2096:4: otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) )
                    {

                    				markLeaf(elementTypeProvider.getEnumRule_ReturnsKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEnumRule6369); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2103:4: ( (lv_type_3_0= ruleTypeRef ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2104:5: (lv_type_3_0= ruleTypeRef )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2104:5: (lv_type_3_0= ruleTypeRef )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2105:6: lv_type_3_0= ruleTypeRef
                    {

                    						markComposite(elementTypeProvider.getEnumRule_TypeTypeRefParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleEnumRule6401);
                    ruleTypeRef();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getEnumRule_ColonKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEnumRule6434); 

            			doneLeaf(otherlv_4);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2122:3: ( (lv_alternatives_5_0= ruleEnumLiterals ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2123:4: (lv_alternatives_5_0= ruleEnumLiterals )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2123:4: (lv_alternatives_5_0= ruleEnumLiterals )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2124:5: lv_alternatives_5_0= ruleEnumLiterals
            {

            					markComposite(elementTypeProvider.getEnumRule_AlternativesEnumLiteralsParserRuleCall_4_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiterals_in_ruleEnumRule6461);
            ruleEnumLiterals();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEnumRule_SemicolonKeyword_5ElementType());
            		
            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEnumRule6486); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2144:1: entryRuleEnumLiterals : ruleEnumLiterals EOF ;
    public final void entryRuleEnumLiterals() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2144:22: ( ruleEnumLiterals EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2145:2: ruleEnumLiterals EOF
            {
             markComposite(elementTypeProvider.getEnumLiteralsElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiterals_in_entryRuleEnumLiterals6506);
            ruleEnumLiterals();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumLiterals6509); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2150:1: ruleEnumLiterals : ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) ;
    public final void ruleEnumLiterals() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2150:17: ( ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2151:2: ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2151:2: ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2152:3: ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getEnumLiterals_EnumLiteralDeclarationParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals6526);
            ruleEnumLiteralDeclaration();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2159:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==27) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2160:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2160:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2161:5: 
                    {

                    					precedeComposite(elementTypeProvider.getEnumLiterals_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2166:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==27) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2167:5: otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getEnumLiterals_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEnumLiterals6569); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2174:5: ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2175:6: (lv_elements_3_0= ruleEnumLiteralDeclaration )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2175:6: (lv_elements_3_0= ruleEnumLiteralDeclaration )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2176:7: lv_elements_3_0= ruleEnumLiteralDeclaration
                    	    {

                    	    							markComposite(elementTypeProvider.getEnumLiterals_ElementsEnumLiteralDeclarationParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals6606);
                    	    ruleEnumLiteralDeclaration();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


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
    // $ANTLR end "ruleEnumLiterals"


    // $ANTLR start "entryRuleEnumLiteralDeclaration"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2191:1: entryRuleEnumLiteralDeclaration : ruleEnumLiteralDeclaration EOF ;
    public final void entryRuleEnumLiteralDeclaration() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2191:32: ( ruleEnumLiteralDeclaration EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2192:2: ruleEnumLiteralDeclaration EOF
            {
             markComposite(elementTypeProvider.getEnumLiteralDeclarationElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDeclaration_in_entryRuleEnumLiteralDeclaration6654);
            ruleEnumLiteralDeclaration();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumLiteralDeclaration6657); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2197:1: ruleEnumLiteralDeclaration : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) ;
    public final void ruleEnumLiteralDeclaration() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2197:27: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2198:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2198:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2199:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2199:3: ( (otherlv_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2200:4: (otherlv_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2200:4: (otherlv_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2201:5: otherlv_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getEnumLiteralDeclaration_EnumLiteralEEnumLiteralCrossReference_0_0ElementType());
            				
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumLiteralDeclaration6689); 

            					doneLeaf(otherlv_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2210:3: (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==32) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2211:4: otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) )
                    {

                    				markLeaf(elementTypeProvider.getEnumLiteralDeclaration_EqualsSignKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEnumLiteralDeclaration6720); 

                    				doneLeaf(otherlv_1);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2218:4: ( (lv_literal_2_0= ruleKeyword ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2219:5: (lv_literal_2_0= ruleKeyword )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2219:5: (lv_literal_2_0= ruleKeyword )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2220:6: lv_literal_2_0= ruleKeyword
                    {

                    						markComposite(elementTypeProvider.getEnumLiteralDeclaration_LiteralKeywordParserRuleCall_1_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleEnumLiteralDeclaration6752);
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
        public static final BitSet FOLLOW_ruleGrammarID_in_ruleGrammar103 = new BitSet(new long[]{0x0000220000345010L});
        public static final BitSet FOLLOW_12_in_ruleGrammar134 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleGrammarID_in_ruleGrammar164 = new BitSet(new long[]{0x0000220000347010L});
        public static final BitSet FOLLOW_13_in_ruleGrammar201 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleGrammarID_in_ruleGrammar236 = new BitSet(new long[]{0x0000220000347010L});
        public static final BitSet FOLLOW_14_in_ruleGrammar299 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGrammar329 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGrammar370 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleGrammar413 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGrammar455 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_ruleGrammar504 = new BitSet(new long[]{0x0000220000345010L});
        public static final BitSet FOLLOW_ruleAbstractMetamodelDeclaration_in_ruleGrammar537 = new BitSet(new long[]{0x0000220000345010L});
        public static final BitSet FOLLOW_ruleAbstractRule_in_ruleGrammar576 = new BitSet(new long[]{0x0000220000345012L});
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
        public static final BitSet FOLLOW_21_in_ruleParserRule1225 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParserRule1277 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleParserRule1329 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_21_in_ruleParserRule1400 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParserRule1453 = new BitSet(new long[]{0x0000000001804000L});
        public static final BitSet FOLLOW_23_in_ruleParserRule1496 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleParserRule1538 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_14_in_ruleParserRule1609 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleParserRule1639 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParserRule1680 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleParserRule1723 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParserRule1765 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_ruleParserRule1814 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleParserRule1834 = new BitSet(new long[]{0x0000003080008030L});
        public static final BitSet FOLLOW_ruleAlternatives_in_ruleParserRule1861 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleParserRule1886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef1906 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef1909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeRef1949 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleTypeRef1979 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeRef2012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives2043 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroup_in_ruleAlternatives2063 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleAlternatives2106 = new BitSet(new long[]{0x0000003080008030L});
        public static final BitSet FOLLOW_ruleUnorderedGroup_in_ruleAlternatives2143 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroup_in_entryRuleUnorderedGroup2191 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedGroup2194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleUnorderedGroup2211 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleUnorderedGroup2254 = new BitSet(new long[]{0x0000003080008030L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleUnorderedGroup2291 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup2339 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup2342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractToken_in_ruleGroup2359 = new BitSet(new long[]{0x0000003080008032L});
        public static final BitSet FOLLOW_ruleAbstractToken_in_ruleGroup2410 = new BitSet(new long[]{0x0000003080008032L});
        public static final BitSet FOLLOW_ruleAbstractToken_in_entryRuleAbstractToken2450 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractToken2453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractTokenWithCardinality_in_ruleAbstractToken2470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_ruleAbstractToken2490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractTokenWithCardinality_in_entryRuleAbstractTokenWithCardinality2510 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractTokenWithCardinality2513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleAbstractTokenWithCardinality2536 = new BitSet(new long[]{0x0000000060400002L});
        public static final BitSet FOLLOW_ruleAbstractTerminal_in_ruleAbstractTokenWithCardinality2560 = new BitSet(new long[]{0x0000000060400002L});
        public static final BitSet FOLLOW_29_in_ruleAbstractTokenWithCardinality2600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAbstractTokenWithCardinality2634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleAbstractTokenWithCardinality2668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2707 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction2710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleAction2729 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleAction2756 = new BitSet(new long[]{0x0000000800020000L});
        public static final BitSet FOLLOW_17_in_ruleAction2787 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAction2819 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_32_in_ruleAction2873 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_33_in_ruleAction2911 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleAction2949 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleAction2969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractTerminal_in_entryRuleAbstractTerminal2989 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractTerminal2992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleAbstractTerminal3009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleAbstractTerminal3029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedElement_in_ruleAbstractTerminal3049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedKeyword_in_ruleAbstractTerminal3069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedRuleCall_in_ruleAbstractTerminal3089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedGroup_in_ruleAbstractTerminal3109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_entryRuleKeyword3129 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyword3132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleKeyword3157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_entryRuleRuleCall3182 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRuleCall3185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleID_in_ruleRuleCall3208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleID_in_entryRuleRuleID3233 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRuleID3236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRuleID3255 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleRuleID3275 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRuleID3292 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rulePredicatedKeyword_in_entryRulePredicatedKeyword3318 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicatedKeyword3321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rulePredicatedKeyword3361 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_37_in_rulePredicatedKeyword3415 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePredicatedKeyword3460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedRuleCall_in_entryRulePredicatedRuleCall3491 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicatedRuleCall3494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rulePredicatedRuleCall3534 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_37_in_rulePredicatedRuleCall3588 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePredicatedRuleCall3633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3664 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleAssignment3707 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_37_in_ruleAssignment3761 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment3807 = new BitSet(new long[]{0x0000004300000000L});
        public static final BitSet FOLLOW_33_in_ruleAssignment3853 = new BitSet(new long[]{0x0000008000008030L});
        public static final BitSet FOLLOW_32_in_ruleAssignment3887 = new BitSet(new long[]{0x0000008000008030L});
        public static final BitSet FOLLOW_38_in_ruleAssignment3921 = new BitSet(new long[]{0x0000008000008030L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_ruleAssignment3966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_entryRuleAssignableTerminal3997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignableTerminal4000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleAssignableTerminal4017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleAssignableTerminal4037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedAssignableElement_in_ruleAssignableTerminal4057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCrossReference_in_ruleAssignableTerminal4077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedAssignableElement_in_entryRuleParenthesizedAssignableElement4097 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedAssignableElement4100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedAssignableElement4119 = new BitSet(new long[]{0x0000008000008030L});
        public static final BitSet FOLLOW_ruleAssignableAlternatives_in_ruleParenthesizedAssignableElement4131 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParenthesizedAssignableElement4145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignableAlternatives_in_entryRuleAssignableAlternatives4165 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignableAlternatives4168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives4185 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleAssignableAlternatives4228 = new BitSet(new long[]{0x0000008000008030L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives4265 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleCrossReference_in_entryRuleCrossReference4313 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCrossReference4316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleCrossReference4335 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleCrossReference4362 = new BitSet(new long[]{0x0000010008000000L});
        public static final BitSet FOLLOW_27_in_ruleCrossReference4393 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleCrossReferenceableTerminal_in_ruleCrossReference4425 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleCrossReference4458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCrossReferenceableTerminal_in_entryRuleCrossReferenceableTerminal4478 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCrossReferenceableTerminal4481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleCrossReferenceableTerminal4498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleCrossReferenceableTerminal4518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement4538 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedElement4541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedElement4560 = new BitSet(new long[]{0x0000003080008030L});
        public static final BitSet FOLLOW_ruleAlternatives_in_ruleParenthesizedElement4572 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParenthesizedElement4586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedGroup_in_entryRulePredicatedGroup4606 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicatedGroup4609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rulePredicatedGroup4649 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_37_in_rulePredicatedGroup4703 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePredicatedGroup4735 = new BitSet(new long[]{0x0000003080008030L});
        public static final BitSet FOLLOW_ruleAlternatives_in_rulePredicatedGroup4762 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePredicatedGroup4787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalRule_in_entryRuleTerminalRule4807 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalRule4810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleTerminalRule4829 = new BitSet(new long[]{0x0000000000200010L});
        public static final BitSet FOLLOW_21_in_ruleTerminalRule4873 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalRule4925 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalRule4996 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleTerminalRule5039 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleTerminalRule5081 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTerminalRule5131 = new BitSet(new long[]{0x00000C2000028030L});
        public static final BitSet FOLLOW_ruleTerminalAlternatives_in_ruleTerminalRule5158 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleTerminalRule5183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalAlternatives_in_entryRuleTerminalAlternatives5203 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalAlternatives5206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives5223 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleTerminalAlternatives5266 = new BitSet(new long[]{0x00000C2000028030L});
        public static final BitSet FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives5303 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleTerminalGroup_in_entryRuleTerminalGroup5351 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalGroup5354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalToken_in_ruleTerminalGroup5371 = new BitSet(new long[]{0x00000C2000028032L});
        public static final BitSet FOLLOW_ruleTerminalToken_in_ruleTerminalGroup5422 = new BitSet(new long[]{0x00000C2000028032L});
        public static final BitSet FOLLOW_ruleTerminalToken_in_entryRuleTerminalToken5462 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalToken5465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_ruleTerminalToken5482 = new BitSet(new long[]{0x0000000060400002L});
        public static final BitSet FOLLOW_29_in_ruleTerminalToken5517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleTerminalToken5551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleTerminalToken5585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_entryRuleTerminalTokenElement5624 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalTokenElement5627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterRange_in_ruleTerminalTokenElement5644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleTerminalTokenElement5664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedTerminalElement_in_ruleTerminalTokenElement5684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNegatedToken_in_ruleTerminalTokenElement5704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcard_in_ruleTerminalTokenElement5724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEOF_in_ruleTerminalTokenElement5744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedTerminalElement_in_entryRuleParenthesizedTerminalElement5764 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedTerminalElement5767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedTerminalElement5786 = new BitSet(new long[]{0x00000C2000028030L});
        public static final BitSet FOLLOW_ruleTerminalAlternatives_in_ruleParenthesizedTerminalElement5798 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParenthesizedTerminalElement5812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNegatedToken_in_entryRuleAbstractNegatedToken5832 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNegatedToken5835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegatedToken_in_ruleAbstractNegatedToken5852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUntilToken_in_ruleAbstractNegatedToken5872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegatedToken_in_entryRuleNegatedToken5892 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegatedToken5895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleNegatedToken5914 = new BitSet(new long[]{0x00000C2000028030L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_ruleNegatedToken5941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUntilToken_in_entryRuleUntilToken5972 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUntilToken5975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleUntilToken5994 = new BitSet(new long[]{0x00000C2000028030L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_ruleUntilToken6021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcard_in_entryRuleWildcard6052 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWildcard6055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleWildcard6087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEOF_in_entryRuleEOF6107 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEOF6110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEOF6142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterRange_in_entryRuleCharacterRange6162 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCharacterRange6165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleCharacterRange6182 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_44_in_ruleCharacterRange6218 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleCharacterRange6250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumRule_in_entryRuleEnumRule6289 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumRule6292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEnumRule6311 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumRule6338 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleEnumRule6369 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleEnumRule6401 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleEnumRule6434 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumLiterals_in_ruleEnumRule6461 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleEnumRule6486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumLiterals_in_entryRuleEnumLiterals6506 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiterals6509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals6526 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleEnumLiterals6569 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals6606 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleEnumLiteralDeclaration_in_entryRuleEnumLiteralDeclaration6654 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteralDeclaration6657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLiteralDeclaration6689 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleEnumLiteralDeclaration6720 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleEnumLiteralDeclaration6752 = new BitSet(new long[]{0x0000000000000002L});
    }


}