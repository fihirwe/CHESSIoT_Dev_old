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
package org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StateBasedComponentsPackage
 * @generated
 */
public interface StateBasedComponentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateBasedComponentsFactory eINSTANCE = org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.impl.StateBasedComponentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Stateful Hardware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stateful Hardware</em>'.
	 * @generated
	 */
	StatefulHardware createStatefulHardware();

	/**
	 * Returns a new object of class '<em>Stateful Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stateful Software</em>'.
	 * @generated
	 */
	StatefulSoftware createStatefulSoftware();

	/**
	 * Returns a new object of class '<em>Simple Stochastic Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Stochastic Behavior</em>'.
	 * @generated
	 */
	SimpleStochasticBehavior createSimpleStochasticBehavior();

	/**
	 * Returns a new object of class '<em>Stateless Hardware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stateless Hardware</em>'.
	 * @generated
	 */
	StatelessHardware createStatelessHardware();

	/**
	 * Returns a new object of class '<em>Stateless Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stateless Software</em>'.
	 * @generated
	 */
	StatelessSoftware createStatelessSoftware();

	/**
	 * Returns a new object of class '<em>Stochastic Failure Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stochastic Failure Behaviour</em>'.
	 * @generated
	 */
	StochasticFailureBehaviour createStochasticFailureBehaviour();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StateBasedComponentsPackage getStateBasedComponentsPackage();

} //StateBasedComponentsFactory
