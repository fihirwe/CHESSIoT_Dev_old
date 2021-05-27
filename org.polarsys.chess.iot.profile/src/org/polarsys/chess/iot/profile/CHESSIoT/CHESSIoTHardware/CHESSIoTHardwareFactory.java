/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage
 * @generated
 */
public interface CHESSIoTHardwareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CHESSIoTHardwareFactory eINSTANCE = org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl.CHESSIoTHardwareFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sensor Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Unit</em>'.
	 * @generated
	 */
	SensorUnit createSensorUnit();

	/**
	 * Returns a new object of class '<em>Actuator Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator Unit</em>'.
	 * @generated
	 */
	ActuatorUnit createActuatorUnit();

	/**
	 * Returns a new object of class '<em>System HW</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System HW</em>'.
	 * @generated
	 */
	SystemHW createSystemHW();

	/**
	 * Returns a new object of class '<em>port In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>port In</em>'.
	 * @generated
	 */
	portIn createportIn();

	/**
	 * Returns a new object of class '<em>Io TPort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io TPort</em>'.
	 * @generated
	 */
	IoTPort createIoTPort();

	/**
	 * Returns a new object of class '<em>port Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>port Out</em>'.
	 * @generated
	 */
	portOut createportOut();

	/**
	 * Returns a new object of class '<em>Tag Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag Unit</em>'.
	 * @generated
	 */
	TagUnit createTagUnit();

	/**
	 * Returns a new object of class '<em>Physical Baord</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Baord</em>'.
	 * @generated
	 */
	PhysicalBaord createPhysicalBaord();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CHESSIoTHardwarePackage getCHESSIoTHardwarePackage();

} //CHESSIoTHardwareFactory
