/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incoming Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getBase_Behavior <em>Base Behavior</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getIncomingEvent()
 * @model
 * @generated
 */
public interface IncomingEvent extends IoTEvent {
	/**
	 * Returns the value of the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Behavior</em>' reference.
	 * @see #setBase_Behavior(Behavior)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getIncomingEvent_Base_Behavior()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Behavior getBase_Behavior();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getBase_Behavior <em>Base Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Behavior</em>' reference.
	 * @see #getBase_Behavior()
	 * @generated
	 */
	void setBase_Behavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Receive</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive</em>' reference list.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getIncomingEvent_Receive()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ReceivePayload> getReceive();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(OutgoingEvent)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getIncomingEvent_Incoming()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OutgoingEvent getIncoming();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(OutgoingEvent value);

} // IncomingEvent
