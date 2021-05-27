/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.MARTE.MARTEPackage;

import org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

import org.eclipse.papyrus.MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MeasurementUnits.MeasurementUnitsPackage;

import org.eclipse.papyrus.MARTE_Library.RS_Library.RS_LibraryPackage;

import org.eclipse.papyrus.MARTE_Library.TimeLibrary.TimeLibraryPackage;

import org.eclipse.papyrus.MARTE_Library.TimeTypesLibrary.TimeTypesLibraryPackage;

import org.eclipse.papyrus.sysml.SysmlPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.ActuatorType;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.ActuatorUnit;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwareFactory;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.IoTPort;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.PhysicalBaord;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.PortType;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.SensorType;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.SensorUnit;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.SystemHW;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.TagUnit;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.portIn;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.portOut;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CHESSIoTHardwarePackageImpl extends EPackageImpl implements CHESSIoTHardwarePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemHWEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioTPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalBaordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actuatorTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CHESSIoTHardwarePackageImpl() {
		super(eNS_URI, CHESSIoTHardwareFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CHESSIoTHardwarePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CHESSIoTHardwarePackage init() {
		if (isInited) return (CHESSIoTHardwarePackage)EPackage.Registry.INSTANCE.getEPackage(CHESSIoTHardwarePackage.eNS_URI);

		// Obtain or create and register package
		CHESSIoTHardwarePackageImpl theCHESSIoTHardwarePackage = (CHESSIoTHardwarePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CHESSIoTHardwarePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CHESSIoTHardwarePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MARTEPackage.eINSTANCE.eClass();
		MeasurementUnitsPackage.eINSTANCE.eClass();
		GRM_BasicTypesPackage.eINSTANCE.eClass();
		MARTE_DataTypesPackage.eINSTANCE.eClass();
		BasicNFP_TypesPackage.eINSTANCE.eClass();
		TimeTypesLibraryPackage.eINSTANCE.eClass();
		TimeLibraryPackage.eINSTANCE.eClass();
		RS_LibraryPackage.eINSTANCE.eClass();
		MARTE_PrimitivesTypesPackage.eINSTANCE.eClass();
		SysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CHESSIoTSoftwarePackageImpl theCHESSIoTSoftwarePackage = (CHESSIoTSoftwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSoftwarePackage.eNS_URI) instanceof CHESSIoTSoftwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSoftwarePackage.eNS_URI) : CHESSIoTSoftwarePackage.eINSTANCE);
		CHESSIoTSystemPackageImpl theCHESSIoTSystemPackage = (CHESSIoTSystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSystemPackage.eNS_URI) instanceof CHESSIoTSystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSystemPackage.eNS_URI) : CHESSIoTSystemPackage.eINSTANCE);
		CHESSIoTOperationalProfilePackageImpl theCHESSIoTOperationalProfilePackage = (CHESSIoTOperationalProfilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTOperationalProfilePackage.eNS_URI) instanceof CHESSIoTOperationalProfilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTOperationalProfilePackage.eNS_URI) : CHESSIoTOperationalProfilePackage.eINSTANCE);

		// Create package meta-data objects
		theCHESSIoTHardwarePackage.createPackageContents();
		theCHESSIoTSoftwarePackage.createPackageContents();
		theCHESSIoTSystemPackage.createPackageContents();
		theCHESSIoTOperationalProfilePackage.createPackageContents();

		// Initialize created meta-data
		theCHESSIoTHardwarePackage.initializePackageContents();
		theCHESSIoTSoftwarePackage.initializePackageContents();
		theCHESSIoTSystemPackage.initializePackageContents();
		theCHESSIoTOperationalProfilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCHESSIoTHardwarePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CHESSIoTHardwarePackage.eNS_URI, theCHESSIoTHardwarePackage);
		return theCHESSIoTHardwarePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorUnit() {
		return sensorUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorUnit_SensorType() {
		return (EAttribute)sensorUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorUnit_Base_Component() {
		return (EReference)sensorUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuatorUnit() {
		return actuatorUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuatorUnit_ActuatorType() {
		return (EAttribute)actuatorUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuatorUnit_Base_Component() {
		return (EReference)actuatorUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemHW() {
		return systemHWEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemHW_Base_Component() {
		return (EReference)systemHWEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getportIn() {
		return portInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoTPort() {
		return ioTPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIoTPort_Type() {
		return (EAttribute)ioTPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIoTPort_AaportName() {
		return (EAttribute)ioTPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTPort_Base_Port() {
		return (EReference)ioTPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getportOut() {
		return portOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagUnit() {
		return tagUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagUnit_Base_Component() {
		return (EReference)tagUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalBaord() {
		return physicalBaordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalBaord_BoardName() {
		return (EAttribute)physicalBaordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalBaord_VirtualBoard() {
		return (EReference)physicalBaordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalBaord_Base_Component() {
		return (EReference)physicalBaordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortType() {
		return portTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensorType() {
		return sensorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActuatorType() {
		return actuatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTHardwareFactory getCHESSIoTHardwareFactory() {
		return (CHESSIoTHardwareFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sensorUnitEClass = createEClass(SENSOR_UNIT);
		createEAttribute(sensorUnitEClass, SENSOR_UNIT__SENSOR_TYPE);
		createEReference(sensorUnitEClass, SENSOR_UNIT__BASE_COMPONENT);

		actuatorUnitEClass = createEClass(ACTUATOR_UNIT);
		createEAttribute(actuatorUnitEClass, ACTUATOR_UNIT__ACTUATOR_TYPE);
		createEReference(actuatorUnitEClass, ACTUATOR_UNIT__BASE_COMPONENT);

		systemHWEClass = createEClass(SYSTEM_HW);
		createEReference(systemHWEClass, SYSTEM_HW__BASE_COMPONENT);

		portInEClass = createEClass(PORT_IN);

		ioTPortEClass = createEClass(IO_TPORT);
		createEAttribute(ioTPortEClass, IO_TPORT__TYPE);
		createEAttribute(ioTPortEClass, IO_TPORT__AAPORT_NAME);
		createEReference(ioTPortEClass, IO_TPORT__BASE_PORT);

		portOutEClass = createEClass(PORT_OUT);

		tagUnitEClass = createEClass(TAG_UNIT);
		createEReference(tagUnitEClass, TAG_UNIT__BASE_COMPONENT);

		physicalBaordEClass = createEClass(PHYSICAL_BAORD);
		createEAttribute(physicalBaordEClass, PHYSICAL_BAORD__BOARD_NAME);
		createEReference(physicalBaordEClass, PHYSICAL_BAORD__VIRTUAL_BOARD);
		createEReference(physicalBaordEClass, PHYSICAL_BAORD__BASE_COMPONENT);

		// Create enums
		portTypeEEnum = createEEnum(PORT_TYPE);
		sensorTypeEEnum = createEEnum(SENSOR_TYPE);
		actuatorTypeEEnum = createEEnum(ACTUATOR_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		CHESSIoTSoftwarePackage theCHESSIoTSoftwarePackage = (CHESSIoTSoftwarePackage)EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSoftwarePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		portInEClass.getESuperTypes().add(this.getIoTPort());
		portOutEClass.getESuperTypes().add(this.getIoTPort());

		// Initialize classes, features, and operations; add parameters
		initEClass(sensorUnitEClass, SensorUnit.class, "SensorUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensorUnit_SensorType(), this.getSensorType(), "sensorType", null, 1, 1, SensorUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSensorUnit_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, SensorUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actuatorUnitEClass, ActuatorUnit.class, "ActuatorUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuatorUnit_ActuatorType(), this.getActuatorType(), "actuatorType", null, 1, 1, ActuatorUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActuatorUnit_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, ActuatorUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemHWEClass, SystemHW.class, "SystemHW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemHW_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, SystemHW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(portInEClass, portIn.class, "portIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ioTPortEClass, IoTPort.class, "IoTPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIoTPort_Type(), this.getPortType(), "type", null, 1, 1, IoTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIoTPort_AaportName(), theTypesPackage.getString(), "aaportName", null, 1, 1, IoTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoTPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, IoTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(portOutEClass, portOut.class, "portOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tagUnitEClass, TagUnit.class, "TagUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTagUnit_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, TagUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(physicalBaordEClass, PhysicalBaord.class, "PhysicalBaord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalBaord_BoardName(), theTypesPackage.getString(), "boardName", null, 1, 1, PhysicalBaord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPhysicalBaord_VirtualBoard(), theCHESSIoTSoftwarePackage.getVirtualBoard(), null, "virtualBoard", null, 1, 1, PhysicalBaord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPhysicalBaord_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, PhysicalBaord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(portTypeEEnum, PortType.class, "PortType");
		addEEnumLiteral(portTypeEEnum, PortType.ANALOG);
		addEEnumLiteral(portTypeEEnum, PortType.DIGITAL);

		initEEnum(sensorTypeEEnum, SensorType.class, "SensorType");
		addEEnumLiteral(sensorTypeEEnum, SensorType.HUMIDITY);
		addEEnumLiteral(sensorTypeEEnum, SensorType.TEMEPERATURE);
		addEEnumLiteral(sensorTypeEEnum, SensorType.GAZ);
		addEEnumLiteral(sensorTypeEEnum, SensorType.ULTRASONIC);
		addEEnumLiteral(sensorTypeEEnum, SensorType.BODY);
		addEEnumLiteral(sensorTypeEEnum, SensorType.UNDEFINED);

		initEEnum(actuatorTypeEEnum, ActuatorType.class, "ActuatorType");
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.SERVO);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.RELAY);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.SONORE);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.LED);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.UNDEFINED);

		// Create resource
		createResource(eNS_URI);
	}

} //CHESSIoTHardwarePackageImpl
