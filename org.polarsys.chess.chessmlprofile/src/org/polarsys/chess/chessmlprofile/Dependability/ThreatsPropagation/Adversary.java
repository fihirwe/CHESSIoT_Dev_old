/**
 */
package org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Actor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adversary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.Adversary#getBase_Actor <em>Base Actor</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.ThreatsPropagationPackage#getAdversary()
 * @model
 * @generated
 */
public interface Adversary extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Actor</em>' reference.
	 * @see #setBase_Actor(Actor)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.ThreatsPropagationPackage#getAdversary_Base_Actor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Actor getBase_Actor();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.Adversary#getBase_Actor <em>Base Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Actor</em>' reference.
	 * @see #getBase_Actor()
	 * @generated
	 */
	void setBase_Actor(Actor value);

} // Adversary
