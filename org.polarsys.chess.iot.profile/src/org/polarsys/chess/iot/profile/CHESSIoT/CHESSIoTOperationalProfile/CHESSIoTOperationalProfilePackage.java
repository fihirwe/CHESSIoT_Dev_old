/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfileFactory
 * @model kind="package"
 * @generated
 */
public interface CHESSIoTOperationalProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CHESSIoTOperationalProfile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CHESSIoT/CHESSIoTOperationalProfile.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CHESSIoT.CHESSIoTOperationalProfile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CHESSIoTOperationalProfilePackage eINSTANCE = org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ServiceImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CommunicationImpl <em>Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CommunicationImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl#getCommunication()
	 * @generated
	 */
	int COMMUNICATION = 1;

	/**
	 * The feature id for the '<em><b>Com Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__COM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Com Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__COM_MODE = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__BASE_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ServerImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 2;

	/**
	 * The feature id for the '<em><b>Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Server Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_URL = 1;

	/**
	 * The feature id for the '<em><b>Server Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_PORT_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__BASE_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ComSystemImpl <em>Com System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ComSystemImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl#getComSystem()
	 * @generated
	 */
	int COM_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SYSTEM__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Com System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Com System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationType <em>Communication Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationType
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl#getCommunicationType()
	 * @generated
	 */
	int COMMUNICATION_TYPE = 4;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationMode <em>Communication Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationMode
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl#getCommunicationMode()
	 * @generated
	 */
	int COMMUNICATION_MODE = 5;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.WIRELESS <em>WIRELESS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.WIRELESS
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl#getWIRELESS()
	 * @generated
	 */
	int WIRELESS = 6;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.WIRED <em>WIRED</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.WIRED
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl#getWIRED()
	 * @generated
	 */
	int WIRED = 7;


	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Service#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Service#getBase_Class()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Service#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Service#getServiceName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ServiceName();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Communication
	 * @generated
	 */
	EClass getCommunication();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Communication#getComType <em>Com Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Com Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Communication#getComType()
	 * @see #getCommunication()
	 * @generated
	 */
	EAttribute getCommunication_ComType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Communication#getComMode <em>Com Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Com Mode</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Communication#getComMode()
	 * @see #getCommunication()
	 * @generated
	 */
	EAttribute getCommunication_ComMode();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Communication#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Communication#getBase_Class()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server#getServerName <em>Server Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server#getServerName()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_ServerName();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server#getServerUrl <em>Server Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Url</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server#getServerUrl()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_ServerUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server#getServerPortNumber <em>Server Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Port Number</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server#getServerPortNumber()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_ServerPortNumber();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.Server#getBase_Class()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.ComSystem <em>Com System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com System</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.ComSystem
	 * @generated
	 */
	EClass getComSystem();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.ComSystem#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.ComSystem#getBase_Class()
	 * @see #getComSystem()
	 * @generated
	 */
	EReference getComSystem_Base_Class();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationType <em>Communication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationType
	 * @generated
	 */
	EEnum getCommunicationType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationMode <em>Communication Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Mode</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationMode
	 * @generated
	 */
	EEnum getCommunicationMode();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.WIRELESS <em>WIRELESS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>WIRELESS</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.WIRELESS
	 * @generated
	 */
	EEnum getWIRELESS();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.WIRED <em>WIRED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>WIRED</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.WIRED
	 * @generated
	 */
	EEnum getWIRED();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CHESSIoTOperationalProfileFactory getCHESSIoTOperationalProfileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ServiceImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__BASE_CLASS = eINSTANCE.getService_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__SERVICE_NAME = eINSTANCE.getService_ServiceName();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CommunicationImpl <em>Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CommunicationImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl#getCommunication()
		 * @generated
		 */
		EClass COMMUNICATION = eINSTANCE.getCommunication();

		/**
		 * The meta object literal for the '<em><b>Com Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION__COM_TYPE = eINSTANCE.getCommunication_ComType();

		/**
		 * The meta object literal for the '<em><b>Com Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION__COM_MODE = eINSTANCE.getCommunication_ComMode();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__BASE_CLASS = eINSTANCE.getCommunication_Base_Class();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ServerImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__SERVER_NAME = eINSTANCE.getServer_ServerName();

		/**
		 * The meta object literal for the '<em><b>Server Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__SERVER_URL = eINSTANCE.getServer_ServerUrl();

		/**
		 * The meta object literal for the '<em><b>Server Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__SERVER_PORT_NUMBER = eINSTANCE.getServer_ServerPortNumber();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__BASE_CLASS = eINSTANCE.getServer_Base_Class();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ComSystemImpl <em>Com System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.ComSystemImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl#getComSystem()
		 * @generated
		 */
		EClass COM_SYSTEM = eINSTANCE.getComSystem();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SYSTEM__BASE_CLASS = eINSTANCE.getComSystem_Base_Class();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationType <em>Communication Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationType
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl#getCommunicationType()
		 * @generated
		 */
		EEnum COMMUNICATION_TYPE = eINSTANCE.getCommunicationType();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationMode <em>Communication Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CommunicationMode
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl#getCommunicationMode()
		 * @generated
		 */
		EEnum COMMUNICATION_MODE = eINSTANCE.getCommunicationMode();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.WIRELESS <em>WIRELESS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.WIRELESS
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl#getWIRELESS()
		 * @generated
		 */
		EEnum WIRELESS = eINSTANCE.getWIRELESS();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.WIRED <em>WIRED</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.WIRED
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl#getWIRED()
		 * @generated
		 */
		EEnum WIRED = eINSTANCE.getWIRED();

	}

} //CHESSIoTOperationalProfilePackage
