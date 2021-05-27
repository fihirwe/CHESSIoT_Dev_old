/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.PhysicalBaord;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Resources;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.resourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ResourcesImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ResourcesImpl#getResouceType <em>Resouce Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourcesImpl extends MinimalEObjectImpl.Container implements Resources {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected PhysicalBaord source;

	/**
	 * The default value of the '{@link #getResouceType() <em>Resouce Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResouceType()
	 * @generated
	 * @ordered
	 */
	protected static final resourceType RESOUCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResouceType() <em>Resouce Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResouceType()
	 * @generated
	 * @ordered
	 */
	protected resourceType resouceType = RESOUCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTOperationalProfilePackage.Literals.RESOURCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalBaord getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (PhysicalBaord)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTOperationalProfilePackage.RESOURCES__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalBaord basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(PhysicalBaord newSource) {
		PhysicalBaord oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTOperationalProfilePackage.RESOURCES__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public resourceType getResouceType() {
		return resouceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResouceType(resourceType newResouceType) {
		resourceType oldResouceType = resouceType;
		resouceType = newResouceType == null ? RESOUCE_TYPE_EDEFAULT : newResouceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTOperationalProfilePackage.RESOURCES__RESOUCE_TYPE, oldResouceType, resouceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTOperationalProfilePackage.RESOURCES__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case CHESSIoTOperationalProfilePackage.RESOURCES__RESOUCE_TYPE:
				return getResouceType();
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
			case CHESSIoTOperationalProfilePackage.RESOURCES__SOURCE:
				setSource((PhysicalBaord)newValue);
				return;
			case CHESSIoTOperationalProfilePackage.RESOURCES__RESOUCE_TYPE:
				setResouceType((resourceType)newValue);
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
			case CHESSIoTOperationalProfilePackage.RESOURCES__SOURCE:
				setSource((PhysicalBaord)null);
				return;
			case CHESSIoTOperationalProfilePackage.RESOURCES__RESOUCE_TYPE:
				setResouceType(RESOUCE_TYPE_EDEFAULT);
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
			case CHESSIoTOperationalProfilePackage.RESOURCES__SOURCE:
				return source != null;
			case CHESSIoTOperationalProfilePackage.RESOURCES__RESOUCE_TYPE:
				return resouceType != RESOUCE_TYPE_EDEFAULT;
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
		result.append(" (resouceType: ");
		result.append(resouceType);
		result.append(')');
		return result.toString();
	}

} //ResourcesImpl
