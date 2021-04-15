/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Communication#getComType <em>Com Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Communication#getComMode <em>Com Mode</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Communication#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage#getCommunication()
 * @model
 * @generated
 */
public interface Communication extends EObject {
	/**
	 * Returns the value of the '<em><b>Com Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Type</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationType
	 * @see #setComType(CommunicationType)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage#getCommunication_ComType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CommunicationType getComType();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Communication#getComType <em>Com Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Type</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationType
	 * @see #getComType()
	 * @generated
	 */
	void setComType(CommunicationType value);

	/**
	 * Returns the value of the '<em><b>Com Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Mode</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationMode
	 * @see #setComMode(CommunicationMode)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage#getCommunication_ComMode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CommunicationMode getComMode();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Communication#getComMode <em>Com Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Mode</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationMode
	 * @see #getComMode()
	 * @generated
	 */
	void setComMode(CommunicationMode value);

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage#getCommunication_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Communication#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // Communication
