/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem;

import org.eclipse.papyrus.sysml.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io TBoard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTBoard#getBoardType <em>Board Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTBoard#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getIoTBoard()
 * @model
 * @generated
 */
public interface IoTBoard extends Block {
	/**
	 * Returns the value of the '<em><b>Board Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.BoardType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board Type</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.BoardType
	 * @see #setBoardType(BoardType)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getIoTBoard_BoardType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BoardType getBoardType();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTBoard#getBoardType <em>Board Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board Type</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.BoardType
	 * @see #getBoardType()
	 * @generated
	 */
	void setBoardType(BoardType value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.TransmissionMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.TransmissionMode
	 * @see #setMode(TransmissionMode)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getIoTBoard_Mode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TransmissionMode getMode();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTBoard#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.TransmissionMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(TransmissionMode value);

} // IoTBoard
