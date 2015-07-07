/**
 */
package org.eclipse.xtext.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.ConditionalBranch;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.XtextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.impl.ConditionalBranchImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.ConditionalBranchImpl#isFiltered <em>Filtered</em>}</li>
 * </ul>
 *
 * @generated
 * @since 2.9
 */
public class ConditionalBranchImpl extends AbstractElementImpl implements ConditionalBranch {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * The default value of the '{@link #isFiltered() <em>Filtered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiltered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILTERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFiltered() <em>Filtered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiltered()
	 * @generated
	 * @ordered
	 */
	protected boolean filtered = FILTERED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalBranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtextPackage.Literals.CONDITIONAL_BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (Parameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XtextPackage.CONDITIONAL_BRANCH__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.CONDITIONAL_BRANCH__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFiltered() {
		return filtered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiltered(boolean newFiltered) {
		boolean oldFiltered = filtered;
		filtered = newFiltered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.CONDITIONAL_BRANCH__FILTERED, oldFiltered, filtered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtextPackage.CONDITIONAL_BRANCH__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
			case XtextPackage.CONDITIONAL_BRANCH__FILTERED:
				return isFiltered();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XtextPackage.CONDITIONAL_BRANCH__PARAMETER:
				setParameter((Parameter)newValue);
				return;
			case XtextPackage.CONDITIONAL_BRANCH__FILTERED:
				setFiltered((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case XtextPackage.CONDITIONAL_BRANCH__PARAMETER:
				setParameter((Parameter)null);
				return;
			case XtextPackage.CONDITIONAL_BRANCH__FILTERED:
				setFiltered(FILTERED_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XtextPackage.CONDITIONAL_BRANCH__PARAMETER:
				return parameter != null;
			case XtextPackage.CONDITIONAL_BRANCH__FILTERED:
				return filtered != FILTERED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (filtered: ");
		result.append(filtered);
		result.append(')');
		return result.toString();
	}

} //ConditionalBranchImpl
