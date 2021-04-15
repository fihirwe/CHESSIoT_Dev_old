/**
 */
package org.polarsys.chess.chessmlprofile.StateMachines;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.chessmlprofile.StateMachines.StateMachinesFactory
 * @model kind="package"
 * @generated
 */
public interface StateMachinesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "StateMachines";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://CHESS/StateMachines";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "StateMachines";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateMachinesPackage eINSTANCE = org.polarsys.chess.chessmlprofile.StateMachines.impl.StateMachinesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.chess.chessmlprofile.StateMachines.impl.PrioritizedTransitionImpl <em>Prioritized Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.chessmlprofile.StateMachines.impl.PrioritizedTransitionImpl
	 * @see org.polarsys.chess.chessmlprofile.StateMachines.impl.StateMachinesPackageImpl#getPrioritizedTransition()
	 * @generated
	 */
	int PRIORITIZED_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_TRANSITION__PRIORITY = 0;

	/**
	 * The feature id for the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_TRANSITION__BASE_TRANSITION = 1;

	/**
	 * The number of structural features of the '<em>Prioritized Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_TRANSITION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.chessmlprofile.StateMachines.PrioritizedTransition <em>Prioritized Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prioritized Transition</em>'.
	 * @see org.polarsys.chess.chessmlprofile.StateMachines.PrioritizedTransition
	 * @generated
	 */
	EClass getPrioritizedTransition();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.StateMachines.PrioritizedTransition#getBase_Transition <em>Base Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Transition</em>'.
	 * @see org.polarsys.chess.chessmlprofile.StateMachines.PrioritizedTransition#getBase_Transition()
	 * @see #getPrioritizedTransition()
	 * @generated
	 */
	EReference getPrioritizedTransition_Base_Transition();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.chessmlprofile.StateMachines.PrioritizedTransition#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.polarsys.chess.chessmlprofile.StateMachines.PrioritizedTransition#getPriority()
	 * @see #getPrioritizedTransition()
	 * @generated
	 */
	EAttribute getPrioritizedTransition_Priority();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StateMachinesFactory getStateMachinesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.chess.chessmlprofile.StateMachines.impl.PrioritizedTransitionImpl <em>Prioritized Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.chessmlprofile.StateMachines.impl.PrioritizedTransitionImpl
		 * @see org.polarsys.chess.chessmlprofile.StateMachines.impl.StateMachinesPackageImpl#getPrioritizedTransition()
		 * @generated
		 */
		EClass PRIORITIZED_TRANSITION = eINSTANCE.getPrioritizedTransition();

		/**
		 * The meta object literal for the '<em><b>Base Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIORITIZED_TRANSITION__BASE_TRANSITION = eINSTANCE.getPrioritizedTransition_Base_Transition();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITIZED_TRANSITION__PRIORITY = eINSTANCE.getPrioritizedTransition_Priority();

	}

} //StateMachinesPackage
