/**
 */
package org.eclipse.xtext;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.GuardCondition#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.xtext.GuardCondition#isPassIfTrue <em>Pass If True</em>}</li>
 * </ul>
 *
 * @since 2.9
 * @see org.eclipse.xtext.XtextPackage#getGuardCondition()
 * @model
 * @generated
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface GuardCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see org.eclipse.xtext.XtextPackage#getGuardCondition_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.GuardCondition#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Pass If True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pass If True</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass If True</em>' attribute.
	 * @see #isSetPassIfTrue()
	 * @see #unsetPassIfTrue()
	 * @see #setPassIfTrue(boolean)
	 * @see org.eclipse.xtext.XtextPackage#getGuardCondition_PassIfTrue()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isPassIfTrue();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.GuardCondition#isPassIfTrue <em>Pass If True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass If True</em>' attribute.
	 * @see #isSetPassIfTrue()
	 * @see #unsetPassIfTrue()
	 * @see #isPassIfTrue()
	 * @generated
	 */
	void setPassIfTrue(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.xtext.GuardCondition#isPassIfTrue <em>Pass If True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPassIfTrue()
	 * @see #isPassIfTrue()
	 * @see #setPassIfTrue(boolean)
	 * @generated
	 */
	void unsetPassIfTrue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.xtext.GuardCondition#isPassIfTrue <em>Pass If True</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pass If True</em>' attribute is set.
	 * @see #unsetPassIfTrue()
	 * @see #isPassIfTrue()
	 * @see #setPassIfTrue(boolean)
	 * @generated
	 */
	boolean isSetPassIfTrue();

} // GuardCondition
