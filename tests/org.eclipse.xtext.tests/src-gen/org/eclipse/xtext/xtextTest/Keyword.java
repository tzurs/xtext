/**
 */
package org.eclipse.xtext.xtextTest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xtextTest.Keyword#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.xtext.xtextTest.Keyword#isPredicated <em>Predicated</em>}</li>
 *   <li>{@link org.eclipse.xtext.xtextTest.Keyword#isFirstSetPredicated <em>First Set Predicated</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getKeyword()
 * @model
 * @generated
 */
public interface Keyword extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getKeyword_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xtextTest.Keyword#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

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
   * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getKeyword_Predicated()
   * @model
   * @generated
   */
  boolean isPredicated();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xtextTest.Keyword#isPredicated <em>Predicated</em>}' attribute.
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
   * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getKeyword_FirstSetPredicated()
   * @model
   * @generated
   */
  boolean isFirstSetPredicated();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xtextTest.Keyword#isFirstSetPredicated <em>First Set Predicated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Set Predicated</em>' attribute.
   * @see #isFirstSetPredicated()
   * @generated
   */
  void setFirstSetPredicated(boolean value);

} // Keyword
