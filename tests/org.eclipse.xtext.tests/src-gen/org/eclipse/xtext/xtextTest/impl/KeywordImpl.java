/**
 */
package org.eclipse.xtext.xtextTest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xtextTest.Keyword;
import org.eclipse.xtext.xtextTest.XtextTestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xtextTest.impl.KeywordImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.xtext.xtextTest.impl.KeywordImpl#isPredicated <em>Predicated</em>}</li>
 *   <li>{@link org.eclipse.xtext.xtextTest.impl.KeywordImpl#isFirstSetPredicated <em>First Set Predicated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeywordImpl extends AbstractElementImpl implements Keyword
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isPredicated() <em>Predicated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPredicated()
   * @generated
   * @ordered
   */
  protected static final boolean PREDICATED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPredicated() <em>Predicated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPredicated()
   * @generated
   * @ordered
   */
  protected boolean predicated = PREDICATED_EDEFAULT;

  /**
   * The default value of the '{@link #isFirstSetPredicated() <em>First Set Predicated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFirstSetPredicated()
   * @generated
   * @ordered
   */
  protected static final boolean FIRST_SET_PREDICATED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFirstSetPredicated() <em>First Set Predicated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFirstSetPredicated()
   * @generated
   * @ordered
   */
  protected boolean firstSetPredicated = FIRST_SET_PREDICATED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KeywordImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XtextTestPackage.Literals.KEYWORD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XtextTestPackage.KEYWORD__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPredicated()
  {
    return predicated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredicated(boolean newPredicated)
  {
    boolean oldPredicated = predicated;
    predicated = newPredicated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XtextTestPackage.KEYWORD__PREDICATED, oldPredicated, predicated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFirstSetPredicated()
  {
    return firstSetPredicated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstSetPredicated(boolean newFirstSetPredicated)
  {
    boolean oldFirstSetPredicated = firstSetPredicated;
    firstSetPredicated = newFirstSetPredicated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XtextTestPackage.KEYWORD__FIRST_SET_PREDICATED, oldFirstSetPredicated, firstSetPredicated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XtextTestPackage.KEYWORD__VALUE:
        return getValue();
      case XtextTestPackage.KEYWORD__PREDICATED:
        return isPredicated();
      case XtextTestPackage.KEYWORD__FIRST_SET_PREDICATED:
        return isFirstSetPredicated();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XtextTestPackage.KEYWORD__VALUE:
        setValue((String)newValue);
        return;
      case XtextTestPackage.KEYWORD__PREDICATED:
        setPredicated((Boolean)newValue);
        return;
      case XtextTestPackage.KEYWORD__FIRST_SET_PREDICATED:
        setFirstSetPredicated((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XtextTestPackage.KEYWORD__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case XtextTestPackage.KEYWORD__PREDICATED:
        setPredicated(PREDICATED_EDEFAULT);
        return;
      case XtextTestPackage.KEYWORD__FIRST_SET_PREDICATED:
        setFirstSetPredicated(FIRST_SET_PREDICATED_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XtextTestPackage.KEYWORD__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case XtextTestPackage.KEYWORD__PREDICATED:
        return predicated != PREDICATED_EDEFAULT;
      case XtextTestPackage.KEYWORD__FIRST_SET_PREDICATED:
        return firstSetPredicated != FIRST_SET_PREDICATED_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (value: ");
    result.append(value);
    result.append(", predicated: ");
    result.append(predicated);
    result.append(", firstSetPredicated: ");
    result.append(firstSetPredicated);
    result.append(')');
    return result.toString();
  }

} //KeywordImpl
