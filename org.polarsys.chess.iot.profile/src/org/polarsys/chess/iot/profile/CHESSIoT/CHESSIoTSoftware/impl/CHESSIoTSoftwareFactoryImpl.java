/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CHESSIoTSoftwareFactoryImpl extends EFactoryImpl implements CHESSIoTSoftwareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CHESSIoTSoftwareFactory init() {
		try {
			CHESSIoTSoftwareFactory theCHESSIoTSoftwareFactory = (CHESSIoTSoftwareFactory)EPackage.Registry.INSTANCE.getEFactory(CHESSIoTSoftwarePackage.eNS_URI);
			if (theCHESSIoTSoftwareFactory != null) {
				return theCHESSIoTSoftwareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CHESSIoTSoftwareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSoftwareFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD: return createVirtualBoard();
			case CHESSIoTSoftwarePackage.IO_TSTATE: return createIoTState();
			case CHESSIoTSoftwarePackage.IO_TEVENT: return createIoTEvent();
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD: return createVirtualBoard_VirtualBoard();
			case CHESSIoTSoftwarePackage.VIRTUAL_ENTITY: return createVirtualEntity();
			case CHESSIoTSoftwarePackage.SYSTEM_SW: return createSystemSW();
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1: return createVirtualBoard_CopyOf_VirtualBoard_1();
			case CHESSIoTSoftwarePackage.INCOMING_EVENT: return createIncomingEvent();
			case CHESSIoTSoftwarePackage.RECEIVE_PAYLOAD: return createReceivePayload();
			case CHESSIoTSoftwarePackage.IO_TACTION: return createIoTAction();
			case CHESSIoTSoftwarePackage.PAYLOAD: return createPayload();
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT: return createOutgoingEvent();
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD: return createSendPayload();
			case CHESSIoTSoftwarePackage.STATE_TRANSITION: return createStateTransition();
			case CHESSIoTSoftwarePackage.IO_TELEMENT: return createIoTElement();
			case CHESSIoTSoftwarePackage.GENERIC_EVENT: return createGenericEvent();
			case CHESSIoTSoftwarePackage.GENERIC_IO_TACTION: return createGenericIoTAction();
			case CHESSIoTSoftwarePackage.MESSAGE_CONTENT: return createMessageContent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBoard createVirtualBoard() {
		VirtualBoardImpl virtualBoard = new VirtualBoardImpl();
		return virtualBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTState createIoTState() {
		IoTStateImpl ioTState = new IoTStateImpl();
		return ioTState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTEvent createIoTEvent() {
		IoTEventImpl ioTEvent = new IoTEventImpl();
		return ioTEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBoard_VirtualBoard createVirtualBoard_VirtualBoard() {
		VirtualBoard_VirtualBoardImpl virtualBoard_VirtualBoard = new VirtualBoard_VirtualBoardImpl();
		return virtualBoard_VirtualBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualEntity createVirtualEntity() {
		VirtualEntityImpl virtualEntity = new VirtualEntityImpl();
		return virtualEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSW createSystemSW() {
		SystemSWImpl systemSW = new SystemSWImpl();
		return systemSW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBoard_CopyOf_VirtualBoard_1 createVirtualBoard_CopyOf_VirtualBoard_1() {
		VirtualBoard_CopyOf_VirtualBoard_1Impl virtualBoard_CopyOf_VirtualBoard_1 = new VirtualBoard_CopyOf_VirtualBoard_1Impl();
		return virtualBoard_CopyOf_VirtualBoard_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingEvent createIncomingEvent() {
		IncomingEventImpl incomingEvent = new IncomingEventImpl();
		return incomingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceivePayload createReceivePayload() {
		ReceivePayloadImpl receivePayload = new ReceivePayloadImpl();
		return receivePayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTAction createIoTAction() {
		IoTActionImpl ioTAction = new IoTActionImpl();
		return ioTAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payload createPayload() {
		PayloadImpl payload = new PayloadImpl();
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingEvent createOutgoingEvent() {
		OutgoingEventImpl outgoingEvent = new OutgoingEventImpl();
		return outgoingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendPayload createSendPayload() {
		SendPayloadImpl sendPayload = new SendPayloadImpl();
		return sendPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTransition createStateTransition() {
		StateTransitionImpl stateTransition = new StateTransitionImpl();
		return stateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTElement createIoTElement() {
		IoTElementImpl ioTElement = new IoTElementImpl();
		return ioTElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericEvent createGenericEvent() {
		GenericEventImpl genericEvent = new GenericEventImpl();
		return genericEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericIoTAction createGenericIoTAction() {
		GenericIoTActionImpl genericIoTAction = new GenericIoTActionImpl();
		return genericIoTAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageContent createMessageContent() {
		MessageContentImpl messageContent = new MessageContentImpl();
		return messageContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSoftwarePackage getCHESSIoTSoftwarePackage() {
		return (CHESSIoTSoftwarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CHESSIoTSoftwarePackage getPackage() {
		return CHESSIoTSoftwarePackage.eINSTANCE;
	}

} //CHESSIoTSoftwareFactoryImpl
