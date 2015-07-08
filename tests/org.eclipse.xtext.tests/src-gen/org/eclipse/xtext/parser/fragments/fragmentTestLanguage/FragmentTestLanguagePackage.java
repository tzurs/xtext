/**
 */
package org.eclipse.xtext.parser.fragments.fragmentTestLanguage;

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
 * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.FragmentTestLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface FragmentTestLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fragmentTestLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/2015/tmf/xtext/fragments";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fragmentTestLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FragmentTestLanguagePackage eINSTANCE = org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.FragmentTestLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.FragmentsImpl <em>Fragments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.FragmentsImpl
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.FragmentTestLanguagePackageImpl#getFragments()
   * @generated
   */
  int FRAGMENTS = 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENTS__ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENTS__REF = 1;

  /**
   * The number of structural features of the '<em>Fragments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENTS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.NamedImpl <em>Named</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.NamedImpl
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.FragmentTestLanguagePackageImpl#getNamed()
   * @generated
   */
  int NAMED = 1;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED__REF = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED__NAME = 1;

  /**
   * The number of structural features of the '<em>Named</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.NamedWithActionImpl <em>Named With Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.NamedWithActionImpl
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.FragmentTestLanguagePackageImpl#getNamedWithAction()
   * @generated
   */
  int NAMED_WITH_ACTION = 2;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_WITH_ACTION__REF = NAMED__REF;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_WITH_ACTION__NAME = NAMED__NAME;

  /**
   * The feature id for the '<em><b>Prev</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_WITH_ACTION__PREV = NAMED_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_WITH_ACTION__REF2 = NAMED_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Named With Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_WITH_ACTION_FEATURE_COUNT = NAMED_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Fragments <em>Fragments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fragments</em>'.
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Fragments
   * @generated
   */
  EClass getFragments();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Fragments#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Fragments#getElement()
   * @see #getFragments()
   * @generated
   */
  EReference getFragments_Element();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Fragments#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Fragments#getRef()
   * @see #getFragments()
   * @generated
   */
  EReference getFragments_Ref();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Named <em>Named</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named</em>'.
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Named
   * @generated
   */
  EClass getNamed();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Named#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Named#getRef()
   * @see #getNamed()
   * @generated
   */
  EReference getNamed_Ref();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Named#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Named#getName()
   * @see #getNamed()
   * @generated
   */
  EAttribute getNamed_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.NamedWithAction <em>Named With Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named With Action</em>'.
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.NamedWithAction
   * @generated
   */
  EClass getNamedWithAction();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.NamedWithAction#getPrev <em>Prev</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prev</em>'.
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.NamedWithAction#getPrev()
   * @see #getNamedWithAction()
   * @generated
   */
  EReference getNamedWithAction_Prev();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.NamedWithAction#getRef2 <em>Ref2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref2</em>'.
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.NamedWithAction#getRef2()
   * @see #getNamedWithAction()
   * @generated
   */
  EReference getNamedWithAction_Ref2();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FragmentTestLanguageFactory getFragmentTestLanguageFactory();

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
     * The meta object literal for the '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.FragmentsImpl <em>Fragments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.FragmentsImpl
     * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.FragmentTestLanguagePackageImpl#getFragments()
     * @generated
     */
    EClass FRAGMENTS = eINSTANCE.getFragments();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRAGMENTS__ELEMENT = eINSTANCE.getFragments_Element();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRAGMENTS__REF = eINSTANCE.getFragments_Ref();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.NamedImpl <em>Named</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.NamedImpl
     * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.FragmentTestLanguagePackageImpl#getNamed()
     * @generated
     */
    EClass NAMED = eINSTANCE.getNamed();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED__REF = eINSTANCE.getNamed_Ref();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.NamedWithActionImpl <em>Named With Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.NamedWithActionImpl
     * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl.FragmentTestLanguagePackageImpl#getNamedWithAction()
     * @generated
     */
    EClass NAMED_WITH_ACTION = eINSTANCE.getNamedWithAction();

    /**
     * The meta object literal for the '<em><b>Prev</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_WITH_ACTION__PREV = eINSTANCE.getNamedWithAction_Prev();

    /**
     * The meta object literal for the '<em><b>Ref2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_WITH_ACTION__REF2 = eINSTANCE.getNamedWithAction_Ref2();

  }

} //FragmentTestLanguagePackage
