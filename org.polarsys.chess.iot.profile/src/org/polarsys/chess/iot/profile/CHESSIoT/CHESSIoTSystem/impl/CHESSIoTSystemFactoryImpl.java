/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CHESSIoTSystemFactoryImpl extends EFactoryImpl implements CHESSIoTSystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CHESSIoTSystemFactory init() {
		try {
			CHESSIoTSystemFactory theCHESSIoTSystemFactory = (CHESSIoTSystemFactory)EPackage.Registry.INSTANCE.getEFactory(CHESSIoTSystemPackage.eNS_URI);
			if (theCHESSIoTSystemFactory != null) {
				return theCHESSIoTSystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CHESSIoTSystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSystemFactoryImpl() {
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
			case CHESSIoTSystemPackage.IO_TBOARD: return createIoTBoard();
			case CHESSIoTSystemPackage.SENSOR_BLOCK: return createSensorBlock();
			case CHESSIoTSystemPackage.RF_MODULE: return createRFModule();
			case CHESSIoTSystemPackage.ACTUATING_BLOCK: return createActuatingBlock();
			case CHESSIoTSystemPackage.POWER_SOURCE: return createPowerSource();
			case CHESSIoTSystemPackage.SERIAL_IN_OUT: return createSerialInOut();
			case CHESSIoTSystemPackage.IO_TGATEWAY: return createIoTGateway();
			case CHESSIoTSystemPackage.IO_TSERVER: return createIoTServer();
			case CHESSIoTSystemPackage.USER: return createUser();
			case CHESSIoTSystemPackage.PHYSICAL_ENTITY: return createPhysicalEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CHESSIoTSystemPackage.BOARD_TYPE:
				return createBoardTypeFromString(eDataType, initialValue);
			case CHESSIoTSystemPackage.TRANSMISSION_MODE:
				return createTransmissionModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CHESSIoTSystemPackage.BOARD_TYPE:
				return convertBoardTypeToString(eDataType, instanceValue);
			case CHESSIoTSystemPackage.TRANSMISSION_MODE:
				return convertTransmissionModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTBoard createIoTBoard() {
		IoTBoardImpl ioTBoard = new IoTBoardImpl();
		return ioTBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorBlock createSensorBlock() {
		SensorBlockImpl sensorBlock = new SensorBlockImpl();
		return sensorBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RFModule createRFModule() {
		RFModuleImpl rfModule = new RFModuleImpl();
		return rfModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatingBlock createActuatingBlock() {
		ActuatingBlockImpl actuatingBlock = new ActuatingBlockImpl();
		return actuatingBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSource createPowerSource() {
		PowerSourceImpl powerSource = new PowerSourceImpl();
		return powerSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerialInOut createSerialInOut() {
		SerialInOutImpl serialInOut = new SerialInOutImpl();
		return serialInOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTGateway createIoTGateway() {
		IoTGatewayImpl ioTGateway = new IoTGatewayImpl();
		return ioTGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTServer createIoTServer() {
		IoTServerImpl ioTServer = new IoTServerImpl();
		return ioTServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalEntity createPhysicalEntity() {
		PhysicalEntityImpl physicalEntity = new PhysicalEntityImpl();
		return physicalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardType createBoardTypeFromString(EDataType eDataType, String initialValue) {
		BoardType result = BoardType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoardTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionMode createTransmissionModeFromString(EDataType eDataType, String initialValue) {
		TransmissionMode result = TransmissionMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransmissionModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSystemPackage getCHESSIoTSystemPackage() {
		return (CHESSIoTSystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CHESSIoTSystemPackage getPackage() {
		return CHESSIoTSystemPackage.eINSTANCE;
	}

} //CHESSIoTSystemFactoryImpl
