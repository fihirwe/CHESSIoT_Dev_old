/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ServerImpl#getServerName <em>Server Name</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ServerImpl#getServerUrl <em>Server Url</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ServerImpl#getServerPortNumber <em>Server Port Number</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ServerImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends MinimalEObjectImpl.Container implements Server {
	/**
	 * The default value of the '{@link #getServerName() <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerName() <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerName()
	 * @generated
	 * @ordered
	 */
	protected String serverName = SERVER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerUrl() <em>Server Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerUrl() <em>Server Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerUrl()
	 * @generated
	 * @ordered
	 */
	protected String serverUrl = SERVER_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerPortNumber() <em>Server Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVER_PORT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServerPortNumber() <em>Server Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerPortNumber()
	 * @generated
	 * @ordered
	 */
	protected int serverPortNumber = SERVER_PORT_NUMBER_EDEFAULT;

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
	protected ServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTOperationalProfilePackage.Literals.SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerName() {
		return serverName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerName(String newServerName) {
		String oldServerName = serverName;
		serverName = newServerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTOperationalProfilePackage.SERVER__SERVER_NAME, oldServerName, serverName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerUrl() {
		return serverUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerUrl(String newServerUrl) {
		String oldServerUrl = serverUrl;
		serverUrl = newServerUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTOperationalProfilePackage.SERVER__SERVER_URL, oldServerUrl, serverUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getServerPortNumber() {
		return serverPortNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerPortNumber(int newServerPortNumber) {
		int oldServerPortNumber = serverPortNumber;
		serverPortNumber = newServerPortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTOperationalProfilePackage.SERVER__SERVER_PORT_NUMBER, oldServerPortNumber, serverPortNumber));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTOperationalProfilePackage.SERVER__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTOperationalProfilePackage.SERVER__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTOperationalProfilePackage.SERVER__SERVER_NAME:
				return getServerName();
			case CHESSIoTOperationalProfilePackage.SERVER__SERVER_URL:
				return getServerUrl();
			case CHESSIoTOperationalProfilePackage.SERVER__SERVER_PORT_NUMBER:
				return getServerPortNumber();
			case CHESSIoTOperationalProfilePackage.SERVER__BASE_CLASS:
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
			case CHESSIoTOperationalProfilePackage.SERVER__SERVER_NAME:
				setServerName((String)newValue);
				return;
			case CHESSIoTOperationalProfilePackage.SERVER__SERVER_URL:
				setServerUrl((String)newValue);
				return;
			case CHESSIoTOperationalProfilePackage.SERVER__SERVER_PORT_NUMBER:
				setServerPortNumber((Integer)newValue);
				return;
			case CHESSIoTOperationalProfilePackage.SERVER__BASE_CLASS:
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
			case CHESSIoTOperationalProfilePackage.SERVER__SERVER_NAME:
				setServerName(SERVER_NAME_EDEFAULT);
				return;
			case CHESSIoTOperationalProfilePackage.SERVER__SERVER_URL:
				setServerUrl(SERVER_URL_EDEFAULT);
				return;
			case CHESSIoTOperationalProfilePackage.SERVER__SERVER_PORT_NUMBER:
				setServerPortNumber(SERVER_PORT_NUMBER_EDEFAULT);
				return;
			case CHESSIoTOperationalProfilePackage.SERVER__BASE_CLASS:
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
			case CHESSIoTOperationalProfilePackage.SERVER__SERVER_NAME:
				return SERVER_NAME_EDEFAULT == null ? serverName != null : !SERVER_NAME_EDEFAULT.equals(serverName);
			case CHESSIoTOperationalProfilePackage.SERVER__SERVER_URL:
				return SERVER_URL_EDEFAULT == null ? serverUrl != null : !SERVER_URL_EDEFAULT.equals(serverUrl);
			case CHESSIoTOperationalProfilePackage.SERVER__SERVER_PORT_NUMBER:
				return serverPortNumber != SERVER_PORT_NUMBER_EDEFAULT;
			case CHESSIoTOperationalProfilePackage.SERVER__BASE_CLASS:
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
		result.append(" (serverName: ");
		result.append(serverName);
		result.append(", serverUrl: ");
		result.append(serverUrl);
		result.append(", serverPortNumber: ");
		result.append(serverPortNumber);
		result.append(')');
		return result.toString();
	}

} //ServerImpl
