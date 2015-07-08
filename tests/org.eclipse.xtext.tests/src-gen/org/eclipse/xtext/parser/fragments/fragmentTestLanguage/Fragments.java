/**
 */
package org.eclipse.xtext.parser.fragments.fragmentTestLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Fragments#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Fragments#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.FragmentTestLanguagePackage#getFragments()
 * @model
 * @generated
 */
public interface Fragments extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(Named)
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.FragmentTestLanguagePackage#getFragments_Element()
   * @model containment="true"
   * @generated
   */
  Named getElement();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Fragments#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Named value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Named)
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.FragmentTestLanguagePackage#getFragments_Ref()
   * @model
   * @generated
   */
  Named getRef();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Fragments#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Named value);

} // Fragments
