/**
 */
package org.eclipse.xtext.xtextTest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xtextTest.RuleCall#getRule <em>Rule</em>}</li>
 *   <li>{@link org.eclipse.xtext.xtextTest.RuleCall#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.eclipse.xtext.xtextTest.RuleCall#isPredicated <em>Predicated</em>}</li>
 *   <li>{@link org.eclipse.xtext.xtextTest.RuleCall#isFirstSetPredicated <em>First Set Predicated</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getRuleCall()
 * @model
 * @generated
 */
public interface RuleCall extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' reference.
   * @see #setRule(AbstractRule)
   * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getRuleCall_Rule()
   * @model
   * @generated
   */
  AbstractRule getRule();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xtextTest.RuleCall#getRule <em>Rule</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' reference.
   * @see #getRule()
   * @generated
   */
  void setRule(AbstractRule value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xtextTest.NamedArgument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getRuleCall_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<NamedArgument> getArguments();

  /**
   * Returns the value of the '<em><b>Predicated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicated</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicated</em>' attribute.
   * @see #setPredicated(boolean)
   * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getRuleCall_Predicated()
   * @model
   * @generated
   */
  boolean isPredicated();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xtextTest.RuleCall#isPredicated <em>Predicated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicated</em>' attribute.
   * @see #isPredicated()
   * @generated
   */
  void setPredicated(boolean value);

  /**
   * Returns the value of the '<em><b>First Set Predicated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Set Predicated</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Set Predicated</em>' attribute.
   * @see #setFirstSetPredicated(boolean)
   * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getRuleCall_FirstSetPredicated()
   * @model
   * @generated
   */
  boolean isFirstSetPredicated();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xtextTest.RuleCall#isFirstSetPredicated <em>First Set Predicated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Set Predicated</em>' attribute.
   * @see #isFirstSetPredicated()
   * @generated
   */
  void setFirstSetPredicated(boolean value);

} // RuleCall
