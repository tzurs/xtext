/**
 */
package org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.FragmentTestLanguageFactory;
import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.FragmentTestLanguagePackage;
import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Fragments;
import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.Named;
import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.NamedWithAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FragmentTestLanguagePackageImpl extends EPackageImpl implements FragmentTestLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fragmentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedWithActionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.FragmentTestLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FragmentTestLanguagePackageImpl()
  {
    super(eNS_URI, FragmentTestLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FragmentTestLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FragmentTestLanguagePackage init()
  {
    if (isInited) return (FragmentTestLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(FragmentTestLanguagePackage.eNS_URI);

    // Obtain or create and register package
    FragmentTestLanguagePackageImpl theFragmentTestLanguagePackage = (FragmentTestLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FragmentTestLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FragmentTestLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theFragmentTestLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theFragmentTestLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFragmentTestLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FragmentTestLanguagePackage.eNS_URI, theFragmentTestLanguagePackage);
    return theFragmentTestLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFragments()
  {
    return fragmentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFragments_Element()
  {
    return (EReference)fragmentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFragments_Ref()
  {
    return (EReference)fragmentsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamed()
  {
    return namedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamed_Ref()
  {
    return (EReference)namedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamed_Name()
  {
    return (EAttribute)namedEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedWithAction()
  {
    return namedWithActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedWithAction_Prev()
  {
    return (EReference)namedWithActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedWithAction_Ref2()
  {
    return (EReference)namedWithActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FragmentTestLanguageFactory getFragmentTestLanguageFactory()
  {
    return (FragmentTestLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    fragmentsEClass = createEClass(FRAGMENTS);
    createEReference(fragmentsEClass, FRAGMENTS__ELEMENT);
    createEReference(fragmentsEClass, FRAGMENTS__REF);

    namedEClass = createEClass(NAMED);
    createEReference(namedEClass, NAMED__REF);
    createEAttribute(namedEClass, NAMED__NAME);

    namedWithActionEClass = createEClass(NAMED_WITH_ACTION);
    createEReference(namedWithActionEClass, NAMED_WITH_ACTION__PREV);
    createEReference(namedWithActionEClass, NAMED_WITH_ACTION__REF2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    namedWithActionEClass.getESuperTypes().add(this.getNamed());

    // Initialize classes and features; add operations and parameters
    initEClass(fragmentsEClass, Fragments.class, "Fragments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFragments_Element(), this.getNamed(), null, "element", null, 0, 1, Fragments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFragments_Ref(), this.getNamed(), null, "ref", null, 0, 1, Fragments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedEClass, Named.class, "Named", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamed_Ref(), this.getNamed(), null, "ref", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNamed_Name(), ecorePackage.getEString(), "name", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedWithActionEClass, NamedWithAction.class, "NamedWithAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamedWithAction_Prev(), this.getNamed(), null, "prev", null, 0, 1, NamedWithAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamedWithAction_Ref2(), this.getNamed(), null, "ref2", null, 0, 1, NamedWithAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FragmentTestLanguagePackageImpl
