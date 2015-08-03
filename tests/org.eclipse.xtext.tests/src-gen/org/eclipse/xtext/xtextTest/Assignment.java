/**
 */
package org.eclipse.xtext.xtextTest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xtextTest.Assignment#isPredicated <em>Predicated</em>}</li>
 *   <li>{@link org.eclipse.xtext.xtextTest.Assignment#isFirstSetPredicated <em>First Set Predicated</em>}</li>
 *   <li>{@link org.eclipse.xtext.xtextTest.Assignment#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.xtext.xtextTest.Assignment#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipse.xtext.xtextTest.Assignment#getTerminal <em>Terminal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends AbstractElement
{
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
   * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getAssignment_Predicated()
   * @model
   * @generated
   */
  boolean isPredicated();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xtextTest.Assignment#isPredicated <em>Predicated</em>}' attribute.
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
   * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getAssignment_FirstSetPredicated()
   * @model
   * @generated
   */
  boolean isFirstSetPredicated();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xtextTest.Assignment#isFirstSetPredicated <em>First Set Predicated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Set Predicated</em>' attribute.
   * @see #isFirstSetPredicated()
   * @generated
   */
  void setFirstSetPredicated(boolean value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' attribute.
   * @see #setFeature(String)
   * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getAssignment_Feature()
   * @model
   * @generated
   */
  String getFeature();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xtextTest.Assignment#getFeature <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' attribute.
   * @see #getFeature()
   * @generated
   */
  void setFeature(String value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getAssignment_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xtextTest.Assignment#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Terminal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terminal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terminal</em>' containment reference.
   * @see #setTerminal(AbstractElement)
   * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getAssignment_Terminal()
   * @model containment="true"
   * @generated
   */
  AbstractElement getTerminal();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xtextTest.Assignment#getTerminal <em>Terminal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Terminal</em>' containment reference.
   * @see #getTerminal()
   * @generated
   */
  void setTerminal(AbstractElement value);

} // Assignment
