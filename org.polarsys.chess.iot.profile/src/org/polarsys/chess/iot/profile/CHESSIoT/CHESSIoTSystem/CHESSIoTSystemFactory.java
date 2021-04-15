/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage
 * @generated
 */
public interface CHESSIoTSystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CHESSIoTSystemFactory eINSTANCE = org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Io TBoard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io TBoard</em>'.
	 * @generated
	 */
	IoTBoard createIoTBoard();

	/**
	 * Returns a new object of class '<em>Sensor Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Block</em>'.
	 * @generated
	 */
	SensorBlock createSensorBlock();

	/**
	 * Returns a new object of class '<em>RF Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RF Module</em>'.
	 * @generated
	 */
	RFModule createRFModule();

	/**
	 * Returns a new object of class '<em>Actuating Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuating Block</em>'.
	 * @generated
	 */
	ActuatingBlock createActuatingBlock();

	/**
	 * Returns a new object of class '<em>Power Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Source</em>'.
	 * @generated
	 */
	PowerSource createPowerSource();

	/**
	 * Returns a new object of class '<em>Serial In Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serial In Out</em>'.
	 * @generated
	 */
	SerialInOut createSerialInOut();

	/**
	 * Returns a new object of class '<em>Io TGateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io TGateway</em>'.
	 * @generated
	 */
	IoTGateway createIoTGateway();

	/**
	 * Returns a new object of class '<em>Io TServer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io TServer</em>'.
	 * @generated
	 */
	IoTServer createIoTServer();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Physical Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Entity</em>'.
	 * @generated
	 */
	PhysicalEntity createPhysicalEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CHESSIoTSystemPackage getCHESSIoTSystemPackage();

} //CHESSIoTSystemFactory
