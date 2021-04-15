/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getBase_Transition <em>Base Transition</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getStateSource <em>State Source</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getStateTarget <em>State Target</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getGuardExpression <em>Guard Expression</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getStateTransition()
 * @model
 * @generated
 */
public interface StateTransition extends EObject {
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
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getStateTransition_Base_Transition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Transition getBase_Transition();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getBase_Transition <em>Base Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Transition</em>' reference.
	 * @see #getBase_Transition()
	 * @generated
	 */
	void setBase_Transition(Transition value);

	/**
	 * Returns the value of the '<em><b>State Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Source</em>' reference.
	 * @see #setStateSource(IoTState)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getStateTransition_StateSource()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IoTState getStateSource();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getStateSource <em>State Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Source</em>' reference.
	 * @see #getStateSource()
	 * @generated
	 */
	void setStateSource(IoTState value);

	/**
	 * Returns the value of the '<em><b>State Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Target</em>' reference.
	 * @see #setStateTarget(IoTState)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getStateTransition_StateTarget()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IoTState getStateTarget();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getStateTarget <em>State Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Target</em>' reference.
	 * @see #getStateTarget()
	 * @generated
	 */
	void setStateTarget(IoTState value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getStateTransition_GuardExpression()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

} // StateTransition
