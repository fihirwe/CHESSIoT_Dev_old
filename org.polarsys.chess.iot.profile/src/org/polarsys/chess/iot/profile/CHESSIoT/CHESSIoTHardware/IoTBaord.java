/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io TBaord</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.IoTBaord#getBoardName <em>Board Name</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.IoTBaord#getVirtualBoard <em>Virtual Board</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.IoTBaord#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage#getIoTBaord()
 * @model
 * @generated
 */
public interface IoTBaord extends EObject {
	/**
	 * Returns the value of the '<em><b>Board Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board Name</em>' attribute.
	 * @see #setBoardName(String)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage#getIoTBaord_BoardName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBoardName();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.IoTBaord#getBoardName <em>Board Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board Name</em>' attribute.
	 * @see #getBoardName()
	 * @generated
	 */
	void setBoardName(String value);

	/**
	 * Returns the value of the '<em><b>Virtual Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Board</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Board</em>' reference.
	 * @see #setVirtualBoard(VirtualBoard)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage#getIoTBaord_VirtualBoard()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VirtualBoard getVirtualBoard();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.IoTBaord#getVirtualBoard <em>Virtual Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Board</em>' reference.
	 * @see #getVirtualBoard()
	 * @generated
	 */
	void setVirtualBoard(VirtualBoard value);

	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(Component)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage#getIoTBaord_Base_Component()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.IoTBaord#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

} // IoTBaord
