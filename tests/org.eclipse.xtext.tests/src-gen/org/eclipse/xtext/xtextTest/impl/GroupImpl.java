/**
 */
package org.eclipse.xtext.xtextTest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xtextTest.AbstractElement;
import org.eclipse.xtext.xtextTest.Group;
import org.eclipse.xtext.xtextTest.XtextTestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xtextTest.impl.GroupImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipse.xtext.xtextTest.impl.GroupImpl#isPredicated <em>Predicated</em>}</li>
 *   <li>{@link org.eclipse.xtext.xtextTest.impl.GroupImpl#isFirstSetPredicated <em>First Set Predicated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends AbstractElementImpl implements Group
{
  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<AbstractElement> elements;

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
  protected GroupImpl()
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
    return XtextTestPackage.Literals.GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<AbstractElement>(AbstractElement.class, this, XtextTestPackage.GROUP__ELEMENTS);
    }
    return elements;
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
      eNotify(new ENotificationImpl(this, Notification.SET, XtextTestPackage.GROUP__PREDICATED, oldPredicated, predicated));
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
      eNotify(new ENotificationImpl(this, Notification.SET, XtextTestPackage.GROUP__FIRST_SET_PREDICATED, oldFirstSetPredicated, firstSetPredicated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XtextTestPackage.GROUP__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case XtextTestPackage.GROUP__ELEMENTS:
        return getElements();
      case XtextTestPackage.GROUP__PREDICATED:
        return isPredicated();
      case XtextTestPackage.GROUP__FIRST_SET_PREDICATED:
        return isFirstSetPredicated();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XtextTestPackage.GROUP__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends AbstractElement>)newValue);
        return;
      case XtextTestPackage.GROUP__PREDICATED:
        setPredicated((Boolean)newValue);
        return;
      case XtextTestPackage.GROUP__FIRST_SET_PREDICATED:
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
      case XtextTestPackage.GROUP__ELEMENTS:
        getElements().clear();
        return;
      case XtextTestPackage.GROUP__PREDICATED:
        setPredicated(PREDICATED_EDEFAULT);
        return;
      case XtextTestPackage.GROUP__FIRST_SET_PREDICATED:
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
      case XtextTestPackage.GROUP__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case XtextTestPackage.GROUP__PREDICATED:
        return predicated != PREDICATED_EDEFAULT;
      case XtextTestPackage.GROUP__FIRST_SET_PREDICATED:
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
    result.append(" (predicated: ");
    result.append(predicated);
    result.append(", firstSetPredicated: ");
    result.append(firstSetPredicated);
    result.append(')');
    return result.toString();
  }

} //GroupImpl
