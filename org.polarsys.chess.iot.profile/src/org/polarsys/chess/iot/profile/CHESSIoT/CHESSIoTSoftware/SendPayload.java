/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.GCM.ClientServerPort;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Payload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getBase_Operation <em>Base Operation</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getBase_Event <em>Base Event</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getBase_Action <em>Base Action</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getSendPayload()
 * @model
 * @generated
 */
public interface SendPayload extends IoTAction {
	/**
	 * Returns the value of the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Operation</em>' reference.
	 * @see #setBase_Operation(Operation)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getSendPayload_Base_Operation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Operation getBase_Operation();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getBase_Operation <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Operation</em>' reference.
	 * @see #getBase_Operation()
	 * @generated
	 */
	void setBase_Operation(Operation value);

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payload</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' reference list.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getSendPayload_Payload()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Payload> getPayload();

	/**
	 * Returns the value of the '<em><b>Base Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Event</em>' reference.
	 * @see #setBase_Event(Event)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getSendPayload_Base_Event()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Event getBase_Event();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getBase_Event <em>Base Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Event</em>' reference.
	 * @see #getBase_Event()
	 * @generated
	 */
	void setBase_Event(Event value);

	/**
	 * Returns the value of the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Action</em>' reference.
	 * @see #setBase_Action(Action)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getSendPayload_Base_Action()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Action getBase_Action();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getBase_Action <em>Base Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Action</em>' reference.
	 * @see #getBase_Action()
	 * @generated
	 */
	void setBase_Action(Action value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(ClientServerPort)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getSendPayload_Port()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ClientServerPort getPort();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(ClientServerPort value);

} // SendPayload
