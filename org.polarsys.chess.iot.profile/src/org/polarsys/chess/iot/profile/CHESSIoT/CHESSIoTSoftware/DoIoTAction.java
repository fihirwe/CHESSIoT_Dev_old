/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do Io TAction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.DoIoTAction#getActionName <em>Action Name</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getDoIoTAction()
 * @model
 * @generated
 */
public interface DoIoTAction extends IoTAction {
	/**
	 * Returns the value of the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Name</em>' attribute.
	 * @see #setActionName(String)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getDoIoTAction_ActionName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getActionName();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.DoIoTAction#getActionName <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Name</em>' attribute.
	 * @see #getActionName()
	 * @generated
	 */
	void setActionName(String value);

} // DoIoTAction
