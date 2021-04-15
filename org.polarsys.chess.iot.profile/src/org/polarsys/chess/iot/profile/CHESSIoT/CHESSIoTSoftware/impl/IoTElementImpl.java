/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Component;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTElement;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io TElement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTElementImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTElementImpl#getIoTState <em>Io TState</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoTElementImpl extends MinimalEObjectImpl.Container implements IoTElement {
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
	 * The cached value of the '{@link #getIoTState() <em>Io TState</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoTState()
	 * @generated
	 * @ordered
	 */
	protected IoTState ioTState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoTElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.IO_TELEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.IO_TELEMENT__BASE_COMPONENT, oldBase_Component, base_Component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.IO_TELEMENT__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTState getIoTState() {
		if (ioTState != null && ioTState.eIsProxy()) {
			InternalEObject oldIoTState = (InternalEObject)ioTState;
			ioTState = (IoTState)eResolveProxy(oldIoTState);
			if (ioTState != oldIoTState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.IO_TELEMENT__IO_TSTATE, oldIoTState, ioTState));
			}
		}
		return ioTState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTState basicGetIoTState() {
		return ioTState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoTState(IoTState newIoTState) {
		IoTState oldIoTState = ioTState;
		ioTState = newIoTState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.IO_TELEMENT__IO_TSTATE, oldIoTState, ioTState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.IO_TELEMENT__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case CHESSIoTSoftwarePackage.IO_TELEMENT__IO_TSTATE:
				if (resolve) return getIoTState();
				return basicGetIoTState();
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
			case CHESSIoTSoftwarePackage.IO_TELEMENT__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case CHESSIoTSoftwarePackage.IO_TELEMENT__IO_TSTATE:
				setIoTState((IoTState)newValue);
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
			case CHESSIoTSoftwarePackage.IO_TELEMENT__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case CHESSIoTSoftwarePackage.IO_TELEMENT__IO_TSTATE:
				setIoTState((IoTState)null);
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
			case CHESSIoTSoftwarePackage.IO_TELEMENT__BASE_COMPONENT:
				return base_Component != null;
			case CHESSIoTSoftwarePackage.IO_TELEMENT__IO_TSTATE:
				return ioTState != null;
		}
		return super.eIsSet(featureID);
	}

} //IoTElementImpl
