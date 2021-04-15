/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Communication;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationMode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CommunicationImpl#getComType <em>Com Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CommunicationImpl#getComMode <em>Com Mode</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CommunicationImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationImpl extends MinimalEObjectImpl.Container implements Communication {
	/**
	 * The default value of the '{@link #getComType() <em>Com Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComType()
	 * @generated
	 * @ordered
	 */
	protected static final CommunicationType COM_TYPE_EDEFAULT = CommunicationType.MQTT;

	/**
	 * The cached value of the '{@link #getComType() <em>Com Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComType()
	 * @generated
	 * @ordered
	 */
	protected CommunicationType comType = COM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComMode() <em>Com Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComMode()
	 * @generated
	 * @ordered
	 */
	protected static final CommunicationMode COM_MODE_EDEFAULT = CommunicationMode.WIRELESS;

	/**
	 * The cached value of the '{@link #getComMode() <em>Com Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComMode()
	 * @generated
	 * @ordered
	 */
	protected CommunicationMode comMode = COM_MODE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTOperationalProfilePackage.Literals.COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationType getComType() {
		return comType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComType(CommunicationType newComType) {
		CommunicationType oldComType = comType;
		comType = newComType == null ? COM_TYPE_EDEFAULT : newComType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTOperationalProfilePackage.COMMUNICATION__COM_TYPE, oldComType, comType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMode getComMode() {
		return comMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComMode(CommunicationMode newComMode) {
		CommunicationMode oldComMode = comMode;
		comMode = newComMode == null ? COM_MODE_EDEFAULT : newComMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTOperationalProfilePackage.COMMUNICATION__COM_MODE, oldComMode, comMode));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTOperationalProfilePackage.COMMUNICATION__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTOperationalProfilePackage.COMMUNICATION__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTOperationalProfilePackage.COMMUNICATION__COM_TYPE:
				return getComType();
			case CHESSIoTOperationalProfilePackage.COMMUNICATION__COM_MODE:
				return getComMode();
			case CHESSIoTOperationalProfilePackage.COMMUNICATION__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
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
			case CHESSIoTOperationalProfilePackage.COMMUNICATION__COM_TYPE:
				setComType((CommunicationType)newValue);
				return;
			case CHESSIoTOperationalProfilePackage.COMMUNICATION__COM_MODE:
				setComMode((CommunicationMode)newValue);
				return;
			case CHESSIoTOperationalProfilePackage.COMMUNICATION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
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
			case CHESSIoTOperationalProfilePackage.COMMUNICATION__COM_TYPE:
				setComType(COM_TYPE_EDEFAULT);
				return;
			case CHESSIoTOperationalProfilePackage.COMMUNICATION__COM_MODE:
				setComMode(COM_MODE_EDEFAULT);
				return;
			case CHESSIoTOperationalProfilePackage.COMMUNICATION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
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
			case CHESSIoTOperationalProfilePackage.COMMUNICATION__COM_TYPE:
				return comType != COM_TYPE_EDEFAULT;
			case CHESSIoTOperationalProfilePackage.COMMUNICATION__COM_MODE:
				return comMode != COM_MODE_EDEFAULT;
			case CHESSIoTOperationalProfilePackage.COMMUNICATION__BASE_CLASS:
				return base_Class != null;
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
		result.append(" (comType: ");
		result.append(comType);
		result.append(", comMode: ");
		result.append(comMode);
		result.append(')');
		return result.toString();
	}

} //CommunicationImpl
