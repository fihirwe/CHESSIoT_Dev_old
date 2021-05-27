/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwareFactory
 * @model kind="package"
 * @generated
 */
public interface CHESSIoTSoftwarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CHESSIoTSoftware";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CHESSIoT/CHESSIoTSoftware.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CHESSIoT.CHESSIoTSoftware";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CHESSIoTSoftwarePackage eINSTANCE = org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoardImpl <em>Virtual Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoardImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getVirtualBoard()
	 * @generated
	 */
	int VIRTUAL_BOARD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD__BASE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD__BASE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Io TState</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD__IO_TSTATE = 3;

	/**
	 * The number of structural features of the '<em>Virtual Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Virtual Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTStateImpl <em>Io TState</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTStateImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIoTState()
	 * @generated
	 */
	int IO_TSTATE = 1;

	/**
	 * The feature id for the '<em><b>On Entry</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSTATE__ON_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>On Exit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSTATE__ON_EXIT = 1;

	/**
	 * The feature id for the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSTATE__BASE_STATE = 2;

	/**
	 * The feature id for the '<em><b>Internal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSTATE__INTERNAL = 3;

	/**
	 * The number of structural features of the '<em>Io TState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSTATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Io TState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSTATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTEventImpl <em>Io TEvent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTEventImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIoTEvent()
	 * @generated
	 */
	int IO_TEVENT = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TEVENT__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Io TEvent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TEVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Io TEvent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TEVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoard_VirtualBoardImpl <em>Virtual Board Virtual Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoard_VirtualBoardImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getVirtualBoard_VirtualBoard()
	 * @generated
	 */
	int VIRTUAL_BOARD_VIRTUAL_BOARD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD_VIRTUAL_BOARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Io TState</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD_VIRTUAL_BOARD__IO_TSTATE = 3;

	/**
	 * The feature id for the '<em><b>VE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD_VIRTUAL_BOARD__VE = 4;

	/**
	 * The number of structural features of the '<em>Virtual Board Virtual Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD_VIRTUAL_BOARD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Virtual Board Virtual Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD_VIRTUAL_BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SystemSWImpl <em>System SW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SystemSWImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getSystemSW()
	 * @generated
	 */
	int SYSTEM_SW = 5;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SW__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SW__BASE_COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>System SW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System SW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualEntityImpl <em>Virtual Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualEntityImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getVirtualEntity()
	 * @generated
	 */
	int VIRTUAL_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ENTITY__BASE_CLASS = SYSTEM_SW__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ENTITY__BASE_COMPONENT = SYSTEM_SW__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Physical Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ENTITY__PHYSICAL_ENTITY = SYSTEM_SW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ENTITY__BASE_BLOCK = SYSTEM_SW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Virtual Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ENTITY_FEATURE_COUNT = SYSTEM_SW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Virtual Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ENTITY_OPERATION_COUNT = SYSTEM_SW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoard_CopyOf_VirtualBoard_1Impl <em>Virtual Board Copy Of Virtual Board 1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoard_CopyOf_VirtualBoard_1Impl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getVirtualBoard_CopyOf_VirtualBoard_1()
	 * @generated
	 */
	int VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1 = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1__NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1__BASE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1__BASE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Io TState</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1__IO_TSTATE = 3;

	/**
	 * The feature id for the '<em><b>VE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1__VE = 4;

	/**
	 * The number of structural features of the '<em>Virtual Board Copy Of Virtual Board 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Virtual Board Copy Of Virtual Board 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IncomingEventImpl <em>Incoming Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IncomingEventImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIncomingEvent()
	 * @generated
	 */
	int INCOMING_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_EVENT__BASE_CLASS = IO_TEVENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_EVENT__BASE_BEHAVIOR = IO_TEVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_EVENT__RECEIVE = IO_TEVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_EVENT__INCOMING = IO_TEVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Incoming Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_EVENT_FEATURE_COUNT = IO_TEVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Incoming Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_EVENT_OPERATION_COUNT = IO_TEVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTActionImpl <em>Io TAction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTActionImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIoTAction()
	 * @generated
	 */
	int IO_TACTION = 9;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TACTION__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Io TAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Io TAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.ReceivePayloadImpl <em>Receive Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.ReceivePayloadImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getReceivePayload()
	 * @generated
	 */
	int RECEIVE_PAYLOAD = 8;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_PAYLOAD__BASE_CLASS = IO_TACTION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_PAYLOAD__BASE_OPERATION = IO_TACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_PAYLOAD__PAYLOAD = IO_TACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_PAYLOAD__BASE_EVENT = IO_TACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_PAYLOAD__BASE_ACTION = IO_TACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_PAYLOAD__PORT = IO_TACTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Receive Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_PAYLOAD_FEATURE_COUNT = IO_TACTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Receive Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_PAYLOAD_OPERATION_COUNT = IO_TACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.PayloadImpl <em>Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.PayloadImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getPayload()
	 * @generated
	 */
	int PAYLOAD = 10;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__BASE_COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__BASE_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.OutgoingEventImpl <em>Outgoing Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.OutgoingEventImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getOutgoingEvent()
	 * @generated
	 */
	int OUTGOING_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_EVENT__BASE_CLASS = IO_TEVENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Periodic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_EVENT__IS_PERIODIC = IO_TEVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_EVENT__TIME_INTERVAL = IO_TEVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Send</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_EVENT__SEND = IO_TEVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_EVENT__OUTGOING = IO_TEVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Outgoing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_EVENT_FEATURE_COUNT = IO_TEVENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Outgoing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_EVENT_OPERATION_COUNT = IO_TEVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SendPayloadImpl <em>Send Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SendPayloadImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getSendPayload()
	 * @generated
	 */
	int SEND_PAYLOAD = 12;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PAYLOAD__BASE_CLASS = IO_TACTION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PAYLOAD__BASE_OPERATION = IO_TACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PAYLOAD__PAYLOAD = IO_TACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PAYLOAD__BASE_EVENT = IO_TACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PAYLOAD__BASE_ACTION = IO_TACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PAYLOAD__PORT = IO_TACTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Send Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PAYLOAD_FEATURE_COUNT = IO_TACTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Send Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PAYLOAD_OPERATION_COUNT = IO_TACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl <em>State Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getStateTransition()
	 * @generated
	 */
	int STATE_TRANSITION = 13;

	/**
	 * The feature id for the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__BASE_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>State Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__STATE_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>State Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__STATE_TARGET = 2;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__GUARD_EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>State Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTElementImpl <em>Io TElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTElementImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIoTElement()
	 * @generated
	 */
	int IO_TELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TELEMENT__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Io TState</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TELEMENT__IO_TSTATE = 1;

	/**
	 * The number of structural features of the '<em>Io TElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Io TElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.GenericEventImpl <em>Generic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.GenericEventImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getGenericEvent()
	 * @generated
	 */
	int GENERIC_EVENT = 15;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EVENT__BASE_CLASS = IO_TEVENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Periodic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EVENT__IS_PERIODIC = IO_TEVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EVENT__TIME_INTERVAL = IO_TEVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Do</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EVENT__DO = IO_TEVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EVENT_FEATURE_COUNT = IO_TEVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Generic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EVENT_OPERATION_COUNT = IO_TEVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.GenericIoTActionImpl <em>Generic Io TAction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.GenericIoTActionImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getGenericIoTAction()
	 * @generated
	 */
	int GENERIC_IO_TACTION = 16;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IO_TACTION__BASE_CLASS = IO_TACTION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IO_TACTION__ACTION_NAME = IO_TACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Io TAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IO_TACTION_FEATURE_COUNT = IO_TACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generic Io TAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IO_TACTION_OPERATION_COUNT = IO_TACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.MessageContentImpl <em>Message Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.MessageContentImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getMessageContent()
	 * @generated
	 */
	int MESSAGE_CONTENT = 17;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONTENT__BASE_OPERATION = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONTENT__ = 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONTENT__BASE_PROPERTY = 2;

	/**
	 * The number of structural features of the '<em>Message Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONTENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Message Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONTENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard <em>Virtual Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Board</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard
	 * @generated
	 */
	EClass getVirtualBoard();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard#getName()
	 * @see #getVirtualBoard()
	 * @generated
	 */
	EAttribute getVirtualBoard_Name();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard#getBase_Component()
	 * @see #getVirtualBoard()
	 * @generated
	 */
	EReference getVirtualBoard_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard#getBase_Class()
	 * @see #getVirtualBoard()
	 * @generated
	 */
	EReference getVirtualBoard_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard#getIoTState <em>Io TState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Io TState</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard#getIoTState()
	 * @see #getVirtualBoard()
	 * @generated
	 */
	EReference getVirtualBoard_IoTState();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState <em>Io TState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TState</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState
	 * @generated
	 */
	EClass getIoTState();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState#getOnEntry <em>On Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Entry</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState#getOnEntry()
	 * @see #getIoTState()
	 * @generated
	 */
	EReference getIoTState_OnEntry();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState#getOnExit <em>On Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Exit</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState#getOnExit()
	 * @see #getIoTState()
	 * @generated
	 */
	EReference getIoTState_OnExit();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState#getBase_State <em>Base State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState#getBase_State()
	 * @see #getIoTState()
	 * @generated
	 */
	EReference getIoTState_Base_State();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState#getInternal <em>Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState#getInternal()
	 * @see #getIoTState()
	 * @generated
	 */
	EReference getIoTState_Internal();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTEvent <em>Io TEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TEvent</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTEvent
	 * @generated
	 */
	EClass getIoTEvent();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTEvent#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTEvent#getBase_Class()
	 * @see #getIoTEvent()
	 * @generated
	 */
	EReference getIoTEvent_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_VirtualBoard <em>Virtual Board Virtual Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Board Virtual Board</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_VirtualBoard
	 * @generated
	 */
	EClass getVirtualBoard_VirtualBoard();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_VirtualBoard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_VirtualBoard#getName()
	 * @see #getVirtualBoard_VirtualBoard()
	 * @generated
	 */
	EAttribute getVirtualBoard_VirtualBoard_Name();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_VirtualBoard#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_VirtualBoard#getBase_Component()
	 * @see #getVirtualBoard_VirtualBoard()
	 * @generated
	 */
	EReference getVirtualBoard_VirtualBoard_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_VirtualBoard#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_VirtualBoard#getBase_Class()
	 * @see #getVirtualBoard_VirtualBoard()
	 * @generated
	 */
	EReference getVirtualBoard_VirtualBoard_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_VirtualBoard#getIoTState <em>Io TState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Io TState</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_VirtualBoard#getIoTState()
	 * @see #getVirtualBoard_VirtualBoard()
	 * @generated
	 */
	EReference getVirtualBoard_VirtualBoard_IoTState();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_VirtualBoard#getVE <em>VE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VE</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_VirtualBoard#getVE()
	 * @see #getVirtualBoard_VirtualBoard()
	 * @generated
	 */
	EReference getVirtualBoard_VirtualBoard_VE();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity <em>Virtual Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Entity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity
	 * @generated
	 */
	EClass getVirtualEntity();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity#getPhysicalEntity <em>Physical Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physical Entity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity#getPhysicalEntity()
	 * @see #getVirtualEntity()
	 * @generated
	 */
	EReference getVirtualEntity_PhysicalEntity();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity#getBase_Block <em>Base Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Block</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity#getBase_Block()
	 * @see #getVirtualEntity()
	 * @generated
	 */
	EReference getVirtualEntity_Base_Block();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SystemSW <em>System SW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System SW</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SystemSW
	 * @generated
	 */
	EClass getSystemSW();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SystemSW#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SystemSW#getBase_Class()
	 * @see #getSystemSW()
	 * @generated
	 */
	EReference getSystemSW_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SystemSW#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SystemSW#getBase_Component()
	 * @see #getSystemSW()
	 * @generated
	 */
	EReference getSystemSW_Base_Component();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_CopyOf_VirtualBoard_1 <em>Virtual Board Copy Of Virtual Board 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Board Copy Of Virtual Board 1</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_CopyOf_VirtualBoard_1
	 * @generated
	 */
	EClass getVirtualBoard_CopyOf_VirtualBoard_1();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_CopyOf_VirtualBoard_1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_CopyOf_VirtualBoard_1#getName()
	 * @see #getVirtualBoard_CopyOf_VirtualBoard_1()
	 * @generated
	 */
	EAttribute getVirtualBoard_CopyOf_VirtualBoard_1_Name();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_CopyOf_VirtualBoard_1#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_CopyOf_VirtualBoard_1#getBase_Component()
	 * @see #getVirtualBoard_CopyOf_VirtualBoard_1()
	 * @generated
	 */
	EReference getVirtualBoard_CopyOf_VirtualBoard_1_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_CopyOf_VirtualBoard_1#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_CopyOf_VirtualBoard_1#getBase_Class()
	 * @see #getVirtualBoard_CopyOf_VirtualBoard_1()
	 * @generated
	 */
	EReference getVirtualBoard_CopyOf_VirtualBoard_1_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_CopyOf_VirtualBoard_1#getIoTState <em>Io TState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Io TState</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_CopyOf_VirtualBoard_1#getIoTState()
	 * @see #getVirtualBoard_CopyOf_VirtualBoard_1()
	 * @generated
	 */
	EReference getVirtualBoard_CopyOf_VirtualBoard_1_IoTState();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_CopyOf_VirtualBoard_1#getVE <em>VE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VE</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_CopyOf_VirtualBoard_1#getVE()
	 * @see #getVirtualBoard_CopyOf_VirtualBoard_1()
	 * @generated
	 */
	EReference getVirtualBoard_CopyOf_VirtualBoard_1_VE();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent <em>Incoming Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incoming Event</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent
	 * @generated
	 */
	EClass getIncomingEvent();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getBase_Behavior <em>Base Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Behavior</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getBase_Behavior()
	 * @see #getIncomingEvent()
	 * @generated
	 */
	EReference getIncomingEvent_Base_Behavior();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getReceive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receive</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getReceive()
	 * @see #getIncomingEvent()
	 * @generated
	 */
	EReference getIncomingEvent_Receive();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getIncoming()
	 * @see #getIncomingEvent()
	 * @generated
	 */
	EReference getIncomingEvent_Incoming();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload <em>Receive Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Payload</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload
	 * @generated
	 */
	EClass getReceivePayload();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload#getBase_Operation()
	 * @see #getReceivePayload()
	 * @generated
	 */
	EReference getReceivePayload_Base_Operation();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payload</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload#getPayload()
	 * @see #getReceivePayload()
	 * @generated
	 */
	EReference getReceivePayload_Payload();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload#getBase_Event <em>Base Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Event</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload#getBase_Event()
	 * @see #getReceivePayload()
	 * @generated
	 */
	EReference getReceivePayload_Base_Event();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload#getBase_Action <em>Base Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Action</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload#getBase_Action()
	 * @see #getReceivePayload()
	 * @generated
	 */
	EReference getReceivePayload_Base_Action();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload#getPort()
	 * @see #getReceivePayload()
	 * @generated
	 */
	EReference getReceivePayload_Port();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTAction <em>Io TAction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TAction</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTAction
	 * @generated
	 */
	EClass getIoTAction();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTAction#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTAction#getBase_Class()
	 * @see #getIoTAction()
	 * @generated
	 */
	EReference getIoTAction_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payload</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload
	 * @generated
	 */
	EClass getPayload();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload#getBase_Message()
	 * @see #getPayload()
	 * @generated
	 */
	EReference getPayload_Base_Message();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload#getBase_Comment()
	 * @see #getPayload()
	 * @generated
	 */
	EReference getPayload_Base_Comment();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload#getBase_Class()
	 * @see #getPayload()
	 * @generated
	 */
	EReference getPayload_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent <em>Outgoing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outgoing Event</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent
	 * @generated
	 */
	EClass getOutgoingEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#isPeriodic <em>Is Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Periodic</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#isPeriodic()
	 * @see #getOutgoingEvent()
	 * @generated
	 */
	EAttribute getOutgoingEvent_IsPeriodic();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Interval</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getTimeInterval()
	 * @see #getOutgoingEvent()
	 * @generated
	 */
	EAttribute getOutgoingEvent_TimeInterval();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Send</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getSend()
	 * @see #getOutgoingEvent()
	 * @generated
	 */
	EReference getOutgoingEvent_Send();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getOutgoing()
	 * @see #getOutgoingEvent()
	 * @generated
	 */
	EReference getOutgoingEvent_Outgoing();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload <em>Send Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Payload</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload
	 * @generated
	 */
	EClass getSendPayload();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getBase_Operation()
	 * @see #getSendPayload()
	 * @generated
	 */
	EReference getSendPayload_Base_Operation();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payload</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getPayload()
	 * @see #getSendPayload()
	 * @generated
	 */
	EReference getSendPayload_Payload();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getBase_Event <em>Base Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Event</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getBase_Event()
	 * @see #getSendPayload()
	 * @generated
	 */
	EReference getSendPayload_Base_Event();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getBase_Action <em>Base Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Action</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getBase_Action()
	 * @see #getSendPayload()
	 * @generated
	 */
	EReference getSendPayload_Base_Action();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getPort()
	 * @see #getSendPayload()
	 * @generated
	 */
	EReference getSendPayload_Port();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition <em>State Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Transition</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition
	 * @generated
	 */
	EClass getStateTransition();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getBase_Transition <em>Base Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Transition</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getBase_Transition()
	 * @see #getStateTransition()
	 * @generated
	 */
	EReference getStateTransition_Base_Transition();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getStateSource <em>State Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Source</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getStateSource()
	 * @see #getStateTransition()
	 * @generated
	 */
	EReference getStateTransition_StateSource();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getStateTarget <em>State Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Target</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getStateTarget()
	 * @see #getStateTransition()
	 * @generated
	 */
	EReference getStateTransition_StateTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getGuardExpression()
	 * @see #getStateTransition()
	 * @generated
	 */
	EAttribute getStateTransition_GuardExpression();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTElement <em>Io TElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TElement</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTElement
	 * @generated
	 */
	EClass getIoTElement();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTElement#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTElement#getBase_Component()
	 * @see #getIoTElement()
	 * @generated
	 */
	EReference getIoTElement_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTElement#getIoTState <em>Io TState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Io TState</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTElement#getIoTState()
	 * @see #getIoTElement()
	 * @generated
	 */
	EReference getIoTElement_IoTState();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericEvent <em>Generic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Event</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericEvent
	 * @generated
	 */
	EClass getGenericEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericEvent#isPeriodic <em>Is Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Periodic</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericEvent#isPeriodic()
	 * @see #getGenericEvent()
	 * @generated
	 */
	EAttribute getGenericEvent_IsPeriodic();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericEvent#getTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Interval</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericEvent#getTimeInterval()
	 * @see #getGenericEvent()
	 * @generated
	 */
	EAttribute getGenericEvent_TimeInterval();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericEvent#getDo <em>Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Do</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericEvent#getDo()
	 * @see #getGenericEvent()
	 * @generated
	 */
	EReference getGenericEvent_Do();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericIoTAction <em>Generic Io TAction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Io TAction</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericIoTAction
	 * @generated
	 */
	EClass getGenericIoTAction();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericIoTAction#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericIoTAction#getActionName()
	 * @see #getGenericIoTAction()
	 * @generated
	 */
	EAttribute getGenericIoTAction_ActionName();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MessageContent <em>Message Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Content</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MessageContent
	 * @generated
	 */
	EClass getMessageContent();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MessageContent#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MessageContent#getBase_Operation()
	 * @see #getMessageContent()
	 * @generated
	 */
	EReference getMessageContent_Base_Operation();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MessageContent#get_ <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MessageContent#get_()
	 * @see #getMessageContent()
	 * @generated
	 */
	EReference getMessageContent__();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MessageContent#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MessageContent#getBase_Property()
	 * @see #getMessageContent()
	 * @generated
	 */
	EReference getMessageContent_Base_Property();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CHESSIoTSoftwareFactory getCHESSIoTSoftwareFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoardImpl <em>Virtual Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoardImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getVirtualBoard()
		 * @generated
		 */
		EClass VIRTUAL_BOARD = eINSTANCE.getVirtualBoard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_BOARD__NAME = eINSTANCE.getVirtualBoard_Name();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_BOARD__BASE_COMPONENT = eINSTANCE.getVirtualBoard_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_BOARD__BASE_CLASS = eINSTANCE.getVirtualBoard_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Io TState</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_BOARD__IO_TSTATE = eINSTANCE.getVirtualBoard_IoTState();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTStateImpl <em>Io TState</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTStateImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIoTState()
		 * @generated
		 */
		EClass IO_TSTATE = eINSTANCE.getIoTState();

		/**
		 * The meta object literal for the '<em><b>On Entry</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TSTATE__ON_ENTRY = eINSTANCE.getIoTState_OnEntry();

		/**
		 * The meta object literal for the '<em><b>On Exit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TSTATE__ON_EXIT = eINSTANCE.getIoTState_OnExit();

		/**
		 * The meta object literal for the '<em><b>Base State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TSTATE__BASE_STATE = eINSTANCE.getIoTState_Base_State();

		/**
		 * The meta object literal for the '<em><b>Internal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TSTATE__INTERNAL = eINSTANCE.getIoTState_Internal();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTEventImpl <em>Io TEvent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTEventImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIoTEvent()
		 * @generated
		 */
		EClass IO_TEVENT = eINSTANCE.getIoTEvent();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TEVENT__BASE_CLASS = eINSTANCE.getIoTEvent_Base_Class();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoard_VirtualBoardImpl <em>Virtual Board Virtual Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoard_VirtualBoardImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getVirtualBoard_VirtualBoard()
		 * @generated
		 */
		EClass VIRTUAL_BOARD_VIRTUAL_BOARD = eINSTANCE.getVirtualBoard_VirtualBoard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_BOARD_VIRTUAL_BOARD__NAME = eINSTANCE.getVirtualBoard_VirtualBoard_Name();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_COMPONENT = eINSTANCE.getVirtualBoard_VirtualBoard_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_CLASS = eINSTANCE.getVirtualBoard_VirtualBoard_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Io TState</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_BOARD_VIRTUAL_BOARD__IO_TSTATE = eINSTANCE.getVirtualBoard_VirtualBoard_IoTState();

		/**
		 * The meta object literal for the '<em><b>VE</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_BOARD_VIRTUAL_BOARD__VE = eINSTANCE.getVirtualBoard_VirtualBoard_VE();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualEntityImpl <em>Virtual Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualEntityImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getVirtualEntity()
		 * @generated
		 */
		EClass VIRTUAL_ENTITY = eINSTANCE.getVirtualEntity();

		/**
		 * The meta object literal for the '<em><b>Physical Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_ENTITY__PHYSICAL_ENTITY = eINSTANCE.getVirtualEntity_PhysicalEntity();

		/**
		 * The meta object literal for the '<em><b>Base Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_ENTITY__BASE_BLOCK = eINSTANCE.getVirtualEntity_Base_Block();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SystemSWImpl <em>System SW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SystemSWImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getSystemSW()
		 * @generated
		 */
		EClass SYSTEM_SW = eINSTANCE.getSystemSW();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_SW__BASE_CLASS = eINSTANCE.getSystemSW_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_SW__BASE_COMPONENT = eINSTANCE.getSystemSW_Base_Component();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoard_CopyOf_VirtualBoard_1Impl <em>Virtual Board Copy Of Virtual Board 1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoard_CopyOf_VirtualBoard_1Impl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getVirtualBoard_CopyOf_VirtualBoard_1()
		 * @generated
		 */
		EClass VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1 = eINSTANCE.getVirtualBoard_CopyOf_VirtualBoard_1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1__NAME = eINSTANCE.getVirtualBoard_CopyOf_VirtualBoard_1_Name();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1__BASE_COMPONENT = eINSTANCE.getVirtualBoard_CopyOf_VirtualBoard_1_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1__BASE_CLASS = eINSTANCE.getVirtualBoard_CopyOf_VirtualBoard_1_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Io TState</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1__IO_TSTATE = eINSTANCE.getVirtualBoard_CopyOf_VirtualBoard_1_IoTState();

		/**
		 * The meta object literal for the '<em><b>VE</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1__VE = eINSTANCE.getVirtualBoard_CopyOf_VirtualBoard_1_VE();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IncomingEventImpl <em>Incoming Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IncomingEventImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIncomingEvent()
		 * @generated
		 */
		EClass INCOMING_EVENT = eINSTANCE.getIncomingEvent();

		/**
		 * The meta object literal for the '<em><b>Base Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMING_EVENT__BASE_BEHAVIOR = eINSTANCE.getIncomingEvent_Base_Behavior();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMING_EVENT__RECEIVE = eINSTANCE.getIncomingEvent_Receive();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMING_EVENT__INCOMING = eINSTANCE.getIncomingEvent_Incoming();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.ReceivePayloadImpl <em>Receive Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.ReceivePayloadImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getReceivePayload()
		 * @generated
		 */
		EClass RECEIVE_PAYLOAD = eINSTANCE.getReceivePayload();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_PAYLOAD__BASE_OPERATION = eINSTANCE.getReceivePayload_Base_Operation();

		/**
		 * The meta object literal for the '<em><b>Payload</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_PAYLOAD__PAYLOAD = eINSTANCE.getReceivePayload_Payload();

		/**
		 * The meta object literal for the '<em><b>Base Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_PAYLOAD__BASE_EVENT = eINSTANCE.getReceivePayload_Base_Event();

		/**
		 * The meta object literal for the '<em><b>Base Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_PAYLOAD__BASE_ACTION = eINSTANCE.getReceivePayload_Base_Action();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_PAYLOAD__PORT = eINSTANCE.getReceivePayload_Port();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTActionImpl <em>Io TAction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTActionImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIoTAction()
		 * @generated
		 */
		EClass IO_TACTION = eINSTANCE.getIoTAction();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TACTION__BASE_CLASS = eINSTANCE.getIoTAction_Base_Class();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.PayloadImpl <em>Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.PayloadImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getPayload()
		 * @generated
		 */
		EClass PAYLOAD = eINSTANCE.getPayload();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYLOAD__BASE_MESSAGE = eINSTANCE.getPayload_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYLOAD__BASE_COMMENT = eINSTANCE.getPayload_Base_Comment();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYLOAD__BASE_CLASS = eINSTANCE.getPayload_Base_Class();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.OutgoingEventImpl <em>Outgoing Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.OutgoingEventImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getOutgoingEvent()
		 * @generated
		 */
		EClass OUTGOING_EVENT = eINSTANCE.getOutgoingEvent();

		/**
		 * The meta object literal for the '<em><b>Is Periodic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTGOING_EVENT__IS_PERIODIC = eINSTANCE.getOutgoingEvent_IsPeriodic();

		/**
		 * The meta object literal for the '<em><b>Time Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTGOING_EVENT__TIME_INTERVAL = eINSTANCE.getOutgoingEvent_TimeInterval();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_EVENT__SEND = eINSTANCE.getOutgoingEvent_Send();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_EVENT__OUTGOING = eINSTANCE.getOutgoingEvent_Outgoing();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SendPayloadImpl <em>Send Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SendPayloadImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getSendPayload()
		 * @generated
		 */
		EClass SEND_PAYLOAD = eINSTANCE.getSendPayload();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_PAYLOAD__BASE_OPERATION = eINSTANCE.getSendPayload_Base_Operation();

		/**
		 * The meta object literal for the '<em><b>Payload</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_PAYLOAD__PAYLOAD = eINSTANCE.getSendPayload_Payload();

		/**
		 * The meta object literal for the '<em><b>Base Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_PAYLOAD__BASE_EVENT = eINSTANCE.getSendPayload_Base_Event();

		/**
		 * The meta object literal for the '<em><b>Base Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_PAYLOAD__BASE_ACTION = eINSTANCE.getSendPayload_Base_Action();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_PAYLOAD__PORT = eINSTANCE.getSendPayload_Port();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl <em>State Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getStateTransition()
		 * @generated
		 */
		EClass STATE_TRANSITION = eINSTANCE.getStateTransition();

		/**
		 * The meta object literal for the '<em><b>Base Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_TRANSITION__BASE_TRANSITION = eINSTANCE.getStateTransition_Base_Transition();

		/**
		 * The meta object literal for the '<em><b>State Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_TRANSITION__STATE_SOURCE = eINSTANCE.getStateTransition_StateSource();

		/**
		 * The meta object literal for the '<em><b>State Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_TRANSITION__STATE_TARGET = eINSTANCE.getStateTransition_StateTarget();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_TRANSITION__GUARD_EXPRESSION = eINSTANCE.getStateTransition_GuardExpression();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTElementImpl <em>Io TElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTElementImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIoTElement()
		 * @generated
		 */
		EClass IO_TELEMENT = eINSTANCE.getIoTElement();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TELEMENT__BASE_COMPONENT = eINSTANCE.getIoTElement_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Io TState</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TELEMENT__IO_TSTATE = eINSTANCE.getIoTElement_IoTState();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.GenericEventImpl <em>Generic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.GenericEventImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getGenericEvent()
		 * @generated
		 */
		EClass GENERIC_EVENT = eINSTANCE.getGenericEvent();

		/**
		 * The meta object literal for the '<em><b>Is Periodic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_EVENT__IS_PERIODIC = eINSTANCE.getGenericEvent_IsPeriodic();

		/**
		 * The meta object literal for the '<em><b>Time Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_EVENT__TIME_INTERVAL = eINSTANCE.getGenericEvent_TimeInterval();

		/**
		 * The meta object literal for the '<em><b>Do</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_EVENT__DO = eINSTANCE.getGenericEvent_Do();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.GenericIoTActionImpl <em>Generic Io TAction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.GenericIoTActionImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getGenericIoTAction()
		 * @generated
		 */
		EClass GENERIC_IO_TACTION = eINSTANCE.getGenericIoTAction();

		/**
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_IO_TACTION__ACTION_NAME = eINSTANCE.getGenericIoTAction_ActionName();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.MessageContentImpl <em>Message Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.MessageContentImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getMessageContent()
		 * @generated
		 */
		EClass MESSAGE_CONTENT = eINSTANCE.getMessageContent();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_CONTENT__BASE_OPERATION = eINSTANCE.getMessageContent_Base_Operation();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_CONTENT__ = eINSTANCE.getMessageContent__();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_CONTENT__BASE_PROPERTY = eINSTANCE.getMessageContent_Base_Property();

	}

} //CHESSIoTSoftwarePackage
