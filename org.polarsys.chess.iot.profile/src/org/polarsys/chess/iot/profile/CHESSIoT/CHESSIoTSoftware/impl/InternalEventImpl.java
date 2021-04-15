/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.InternalEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.InternalEventImpl#isPeriodic <em>Is Periodic</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.InternalEventImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.InternalEventImpl#getDo <em>Do</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalEventImpl extends IoTEventImpl implements InternalEvent {
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
	 * The cached value of the '{@link #getDo() <em>Do</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDo()
	 * @generated
	 * @ordered
	 */
	protected IoTAction do_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.INTERNAL_EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.INTERNAL_EVENT__IS_PERIODIC, oldIsPeriodic, isPeriodic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.INTERNAL_EVENT__TIME_INTERVAL, oldTimeInterval, timeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTAction getDo() {
		if (do_ != null && do_.eIsProxy()) {
			InternalEObject oldDo = (InternalEObject)do_;
			do_ = (IoTAction)eResolveProxy(oldDo);
			if (do_ != oldDo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.INTERNAL_EVENT__DO, oldDo, do_));
			}
		}
		return do_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTAction basicGetDo() {
		return do_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDo(IoTAction newDo) {
		IoTAction oldDo = do_;
		do_ = newDo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.INTERNAL_EVENT__DO, oldDo, do_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.INTERNAL_EVENT__IS_PERIODIC:
				return isPeriodic();
			case CHESSIoTSoftwarePackage.INTERNAL_EVENT__TIME_INTERVAL:
				return getTimeInterval();
			case CHESSIoTSoftwarePackage.INTERNAL_EVENT__DO:
				if (resolve) return getDo();
				return basicGetDo();
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
			case CHESSIoTSoftwarePackage.INTERNAL_EVENT__IS_PERIODIC:
				setIsPeriodic((Boolean)newValue);
				return;
			case CHESSIoTSoftwarePackage.INTERNAL_EVENT__TIME_INTERVAL:
				setTimeInterval((Integer)newValue);
				return;
			case CHESSIoTSoftwarePackage.INTERNAL_EVENT__DO:
				setDo((IoTAction)newValue);
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
			case CHESSIoTSoftwarePackage.INTERNAL_EVENT__IS_PERIODIC:
				setIsPeriodic(IS_PERIODIC_EDEFAULT);
				return;
			case CHESSIoTSoftwarePackage.INTERNAL_EVENT__TIME_INTERVAL:
				setTimeInterval(TIME_INTERVAL_EDEFAULT);
				return;
			case CHESSIoTSoftwarePackage.INTERNAL_EVENT__DO:
				setDo((IoTAction)null);
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
			case CHESSIoTSoftwarePackage.INTERNAL_EVENT__IS_PERIODIC:
				return isPeriodic != IS_PERIODIC_EDEFAULT;
			case CHESSIoTSoftwarePackage.INTERNAL_EVENT__TIME_INTERVAL:
				return timeInterval != TIME_INTERVAL_EDEFAULT;
			case CHESSIoTSoftwarePackage.INTERNAL_EVENT__DO:
				return do_ != null;
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

} //InternalEventImpl
