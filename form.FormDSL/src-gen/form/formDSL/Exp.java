/**
 * generated by Xtext 2.25.0
 */
package form.formDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.formDSL.Exp#getComp <em>Comp</em>}</li>
 *   <li>{@link form.formDSL.Exp#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see form.formDSL.FormDSLPackage#getExp()
 * @model
 * @generated
 */
public interface Exp extends Expression
{
  /**
   * Returns the value of the '<em><b>Comp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp</em>' containment reference.
   * @see #setComp(Comparison)
   * @see form.formDSL.FormDSLPackage#getExp_Comp()
   * @model containment="true"
   * @generated
   */
  Comparison getComp();

  /**
   * Sets the value of the '{@link form.formDSL.Exp#getComp <em>Comp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comp</em>' containment reference.
   * @see #getComp()
   * @generated
   */
  void setComp(Comparison value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see form.formDSL.FormDSLPackage#getExp_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link form.formDSL.Exp#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // Exp
