/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.sysml.blocks.BlocksPackage;

import org.eclipse.papyrus.sysml.portandflows.PortandflowsPackage;

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
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemFactory
 * @model kind="package"
 * @generated
 */
public interface CHESSIoTSystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CHESSIoTSystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CHESSIoT/CHESSIoTSystem.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CHESSIoT.CHESSIoTSystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CHESSIoTSystemPackage eINSTANCE = org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTBoardImpl <em>Io TBoard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTBoardImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getIoTBoard()
	 * @generated
	 */
	int IO_TBOARD = 0;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TBOARD__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TBOARD__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Board Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TBOARD__BOARD_TYPE = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TBOARD__MODE = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Io TBoard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TBOARD_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Io TBoard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TBOARD_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SensorBlockImpl <em>Sensor Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SensorBlockImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getSensorBlock()
	 * @generated
	 */
	int SENSOR_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Sensor Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.RFModuleImpl <em>RF Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.RFModuleImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getRFModule()
	 * @generated
	 */
	int RF_MODULE = 2;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RF_MODULE__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RF_MODULE__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>RF Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RF_MODULE_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RF Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RF_MODULE_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ActuatingBlockImpl <em>Actuating Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ActuatingBlockImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getActuatingBlock()
	 * @generated
	 */
	int ACTUATING_BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Actuating Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuating Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PowerSourceImpl <em>Power Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PowerSourceImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getPowerSource()
	 * @generated
	 */
	int POWER_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Power Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Power Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SOURCE_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SerialInOutImpl <em>Serial In Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SerialInOutImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getSerialInOut()
	 * @generated
	 */
	int SERIAL_IN_OUT = 5;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_IN_OUT__BASE_PORT = PortandflowsPackage.FLOW_PORT__BASE_PORT;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_IN_OUT__IS_ATOMIC = PortandflowsPackage.FLOW_PORT__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Is Conjugated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_IN_OUT__IS_CONJUGATED = PortandflowsPackage.FLOW_PORT__IS_CONJUGATED;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_IN_OUT__DIRECTION = PortandflowsPackage.FLOW_PORT__DIRECTION;

	/**
	 * The number of structural features of the '<em>Serial In Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_IN_OUT_FEATURE_COUNT = PortandflowsPackage.FLOW_PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Icon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_IN_OUT___GET_ICON = PortandflowsPackage.FLOW_PORT___GET_ICON;

	/**
	 * The number of operations of the '<em>Serial In Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_IN_OUT_OPERATION_COUNT = PortandflowsPackage.FLOW_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTServerImpl <em>Io TServer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTServerImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getIoTServer()
	 * @generated
	 */
	int IO_TSERVER = 7;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSERVER__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSERVER__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Io TServer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSERVER_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Io TServer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSERVER_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTGatewayImpl <em>Io TGateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTGatewayImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getIoTGateway()
	 * @generated
	 */
	int IO_TGATEWAY = 6;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TGATEWAY__IS_ENCAPSULATED = IO_TSERVER__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TGATEWAY__BASE_CLASS = IO_TSERVER__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Io TGateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TGATEWAY_FEATURE_COUNT = IO_TSERVER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Io TGateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TGATEWAY_OPERATION_COUNT = IO_TSERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.UserImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getUser()
	 * @generated
	 */
	int USER = 8;

	/**
	 * The feature id for the '<em><b></b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ = 0;

	/**
	 * The feature id for the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BASE_ACTOR = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalEntityImpl <em>Physical Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalEntityImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getPhysicalEntity()
	 * @generated
	 */
	int PHYSICAL_ENTITY = 9;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Physical Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.BoardType <em>Board Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.BoardType
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getBoardType()
	 * @generated
	 */
	int BOARD_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.TransmissionMode <em>Transmission Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.TransmissionMode
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getTransmissionMode()
	 * @generated
	 */
	int TRANSMISSION_MODE = 11;


	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTBoard <em>Io TBoard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TBoard</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTBoard
	 * @generated
	 */
	EClass getIoTBoard();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTBoard#getBoardType <em>Board Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTBoard#getBoardType()
	 * @see #getIoTBoard()
	 * @generated
	 */
	EAttribute getIoTBoard_BoardType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTBoard#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTBoard#getMode()
	 * @see #getIoTBoard()
	 * @generated
	 */
	EAttribute getIoTBoard_Mode();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock <em>Sensor Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Block</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock
	 * @generated
	 */
	EClass getSensorBlock();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.RFModule <em>RF Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RF Module</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.RFModule
	 * @generated
	 */
	EClass getRFModule();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock <em>Actuating Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuating Block</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock
	 * @generated
	 */
	EClass getActuatingBlock();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PowerSource <em>Power Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Source</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PowerSource
	 * @generated
	 */
	EClass getPowerSource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SerialInOut <em>Serial In Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serial In Out</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SerialInOut
	 * @generated
	 */
	EClass getSerialInOut();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTGateway <em>Io TGateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TGateway</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTGateway
	 * @generated
	 */
	EClass getIoTGateway();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTServer <em>Io TServer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TServer</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTServer
	 * @generated
	 */
	EClass getIoTServer();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.User#get_ <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em></em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.User#get_()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser__();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.User#getBase_Actor <em>Base Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Actor</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.User#getBase_Actor()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Base_Actor();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity <em>Physical Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Entity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity
	 * @generated
	 */
	EClass getPhysicalEntity();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.BoardType <em>Board Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Board Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.BoardType
	 * @generated
	 */
	EEnum getBoardType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.TransmissionMode <em>Transmission Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transmission Mode</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.TransmissionMode
	 * @generated
	 */
	EEnum getTransmissionMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CHESSIoTSystemFactory getCHESSIoTSystemFactory();

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
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTBoardImpl <em>Io TBoard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTBoardImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getIoTBoard()
		 * @generated
		 */
		EClass IO_TBOARD = eINSTANCE.getIoTBoard();

		/**
		 * The meta object literal for the '<em><b>Board Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_TBOARD__BOARD_TYPE = eINSTANCE.getIoTBoard_BoardType();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_TBOARD__MODE = eINSTANCE.getIoTBoard_Mode();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SensorBlockImpl <em>Sensor Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SensorBlockImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getSensorBlock()
		 * @generated
		 */
		EClass SENSOR_BLOCK = eINSTANCE.getSensorBlock();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.RFModuleImpl <em>RF Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.RFModuleImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getRFModule()
		 * @generated
		 */
		EClass RF_MODULE = eINSTANCE.getRFModule();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ActuatingBlockImpl <em>Actuating Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ActuatingBlockImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getActuatingBlock()
		 * @generated
		 */
		EClass ACTUATING_BLOCK = eINSTANCE.getActuatingBlock();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PowerSourceImpl <em>Power Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PowerSourceImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getPowerSource()
		 * @generated
		 */
		EClass POWER_SOURCE = eINSTANCE.getPowerSource();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SerialInOutImpl <em>Serial In Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SerialInOutImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getSerialInOut()
		 * @generated
		 */
		EClass SERIAL_IN_OUT = eINSTANCE.getSerialInOut();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTGatewayImpl <em>Io TGateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTGatewayImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getIoTGateway()
		 * @generated
		 */
		EClass IO_TGATEWAY = eINSTANCE.getIoTGateway();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTServerImpl <em>Io TServer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTServerImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getIoTServer()
		 * @generated
		 */
		EClass IO_TSERVER = eINSTANCE.getIoTServer();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.UserImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ = eINSTANCE.getUser__();

		/**
		 * The meta object literal for the '<em><b>Base Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__BASE_ACTOR = eINSTANCE.getUser_Base_Actor();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalEntityImpl <em>Physical Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalEntityImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getPhysicalEntity()
		 * @generated
		 */
		EClass PHYSICAL_ENTITY = eINSTANCE.getPhysicalEntity();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.BoardType <em>Board Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.BoardType
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getBoardType()
		 * @generated
		 */
		EEnum BOARD_TYPE = eINSTANCE.getBoardType();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.TransmissionMode <em>Transmission Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.TransmissionMode
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getTransmissionMode()
		 * @generated
		 */
		EEnum TRANSMISSION_MODE = eINSTANCE.getTransmissionMode();

	}

} //CHESSIoTSystemPackage
