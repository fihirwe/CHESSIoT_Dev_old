/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Component;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.PhysicalBaord;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Baord</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl.PhysicalBaordImpl#getBoardName <em>Board Name</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl.PhysicalBaordImpl#getVirtualBoard <em>Virtual Board</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl.PhysicalBaordImpl#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalBaordImpl extends MinimalEObjectImpl.Container implements PhysicalBaord {
	/**
	 * The default value of the '{@link #getBoardName() <em>Board Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardName()
	 * @generated
	 * @ordered
	 */
	protected static final String BOARD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoardName() <em>Board Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardName()
	 * @generated
	 * @ordered
	 */
	protected String boardName = BOARD_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVirtualBoard() <em>Virtual Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualBoard()
	 * @generated
	 * @ordered
	 */
	protected VirtualBoard virtualBoard;

	/**
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalBaordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTHardwarePackage.Literals.PHYSICAL_BAORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoardName() {
		return boardName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoardName(String newBoardName) {
		String oldBoardName = boardName;
		boardName = newBoardName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTHardwarePackage.PHYSICAL_BAORD__BOARD_NAME, oldBoardName, boardName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBoard getVirtualBoard() {
		if (virtualBoard != null && virtualBoard.eIsProxy()) {
			InternalEObject oldVirtualBoard = (InternalEObject)virtualBoard;
			virtualBoard = (VirtualBoard)eResolveProxy(oldVirtualBoard);
			if (virtualBoard != oldVirtualBoard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTHardwarePackage.PHYSICAL_BAORD__VIRTUAL_BOARD, oldVirtualBoard, virtualBoard));
			}
		}
		return virtualBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBoard basicGetVirtualBoard() {
		return virtualBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualBoard(VirtualBoard newVirtualBoard) {
		VirtualBoard oldVirtualBoard = virtualBoard;
		virtualBoard = newVirtualBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTHardwarePackage.PHYSICAL_BAORD__VIRTUAL_BOARD, oldVirtualBoard, virtualBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTHardwarePackage.PHYSICAL_BAORD__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTHardwarePackage.PHYSICAL_BAORD__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTHardwarePackage.PHYSICAL_BAORD__BOARD_NAME:
				return getBoardName();
			case CHESSIoTHardwarePackage.PHYSICAL_BAORD__VIRTUAL_BOARD:
				if (resolve) return getVirtualBoard();
				return basicGetVirtualBoard();
			case CHESSIoTHardwarePackage.PHYSICAL_BAORD__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
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
			case CHESSIoTHardwarePackage.PHYSICAL_BAORD__BOARD_NAME:
				setBoardName((String)newValue);
				return;
			case CHESSIoTHardwarePackage.PHYSICAL_BAORD__VIRTUAL_BOARD:
				setVirtualBoard((VirtualBoard)newValue);
				return;
			case CHESSIoTHardwarePackage.PHYSICAL_BAORD__BASE_COMPONENT:
				setBase_Component((Component)newValue);
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
			case CHESSIoTHardwarePackage.PHYSICAL_BAORD__BOARD_NAME:
				setBoardName(BOARD_NAME_EDEFAULT);
				return;
			case CHESSIoTHardwarePackage.PHYSICAL_BAORD__VIRTUAL_BOARD:
				setVirtualBoard((VirtualBoard)null);
				return;
			case CHESSIoTHardwarePackage.PHYSICAL_BAORD__BASE_COMPONENT:
				setBase_Component((Component)null);
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
			case CHESSIoTHardwarePackage.PHYSICAL_BAORD__BOARD_NAME:
				return BOARD_NAME_EDEFAULT == null ? boardName != null : !BOARD_NAME_EDEFAULT.equals(boardName);
			case CHESSIoTHardwarePackage.PHYSICAL_BAORD__VIRTUAL_BOARD:
				return virtualBoard != null;
			case CHESSIoTHardwarePackage.PHYSICAL_BAORD__BASE_COMPONENT:
				return base_Component != null;
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
		result.append(" (boardName: ");
		result.append(boardName);
		result.append(')');
		return result.toString();
	}

} //PhysicalBaordImpl
