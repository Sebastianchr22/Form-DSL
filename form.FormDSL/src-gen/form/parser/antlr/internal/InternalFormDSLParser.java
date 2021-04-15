package form.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import form.services.FormDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFormDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'form'", "'shortText'", "'date'", "'number'", "'email'", "'longText'", "'optional'", "'focus'", "'is'", "'length'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFormDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFormDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFormDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFormDSL.g"; }



     	private FormDSLGrammarAccess grammarAccess;

        public InternalFormDSLParser(TokenStream input, FormDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Form";
       	}

       	@Override
       	protected FormDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleForm"
    // InternalFormDSL.g:64:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalFormDSL.g:64:45: (iv_ruleForm= ruleForm EOF )
            // InternalFormDSL.g:65:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalFormDSL.g:71:1: ruleForm returns [EObject current=null] : ( () otherlv_1= 'form' ( (lv_content_2_0= ruleInput ) )* ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalFormDSL.g:77:2: ( ( () otherlv_1= 'form' ( (lv_content_2_0= ruleInput ) )* ) )
            // InternalFormDSL.g:78:2: ( () otherlv_1= 'form' ( (lv_content_2_0= ruleInput ) )* )
            {
            // InternalFormDSL.g:78:2: ( () otherlv_1= 'form' ( (lv_content_2_0= ruleInput ) )* )
            // InternalFormDSL.g:79:3: () otherlv_1= 'form' ( (lv_content_2_0= ruleInput ) )*
            {
            // InternalFormDSL.g:79:3: ()
            // InternalFormDSL.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFormAccess().getFormAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFormAccess().getFormKeyword_1());
            		
            // InternalFormDSL.g:90:3: ( (lv_content_2_0= ruleInput ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFormDSL.g:91:4: (lv_content_2_0= ruleInput )
            	    {
            	    // InternalFormDSL.g:91:4: (lv_content_2_0= ruleInput )
            	    // InternalFormDSL.g:92:5: lv_content_2_0= ruleInput
            	    {

            	    					newCompositeNode(grammarAccess.getFormAccess().getContentInputParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_content_2_0=ruleInput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFormRule());
            	    					}
            	    					add(
            	    						current,
            	    						"content",
            	    						lv_content_2_0,
            	    						"form.FormDSL.Input");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleInput"
    // InternalFormDSL.g:113:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalFormDSL.g:113:46: (iv_ruleInput= ruleInput EOF )
            // InternalFormDSL.g:114:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalFormDSL.g:120:1: ruleInput returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleName ) ) ( (lv_expression_2_0= ruleExpression ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;

        EObject lv_name_1_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalFormDSL.g:126:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleName ) ) ( (lv_expression_2_0= ruleExpression ) )* ) )
            // InternalFormDSL.g:127:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleName ) ) ( (lv_expression_2_0= ruleExpression ) )* )
            {
            // InternalFormDSL.g:127:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleName ) ) ( (lv_expression_2_0= ruleExpression ) )* )
            // InternalFormDSL.g:128:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleName ) ) ( (lv_expression_2_0= ruleExpression ) )*
            {
            // InternalFormDSL.g:128:3: ( (lv_type_0_0= ruleType ) )
            // InternalFormDSL.g:129:4: (lv_type_0_0= ruleType )
            {
            // InternalFormDSL.g:129:4: (lv_type_0_0= ruleType )
            // InternalFormDSL.g:130:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getInputAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"form.FormDSL.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFormDSL.g:147:3: ( (lv_name_1_0= ruleName ) )
            // InternalFormDSL.g:148:4: (lv_name_1_0= ruleName )
            {
            // InternalFormDSL.g:148:4: (lv_name_1_0= ruleName )
            // InternalFormDSL.g:149:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getInputAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"form.FormDSL.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFormDSL.g:166:3: ( (lv_expression_2_0= ruleExpression ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=17 && LA2_0<=20)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFormDSL.g:167:4: (lv_expression_2_0= ruleExpression )
            	    {
            	    // InternalFormDSL.g:167:4: (lv_expression_2_0= ruleExpression )
            	    // InternalFormDSL.g:168:5: lv_expression_2_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getInputAccess().getExpressionExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_expression_2_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInputRule());
            	    					}
            	    					add(
            	    						current,
            	    						"expression",
            	    						lv_expression_2_0,
            	    						"form.FormDSL.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleType"
    // InternalFormDSL.g:189:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalFormDSL.g:189:45: (iv_ruleType= ruleType EOF )
            // InternalFormDSL.g:190:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalFormDSL.g:196:1: ruleType returns [EObject current=null] : ( ( () ( (lv_text_1_0= 'shortText' ) ) ) | ( () ( (lv_text_3_0= 'date' ) ) ) | ( () ( (lv_text_5_0= 'number' ) ) ) | ( () ( (lv_text_7_0= 'email' ) ) ) | ( () ( (lv_text_9_0= 'longText' ) ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        Token lv_text_3_0=null;
        Token lv_text_5_0=null;
        Token lv_text_7_0=null;
        Token lv_text_9_0=null;


        	enterRule();

        try {
            // InternalFormDSL.g:202:2: ( ( ( () ( (lv_text_1_0= 'shortText' ) ) ) | ( () ( (lv_text_3_0= 'date' ) ) ) | ( () ( (lv_text_5_0= 'number' ) ) ) | ( () ( (lv_text_7_0= 'email' ) ) ) | ( () ( (lv_text_9_0= 'longText' ) ) ) ) )
            // InternalFormDSL.g:203:2: ( ( () ( (lv_text_1_0= 'shortText' ) ) ) | ( () ( (lv_text_3_0= 'date' ) ) ) | ( () ( (lv_text_5_0= 'number' ) ) ) | ( () ( (lv_text_7_0= 'email' ) ) ) | ( () ( (lv_text_9_0= 'longText' ) ) ) )
            {
            // InternalFormDSL.g:203:2: ( ( () ( (lv_text_1_0= 'shortText' ) ) ) | ( () ( (lv_text_3_0= 'date' ) ) ) | ( () ( (lv_text_5_0= 'number' ) ) ) | ( () ( (lv_text_7_0= 'email' ) ) ) | ( () ( (lv_text_9_0= 'longText' ) ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFormDSL.g:204:3: ( () ( (lv_text_1_0= 'shortText' ) ) )
                    {
                    // InternalFormDSL.g:204:3: ( () ( (lv_text_1_0= 'shortText' ) ) )
                    // InternalFormDSL.g:205:4: () ( (lv_text_1_0= 'shortText' ) )
                    {
                    // InternalFormDSL.g:205:4: ()
                    // InternalFormDSL.g:206:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getShortTextAction_0_0(),
                    						current);
                    				

                    }

                    // InternalFormDSL.g:212:4: ( (lv_text_1_0= 'shortText' ) )
                    // InternalFormDSL.g:213:5: (lv_text_1_0= 'shortText' )
                    {
                    // InternalFormDSL.g:213:5: (lv_text_1_0= 'shortText' )
                    // InternalFormDSL.g:214:6: lv_text_1_0= 'shortText'
                    {
                    lv_text_1_0=(Token)match(input,12,FOLLOW_2); 

                    						newLeafNode(lv_text_1_0, grammarAccess.getTypeAccess().getTextShortTextKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "text", lv_text_1_0, "shortText");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFormDSL.g:228:3: ( () ( (lv_text_3_0= 'date' ) ) )
                    {
                    // InternalFormDSL.g:228:3: ( () ( (lv_text_3_0= 'date' ) ) )
                    // InternalFormDSL.g:229:4: () ( (lv_text_3_0= 'date' ) )
                    {
                    // InternalFormDSL.g:229:4: ()
                    // InternalFormDSL.g:230:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getGenericAction_1_0(),
                    						current);
                    				

                    }

                    // InternalFormDSL.g:236:4: ( (lv_text_3_0= 'date' ) )
                    // InternalFormDSL.g:237:5: (lv_text_3_0= 'date' )
                    {
                    // InternalFormDSL.g:237:5: (lv_text_3_0= 'date' )
                    // InternalFormDSL.g:238:6: lv_text_3_0= 'date'
                    {
                    lv_text_3_0=(Token)match(input,13,FOLLOW_2); 

                    						newLeafNode(lv_text_3_0, grammarAccess.getTypeAccess().getTextDateKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "text", lv_text_3_0, "date");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFormDSL.g:252:3: ( () ( (lv_text_5_0= 'number' ) ) )
                    {
                    // InternalFormDSL.g:252:3: ( () ( (lv_text_5_0= 'number' ) ) )
                    // InternalFormDSL.g:253:4: () ( (lv_text_5_0= 'number' ) )
                    {
                    // InternalFormDSL.g:253:4: ()
                    // InternalFormDSL.g:254:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getGenericAction_2_0(),
                    						current);
                    				

                    }

                    // InternalFormDSL.g:260:4: ( (lv_text_5_0= 'number' ) )
                    // InternalFormDSL.g:261:5: (lv_text_5_0= 'number' )
                    {
                    // InternalFormDSL.g:261:5: (lv_text_5_0= 'number' )
                    // InternalFormDSL.g:262:6: lv_text_5_0= 'number'
                    {
                    lv_text_5_0=(Token)match(input,14,FOLLOW_2); 

                    						newLeafNode(lv_text_5_0, grammarAccess.getTypeAccess().getTextNumberKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "text", lv_text_5_0, "number");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFormDSL.g:276:3: ( () ( (lv_text_7_0= 'email' ) ) )
                    {
                    // InternalFormDSL.g:276:3: ( () ( (lv_text_7_0= 'email' ) ) )
                    // InternalFormDSL.g:277:4: () ( (lv_text_7_0= 'email' ) )
                    {
                    // InternalFormDSL.g:277:4: ()
                    // InternalFormDSL.g:278:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getGenericAction_3_0(),
                    						current);
                    				

                    }

                    // InternalFormDSL.g:284:4: ( (lv_text_7_0= 'email' ) )
                    // InternalFormDSL.g:285:5: (lv_text_7_0= 'email' )
                    {
                    // InternalFormDSL.g:285:5: (lv_text_7_0= 'email' )
                    // InternalFormDSL.g:286:6: lv_text_7_0= 'email'
                    {
                    lv_text_7_0=(Token)match(input,15,FOLLOW_2); 

                    						newLeafNode(lv_text_7_0, grammarAccess.getTypeAccess().getTextEmailKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "text", lv_text_7_0, "email");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalFormDSL.g:300:3: ( () ( (lv_text_9_0= 'longText' ) ) )
                    {
                    // InternalFormDSL.g:300:3: ( () ( (lv_text_9_0= 'longText' ) ) )
                    // InternalFormDSL.g:301:4: () ( (lv_text_9_0= 'longText' ) )
                    {
                    // InternalFormDSL.g:301:4: ()
                    // InternalFormDSL.g:302:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getLongTextAction_4_0(),
                    						current);
                    				

                    }

                    // InternalFormDSL.g:308:4: ( (lv_text_9_0= 'longText' ) )
                    // InternalFormDSL.g:309:5: (lv_text_9_0= 'longText' )
                    {
                    // InternalFormDSL.g:309:5: (lv_text_9_0= 'longText' )
                    // InternalFormDSL.g:310:6: lv_text_9_0= 'longText'
                    {
                    lv_text_9_0=(Token)match(input,16,FOLLOW_2); 

                    						newLeafNode(lv_text_9_0, grammarAccess.getTypeAccess().getTextLongTextKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "text", lv_text_9_0, "longText");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleName"
    // InternalFormDSL.g:327:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalFormDSL.g:327:45: (iv_ruleName= ruleName EOF )
            // InternalFormDSL.g:328:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalFormDSL.g:334:1: ruleName returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalFormDSL.g:340:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalFormDSL.g:341:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalFormDSL.g:341:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalFormDSL.g:342:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalFormDSL.g:342:3: (lv_text_0_0= RULE_STRING )
            // InternalFormDSL.g:343:4: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getNameAccess().getTextSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleExpression"
    // InternalFormDSL.g:362:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFormDSL.g:362:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFormDSL.g:363:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalFormDSL.g:369:1: ruleExpression returns [EObject current=null] : ( ( () ( (lv_text_1_0= 'optional' ) ) ) | ( () ( (lv_text_3_0= 'focus' ) ) ) | this_Exp_4= ruleExp ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        Token lv_text_3_0=null;
        EObject this_Exp_4 = null;



        	enterRule();

        try {
            // InternalFormDSL.g:375:2: ( ( ( () ( (lv_text_1_0= 'optional' ) ) ) | ( () ( (lv_text_3_0= 'focus' ) ) ) | this_Exp_4= ruleExp ) )
            // InternalFormDSL.g:376:2: ( ( () ( (lv_text_1_0= 'optional' ) ) ) | ( () ( (lv_text_3_0= 'focus' ) ) ) | this_Exp_4= ruleExp )
            {
            // InternalFormDSL.g:376:2: ( ( () ( (lv_text_1_0= 'optional' ) ) ) | ( () ( (lv_text_3_0= 'focus' ) ) ) | this_Exp_4= ruleExp )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFormDSL.g:377:3: ( () ( (lv_text_1_0= 'optional' ) ) )
                    {
                    // InternalFormDSL.g:377:3: ( () ( (lv_text_1_0= 'optional' ) ) )
                    // InternalFormDSL.g:378:4: () ( (lv_text_1_0= 'optional' ) )
                    {
                    // InternalFormDSL.g:378:4: ()
                    // InternalFormDSL.g:379:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getOptionalAction_0_0(),
                    						current);
                    				

                    }

                    // InternalFormDSL.g:385:4: ( (lv_text_1_0= 'optional' ) )
                    // InternalFormDSL.g:386:5: (lv_text_1_0= 'optional' )
                    {
                    // InternalFormDSL.g:386:5: (lv_text_1_0= 'optional' )
                    // InternalFormDSL.g:387:6: lv_text_1_0= 'optional'
                    {
                    lv_text_1_0=(Token)match(input,17,FOLLOW_2); 

                    						newLeafNode(lv_text_1_0, grammarAccess.getExpressionAccess().getTextOptionalKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    						setWithLastConsumed(current, "text", lv_text_1_0, "optional");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFormDSL.g:401:3: ( () ( (lv_text_3_0= 'focus' ) ) )
                    {
                    // InternalFormDSL.g:401:3: ( () ( (lv_text_3_0= 'focus' ) ) )
                    // InternalFormDSL.g:402:4: () ( (lv_text_3_0= 'focus' ) )
                    {
                    // InternalFormDSL.g:402:4: ()
                    // InternalFormDSL.g:403:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getFocusAction_1_0(),
                    						current);
                    				

                    }

                    // InternalFormDSL.g:409:4: ( (lv_text_3_0= 'focus' ) )
                    // InternalFormDSL.g:410:5: (lv_text_3_0= 'focus' )
                    {
                    // InternalFormDSL.g:410:5: (lv_text_3_0= 'focus' )
                    // InternalFormDSL.g:411:6: lv_text_3_0= 'focus'
                    {
                    lv_text_3_0=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_text_3_0, grammarAccess.getExpressionAccess().getTextFocusKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    						setWithLastConsumed(current, "text", lv_text_3_0, "focus");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFormDSL.g:425:3: this_Exp_4= ruleExp
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getExpParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Exp_4=ruleExp();

                    state._fsp--;


                    			current = this_Exp_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExp"
    // InternalFormDSL.g:437:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalFormDSL.g:437:44: (iv_ruleExp= ruleExp EOF )
            // InternalFormDSL.g:438:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalFormDSL.g:444:1: ruleExp returns [EObject current=null] : ( ( ( () ( (lv_text_1_0= 'is' ) ) ) | ( () ( (lv_text_3_0= 'length' ) ) ) ) ( (lv_comp_4_0= ruleComparison ) ) ( (lv_value_5_0= RULE_INT ) ) ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        Token lv_text_3_0=null;
        Token lv_value_5_0=null;
        EObject lv_comp_4_0 = null;



        	enterRule();

        try {
            // InternalFormDSL.g:450:2: ( ( ( ( () ( (lv_text_1_0= 'is' ) ) ) | ( () ( (lv_text_3_0= 'length' ) ) ) ) ( (lv_comp_4_0= ruleComparison ) ) ( (lv_value_5_0= RULE_INT ) ) ) )
            // InternalFormDSL.g:451:2: ( ( ( () ( (lv_text_1_0= 'is' ) ) ) | ( () ( (lv_text_3_0= 'length' ) ) ) ) ( (lv_comp_4_0= ruleComparison ) ) ( (lv_value_5_0= RULE_INT ) ) )
            {
            // InternalFormDSL.g:451:2: ( ( ( () ( (lv_text_1_0= 'is' ) ) ) | ( () ( (lv_text_3_0= 'length' ) ) ) ) ( (lv_comp_4_0= ruleComparison ) ) ( (lv_value_5_0= RULE_INT ) ) )
            // InternalFormDSL.g:452:3: ( ( () ( (lv_text_1_0= 'is' ) ) ) | ( () ( (lv_text_3_0= 'length' ) ) ) ) ( (lv_comp_4_0= ruleComparison ) ) ( (lv_value_5_0= RULE_INT ) )
            {
            // InternalFormDSL.g:452:3: ( ( () ( (lv_text_1_0= 'is' ) ) ) | ( () ( (lv_text_3_0= 'length' ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFormDSL.g:453:4: ( () ( (lv_text_1_0= 'is' ) ) )
                    {
                    // InternalFormDSL.g:453:4: ( () ( (lv_text_1_0= 'is' ) ) )
                    // InternalFormDSL.g:454:5: () ( (lv_text_1_0= 'is' ) )
                    {
                    // InternalFormDSL.g:454:5: ()
                    // InternalFormDSL.g:455:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getExpAccess().getIsAction_0_0_0(),
                    							current);
                    					

                    }

                    // InternalFormDSL.g:461:5: ( (lv_text_1_0= 'is' ) )
                    // InternalFormDSL.g:462:6: (lv_text_1_0= 'is' )
                    {
                    // InternalFormDSL.g:462:6: (lv_text_1_0= 'is' )
                    // InternalFormDSL.g:463:7: lv_text_1_0= 'is'
                    {
                    lv_text_1_0=(Token)match(input,19,FOLLOW_6); 

                    							newLeafNode(lv_text_1_0, grammarAccess.getExpAccess().getTextIsKeyword_0_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExpRule());
                    							}
                    							setWithLastConsumed(current, "text", lv_text_1_0, "is");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFormDSL.g:477:4: ( () ( (lv_text_3_0= 'length' ) ) )
                    {
                    // InternalFormDSL.g:477:4: ( () ( (lv_text_3_0= 'length' ) ) )
                    // InternalFormDSL.g:478:5: () ( (lv_text_3_0= 'length' ) )
                    {
                    // InternalFormDSL.g:478:5: ()
                    // InternalFormDSL.g:479:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getExpAccess().getLengthAction_0_1_0(),
                    							current);
                    					

                    }

                    // InternalFormDSL.g:485:5: ( (lv_text_3_0= 'length' ) )
                    // InternalFormDSL.g:486:6: (lv_text_3_0= 'length' )
                    {
                    // InternalFormDSL.g:486:6: (lv_text_3_0= 'length' )
                    // InternalFormDSL.g:487:7: lv_text_3_0= 'length'
                    {
                    lv_text_3_0=(Token)match(input,20,FOLLOW_6); 

                    							newLeafNode(lv_text_3_0, grammarAccess.getExpAccess().getTextLengthKeyword_0_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExpRule());
                    							}
                    							setWithLastConsumed(current, "text", lv_text_3_0, "length");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalFormDSL.g:501:3: ( (lv_comp_4_0= ruleComparison ) )
            // InternalFormDSL.g:502:4: (lv_comp_4_0= ruleComparison )
            {
            // InternalFormDSL.g:502:4: (lv_comp_4_0= ruleComparison )
            // InternalFormDSL.g:503:5: lv_comp_4_0= ruleComparison
            {

            					newCompositeNode(grammarAccess.getExpAccess().getCompComparisonParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_comp_4_0=ruleComparison();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpRule());
            					}
            					set(
            						current,
            						"comp",
            						lv_comp_4_0,
            						"form.FormDSL.Comparison");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFormDSL.g:520:3: ( (lv_value_5_0= RULE_INT ) )
            // InternalFormDSL.g:521:4: (lv_value_5_0= RULE_INT )
            {
            // InternalFormDSL.g:521:4: (lv_value_5_0= RULE_INT )
            // InternalFormDSL.g:522:5: lv_value_5_0= RULE_INT
            {
            lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_5_0, grammarAccess.getExpAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleComparison"
    // InternalFormDSL.g:542:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalFormDSL.g:542:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalFormDSL.g:543:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalFormDSL.g:549:1: ruleComparison returns [EObject current=null] : ( (otherlv_0= '<' () ) | (otherlv_2= '>' () ) | (otherlv_4= '<=' () ) | (otherlv_6= '>=' () ) | (otherlv_8= '==' () ) | (otherlv_10= '!=' () ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalFormDSL.g:555:2: ( ( (otherlv_0= '<' () ) | (otherlv_2= '>' () ) | (otherlv_4= '<=' () ) | (otherlv_6= '>=' () ) | (otherlv_8= '==' () ) | (otherlv_10= '!=' () ) ) )
            // InternalFormDSL.g:556:2: ( (otherlv_0= '<' () ) | (otherlv_2= '>' () ) | (otherlv_4= '<=' () ) | (otherlv_6= '>=' () ) | (otherlv_8= '==' () ) | (otherlv_10= '!=' () ) )
            {
            // InternalFormDSL.g:556:2: ( (otherlv_0= '<' () ) | (otherlv_2= '>' () ) | (otherlv_4= '<=' () ) | (otherlv_6= '>=' () ) | (otherlv_8= '==' () ) | (otherlv_10= '!=' () ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 24:
                {
                alt6=4;
                }
                break;
            case 25:
                {
                alt6=5;
                }
                break;
            case 26:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalFormDSL.g:557:3: (otherlv_0= '<' () )
                    {
                    // InternalFormDSL.g:557:3: (otherlv_0= '<' () )
                    // InternalFormDSL.g:558:4: otherlv_0= '<' ()
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_0, grammarAccess.getComparisonAccess().getLessThanSignKeyword_0_0());
                    			
                    // InternalFormDSL.g:562:4: ()
                    // InternalFormDSL.g:563:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonAccess().getLessThanAction_0_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFormDSL.g:571:3: (otherlv_2= '>' () )
                    {
                    // InternalFormDSL.g:571:3: (otherlv_2= '>' () )
                    // InternalFormDSL.g:572:4: otherlv_2= '>' ()
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0());
                    			
                    // InternalFormDSL.g:576:4: ()
                    // InternalFormDSL.g:577:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonAccess().getGreaterThanAction_1_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFormDSL.g:585:3: (otherlv_4= '<=' () )
                    {
                    // InternalFormDSL.g:585:3: (otherlv_4= '<=' () )
                    // InternalFormDSL.g:586:4: otherlv_4= '<=' ()
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_2_0());
                    			
                    // InternalFormDSL.g:590:4: ()
                    // InternalFormDSL.g:591:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonAccess().getLessThanInclusiveAction_2_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFormDSL.g:599:3: (otherlv_6= '>=' () )
                    {
                    // InternalFormDSL.g:599:3: (otherlv_6= '>=' () )
                    // InternalFormDSL.g:600:4: otherlv_6= '>=' ()
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_3_0());
                    			
                    // InternalFormDSL.g:604:4: ()
                    // InternalFormDSL.g:605:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonAccess().getGreaterThanInclusiveAction_3_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalFormDSL.g:613:3: (otherlv_8= '==' () )
                    {
                    // InternalFormDSL.g:613:3: (otherlv_8= '==' () )
                    // InternalFormDSL.g:614:4: otherlv_8= '==' ()
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_4_0());
                    			
                    // InternalFormDSL.g:618:4: ()
                    // InternalFormDSL.g:619:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonAccess().getExactlyAction_4_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalFormDSL.g:627:3: (otherlv_10= '!=' () )
                    {
                    // InternalFormDSL.g:627:3: (otherlv_10= '!=' () )
                    // InternalFormDSL.g:628:4: otherlv_10= '!=' ()
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_5_0());
                    			
                    // InternalFormDSL.g:632:4: ()
                    // InternalFormDSL.g:633:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonAccess().getNotAction_5_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001F002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000007E00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});

}