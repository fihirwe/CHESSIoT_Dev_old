/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Component;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.ActuatorType;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.ActuatorUnit;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl.ActuatorUnitImpl#getActuatorType <em>Actuator Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl.ActuatorUnitImpl#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorUnitImpl extends MinimalEObjectImpl.Container implements ActuatorUnit {
	/**
	 * The default value of the '{@link #getActuatorType() <em>Actuator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorType()
	 * @generated
	 * @ordered
	 */
	protected static final ActuatorType ACTUATOR_TYPE_EDEFAULT = ActuatorType.SERVO;

	/**
	 * The cached value of the '{@link #getActuatorType() <em>Actuator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorType()
	 * @generated
	 * @ordered
	 */
	protected ActuatorType actuatorType = ACTUATOR_TYPE_EDEFAULT;

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
	protected ActuatorUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTHardwarePackage.Literals.ACTUATOR_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorType getActuatorType() {
		return actuatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuatorType(ActuatorType newActuatorType) {
		ActuatorType oldActuatorType = actuatorType;
		actuatorType = newActuatorType == null ? ACTUATOR_TYPE_EDEFAULT : newActuatorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTHardwarePackage.ACTUATOR_UNIT__ACTUATOR_TYPE, oldActuatorType, actuatorType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTHardwarePackage.ACTUATOR_UNIT__BASE_COMPONENT, oldBase_Component, base_Component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTHardwarePackage.ACTUATOR_UNIT__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTHardwarePackage.ACTUATOR_UNIT__ACTUATOR_TYPE:
				return getActuatorType();
			case CHESSIoTHardwarePackage.ACTUATOR_UNIT__BASE_COMPONENT:
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
			case CHESSIoTHardwarePackage.ACTUATOR_UNIT__ACTUATOR_TYPE:
				setActuatorType((ActuatorType)newValue);
				return;
			case CHESSIoTHardwarePackage.ACTUATOR_UNIT__BASE_COMPONENT:
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
			case CHESSIoTHardwarePackage.ACTUATOR_UNIT__ACTUATOR_TYPE:
				setActuatorType(ACTUATOR_TYPE_EDEFAULT);
				return;
			case CHESSIoTHardwarePackage.ACTUATOR_UNIT__BASE_COMPONENT:
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
			case CHESSIoTHardwarePackage.ACTUATOR_UNIT__ACTUATOR_TYPE:
				return actuatorType != ACTUATOR_TYPE_EDEFAULT;
			case CHESSIoTHardwarePackage.ACTUATOR_UNIT__BASE_COMPONENT:
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
		result.append(" (actuatorType: ");
		result.append(actuatorType);
		result.append(')');
		return result.toString();
	}

} //ActuatorUnitImpl
