/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CHESSIoTOperationalProfileFactoryImpl extends EFactoryImpl implements CHESSIoTOperationalProfileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CHESSIoTOperationalProfileFactory init() {
		try {
			CHESSIoTOperationalProfileFactory theCHESSIoTOperationalProfileFactory = (CHESSIoTOperationalProfileFactory)EPackage.Registry.INSTANCE.getEFactory(CHESSIoTOperationalProfilePackage.eNS_URI);
			if (theCHESSIoTOperationalProfileFactory != null) {
				return theCHESSIoTOperationalProfileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CHESSIoTOperationalProfileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTOperationalProfileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CHESSIoTOperationalProfilePackage.SERVICE: return createService();
			case CHESSIoTOperationalProfilePackage.COMMUNICATION: return createCommunication();
			case CHESSIoTOperationalProfilePackage.SERVER: return createServer();
			case CHESSIoTOperationalProfilePackage.COM_SYSTEM: return createComSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CHESSIoTOperationalProfilePackage.COMMUNICATION_TYPE:
				return createCommunicationTypeFromString(eDataType, initialValue);
			case CHESSIoTOperationalProfilePackage.COMMUNICATION_MODE:
				return createCommunicationModeFromString(eDataType, initialValue);
			case CHESSIoTOperationalProfilePackage.WIRELESS:
				return createWIRELESSFromString(eDataType, initialValue);
			case CHESSIoTOperationalProfilePackage.WIRED:
				return createWIREDFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CHESSIoTOperationalProfilePackage.COMMUNICATION_TYPE:
				return convertCommunicationTypeToString(eDataType, instanceValue);
			case CHESSIoTOperationalProfilePackage.COMMUNICATION_MODE:
				return convertCommunicationModeToString(eDataType, instanceValue);
			case CHESSIoTOperationalProfilePackage.WIRELESS:
				return convertWIRELESSToString(eDataType, instanceValue);
			case CHESSIoTOperationalProfilePackage.WIRED:
				return convertWIREDToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSystem createComSystem() {
		ComSystemImpl comSystem = new ComSystemImpl();
		return comSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationType createCommunicationTypeFromString(EDataType eDataType, String initialValue) {
		CommunicationType result = CommunicationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMode createCommunicationModeFromString(EDataType eDataType, String initialValue) {
		CommunicationMode result = CommunicationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WIRELESS createWIRELESSFromString(EDataType eDataType, String initialValue) {
		WIRELESS result = WIRELESS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWIRELESSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WIRED createWIREDFromString(EDataType eDataType, String initialValue) {
		WIRED result = WIRED.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWIREDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTOperationalProfilePackage getCHESSIoTOperationalProfilePackage() {
		return (CHESSIoTOperationalProfilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CHESSIoTOperationalProfilePackage getPackage() {
		return CHESSIoTOperationalProfilePackage.eINSTANCE;
	}

} //CHESSIoTOperationalProfileFactoryImpl
