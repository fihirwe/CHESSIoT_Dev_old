/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware;

import org.eclipse.papyrus.sysml.blocks.Block;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity#getPhysicalEntity <em>Physical Entity</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity#getBase_Block <em>Base Block</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getVirtualEntity()
 * @model
 * @generated
 */
public interface VirtualEntity extends SystemSW {
	/**
	 * Returns the value of the '<em><b>Physical Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Entity</em>' reference.
	 * @see #setPhysicalEntity(PhysicalEntity)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getVirtualEntity_PhysicalEntity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PhysicalEntity getPhysicalEntity();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity#getPhysicalEntity <em>Physical Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Entity</em>' reference.
	 * @see #getPhysicalEntity()
	 * @generated
	 */
	void setPhysicalEntity(PhysicalEntity value);

	/**
	 * Returns the value of the '<em><b>Base Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Block</em>' reference.
	 * @see #setBase_Block(Block)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getVirtualEntity_Base_Block()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Block getBase_Block();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity#getBase_Block <em>Base Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Block</em>' reference.
	 * @see #getBase_Block()
	 * @generated
	 */
	void setBase_Block(Block value);

} // VirtualEntity
