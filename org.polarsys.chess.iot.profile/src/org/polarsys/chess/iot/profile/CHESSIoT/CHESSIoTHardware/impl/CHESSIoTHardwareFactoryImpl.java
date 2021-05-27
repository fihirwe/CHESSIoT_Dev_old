/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CHESSIoTHardwareFactoryImpl extends EFactoryImpl implements CHESSIoTHardwareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CHESSIoTHardwareFactory init() {
		try {
			CHESSIoTHardwareFactory theCHESSIoTHardwareFactory = (CHESSIoTHardwareFactory)EPackage.Registry.INSTANCE.getEFactory(CHESSIoTHardwarePackage.eNS_URI);
			if (theCHESSIoTHardwareFactory != null) {
				return theCHESSIoTHardwareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CHESSIoTHardwareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTHardwareFactoryImpl() {
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
			case CHESSIoTHardwarePackage.SENSOR_UNIT: return createSensorUnit();
			case CHESSIoTHardwarePackage.ACTUATOR_UNIT: return createActuatorUnit();
			case CHESSIoTHardwarePackage.SYSTEM_HW: return createSystemHW();
			case CHESSIoTHardwarePackage.PORT_IN: return createportIn();
			case CHESSIoTHardwarePackage.IO_TPORT: return createIoTPort();
			case CHESSIoTHardwarePackage.PORT_OUT: return createportOut();
			case CHESSIoTHardwarePackage.TAG_UNIT: return createTagUnit();
			case CHESSIoTHardwarePackage.PHYSICAL_BAORD: return createPhysicalBaord();
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
			case CHESSIoTHardwarePackage.PORT_TYPE:
				return createPortTypeFromString(eDataType, initialValue);
			case CHESSIoTHardwarePackage.SENSOR_TYPE:
				return createSensorTypeFromString(eDataType, initialValue);
			case CHESSIoTHardwarePackage.ACTUATOR_TYPE:
				return createActuatorTypeFromString(eDataType, initialValue);
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
			case CHESSIoTHardwarePackage.PORT_TYPE:
				return convertPortTypeToString(eDataType, instanceValue);
			case CHESSIoTHardwarePackage.SENSOR_TYPE:
				return convertSensorTypeToString(eDataType, instanceValue);
			case CHESSIoTHardwarePackage.ACTUATOR_TYPE:
				return convertActuatorTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorUnit createSensorUnit() {
		SensorUnitImpl sensorUnit = new SensorUnitImpl();
		return sensorUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorUnit createActuatorUnit() {
		ActuatorUnitImpl actuatorUnit = new ActuatorUnitImpl();
		return actuatorUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemHW createSystemHW() {
		SystemHWImpl systemHW = new SystemHWImpl();
		return systemHW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public portIn createportIn() {
		portInImpl portIn = new portInImpl();
		return portIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTPort createIoTPort() {
		IoTPortImpl ioTPort = new IoTPortImpl();
		return ioTPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public portOut createportOut() {
		portOutImpl portOut = new portOutImpl();
		return portOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagUnit createTagUnit() {
		TagUnitImpl tagUnit = new TagUnitImpl();
		return tagUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalBaord createPhysicalBaord() {
		PhysicalBaordImpl physicalBaord = new PhysicalBaordImpl();
		return physicalBaord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortTypeFromString(EDataType eDataType, String initialValue) {
		PortType result = PortType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType createSensorTypeFromString(EDataType eDataType, String initialValue) {
		SensorType result = SensorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSensorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorType createActuatorTypeFromString(EDataType eDataType, String initialValue) {
		ActuatorType result = ActuatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActuatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTHardwarePackage getCHESSIoTHardwarePackage() {
		return (CHESSIoTHardwarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CHESSIoTHardwarePackage getPackage() {
		return CHESSIoTHardwarePackage.eINSTANCE;
	}

} //CHESSIoTHardwareFactoryImpl
