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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:418:1: ruleParserRule : ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ruleRuleNameAndParams (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )? otherlv_13= ':' ( (lv_alternatives_14_0= ruleAlternatives ) ) otherlv_15= ';' ) ;
    public final void ruleParserRule() throws RecognitionException {
        Token lv_fragment_0_0=null;
        Token lv_wildcard_2_0=null;
        Token lv_fragment_3_0=null;
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
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:418:15: ( ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ruleRuleNameAndParams (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )? otherlv_13= ':' ( (lv_alternatives_14_0= ruleAlternatives ) ) otherlv_15= ';' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:419:2: ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ruleRuleNameAndParams (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )? otherlv_13= ':' ( (lv_alternatives_14_0= ruleAlternatives ) ) otherlv_15= ';' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:419:2: ( ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ruleRuleNameAndParams (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )? otherlv_13= ':' ( (lv_alternatives_14_0= ruleAlternatives ) ) otherlv_15= ';' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:420:3: ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ruleRuleNameAndParams (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) ) ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )? otherlv_13= ':' ( (lv_alternatives_14_0= ruleAlternatives ) ) otherlv_15= ';'
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:420:3: ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ruleRuleNameAndParams (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:421:4: ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( (lv_wildcard_2_0= '*' ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:421:4: ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( (lv_wildcard_2_0= '*' ) ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:422:5: ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( (lv_wildcard_2_0= '*' ) )
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
                    				
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:440:5: ( (lv_wildcard_2_0= '*' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:441:6: (lv_wildcard_2_0= '*' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:441:6: (lv_wildcard_2_0= '*' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:442:7: lv_wildcard_2_0= '*'
                    {

                    							markLeaf(elementTypeProvider.getParserRule_WildcardAsteriskKeyword_0_0_2_0ElementType());
                    						
                    lv_wildcard_2_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParserRule1295); 

                    							doneLeaf(lv_wildcard_2_0);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:453:4: ( ( (lv_fragment_3_0= 'fragment' ) )? ruleRuleNameAndParams (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:453:4: ( ( (lv_fragment_3_0= 'fragment' ) )? ruleRuleNameAndParams (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:454:5: ( (lv_fragment_3_0= 'fragment' ) )? ruleRuleNameAndParams (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )?
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:454:5: ( (lv_fragment_3_0= 'fragment' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==21) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:455:6: (lv_fragment_3_0= 'fragment' )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:455:6: (lv_fragment_3_0= 'fragment' )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:456:7: lv_fragment_3_0= 'fragment'
                            {

                            							markLeaf(elementTypeProvider.getParserRule_FragmentFragmentKeyword_0_1_0_0ElementType());
                            						
                            lv_fragment_3_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParserRule1366); 

                            							doneLeaf(lv_fragment_3_0);
                            						

                            }


                            }
                            break;

                    }


                    					markComposite(elementTypeProvider.getParserRule_RuleNameAndParamsParserRuleCall_0_1_1ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_ruleRuleNameAndParams_in_ruleParserRule1400);
                    ruleRuleNameAndParams();

                    state._fsp--;


                    					doneComposite();
                    				
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:472:5: (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==23) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:473:6: otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) )
                            {

                            						markLeaf(elementTypeProvider.getParserRule_ReturnsKeyword_0_1_2_0ElementType());
                            					
                            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleParserRule1428); 

                            						doneLeaf(otherlv_5);
                            					
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:480:6: ( (lv_type_6_0= ruleTypeRef ) )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:481:7: (lv_type_6_0= ruleTypeRef )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:481:7: (lv_type_6_0= ruleTypeRef )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:482:8: lv_type_6_0= ruleTypeRef
                            {

                            								markComposite(elementTypeProvider.getParserRule_TypeTypeRefParserRuleCall_0_1_2_1_0ElementType());
                            							
                            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleParserRule1470);
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

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:494:3: ( ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:495:4: ( (lv_definesHiddenTokens_7_0= 'hidden' ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')'
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:495:4: ( (lv_definesHiddenTokens_7_0= 'hidden' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:496:5: (lv_definesHiddenTokens_7_0= 'hidden' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:496:5: (lv_definesHiddenTokens_7_0= 'hidden' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:497:6: lv_definesHiddenTokens_7_0= 'hidden'
                    {

                    						markLeaf(elementTypeProvider.getParserRule_DefinesHiddenTokensHiddenKeyword_1_0_0ElementType());
                    					
                    lv_definesHiddenTokens_7_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParserRule1541); 

                    						doneLeaf(lv_definesHiddenTokens_7_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getParserRule_LeftParenthesisKeyword_1_1ElementType());
                    			
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParserRule1571); 

                    				doneLeaf(otherlv_8);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:513:4: ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:514:5: ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:514:5: ( (otherlv_9= RULE_ID ) )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:515:6: (otherlv_9= RULE_ID )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:515:6: (otherlv_9= RULE_ID )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:516:7: otherlv_9= RULE_ID
                            {

                            							markLeaf(elementTypeProvider.getParserRule_HiddenTokensAbstractRuleCrossReference_1_2_0_0ElementType());
                            						
                            otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParserRule1612); 

                            							doneLeaf(otherlv_9);
                            						

                            }


                            }

                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:525:5: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==13) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:526:6: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                            	    {

                            	    						markLeaf(elementTypeProvider.getParserRule_CommaKeyword_1_2_1_0ElementType());
                            	    					
                            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParserRule1655); 

                            	    						doneLeaf(otherlv_10);
                            	    					
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:533:6: ( (otherlv_11= RULE_ID ) )
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:534:7: (otherlv_11= RULE_ID )
                            	    {
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:534:7: (otherlv_11= RULE_ID )
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:535:8: otherlv_11= RULE_ID
                            	    {

                            	    								markLeaf(elementTypeProvider.getParserRule_HiddenTokensAbstractRuleCrossReference_1_2_1_1_0ElementType());
                            	    							
                            	    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParserRule1697); 

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
                    			
                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParserRule1746); 

                    				doneLeaf(otherlv_12);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getParserRule_ColonKeyword_2ElementType());
            		
            otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleParserRule1766); 

            			doneLeaf(otherlv_13);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:561:3: ( (lv_alternatives_14_0= ruleAlternatives ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:562:4: (lv_alternatives_14_0= ruleAlternatives )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:562:4: (lv_alternatives_14_0= ruleAlternatives )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:563:5: lv_alternatives_14_0= ruleAlternatives
            {

            					markComposite(elementTypeProvider.getParserRule_AlternativesAlternativesParserRuleCall_3_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_ruleParserRule1793);
            ruleAlternatives();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getParserRule_SemicolonKeyword_4ElementType());
            		
            otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleParserRule1818); 

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


    // $ANTLR start "entryRuleRuleNameAndParams"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:583:1: entryRuleRuleNameAndParams : ruleRuleNameAndParams EOF ;
    public final void entryRuleRuleNameAndParams() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:583:27: ( ruleRuleNameAndParams EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:584:2: ruleRuleNameAndParams EOF
            {
             markComposite(elementTypeProvider.getRuleNameAndParamsElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleRuleNameAndParams_in_entryRuleRuleNameAndParams1838);
            ruleRuleNameAndParams();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRuleNameAndParams1841); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:589:1: ruleRuleNameAndParams : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )? ) ;
    public final void ruleRuleNameAndParams() throws RecognitionException {
        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:589:22: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:590:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:590:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:591:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )?
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:591:3: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:592:4: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:592:4: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:593:5: lv_name_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getRuleNameAndParams_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRuleNameAndParams1873); 

            					doneLeaf(lv_name_0_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:602:3: (otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:603:4: otherlv_1= '[' ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )? otherlv_5= ']'
                    {

                    				markLeaf(elementTypeProvider.getRuleNameAndParams_LeftSquareBracketKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRuleNameAndParams1904); 

                    				doneLeaf(otherlv_1);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:610:4: ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:611:5: ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:611:5: ( (lv_parameters_2_0= ruleParameter ) )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:612:6: (lv_parameters_2_0= ruleParameter )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:612:6: (lv_parameters_2_0= ruleParameter )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:613:7: lv_parameters_2_0= ruleParameter
                            {

                            							markComposite(elementTypeProvider.getRuleNameAndParams_ParametersParameterParserRuleCall_1_1_0_0ElementType());
                            						
                            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleRuleNameAndParams1945);
                            ruleParameter();

                            state._fsp--;


                            							doneComposite();
                            						

                            }


                            }

                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:622:5: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==13) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:623:6: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                            	    {

                            	    						markLeaf(elementTypeProvider.getRuleNameAndParams_CommaKeyword_1_1_1_0ElementType());
                            	    					
                            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRuleNameAndParams1988); 

                            	    						doneLeaf(otherlv_3);
                            	    					
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:630:6: ( (lv_parameters_4_0= ruleParameter ) )
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:631:7: (lv_parameters_4_0= ruleParameter )
                            	    {
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:631:7: (lv_parameters_4_0= ruleParameter )
                            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:632:8: lv_parameters_4_0= ruleParameter
                            	    {

                            	    								markComposite(elementTypeProvider.getRuleNameAndParams_ParametersParameterParserRuleCall_1_1_1_1_0ElementType());
                            	    							
                            	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleRuleNameAndParams2030);
                            	    ruleParameter();

                            	    state._fsp--;


                            	    								doneComposite();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }


                    				markLeaf(elementTypeProvider.getRuleNameAndParams_RightSquareBracketKeyword_1_2ElementType());
                    			
                    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRuleNameAndParams2079); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:655:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:655:19: ( ruleParameter EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:656:2: ruleParameter EOF
            {
             markComposite(elementTypeProvider.getParameterElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter2105);
            ruleParameter();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter2108); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:661:1: ruleParameter : ( (lv_name_0_0= RULE_ID ) ) ;
    public final void ruleParameter() throws RecognitionException {
        Token lv_name_0_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:661:14: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:662:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:662:2: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:663:3: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:663:3: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:664:4: lv_name_0_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getParameter_NameIDTerminalRuleCall_0ElementType());
            			
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParameter2133); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:676:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:676:17: ( ruleTypeRef EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:677:2: ruleTypeRef EOF
            {
             markComposite(elementTypeProvider.getTypeRefElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_entryRuleTypeRef2158);
            ruleTypeRef();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeRef2161); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:682:1: ruleTypeRef : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final void ruleTypeRef() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:682:12: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:683:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:683:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:684:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:684:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==28) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:685:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:685:4: ( (otherlv_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:686:5: (otherlv_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:686:5: (otherlv_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:687:6: otherlv_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getTypeRef_MetamodelAbstractMetamodelDeclarationCrossReference_0_0_0ElementType());
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeRef2201); 

                    						doneLeaf(otherlv_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getTypeRef_ColonColonKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTypeRef2231); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:704:3: ( (otherlv_2= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:705:4: (otherlv_2= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:705:4: (otherlv_2= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:706:5: otherlv_2= RULE_ID
            {

            					markLeaf(elementTypeProvider.getTypeRef_ClassifierEClassifierCrossReference_1_0ElementType());
            				
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeRef2264); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:719:1: entryRuleAlternatives : ruleAlternatives EOF ;
    public final void entryRuleAlternatives() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:719:22: ( ruleAlternatives EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:720:2: ruleAlternatives EOF
            {
             markComposite(elementTypeProvider.getAlternativesElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_entryRuleAlternatives2295);
            ruleAlternatives();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAlternatives2298); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:725:1: ruleAlternatives : ( ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? ) ;
    public final void ruleAlternatives() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:725:17: ( ( ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:726:2: ( ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:726:2: ( ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:727:3: ruleConditionalBranch ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getAlternatives_ConditionalBranchParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleConditionalBranch_in_ruleAlternatives2315);
            ruleConditionalBranch();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:734:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+ )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:735:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:735:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:736:5: 
                    {

                    					precedeComposite(elementTypeProvider.getAlternatives_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:741:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==29) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:742:5: otherlv_2= '|' ( (lv_elements_3_0= ruleConditionalBranch ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getAlternatives_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAlternatives2358); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:749:5: ( (lv_elements_3_0= ruleConditionalBranch ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:750:6: (lv_elements_3_0= ruleConditionalBranch )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:750:6: (lv_elements_3_0= ruleConditionalBranch )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:751:7: lv_elements_3_0= ruleConditionalBranch
                    	    {

                    	    							markComposite(elementTypeProvider.getAlternatives_ElementsConditionalBranchParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleConditionalBranch_in_ruleAlternatives2395);
                    	    ruleConditionalBranch();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:766:1: entryRuleConditionalBranch : ruleConditionalBranch EOF ;
    public final void entryRuleConditionalBranch() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:766:27: ( ruleConditionalBranch EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:767:2: ruleConditionalBranch EOF
            {
             markComposite(elementTypeProvider.getConditionalBranchElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditionalBranch_in_entryRuleConditionalBranch2443);
            ruleConditionalBranch();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditionalBranch2446); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:772:1: ruleConditionalBranch : ( ruleUnorderedGroup | ( () otherlv_2= '[' ( (lv_filtered_3_0= ruleInverseLiteralValue ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ( (lv_guardedElement_6_0= ruleUnorderedGroup ) ) ) ) ;
    public final void ruleConditionalBranch() throws RecognitionException {
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:772:22: ( ( ruleUnorderedGroup | ( () otherlv_2= '[' ( (lv_filtered_3_0= ruleInverseLiteralValue ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ( (lv_guardedElement_6_0= ruleUnorderedGroup ) ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:773:2: ( ruleUnorderedGroup | ( () otherlv_2= '[' ( (lv_filtered_3_0= ruleInverseLiteralValue ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ( (lv_guardedElement_6_0= ruleUnorderedGroup ) ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:773:2: ( ruleUnorderedGroup | ( () otherlv_2= '[' ( (lv_filtered_3_0= ruleInverseLiteralValue ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ( (lv_guardedElement_6_0= ruleUnorderedGroup ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||LA25_0==15||LA25_0==33||(LA25_0>=39 && LA25_0<=40)) ) {
                alt25=1;
            }
            else if ( (LA25_0==26) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:774:3: ruleUnorderedGroup
                    {

                    			markComposite(elementTypeProvider.getConditionalBranch_UnorderedGroupParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroup_in_ruleConditionalBranch2463);
                    ruleUnorderedGroup();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:782:3: ( () otherlv_2= '[' ( (lv_filtered_3_0= ruleInverseLiteralValue ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ( (lv_guardedElement_6_0= ruleUnorderedGroup ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:782:3: ( () otherlv_2= '[' ( (lv_filtered_3_0= ruleInverseLiteralValue ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ( (lv_guardedElement_6_0= ruleUnorderedGroup ) ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:783:4: () otherlv_2= '[' ( (lv_filtered_3_0= ruleInverseLiteralValue ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ( (lv_guardedElement_6_0= ruleUnorderedGroup ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:783:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:784:5: 
                    {

                    					precedeComposite(elementTypeProvider.getConditionalBranch_ConditionalBranchAction_1_0ElementType());
                    					doneComposite();
                    				

                    }


                    				markLeaf(elementTypeProvider.getConditionalBranch_LeftSquareBracketKeyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleConditionalBranch2507); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:796:4: ( (lv_filtered_3_0= ruleInverseLiteralValue ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:797:5: (lv_filtered_3_0= ruleInverseLiteralValue )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:797:5: (lv_filtered_3_0= ruleInverseLiteralValue )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:798:6: lv_filtered_3_0= ruleInverseLiteralValue
                    {

                    						markComposite(elementTypeProvider.getConditionalBranch_FilteredInverseLiteralValueParserRuleCall_1_2_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleInverseLiteralValue_in_ruleConditionalBranch2539);
                    ruleInverseLiteralValue();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:807:4: ( (otherlv_4= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:808:5: (otherlv_4= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:808:5: (otherlv_4= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:809:6: otherlv_4= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getConditionalBranch_ParameterParameterCrossReference_1_3_0ElementType());
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConditionalBranch2584); 

                    						doneLeaf(otherlv_4);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getConditionalBranch_RightSquareBracketKeyword_1_4ElementType());
                    			
                    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleConditionalBranch2614); 

                    				doneLeaf(otherlv_5);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:825:4: ( (lv_guardedElement_6_0= ruleUnorderedGroup ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:826:5: (lv_guardedElement_6_0= ruleUnorderedGroup )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:826:5: (lv_guardedElement_6_0= ruleUnorderedGroup )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:827:6: lv_guardedElement_6_0= ruleUnorderedGroup
                    {

                    						markComposite(elementTypeProvider.getConditionalBranch_GuardedElementUnorderedGroupParserRuleCall_1_5_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroup_in_ruleConditionalBranch2646);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:841:1: entryRuleUnorderedGroup : ruleUnorderedGroup EOF ;
    public final void entryRuleUnorderedGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:841:24: ( ruleUnorderedGroup EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:842:2: ruleUnorderedGroup EOF
            {
             markComposite(elementTypeProvider.getUnorderedGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroup_in_entryRuleUnorderedGroup2684);
            ruleUnorderedGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnorderedGroup2687); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:847:1: ruleUnorderedGroup : ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? ) ;
    public final void ruleUnorderedGroup() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:847:19: ( ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:848:2: ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:848:2: ( ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:849:3: ruleGroup ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getUnorderedGroup_GroupParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleUnorderedGroup2704);
            ruleGroup();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:856:3: ( () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+ )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:857:4: () (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:857:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:858:5: 
                    {

                    					precedeComposite(elementTypeProvider.getUnorderedGroup_UnorderedGroupElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:863:4: (otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==30) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:864:5: otherlv_2= '&' ( (lv_elements_3_0= ruleGroup ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getUnorderedGroup_AmpersandKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleUnorderedGroup2747); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:871:5: ( (lv_elements_3_0= ruleGroup ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:872:6: (lv_elements_3_0= ruleGroup )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:872:6: (lv_elements_3_0= ruleGroup )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:873:7: lv_elements_3_0= ruleGroup
                    	    {

                    	    							markComposite(elementTypeProvider.getUnorderedGroup_ElementsGroupParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleUnorderedGroup2784);
                    	    ruleGroup();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:888:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:888:15: ( ruleGroup EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:889:2: ruleGroup EOF
            {
             markComposite(elementTypeProvider.getGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup2832);
            ruleGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup2835); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:894:1: ruleGroup : ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? ) ;
    public final void ruleGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:894:10: ( ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:895:2: ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:895:2: ( ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:896:3: ruleAbstractToken ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )?
            {

            			markComposite(elementTypeProvider.getGroup_AbstractTokenParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAbstractToken_in_ruleGroup2852);
            ruleAbstractToken();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:903:3: ( () ( (lv_elements_2_0= ruleAbstractToken ) )+ )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_STRING)||LA29_0==15||LA29_0==33||(LA29_0>=39 && LA29_0<=40)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:904:4: () ( (lv_elements_2_0= ruleAbstractToken ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:904:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:905:5: 
                    {

                    					precedeComposite(elementTypeProvider.getGroup_GroupElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:910:4: ( (lv_elements_2_0= ruleAbstractToken ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||LA28_0==15||LA28_0==33||(LA28_0>=39 && LA28_0<=40)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:911:5: (lv_elements_2_0= ruleAbstractToken )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:911:5: (lv_elements_2_0= ruleAbstractToken )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:912:6: lv_elements_2_0= ruleAbstractToken
                    	    {

                    	    						markComposite(elementTypeProvider.getGroup_ElementsAbstractTokenParserRuleCall_1_1_0ElementType());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractToken_in_ruleGroup2903);
                    	    ruleAbstractToken();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:926:1: entryRuleAbstractToken : ruleAbstractToken EOF ;
    public final void entryRuleAbstractToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:926:23: ( ruleAbstractToken EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:927:2: ruleAbstractToken EOF
            {
             markComposite(elementTypeProvider.getAbstractTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractToken_in_entryRuleAbstractToken2943);
            ruleAbstractToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractToken2946); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:932:1: ruleAbstractToken : ( ruleAbstractTokenWithCardinality | ruleAction ) ;
    public final void ruleAbstractToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:932:18: ( ( ruleAbstractTokenWithCardinality | ruleAction ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:933:2: ( ruleAbstractTokenWithCardinality | ruleAction )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:933:2: ( ruleAbstractTokenWithCardinality | ruleAction )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_STRING)||LA30_0==15||(LA30_0>=39 && LA30_0<=40)) ) {
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
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:934:3: ruleAbstractTokenWithCardinality
                    {

                    			markComposite(elementTypeProvider.getAbstractToken_AbstractTokenWithCardinalityParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractTokenWithCardinality_in_ruleAbstractToken2963);
                    ruleAbstractTokenWithCardinality();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:942:3: ruleAction
                    {

                    			markComposite(elementTypeProvider.getAbstractToken_ActionParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleAbstractToken2983);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:953:1: entryRuleAbstractTokenWithCardinality : ruleAbstractTokenWithCardinality EOF ;
    public final void entryRuleAbstractTokenWithCardinality() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:953:38: ( ruleAbstractTokenWithCardinality EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:954:2: ruleAbstractTokenWithCardinality EOF
            {
             markComposite(elementTypeProvider.getAbstractTokenWithCardinalityElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractTokenWithCardinality_in_entryRuleAbstractTokenWithCardinality3003);
            ruleAbstractTokenWithCardinality();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractTokenWithCardinality3006); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:959:1: ruleAbstractTokenWithCardinality : ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) ;
    public final void ruleAbstractTokenWithCardinality() throws RecognitionException {
        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:959:33: ( ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:960:2: ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:960:2: ( ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:961:3: ( ruleAssignment | ruleAbstractTerminal ) ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:961:3: ( ruleAssignment | ruleAbstractTerminal )
            int alt31=2;
            switch ( input.LA(1) ) {
            case 39:
                {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==RULE_ID) ) {
                    int LA31_5 = input.LA(3);

                    if ( ((LA31_5>=34 && LA31_5<=35)||LA31_5==41) ) {
                        alt31=1;
                    }
                    else if ( (LA31_5==EOF||(LA31_5>=RULE_ID && LA31_5<=RULE_STRING)||(LA31_5>=15 && LA31_5<=16)||LA31_5==22||LA31_5==25||(LA31_5>=29 && LA31_5<=33)||(LA31_5>=39 && LA31_5<=40)) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA31_1==RULE_STRING||LA31_1==15) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==RULE_STRING||LA31_2==15) ) {
                    alt31=2;
                }
                else if ( (LA31_2==RULE_ID) ) {
                    int LA31_5 = input.LA(3);

                    if ( ((LA31_5>=34 && LA31_5<=35)||LA31_5==41) ) {
                        alt31=1;
                    }
                    else if ( (LA31_5==EOF||(LA31_5>=RULE_ID && LA31_5<=RULE_STRING)||(LA31_5>=15 && LA31_5<=16)||LA31_5==22||LA31_5==25||(LA31_5>=29 && LA31_5<=33)||(LA31_5>=39 && LA31_5<=40)) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA31_3 = input.LA(2);

                if ( ((LA31_3>=34 && LA31_3<=35)||LA31_3==41) ) {
                    alt31=1;
                }
                else if ( (LA31_3==EOF||(LA31_3>=RULE_ID && LA31_3<=RULE_STRING)||(LA31_3>=15 && LA31_3<=16)||LA31_3==22||(LA31_3>=25 && LA31_3<=26)||(LA31_3>=28 && LA31_3<=33)||(LA31_3>=39 && LA31_3<=40)) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case 15:
                {
                alt31=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:962:4: ruleAssignment
                    {

                    				markComposite(elementTypeProvider.getAbstractTokenWithCardinality_AssignmentParserRuleCall_0_0ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleAbstractTokenWithCardinality3029);
                    ruleAssignment();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:970:4: ruleAbstractTerminal
                    {

                    				markComposite(elementTypeProvider.getAbstractTokenWithCardinality_AbstractTerminalParserRuleCall_0_1ElementType());
                    			
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractTerminal_in_ruleAbstractTokenWithCardinality3053);
                    ruleAbstractTerminal();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:978:3: ( ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22||(LA33_0>=31 && LA33_0<=32)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:979:4: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:979:4: ( (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:980:5: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:980:5: (lv_cardinality_2_1= '?' | lv_cardinality_2_2= '*' | lv_cardinality_2_3= '+' )
                    int alt32=3;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt32=1;
                        }
                        break;
                    case 22:
                        {
                        alt32=2;
                        }
                        break;
                    case 32:
                        {
                        alt32=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }

                    switch (alt32) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:981:6: lv_cardinality_2_1= '?'
                            {

                            						markLeaf(elementTypeProvider.getAbstractTokenWithCardinality_CardinalityQuestionMarkKeyword_1_0_0ElementType());
                            					
                            lv_cardinality_2_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAbstractTokenWithCardinality3093); 

                            						doneLeaf(lv_cardinality_2_1);
                            					

                            }
                            break;
                        case 2 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:989:6: lv_cardinality_2_2= '*'
                            {

                            						markLeaf(elementTypeProvider.getAbstractTokenWithCardinality_CardinalityAsteriskKeyword_1_0_1ElementType());
                            					
                            lv_cardinality_2_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAbstractTokenWithCardinality3127); 

                            						doneLeaf(lv_cardinality_2_2);
                            					

                            }
                            break;
                        case 3 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:997:6: lv_cardinality_2_3= '+'
                            {

                            						markLeaf(elementTypeProvider.getAbstractTokenWithCardinality_CardinalityPlusSignKeyword_1_0_2ElementType());
                            					
                            lv_cardinality_2_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAbstractTokenWithCardinality3161); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1011:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1011:16: ( ruleAction EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1012:2: ruleAction EOF
            {
             markComposite(elementTypeProvider.getActionElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction3200);
            ruleAction();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction3203); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1017:1: ruleAction : (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) ;
    public final void ruleAction() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_feature_3_0=null;
        Token lv_operator_4_1=null;
        Token lv_operator_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1017:11: ( (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1018:2: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1018:2: (otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1019:3: otherlv_0= '{' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )? otherlv_6= '}'
            {

            			markLeaf(elementTypeProvider.getAction_LeftCurlyBracketKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAction3222); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1026:3: ( (lv_type_1_0= ruleTypeRef ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1027:4: (lv_type_1_0= ruleTypeRef )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1027:4: (lv_type_1_0= ruleTypeRef )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1028:5: lv_type_1_0= ruleTypeRef
            {

            					markComposite(elementTypeProvider.getAction_TypeTypeRefParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleAction3249);
            ruleTypeRef();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1037:3: (otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==17) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1038:4: otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) ) otherlv_5= 'current'
                    {

                    				markLeaf(elementTypeProvider.getAction_FullStopKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAction3280); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1045:4: ( (lv_feature_3_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1046:5: (lv_feature_3_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1046:5: (lv_feature_3_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1047:6: lv_feature_3_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getAction_FeatureIDTerminalRuleCall_2_1_0ElementType());
                    					
                    lv_feature_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAction3312); 

                    						doneLeaf(lv_feature_3_0);
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1056:4: ( ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1057:5: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1057:5: ( (lv_operator_4_1= '=' | lv_operator_4_2= '+=' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1058:6: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1058:6: (lv_operator_4_1= '=' | lv_operator_4_2= '+=' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==34) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==35) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1059:7: lv_operator_4_1= '='
                            {

                            							markLeaf(elementTypeProvider.getAction_OperatorEqualsSignKeyword_2_2_0_0ElementType());
                            						
                            lv_operator_4_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAction3366); 

                            							doneLeaf(lv_operator_4_1);
                            						

                            }
                            break;
                        case 2 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1067:7: lv_operator_4_2= '+='
                            {

                            							markLeaf(elementTypeProvider.getAction_OperatorPlusSignEqualsSignKeyword_2_2_0_1ElementType());
                            						
                            lv_operator_4_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAction3404); 

                            							doneLeaf(lv_operator_4_2);
                            						

                            }
                            break;

                    }


                    }


                    }


                    				markLeaf(elementTypeProvider.getAction_CurrentKeyword_2_3ElementType());
                    			
                    otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAction3442); 

                    				doneLeaf(otherlv_5);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getAction_RightCurlyBracketKeyword_3ElementType());
            		
            otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAction3462); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1096:1: entryRuleAbstractTerminal : ruleAbstractTerminal EOF ;
    public final void entryRuleAbstractTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1096:26: ( ruleAbstractTerminal EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1097:2: ruleAbstractTerminal EOF
            {
             markComposite(elementTypeProvider.getAbstractTerminalElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractTerminal_in_entryRuleAbstractTerminal3482);
            ruleAbstractTerminal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractTerminal3485); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1102:1: ruleAbstractTerminal : ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup ) ;
    public final void ruleAbstractTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1102:21: ( ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1103:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1103:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedElement | rulePredicatedKeyword | rulePredicatedRuleCall | rulePredicatedGroup )
            int alt36=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt36=1;
                }
                break;
            case RULE_ID:
                {
                alt36=2;
                }
                break;
            case 15:
                {
                alt36=3;
                }
                break;
            case 39:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt36=5;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt36=4;
                    }
                    break;
                case 15:
                    {
                    alt36=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 4, input);

                    throw nvae;
                }

                }
                break;
            case 40:
                {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt36=6;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt36=4;
                    }
                    break;
                case RULE_ID:
                    {
                    alt36=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 5, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1104:3: ruleKeyword
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_KeywordParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleAbstractTerminal3502);
                    ruleKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1112:3: ruleRuleCall
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_RuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleAbstractTerminal3522);
                    ruleRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1120:3: ruleParenthesizedElement
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_ParenthesizedElementParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedElement_in_ruleAbstractTerminal3542);
                    ruleParenthesizedElement();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1128:3: rulePredicatedKeyword
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_PredicatedKeywordParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_rulePredicatedKeyword_in_ruleAbstractTerminal3562);
                    rulePredicatedKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 5 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1136:3: rulePredicatedRuleCall
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_PredicatedRuleCallParserRuleCall_4ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_rulePredicatedRuleCall_in_ruleAbstractTerminal3582);
                    rulePredicatedRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 6 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1144:3: rulePredicatedGroup
                    {

                    			markComposite(elementTypeProvider.getAbstractTerminal_PredicatedGroupParserRuleCall_5ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_rulePredicatedGroup_in_ruleAbstractTerminal3602);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1155:1: entryRuleKeyword : ruleKeyword EOF ;
    public final void entryRuleKeyword() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1155:17: ( ruleKeyword EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1156:2: ruleKeyword EOF
            {
             markComposite(elementTypeProvider.getKeywordElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_entryRuleKeyword3622);
            ruleKeyword();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyword3625); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1161:1: ruleKeyword : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final void ruleKeyword() throws RecognitionException {
        Token lv_value_0_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1161:12: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1162:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1162:2: ( (lv_value_0_0= RULE_STRING ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1163:3: (lv_value_0_0= RULE_STRING )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1163:3: (lv_value_0_0= RULE_STRING )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1164:4: lv_value_0_0= RULE_STRING
            {

            				markLeaf(elementTypeProvider.getKeyword_ValueSTRINGTerminalRuleCall_0ElementType());
            			
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleKeyword3650); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1176:1: entryRuleRuleCall : ruleRuleCall EOF ;
    public final void entryRuleRuleCall() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1176:18: ( ruleRuleCall EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1177:2: ruleRuleCall EOF
            {
             markComposite(elementTypeProvider.getRuleCallElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_entryRuleRuleCall3675);
            ruleRuleCall();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRuleCall3678); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1182:1: ruleRuleCall : ( () ( ( ruleRuleID ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleNamedArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) ) )* otherlv_6= ']' )? ) ;
    public final void ruleRuleCall() throws RecognitionException {
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1182:13: ( ( () ( ( ruleRuleID ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleNamedArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) ) )* otherlv_6= ']' )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1183:2: ( () ( ( ruleRuleID ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleNamedArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) ) )* otherlv_6= ']' )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1183:2: ( () ( ( ruleRuleID ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleNamedArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) ) )* otherlv_6= ']' )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1184:3: () ( ( ruleRuleID ) ) (otherlv_2= '[' ( (lv_arguments_3_0= ruleNamedArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) ) )* otherlv_6= ']' )?
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1184:3: ()
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1185:4: 
            {

            				precedeComposite(elementTypeProvider.getRuleCall_RuleCallAction_0ElementType());
            				doneComposite();
            			

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1190:3: ( ( ruleRuleID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1191:4: ( ruleRuleID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1191:4: ( ruleRuleID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1192:5: ruleRuleID
            {

            					markComposite(elementTypeProvider.getRuleCall_RuleAbstractRuleCrossReference_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleRuleID_in_ruleRuleCall3721);
            ruleRuleID();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1201:3: (otherlv_2= '[' ( (lv_arguments_3_0= ruleNamedArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) ) )* otherlv_6= ']' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1202:4: otherlv_2= '[' ( (lv_arguments_3_0= ruleNamedArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) ) )* otherlv_6= ']'
                    {

                    				markLeaf(elementTypeProvider.getRuleCall_LeftSquareBracketKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRuleCall3752); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1209:4: ( (lv_arguments_3_0= ruleNamedArgument ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1210:5: (lv_arguments_3_0= ruleNamedArgument )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1210:5: (lv_arguments_3_0= ruleNamedArgument )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1211:6: lv_arguments_3_0= ruleNamedArgument
                    {

                    						markComposite(elementTypeProvider.getRuleCall_ArgumentsNamedArgumentParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleNamedArgument_in_ruleRuleCall3784);
                    ruleNamedArgument();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1220:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==13) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1221:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleNamedArgument ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getRuleCall_CommaKeyword_2_2_0ElementType());
                    	    				
                    	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRuleCall3821); 

                    	    					doneLeaf(otherlv_4);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1228:5: ( (lv_arguments_5_0= ruleNamedArgument ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1229:6: (lv_arguments_5_0= ruleNamedArgument )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1229:6: (lv_arguments_5_0= ruleNamedArgument )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1230:7: lv_arguments_5_0= ruleNamedArgument
                    	    {

                    	    							markComposite(elementTypeProvider.getRuleCall_ArgumentsNamedArgumentParserRuleCall_2_2_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleNamedArgument_in_ruleRuleCall3858);
                    	    ruleNamedArgument();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    				markLeaf(elementTypeProvider.getRuleCall_RightSquareBracketKeyword_2_3ElementType());
                    			
                    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRuleCall3897); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1252:1: entryRuleLiteralValue : ruleLiteralValue EOF ;
    public final void entryRuleLiteralValue() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1252:22: ( ruleLiteralValue EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1253:2: ruleLiteralValue EOF
            {
             markComposite(elementTypeProvider.getLiteralValueElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue3923);
            ruleLiteralValue();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralValue3926); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1258:1: ruleLiteralValue : (kw= '!' | kw= '+' ) ;
    public final void ruleLiteralValue() throws RecognitionException {
        Token kw=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1258:17: ( (kw= '!' | kw= '+' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1259:2: (kw= '!' | kw= '+' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1259:2: (kw= '!' | kw= '+' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            else if ( (LA39_0==32) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1260:3: kw= '!'
                    {

                    			markLeaf(elementTypeProvider.getLiteralValue_ExclamationMarkKeyword_0ElementType());
                    		
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleLiteralValue3945); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1268:3: kw= '+'
                    {

                    			markLeaf(elementTypeProvider.getLiteralValue_PlusSignKeyword_1ElementType());
                    		
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleLiteralValue3967); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1279:1: entryRuleInverseLiteralValue : ruleInverseLiteralValue EOF ;
    public final void entryRuleInverseLiteralValue() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1279:29: ( ruleInverseLiteralValue EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1280:2: ruleInverseLiteralValue EOF
            {
             markComposite(elementTypeProvider.getInverseLiteralValueElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleInverseLiteralValue_in_entryRuleInverseLiteralValue3987);
            ruleInverseLiteralValue();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInverseLiteralValue3990); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1285:1: ruleInverseLiteralValue : ruleLiteralValue ;
    public final void ruleInverseLiteralValue() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1285:24: ( ruleLiteralValue )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1286:2: ruleLiteralValue
            {

            		markComposite(elementTypeProvider.getInverseLiteralValue_LiteralValueParserRuleCallElementType());
            	
            pushFollow(FollowSets000.FOLLOW_ruleLiteralValue_in_ruleInverseLiteralValue4002);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1296:1: entryRuleNamedArgument : ruleNamedArgument EOF ;
    public final void entryRuleNamedArgument() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1296:23: ( ruleNamedArgument EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1297:2: ruleNamedArgument EOF
            {
             markComposite(elementTypeProvider.getNamedArgumentElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedArgument_in_entryRuleNamedArgument4018);
            ruleNamedArgument();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedArgument4021); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1302:1: ruleNamedArgument : ( () ( ( ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) ) ) ;
    public final void ruleNamedArgument() throws RecognitionException {
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1302:18: ( ( () ( ( ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1303:2: ( () ( ( ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1303:2: ( () ( ( ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1304:3: () ( ( ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1304:3: ()
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1305:4: 
            {

            				precedeComposite(elementTypeProvider.getNamedArgument_NamedArgumentAction_0ElementType());
            				doneComposite();
            			

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1310:3: ( ( ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==32||LA41_0==38) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_ID) ) {
                int LA41_2 = input.LA(2);

                if ( (LA41_2==34) ) {
                    alt41=2;
                }
                else if ( (LA41_2==EOF||LA41_2==13||LA41_2==27) ) {
                    alt41=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1311:4: ( ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1311:4: ( ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1312:5: ( (lv_literalValue_1_0= ruleLiteralValue ) )? ( (otherlv_2= RULE_ID ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1312:5: ( (lv_literalValue_1_0= ruleLiteralValue ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==32||LA40_0==38) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1313:6: (lv_literalValue_1_0= ruleLiteralValue )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1313:6: (lv_literalValue_1_0= ruleLiteralValue )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1314:7: lv_literalValue_1_0= ruleLiteralValue
                            {

                            							markComposite(elementTypeProvider.getNamedArgument_LiteralValueLiteralValueParserRuleCall_1_0_0_0ElementType());
                            						
                            pushFollow(FollowSets000.FOLLOW_ruleLiteralValue_in_ruleNamedArgument4083);
                            ruleLiteralValue();

                            state._fsp--;


                            							doneComposite();
                            						

                            }


                            }
                            break;

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1323:5: ( (otherlv_2= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1324:6: (otherlv_2= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1324:6: (otherlv_2= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1325:7: otherlv_2= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getNamedArgument_ParameterParameterCrossReference_1_0_1_0ElementType());
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedArgument4136); 

                    							doneLeaf(otherlv_2);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1336:4: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1336:4: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1337:5: ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (otherlv_5= RULE_ID ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1337:5: ( (otherlv_3= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1338:6: (otherlv_3= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1338:6: (otherlv_3= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1339:7: otherlv_3= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getNamedArgument_ParameterParameterCrossReference_1_1_0_0ElementType());
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedArgument4207); 

                    							doneLeaf(otherlv_3);
                    						

                    }


                    }


                    					markLeaf(elementTypeProvider.getNamedArgument_EqualsSignKeyword_1_1_1ElementType());
                    				
                    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleNamedArgument4242); 

                    					doneLeaf(otherlv_4);
                    				
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1355:5: ( (otherlv_5= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1356:6: (otherlv_5= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1356:6: (otherlv_5= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1357:7: otherlv_5= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getNamedArgument_ValueParameterCrossReference_1_1_2_0ElementType());
                    						
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNamedArgument4279); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1372:1: entryRuleTerminalRuleCall : ruleTerminalRuleCall EOF ;
    public final void entryRuleTerminalRuleCall() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1372:26: ( ruleTerminalRuleCall EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1373:2: ruleTerminalRuleCall EOF
            {
             markComposite(elementTypeProvider.getTerminalRuleCallElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalRuleCall_in_entryRuleTerminalRuleCall4325);
            ruleTerminalRuleCall();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalRuleCall4328); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1378:1: ruleTerminalRuleCall : ( ( ruleRuleID ) ) ;
    public final void ruleTerminalRuleCall() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1378:21: ( ( ( ruleRuleID ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1379:2: ( ( ruleRuleID ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1379:2: ( ( ruleRuleID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1380:3: ( ruleRuleID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1380:3: ( ruleRuleID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1381:4: ruleRuleID
            {

            				markComposite(elementTypeProvider.getTerminalRuleCall_RuleAbstractRuleCrossReference_0ElementType());
            			
            pushFollow(FollowSets000.FOLLOW_ruleRuleID_in_ruleTerminalRuleCall4351);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1393:1: entryRuleRuleID : ruleRuleID EOF ;
    public final void entryRuleRuleID() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1393:16: ( ruleRuleID EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1394:2: ruleRuleID EOF
            {
             markComposite(elementTypeProvider.getRuleIDElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleRuleID_in_entryRuleRuleID4376);
            ruleRuleID();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRuleID4379); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1399:1: ruleRuleID : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final void ruleRuleID() throws RecognitionException {
        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1399:11: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1400:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1400:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1401:3: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {

            			markLeaf(elementTypeProvider.getRuleID_IDTerminalRuleCall_0ElementType());
            		
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRuleID4398); 

            			doneLeaf(this_ID_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1408:3: (kw= '::' this_ID_2= RULE_ID )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==28) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1409:4: kw= '::' this_ID_2= RULE_ID
            	    {

            	    				markLeaf(elementTypeProvider.getRuleID_ColonColonKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRuleID4418); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getRuleID_IDTerminalRuleCall_1_1ElementType());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRuleID4435); 

            	    				doneLeaf(this_ID_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1428:1: entryRulePredicatedKeyword : rulePredicatedKeyword EOF ;
    public final void entryRulePredicatedKeyword() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1428:27: ( rulePredicatedKeyword EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1429:2: rulePredicatedKeyword EOF
            {
             markComposite(elementTypeProvider.getPredicatedKeywordElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicatedKeyword_in_entryRulePredicatedKeyword4461);
            rulePredicatedKeyword();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicatedKeyword4464); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1434:1: rulePredicatedKeyword : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final void rulePredicatedKeyword() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token lv_value_2_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1434:22: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1435:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1435:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1436:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1436:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
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
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1437:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1437:4: ( (lv_predicated_0_0= '=>' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1438:5: (lv_predicated_0_0= '=>' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1438:5: (lv_predicated_0_0= '=>' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1439:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedKeyword_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePredicatedKeyword4504); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1449:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1449:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1450:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1450:5: (lv_firstSetPredicated_1_0= '->' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1451:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedKeyword_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePredicatedKeyword4558); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1461:3: ( (lv_value_2_0= RULE_STRING ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1462:4: (lv_value_2_0= RULE_STRING )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1462:4: (lv_value_2_0= RULE_STRING )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1463:5: lv_value_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getPredicatedKeyword_ValueSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePredicatedKeyword4603); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1476:1: entryRulePredicatedRuleCall : rulePredicatedRuleCall EOF ;
    public final void entryRulePredicatedRuleCall() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1476:28: ( rulePredicatedRuleCall EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1477:2: rulePredicatedRuleCall EOF
            {
             markComposite(elementTypeProvider.getPredicatedRuleCallElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicatedRuleCall_in_entryRulePredicatedRuleCall4634);
            rulePredicatedRuleCall();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicatedRuleCall4637); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1482:1: rulePredicatedRuleCall : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final void rulePredicatedRuleCall() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1482:23: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1483:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1483:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1484:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) ( (otherlv_2= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1484:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            else if ( (LA44_0==40) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1485:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1485:4: ( (lv_predicated_0_0= '=>' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1486:5: (lv_predicated_0_0= '=>' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1486:5: (lv_predicated_0_0= '=>' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1487:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedRuleCall_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePredicatedRuleCall4677); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1497:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1497:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1498:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1498:5: (lv_firstSetPredicated_1_0= '->' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1499:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedRuleCall_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePredicatedRuleCall4731); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1509:3: ( (otherlv_2= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1510:4: (otherlv_2= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1510:4: (otherlv_2= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1511:5: otherlv_2= RULE_ID
            {

            					markLeaf(elementTypeProvider.getPredicatedRuleCall_RuleAbstractRuleCrossReference_1_0ElementType());
            				
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePredicatedRuleCall4776); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1524:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1524:20: ( ruleAssignment EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1525:2: ruleAssignment EOF
            {
             markComposite(elementTypeProvider.getAssignmentElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment4807);
            ruleAssignment();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment4810); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1530:1: ruleAssignment : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) ) ;
    public final void ruleAssignment() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token lv_feature_2_0=null;
        Token lv_operator_3_1=null;
        Token lv_operator_3_2=null;
        Token lv_operator_3_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1530:15: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1531:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1531:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1532:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )? ( (lv_feature_2_0= RULE_ID ) ) ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) ) ( (lv_terminal_4_0= ruleAssignableTerminal ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1532:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            else if ( (LA45_0==40) ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1533:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1533:4: ( (lv_predicated_0_0= '=>' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1534:5: (lv_predicated_0_0= '=>' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1534:5: (lv_predicated_0_0= '=>' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1535:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getAssignment_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAssignment4850); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1545:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1545:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1546:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1546:5: (lv_firstSetPredicated_1_0= '->' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1547:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getAssignment_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAssignment4904); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1557:3: ( (lv_feature_2_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1558:4: (lv_feature_2_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1558:4: (lv_feature_2_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1559:5: lv_feature_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getAssignment_FeatureIDTerminalRuleCall_1_0ElementType());
            				
            lv_feature_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment4950); 

            					doneLeaf(lv_feature_2_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1568:3: ( ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1569:4: ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1569:4: ( (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1570:5: (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1570:5: (lv_operator_3_1= '+=' | lv_operator_3_2= '=' | lv_operator_3_3= '?=' )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt46=1;
                }
                break;
            case 34:
                {
                alt46=2;
                }
                break;
            case 41:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1571:6: lv_operator_3_1= '+='
                    {

                    						markLeaf(elementTypeProvider.getAssignment_OperatorPlusSignEqualsSignKeyword_2_0_0ElementType());
                    					
                    lv_operator_3_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAssignment4996); 

                    						doneLeaf(lv_operator_3_1);
                    					

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1579:6: lv_operator_3_2= '='
                    {

                    						markLeaf(elementTypeProvider.getAssignment_OperatorEqualsSignKeyword_2_0_1ElementType());
                    					
                    lv_operator_3_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAssignment5030); 

                    						doneLeaf(lv_operator_3_2);
                    					

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1587:6: lv_operator_3_3= '?='
                    {

                    						markLeaf(elementTypeProvider.getAssignment_OperatorQuestionMarkEqualsSignKeyword_2_0_2ElementType());
                    					
                    lv_operator_3_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAssignment5064); 

                    						doneLeaf(lv_operator_3_3);
                    					

                    }
                    break;

            }


            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1597:3: ( (lv_terminal_4_0= ruleAssignableTerminal ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1598:4: (lv_terminal_4_0= ruleAssignableTerminal )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1598:4: (lv_terminal_4_0= ruleAssignableTerminal )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1599:5: lv_terminal_4_0= ruleAssignableTerminal
            {

            					markComposite(elementTypeProvider.getAssignment_TerminalAssignableTerminalParserRuleCall_3_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_ruleAssignment5109);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1612:1: entryRuleAssignableTerminal : ruleAssignableTerminal EOF ;
    public final void entryRuleAssignableTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1612:28: ( ruleAssignableTerminal EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1613:2: ruleAssignableTerminal EOF
            {
             markComposite(elementTypeProvider.getAssignableTerminalElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_entryRuleAssignableTerminal5140);
            ruleAssignableTerminal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignableTerminal5143); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1618:1: ruleAssignableTerminal : ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference ) ;
    public final void ruleAssignableTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1618:23: ( ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1619:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1619:2: ( ruleKeyword | ruleRuleCall | ruleParenthesizedAssignableElement | ruleCrossReference )
            int alt47=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt47=1;
                }
                break;
            case RULE_ID:
                {
                alt47=2;
                }
                break;
            case 15:
                {
                alt47=3;
                }
                break;
            case 26:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1620:3: ruleKeyword
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_KeywordParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleAssignableTerminal5160);
                    ruleKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1628:3: ruleRuleCall
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_RuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleAssignableTerminal5180);
                    ruleRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1636:3: ruleParenthesizedAssignableElement
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_ParenthesizedAssignableElementParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedAssignableElement_in_ruleAssignableTerminal5200);
                    ruleParenthesizedAssignableElement();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1644:3: ruleCrossReference
                    {

                    			markComposite(elementTypeProvider.getAssignableTerminal_CrossReferenceParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleCrossReference_in_ruleAssignableTerminal5220);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1655:1: entryRuleParenthesizedAssignableElement : ruleParenthesizedAssignableElement EOF ;
    public final void entryRuleParenthesizedAssignableElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1655:40: ( ruleParenthesizedAssignableElement EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1656:2: ruleParenthesizedAssignableElement EOF
            {
             markComposite(elementTypeProvider.getParenthesizedAssignableElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedAssignableElement_in_entryRuleParenthesizedAssignableElement5240);
            ruleParenthesizedAssignableElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedAssignableElement5243); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1661:1: ruleParenthesizedAssignableElement : (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' ) ;
    public final void ruleParenthesizedAssignableElement() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1661:35: ( (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1662:2: (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1662:2: (otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1663:3: otherlv_0= '(' ruleAssignableAlternatives otherlv_2= ')'
            {

            			markLeaf(elementTypeProvider.getParenthesizedAssignableElement_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedAssignableElement5262); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParenthesizedAssignableElement_AssignableAlternativesParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAssignableAlternatives_in_ruleParenthesizedAssignableElement5274);
            ruleAssignableAlternatives();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParenthesizedAssignableElement_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParenthesizedAssignableElement5288); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1688:1: entryRuleAssignableAlternatives : ruleAssignableAlternatives EOF ;
    public final void entryRuleAssignableAlternatives() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1688:32: ( ruleAssignableAlternatives EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1689:2: ruleAssignableAlternatives EOF
            {
             markComposite(elementTypeProvider.getAssignableAlternativesElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignableAlternatives_in_entryRuleAssignableAlternatives5308);
            ruleAssignableAlternatives();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignableAlternatives5311); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1694:1: ruleAssignableAlternatives : ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? ) ;
    public final void ruleAssignableAlternatives() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1694:27: ( ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1695:2: ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1695:2: ( ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1696:3: ruleAssignableTerminal ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getAssignableAlternatives_AssignableTerminalParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives5328);
            ruleAssignableTerminal();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1703:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+ )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==29) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1704:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1704:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1705:5: 
                    {

                    					precedeComposite(elementTypeProvider.getAssignableAlternatives_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1710:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==29) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1711:5: otherlv_2= '|' ( (lv_elements_3_0= ruleAssignableTerminal ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getAssignableAlternatives_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAssignableAlternatives5371); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1718:5: ( (lv_elements_3_0= ruleAssignableTerminal ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1719:6: (lv_elements_3_0= ruleAssignableTerminal )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1719:6: (lv_elements_3_0= ruleAssignableTerminal )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1720:7: lv_elements_3_0= ruleAssignableTerminal
                    	    {

                    	    							markComposite(elementTypeProvider.getAssignableAlternatives_ElementsAssignableTerminalParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives5408);
                    	    ruleAssignableTerminal();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


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
    // $ANTLR end "ruleAssignableAlternatives"


    // $ANTLR start "entryRuleCrossReference"
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1735:1: entryRuleCrossReference : ruleCrossReference EOF ;
    public final void entryRuleCrossReference() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1735:24: ( ruleCrossReference EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1736:2: ruleCrossReference EOF
            {
             markComposite(elementTypeProvider.getCrossReferenceElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleCrossReference_in_entryRuleCrossReference5456);
            ruleCrossReference();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCrossReference5459); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1741:1: ruleCrossReference : (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) ;
    public final void ruleCrossReference() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1741:19: ( (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1742:2: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1742:2: (otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1743:3: otherlv_0= '[' ( (lv_type_1_0= ruleTypeRef ) ) (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )? otherlv_4= ']'
            {

            			markLeaf(elementTypeProvider.getCrossReference_LeftSquareBracketKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCrossReference5478); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1750:3: ( (lv_type_1_0= ruleTypeRef ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1751:4: (lv_type_1_0= ruleTypeRef )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1751:4: (lv_type_1_0= ruleTypeRef )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1752:5: lv_type_1_0= ruleTypeRef
            {

            					markComposite(elementTypeProvider.getCrossReference_TypeTypeRefParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleCrossReference5505);
            ruleTypeRef();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1761:3: (otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==29) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1762:4: otherlv_2= '|' ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    {

                    				markLeaf(elementTypeProvider.getCrossReference_VerticalLineKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCrossReference5536); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1769:4: ( (lv_terminal_3_0= ruleCrossReferenceableTerminal ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1770:5: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1770:5: (lv_terminal_3_0= ruleCrossReferenceableTerminal )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1771:6: lv_terminal_3_0= ruleCrossReferenceableTerminal
                    {

                    						markComposite(elementTypeProvider.getCrossReference_TerminalCrossReferenceableTerminalParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleCrossReferenceableTerminal_in_ruleCrossReference5568);
                    ruleCrossReferenceableTerminal();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getCrossReference_RightSquareBracketKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCrossReference5601); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1792:1: entryRuleCrossReferenceableTerminal : ruleCrossReferenceableTerminal EOF ;
    public final void entryRuleCrossReferenceableTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1792:36: ( ruleCrossReferenceableTerminal EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1793:2: ruleCrossReferenceableTerminal EOF
            {
             markComposite(elementTypeProvider.getCrossReferenceableTerminalElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleCrossReferenceableTerminal_in_entryRuleCrossReferenceableTerminal5621);
            ruleCrossReferenceableTerminal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCrossReferenceableTerminal5624); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1798:1: ruleCrossReferenceableTerminal : ( ruleKeyword | ruleRuleCall ) ;
    public final void ruleCrossReferenceableTerminal() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1798:31: ( ( ruleKeyword | ruleRuleCall ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1799:2: ( ruleKeyword | ruleRuleCall )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1799:2: ( ruleKeyword | ruleRuleCall )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_STRING) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_ID) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1800:3: ruleKeyword
                    {

                    			markComposite(elementTypeProvider.getCrossReferenceableTerminal_KeywordParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleCrossReferenceableTerminal5641);
                    ruleKeyword();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1808:3: ruleRuleCall
                    {

                    			markComposite(elementTypeProvider.getCrossReferenceableTerminal_RuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleRuleCall_in_ruleCrossReferenceableTerminal5661);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1819:1: entryRuleParenthesizedElement : ruleParenthesizedElement EOF ;
    public final void entryRuleParenthesizedElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1819:30: ( ruleParenthesizedElement EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1820:2: ruleParenthesizedElement EOF
            {
             markComposite(elementTypeProvider.getParenthesizedElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement5681);
            ruleParenthesizedElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedElement5684); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1825:1: ruleParenthesizedElement : (otherlv_0= '(' ruleAlternatives otherlv_2= ')' ) ;
    public final void ruleParenthesizedElement() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1825:25: ( (otherlv_0= '(' ruleAlternatives otherlv_2= ')' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1826:2: (otherlv_0= '(' ruleAlternatives otherlv_2= ')' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1826:2: (otherlv_0= '(' ruleAlternatives otherlv_2= ')' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1827:3: otherlv_0= '(' ruleAlternatives otherlv_2= ')'
            {

            			markLeaf(elementTypeProvider.getParenthesizedElement_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedElement5703); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParenthesizedElement_AlternativesParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_ruleParenthesizedElement5715);
            ruleAlternatives();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParenthesizedElement_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParenthesizedElement5729); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1852:1: entryRulePredicatedGroup : rulePredicatedGroup EOF ;
    public final void entryRulePredicatedGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1852:25: ( rulePredicatedGroup EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1853:2: rulePredicatedGroup EOF
            {
             markComposite(elementTypeProvider.getPredicatedGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicatedGroup_in_entryRulePredicatedGroup5749);
            rulePredicatedGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicatedGroup5752); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1858:1: rulePredicatedGroup : ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' ) ;
    public final void rulePredicatedGroup() throws RecognitionException {
        Token lv_predicated_0_0=null;
        Token lv_firstSetPredicated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1858:20: ( ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1859:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1859:2: ( ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1860:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) ) otherlv_2= '(' ( (lv_elements_3_0= ruleAlternatives ) ) otherlv_4= ')'
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1860:3: ( ( (lv_predicated_0_0= '=>' ) ) | ( (lv_firstSetPredicated_1_0= '->' ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==39) ) {
                alt52=1;
            }
            else if ( (LA52_0==40) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1861:4: ( (lv_predicated_0_0= '=>' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1861:4: ( (lv_predicated_0_0= '=>' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1862:5: (lv_predicated_0_0= '=>' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1862:5: (lv_predicated_0_0= '=>' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1863:6: lv_predicated_0_0= '=>'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedGroup_PredicatedEqualsSignGreaterThanSignKeyword_0_0_0ElementType());
                    					
                    lv_predicated_0_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePredicatedGroup5792); 

                    						doneLeaf(lv_predicated_0_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1873:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1873:4: ( (lv_firstSetPredicated_1_0= '->' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1874:5: (lv_firstSetPredicated_1_0= '->' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1874:5: (lv_firstSetPredicated_1_0= '->' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1875:6: lv_firstSetPredicated_1_0= '->'
                    {

                    						markLeaf(elementTypeProvider.getPredicatedGroup_FirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0ElementType());
                    					
                    lv_firstSetPredicated_1_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePredicatedGroup5846); 

                    						doneLeaf(lv_firstSetPredicated_1_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getPredicatedGroup_LeftParenthesisKeyword_1ElementType());
            		
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePredicatedGroup5878); 

            			doneLeaf(otherlv_2);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1892:3: ( (lv_elements_3_0= ruleAlternatives ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1893:4: (lv_elements_3_0= ruleAlternatives )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1893:4: (lv_elements_3_0= ruleAlternatives )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1894:5: lv_elements_3_0= ruleAlternatives
            {

            					markComposite(elementTypeProvider.getPredicatedGroup_ElementsAlternativesParserRuleCall_2_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleAlternatives_in_rulePredicatedGroup5905);
            ruleAlternatives();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getPredicatedGroup_RightParenthesisKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePredicatedGroup5930); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1914:1: entryRuleTerminalRule : ruleTerminalRule EOF ;
    public final void entryRuleTerminalRule() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1914:22: ( ruleTerminalRule EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1915:2: ruleTerminalRule EOF
            {
             markComposite(elementTypeProvider.getTerminalRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalRule_in_entryRuleTerminalRule5950);
            ruleTerminalRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalRule5953); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1920:1: ruleTerminalRule : (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' ) ;
    public final void ruleTerminalRule() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_fragment_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1920:17: ( (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1921:2: (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1921:2: (otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1922:3: otherlv_0= 'terminal' ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) ) otherlv_6= ':' ( (lv_alternatives_7_0= ruleTerminalAlternatives ) ) otherlv_8= ';'
            {

            			markLeaf(elementTypeProvider.getTerminalRule_TerminalKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleTerminalRule5972); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1929:3: ( ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==21) ) {
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
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1930:4: ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1930:4: ( ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1931:5: ( (lv_fragment_1_0= 'fragment' ) ) ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1931:5: ( (lv_fragment_1_0= 'fragment' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1932:6: (lv_fragment_1_0= 'fragment' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1932:6: (lv_fragment_1_0= 'fragment' )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1933:7: lv_fragment_1_0= 'fragment'
                    {

                    							markLeaf(elementTypeProvider.getTerminalRule_FragmentFragmentKeyword_1_0_0_0ElementType());
                    						
                    lv_fragment_1_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTerminalRule6016); 

                    							doneLeaf(lv_fragment_1_0);
                    						

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1942:5: ( (lv_name_2_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1943:6: (lv_name_2_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1943:6: (lv_name_2_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1944:7: lv_name_2_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getTerminalRule_NameIDTerminalRuleCall_1_0_1_0ElementType());
                    						
                    lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTerminalRule6068); 

                    							doneLeaf(lv_name_2_0);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1955:4: ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1955:4: ( ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )? )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1956:5: ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )?
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1956:5: ( (lv_name_3_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1957:6: (lv_name_3_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1957:6: (lv_name_3_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1958:7: lv_name_3_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getTerminalRule_NameIDTerminalRuleCall_1_1_0_0ElementType());
                    						
                    lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTerminalRule6139); 

                    							doneLeaf(lv_name_3_0);
                    						

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1967:5: (otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==23) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1968:6: otherlv_4= 'returns' ( (lv_type_5_0= ruleTypeRef ) )
                            {

                            						markLeaf(elementTypeProvider.getTerminalRule_ReturnsKeyword_1_1_1_0ElementType());
                            					
                            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTerminalRule6182); 

                            						doneLeaf(otherlv_4);
                            					
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1975:6: ( (lv_type_5_0= ruleTypeRef ) )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1976:7: (lv_type_5_0= ruleTypeRef )
                            {
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1976:7: (lv_type_5_0= ruleTypeRef )
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1977:8: lv_type_5_0= ruleTypeRef
                            {

                            								markComposite(elementTypeProvider.getTerminalRule_TypeTypeRefParserRuleCall_1_1_1_1_0ElementType());
                            							
                            pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleTerminalRule6224);
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
            		
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTerminalRule6274); 

            			doneLeaf(otherlv_6);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1996:3: ( (lv_alternatives_7_0= ruleTerminalAlternatives ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1997:4: (lv_alternatives_7_0= ruleTerminalAlternatives )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1997:4: (lv_alternatives_7_0= ruleTerminalAlternatives )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:1998:5: lv_alternatives_7_0= ruleTerminalAlternatives
            {

            					markComposite(elementTypeProvider.getTerminalRule_AlternativesTerminalAlternativesParserRuleCall_3_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTerminalAlternatives_in_ruleTerminalRule6301);
            ruleTerminalAlternatives();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getTerminalRule_SemicolonKeyword_4ElementType());
            		
            otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTerminalRule6326); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2018:1: entryRuleTerminalAlternatives : ruleTerminalAlternatives EOF ;
    public final void entryRuleTerminalAlternatives() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2018:30: ( ruleTerminalAlternatives EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2019:2: ruleTerminalAlternatives EOF
            {
             markComposite(elementTypeProvider.getTerminalAlternativesElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalAlternatives_in_entryRuleTerminalAlternatives6346);
            ruleTerminalAlternatives();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalAlternatives6349); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2024:1: ruleTerminalAlternatives : ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? ) ;
    public final void ruleTerminalAlternatives() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2024:25: ( ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2025:2: ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2025:2: ( ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2026:3: ruleTerminalGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getTerminalAlternatives_TerminalGroupParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives6366);
            ruleTerminalGroup();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2033:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+ )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==29) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2034:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2034:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2035:5: 
                    {

                    					precedeComposite(elementTypeProvider.getTerminalAlternatives_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2040:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) ) )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==29) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2041:5: otherlv_2= '|' ( (lv_elements_3_0= ruleTerminalGroup ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getTerminalAlternatives_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTerminalAlternatives6409); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2048:5: ( (lv_elements_3_0= ruleTerminalGroup ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2049:6: (lv_elements_3_0= ruleTerminalGroup )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2049:6: (lv_elements_3_0= ruleTerminalGroup )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2050:7: lv_elements_3_0= ruleTerminalGroup
                    	    {

                    	    							markComposite(elementTypeProvider.getTerminalAlternatives_ElementsTerminalGroupParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives6446);
                    	    ruleTerminalGroup();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt55 >= 1 ) break loop55;
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2065:1: entryRuleTerminalGroup : ruleTerminalGroup EOF ;
    public final void entryRuleTerminalGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2065:23: ( ruleTerminalGroup EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2066:2: ruleTerminalGroup EOF
            {
             markComposite(elementTypeProvider.getTerminalGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalGroup_in_entryRuleTerminalGroup6494);
            ruleTerminalGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalGroup6497); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2071:1: ruleTerminalGroup : ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? ) ;
    public final void ruleTerminalGroup() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2071:18: ( ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2072:2: ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2072:2: ( ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2073:3: ruleTerminalToken ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )?
            {

            			markComposite(elementTypeProvider.getTerminalGroup_TerminalTokenParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerminalToken_in_ruleTerminalGroup6514);
            ruleTerminalToken();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2080:3: ( () ( (lv_elements_2_0= ruleTerminalToken ) )+ )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_STRING)||LA58_0==15||LA58_0==17||LA58_0==38||LA58_0==40||LA58_0==43) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2081:4: () ( (lv_elements_2_0= ruleTerminalToken ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2081:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2082:5: 
                    {

                    					precedeComposite(elementTypeProvider.getTerminalGroup_GroupElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2087:4: ( (lv_elements_2_0= ruleTerminalToken ) )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||LA57_0==15||LA57_0==17||LA57_0==38||LA57_0==40||LA57_0==43) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2088:5: (lv_elements_2_0= ruleTerminalToken )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2088:5: (lv_elements_2_0= ruleTerminalToken )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2089:6: lv_elements_2_0= ruleTerminalToken
                    	    {

                    	    						markComposite(elementTypeProvider.getTerminalGroup_ElementsTerminalTokenParserRuleCall_1_1_0ElementType());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_ruleTerminalToken_in_ruleTerminalGroup6565);
                    	    ruleTerminalToken();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt57 >= 1 ) break loop57;
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2103:1: entryRuleTerminalToken : ruleTerminalToken EOF ;
    public final void entryRuleTerminalToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2103:23: ( ruleTerminalToken EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2104:2: ruleTerminalToken EOF
            {
             markComposite(elementTypeProvider.getTerminalTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalToken_in_entryRuleTerminalToken6605);
            ruleTerminalToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalToken6608); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2109:1: ruleTerminalToken : ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) ;
    public final void ruleTerminalToken() throws RecognitionException {
        Token lv_cardinality_1_1=null;
        Token lv_cardinality_1_2=null;
        Token lv_cardinality_1_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2109:18: ( ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2110:2: ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2110:2: ( ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2111:3: ruleTerminalTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            {

            			markComposite(elementTypeProvider.getTerminalToken_TerminalTokenElementParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_ruleTerminalToken6625);
            ruleTerminalTokenElement();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2118:3: ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==22||(LA60_0>=31 && LA60_0<=32)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2119:4: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2119:4: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2120:5: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2120:5: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    int alt59=3;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt59=1;
                        }
                        break;
                    case 22:
                        {
                        alt59=2;
                        }
                        break;
                    case 32:
                        {
                        alt59=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }

                    switch (alt59) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2121:6: lv_cardinality_1_1= '?'
                            {

                            						markLeaf(elementTypeProvider.getTerminalToken_CardinalityQuestionMarkKeyword_1_0_0ElementType());
                            					
                            lv_cardinality_1_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTerminalToken6660); 

                            						doneLeaf(lv_cardinality_1_1);
                            					

                            }
                            break;
                        case 2 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2129:6: lv_cardinality_1_2= '*'
                            {

                            						markLeaf(elementTypeProvider.getTerminalToken_CardinalityAsteriskKeyword_1_0_1ElementType());
                            					
                            lv_cardinality_1_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTerminalToken6694); 

                            						doneLeaf(lv_cardinality_1_2);
                            					

                            }
                            break;
                        case 3 :
                            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2137:6: lv_cardinality_1_3= '+'
                            {

                            						markLeaf(elementTypeProvider.getTerminalToken_CardinalityPlusSignKeyword_1_0_2ElementType());
                            					
                            lv_cardinality_1_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTerminalToken6728); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2151:1: entryRuleTerminalTokenElement : ruleTerminalTokenElement EOF ;
    public final void entryRuleTerminalTokenElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2151:30: ( ruleTerminalTokenElement EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2152:2: ruleTerminalTokenElement EOF
            {
             markComposite(elementTypeProvider.getTerminalTokenElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_entryRuleTerminalTokenElement6767);
            ruleTerminalTokenElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerminalTokenElement6770); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2157:1: ruleTerminalTokenElement : ( ruleCharacterRange | ruleTerminalRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF ) ;
    public final void ruleTerminalTokenElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2157:25: ( ( ruleCharacterRange | ruleTerminalRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2158:2: ( ruleCharacterRange | ruleTerminalRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2158:2: ( ruleCharacterRange | ruleTerminalRuleCall | ruleParenthesizedTerminalElement | ruleAbstractNegatedToken | ruleWildcard | ruleEOF )
            int alt61=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt61=1;
                }
                break;
            case RULE_ID:
                {
                alt61=2;
                }
                break;
            case 15:
                {
                alt61=3;
                }
                break;
            case 38:
            case 40:
                {
                alt61=4;
                }
                break;
            case 17:
                {
                alt61=5;
                }
                break;
            case 43:
                {
                alt61=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2159:3: ruleCharacterRange
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_CharacterRangeParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleCharacterRange_in_ruleTerminalTokenElement6787);
                    ruleCharacterRange();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2167:3: ruleTerminalRuleCall
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_TerminalRuleCallParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleTerminalRuleCall_in_ruleTerminalTokenElement6807);
                    ruleTerminalRuleCall();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2175:3: ruleParenthesizedTerminalElement
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_ParenthesizedTerminalElementParserRuleCall_2ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleParenthesizedTerminalElement_in_ruleTerminalTokenElement6827);
                    ruleParenthesizedTerminalElement();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2183:3: ruleAbstractNegatedToken
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_AbstractNegatedTokenParserRuleCall_3ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNegatedToken_in_ruleTerminalTokenElement6847);
                    ruleAbstractNegatedToken();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 5 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2191:3: ruleWildcard
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_WildcardParserRuleCall_4ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleWildcard_in_ruleTerminalTokenElement6867);
                    ruleWildcard();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 6 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2199:3: ruleEOF
                    {

                    			markComposite(elementTypeProvider.getTerminalTokenElement_EOFParserRuleCall_5ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleEOF_in_ruleTerminalTokenElement6887);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2210:1: entryRuleParenthesizedTerminalElement : ruleParenthesizedTerminalElement EOF ;
    public final void entryRuleParenthesizedTerminalElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2210:38: ( ruleParenthesizedTerminalElement EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2211:2: ruleParenthesizedTerminalElement EOF
            {
             markComposite(elementTypeProvider.getParenthesizedTerminalElementElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParenthesizedTerminalElement_in_entryRuleParenthesizedTerminalElement6907);
            ruleParenthesizedTerminalElement();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParenthesizedTerminalElement6910); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2216:1: ruleParenthesizedTerminalElement : (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' ) ;
    public final void ruleParenthesizedTerminalElement() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2216:33: ( (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2217:2: (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2217:2: (otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2218:3: otherlv_0= '(' ruleTerminalAlternatives otherlv_2= ')'
            {

            			markLeaf(elementTypeProvider.getParenthesizedTerminalElement_LeftParenthesisKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParenthesizedTerminalElement6929); 

            			doneLeaf(otherlv_0);
            		

            			markComposite(elementTypeProvider.getParenthesizedTerminalElement_TerminalAlternativesParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerminalAlternatives_in_ruleParenthesizedTerminalElement6941);
            ruleTerminalAlternatives();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getParenthesizedTerminalElement_RightParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParenthesizedTerminalElement6955); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2243:1: entryRuleAbstractNegatedToken : ruleAbstractNegatedToken EOF ;
    public final void entryRuleAbstractNegatedToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2243:30: ( ruleAbstractNegatedToken EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2244:2: ruleAbstractNegatedToken EOF
            {
             markComposite(elementTypeProvider.getAbstractNegatedTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNegatedToken_in_entryRuleAbstractNegatedToken6975);
            ruleAbstractNegatedToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNegatedToken6978); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2249:1: ruleAbstractNegatedToken : ( ruleNegatedToken | ruleUntilToken ) ;
    public final void ruleAbstractNegatedToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2249:25: ( ( ruleNegatedToken | ruleUntilToken ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2250:2: ( ruleNegatedToken | ruleUntilToken )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2250:2: ( ruleNegatedToken | ruleUntilToken )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==38) ) {
                alt62=1;
            }
            else if ( (LA62_0==40) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2251:3: ruleNegatedToken
                    {

                    			markComposite(elementTypeProvider.getAbstractNegatedToken_NegatedTokenParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleNegatedToken_in_ruleAbstractNegatedToken6995);
                    ruleNegatedToken();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2259:3: ruleUntilToken
                    {

                    			markComposite(elementTypeProvider.getAbstractNegatedToken_UntilTokenParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleUntilToken_in_ruleAbstractNegatedToken7015);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2270:1: entryRuleNegatedToken : ruleNegatedToken EOF ;
    public final void entryRuleNegatedToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2270:22: ( ruleNegatedToken EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2271:2: ruleNegatedToken EOF
            {
             markComposite(elementTypeProvider.getNegatedTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleNegatedToken_in_entryRuleNegatedToken7035);
            ruleNegatedToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegatedToken7038); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2276:1: ruleNegatedToken : (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final void ruleNegatedToken() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2276:17: ( (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2277:2: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2277:2: (otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2278:3: otherlv_0= '!' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {

            			markLeaf(elementTypeProvider.getNegatedToken_ExclamationMarkKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleNegatedToken7057); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2285:3: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2286:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2286:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2287:5: lv_terminal_1_0= ruleTerminalTokenElement
            {

            					markComposite(elementTypeProvider.getNegatedToken_TerminalTerminalTokenElementParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_ruleNegatedToken7084);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2300:1: entryRuleUntilToken : ruleUntilToken EOF ;
    public final void entryRuleUntilToken() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2300:20: ( ruleUntilToken EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2301:2: ruleUntilToken EOF
            {
             markComposite(elementTypeProvider.getUntilTokenElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleUntilToken_in_entryRuleUntilToken7115);
            ruleUntilToken();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUntilToken7118); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2306:1: ruleUntilToken : (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) ;
    public final void ruleUntilToken() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2306:15: ( (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2307:2: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2307:2: (otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2308:3: otherlv_0= '->' ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            {

            			markLeaf(elementTypeProvider.getUntilToken_HyphenMinusGreaterThanSignKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleUntilToken7137); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2315:3: ( (lv_terminal_1_0= ruleTerminalTokenElement ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2316:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2316:4: (lv_terminal_1_0= ruleTerminalTokenElement )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2317:5: lv_terminal_1_0= ruleTerminalTokenElement
            {

            					markComposite(elementTypeProvider.getUntilToken_TerminalTerminalTokenElementParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleTerminalTokenElement_in_ruleUntilToken7164);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2330:1: entryRuleWildcard : ruleWildcard EOF ;
    public final void entryRuleWildcard() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2330:18: ( ruleWildcard EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2331:2: ruleWildcard EOF
            {
             markComposite(elementTypeProvider.getWildcardElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleWildcard_in_entryRuleWildcard7195);
            ruleWildcard();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWildcard7198); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2336:1: ruleWildcard : ( () otherlv_1= '.' ) ;
    public final void ruleWildcard() throws RecognitionException {
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2336:13: ( ( () otherlv_1= '.' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2337:2: ( () otherlv_1= '.' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2337:2: ( () otherlv_1= '.' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2338:3: () otherlv_1= '.'
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2338:3: ()
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2339:4: 
            {

            				precedeComposite(elementTypeProvider.getWildcard_WildcardAction_0ElementType());
            				doneComposite();
            			

            }


            			markLeaf(elementTypeProvider.getWildcard_FullStopKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWildcard7230); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2355:1: entryRuleEOF : ruleEOF EOF ;
    public final void entryRuleEOF() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2355:13: ( ruleEOF EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2356:2: ruleEOF EOF
            {
             markComposite(elementTypeProvider.getEOFElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleEOF_in_entryRuleEOF7250);
            ruleEOF();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEOF7253); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2361:1: ruleEOF : ( () otherlv_1= 'EOF' ) ;
    public final void ruleEOF() throws RecognitionException {
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2361:8: ( ( () otherlv_1= 'EOF' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2362:2: ( () otherlv_1= 'EOF' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2362:2: ( () otherlv_1= 'EOF' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2363:3: () otherlv_1= 'EOF'
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2363:3: ()
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2364:4: 
            {

            				precedeComposite(elementTypeProvider.getEOF_EOFAction_0ElementType());
            				doneComposite();
            			

            }


            			markLeaf(elementTypeProvider.getEOF_EOFKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEOF7285); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2380:1: entryRuleCharacterRange : ruleCharacterRange EOF ;
    public final void entryRuleCharacterRange() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2380:24: ( ruleCharacterRange EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2381:2: ruleCharacterRange EOF
            {
             markComposite(elementTypeProvider.getCharacterRangeElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleCharacterRange_in_entryRuleCharacterRange7305);
            ruleCharacterRange();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCharacterRange7308); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2386:1: ruleCharacterRange : ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) ;
    public final void ruleCharacterRange() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2386:19: ( ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2387:2: ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2387:2: ( ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2388:3: ruleKeyword ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            {

            			markComposite(elementTypeProvider.getCharacterRange_KeywordParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleCharacterRange7325);
            ruleKeyword();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2395:3: ( () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==44) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2396:4: () otherlv_2= '..' ( (lv_right_3_0= ruleKeyword ) )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2396:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2397:5: 
                    {

                    					precedeComposite(elementTypeProvider.getCharacterRange_CharacterRangeLeftAction_1_0ElementType());
                    					doneComposite();
                    				

                    }


                    				markLeaf(elementTypeProvider.getCharacterRange_FullStopFullStopKeyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleCharacterRange7361); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2409:4: ( (lv_right_3_0= ruleKeyword ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2410:5: (lv_right_3_0= ruleKeyword )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2410:5: (lv_right_3_0= ruleKeyword )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2411:6: lv_right_3_0= ruleKeyword
                    {

                    						markComposite(elementTypeProvider.getCharacterRange_RightKeywordParserRuleCall_1_2_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleCharacterRange7393);
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2425:1: entryRuleEnumRule : ruleEnumRule EOF ;
    public final void entryRuleEnumRule() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2425:18: ( ruleEnumRule EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2426:2: ruleEnumRule EOF
            {
             markComposite(elementTypeProvider.getEnumRuleElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumRule_in_entryRuleEnumRule7432);
            ruleEnumRule();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumRule7435); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2431:1: ruleEnumRule : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' ) ;
    public final void ruleEnumRule() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2431:13: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2432:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2432:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';' )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2433:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )? otherlv_4= ':' ( (lv_alternatives_5_0= ruleEnumLiterals ) ) otherlv_6= ';'
            {

            			markLeaf(elementTypeProvider.getEnumRule_EnumKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEnumRule7454); 

            			doneLeaf(otherlv_0);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2440:3: ( (lv_name_1_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2441:4: (lv_name_1_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2441:4: (lv_name_1_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2442:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getEnumRule_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumRule7481); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2451:3: (otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==23) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2452:4: otherlv_2= 'returns' ( (lv_type_3_0= ruleTypeRef ) )
                    {

                    				markLeaf(elementTypeProvider.getEnumRule_ReturnsKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEnumRule7512); 

                    				doneLeaf(otherlv_2);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2459:4: ( (lv_type_3_0= ruleTypeRef ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2460:5: (lv_type_3_0= ruleTypeRef )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2460:5: (lv_type_3_0= ruleTypeRef )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2461:6: lv_type_3_0= ruleTypeRef
                    {

                    						markComposite(elementTypeProvider.getEnumRule_TypeTypeRefParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleTypeRef_in_ruleEnumRule7544);
                    ruleTypeRef();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getEnumRule_ColonKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEnumRule7577); 

            			doneLeaf(otherlv_4);
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2478:3: ( (lv_alternatives_5_0= ruleEnumLiterals ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2479:4: (lv_alternatives_5_0= ruleEnumLiterals )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2479:4: (lv_alternatives_5_0= ruleEnumLiterals )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2480:5: lv_alternatives_5_0= ruleEnumLiterals
            {

            					markComposite(elementTypeProvider.getEnumRule_AlternativesEnumLiteralsParserRuleCall_4_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiterals_in_ruleEnumRule7604);
            ruleEnumLiterals();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf(elementTypeProvider.getEnumRule_SemicolonKeyword_5ElementType());
            		
            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEnumRule7629); 

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2500:1: entryRuleEnumLiterals : ruleEnumLiterals EOF ;
    public final void entryRuleEnumLiterals() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2500:22: ( ruleEnumLiterals EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2501:2: ruleEnumLiterals EOF
            {
             markComposite(elementTypeProvider.getEnumLiteralsElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiterals_in_entryRuleEnumLiterals7649);
            ruleEnumLiterals();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumLiterals7652); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2506:1: ruleEnumLiterals : ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) ;
    public final void ruleEnumLiterals() throws RecognitionException {
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2506:17: ( ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2507:2: ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2507:2: ( ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2508:3: ruleEnumLiteralDeclaration ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            {

            			markComposite(elementTypeProvider.getEnumLiterals_EnumLiteralDeclarationParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals7669);
            ruleEnumLiteralDeclaration();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2515:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+ )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==29) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2516:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2516:4: ()
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2517:5: 
                    {

                    					precedeComposite(elementTypeProvider.getEnumLiterals_AlternativesElementsAction_1_0ElementType());
                    					doneComposite();
                    				

                    }

                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2522:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) ) )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==29) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2523:5: otherlv_2= '|' ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getEnumLiterals_VerticalLineKeyword_1_1_0ElementType());
                    	    				
                    	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEnumLiterals7712); 

                    	    					doneLeaf(otherlv_2);
                    	    				
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2530:5: ( (lv_elements_3_0= ruleEnumLiteralDeclaration ) )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2531:6: (lv_elements_3_0= ruleEnumLiteralDeclaration )
                    	    {
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2531:6: (lv_elements_3_0= ruleEnumLiteralDeclaration )
                    	    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2532:7: lv_elements_3_0= ruleEnumLiteralDeclaration
                    	    {

                    	    							markComposite(elementTypeProvider.getEnumLiterals_ElementsEnumLiteralDeclarationParserRuleCall_1_1_1_0ElementType());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals7749);
                    	    ruleEnumLiteralDeclaration();

                    	    state._fsp--;


                    	    							doneComposite();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2547:1: entryRuleEnumLiteralDeclaration : ruleEnumLiteralDeclaration EOF ;
    public final void entryRuleEnumLiteralDeclaration() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2547:32: ( ruleEnumLiteralDeclaration EOF )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2548:2: ruleEnumLiteralDeclaration EOF
            {
             markComposite(elementTypeProvider.getEnumLiteralDeclarationElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumLiteralDeclaration_in_entryRuleEnumLiteralDeclaration7797);
            ruleEnumLiteralDeclaration();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumLiteralDeclaration7800); 

            }

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
    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2553:1: ruleEnumLiteralDeclaration : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) ;
    public final void ruleEnumLiteralDeclaration() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;

        try {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2553:27: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2554:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2554:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )? )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2555:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2555:3: ( (otherlv_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2556:4: (otherlv_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2556:4: (otherlv_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2557:5: otherlv_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getEnumLiteralDeclaration_EnumLiteralEEnumLiteralCrossReference_0_0ElementType());
            				
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumLiteralDeclaration7832); 

            					doneLeaf(otherlv_0);
            				

            }


            }

            // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2566:3: (otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==34) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2567:4: otherlv_1= '=' ( (lv_literal_2_0= ruleKeyword ) )
                    {

                    				markLeaf(elementTypeProvider.getEnumLiteralDeclaration_EqualsSignKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEnumLiteralDeclaration7863); 

                    				doneLeaf(otherlv_1);
                    			
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2574:4: ( (lv_literal_2_0= ruleKeyword ) )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2575:5: (lv_literal_2_0= ruleKeyword )
                    {
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2575:5: (lv_literal_2_0= ruleKeyword )
                    // ../../intellij/org.eclipse.xtext.xtext.idea/src-gen/org/eclipse/xtext/idea/parser/antlr/internal/PsiInternalXtext.g:2576:6: lv_literal_2_0= ruleKeyword
                    {

                    						markComposite(elementTypeProvider.getEnumLiteralDeclaration_LiteralKeywordParserRuleCall_1_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_ruleKeyword_in_ruleEnumLiteralDeclaration7895);
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


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\12\uffff";
    static final String DFA15_eofS =
        "\12\uffff";
    static final String DFA15_minS =
        "\2\4\1\uffff\1\16\1\4\1\uffff\1\15\1\16\1\4\1\15";
    static final String DFA15_maxS =
        "\1\25\1\4\1\uffff\1\32\1\33\1\uffff\1\33\1\30\1\4\1\33";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String DFA15_specialS =
        "\12\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\20\uffff\1\1",
            "\1\3",
            "",
            "\1\2\7\uffff\1\5\2\2\1\uffff\1\4",
            "\1\6\26\uffff\1\7",
            "",
            "\1\10\15\uffff\1\7",
            "\1\2\7\uffff\1\5\2\2",
            "\1\11",
            "\1\10\15\uffff\1\7"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "420:3: ( ( ( (lv_fragment_0_0= 'fragment' ) ) ruleRuleNameAndParams ( (lv_wildcard_2_0= '*' ) ) ) | ( ( (lv_fragment_3_0= 'fragment' ) )? ruleRuleNameAndParams (otherlv_5= 'returns' ( (lv_type_6_0= ruleTypeRef ) ) )? ) )";
        }
    }
 

    
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
        public static final BitSet FOLLOW_ruleRuleNameAndParams_in_ruleParserRule1258 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleParserRule1295 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_21_in_ruleParserRule1366 = new BitSet(new long[]{0x0000000000200010L});
        public static final BitSet FOLLOW_ruleRuleNameAndParams_in_ruleParserRule1400 = new BitSet(new long[]{0x0000000001804000L});
        public static final BitSet FOLLOW_23_in_ruleParserRule1428 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleParserRule1470 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_14_in_ruleParserRule1541 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleParserRule1571 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParserRule1612 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleParserRule1655 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParserRule1697 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_ruleParserRule1746 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleParserRule1766 = new BitSet(new long[]{0x0000018204008030L});
        public static final BitSet FOLLOW_ruleAlternatives_in_ruleParserRule1793 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleParserRule1818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleNameAndParams_in_entryRuleRuleNameAndParams1838 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRuleNameAndParams1841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRuleNameAndParams1873 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleRuleNameAndParams1904 = new BitSet(new long[]{0x0000000008000010L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleRuleNameAndParams1945 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_13_in_ruleRuleNameAndParams1988 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleRuleNameAndParams2030 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_27_in_ruleRuleNameAndParams2079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2105 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter2108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef2158 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef2161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeRef2201 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleTypeRef2231 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeRef2264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives2295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives2298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionalBranch_in_ruleAlternatives2315 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleAlternatives2358 = new BitSet(new long[]{0x0000018204008030L});
        public static final BitSet FOLLOW_ruleConditionalBranch_in_ruleAlternatives2395 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleConditionalBranch_in_entryRuleConditionalBranch2443 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditionalBranch2446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroup_in_ruleConditionalBranch2463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleConditionalBranch2507 = new BitSet(new long[]{0x0000004100000000L});
        public static final BitSet FOLLOW_ruleInverseLiteralValue_in_ruleConditionalBranch2539 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConditionalBranch2584 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleConditionalBranch2614 = new BitSet(new long[]{0x0000018200008030L});
        public static final BitSet FOLLOW_ruleUnorderedGroup_in_ruleConditionalBranch2646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroup_in_entryRuleUnorderedGroup2684 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedGroup2687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleUnorderedGroup2704 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleUnorderedGroup2747 = new BitSet(new long[]{0x0000018200008030L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleUnorderedGroup2784 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup2832 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup2835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractToken_in_ruleGroup2852 = new BitSet(new long[]{0x0000018200008032L});
        public static final BitSet FOLLOW_ruleAbstractToken_in_ruleGroup2903 = new BitSet(new long[]{0x0000018200008032L});
        public static final BitSet FOLLOW_ruleAbstractToken_in_entryRuleAbstractToken2943 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractToken2946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractTokenWithCardinality_in_ruleAbstractToken2963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_ruleAbstractToken2983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractTokenWithCardinality_in_entryRuleAbstractTokenWithCardinality3003 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractTokenWithCardinality3006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleAbstractTokenWithCardinality3029 = new BitSet(new long[]{0x0000000180400002L});
        public static final BitSet FOLLOW_ruleAbstractTerminal_in_ruleAbstractTokenWithCardinality3053 = new BitSet(new long[]{0x0000000180400002L});
        public static final BitSet FOLLOW_31_in_ruleAbstractTokenWithCardinality3093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAbstractTokenWithCardinality3127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleAbstractTokenWithCardinality3161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction3200 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction3203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleAction3222 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleAction3249 = new BitSet(new long[]{0x0000002000020000L});
        public static final BitSet FOLLOW_17_in_ruleAction3280 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAction3312 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_34_in_ruleAction3366 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_35_in_ruleAction3404 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleAction3442 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleAction3462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractTerminal_in_entryRuleAbstractTerminal3482 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractTerminal3485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleAbstractTerminal3502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleAbstractTerminal3522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedElement_in_ruleAbstractTerminal3542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedKeyword_in_ruleAbstractTerminal3562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedRuleCall_in_ruleAbstractTerminal3582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedGroup_in_ruleAbstractTerminal3602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_entryRuleKeyword3622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyword3625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleKeyword3650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_entryRuleRuleCall3675 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRuleCall3678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleID_in_ruleRuleCall3721 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleRuleCall3752 = new BitSet(new long[]{0x0000004100000010L});
        public static final BitSet FOLLOW_ruleNamedArgument_in_ruleRuleCall3784 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_13_in_ruleRuleCall3821 = new BitSet(new long[]{0x0000004100000010L});
        public static final BitSet FOLLOW_ruleNamedArgument_in_ruleRuleCall3858 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_27_in_ruleRuleCall3897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue3923 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue3926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleLiteralValue3945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleLiteralValue3967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInverseLiteralValue_in_entryRuleInverseLiteralValue3987 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInverseLiteralValue3990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralValue_in_ruleInverseLiteralValue4002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedArgument_in_entryRuleNamedArgument4018 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedArgument4021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralValue_in_ruleNamedArgument4083 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedArgument4136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedArgument4207 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleNamedArgument4242 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNamedArgument4279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalRuleCall_in_entryRuleTerminalRuleCall4325 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalRuleCall4328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleID_in_ruleTerminalRuleCall4351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleID_in_entryRuleRuleID4376 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRuleID4379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRuleID4398 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleRuleID4418 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRuleID4435 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rulePredicatedKeyword_in_entryRulePredicatedKeyword4461 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicatedKeyword4464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rulePredicatedKeyword4504 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_40_in_rulePredicatedKeyword4558 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePredicatedKeyword4603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedRuleCall_in_entryRulePredicatedRuleCall4634 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicatedRuleCall4637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rulePredicatedRuleCall4677 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_40_in_rulePredicatedRuleCall4731 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePredicatedRuleCall4776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment4807 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment4810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleAssignment4850 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_40_in_ruleAssignment4904 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment4950 = new BitSet(new long[]{0x0000020C00000000L});
        public static final BitSet FOLLOW_35_in_ruleAssignment4996 = new BitSet(new long[]{0x0000000004008030L});
        public static final BitSet FOLLOW_34_in_ruleAssignment5030 = new BitSet(new long[]{0x0000000004008030L});
        public static final BitSet FOLLOW_41_in_ruleAssignment5064 = new BitSet(new long[]{0x0000000004008030L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_ruleAssignment5109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_entryRuleAssignableTerminal5140 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignableTerminal5143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleAssignableTerminal5160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleAssignableTerminal5180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedAssignableElement_in_ruleAssignableTerminal5200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCrossReference_in_ruleAssignableTerminal5220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedAssignableElement_in_entryRuleParenthesizedAssignableElement5240 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedAssignableElement5243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedAssignableElement5262 = new BitSet(new long[]{0x0000000004008030L});
        public static final BitSet FOLLOW_ruleAssignableAlternatives_in_ruleParenthesizedAssignableElement5274 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParenthesizedAssignableElement5288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignableAlternatives_in_entryRuleAssignableAlternatives5308 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignableAlternatives5311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives5328 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleAssignableAlternatives5371 = new BitSet(new long[]{0x0000000004008030L});
        public static final BitSet FOLLOW_ruleAssignableTerminal_in_ruleAssignableAlternatives5408 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleCrossReference_in_entryRuleCrossReference5456 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCrossReference5459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleCrossReference5478 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleCrossReference5505 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_29_in_ruleCrossReference5536 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleCrossReferenceableTerminal_in_ruleCrossReference5568 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleCrossReference5601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCrossReferenceableTerminal_in_entryRuleCrossReferenceableTerminal5621 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCrossReferenceableTerminal5624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleCrossReferenceableTerminal5641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleCall_in_ruleCrossReferenceableTerminal5661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement5681 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedElement5684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedElement5703 = new BitSet(new long[]{0x0000018204008030L});
        public static final BitSet FOLLOW_ruleAlternatives_in_ruleParenthesizedElement5715 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParenthesizedElement5729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicatedGroup_in_entryRulePredicatedGroup5749 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicatedGroup5752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rulePredicatedGroup5792 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_40_in_rulePredicatedGroup5846 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePredicatedGroup5878 = new BitSet(new long[]{0x0000018204008030L});
        public static final BitSet FOLLOW_ruleAlternatives_in_rulePredicatedGroup5905 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePredicatedGroup5930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalRule_in_entryRuleTerminalRule5950 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalRule5953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleTerminalRule5972 = new BitSet(new long[]{0x0000000000200010L});
        public static final BitSet FOLLOW_21_in_ruleTerminalRule6016 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalRule6068 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalRule6139 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleTerminalRule6182 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleTerminalRule6224 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTerminalRule6274 = new BitSet(new long[]{0x0000094000028030L});
        public static final BitSet FOLLOW_ruleTerminalAlternatives_in_ruleTerminalRule6301 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleTerminalRule6326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalAlternatives_in_entryRuleTerminalAlternatives6346 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalAlternatives6349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives6366 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleTerminalAlternatives6409 = new BitSet(new long[]{0x0000094000028030L});
        public static final BitSet FOLLOW_ruleTerminalGroup_in_ruleTerminalAlternatives6446 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleTerminalGroup_in_entryRuleTerminalGroup6494 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalGroup6497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalToken_in_ruleTerminalGroup6514 = new BitSet(new long[]{0x0000094000028032L});
        public static final BitSet FOLLOW_ruleTerminalToken_in_ruleTerminalGroup6565 = new BitSet(new long[]{0x0000094000028032L});
        public static final BitSet FOLLOW_ruleTerminalToken_in_entryRuleTerminalToken6605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalToken6608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_ruleTerminalToken6625 = new BitSet(new long[]{0x0000000180400002L});
        public static final BitSet FOLLOW_31_in_ruleTerminalToken6660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleTerminalToken6694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleTerminalToken6728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_entryRuleTerminalTokenElement6767 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerminalTokenElement6770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterRange_in_ruleTerminalTokenElement6787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerminalRuleCall_in_ruleTerminalTokenElement6807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedTerminalElement_in_ruleTerminalTokenElement6827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNegatedToken_in_ruleTerminalTokenElement6847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcard_in_ruleTerminalTokenElement6867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEOF_in_ruleTerminalTokenElement6887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParenthesizedTerminalElement_in_entryRuleParenthesizedTerminalElement6907 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedTerminalElement6910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParenthesizedTerminalElement6929 = new BitSet(new long[]{0x0000094000028030L});
        public static final BitSet FOLLOW_ruleTerminalAlternatives_in_ruleParenthesizedTerminalElement6941 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParenthesizedTerminalElement6955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNegatedToken_in_entryRuleAbstractNegatedToken6975 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNegatedToken6978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegatedToken_in_ruleAbstractNegatedToken6995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUntilToken_in_ruleAbstractNegatedToken7015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegatedToken_in_entryRuleNegatedToken7035 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegatedToken7038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleNegatedToken7057 = new BitSet(new long[]{0x0000094000028030L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_ruleNegatedToken7084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUntilToken_in_entryRuleUntilToken7115 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUntilToken7118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleUntilToken7137 = new BitSet(new long[]{0x0000094000028030L});
        public static final BitSet FOLLOW_ruleTerminalTokenElement_in_ruleUntilToken7164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcard_in_entryRuleWildcard7195 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWildcard7198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleWildcard7230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEOF_in_entryRuleEOF7250 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEOF7253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEOF7285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterRange_in_entryRuleCharacterRange7305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCharacterRange7308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleCharacterRange7325 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_44_in_ruleCharacterRange7361 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleCharacterRange7393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumRule_in_entryRuleEnumRule7432 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumRule7435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEnumRule7454 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumRule7481 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleEnumRule7512 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeRef_in_ruleEnumRule7544 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleEnumRule7577 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumLiterals_in_ruleEnumRule7604 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleEnumRule7629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumLiterals_in_entryRuleEnumLiterals7649 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiterals7652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals7669 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleEnumLiterals7712 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumLiteralDeclaration_in_ruleEnumLiterals7749 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleEnumLiteralDeclaration_in_entryRuleEnumLiteralDeclaration7797 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteralDeclaration7800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLiteralDeclaration7832 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleEnumLiteralDeclaration7863 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleKeyword_in_ruleEnumLiteralDeclaration7895 = new BitSet(new long[]{0x0000000000000002L});
    }


}