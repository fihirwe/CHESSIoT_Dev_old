/*****************************************************************************
 * Copyright (c) 2011, 2015 University of Padova, Intecs
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 *
 *****************************************************************************/
package org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponent;
import org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StateBasedComponentsPackage
 * @generated
 */
public class StateBasedComponentsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StateBasedComponentsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateBasedComponentsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StateBasedComponentsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateBasedComponentsSwitch<Adapter> modelSwitch =
		new StateBasedComponentsSwitch<Adapter>() {
			@Override
			public Adapter caseStochasticFailureBehaviour(StochasticFailureBehaviour object) {
				return createStochasticFailureBehaviourAdapter();
			}
			@Override
			public Adapter caseStatefulHardware(StatefulHardware object) {
				return createStatefulHardwareAdapter();
			}
			@Override
			public Adapter caseStatelessSoftware(StatelessSoftware object) {
				return createStatelessSoftwareAdapter();
			}
			@Override
			public Adapter caseStatelessHardware(StatelessHardware object) {
				return createStatelessHardwareAdapter();
			}
			@Override
			public Adapter caseStatefulSoftware(StatefulSoftware object) {
				return createStatefulSoftwareAdapter();
			}
			@Override
			public Adapter caseSimpleStochasticBehavior(SimpleStochasticBehavior object) {
				return createSimpleStochasticBehaviorAdapter();
			}
			@Override
			public Adapter caseDependableComponent(DependableComponent object) {
				return createDependableComponentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StatefulHardware <em>Stateful Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StatefulHardware
	 * @generated
	 */
	public Adapter createStatefulHardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StatefulSoftware <em>Stateful Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StatefulSoftware
	 * @generated
	 */
	public Adapter createStatefulSoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.SimpleStochasticBehavior <em>Simple Stochastic Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.SimpleStochasticBehavior
	 * @generated
	 */
	public Adapter createSimpleStochasticBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StatelessHardware <em>Stateless Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StatelessHardware
	 * @generated
	 */
	public Adapter createStatelessHardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StatelessSoftware <em>Stateless Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StatelessSoftware
	 * @generated
	 */
	public Adapter createStatelessSoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StochasticFailureBehaviour <em>Stochastic Failure Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StochasticFailureBehaviour
	 * @generated
	 */
	public Adapter createStochasticFailureBehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponent <em>Dependable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponent
	 * @generated
	 */
	public Adapter createDependableComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StateBasedComponentsAdapterFactory
