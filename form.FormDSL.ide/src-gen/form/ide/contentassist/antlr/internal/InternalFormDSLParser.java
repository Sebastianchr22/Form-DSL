package form.ide.contentassist.antlr.internal;

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
import form.services.FormDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFormDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'form'", "'shortText'", "'date'", "'number'", "'money'", "'email'", "'longText'", "'stringNumber'", "'optional'", "'focus'", "'require'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
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

    	public void setGrammarAccess(FormDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleForm"
    // InternalFormDSL.g:53:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // InternalFormDSL.g:54:1: ( ruleForm EOF )
            // InternalFormDSL.g:55:1: ruleForm EOF
            {
             before(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getFormRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalFormDSL.g:62:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:66:2: ( ( ( rule__Form__Group__0 ) ) )
            // InternalFormDSL.g:67:2: ( ( rule__Form__Group__0 ) )
            {
            // InternalFormDSL.g:67:2: ( ( rule__Form__Group__0 ) )
            // InternalFormDSL.g:68:3: ( rule__Form__Group__0 )
            {
             before(grammarAccess.getFormAccess().getGroup()); 
            // InternalFormDSL.g:69:3: ( rule__Form__Group__0 )
            // InternalFormDSL.g:69:4: rule__Form__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleInput"
    // InternalFormDSL.g:78:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalFormDSL.g:79:1: ( ruleInput EOF )
            // InternalFormDSL.g:80:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalFormDSL.g:87:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:91:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalFormDSL.g:92:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalFormDSL.g:92:2: ( ( rule__Input__Group__0 ) )
            // InternalFormDSL.g:93:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalFormDSL.g:94:3: ( rule__Input__Group__0 )
            // InternalFormDSL.g:94:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleType"
    // InternalFormDSL.g:103:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalFormDSL.g:104:1: ( ruleType EOF )
            // InternalFormDSL.g:105:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalFormDSL.g:112:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:116:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalFormDSL.g:117:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalFormDSL.g:117:2: ( ( rule__Type__Alternatives ) )
            // InternalFormDSL.g:118:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalFormDSL.g:119:3: ( rule__Type__Alternatives )
            // InternalFormDSL.g:119:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleName"
    // InternalFormDSL.g:128:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalFormDSL.g:129:1: ( ruleName EOF )
            // InternalFormDSL.g:130:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalFormDSL.g:137:1: ruleName : ( ( rule__Name__TextAssignment ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:141:2: ( ( ( rule__Name__TextAssignment ) ) )
            // InternalFormDSL.g:142:2: ( ( rule__Name__TextAssignment ) )
            {
            // InternalFormDSL.g:142:2: ( ( rule__Name__TextAssignment ) )
            // InternalFormDSL.g:143:3: ( rule__Name__TextAssignment )
            {
             before(grammarAccess.getNameAccess().getTextAssignment()); 
            // InternalFormDSL.g:144:3: ( rule__Name__TextAssignment )
            // InternalFormDSL.g:144:4: rule__Name__TextAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Name__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleExpression"
    // InternalFormDSL.g:153:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalFormDSL.g:154:1: ( ruleExpression EOF )
            // InternalFormDSL.g:155:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalFormDSL.g:162:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:166:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalFormDSL.g:167:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalFormDSL.g:167:2: ( ( rule__Expression__Alternatives ) )
            // InternalFormDSL.g:168:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalFormDSL.g:169:3: ( rule__Expression__Alternatives )
            // InternalFormDSL.g:169:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalFormDSL.g:177:1: rule__Type__Alternatives : ( ( ( rule__Type__TextAssignment_0 ) ) | ( ( rule__Type__TextAssignment_1 ) ) | ( ( rule__Type__TextAssignment_2 ) ) | ( ( rule__Type__TextAssignment_3 ) ) | ( ( rule__Type__TextAssignment_4 ) ) | ( ( rule__Type__TextAssignment_5 ) ) | ( ( rule__Type__TextAssignment_6 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:181:1: ( ( ( rule__Type__TextAssignment_0 ) ) | ( ( rule__Type__TextAssignment_1 ) ) | ( ( rule__Type__TextAssignment_2 ) ) | ( ( rule__Type__TextAssignment_3 ) ) | ( ( rule__Type__TextAssignment_4 ) ) | ( ( rule__Type__TextAssignment_5 ) ) | ( ( rule__Type__TextAssignment_6 ) ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            case 16:
                {
                alt1=5;
                }
                break;
            case 17:
                {
                alt1=6;
                }
                break;
            case 18:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalFormDSL.g:182:2: ( ( rule__Type__TextAssignment_0 ) )
                    {
                    // InternalFormDSL.g:182:2: ( ( rule__Type__TextAssignment_0 ) )
                    // InternalFormDSL.g:183:3: ( rule__Type__TextAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getTextAssignment_0()); 
                    // InternalFormDSL.g:184:3: ( rule__Type__TextAssignment_0 )
                    // InternalFormDSL.g:184:4: rule__Type__TextAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TextAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTextAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFormDSL.g:188:2: ( ( rule__Type__TextAssignment_1 ) )
                    {
                    // InternalFormDSL.g:188:2: ( ( rule__Type__TextAssignment_1 ) )
                    // InternalFormDSL.g:189:3: ( rule__Type__TextAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getTextAssignment_1()); 
                    // InternalFormDSL.g:190:3: ( rule__Type__TextAssignment_1 )
                    // InternalFormDSL.g:190:4: rule__Type__TextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TextAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTextAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFormDSL.g:194:2: ( ( rule__Type__TextAssignment_2 ) )
                    {
                    // InternalFormDSL.g:194:2: ( ( rule__Type__TextAssignment_2 ) )
                    // InternalFormDSL.g:195:3: ( rule__Type__TextAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getTextAssignment_2()); 
                    // InternalFormDSL.g:196:3: ( rule__Type__TextAssignment_2 )
                    // InternalFormDSL.g:196:4: rule__Type__TextAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TextAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTextAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFormDSL.g:200:2: ( ( rule__Type__TextAssignment_3 ) )
                    {
                    // InternalFormDSL.g:200:2: ( ( rule__Type__TextAssignment_3 ) )
                    // InternalFormDSL.g:201:3: ( rule__Type__TextAssignment_3 )
                    {
                     before(grammarAccess.getTypeAccess().getTextAssignment_3()); 
                    // InternalFormDSL.g:202:3: ( rule__Type__TextAssignment_3 )
                    // InternalFormDSL.g:202:4: rule__Type__TextAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TextAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTextAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFormDSL.g:206:2: ( ( rule__Type__TextAssignment_4 ) )
                    {
                    // InternalFormDSL.g:206:2: ( ( rule__Type__TextAssignment_4 ) )
                    // InternalFormDSL.g:207:3: ( rule__Type__TextAssignment_4 )
                    {
                     before(grammarAccess.getTypeAccess().getTextAssignment_4()); 
                    // InternalFormDSL.g:208:3: ( rule__Type__TextAssignment_4 )
                    // InternalFormDSL.g:208:4: rule__Type__TextAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TextAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTextAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalFormDSL.g:212:2: ( ( rule__Type__TextAssignment_5 ) )
                    {
                    // InternalFormDSL.g:212:2: ( ( rule__Type__TextAssignment_5 ) )
                    // InternalFormDSL.g:213:3: ( rule__Type__TextAssignment_5 )
                    {
                     before(grammarAccess.getTypeAccess().getTextAssignment_5()); 
                    // InternalFormDSL.g:214:3: ( rule__Type__TextAssignment_5 )
                    // InternalFormDSL.g:214:4: rule__Type__TextAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TextAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTextAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalFormDSL.g:218:2: ( ( rule__Type__TextAssignment_6 ) )
                    {
                    // InternalFormDSL.g:218:2: ( ( rule__Type__TextAssignment_6 ) )
                    // InternalFormDSL.g:219:3: ( rule__Type__TextAssignment_6 )
                    {
                     before(grammarAccess.getTypeAccess().getTextAssignment_6()); 
                    // InternalFormDSL.g:220:3: ( rule__Type__TextAssignment_6 )
                    // InternalFormDSL.g:220:4: rule__Type__TextAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TextAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTextAssignment_6()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalFormDSL.g:228:1: rule__Expression__Alternatives : ( ( ( rule__Expression__TextAssignment_0 ) ) | ( ( rule__Expression__TextAssignment_1 ) ) | ( ( rule__Expression__TextAssignment_2 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:232:1: ( ( ( rule__Expression__TextAssignment_0 ) ) | ( ( rule__Expression__TextAssignment_1 ) ) | ( ( rule__Expression__TextAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFormDSL.g:233:2: ( ( rule__Expression__TextAssignment_0 ) )
                    {
                    // InternalFormDSL.g:233:2: ( ( rule__Expression__TextAssignment_0 ) )
                    // InternalFormDSL.g:234:3: ( rule__Expression__TextAssignment_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getTextAssignment_0()); 
                    // InternalFormDSL.g:235:3: ( rule__Expression__TextAssignment_0 )
                    // InternalFormDSL.g:235:4: rule__Expression__TextAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__TextAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getTextAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFormDSL.g:239:2: ( ( rule__Expression__TextAssignment_1 ) )
                    {
                    // InternalFormDSL.g:239:2: ( ( rule__Expression__TextAssignment_1 ) )
                    // InternalFormDSL.g:240:3: ( rule__Expression__TextAssignment_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getTextAssignment_1()); 
                    // InternalFormDSL.g:241:3: ( rule__Expression__TextAssignment_1 )
                    // InternalFormDSL.g:241:4: rule__Expression__TextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__TextAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getTextAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFormDSL.g:245:2: ( ( rule__Expression__TextAssignment_2 ) )
                    {
                    // InternalFormDSL.g:245:2: ( ( rule__Expression__TextAssignment_2 ) )
                    // InternalFormDSL.g:246:3: ( rule__Expression__TextAssignment_2 )
                    {
                     before(grammarAccess.getExpressionAccess().getTextAssignment_2()); 
                    // InternalFormDSL.g:247:3: ( rule__Expression__TextAssignment_2 )
                    // InternalFormDSL.g:247:4: rule__Expression__TextAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__TextAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getTextAssignment_2()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Form__Group__0"
    // InternalFormDSL.g:255:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:259:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // InternalFormDSL.g:260:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Form__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0"


    // $ANTLR start "rule__Form__Group__0__Impl"
    // InternalFormDSL.g:267:1: rule__Form__Group__0__Impl : ( () ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:271:1: ( ( () ) )
            // InternalFormDSL.g:272:1: ( () )
            {
            // InternalFormDSL.g:272:1: ( () )
            // InternalFormDSL.g:273:2: ()
            {
             before(grammarAccess.getFormAccess().getFormAction_0()); 
            // InternalFormDSL.g:274:2: ()
            // InternalFormDSL.g:274:3: 
            {
            }

             after(grammarAccess.getFormAccess().getFormAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0__Impl"


    // $ANTLR start "rule__Form__Group__1"
    // InternalFormDSL.g:282:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:286:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // InternalFormDSL.g:287:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Form__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1"


    // $ANTLR start "rule__Form__Group__1__Impl"
    // InternalFormDSL.g:294:1: rule__Form__Group__1__Impl : ( 'form' ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:298:1: ( ( 'form' ) )
            // InternalFormDSL.g:299:1: ( 'form' )
            {
            // InternalFormDSL.g:299:1: ( 'form' )
            // InternalFormDSL.g:300:2: 'form'
            {
             before(grammarAccess.getFormAccess().getFormKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getFormKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1__Impl"


    // $ANTLR start "rule__Form__Group__2"
    // InternalFormDSL.g:309:1: rule__Form__Group__2 : rule__Form__Group__2__Impl ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:313:1: ( rule__Form__Group__2__Impl )
            // InternalFormDSL.g:314:2: rule__Form__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2"


    // $ANTLR start "rule__Form__Group__2__Impl"
    // InternalFormDSL.g:320:1: rule__Form__Group__2__Impl : ( ( rule__Form__ContentAssignment_2 )* ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:324:1: ( ( ( rule__Form__ContentAssignment_2 )* ) )
            // InternalFormDSL.g:325:1: ( ( rule__Form__ContentAssignment_2 )* )
            {
            // InternalFormDSL.g:325:1: ( ( rule__Form__ContentAssignment_2 )* )
            // InternalFormDSL.g:326:2: ( rule__Form__ContentAssignment_2 )*
            {
             before(grammarAccess.getFormAccess().getContentAssignment_2()); 
            // InternalFormDSL.g:327:2: ( rule__Form__ContentAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=12 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFormDSL.g:327:3: rule__Form__ContentAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Form__ContentAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getFormAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalFormDSL.g:336:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:340:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalFormDSL.g:341:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalFormDSL.g:348:1: rule__Input__Group__0__Impl : ( ( rule__Input__TypeAssignment_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:352:1: ( ( ( rule__Input__TypeAssignment_0 ) ) )
            // InternalFormDSL.g:353:1: ( ( rule__Input__TypeAssignment_0 ) )
            {
            // InternalFormDSL.g:353:1: ( ( rule__Input__TypeAssignment_0 ) )
            // InternalFormDSL.g:354:2: ( rule__Input__TypeAssignment_0 )
            {
             before(grammarAccess.getInputAccess().getTypeAssignment_0()); 
            // InternalFormDSL.g:355:2: ( rule__Input__TypeAssignment_0 )
            // InternalFormDSL.g:355:3: rule__Input__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Input__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalFormDSL.g:363:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:367:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalFormDSL.g:368:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalFormDSL.g:375:1: rule__Input__Group__1__Impl : ( ( rule__Input__NameAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:379:1: ( ( ( rule__Input__NameAssignment_1 ) ) )
            // InternalFormDSL.g:380:1: ( ( rule__Input__NameAssignment_1 ) )
            {
            // InternalFormDSL.g:380:1: ( ( rule__Input__NameAssignment_1 ) )
            // InternalFormDSL.g:381:2: ( rule__Input__NameAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_1()); 
            // InternalFormDSL.g:382:2: ( rule__Input__NameAssignment_1 )
            // InternalFormDSL.g:382:3: rule__Input__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalFormDSL.g:390:1: rule__Input__Group__2 : rule__Input__Group__2__Impl ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:394:1: ( rule__Input__Group__2__Impl )
            // InternalFormDSL.g:395:2: rule__Input__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalFormDSL.g:401:1: rule__Input__Group__2__Impl : ( ( rule__Input__ExpressionAssignment_2 )? ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:405:1: ( ( ( rule__Input__ExpressionAssignment_2 )? ) )
            // InternalFormDSL.g:406:1: ( ( rule__Input__ExpressionAssignment_2 )? )
            {
            // InternalFormDSL.g:406:1: ( ( rule__Input__ExpressionAssignment_2 )? )
            // InternalFormDSL.g:407:2: ( rule__Input__ExpressionAssignment_2 )?
            {
             before(grammarAccess.getInputAccess().getExpressionAssignment_2()); 
            // InternalFormDSL.g:408:2: ( rule__Input__ExpressionAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=19 && LA4_0<=21)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFormDSL.g:408:3: rule__Input__ExpressionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Input__ExpressionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Form__ContentAssignment_2"
    // InternalFormDSL.g:417:1: rule__Form__ContentAssignment_2 : ( ruleInput ) ;
    public final void rule__Form__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:421:1: ( ( ruleInput ) )
            // InternalFormDSL.g:422:2: ( ruleInput )
            {
            // InternalFormDSL.g:422:2: ( ruleInput )
            // InternalFormDSL.g:423:3: ruleInput
            {
             before(grammarAccess.getFormAccess().getContentInputParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getFormAccess().getContentInputParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__ContentAssignment_2"


    // $ANTLR start "rule__Input__TypeAssignment_0"
    // InternalFormDSL.g:432:1: rule__Input__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Input__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:436:1: ( ( ruleType ) )
            // InternalFormDSL.g:437:2: ( ruleType )
            {
            // InternalFormDSL.g:437:2: ( ruleType )
            // InternalFormDSL.g:438:3: ruleType
            {
             before(grammarAccess.getInputAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getInputAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__TypeAssignment_0"


    // $ANTLR start "rule__Input__NameAssignment_1"
    // InternalFormDSL.g:447:1: rule__Input__NameAssignment_1 : ( ruleName ) ;
    public final void rule__Input__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:451:1: ( ( ruleName ) )
            // InternalFormDSL.g:452:2: ( ruleName )
            {
            // InternalFormDSL.g:452:2: ( ruleName )
            // InternalFormDSL.g:453:3: ruleName
            {
             before(grammarAccess.getInputAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getInputAccess().getNameNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__NameAssignment_1"


    // $ANTLR start "rule__Input__ExpressionAssignment_2"
    // InternalFormDSL.g:462:1: rule__Input__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Input__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:466:1: ( ( ruleExpression ) )
            // InternalFormDSL.g:467:2: ( ruleExpression )
            {
            // InternalFormDSL.g:467:2: ( ruleExpression )
            // InternalFormDSL.g:468:3: ruleExpression
            {
             before(grammarAccess.getInputAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getInputAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ExpressionAssignment_2"


    // $ANTLR start "rule__Type__TextAssignment_0"
    // InternalFormDSL.g:477:1: rule__Type__TextAssignment_0 : ( ( 'shortText' ) ) ;
    public final void rule__Type__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:481:1: ( ( ( 'shortText' ) ) )
            // InternalFormDSL.g:482:2: ( ( 'shortText' ) )
            {
            // InternalFormDSL.g:482:2: ( ( 'shortText' ) )
            // InternalFormDSL.g:483:3: ( 'shortText' )
            {
             before(grammarAccess.getTypeAccess().getTextShortTextKeyword_0_0()); 
            // InternalFormDSL.g:484:3: ( 'shortText' )
            // InternalFormDSL.g:485:4: 'shortText'
            {
             before(grammarAccess.getTypeAccess().getTextShortTextKeyword_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTextShortTextKeyword_0_0()); 

            }

             after(grammarAccess.getTypeAccess().getTextShortTextKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TextAssignment_0"


    // $ANTLR start "rule__Type__TextAssignment_1"
    // InternalFormDSL.g:496:1: rule__Type__TextAssignment_1 : ( ( 'date' ) ) ;
    public final void rule__Type__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:500:1: ( ( ( 'date' ) ) )
            // InternalFormDSL.g:501:2: ( ( 'date' ) )
            {
            // InternalFormDSL.g:501:2: ( ( 'date' ) )
            // InternalFormDSL.g:502:3: ( 'date' )
            {
             before(grammarAccess.getTypeAccess().getTextDateKeyword_1_0()); 
            // InternalFormDSL.g:503:3: ( 'date' )
            // InternalFormDSL.g:504:4: 'date'
            {
             before(grammarAccess.getTypeAccess().getTextDateKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTextDateKeyword_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getTextDateKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TextAssignment_1"


    // $ANTLR start "rule__Type__TextAssignment_2"
    // InternalFormDSL.g:515:1: rule__Type__TextAssignment_2 : ( ( 'number' ) ) ;
    public final void rule__Type__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:519:1: ( ( ( 'number' ) ) )
            // InternalFormDSL.g:520:2: ( ( 'number' ) )
            {
            // InternalFormDSL.g:520:2: ( ( 'number' ) )
            // InternalFormDSL.g:521:3: ( 'number' )
            {
             before(grammarAccess.getTypeAccess().getTextNumberKeyword_2_0()); 
            // InternalFormDSL.g:522:3: ( 'number' )
            // InternalFormDSL.g:523:4: 'number'
            {
             before(grammarAccess.getTypeAccess().getTextNumberKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTextNumberKeyword_2_0()); 

            }

             after(grammarAccess.getTypeAccess().getTextNumberKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TextAssignment_2"


    // $ANTLR start "rule__Type__TextAssignment_3"
    // InternalFormDSL.g:534:1: rule__Type__TextAssignment_3 : ( ( 'money' ) ) ;
    public final void rule__Type__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:538:1: ( ( ( 'money' ) ) )
            // InternalFormDSL.g:539:2: ( ( 'money' ) )
            {
            // InternalFormDSL.g:539:2: ( ( 'money' ) )
            // InternalFormDSL.g:540:3: ( 'money' )
            {
             before(grammarAccess.getTypeAccess().getTextMoneyKeyword_3_0()); 
            // InternalFormDSL.g:541:3: ( 'money' )
            // InternalFormDSL.g:542:4: 'money'
            {
             before(grammarAccess.getTypeAccess().getTextMoneyKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTextMoneyKeyword_3_0()); 

            }

             after(grammarAccess.getTypeAccess().getTextMoneyKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TextAssignment_3"


    // $ANTLR start "rule__Type__TextAssignment_4"
    // InternalFormDSL.g:553:1: rule__Type__TextAssignment_4 : ( ( 'email' ) ) ;
    public final void rule__Type__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:557:1: ( ( ( 'email' ) ) )
            // InternalFormDSL.g:558:2: ( ( 'email' ) )
            {
            // InternalFormDSL.g:558:2: ( ( 'email' ) )
            // InternalFormDSL.g:559:3: ( 'email' )
            {
             before(grammarAccess.getTypeAccess().getTextEmailKeyword_4_0()); 
            // InternalFormDSL.g:560:3: ( 'email' )
            // InternalFormDSL.g:561:4: 'email'
            {
             before(grammarAccess.getTypeAccess().getTextEmailKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTextEmailKeyword_4_0()); 

            }

             after(grammarAccess.getTypeAccess().getTextEmailKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TextAssignment_4"


    // $ANTLR start "rule__Type__TextAssignment_5"
    // InternalFormDSL.g:572:1: rule__Type__TextAssignment_5 : ( ( 'longText' ) ) ;
    public final void rule__Type__TextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:576:1: ( ( ( 'longText' ) ) )
            // InternalFormDSL.g:577:2: ( ( 'longText' ) )
            {
            // InternalFormDSL.g:577:2: ( ( 'longText' ) )
            // InternalFormDSL.g:578:3: ( 'longText' )
            {
             before(grammarAccess.getTypeAccess().getTextLongTextKeyword_5_0()); 
            // InternalFormDSL.g:579:3: ( 'longText' )
            // InternalFormDSL.g:580:4: 'longText'
            {
             before(grammarAccess.getTypeAccess().getTextLongTextKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTextLongTextKeyword_5_0()); 

            }

             after(grammarAccess.getTypeAccess().getTextLongTextKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TextAssignment_5"


    // $ANTLR start "rule__Type__TextAssignment_6"
    // InternalFormDSL.g:591:1: rule__Type__TextAssignment_6 : ( ( 'stringNumber' ) ) ;
    public final void rule__Type__TextAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:595:1: ( ( ( 'stringNumber' ) ) )
            // InternalFormDSL.g:596:2: ( ( 'stringNumber' ) )
            {
            // InternalFormDSL.g:596:2: ( ( 'stringNumber' ) )
            // InternalFormDSL.g:597:3: ( 'stringNumber' )
            {
             before(grammarAccess.getTypeAccess().getTextStringNumberKeyword_6_0()); 
            // InternalFormDSL.g:598:3: ( 'stringNumber' )
            // InternalFormDSL.g:599:4: 'stringNumber'
            {
             before(grammarAccess.getTypeAccess().getTextStringNumberKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTextStringNumberKeyword_6_0()); 

            }

             after(grammarAccess.getTypeAccess().getTextStringNumberKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TextAssignment_6"


    // $ANTLR start "rule__Name__TextAssignment"
    // InternalFormDSL.g:610:1: rule__Name__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Name__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:614:1: ( ( RULE_STRING ) )
            // InternalFormDSL.g:615:2: ( RULE_STRING )
            {
            // InternalFormDSL.g:615:2: ( RULE_STRING )
            // InternalFormDSL.g:616:3: RULE_STRING
            {
             before(grammarAccess.getNameAccess().getTextSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getTextSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__TextAssignment"


    // $ANTLR start "rule__Expression__TextAssignment_0"
    // InternalFormDSL.g:625:1: rule__Expression__TextAssignment_0 : ( ( 'optional' ) ) ;
    public final void rule__Expression__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:629:1: ( ( ( 'optional' ) ) )
            // InternalFormDSL.g:630:2: ( ( 'optional' ) )
            {
            // InternalFormDSL.g:630:2: ( ( 'optional' ) )
            // InternalFormDSL.g:631:3: ( 'optional' )
            {
             before(grammarAccess.getExpressionAccess().getTextOptionalKeyword_0_0()); 
            // InternalFormDSL.g:632:3: ( 'optional' )
            // InternalFormDSL.g:633:4: 'optional'
            {
             before(grammarAccess.getExpressionAccess().getTextOptionalKeyword_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getTextOptionalKeyword_0_0()); 

            }

             after(grammarAccess.getExpressionAccess().getTextOptionalKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__TextAssignment_0"


    // $ANTLR start "rule__Expression__TextAssignment_1"
    // InternalFormDSL.g:644:1: rule__Expression__TextAssignment_1 : ( ( 'focus' ) ) ;
    public final void rule__Expression__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:648:1: ( ( ( 'focus' ) ) )
            // InternalFormDSL.g:649:2: ( ( 'focus' ) )
            {
            // InternalFormDSL.g:649:2: ( ( 'focus' ) )
            // InternalFormDSL.g:650:3: ( 'focus' )
            {
             before(grammarAccess.getExpressionAccess().getTextFocusKeyword_1_0()); 
            // InternalFormDSL.g:651:3: ( 'focus' )
            // InternalFormDSL.g:652:4: 'focus'
            {
             before(grammarAccess.getExpressionAccess().getTextFocusKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getTextFocusKeyword_1_0()); 

            }

             after(grammarAccess.getExpressionAccess().getTextFocusKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__TextAssignment_1"


    // $ANTLR start "rule__Expression__TextAssignment_2"
    // InternalFormDSL.g:663:1: rule__Expression__TextAssignment_2 : ( ( 'require' ) ) ;
    public final void rule__Expression__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormDSL.g:667:1: ( ( ( 'require' ) ) )
            // InternalFormDSL.g:668:2: ( ( 'require' ) )
            {
            // InternalFormDSL.g:668:2: ( ( 'require' ) )
            // InternalFormDSL.g:669:3: ( 'require' )
            {
             before(grammarAccess.getExpressionAccess().getTextRequireKeyword_2_0()); 
            // InternalFormDSL.g:670:3: ( 'require' )
            // InternalFormDSL.g:671:4: 'require'
            {
             before(grammarAccess.getExpressionAccess().getTextRequireKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getTextRequireKeyword_2_0()); 

            }

             after(grammarAccess.getExpressionAccess().getTextRequireKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__TextAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000007F002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000380000L});

}