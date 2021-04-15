/**
 */
package org.polarsys.chess.chessmlprofile.StateMachines.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.chess.chessmlprofile.StateMachines.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateMachinesFactoryImpl extends EFactoryImpl implements StateMachinesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateMachinesFactory init() {
		try {
			StateMachinesFactory theStateMachinesFactory = (StateMachinesFactory)EPackage.Registry.INSTANCE.getEFactory(StateMachinesPackage.eNS_URI);
			if (theStateMachinesFactory != null) {
				return theStateMachinesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StateMachinesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachinesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StateMachinesPackage.PRIORITIZED_TRANSITION: return createPrioritizedTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrioritizedTransition createPrioritizedTransition() {
		PrioritizedTransitionImpl prioritizedTransition = new PrioritizedTransitionImpl();
		return prioritizedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachinesPackage getStateMachinesPackage() {
		return (StateMachinesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StateMachinesPackage getPackage() {
		return StateMachinesPackage.eINSTANCE;
	}

} //StateMachinesFactoryImpl
