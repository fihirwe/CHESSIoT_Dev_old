/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.SensorUnit#getSensorType <em>Sensor Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.SensorUnit#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage#getSensorUnit()
 * @model
 * @generated
 */
public interface SensorUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.SensorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Type</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.SensorType
	 * @see #setSensorType(SensorType)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage#getSensorUnit_SensorType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SensorType getSensorType();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.SensorUnit#getSensorType <em>Sensor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Type</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.SensorType
	 * @see #getSensorType()
	 * @generated
	 */
	void setSensorType(SensorType value);

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
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage#getSensorUnit_Base_Component()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.SensorUnit#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

} // SensorUnit
