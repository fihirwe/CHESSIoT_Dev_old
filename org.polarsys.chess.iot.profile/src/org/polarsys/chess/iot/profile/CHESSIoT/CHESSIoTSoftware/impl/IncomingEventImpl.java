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

import org.eclipse.uml2.uml.Behavior;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incoming Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IncomingEventImpl#getBase_Behavior <em>Base Behavior</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IncomingEventImpl#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IncomingEventImpl#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncomingEventImpl extends IoTEventImpl implements IncomingEvent {
	/**
	 * The cached value of the '{@link #getBase_Behavior() <em>Base Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Behavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior base_Behavior;

	/**
	 * The cached value of the '{@link #getReceive() <em>Receive</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceive()
	 * @generated
	 * @ordered
	 */
	protected EList<ReceivePayload> receive;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected OutgoingEvent incoming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncomingEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.INCOMING_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBase_Behavior() {
		if (base_Behavior != null && base_Behavior.eIsProxy()) {
			InternalEObject oldBase_Behavior = (InternalEObject)base_Behavior;
			base_Behavior = (Behavior)eResolveProxy(oldBase_Behavior);
			if (base_Behavior != oldBase_Behavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.INCOMING_EVENT__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
			}
		}
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBase_Behavior() {
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Behavior(Behavior newBase_Behavior) {
		Behavior oldBase_Behavior = base_Behavior;
		base_Behavior = newBase_Behavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.INCOMING_EVENT__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReceivePayload> getReceive() {
		if (receive == null) {
			receive = new EObjectResolvingEList<ReceivePayload>(ReceivePayload.class, this, CHESSIoTSoftwarePackage.INCOMING_EVENT__RECEIVE);
		}
		return receive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingEvent getIncoming() {
		if (incoming != null && incoming.eIsProxy()) {
			InternalEObject oldIncoming = (InternalEObject)incoming;
			incoming = (OutgoingEvent)eResolveProxy(oldIncoming);
			if (incoming != oldIncoming) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.INCOMING_EVENT__INCOMING, oldIncoming, incoming));
			}
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingEvent basicGetIncoming() {
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncoming(OutgoingEvent newIncoming) {
		OutgoingEvent oldIncoming = incoming;
		incoming = newIncoming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.INCOMING_EVENT__INCOMING, oldIncoming, incoming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__BASE_BEHAVIOR:
				if (resolve) return getBase_Behavior();
				return basicGetBase_Behavior();
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__RECEIVE:
				return getReceive();
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__INCOMING:
				if (resolve) return getIncoming();
				return basicGetIncoming();
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
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)newValue);
				return;
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__RECEIVE:
				getReceive().clear();
				getReceive().addAll((Collection<? extends ReceivePayload>)newValue);
				return;
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__INCOMING:
				setIncoming((OutgoingEvent)newValue);
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
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)null);
				return;
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__RECEIVE:
				getReceive().clear();
				return;
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__INCOMING:
				setIncoming((OutgoingEvent)null);
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
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__BASE_BEHAVIOR:
				return base_Behavior != null;
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__RECEIVE:
				return receive != null && !receive.isEmpty();
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__INCOMING:
				return incoming != null;
		}
		return super.eIsSet(featureID);
	}

} //IncomingEventImpl
