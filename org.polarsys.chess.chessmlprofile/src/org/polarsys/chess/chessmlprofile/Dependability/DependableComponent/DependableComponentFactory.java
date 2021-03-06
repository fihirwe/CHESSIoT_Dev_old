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
package org.polarsys.chess.chessmlprofile.Dependability.DependableComponent;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponentPackage
 * @generated
 */
public interface DependableComponentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DependableComponentFactory eINSTANCE = org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Failure Modes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Modes</em>'.
	 * @generated
	 */
	FailureModes createFailureModes();

	/**
	 * Returns a new object of class '<em>Failure Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Mode</em>'.
	 * @generated
	 */
	FailureMode createFailureMode();

	/**
	 * Returns a new object of class '<em>Dependable Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependable Component</em>'.
	 * @generated
	 */
	DependableComponent createDependableComponent();

	/**
	 * Returns a new object of class '<em>Threat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threat</em>'.
	 * @generated
	 */
	Threat createThreat();

	/**
	 * Returns a new object of class '<em>Analysis Context Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Context Element</em>'.
	 * @generated
	 */
	AnalysisContextElement createAnalysisContextElement();

	/**
	 * Returns a new object of class '<em>Error Model Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Model Behavior</em>'.
	 * @generated
	 */
	ErrorModelBehavior createErrorModelBehavior();

	/**
	 * Returns a new object of class '<em>Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propagation</em>'.
	 * @generated
	 */
	Propagation createPropagation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DependableComponentPackage getDependableComponentPackage();

} //DependableComponentFactory
