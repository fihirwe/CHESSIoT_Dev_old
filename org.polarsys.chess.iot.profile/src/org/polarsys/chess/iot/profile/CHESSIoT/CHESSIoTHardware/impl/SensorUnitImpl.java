/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Component;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.SensorType;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.SensorUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl.SensorUnitImpl#getSensorType <em>Sensor Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl.SensorUnitImpl#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorUnitImpl extends MinimalEObjectImpl.Container implements SensorUnit {
	/**
	 * The default value of the '{@link #getSensorType() <em>Sensor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorType()
	 * @generated
	 * @ordered
	 */
	protected static final SensorType SENSOR_TYPE_EDEFAULT = SensorType.HUMIDITY;

	/**
	 * The cached value of the '{@link #getSensorType() <em>Sensor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorType()
	 * @generated
	 * @ordered
	 */
	protected SensorType sensorType = SENSOR_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTHardwarePackage.Literals.SENSOR_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType getSensorType() {
		return sensorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorType(SensorType newSensorType) {
		SensorType oldSensorType = sensorType;
		sensorType = newSensorType == null ? SENSOR_TYPE_EDEFAULT : newSensorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTHardwarePackage.SENSOR_UNIT__SENSOR_TYPE, oldSensorType, sensorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTHardwarePackage.SENSOR_UNIT__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTHardwarePackage.SENSOR_UNIT__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTHardwarePackage.SENSOR_UNIT__SENSOR_TYPE:
				return getSensorType();
			case CHESSIoTHardwarePackage.SENSOR_UNIT__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CHESSIoTHardwarePackage.SENSOR_UNIT__SENSOR_TYPE:
				setSensorType((SensorType)newValue);
				return;
			case CHESSIoTHardwarePackage.SENSOR_UNIT__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CHESSIoTHardwarePackage.SENSOR_UNIT__SENSOR_TYPE:
				setSensorType(SENSOR_TYPE_EDEFAULT);
				return;
			case CHESSIoTHardwarePackage.SENSOR_UNIT__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CHESSIoTHardwarePackage.SENSOR_UNIT__SENSOR_TYPE:
				return sensorType != SENSOR_TYPE_EDEFAULT;
			case CHESSIoTHardwarePackage.SENSOR_UNIT__BASE_COMPONENT:
				return base_Component != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sensorType: ");
		result.append(sensorType);
		result.append(')');
		return result.toString();
	}

} //SensorUnitImpl
