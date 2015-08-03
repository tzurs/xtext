/**
 */
package org.eclipse.xtext.xtextTest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xtextTest.Group#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipse.xtext.xtextTest.Group#isPredicated <em>Predicated</em>}</li>
 *   <li>{@link org.eclipse.xtext.xtextTest.Group#isFirstSetPredicated <em>First Set Predicated</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xtextTest.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getGroup_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

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
   * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getGroup_Predicated()
   * @model
   * @generated
   */
  boolean isPredicated();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xtextTest.Group#isPredicated <em>Predicated</em>}' attribute.
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
   * @see org.eclipse.xtext.xtextTest.XtextTestPackage#getGroup_FirstSetPredicated()
   * @model
   * @generated
   */
  boolean isFirstSetPredicated();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xtextTest.Group#isFirstSetPredicated <em>First Set Predicated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Set Predicated</em>' attribute.
   * @see #isFirstSetPredicated()
   * @generated
   */
  void setFirstSetPredicated(boolean value);

} // Group
