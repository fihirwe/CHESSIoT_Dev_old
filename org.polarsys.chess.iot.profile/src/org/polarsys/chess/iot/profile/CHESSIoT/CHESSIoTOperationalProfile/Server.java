/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server#getServerName <em>Server Name</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server#getServerUrl <em>Server Url</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server#getServerPortNumber <em>Server Port Number</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage#getServer()
 * @model
 * @generated
 */
public interface Server extends EObject {
	/**
	 * Returns the value of the '<em><b>Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Name</em>' attribute.
	 * @see #setServerName(String)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage#getServer_ServerName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getServerName();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server#getServerName <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Name</em>' attribute.
	 * @see #getServerName()
	 * @generated
	 */
	void setServerName(String value);

	/**
	 * Returns the value of the '<em><b>Server Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Url</em>' attribute.
	 * @see #setServerUrl(String)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage#getServer_ServerUrl()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getServerUrl();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server#getServerUrl <em>Server Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Url</em>' attribute.
	 * @see #getServerUrl()
	 * @generated
	 */
	void setServerUrl(String value);

	/**
	 * Returns the value of the '<em><b>Server Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Port Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Port Number</em>' attribute.
	 * @see #setServerPortNumber(int)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage#getServer_ServerPortNumber()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getServerPortNumber();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server#getServerPortNumber <em>Server Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Port Number</em>' attribute.
	 * @see #getServerPortNumber()
	 * @generated
	 */
	void setServerPortNumber(int value);

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage#getServer_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // Server
