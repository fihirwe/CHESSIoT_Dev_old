/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Transition;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl#getBase_Transition <em>Base Transition</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl#getStateSource <em>State Source</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl#getStateTarget <em>State Target</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateTransitionImpl extends MinimalEObjectImpl.Container implements StateTransition {
	/**
	 * The cached value of the '{@link #getBase_Transition() <em>Base Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Transition()
	 * @generated
	 * @ordered
	 */
	protected Transition base_Transition;

	/**
	 * The cached value of the '{@link #getStateSource() <em>State Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateSource()
	 * @generated
	 * @ordered
	 */
	protected IoTState stateSource;

	/**
	 * The cached value of the '{@link #getStateTarget() <em>State Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTarget()
	 * @generated
	 * @ordered
	 */
	protected IoTState stateTarget;

	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.STATE_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getBase_Transition() {
		if (base_Transition != null && base_Transition.eIsProxy()) {
			InternalEObject oldBase_Transition = (InternalEObject)base_Transition;
			base_Transition = (Transition)eResolveProxy(oldBase_Transition);
			if (base_Transition != oldBase_Transition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.STATE_TRANSITION__BASE_TRANSITION, oldBase_Transition, base_Transition));
			}
		}
		return base_Transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetBase_Transition() {
		return base_Transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Transition(Transition newBase_Transition) {
		Transition oldBase_Transition = base_Transition;
		base_Transition = newBase_Transition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.STATE_TRANSITION__BASE_TRANSITION, oldBase_Transition, base_Transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTState getStateSource() {
		if (stateSource != null && stateSource.eIsProxy()) {
			InternalEObject oldStateSource = (InternalEObject)stateSource;
			stateSource = (IoTState)eResolveProxy(oldStateSource);
			if (stateSource != oldStateSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.STATE_TRANSITION__STATE_SOURCE, oldStateSource, stateSource));
			}
		}
		return stateSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTState basicGetStateSource() {
		return stateSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateSource(IoTState newStateSource) {
		IoTState oldStateSource = stateSource;
		stateSource = newStateSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.STATE_TRANSITION__STATE_SOURCE, oldStateSource, stateSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTState getStateTarget() {
		if (stateTarget != null && stateTarget.eIsProxy()) {
			InternalEObject oldStateTarget = (InternalEObject)stateTarget;
			stateTarget = (IoTState)eResolveProxy(oldStateTarget);
			if (stateTarget != oldStateTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.STATE_TRANSITION__STATE_TARGET, oldStateTarget, stateTarget));
			}
		}
		return stateTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTState basicGetStateTarget() {
		return stateTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateTarget(IoTState newStateTarget) {
		IoTState oldStateTarget = stateTarget;
		stateTarget = newStateTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.STATE_TRANSITION__STATE_TARGET, oldStateTarget, stateTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression() {
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression) {
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.STATE_TRANSITION__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__BASE_TRANSITION:
				if (resolve) return getBase_Transition();
				return basicGetBase_Transition();
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__STATE_SOURCE:
				if (resolve) return getStateSource();
				return basicGetStateSource();
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__STATE_TARGET:
				if (resolve) return getStateTarget();
				return basicGetStateTarget();
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__GUARD_EXPRESSION:
				return getGuardExpression();
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
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__BASE_TRANSITION:
				setBase_Transition((Transition)newValue);
				return;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__STATE_SOURCE:
				setStateSource((IoTState)newValue);
				return;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__STATE_TARGET:
				setStateTarget((IoTState)newValue);
				return;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
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
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__BASE_TRANSITION:
				setBase_Transition((Transition)null);
				return;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__STATE_SOURCE:
				setStateSource((IoTState)null);
				return;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__STATE_TARGET:
				setStateTarget((IoTState)null);
				return;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
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
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__BASE_TRANSITION:
				return base_Transition != null;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__STATE_SOURCE:
				return stateSource != null;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__STATE_TARGET:
				return stateTarget != null;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
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
		result.append(" (guardExpression: ");
		result.append(guardExpression);
		result.append(')');
		return result.toString();
	}

} //StateTransitionImpl
