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
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_VirtualBoard;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Board Virtual Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoard_VirtualBoardImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoard_VirtualBoardImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoard_VirtualBoardImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoard_VirtualBoardImpl#getIoTState <em>Io TState</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualBoard_VirtualBoardImpl#getVE <em>VE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualBoard_VirtualBoardImpl extends MinimalEObjectImpl.Container implements VirtualBoard_VirtualBoard {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

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
	 * The cached value of the '{@link #getVE() <em>VE</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVE()
	 * @generated
	 * @ordered
	 */
	protected VirtualEntity ve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualBoard_VirtualBoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.VIRTUAL_BOARD_VIRTUAL_BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_COMPONENT, oldBase_Component, base_Component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_CLASS, oldBase_Class, base_Class));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__IO_TSTATE, oldIoTState, ioTState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__IO_TSTATE, oldIoTState, ioTState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualEntity getVE() {
		if (ve != null && ve.eIsProxy()) {
			InternalEObject oldVE = (InternalEObject)ve;
			ve = (VirtualEntity)eResolveProxy(oldVE);
			if (ve != oldVE) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__VE, oldVE, ve));
			}
		}
		return ve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualEntity basicGetVE() {
		return ve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVE(VirtualEntity newVE) {
		VirtualEntity oldVE = ve;
		ve = newVE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__VE, oldVE, ve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__NAME:
				return getName();
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__IO_TSTATE:
				if (resolve) return getIoTState();
				return basicGetIoTState();
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__VE:
				if (resolve) return getVE();
				return basicGetVE();
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
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__NAME:
				setName((String)newValue);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__IO_TSTATE:
				setIoTState((IoTState)newValue);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__VE:
				setVE((VirtualEntity)newValue);
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
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__IO_TSTATE:
				setIoTState((IoTState)null);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__VE:
				setVE((VirtualEntity)null);
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
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_COMPONENT:
				return base_Component != null;
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_CLASS:
				return base_Class != null;
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__IO_TSTATE:
				return ioTState != null;
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD_VIRTUAL_BOARD__VE:
				return ve != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VirtualBoard_VirtualBoardImpl
