/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.sysml.blocks.Block;

import org.eclipse.papyrus.sysml.portandflows.FlowPort;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage
 * @generated
 */
public class CHESSIoTSystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CHESSIoTSystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSystemSwitch() {
		if (modelPackage == null) {
			modelPackage = CHESSIoTSystemPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CHESSIoTSystemPackage.IO_TBOARD: {
				IoTBoard ioTBoard = (IoTBoard)theEObject;
				T result = caseIoTBoard(ioTBoard);
				if (result == null) result = caseBlock(ioTBoard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.SENSOR_BLOCK: {
				SensorBlock sensorBlock = (SensorBlock)theEObject;
				T result = caseSensorBlock(sensorBlock);
				if (result == null) result = caseBlock(sensorBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.RF_MODULE: {
				RFModule rfModule = (RFModule)theEObject;
				T result = caseRFModule(rfModule);
				if (result == null) result = caseBlock(rfModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.ACTUATING_BLOCK: {
				ActuatingBlock actuatingBlock = (ActuatingBlock)theEObject;
				T result = caseActuatingBlock(actuatingBlock);
				if (result == null) result = caseBlock(actuatingBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.POWER_SOURCE: {
				PowerSource powerSource = (PowerSource)theEObject;
				T result = casePowerSource(powerSource);
				if (result == null) result = caseBlock(powerSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.SERIAL_IN_OUT: {
				SerialInOut serialInOut = (SerialInOut)theEObject;
				T result = caseSerialInOut(serialInOut);
				if (result == null) result = caseFlowPort(serialInOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.IO_TGATEWAY: {
				IoTGateway ioTGateway = (IoTGateway)theEObject;
				T result = caseIoTGateway(ioTGateway);
				if (result == null) result = caseIoTServer(ioTGateway);
				if (result == null) result = caseBlock(ioTGateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.IO_TSERVER: {
				IoTServer ioTServer = (IoTServer)theEObject;
				T result = caseIoTServer(ioTServer);
				if (result == null) result = caseBlock(ioTServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.PHYSICAL_ENTITY: {
				PhysicalEntity physicalEntity = (PhysicalEntity)theEObject;
				T result = casePhysicalEntity(physicalEntity);
				if (result == null) result = caseBlock(physicalEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io TBoard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io TBoard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoTBoard(IoTBoard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorBlock(SensorBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RF Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RF Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRFModule(RFModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuating Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuating Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuatingBlock(ActuatingBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSource(PowerSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serial In Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serial In Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerialInOut(SerialInOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io TGateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io TGateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoTGateway(IoTGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io TServer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io TServer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoTServer(IoTServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalEntity(PhysicalEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowPort(FlowPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CHESSIoTSystemSwitch
