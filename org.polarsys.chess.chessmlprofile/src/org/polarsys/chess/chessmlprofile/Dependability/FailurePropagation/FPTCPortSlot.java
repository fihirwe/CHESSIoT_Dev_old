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
package org.polarsys.chess.chessmlprofile.Dependability.FailurePropagation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Slot;
import org.polarsys.chess.chessmlprofile.Dependability.FailurePropagation.FailurePropagationDataTypes.FailureType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FPTC Port Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * deprecated, use FailureModes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.FailurePropagation.FPTCPortSlot#getFPTCSpecification <em>FPTC Specification</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.FailurePropagation.FPTCPortSlot#getBase_Slot <em>Base Slot</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.FailurePropagation.FPTCPortSlot#getFailure <em>Failure</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.chessmlprofile.Dependability.FailurePropagation.FailurePropagationPackage#getFPTCPortSlot()
 * @model
 * @generated
 */
public interface FPTCPortSlot extends EObject {
	/**
	 * Returns the value of the '<em><b>FPTC Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FPTC Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FPTC Specification</em>' reference.
	 * @see #setFPTCSpecification(FPTCSpecification)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.FailurePropagation.FailurePropagationPackage#getFPTCPortSlot_FPTCSpecification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FPTCSpecification getFPTCSpecification();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.FailurePropagation.FPTCPortSlot#getFPTCSpecification <em>FPTC Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FPTC Specification</em>' reference.
	 * @see #getFPTCSpecification()
	 * @generated
	 */
	void setFPTCSpecification(FPTCSpecification value);

	/**
	 * Returns the value of the '<em><b>Base Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Slot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Slot</em>' reference.
	 * @see #setBase_Slot(Slot)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.FailurePropagation.FailurePropagationPackage#getFPTCPortSlot_Base_Slot()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Slot getBase_Slot();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.FailurePropagation.FPTCPortSlot#getBase_Slot <em>Base Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Slot</em>' reference.
	 * @see #getBase_Slot()
	 * @generated
	 */
	void setBase_Slot(Slot value);

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' attribute list.
	 * The list contents are of type {@link org.polarsys.chess.chessmlprofile.Dependability.FailurePropagation.FailurePropagationDataTypes.FailureType}.
	 * The literals are from the enumeration {@link org.polarsys.chess.chessmlprofile.Dependability.FailurePropagation.FailurePropagationDataTypes.FailureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' attribute list.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.FailurePropagation.FailurePropagationDataTypes.FailureType
	 * @see org.polarsys.chess.chessmlprofile.Dependability.FailurePropagation.FailurePropagationPackage#getFPTCPortSlot_Failure()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FailureType> getFailure();

} // FPTCPortSlot
