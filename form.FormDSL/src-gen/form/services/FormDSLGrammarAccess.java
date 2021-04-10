/*
 * generated by Xtext 2.25.0
 */
package form.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class FormDSLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class FormElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "form.FormDSL.Form");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFormAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFormKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cContentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cContentInputParserRuleCall_2_0 = (RuleCall)cContentAssignment_2.eContents().get(0);
		
		//Form:
		//    {Form}"form" content += (Input)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Form}"form" content += (Input)*
		public Group getGroup() { return cGroup; }
		
		//{Form}
		public Action getFormAction_0() { return cFormAction_0; }
		
		//"form"
		public Keyword getFormKeyword_1() { return cFormKeyword_1; }
		
		//content += (Input)*
		public Assignment getContentAssignment_2() { return cContentAssignment_2; }
		
		//(Input)
		public RuleCall getContentInputParserRuleCall_2_0() { return cContentInputParserRuleCall_2_0; }
	}
	public class InputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "form.FormDSL.Input");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeTypeParserRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cExpressionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpressionExpressionParserRuleCall_2_0 = (RuleCall)cExpressionAssignment_2.eContents().get(0);
		
		//Input:
		//    type = Type
		//    name = Name
		//    expression += Expression*
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//type = Type
		//name = Name
		//expression += Expression*
		public Group getGroup() { return cGroup; }
		
		//type = Type
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_0_0() { return cTypeTypeParserRuleCall_0_0; }
		
		//name = Name
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//Name
		public RuleCall getNameNameParserRuleCall_1_0() { return cNameNameParserRuleCall_1_0; }
		
		//expression += Expression*
		public Assignment getExpressionAssignment_2() { return cExpressionAssignment_2; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_2_0() { return cExpressionExpressionParserRuleCall_2_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "form.FormDSL.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cShortTextAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cTextAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final Keyword cTextShortTextKeyword_0_1_0 = (Keyword)cTextAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cGenericAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cTextAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cTextDateKeyword_1_1_0 = (Keyword)cTextAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cGenericAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Assignment cTextAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final Keyword cTextNumberKeyword_2_1_0 = (Keyword)cTextAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cMoneyAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Assignment cTextAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final Keyword cTextMoneyKeyword_3_1_0 = (Keyword)cTextAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Action cGenericAction_4_0 = (Action)cGroup_4.eContents().get(0);
		private final Assignment cTextAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final Keyword cTextEmailKeyword_4_1_0 = (Keyword)cTextAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Action cLongTextAction_5_0 = (Action)cGroup_5.eContents().get(0);
		private final Assignment cTextAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final Keyword cTextLongTextKeyword_5_1_0 = (Keyword)cTextAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Action cStringNumberAction_6_0 = (Action)cGroup_6.eContents().get(0);
		private final Assignment cTextAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final Keyword cTextStringNumberKeyword_6_1_0 = (Keyword)cTextAssignment_6_1.eContents().get(0);
		
		//Type:
		//    {ShortText} text="shortText" |
		//    {Generic} text="date" |
		//    {Generic} text="number" |
		//    {Money} text="money" |
		//    {Generic} text="email" |
		//    {LongText} text="longText" |
		//    {StringNumber} text="stringNumber"
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{ShortText} text="shortText" |
		//{Generic} text="date" |
		//{Generic} text="number" |
		//{Money} text="money" |
		//{Generic} text="email" |
		//{LongText} text="longText" |
		//{StringNumber} text="stringNumber"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{ShortText} text="shortText"
		public Group getGroup_0() { return cGroup_0; }
		
		//{ShortText}
		public Action getShortTextAction_0_0() { return cShortTextAction_0_0; }
		
		//text="shortText"
		public Assignment getTextAssignment_0_1() { return cTextAssignment_0_1; }
		
		//"shortText"
		public Keyword getTextShortTextKeyword_0_1_0() { return cTextShortTextKeyword_0_1_0; }
		
		//{Generic} text="date"
		public Group getGroup_1() { return cGroup_1; }
		
		//{Generic}
		public Action getGenericAction_1_0() { return cGenericAction_1_0; }
		
		//text="date"
		public Assignment getTextAssignment_1_1() { return cTextAssignment_1_1; }
		
		//"date"
		public Keyword getTextDateKeyword_1_1_0() { return cTextDateKeyword_1_1_0; }
		
		//{Generic} text="number"
		public Group getGroup_2() { return cGroup_2; }
		
		//{Generic}
		public Action getGenericAction_2_0() { return cGenericAction_2_0; }
		
		//text="number"
		public Assignment getTextAssignment_2_1() { return cTextAssignment_2_1; }
		
		//"number"
		public Keyword getTextNumberKeyword_2_1_0() { return cTextNumberKeyword_2_1_0; }
		
		//{Money} text="money"
		public Group getGroup_3() { return cGroup_3; }
		
		//{Money}
		public Action getMoneyAction_3_0() { return cMoneyAction_3_0; }
		
		//text="money"
		public Assignment getTextAssignment_3_1() { return cTextAssignment_3_1; }
		
		//"money"
		public Keyword getTextMoneyKeyword_3_1_0() { return cTextMoneyKeyword_3_1_0; }
		
		//{Generic} text="email"
		public Group getGroup_4() { return cGroup_4; }
		
		//{Generic}
		public Action getGenericAction_4_0() { return cGenericAction_4_0; }
		
		//text="email"
		public Assignment getTextAssignment_4_1() { return cTextAssignment_4_1; }
		
		//"email"
		public Keyword getTextEmailKeyword_4_1_0() { return cTextEmailKeyword_4_1_0; }
		
		//{LongText} text="longText"
		public Group getGroup_5() { return cGroup_5; }
		
		//{LongText}
		public Action getLongTextAction_5_0() { return cLongTextAction_5_0; }
		
		//text="longText"
		public Assignment getTextAssignment_5_1() { return cTextAssignment_5_1; }
		
		//"longText"
		public Keyword getTextLongTextKeyword_5_1_0() { return cTextLongTextKeyword_5_1_0; }
		
		//{StringNumber} text="stringNumber"
		public Group getGroup_6() { return cGroup_6; }
		
		//{StringNumber}
		public Action getStringNumberAction_6_0() { return cStringNumberAction_6_0; }
		
		//text="stringNumber"
		public Assignment getTextAssignment_6_1() { return cTextAssignment_6_1; }
		
		//"stringNumber"
		public Keyword getTextStringNumberKeyword_6_1_0() { return cTextStringNumberKeyword_6_1_0; }
	}
	public class NameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "form.FormDSL.Name");
		private final Assignment cTextAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTextSTRINGTerminalRuleCall_0 = (RuleCall)cTextAssignment.eContents().get(0);
		
		//Name:
		//    text = STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//text = STRING
		public Assignment getTextAssignment() { return cTextAssignment; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_0() { return cTextSTRINGTerminalRuleCall_0; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "form.FormDSL.Expression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cOptionalAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cTextAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final Keyword cTextOptionalKeyword_0_1_0 = (Keyword)cTextAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cFocusAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cTextAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cTextFocusKeyword_1_1_0 = (Keyword)cTextAssignment_1_1.eContents().get(0);
		private final RuleCall cExpParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Expression:
		//    {Optional}text="optional" | {Focus}text="focus" | Exp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Optional}text="optional" | {Focus}text="focus" | Exp
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Optional}text="optional"
		public Group getGroup_0() { return cGroup_0; }
		
		//{Optional}
		public Action getOptionalAction_0_0() { return cOptionalAction_0_0; }
		
		//text="optional"
		public Assignment getTextAssignment_0_1() { return cTextAssignment_0_1; }
		
		//"optional"
		public Keyword getTextOptionalKeyword_0_1_0() { return cTextOptionalKeyword_0_1_0; }
		
		//{Focus}text="focus"
		public Group getGroup_1() { return cGroup_1; }
		
		//{Focus}
		public Action getFocusAction_1_0() { return cFocusAction_1_0; }
		
		//text="focus"
		public Assignment getTextAssignment_1_1() { return cTextAssignment_1_1; }
		
		//"focus"
		public Keyword getTextFocusKeyword_1_1_0() { return cTextFocusKeyword_1_1_0; }
		
		//Exp
		public RuleCall getExpParserRuleCall_2() { return cExpParserRuleCall_2; }
	}
	public class ExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "form.FormDSL.Exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Group cGroup_0_0 = (Group)cAlternatives_0.eContents().get(0);
		private final Action cIsAction_0_0_0 = (Action)cGroup_0_0.eContents().get(0);
		private final Assignment cTextAssignment_0_0_1 = (Assignment)cGroup_0_0.eContents().get(1);
		private final Keyword cTextIsKeyword_0_0_1_0 = (Keyword)cTextAssignment_0_0_1.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final Action cLengthAction_0_1_0 = (Action)cGroup_0_1.eContents().get(0);
		private final Assignment cTextAssignment_0_1_1 = (Assignment)cGroup_0_1.eContents().get(1);
		private final Keyword cTextLengthKeyword_0_1_1_0 = (Keyword)cTextAssignment_0_1_1.eContents().get(0);
		private final Assignment cCompAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCompComparisonParserRuleCall_1_0 = (RuleCall)cCompAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueINTTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Exp:
		//    ({Is}text="is" | {Length}text="length") comp=Comparison value=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//({Is}text="is" | {Length}text="length") comp=Comparison value=INT
		public Group getGroup() { return cGroup; }
		
		//({Is}text="is" | {Length}text="length")
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//{Is}text="is"
		public Group getGroup_0_0() { return cGroup_0_0; }
		
		//{Is}
		public Action getIsAction_0_0_0() { return cIsAction_0_0_0; }
		
		//text="is"
		public Assignment getTextAssignment_0_0_1() { return cTextAssignment_0_0_1; }
		
		//"is"
		public Keyword getTextIsKeyword_0_0_1_0() { return cTextIsKeyword_0_0_1_0; }
		
		//{Length}text="length"
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//{Length}
		public Action getLengthAction_0_1_0() { return cLengthAction_0_1_0; }
		
		//text="length"
		public Assignment getTextAssignment_0_1_1() { return cTextAssignment_0_1_1; }
		
		//"length"
		public Keyword getTextLengthKeyword_0_1_1_0() { return cTextLengthKeyword_0_1_1_0; }
		
		//comp=Comparison
		public Assignment getCompAssignment_1() { return cCompAssignment_1; }
		
		//Comparison
		public RuleCall getCompComparisonParserRuleCall_1_0() { return cCompComparisonParserRuleCall_1_0; }
		
		//value=INT
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_2_0() { return cValueINTTerminalRuleCall_2_0; }
	}
	public class ComparisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "form.FormDSL.Comparison");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLessThanSignKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Action cLessThanAction_0_1 = (Action)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Action cGreaterThanAction_1_1 = (Action)cGroup_1.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cLessThanSignEqualsSignKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Action cLessThaninclusiveAction_2_1 = (Action)cGroup_2.eContents().get(1);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cGreaterThanSignEqualsSignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Action cGreaterThanInclusiveAction_3_1 = (Action)cGroup_3.eContents().get(1);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cEqualsSignEqualsSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Action cExactlyAction_4_1 = (Action)cGroup_4.eContents().get(1);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cExclamationMarkEqualsSignKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Action cNotAction_5_1 = (Action)cGroup_5.eContents().get(1);
		
		//Comparison:
		//    "<" {LessThan} |
		//    ">" {GreaterThan} |
		//    "<=" {LessThaninclusive} |
		//    ">=" {GreaterThanInclusive} |
		//    "==" {Exactly} |
		//    "!=" {Not}
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//"<" {LessThan} |
		//">" {GreaterThan} |
		//"<=" {LessThaninclusive} |
		//">=" {GreaterThanInclusive} |
		//"==" {Exactly} |
		//"!=" {Not}
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"<" {LessThan}
		public Group getGroup_0() { return cGroup_0; }
		
		//"<"
		public Keyword getLessThanSignKeyword_0_0() { return cLessThanSignKeyword_0_0; }
		
		//{LessThan}
		public Action getLessThanAction_0_1() { return cLessThanAction_0_1; }
		
		//">" {GreaterThan}
		public Group getGroup_1() { return cGroup_1; }
		
		//">"
		public Keyword getGreaterThanSignKeyword_1_0() { return cGreaterThanSignKeyword_1_0; }
		
		//{GreaterThan}
		public Action getGreaterThanAction_1_1() { return cGreaterThanAction_1_1; }
		
		//"<=" {LessThaninclusive}
		public Group getGroup_2() { return cGroup_2; }
		
		//"<="
		public Keyword getLessThanSignEqualsSignKeyword_2_0() { return cLessThanSignEqualsSignKeyword_2_0; }
		
		//{LessThaninclusive}
		public Action getLessThaninclusiveAction_2_1() { return cLessThaninclusiveAction_2_1; }
		
		//">=" {GreaterThanInclusive}
		public Group getGroup_3() { return cGroup_3; }
		
		//">="
		public Keyword getGreaterThanSignEqualsSignKeyword_3_0() { return cGreaterThanSignEqualsSignKeyword_3_0; }
		
		//{GreaterThanInclusive}
		public Action getGreaterThanInclusiveAction_3_1() { return cGreaterThanInclusiveAction_3_1; }
		
		//"==" {Exactly}
		public Group getGroup_4() { return cGroup_4; }
		
		//"=="
		public Keyword getEqualsSignEqualsSignKeyword_4_0() { return cEqualsSignEqualsSignKeyword_4_0; }
		
		//{Exactly}
		public Action getExactlyAction_4_1() { return cExactlyAction_4_1; }
		
		//"!=" {Not}
		public Group getGroup_5() { return cGroup_5; }
		
		//"!="
		public Keyword getExclamationMarkEqualsSignKeyword_5_0() { return cExclamationMarkEqualsSignKeyword_5_0; }
		
		//{Not}
		public Action getNotAction_5_1() { return cNotAction_5_1; }
	}
	
	
	private final FormElements pForm;
	private final InputElements pInput;
	private final TypeElements pType;
	private final NameElements pName;
	private final ExpressionElements pExpression;
	private final ExpElements pExp;
	private final ComparisonElements pComparison;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FormDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pForm = new FormElements();
		this.pInput = new InputElements();
		this.pType = new TypeElements();
		this.pName = new NameElements();
		this.pExpression = new ExpressionElements();
		this.pExp = new ExpElements();
		this.pComparison = new ComparisonElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("form.FormDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Form:
	//    {Form}"form" content += (Input)*
	//;
	public FormElements getFormAccess() {
		return pForm;
	}
	
	public ParserRule getFormRule() {
		return getFormAccess().getRule();
	}
	
	//Input:
	//    type = Type
	//    name = Name
	//    expression += Expression*
	//    ;
	public InputElements getInputAccess() {
		return pInput;
	}
	
	public ParserRule getInputRule() {
		return getInputAccess().getRule();
	}
	
	//Type:
	//    {ShortText} text="shortText" |
	//    {Generic} text="date" |
	//    {Generic} text="number" |
	//    {Money} text="money" |
	//    {Generic} text="email" |
	//    {LongText} text="longText" |
	//    {StringNumber} text="stringNumber"
	//;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//Name:
	//    text = STRING
	//;
	public NameElements getNameAccess() {
		return pName;
	}
	
	public ParserRule getNameRule() {
		return getNameAccess().getRule();
	}
	
	//Expression:
	//    {Optional}text="optional" | {Focus}text="focus" | Exp
	//;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//Exp:
	//    ({Is}text="is" | {Length}text="length") comp=Comparison value=INT
	//;
	public ExpElements getExpAccess() {
		return pExp;
	}
	
	public ParserRule getExpRule() {
		return getExpAccess().getRule();
	}
	
	//Comparison:
	//    "<" {LessThan} |
	//    ">" {GreaterThan} |
	//    "<=" {LessThaninclusive} |
	//    ">=" {GreaterThanInclusive} |
	//    "==" {Exactly} |
	//    "!=" {Not}
	//;
	public ComparisonElements getComparisonAccess() {
		return pComparison;
	}
	
	public ParserRule getComparisonRule() {
		return getComparisonAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
