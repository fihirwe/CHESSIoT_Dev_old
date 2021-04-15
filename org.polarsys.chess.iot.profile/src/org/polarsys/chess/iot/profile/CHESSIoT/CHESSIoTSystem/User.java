/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Actor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.User#get_ <em></em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.User#getBase_Actor <em>Base Actor</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b></b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em></em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em></em>' reference list.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getUser__()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PhysicalEntity> get_();

	/**
	 * Returns the value of the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Actor</em>' reference.
	 * @see #setBase_Actor(Actor)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getUser_Base_Actor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Actor getBase_Actor();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.User#getBase_Actor <em>Base Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Actor</em>' reference.
	 * @see #getBase_Actor()
	 * @generated
	 */
	void setBase_Actor(Actor value);

} // User
