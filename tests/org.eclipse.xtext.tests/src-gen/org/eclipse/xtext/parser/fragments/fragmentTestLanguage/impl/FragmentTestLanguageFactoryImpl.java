/**
 */
package org.eclipse.xtext.parser.fragments.fragmentTestLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FragmentTestLanguageFactoryImpl extends EFactoryImpl implements FragmentTestLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FragmentTestLanguageFactory init()
  {
    try
    {
      FragmentTestLanguageFactory theFragmentTestLanguageFactory = (FragmentTestLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(FragmentTestLanguagePackage.eNS_URI);
      if (theFragmentTestLanguageFactory != null)
      {
        return theFragmentTestLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FragmentTestLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FragmentTestLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FragmentTestLanguagePackage.FRAGMENTS: return createFragments();
      case FragmentTestLanguagePackage.NAMED: return createNamed();
      case FragmentTestLanguagePackage.NAMED_WITH_ACTION: return createNamedWithAction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fragments createFragments()
  {
    FragmentsImpl fragments = new FragmentsImpl();
    return fragments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Named createNamed()
  {
    NamedImpl named = new NamedImpl();
    return named;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedWithAction createNamedWithAction()
  {
    NamedWithActionImpl namedWithAction = new NamedWithActionImpl();
    return namedWithAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FragmentTestLanguagePackage getFragmentTestLanguagePackage()
  {
    return (FragmentTestLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FragmentTestLanguagePackage getPackage()
  {
    return FragmentTestLanguagePackage.eINSTANCE;
  }

} //FragmentTestLanguageFactoryImpl
