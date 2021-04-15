/**
 */
package org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Interaction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.AttackScenario#getBase_Interaction <em>Base Interaction</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.AttackScenario#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.AttackScenario#getProbSuccess <em>Prob Success</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.ThreatsPropagationPackage#getAttackScenario()
 * @model
 * @generated
 */
public interface AttackScenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Interaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Interaction</em>' reference.
	 * @see #setBase_Interaction(Interaction)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.ThreatsPropagationPackage#getAttackScenario_Base_Interaction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interaction getBase_Interaction();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.AttackScenario#getBase_Interaction <em>Base Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Interaction</em>' reference.
	 * @see #getBase_Interaction()
	 * @generated
	 */
	void setBase_Interaction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(String)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.ThreatsPropagationPackage#getAttackScenario_Frequency()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getFrequency();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.AttackScenario#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(String value);

	/**
	 * Returns the value of the '<em><b>Prob Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prob Success</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prob Success</em>' attribute.
	 * @see #setProbSuccess(String)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.ThreatsPropagationPackage#getAttackScenario_ProbSuccess()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getProbSuccess();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.AttackScenario#getProbSuccess <em>Prob Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prob Success</em>' attribute.
	 * @see #getProbSuccess()
	 * @generated
	 */
	void setProbSuccess(String value);

} // AttackScenario
