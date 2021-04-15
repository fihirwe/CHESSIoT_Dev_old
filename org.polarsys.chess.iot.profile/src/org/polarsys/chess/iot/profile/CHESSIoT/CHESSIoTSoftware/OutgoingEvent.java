/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outgoing Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#isPeriodic <em>Is Periodic</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getSend <em>Send</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getOutgoingEvent()
 * @model
 * @generated
 */
public interface OutgoingEvent extends IoTEvent {
	/**
	 * Returns the value of the '<em><b>Is Periodic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Periodic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Periodic</em>' attribute.
	 * @see #setIsPeriodic(boolean)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getOutgoingEvent_IsPeriodic()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPeriodic();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#isPeriodic <em>Is Periodic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Periodic</em>' attribute.
	 * @see #isPeriodic()
	 * @generated
	 */
	void setIsPeriodic(boolean value);

	/**
	 * Returns the value of the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Interval</em>' attribute.
	 * @see #setTimeInterval(int)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getOutgoingEvent_TimeInterval()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getTimeInterval();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getTimeInterval <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Interval</em>' attribute.
	 * @see #getTimeInterval()
	 * @generated
	 */
	void setTimeInterval(int value);

	/**
	 * Returns the value of the '<em><b>Send</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send</em>' reference list.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getOutgoingEvent_Send()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SendPayload> getSend();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference.
	 * @see #setOutgoing(IncomingEvent)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getOutgoingEvent_Outgoing()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IncomingEvent getOutgoing();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(IncomingEvent value);

} // OutgoingEvent
