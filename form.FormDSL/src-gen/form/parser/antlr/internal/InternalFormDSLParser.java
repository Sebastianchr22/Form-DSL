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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'form'", "'shortText'", "'date'", "'number'", "'money'", "'email'", "'longText'", "'stringNumber'", "'optional'", "'focus'", "'is'", "'length'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='"
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
    public static final int T__27=27;
    public static final int T__28=28;
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

                if ( ((LA1_0>=12 && LA1_0<=18)) ) {
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

                if ( ((LA2_0>=19 && LA2_0<=22)) ) {
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
    // InternalFormDSL.g:196:1: ruleType returns [EObject current=null] : ( ( () ( (lv_text_1_0= 'shortText' ) ) ) | ( () ( (lv_text_3_0= 'date' ) ) ) | ( () ( (lv_text_5_0= 'number' ) ) ) | ( () ( (lv_text_7_0= 'money' ) ) ) | ( () ( (lv_text_9_0= 'email' ) ) ) | ( () ( (lv_text_11_0= 'longText' ) ) ) | ( () ( (lv_text_13_0= 'stringNumber' ) ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        Token lv_text_3_0=null;
        Token lv_text_5_0=null;
        Token lv_text_7_0=null;
        Token lv_text_9_0=null;
        Token lv_text_11_0=null;
        Token lv_text_13_0=null;


        	enterRule();

        try {
            // InternalFormDSL.g:202:2: ( ( ( () ( (lv_text_1_0= 'shortText' ) ) ) | ( () ( (lv_text_3_0= 'date' ) ) ) | ( () ( (lv_text_5_0= 'number' ) ) ) | ( () ( (lv_text_7_0= 'money' ) ) ) | ( () ( (lv_text_9_0= 'email' ) ) ) | ( () ( (lv_text_11_0= 'longText' ) ) ) | ( () ( (lv_text_13_0= 'stringNumber' ) ) ) ) )
            // InternalFormDSL.g:203:2: ( ( () ( (lv_text_1_0= 'shortText' ) ) ) | ( () ( (lv_text_3_0= 'date' ) ) ) | ( () ( (lv_text_5_0= 'number' ) ) ) | ( () ( (lv_text_7_0= 'money' ) ) ) | ( () ( (lv_text_9_0= 'email' ) ) ) | ( () ( (lv_text_11_0= 'longText' ) ) ) | ( () ( (lv_text_13_0= 'stringNumber' ) ) ) )
            {
            // InternalFormDSL.g:203:2: ( ( () ( (lv_text_1_0= 'shortText' ) ) ) | ( () ( (lv_text_3_0= 'date' ) ) ) | ( () ( (lv_text_5_0= 'number' ) ) ) | ( () ( (lv_text_7_0= 'money' ) ) ) | ( () ( (lv_text_9_0= 'email' ) ) ) | ( () ( (lv_text_11_0= 'longText' ) ) ) | ( () ( (lv_text_13_0= 'stringNumber' ) ) ) )
            int alt3=7;
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
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
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
                    // InternalFormDSL.g:276:3: ( () ( (lv_text_7_0= 'money' ) ) )
                    {
                    // InternalFormDSL.g:276:3: ( () ( (lv_text_7_0= 'money' ) ) )
                    // InternalFormDSL.g:277:4: () ( (lv_text_7_0= 'money' ) )
                    {
                    // InternalFormDSL.g:277:4: ()
                    // InternalFormDSL.g:278:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getMoneyAction_3_0(),
                    						current);
                    				

                    }

                    // InternalFormDSL.g:284:4: ( (lv_text_7_0= 'money' ) )
                    // InternalFormDSL.g:285:5: (lv_text_7_0= 'money' )
                    {
                    // InternalFormDSL.g:285:5: (lv_text_7_0= 'money' )
                    // InternalFormDSL.g:286:6: lv_text_7_0= 'money'
                    {
                    lv_text_7_0=(Token)match(input,15,FOLLOW_2); 

                    						newLeafNode(lv_text_7_0, grammarAccess.getTypeAccess().getTextMoneyKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "text", lv_text_7_0, "money");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalFormDSL.g:300:3: ( () ( (lv_text_9_0= 'email' ) ) )
                    {
                    // InternalFormDSL.g:300:3: ( () ( (lv_text_9_0= 'email' ) ) )
                    // InternalFormDSL.g:301:4: () ( (lv_text_9_0= 'email' ) )
                    {
                    // InternalFormDSL.g:301:4: ()
                    // InternalFormDSL.g:302:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getGenericAction_4_0(),
                    						current);
                    				

                    }

                    // InternalFormDSL.g:308:4: ( (lv_text_9_0= 'email' ) )
                    // InternalFormDSL.g:309:5: (lv_text_9_0= 'email' )
                    {
                    // InternalFormDSL.g:309:5: (lv_text_9_0= 'email' )
                    // InternalFormDSL.g:310:6: lv_text_9_0= 'email'
                    {
                    lv_text_9_0=(Token)match(input,16,FOLLOW_2); 

                    						newLeafNode(lv_text_9_0, grammarAccess.getTypeAccess().getTextEmailKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "text", lv_text_9_0, "email");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalFormDSL.g:324:3: ( () ( (lv_text_11_0= 'longText' ) ) )
                    {
                    // InternalFormDSL.g:324:3: ( () ( (lv_text_11_0= 'longText' ) ) )
                    // InternalFormDSL.g:325:4: () ( (lv_text_11_0= 'longText' ) )
                    {
                    // InternalFormDSL.g:325:4: ()
                    // InternalFormDSL.g:326:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getLongTextAction_5_0(),
                    						current);
                    				

                    }

                    // InternalFormDSL.g:332:4: ( (lv_text_11_0= 'longText' ) )
                    // InternalFormDSL.g:333:5: (lv_text_11_0= 'longText' )
                    {
                    // InternalFormDSL.g:333:5: (lv_text_11_0= 'longText' )
                    // InternalFormDSL.g:334:6: lv_text_11_0= 'longText'
                    {
                    lv_text_11_0=(Token)match(input,17,FOLLOW_2); 

                    						newLeafNode(lv_text_11_0, grammarAccess.getTypeAccess().getTextLongTextKeyword_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "text", lv_text_11_0, "longText");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalFormDSL.g:348:3: ( () ( (lv_text_13_0= 'stringNumber' ) ) )
                    {
                    // InternalFormDSL.g:348:3: ( () ( (lv_text_13_0= 'stringNumber' ) ) )
                    // InternalFormDSL.g:349:4: () ( (lv_text_13_0= 'stringNumber' ) )
                    {
                    // InternalFormDSL.g:349:4: ()
                    // InternalFormDSL.g:350:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getStringNumberAction_6_0(),
                    						current);
                    				

                    }

                    // InternalFormDSL.g:356:4: ( (lv_text_13_0= 'stringNumber' ) )
                    // InternalFormDSL.g:357:5: (lv_text_13_0= 'stringNumber' )
                    {
                    // InternalFormDSL.g:357:5: (lv_text_13_0= 'stringNumber' )
                    // InternalFormDSL.g:358:6: lv_text_13_0= 'stringNumber'
                    {
                    lv_text_13_0=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_text_13_0, grammarAccess.getTypeAccess().getTextStringNumberKeyword_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "text", lv_text_13_0, "stringNumber");
                    					

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
    // InternalFormDSL.g:375:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalFormDSL.g:375:45: (iv_ruleName= ruleName EOF )
            // InternalFormDSL.g:376:2: iv_ruleName= ruleName EOF
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
    // InternalFormDSL.g:382:1: ruleName returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalFormDSL.g:388:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalFormDSL.g:389:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalFormDSL.g:389:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalFormDSL.g:390:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalFormDSL.g:390:3: (lv_text_0_0= RULE_STRING )
            // InternalFormDSL.g:391:4: lv_text_0_0= RULE_STRING
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
    // InternalFormDSL.g:410:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFormDSL.g:410:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFormDSL.g:411:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalFormDSL.g:417:1: ruleExpression returns [EObject current=null] : ( ( () ( (lv_text_1_0= 'optional' ) ) ) | ( () ( (lv_text_3_0= 'focus' ) ) ) | this_Exp_4= ruleExp ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        Token lv_text_3_0=null;
        EObject this_Exp_4 = null;



        	enterRule();

        try {
            // InternalFormDSL.g:423:2: ( ( ( () ( (lv_text_1_0= 'optional' ) ) ) | ( () ( (lv_text_3_0= 'focus' ) ) ) | this_Exp_4= ruleExp ) )
            // InternalFormDSL.g:424:2: ( ( () ( (lv_text_1_0= 'optional' ) ) ) | ( () ( (lv_text_3_0= 'focus' ) ) ) | this_Exp_4= ruleExp )
            {
            // InternalFormDSL.g:424:2: ( ( () ( (lv_text_1_0= 'optional' ) ) ) | ( () ( (lv_text_3_0= 'focus' ) ) ) | this_Exp_4= ruleExp )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
            case 22:
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
                    // InternalFormDSL.g:425:3: ( () ( (lv_text_1_0= 'optional' ) ) )
                    {
                    // InternalFormDSL.g:425:3: ( () ( (lv_text_1_0= 'optional' ) ) )
                    // InternalFormDSL.g:426:4: () ( (lv_text_1_0= 'optional' ) )
                    {
                    // InternalFormDSL.g:426:4: ()
                    // InternalFormDSL.g:427:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getOptionalAction_0_0(),
                    						current);
                    				

                    }

                    // InternalFormDSL.g:433:4: ( (lv_text_1_0= 'optional' ) )
                    // InternalFormDSL.g:434:5: (lv_text_1_0= 'optional' )
                    {
                    // InternalFormDSL.g:434:5: (lv_text_1_0= 'optional' )
                    // InternalFormDSL.g:435:6: lv_text_1_0= 'optional'
                    {
                    lv_text_1_0=(Token)match(input,19,FOLLOW_2); 

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
                    // InternalFormDSL.g:449:3: ( () ( (lv_text_3_0= 'focus' ) ) )
                    {
                    // InternalFormDSL.g:449:3: ( () ( (lv_text_3_0= 'focus' ) ) )
                    // InternalFormDSL.g:450:4: () ( (lv_text_3_0= 'focus' ) )
                    {
                    // InternalFormDSL.g:450:4: ()
                    // InternalFormDSL.g:451:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getFocusAction_1_0(),
                    						current);
                    				

                    }

                    // InternalFormDSL.g:457:4: ( (lv_text_3_0= 'focus' ) )
                    // InternalFormDSL.g:458:5: (lv_text_3_0= 'focus' )
                    {
                    // InternalFormDSL.g:458:5: (lv_text_3_0= 'focus' )
                    // InternalFormDSL.g:459:6: lv_text_3_0= 'focus'
                    {
                    lv_text_3_0=(Token)match(input,20,FOLLOW_2); 

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
                    // InternalFormDSL.g:473:3: this_Exp_4= ruleExp
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
    // InternalFormDSL.g:485:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalFormDSL.g:485:44: (iv_ruleExp= ruleExp EOF )
            // InternalFormDSL.g:486:2: iv_ruleExp= ruleExp EOF
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
    // InternalFormDSL.g:492:1: ruleExp returns [EObject current=null] : ( ( ( () ( (lv_text_1_0= 'is' ) ) ) | ( () ( (lv_text_3_0= 'length' ) ) ) ) ( (lv_comp_4_0= ruleComparison ) ) ( (lv_value_5_0= RULE_INT ) ) ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        Token lv_text_3_0=null;
        Token lv_value_5_0=null;
        EObject lv_comp_4_0 = null;



        	enterRule();

        try {
            // InternalFormDSL.g:498:2: ( ( ( ( () ( (lv_text_1_0= 'is' ) ) ) | ( () ( (lv_text_3_0= 'length' ) ) ) ) ( (lv_comp_4_0= ruleComparison ) ) ( (lv_value_5_0= RULE_INT ) ) ) )
            // InternalFormDSL.g:499:2: ( ( ( () ( (lv_text_1_0= 'is' ) ) ) | ( () ( (lv_text_3_0= 'length' ) ) ) ) ( (lv_comp_4_0= ruleComparison ) ) ( (lv_value_5_0= RULE_INT ) ) )
            {
            // InternalFormDSL.g:499:2: ( ( ( () ( (lv_text_1_0= 'is' ) ) ) | ( () ( (lv_text_3_0= 'length' ) ) ) ) ( (lv_comp_4_0= ruleComparison ) ) ( (lv_value_5_0= RULE_INT ) ) )
            // InternalFormDSL.g:500:3: ( ( () ( (lv_text_1_0= 'is' ) ) ) | ( () ( (lv_text_3_0= 'length' ) ) ) ) ( (lv_comp_4_0= ruleComparison ) ) ( (lv_value_5_0= RULE_INT ) )
            {
            // InternalFormDSL.g:500:3: ( ( () ( (lv_text_1_0= 'is' ) ) ) | ( () ( (lv_text_3_0= 'length' ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFormDSL.g:501:4: ( () ( (lv_text_1_0= 'is' ) ) )
                    {
                    // InternalFormDSL.g:501:4: ( () ( (lv_text_1_0= 'is' ) ) )
                    // InternalFormDSL.g:502:5: () ( (lv_text_1_0= 'is' ) )
                    {
                    // InternalFormDSL.g:502:5: ()
                    // InternalFormDSL.g:503:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getExpAccess().getIsAction_0_0_0(),
                    							current);
                    					

                    }

                    // InternalFormDSL.g:509:5: ( (lv_text_1_0= 'is' ) )
                    // InternalFormDSL.g:510:6: (lv_text_1_0= 'is' )
                    {
                    // InternalFormDSL.g:510:6: (lv_text_1_0= 'is' )
                    // InternalFormDSL.g:511:7: lv_text_1_0= 'is'
                    {
                    lv_text_1_0=(Token)match(input,21,FOLLOW_6); 

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
                    // InternalFormDSL.g:525:4: ( () ( (lv_text_3_0= 'length' ) ) )
                    {
                    // InternalFormDSL.g:525:4: ( () ( (lv_text_3_0= 'length' ) ) )
                    // InternalFormDSL.g:526:5: () ( (lv_text_3_0= 'length' ) )
                    {
                    // InternalFormDSL.g:526:5: ()
                    // InternalFormDSL.g:527:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getExpAccess().getLengthAction_0_1_0(),
                    							current);
                    					

                    }

                    // InternalFormDSL.g:533:5: ( (lv_text_3_0= 'length' ) )
                    // InternalFormDSL.g:534:6: (lv_text_3_0= 'length' )
                    {
                    // InternalFormDSL.g:534:6: (lv_text_3_0= 'length' )
                    // InternalFormDSL.g:535:7: lv_text_3_0= 'length'
                    {
                    lv_text_3_0=(Token)match(input,22,FOLLOW_6); 

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

            // InternalFormDSL.g:549:3: ( (lv_comp_4_0= ruleComparison ) )
            // InternalFormDSL.g:550:4: (lv_comp_4_0= ruleComparison )
            {
            // InternalFormDSL.g:550:4: (lv_comp_4_0= ruleComparison )
            // InternalFormDSL.g:551:5: lv_comp_4_0= ruleComparison
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

            // InternalFormDSL.g:568:3: ( (lv_value_5_0= RULE_INT ) )
            // InternalFormDSL.g:569:4: (lv_value_5_0= RULE_INT )
            {
            // InternalFormDSL.g:569:4: (lv_value_5_0= RULE_INT )
            // InternalFormDSL.g:570:5: lv_value_5_0= RULE_INT
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
    // InternalFormDSL.g:590:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalFormDSL.g:590:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalFormDSL.g:591:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalFormDSL.g:597:1: ruleComparison returns [EObject current=null] : ( (otherlv_0= '<' () ) | (otherlv_2= '>' () ) | (otherlv_4= '<=' () ) | (otherlv_6= '>=' () ) | (otherlv_8= '==' () ) | (otherlv_10= '!=' () ) ) ;
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
            // InternalFormDSL.g:603:2: ( ( (otherlv_0= '<' () ) | (otherlv_2= '>' () ) | (otherlv_4= '<=' () ) | (otherlv_6= '>=' () ) | (otherlv_8= '==' () ) | (otherlv_10= '!=' () ) ) )
            // InternalFormDSL.g:604:2: ( (otherlv_0= '<' () ) | (otherlv_2= '>' () ) | (otherlv_4= '<=' () ) | (otherlv_6= '>=' () ) | (otherlv_8= '==' () ) | (otherlv_10= '!=' () ) )
            {
            // InternalFormDSL.g:604:2: ( (otherlv_0= '<' () ) | (otherlv_2= '>' () ) | (otherlv_4= '<=' () ) | (otherlv_6= '>=' () ) | (otherlv_8= '==' () ) | (otherlv_10= '!=' () ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            case 27:
                {
                alt6=5;
                }
                break;
            case 28:
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
                    // InternalFormDSL.g:605:3: (otherlv_0= '<' () )
                    {
                    // InternalFormDSL.g:605:3: (otherlv_0= '<' () )
                    // InternalFormDSL.g:606:4: otherlv_0= '<' ()
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_0, grammarAccess.getComparisonAccess().getLessThanSignKeyword_0_0());
                    			
                    // InternalFormDSL.g:610:4: ()
                    // InternalFormDSL.g:611:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonAccess().getLessThanAction_0_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFormDSL.g:619:3: (otherlv_2= '>' () )
                    {
                    // InternalFormDSL.g:619:3: (otherlv_2= '>' () )
                    // InternalFormDSL.g:620:4: otherlv_2= '>' ()
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0());
                    			
                    // InternalFormDSL.g:624:4: ()
                    // InternalFormDSL.g:625:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonAccess().getGreaterThanAction_1_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFormDSL.g:633:3: (otherlv_4= '<=' () )
                    {
                    // InternalFormDSL.g:633:3: (otherlv_4= '<=' () )
                    // InternalFormDSL.g:634:4: otherlv_4= '<=' ()
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_2_0());
                    			
                    // InternalFormDSL.g:638:4: ()
                    // InternalFormDSL.g:639:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonAccess().getLessThanInclusiveAction_2_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFormDSL.g:647:3: (otherlv_6= '>=' () )
                    {
                    // InternalFormDSL.g:647:3: (otherlv_6= '>=' () )
                    // InternalFormDSL.g:648:4: otherlv_6= '>=' ()
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_3_0());
                    			
                    // InternalFormDSL.g:652:4: ()
                    // InternalFormDSL.g:653:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonAccess().getGreaterThanInclusiveAction_3_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalFormDSL.g:661:3: (otherlv_8= '==' () )
                    {
                    // InternalFormDSL.g:661:3: (otherlv_8= '==' () )
                    // InternalFormDSL.g:662:4: otherlv_8= '==' ()
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_4_0());
                    			
                    // InternalFormDSL.g:666:4: ()
                    // InternalFormDSL.g:667:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparisonAccess().getExactlyAction_4_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalFormDSL.g:675:3: (otherlv_10= '!=' () )
                    {
                    // InternalFormDSL.g:675:3: (otherlv_10= '!=' () )
                    // InternalFormDSL.g:676:4: otherlv_10= '!=' ()
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_5_0());
                    			
                    // InternalFormDSL.g:680:4: ()
                    // InternalFormDSL.g:681:5: 
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000007F002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});

}