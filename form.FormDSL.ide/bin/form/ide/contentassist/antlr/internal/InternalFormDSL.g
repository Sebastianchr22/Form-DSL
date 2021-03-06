/*
 * generated by Xtext 2.24.0
 */
grammar InternalFormDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package form.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleForm
entryRuleForm
:
{ before(grammarAccess.getFormRule()); }
	 ruleForm
{ after(grammarAccess.getFormRule()); } 
	 EOF 
;

// Rule Form
ruleForm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFormAccess().getGroup()); }
		(rule__Form__Group__0)
		{ after(grammarAccess.getFormAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInput
entryRuleInput
:
{ before(grammarAccess.getInputRule()); }
	 ruleInput
{ after(grammarAccess.getInputRule()); } 
	 EOF 
;

// Rule Input
ruleInput 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInputAccess().getGroup()); }
		(rule__Input__Group__0)
		{ after(grammarAccess.getInputAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleName
entryRuleName
:
{ before(grammarAccess.getNameRule()); }
	 ruleName
{ after(grammarAccess.getNameRule()); } 
	 EOF 
;

// Rule Name
ruleName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNameAccess().getTextAssignment()); }
		(rule__Name__TextAssignment)
		{ after(grammarAccess.getNameAccess().getTextAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getAlternatives()); }
		(rule__Expression__Alternatives)
		{ after(grammarAccess.getExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTextAssignment_0()); }
		(rule__Type__TextAssignment_0)
		{ after(grammarAccess.getTypeAccess().getTextAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getTextAssignment_1()); }
		(rule__Type__TextAssignment_1)
		{ after(grammarAccess.getTypeAccess().getTextAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getTextAssignment_2()); }
		(rule__Type__TextAssignment_2)
		{ after(grammarAccess.getTypeAccess().getTextAssignment_2()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getTextAssignment_3()); }
		(rule__Type__TextAssignment_3)
		{ after(grammarAccess.getTypeAccess().getTextAssignment_3()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getTextAssignment_4()); }
		(rule__Type__TextAssignment_4)
		{ after(grammarAccess.getTypeAccess().getTextAssignment_4()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getTextAssignment_5()); }
		(rule__Type__TextAssignment_5)
		{ after(grammarAccess.getTypeAccess().getTextAssignment_5()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getTextAssignment_6()); }
		(rule__Type__TextAssignment_6)
		{ after(grammarAccess.getTypeAccess().getTextAssignment_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getTextAssignment_0()); }
		(rule__Expression__TextAssignment_0)
		{ after(grammarAccess.getExpressionAccess().getTextAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getTextAssignment_1()); }
		(rule__Expression__TextAssignment_1)
		{ after(grammarAccess.getExpressionAccess().getTextAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getTextAssignment_2()); }
		(rule__Expression__TextAssignment_2)
		{ after(grammarAccess.getExpressionAccess().getTextAssignment_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Form__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Form__Group__0__Impl
	rule__Form__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Form__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormAccess().getFormAction_0()); }
	()
	{ after(grammarAccess.getFormAccess().getFormAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Form__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Form__Group__1__Impl
	rule__Form__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Form__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormAccess().getFormKeyword_1()); }
	'form'
	{ after(grammarAccess.getFormAccess().getFormKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Form__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Form__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Form__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormAccess().getContentAssignment_2()); }
	(rule__Form__ContentAssignment_2)*
	{ after(grammarAccess.getFormAccess().getContentAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Input__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Input__Group__0__Impl
	rule__Input__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputAccess().getTypeAssignment_0()); }
	(rule__Input__TypeAssignment_0)
	{ after(grammarAccess.getInputAccess().getTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Input__Group__1__Impl
	rule__Input__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputAccess().getNameAssignment_1()); }
	(rule__Input__NameAssignment_1)
	{ after(grammarAccess.getInputAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Input__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputAccess().getExpressionAssignment_2()); }
	(rule__Input__ExpressionAssignment_2)?
	{ after(grammarAccess.getInputAccess().getExpressionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Form__ContentAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormAccess().getContentInputParserRuleCall_2_0()); }
		ruleInput
		{ after(grammarAccess.getFormAccess().getContentInputParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__TypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputAccess().getTypeTypeParserRuleCall_0_0()); }
		ruleType
		{ after(grammarAccess.getInputAccess().getTypeTypeParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputAccess().getNameNameParserRuleCall_1_0()); }
		ruleName
		{ after(grammarAccess.getInputAccess().getNameNameParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__ExpressionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputAccess().getExpressionExpressionParserRuleCall_2_0()); }
		ruleExpression
		{ after(grammarAccess.getInputAccess().getExpressionExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__TextAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTextShortTextKeyword_0_0()); }
		(
			{ before(grammarAccess.getTypeAccess().getTextShortTextKeyword_0_0()); }
			'shortText'
			{ after(grammarAccess.getTypeAccess().getTextShortTextKeyword_0_0()); }
		)
		{ after(grammarAccess.getTypeAccess().getTextShortTextKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__TextAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTextDateKeyword_1_0()); }
		(
			{ before(grammarAccess.getTypeAccess().getTextDateKeyword_1_0()); }
			'date'
			{ after(grammarAccess.getTypeAccess().getTextDateKeyword_1_0()); }
		)
		{ after(grammarAccess.getTypeAccess().getTextDateKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__TextAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTextNumberKeyword_2_0()); }
		(
			{ before(grammarAccess.getTypeAccess().getTextNumberKeyword_2_0()); }
			'number'
			{ after(grammarAccess.getTypeAccess().getTextNumberKeyword_2_0()); }
		)
		{ after(grammarAccess.getTypeAccess().getTextNumberKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__TextAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTextMoneyKeyword_3_0()); }
		(
			{ before(grammarAccess.getTypeAccess().getTextMoneyKeyword_3_0()); }
			'money'
			{ after(grammarAccess.getTypeAccess().getTextMoneyKeyword_3_0()); }
		)
		{ after(grammarAccess.getTypeAccess().getTextMoneyKeyword_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__TextAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTextEmailKeyword_4_0()); }
		(
			{ before(grammarAccess.getTypeAccess().getTextEmailKeyword_4_0()); }
			'email'
			{ after(grammarAccess.getTypeAccess().getTextEmailKeyword_4_0()); }
		)
		{ after(grammarAccess.getTypeAccess().getTextEmailKeyword_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__TextAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTextLongTextKeyword_5_0()); }
		(
			{ before(grammarAccess.getTypeAccess().getTextLongTextKeyword_5_0()); }
			'longText'
			{ after(grammarAccess.getTypeAccess().getTextLongTextKeyword_5_0()); }
		)
		{ after(grammarAccess.getTypeAccess().getTextLongTextKeyword_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__TextAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTextStringNumberKeyword_6_0()); }
		(
			{ before(grammarAccess.getTypeAccess().getTextStringNumberKeyword_6_0()); }
			'stringNumber'
			{ after(grammarAccess.getTypeAccess().getTextStringNumberKeyword_6_0()); }
		)
		{ after(grammarAccess.getTypeAccess().getTextStringNumberKeyword_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Name__TextAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNameAccess().getTextSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getNameAccess().getTextSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__TextAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getTextOptionalKeyword_0_0()); }
		(
			{ before(grammarAccess.getExpressionAccess().getTextOptionalKeyword_0_0()); }
			'optional'
			{ after(grammarAccess.getExpressionAccess().getTextOptionalKeyword_0_0()); }
		)
		{ after(grammarAccess.getExpressionAccess().getTextOptionalKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__TextAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getTextFocusKeyword_1_0()); }
		(
			{ before(grammarAccess.getExpressionAccess().getTextFocusKeyword_1_0()); }
			'focus'
			{ after(grammarAccess.getExpressionAccess().getTextFocusKeyword_1_0()); }
		)
		{ after(grammarAccess.getExpressionAccess().getTextFocusKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__TextAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getTextRequireKeyword_2_0()); }
		(
			{ before(grammarAccess.getExpressionAccess().getTextRequireKeyword_2_0()); }
			'require'
			{ after(grammarAccess.getExpressionAccess().getTextRequireKeyword_2_0()); }
		)
		{ after(grammarAccess.getExpressionAccess().getTextRequireKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
