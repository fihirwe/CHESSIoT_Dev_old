/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Port;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.IoTPort;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.PortType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io TPort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl.IoTPortImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl.IoTPortImpl#getAaportName <em>Aaport Name</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl.IoTPortImpl#getBase_Port <em>Base Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoTPortImpl extends MinimalEObjectImpl.Container implements IoTPort {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PortType TYPE_EDEFAULT = PortType.ANALOG;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PortType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAaportName() <em>Aaport Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAaportName()
	 * @generated
	 * @ordered
	 */
	protected static final String AAPORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAaportName() <em>Aaport Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAaportName()
	 * @generated
	 * @ordered
	 */
	protected String aaportName = AAPORT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Port() <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Port()
	 * @generated
	 * @ordered
	 */
	protected Port base_Port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoTPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTHardwarePackage.Literals.IO_TPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PortType newType) {
		PortType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTHardwarePackage.IO_TPORT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAaportName() {
		return aaportName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAaportName(String newAaportName) {
		String oldAaportName = aaportName;
		aaportName = newAaportName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTHardwarePackage.IO_TPORT__AAPORT_NAME, oldAaportName, aaportName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getBase_Port() {
		if (base_Port != null && base_Port.eIsProxy()) {
			InternalEObject oldBase_Port = (InternalEObject)base_Port;
			base_Port = (Port)eResolveProxy(oldBase_Port);
			if (base_Port != oldBase_Port) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTHardwarePackage.IO_TPORT__BASE_PORT, oldBase_Port, base_Port));
			}
		}
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetBase_Port() {
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Port(Port newBase_Port) {
		Port oldBase_Port = base_Port;
		base_Port = newBase_Port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTHardwarePackage.IO_TPORT__BASE_PORT, oldBase_Port, base_Port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTHardwarePackage.IO_TPORT__TYPE:
				return getType();
			case CHESSIoTHardwarePackage.IO_TPORT__AAPORT_NAME:
				return getAaportName();
			case CHESSIoTHardwarePackage.IO_TPORT__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
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
			case CHESSIoTHardwarePackage.IO_TPORT__TYPE:
				setType((PortType)newValue);
				return;
			case CHESSIoTHardwarePackage.IO_TPORT__AAPORT_NAME:
				setAaportName((String)newValue);
				return;
			case CHESSIoTHardwarePackage.IO_TPORT__BASE_PORT:
				setBase_Port((Port)newValue);
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
			case CHESSIoTHardwarePackage.IO_TPORT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CHESSIoTHardwarePackage.IO_TPORT__AAPORT_NAME:
				setAaportName(AAPORT_NAME_EDEFAULT);
				return;
			case CHESSIoTHardwarePackage.IO_TPORT__BASE_PORT:
				setBase_Port((Port)null);
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
			case CHESSIoTHardwarePackage.IO_TPORT__TYPE:
				return type != TYPE_EDEFAULT;
			case CHESSIoTHardwarePackage.IO_TPORT__AAPORT_NAME:
				return AAPORT_NAME_EDEFAULT == null ? aaportName != null : !AAPORT_NAME_EDEFAULT.equals(aaportName);
			case CHESSIoTHardwarePackage.IO_TPORT__BASE_PORT:
				return base_Port != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", aaportName: ");
		result.append(aaportName);
		result.append(')');
		return result.toString();
	}

} //IoTPortImpl
