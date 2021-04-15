/**
 */
package org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Interaction;

import org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.AttackScenario;
import org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.ThreatsPropagationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attack Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.impl.AttackScenarioImpl#getBase_Interaction <em>Base Interaction</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.impl.AttackScenarioImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.impl.AttackScenarioImpl#getProbSuccess <em>Prob Success</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackScenarioImpl extends EObjectImpl implements AttackScenario {
	/**
	 * The cached value of the '{@link #getBase_Interaction() <em>Base Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Interaction()
	 * @generated
	 * @ordered
	 */
	protected Interaction base_Interaction;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected String frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbSuccess() <em>Prob Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbSuccess()
	 * @generated
	 * @ordered
	 */
	protected static final String PROB_SUCCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProbSuccess() <em>Prob Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbSuccess()
	 * @generated
	 * @ordered
	 */
	protected String probSuccess = PROB_SUCCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThreatsPropagationPackage.Literals.ATTACK_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getBase_Interaction() {
		if (base_Interaction != null && base_Interaction.eIsProxy()) {
			InternalEObject oldBase_Interaction = (InternalEObject)base_Interaction;
			base_Interaction = (Interaction)eResolveProxy(oldBase_Interaction);
			if (base_Interaction != oldBase_Interaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThreatsPropagationPackage.ATTACK_SCENARIO__BASE_INTERACTION, oldBase_Interaction, base_Interaction));
			}
		}
		return base_Interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetBase_Interaction() {
		return base_Interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Interaction(Interaction newBase_Interaction) {
		Interaction oldBase_Interaction = base_Interaction;
		base_Interaction = newBase_Interaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThreatsPropagationPackage.ATTACK_SCENARIO__BASE_INTERACTION, oldBase_Interaction, base_Interaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(String newFrequency) {
		String oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThreatsPropagationPackage.ATTACK_SCENARIO__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProbSuccess() {
		return probSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbSuccess(String newProbSuccess) {
		String oldProbSuccess = probSuccess;
		probSuccess = newProbSuccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThreatsPropagationPackage.ATTACK_SCENARIO__PROB_SUCCESS, oldProbSuccess, probSuccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThreatsPropagationPackage.ATTACK_SCENARIO__BASE_INTERACTION:
				if (resolve) return getBase_Interaction();
				return basicGetBase_Interaction();
			case ThreatsPropagationPackage.ATTACK_SCENARIO__FREQUENCY:
				return getFrequency();
			case ThreatsPropagationPackage.ATTACK_SCENARIO__PROB_SUCCESS:
				return getProbSuccess();
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
			case ThreatsPropagationPackage.ATTACK_SCENARIO__BASE_INTERACTION:
				setBase_Interaction((Interaction)newValue);
				return;
			case ThreatsPropagationPackage.ATTACK_SCENARIO__FREQUENCY:
				setFrequency((String)newValue);
				return;
			case ThreatsPropagationPackage.ATTACK_SCENARIO__PROB_SUCCESS:
				setProbSuccess((String)newValue);
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
			case ThreatsPropagationPackage.ATTACK_SCENARIO__BASE_INTERACTION:
				setBase_Interaction((Interaction)null);
				return;
			case ThreatsPropagationPackage.ATTACK_SCENARIO__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case ThreatsPropagationPackage.ATTACK_SCENARIO__PROB_SUCCESS:
				setProbSuccess(PROB_SUCCESS_EDEFAULT);
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
			case ThreatsPropagationPackage.ATTACK_SCENARIO__BASE_INTERACTION:
				return base_Interaction != null;
			case ThreatsPropagationPackage.ATTACK_SCENARIO__FREQUENCY:
				return FREQUENCY_EDEFAULT == null ? frequency != null : !FREQUENCY_EDEFAULT.equals(frequency);
			case ThreatsPropagationPackage.ATTACK_SCENARIO__PROB_SUCCESS:
				return PROB_SUCCESS_EDEFAULT == null ? probSuccess != null : !PROB_SUCCESS_EDEFAULT.equals(probSuccess);
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
		result.append(" (frequency: ");
		result.append(frequency);
		result.append(", probSuccess: ");
		result.append(probSuccess);
		result.append(')');
		return result.toString();
	}

} //AttackScenarioImpl
