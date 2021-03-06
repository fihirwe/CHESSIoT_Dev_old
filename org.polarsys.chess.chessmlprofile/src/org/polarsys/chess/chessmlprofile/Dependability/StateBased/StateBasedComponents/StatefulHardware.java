/*****************************************************************************
 * Copyright (c) 2011 - 2014 University of Padova, Intecs
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

import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stateful Hardware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * obsolete, see SimpleStochasticBehaviour
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StatefulHardware#getProbPermFault <em>Prob Perm Fault</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StatefulHardware#getErrorLatency <em>Error Latency</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StatefulHardware#getRepairDelay <em>Repair Delay</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StatefulHardware#getFaultOcc <em>Fault Occ</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StateBasedComponentsPackage#getStatefulHardware()
 * @model
 * @generated
 */
public interface StatefulHardware extends DependableComponent {
	/**
	 * Returns the value of the '<em><b>Prob Perm Fault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prob Perm Fault</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prob Perm Fault</em>' attribute.
	 * @see #setProbPermFault(String)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StateBasedComponentsPackage#getStatefulHardware_ProbPermFault()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" required="true" ordered="false"
	 * @generated
	 */
	String getProbPermFault();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StatefulHardware#getProbPermFault <em>Prob Perm Fault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prob Perm Fault</em>' attribute.
	 * @see #getProbPermFault()
	 * @generated
	 */
	void setProbPermFault(String value);

	/**
	 * Returns the value of the '<em><b>Error Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Latency</em>' attribute.
	 * @see #setErrorLatency(String)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StateBasedComponentsPackage#getStatefulHardware_ErrorLatency()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" required="true" ordered="false"
	 * @generated
	 */
	String getErrorLatency();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StatefulHardware#getErrorLatency <em>Error Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Latency</em>' attribute.
	 * @see #getErrorLatency()
	 * @generated
	 */
	void setErrorLatency(String value);

	/**
	 * Returns the value of the '<em><b>Repair Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repair Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repair Delay</em>' attribute.
	 * @see #setRepairDelay(String)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StateBasedComponentsPackage#getStatefulHardware_RepairDelay()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" required="true" ordered="false"
	 * @generated
	 */
	String getRepairDelay();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StatefulHardware#getRepairDelay <em>Repair Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repair Delay</em>' attribute.
	 * @see #getRepairDelay()
	 * @generated
	 */
	void setRepairDelay(String value);

	/**
	 * Returns the value of the '<em><b>Fault Occ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Occ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Occ</em>' attribute.
	 * @see #setFaultOcc(String)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StateBasedComponentsPackage#getStatefulHardware_FaultOcc()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Frequency" ordered="false"
	 * @generated
	 */
	String getFaultOcc();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedComponents.StatefulHardware#getFaultOcc <em>Fault Occ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Occ</em>' attribute.
	 * @see #getFaultOcc()
	 * @generated
	 */
	void setFaultOcc(String value);

} // StatefulHardware
