/**
 * generated by Xtext 2.25.0
 */
package form.formDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see form.formDSL.FormDSLFactory
 * @model kind="package"
 * @generated
 */
public interface FormDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "formDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.FormDSL.form";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "formDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FormDSLPackage eINSTANCE = form.formDSL.impl.FormDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link form.formDSL.impl.FormImpl <em>Form</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.FormImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getForm()
   * @generated
   */
  int FORM = 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Form</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link form.formDSL.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.InputImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getInput()
   * @generated
   */
  int INPUT = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__NAME = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link form.formDSL.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.TypeImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TEXT = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link form.formDSL.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.NameImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getName_()
   * @generated
   */
  int NAME = 3;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__TEXT = 0;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link form.formDSL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.ExpressionImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 4;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__TEXT = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link form.formDSL.impl.ExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.ExpImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getExp()
   * @generated
   */
  int EXP = 5;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__TEXT = EXPRESSION__TEXT;

  /**
   * The feature id for the '<em><b>Comp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__COMP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__VALUE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link form.formDSL.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.ComparisonImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 6;

  /**
   * The number of structural features of the '<em>Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link form.formDSL.impl.ShortTextImpl <em>Short Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.ShortTextImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getShortText()
   * @generated
   */
  int SHORT_TEXT = 7;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT_TEXT__TEXT = TYPE__TEXT;

  /**
   * The number of structural features of the '<em>Short Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT_TEXT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link form.formDSL.impl.GenericImpl <em>Generic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.GenericImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getGeneric()
   * @generated
   */
  int GENERIC = 8;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC__TEXT = TYPE__TEXT;

  /**
   * The number of structural features of the '<em>Generic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link form.formDSL.impl.MoneyImpl <em>Money</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.MoneyImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getMoney()
   * @generated
   */
  int MONEY = 9;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONEY__TEXT = TYPE__TEXT;

  /**
   * The number of structural features of the '<em>Money</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONEY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link form.formDSL.impl.LongTextImpl <em>Long Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.LongTextImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getLongText()
   * @generated
   */
  int LONG_TEXT = 10;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_TEXT__TEXT = TYPE__TEXT;

  /**
   * The number of structural features of the '<em>Long Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_TEXT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link form.formDSL.impl.StringNumberImpl <em>String Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.StringNumberImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getStringNumber()
   * @generated
   */
  int STRING_NUMBER = 11;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_NUMBER__TEXT = TYPE__TEXT;

  /**
   * The number of structural features of the '<em>String Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_NUMBER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link form.formDSL.impl.OptionalImpl <em>Optional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.OptionalImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getOptional()
   * @generated
   */
  int OPTIONAL = 12;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL__TEXT = EXPRESSION__TEXT;

  /**
   * The number of structural features of the '<em>Optional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link form.formDSL.impl.FocusImpl <em>Focus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.FocusImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getFocus()
   * @generated
   */
  int FOCUS = 13;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOCUS__TEXT = EXPRESSION__TEXT;

  /**
   * The number of structural features of the '<em>Focus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOCUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link form.formDSL.impl.IsImpl <em>Is</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.IsImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getIs()
   * @generated
   */
  int IS = 14;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS__TEXT = EXP__TEXT;

  /**
   * The feature id for the '<em><b>Comp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS__COMP = EXP__COMP;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS__VALUE = EXP__VALUE;

  /**
   * The number of structural features of the '<em>Is</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_FEATURE_COUNT = EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link form.formDSL.impl.LengthImpl <em>Length</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.LengthImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getLength()
   * @generated
   */
  int LENGTH = 15;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH__TEXT = EXP__TEXT;

  /**
   * The feature id for the '<em><b>Comp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH__COMP = EXP__COMP;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH__VALUE = EXP__VALUE;

  /**
   * The number of structural features of the '<em>Length</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_FEATURE_COUNT = EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link form.formDSL.impl.LessThanImpl <em>Less Than</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.LessThanImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getLessThan()
   * @generated
   */
  int LESS_THAN = 16;

  /**
   * The number of structural features of the '<em>Less Than</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_THAN_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link form.formDSL.impl.GreaterThanImpl <em>Greater Than</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.GreaterThanImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getGreaterThan()
   * @generated
   */
  int GREATER_THAN = 17;

  /**
   * The number of structural features of the '<em>Greater Than</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_THAN_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link form.formDSL.impl.LessThanInclusiveImpl <em>Less Than Inclusive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.LessThanInclusiveImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getLessThanInclusive()
   * @generated
   */
  int LESS_THAN_INCLUSIVE = 18;

  /**
   * The number of structural features of the '<em>Less Than Inclusive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_THAN_INCLUSIVE_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link form.formDSL.impl.GreaterThanInclusiveImpl <em>Greater Than Inclusive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.GreaterThanInclusiveImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getGreaterThanInclusive()
   * @generated
   */
  int GREATER_THAN_INCLUSIVE = 19;

  /**
   * The number of structural features of the '<em>Greater Than Inclusive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_THAN_INCLUSIVE_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link form.formDSL.impl.ExactlyImpl <em>Exactly</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.ExactlyImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getExactly()
   * @generated
   */
  int EXACTLY = 20;

  /**
   * The number of structural features of the '<em>Exactly</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXACTLY_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link form.formDSL.impl.NotImpl <em>Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see form.formDSL.impl.NotImpl
   * @see form.formDSL.impl.FormDSLPackageImpl#getNot()
   * @generated
   */
  int NOT = 21;

  /**
   * The number of structural features of the '<em>Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link form.formDSL.Form <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form</em>'.
   * @see form.formDSL.Form
   * @generated
   */
  EClass getForm();

  /**
   * Returns the meta object for the containment reference list '{@link form.formDSL.Form#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see form.formDSL.Form#getContent()
   * @see #getForm()
   * @generated
   */
  EReference getForm_Content();

  /**
   * Returns the meta object for class '{@link form.formDSL.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see form.formDSL.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the containment reference '{@link form.formDSL.Input#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see form.formDSL.Input#getType()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Type();

  /**
   * Returns the meta object for the containment reference '{@link form.formDSL.Input#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see form.formDSL.Input#getName()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Name();

  /**
   * Returns the meta object for the containment reference list '{@link form.formDSL.Input#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see form.formDSL.Input#getExpression()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Expression();

  /**
   * Returns the meta object for class '{@link form.formDSL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see form.formDSL.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link form.formDSL.Type#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see form.formDSL.Type#getText()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Text();

  /**
   * Returns the meta object for class '{@link form.formDSL.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see form.formDSL.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for the attribute '{@link form.formDSL.Name#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see form.formDSL.Name#getText()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_Text();

  /**
   * Returns the meta object for class '{@link form.formDSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see form.formDSL.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link form.formDSL.Expression#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see form.formDSL.Expression#getText()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Text();

  /**
   * Returns the meta object for class '{@link form.formDSL.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp</em>'.
   * @see form.formDSL.Exp
   * @generated
   */
  EClass getExp();

  /**
   * Returns the meta object for the containment reference '{@link form.formDSL.Exp#getComp <em>Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comp</em>'.
   * @see form.formDSL.Exp#getComp()
   * @see #getExp()
   * @generated
   */
  EReference getExp_Comp();

  /**
   * Returns the meta object for the attribute '{@link form.formDSL.Exp#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see form.formDSL.Exp#getValue()
   * @see #getExp()
   * @generated
   */
  EAttribute getExp_Value();

  /**
   * Returns the meta object for class '{@link form.formDSL.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison</em>'.
   * @see form.formDSL.Comparison
   * @generated
   */
  EClass getComparison();

  /**
   * Returns the meta object for class '{@link form.formDSL.ShortText <em>Short Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Short Text</em>'.
   * @see form.formDSL.ShortText
   * @generated
   */
  EClass getShortText();

  /**
   * Returns the meta object for class '{@link form.formDSL.Generic <em>Generic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic</em>'.
   * @see form.formDSL.Generic
   * @generated
   */
  EClass getGeneric();

  /**
   * Returns the meta object for class '{@link form.formDSL.Money <em>Money</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Money</em>'.
   * @see form.formDSL.Money
   * @generated
   */
  EClass getMoney();

  /**
   * Returns the meta object for class '{@link form.formDSL.LongText <em>Long Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Long Text</em>'.
   * @see form.formDSL.LongText
   * @generated
   */
  EClass getLongText();

  /**
   * Returns the meta object for class '{@link form.formDSL.StringNumber <em>String Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Number</em>'.
   * @see form.formDSL.StringNumber
   * @generated
   */
  EClass getStringNumber();

  /**
   * Returns the meta object for class '{@link form.formDSL.Optional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional</em>'.
   * @see form.formDSL.Optional
   * @generated
   */
  EClass getOptional();

  /**
   * Returns the meta object for class '{@link form.formDSL.Focus <em>Focus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Focus</em>'.
   * @see form.formDSL.Focus
   * @generated
   */
  EClass getFocus();

  /**
   * Returns the meta object for class '{@link form.formDSL.Is <em>Is</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is</em>'.
   * @see form.formDSL.Is
   * @generated
   */
  EClass getIs();

  /**
   * Returns the meta object for class '{@link form.formDSL.Length <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Length</em>'.
   * @see form.formDSL.Length
   * @generated
   */
  EClass getLength();

  /**
   * Returns the meta object for class '{@link form.formDSL.LessThan <em>Less Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Less Than</em>'.
   * @see form.formDSL.LessThan
   * @generated
   */
  EClass getLessThan();

  /**
   * Returns the meta object for class '{@link form.formDSL.GreaterThan <em>Greater Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greater Than</em>'.
   * @see form.formDSL.GreaterThan
   * @generated
   */
  EClass getGreaterThan();

  /**
   * Returns the meta object for class '{@link form.formDSL.LessThanInclusive <em>Less Than Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Less Than Inclusive</em>'.
   * @see form.formDSL.LessThanInclusive
   * @generated
   */
  EClass getLessThanInclusive();

  /**
   * Returns the meta object for class '{@link form.formDSL.GreaterThanInclusive <em>Greater Than Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greater Than Inclusive</em>'.
   * @see form.formDSL.GreaterThanInclusive
   * @generated
   */
  EClass getGreaterThanInclusive();

  /**
   * Returns the meta object for class '{@link form.formDSL.Exactly <em>Exactly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exactly</em>'.
   * @see form.formDSL.Exactly
   * @generated
   */
  EClass getExactly();

  /**
   * Returns the meta object for class '{@link form.formDSL.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not</em>'.
   * @see form.formDSL.Not
   * @generated
   */
  EClass getNot();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FormDSLFactory getFormDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link form.formDSL.impl.FormImpl <em>Form</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.FormImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getForm()
     * @generated
     */
    EClass FORM = eINSTANCE.getForm();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM__CONTENT = eINSTANCE.getForm_Content();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.InputImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__TYPE = eINSTANCE.getInput_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__NAME = eINSTANCE.getInput_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__EXPRESSION = eINSTANCE.getInput_Expression();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.TypeImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__TEXT = eINSTANCE.getType_Text();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.NameImpl <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.NameImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getName_()
     * @generated
     */
    EClass NAME = eINSTANCE.getName_();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME__TEXT = eINSTANCE.getName_Text();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.ExpressionImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__TEXT = eINSTANCE.getExpression_Text();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.ExpImpl <em>Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.ExpImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getExp()
     * @generated
     */
    EClass EXP = eINSTANCE.getExp();

    /**
     * The meta object literal for the '<em><b>Comp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__COMP = eINSTANCE.getExp_Comp();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP__VALUE = eINSTANCE.getExp_Value();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.ComparisonImpl <em>Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.ComparisonImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getComparison()
     * @generated
     */
    EClass COMPARISON = eINSTANCE.getComparison();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.ShortTextImpl <em>Short Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.ShortTextImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getShortText()
     * @generated
     */
    EClass SHORT_TEXT = eINSTANCE.getShortText();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.GenericImpl <em>Generic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.GenericImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getGeneric()
     * @generated
     */
    EClass GENERIC = eINSTANCE.getGeneric();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.MoneyImpl <em>Money</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.MoneyImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getMoney()
     * @generated
     */
    EClass MONEY = eINSTANCE.getMoney();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.LongTextImpl <em>Long Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.LongTextImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getLongText()
     * @generated
     */
    EClass LONG_TEXT = eINSTANCE.getLongText();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.StringNumberImpl <em>String Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.StringNumberImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getStringNumber()
     * @generated
     */
    EClass STRING_NUMBER = eINSTANCE.getStringNumber();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.OptionalImpl <em>Optional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.OptionalImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getOptional()
     * @generated
     */
    EClass OPTIONAL = eINSTANCE.getOptional();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.FocusImpl <em>Focus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.FocusImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getFocus()
     * @generated
     */
    EClass FOCUS = eINSTANCE.getFocus();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.IsImpl <em>Is</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.IsImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getIs()
     * @generated
     */
    EClass IS = eINSTANCE.getIs();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.LengthImpl <em>Length</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.LengthImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getLength()
     * @generated
     */
    EClass LENGTH = eINSTANCE.getLength();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.LessThanImpl <em>Less Than</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.LessThanImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getLessThan()
     * @generated
     */
    EClass LESS_THAN = eINSTANCE.getLessThan();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.GreaterThanImpl <em>Greater Than</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.GreaterThanImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getGreaterThan()
     * @generated
     */
    EClass GREATER_THAN = eINSTANCE.getGreaterThan();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.LessThanInclusiveImpl <em>Less Than Inclusive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.LessThanInclusiveImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getLessThanInclusive()
     * @generated
     */
    EClass LESS_THAN_INCLUSIVE = eINSTANCE.getLessThanInclusive();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.GreaterThanInclusiveImpl <em>Greater Than Inclusive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.GreaterThanInclusiveImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getGreaterThanInclusive()
     * @generated
     */
    EClass GREATER_THAN_INCLUSIVE = eINSTANCE.getGreaterThanInclusive();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.ExactlyImpl <em>Exactly</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.ExactlyImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getExactly()
     * @generated
     */
    EClass EXACTLY = eINSTANCE.getExactly();

    /**
     * The meta object literal for the '{@link form.formDSL.impl.NotImpl <em>Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see form.formDSL.impl.NotImpl
     * @see form.formDSL.impl.FormDSLPackageImpl#getNot()
     * @generated
     */
    EClass NOT = eINSTANCE.getNot();

  }

} //FormDSLPackage
