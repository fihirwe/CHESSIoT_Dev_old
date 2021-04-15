/**
 */
package org.polarsys.chess.chessmlprofile.StateMachines;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prioritized Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.chessmlprofile.StateMachines.PrioritizedTransition#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.StateMachines.PrioritizedTransition#getBase_Transition <em>Base Transition</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.chessmlprofile.StateMachines.StateMachinesPackage#getPrioritizedTransition()
 * @model
 * @generated
 */
public interface PrioritizedTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Transition</em>' reference.
	 * @see #setBase_Transition(Transition)
	 * @see org.polarsys.chess.chessmlprofile.StateMachines.StateMachinesPackage#getPrioritizedTransition_Base_Transition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Transition getBase_Transition();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.StateMachines.PrioritizedTransition#getBase_Transition <em>Base Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Transition</em>' reference.
	 * @see #getBase_Transition()
	 * @generated
	 */
	void setBase_Transition(Transition value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.polarsys.chess.chessmlprofile.StateMachines.StateMachinesPackage#getPrioritizedTransition_Priority()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.StateMachines.PrioritizedTransition#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

} // PrioritizedTransition
