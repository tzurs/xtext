/**
 */
package org.eclipse.xtext.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.NamedArgument;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.XtextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.impl.RuleCallImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.RuleCallImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleCallImpl extends AbstractElementImpl implements RuleCall {
	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected AbstractRule rule;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 * @since 2.9
	 */
	protected EList<NamedArgument> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtextPackage.Literals.RULE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRule getRule() {
		if (rule != null && rule.eIsProxy()) {
			InternalEObject oldRule = (InternalEObject)rule;
			rule = (AbstractRule)eResolveProxy(oldRule);
			if (rule != oldRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XtextPackage.RULE_CALL__RULE, oldRule, rule));
			}
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRule basicGetRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(AbstractRule newRule) {
		AbstractRule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.RULE_CALL__RULE, oldRule, rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.9
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedArgument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectResolvingEList<NamedArgument>(NamedArgument.class, this, XtextPackage.RULE_CALL__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtextPackage.RULE_CALL__RULE:
				if (resolve) return getRule();
				return basicGetRule();
			case XtextPackage.RULE_CALL__ARGUMENTS:
				return getArguments();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XtextPackage.RULE_CALL__RULE:
				setRule((AbstractRule)newValue);
				return;
			case XtextPackage.RULE_CALL__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends NamedArgument>)newValue);
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
			case XtextPackage.RULE_CALL__RULE:
				setRule((AbstractRule)null);
				return;
			case XtextPackage.RULE_CALL__ARGUMENTS:
				getArguments().clear();
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
			case XtextPackage.RULE_CALL__RULE:
				return rule != null;
			case XtextPackage.RULE_CALL__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuleCallImpl
