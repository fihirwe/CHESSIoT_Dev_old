/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.GCM.ClientServerPort;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Operation;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Payload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SendPayloadImpl#getBase_Operation <em>Base Operation</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SendPayloadImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SendPayloadImpl#getBase_Event <em>Base Event</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SendPayloadImpl#getBase_Action <em>Base Action</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SendPayloadImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendPayloadImpl extends IoTActionImpl implements SendPayload {
	/**
	 * The cached value of the '{@link #getBase_Operation() <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Operation()
	 * @generated
	 * @ordered
	 */
	protected Operation base_Operation;

	/**
	 * The cached value of the '{@link #getPayload() <em>Payload</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected EList<Payload> payload;

	/**
	 * The cached value of the '{@link #getBase_Event() <em>Base Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Event()
	 * @generated
	 * @ordered
	 */
	protected Event base_Event;

	/**
	 * The cached value of the '{@link #getBase_Action() <em>Base Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Action()
	 * @generated
	 * @ordered
	 */
	protected Action base_Action;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected ClientServerPort port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendPayloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.SEND_PAYLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getBase_Operation() {
		if (base_Operation != null && base_Operation.eIsProxy()) {
			InternalEObject oldBase_Operation = (InternalEObject)base_Operation;
			base_Operation = (Operation)eResolveProxy(oldBase_Operation);
			if (base_Operation != oldBase_Operation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_OPERATION, oldBase_Operation, base_Operation));
			}
		}
		return base_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetBase_Operation() {
		return base_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Operation(Operation newBase_Operation) {
		Operation oldBase_Operation = base_Operation;
		base_Operation = newBase_Operation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_OPERATION, oldBase_Operation, base_Operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Payload> getPayload() {
		if (payload == null) {
			payload = new EObjectResolvingEList<Payload>(Payload.class, this, CHESSIoTSoftwarePackage.SEND_PAYLOAD__PAYLOAD);
		}
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getBase_Event() {
		if (base_Event != null && base_Event.eIsProxy()) {
			InternalEObject oldBase_Event = (InternalEObject)base_Event;
			base_Event = (Event)eResolveProxy(oldBase_Event);
			if (base_Event != oldBase_Event) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_EVENT, oldBase_Event, base_Event));
			}
		}
		return base_Event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetBase_Event() {
		return base_Event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Event(Event newBase_Event) {
		Event oldBase_Event = base_Event;
		base_Event = newBase_Event;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_EVENT, oldBase_Event, base_Event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getBase_Action() {
		if (base_Action != null && base_Action.eIsProxy()) {
			InternalEObject oldBase_Action = (InternalEObject)base_Action;
			base_Action = (Action)eResolveProxy(oldBase_Action);
			if (base_Action != oldBase_Action) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_ACTION, oldBase_Action, base_Action));
			}
		}
		return base_Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetBase_Action() {
		return base_Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Action(Action newBase_Action) {
		Action oldBase_Action = base_Action;
		base_Action = newBase_Action;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_ACTION, oldBase_Action, base_Action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServerPort getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (ClientServerPort)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.SEND_PAYLOAD__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServerPort basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(ClientServerPort newPort) {
		ClientServerPort oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.SEND_PAYLOAD__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_OPERATION:
				if (resolve) return getBase_Operation();
				return basicGetBase_Operation();
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__PAYLOAD:
				return getPayload();
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_EVENT:
				if (resolve) return getBase_Event();
				return basicGetBase_Event();
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_ACTION:
				if (resolve) return getBase_Action();
				return basicGetBase_Action();
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__PORT:
				if (resolve) return getPort();
				return basicGetPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_OPERATION:
				setBase_Operation((Operation)newValue);
				return;
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__PAYLOAD:
				getPayload().clear();
				getPayload().addAll((Collection<? extends Payload>)newValue);
				return;
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_EVENT:
				setBase_Event((Event)newValue);
				return;
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_ACTION:
				setBase_Action((Action)newValue);
				return;
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__PORT:
				setPort((ClientServerPort)newValue);
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
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_OPERATION:
				setBase_Operation((Operation)null);
				return;
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__PAYLOAD:
				getPayload().clear();
				return;
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_EVENT:
				setBase_Event((Event)null);
				return;
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_ACTION:
				setBase_Action((Action)null);
				return;
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__PORT:
				setPort((ClientServerPort)null);
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
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_OPERATION:
				return base_Operation != null;
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__PAYLOAD:
				return payload != null && !payload.isEmpty();
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_EVENT:
				return base_Event != null;
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__BASE_ACTION:
				return base_Action != null;
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__PORT:
				return port != null;
		}
		return super.eIsSet(featureID);
	}

} //SendPayloadImpl
