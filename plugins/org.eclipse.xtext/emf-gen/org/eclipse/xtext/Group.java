/**
 */
package org.eclipse.xtext;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.Group#getGuardConditions <em>Guard Conditions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.XtextPackage#getGroup()
 * @model
 * @generated
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface Group extends CompoundElement {
	/**
	 * Returns the value of the '<em><b>Guard Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.GuardCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 2.9
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Conditions</em>' containment reference list.
	 * @see org.eclipse.xtext.XtextPackage#getGroup_GuardConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<GuardCondition> getGuardConditions();

} // Group
