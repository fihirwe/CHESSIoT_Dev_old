/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage
 * @generated
 */
public interface CHESSIoTSoftwareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CHESSIoTSoftwareFactory eINSTANCE = org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwareFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Virtual Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Board</em>'.
	 * @generated
	 */
	VirtualBoard createVirtualBoard();

	/**
	 * Returns a new object of class '<em>Io TState</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io TState</em>'.
	 * @generated
	 */
	IoTState createIoTState();

	/**
	 * Returns a new object of class '<em>Io TEvent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io TEvent</em>'.
	 * @generated
	 */
	IoTEvent createIoTEvent();

	/**
	 * Returns a new object of class '<em>Virtual Board Virtual Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Board Virtual Board</em>'.
	 * @generated
	 */
	VirtualBoard_VirtualBoard createVirtualBoard_VirtualBoard();

	/**
	 * Returns a new object of class '<em>Virtual Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Entity</em>'.
	 * @generated
	 */
	VirtualEntity createVirtualEntity();

	/**
	 * Returns a new object of class '<em>System SW</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System SW</em>'.
	 * @generated
	 */
	SystemSW createSystemSW();

	/**
	 * Returns a new object of class '<em>Virtual Board Copy Of Virtual Board 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Board Copy Of Virtual Board 1</em>'.
	 * @generated
	 */
	VirtualBoard_CopyOf_VirtualBoard_1 createVirtualBoard_CopyOf_VirtualBoard_1();

	/**
	 * Returns a new object of class '<em>Incoming Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incoming Event</em>'.
	 * @generated
	 */
	IncomingEvent createIncomingEvent();

	/**
	 * Returns a new object of class '<em>Receive Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Payload</em>'.
	 * @generated
	 */
	ReceivePayload createReceivePayload();

	/**
	 * Returns a new object of class '<em>Io TAction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io TAction</em>'.
	 * @generated
	 */
	IoTAction createIoTAction();

	/**
	 * Returns a new object of class '<em>Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payload</em>'.
	 * @generated
	 */
	Payload createPayload();

	/**
	 * Returns a new object of class '<em>Outgoing Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outgoing Event</em>'.
	 * @generated
	 */
	OutgoingEvent createOutgoingEvent();

	/**
	 * Returns a new object of class '<em>Send Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Payload</em>'.
	 * @generated
	 */
	SendPayload createSendPayload();

	/**
	 * Returns a new object of class '<em>State Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Transition</em>'.
	 * @generated
	 */
	StateTransition createStateTransition();

	/**
	 * Returns a new object of class '<em>Io TElement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io TElement</em>'.
	 * @generated
	 */
	IoTElement createIoTElement();

	/**
	 * Returns a new object of class '<em>Generic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Event</em>'.
	 * @generated
	 */
	GenericEvent createGenericEvent();

	/**
	 * Returns a new object of class '<em>Generic Io TAction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Io TAction</em>'.
	 * @generated
	 */
	GenericIoTAction createGenericIoTAction();

	/**
	 * Returns a new object of class '<em>Message Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Content</em>'.
	 * @generated
	 */
	MessageContent createMessageContent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CHESSIoTSoftwarePackage getCHESSIoTSoftwarePackage();

} //CHESSIoTSoftwareFactory
