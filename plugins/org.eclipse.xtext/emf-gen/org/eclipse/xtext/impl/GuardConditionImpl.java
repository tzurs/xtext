/**
 */
package org.eclipse.xtext.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.GuardCondition;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.XtextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.impl.GuardConditionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.GuardConditionImpl#isPassIfTrue <em>Pass If True</em>}</li>
 * </ul>
 * 
 * @since 2.9
 * @generated
 * @noreference This class is not intended to be referenced by clients.
 * @noextend This class is not intended to be subclassed by clients.
 * @noinstantiate This class is not intended to be instantiated by clients.
 */
public class GuardConditionImpl extends MinimalEObjectImpl.Container implements GuardCondition {
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
	 * The default value of the '{@link #isPassIfTrue() <em>Pass If True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassIfTrue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PASS_IF_TRUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPassIfTrue() <em>Pass If True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassIfTrue()
	 * @generated
	 * @ordered
	 */
	protected boolean passIfTrue = PASS_IF_TRUE_EDEFAULT;

	/**
	 * This is true if the Pass If True attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean passIfTrueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuardConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtextPackage.Literals.GUARD_CONDITION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XtextPackage.GUARD_CONDITION__PARAMETER, oldParameter, parameter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.GUARD_CONDITION__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPassIfTrue() {
		return passIfTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassIfTrue(boolean newPassIfTrue) {
		boolean oldPassIfTrue = passIfTrue;
		passIfTrue = newPassIfTrue;
		boolean oldPassIfTrueESet = passIfTrueESet;
		passIfTrueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.GUARD_CONDITION__PASS_IF_TRUE, oldPassIfTrue, passIfTrue, !oldPassIfTrueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPassIfTrue() {
		boolean oldPassIfTrue = passIfTrue;
		boolean oldPassIfTrueESet = passIfTrueESet;
		passIfTrue = PASS_IF_TRUE_EDEFAULT;
		passIfTrueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtextPackage.GUARD_CONDITION__PASS_IF_TRUE, oldPassIfTrue, PASS_IF_TRUE_EDEFAULT, oldPassIfTrueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPassIfTrue() {
		return passIfTrueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtextPackage.GUARD_CONDITION__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
			case XtextPackage.GUARD_CONDITION__PASS_IF_TRUE:
				return isPassIfTrue();
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
			case XtextPackage.GUARD_CONDITION__PARAMETER:
				setParameter((Parameter)newValue);
				return;
			case XtextPackage.GUARD_CONDITION__PASS_IF_TRUE:
				setPassIfTrue((Boolean)newValue);
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
			case XtextPackage.GUARD_CONDITION__PARAMETER:
				setParameter((Parameter)null);
				return;
			case XtextPackage.GUARD_CONDITION__PASS_IF_TRUE:
				unsetPassIfTrue();
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
			case XtextPackage.GUARD_CONDITION__PARAMETER:
				return parameter != null;
			case XtextPackage.GUARD_CONDITION__PASS_IF_TRUE:
				return isSetPassIfTrue();
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
		result.append(" (passIfTrue: ");
		if (passIfTrueESet) result.append(passIfTrue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GuardConditionImpl
