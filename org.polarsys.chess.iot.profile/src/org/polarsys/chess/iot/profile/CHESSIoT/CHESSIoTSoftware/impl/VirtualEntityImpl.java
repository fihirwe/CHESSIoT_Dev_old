/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.sysml.blocks.Block;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualEntityImpl#getPhysicalEntity <em>Physical Entity</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualEntityImpl#getBase_Block <em>Base Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualEntityImpl extends SystemSWImpl implements VirtualEntity {
	/**
	 * The cached value of the '{@link #getPhysicalEntity() <em>Physical Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalEntity()
	 * @generated
	 * @ordered
	 */
	protected PhysicalEntity physicalEntity;

	/**
	 * The cached value of the '{@link #getBase_Block() <em>Base Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Block()
	 * @generated
	 * @ordered
	 */
	protected Block base_Block;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.VIRTUAL_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalEntity getPhysicalEntity() {
		if (physicalEntity != null && physicalEntity.eIsProxy()) {
			InternalEObject oldPhysicalEntity = (InternalEObject)physicalEntity;
			physicalEntity = (PhysicalEntity)eResolveProxy(oldPhysicalEntity);
			if (physicalEntity != oldPhysicalEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.VIRTUAL_ENTITY__PHYSICAL_ENTITY, oldPhysicalEntity, physicalEntity));
			}
		}
		return physicalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalEntity basicGetPhysicalEntity() {
		return physicalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalEntity(PhysicalEntity newPhysicalEntity) {
		PhysicalEntity oldPhysicalEntity = physicalEntity;
		physicalEntity = newPhysicalEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.VIRTUAL_ENTITY__PHYSICAL_ENTITY, oldPhysicalEntity, physicalEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBase_Block() {
		if (base_Block != null && base_Block.eIsProxy()) {
			InternalEObject oldBase_Block = (InternalEObject)base_Block;
			base_Block = (Block)eResolveProxy(oldBase_Block);
			if (base_Block != oldBase_Block) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.VIRTUAL_ENTITY__BASE_BLOCK, oldBase_Block, base_Block));
			}
		}
		return base_Block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetBase_Block() {
		return base_Block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Block(Block newBase_Block) {
		Block oldBase_Block = base_Block;
		base_Block = newBase_Block;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.VIRTUAL_ENTITY__BASE_BLOCK, oldBase_Block, base_Block));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.VIRTUAL_ENTITY__PHYSICAL_ENTITY:
				if (resolve) return getPhysicalEntity();
				return basicGetPhysicalEntity();
			case CHESSIoTSoftwarePackage.VIRTUAL_ENTITY__BASE_BLOCK:
				if (resolve) return getBase_Block();
				return basicGetBase_Block();
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
			case CHESSIoTSoftwarePackage.VIRTUAL_ENTITY__PHYSICAL_ENTITY:
				setPhysicalEntity((PhysicalEntity)newValue);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_ENTITY__BASE_BLOCK:
				setBase_Block((Block)newValue);
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
			case CHESSIoTSoftwarePackage.VIRTUAL_ENTITY__PHYSICAL_ENTITY:
				setPhysicalEntity((PhysicalEntity)null);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_ENTITY__BASE_BLOCK:
				setBase_Block((Block)null);
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
			case CHESSIoTSoftwarePackage.VIRTUAL_ENTITY__PHYSICAL_ENTITY:
				return physicalEntity != null;
			case CHESSIoTSoftwarePackage.VIRTUAL_ENTITY__BASE_BLOCK:
				return base_Block != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualEntityImpl
