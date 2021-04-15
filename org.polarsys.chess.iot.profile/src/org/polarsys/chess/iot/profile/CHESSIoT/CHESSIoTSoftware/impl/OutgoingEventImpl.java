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

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outgoing Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.OutgoingEventImpl#isPeriodic <em>Is Periodic</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.OutgoingEventImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.OutgoingEventImpl#getSend <em>Send</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.OutgoingEventImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutgoingEventImpl extends IoTEventImpl implements OutgoingEvent {
	/**
	 * The default value of the '{@link #isPeriodic() <em>Is Periodic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPeriodic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PERIODIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPeriodic() <em>Is Periodic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPeriodic()
	 * @generated
	 * @ordered
	 */
	protected boolean isPeriodic = IS_PERIODIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected int timeInterval = TIME_INTERVAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSend() <em>Send</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSend()
	 * @generated
	 * @ordered
	 */
	protected EList<SendPayload> send;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected IncomingEvent outgoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutgoingEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.OUTGOING_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPeriodic() {
		return isPeriodic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPeriodic(boolean newIsPeriodic) {
		boolean oldIsPeriodic = isPeriodic;
		isPeriodic = newIsPeriodic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.OUTGOING_EVENT__IS_PERIODIC, oldIsPeriodic, isPeriodic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeInterval() {
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeInterval(int newTimeInterval) {
		int oldTimeInterval = timeInterval;
		timeInterval = newTimeInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.OUTGOING_EVENT__TIME_INTERVAL, oldTimeInterval, timeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SendPayload> getSend() {
		if (send == null) {
			send = new EObjectResolvingEList<SendPayload>(SendPayload.class, this, CHESSIoTSoftwarePackage.OUTGOING_EVENT__SEND);
		}
		return send;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingEvent getOutgoing() {
		if (outgoing != null && outgoing.eIsProxy()) {
			InternalEObject oldOutgoing = (InternalEObject)outgoing;
			outgoing = (IncomingEvent)eResolveProxy(oldOutgoing);
			if (outgoing != oldOutgoing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.OUTGOING_EVENT__OUTGOING, oldOutgoing, outgoing));
			}
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingEvent basicGetOutgoing() {
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoing(IncomingEvent newOutgoing) {
		IncomingEvent oldOutgoing = outgoing;
		outgoing = newOutgoing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.OUTGOING_EVENT__OUTGOING, oldOutgoing, outgoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__IS_PERIODIC:
				return isPeriodic();
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__TIME_INTERVAL:
				return getTimeInterval();
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__SEND:
				return getSend();
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__OUTGOING:
				if (resolve) return getOutgoing();
				return basicGetOutgoing();
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
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__IS_PERIODIC:
				setIsPeriodic((Boolean)newValue);
				return;
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__TIME_INTERVAL:
				setTimeInterval((Integer)newValue);
				return;
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__SEND:
				getSend().clear();
				getSend().addAll((Collection<? extends SendPayload>)newValue);
				return;
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__OUTGOING:
				setOutgoing((IncomingEvent)newValue);
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
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__IS_PERIODIC:
				setIsPeriodic(IS_PERIODIC_EDEFAULT);
				return;
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__TIME_INTERVAL:
				setTimeInterval(TIME_INTERVAL_EDEFAULT);
				return;
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__SEND:
				getSend().clear();
				return;
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__OUTGOING:
				setOutgoing((IncomingEvent)null);
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
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__IS_PERIODIC:
				return isPeriodic != IS_PERIODIC_EDEFAULT;
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__TIME_INTERVAL:
				return timeInterval != TIME_INTERVAL_EDEFAULT;
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__SEND:
				return send != null && !send.isEmpty();
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__OUTGOING:
				return outgoing != null;
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
		result.append(" (isPeriodic: ");
		result.append(isPeriodic);
		result.append(", timeInterval: ");
		result.append(timeInterval);
		result.append(')');
		return result.toString();
	}

} //OutgoingEventImpl
