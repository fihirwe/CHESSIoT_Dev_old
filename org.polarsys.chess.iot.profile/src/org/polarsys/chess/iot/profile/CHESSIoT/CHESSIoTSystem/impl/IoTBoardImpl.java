/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.sysml.blocks.internal.impl.BlockImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.BoardType;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTBoard;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.TransmissionMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io TBoard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTBoardImpl#getBoardType <em>Board Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTBoardImpl#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoTBoardImpl extends BlockImpl implements IoTBoard {
	/**
	 * The default value of the '{@link #getBoardType() <em>Board Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardType()
	 * @generated
	 * @ordered
	 */
	protected static final BoardType BOARD_TYPE_EDEFAULT = BoardType.RASBERRY_PI;

	/**
	 * The cached value of the '{@link #getBoardType() <em>Board Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardType()
	 * @generated
	 * @ordered
	 */
	protected BoardType boardType = BOARD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final TransmissionMode MODE_EDEFAULT = TransmissionMode.SERIAL;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected TransmissionMode mode = MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoTBoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSystemPackage.Literals.IO_TBOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoardType getBoardType() {
		return boardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoardType(BoardType newBoardType) {
		BoardType oldBoardType = boardType;
		boardType = newBoardType == null ? BOARD_TYPE_EDEFAULT : newBoardType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.IO_TBOARD__BOARD_TYPE, oldBoardType, boardType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(TransmissionMode newMode) {
		TransmissionMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.IO_TBOARD__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSystemPackage.IO_TBOARD__BOARD_TYPE:
				return getBoardType();
			case CHESSIoTSystemPackage.IO_TBOARD__MODE:
				return getMode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CHESSIoTSystemPackage.IO_TBOARD__BOARD_TYPE:
				setBoardType((BoardType)newValue);
				return;
			case CHESSIoTSystemPackage.IO_TBOARD__MODE:
				setMode((TransmissionMode)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CHESSIoTSystemPackage.IO_TBOARD__BOARD_TYPE:
				setBoardType(BOARD_TYPE_EDEFAULT);
				return;
			case CHESSIoTSystemPackage.IO_TBOARD__MODE:
				setMode(MODE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CHESSIoTSystemPackage.IO_TBOARD__BOARD_TYPE:
				return boardType != BOARD_TYPE_EDEFAULT;
			case CHESSIoTSystemPackage.IO_TBOARD__MODE:
				return mode != MODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (boardType: ");
		result.append(boardType);
		result.append(", mode: ");
		result.append(mode);
		result.append(')');
		return result.toString();
	}

} //IoTBoardImpl
