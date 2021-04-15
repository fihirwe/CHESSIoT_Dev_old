/**
 */
package org.polarsys.chess.chessmlprofile.StateMachines;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.chessmlprofile.StateMachines.StateMachinesPackage
 * @generated
 */
public interface StateMachinesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateMachinesFactory eINSTANCE = org.polarsys.chess.chessmlprofile.StateMachines.impl.StateMachinesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Prioritized Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prioritized Transition</em>'.
	 * @generated
	 */
	PrioritizedTransition createPrioritizedTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StateMachinesPackage getStateMachinesPackage();

} //StateMachinesFactory
