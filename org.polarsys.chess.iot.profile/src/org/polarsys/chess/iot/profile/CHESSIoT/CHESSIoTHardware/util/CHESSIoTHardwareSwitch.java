/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.*;

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
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage
 * @generated
 */
public class CHESSIoTHardwareSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CHESSIoTHardwarePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTHardwareSwitch() {
		if (modelPackage == null) {
			modelPackage = CHESSIoTHardwarePackage.eINSTANCE;
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
			case CHESSIoTHardwarePackage.SENSOR_UNIT: {
				SensorUnit sensorUnit = (SensorUnit)theEObject;
				T result = caseSensorUnit(sensorUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTHardwarePackage.ACTUATOR_UNIT: {
				ActuatorUnit actuatorUnit = (ActuatorUnit)theEObject;
				T result = caseActuatorUnit(actuatorUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTHardwarePackage.SYSTEM_HW: {
				SystemHW systemHW = (SystemHW)theEObject;
				T result = caseSystemHW(systemHW);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTHardwarePackage.PORT_IN: {
				portIn portIn = (portIn)theEObject;
				T result = caseportIn(portIn);
				if (result == null) result = caseIoTPort(portIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTHardwarePackage.IO_TPORT: {
				IoTPort ioTPort = (IoTPort)theEObject;
				T result = caseIoTPort(ioTPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTHardwarePackage.PORT_OUT: {
				portOut portOut = (portOut)theEObject;
				T result = caseportOut(portOut);
				if (result == null) result = caseIoTPort(portOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTHardwarePackage.TAG_UNIT: {
				TagUnit tagUnit = (TagUnit)theEObject;
				T result = caseTagUnit(tagUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTHardwarePackage.PHYSICAL_BAORD: {
				PhysicalBaord physicalBaord = (PhysicalBaord)theEObject;
				T result = casePhysicalBaord(physicalBaord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorUnit(SensorUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuatorUnit(ActuatorUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System HW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System HW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemHW(SystemHW object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>port In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>port In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseportIn(portIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io TPort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io TPort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoTPort(IoTPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>port Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>port Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseportOut(portOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagUnit(TagUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Baord</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Baord</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalBaord(PhysicalBaord object) {
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

} //CHESSIoTHardwareSwitch
