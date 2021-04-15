/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.ActuatorUnit#getActuatorType <em>Actuator Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.ActuatorUnit#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage#getActuatorUnit()
 * @model
 * @generated
 */
public interface ActuatorUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Actuator Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.ActuatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuator Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator Type</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.ActuatorType
	 * @see #setActuatorType(ActuatorType)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage#getActuatorUnit_ActuatorType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActuatorType getActuatorType();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.ActuatorUnit#getActuatorType <em>Actuator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator Type</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.ActuatorType
	 * @see #getActuatorType()
	 * @generated
	 */
	void setActuatorType(ActuatorType value);

	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(Component)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage#getActuatorUnit_Base_Component()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.ActuatorUnit#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

} // ActuatorUnit
