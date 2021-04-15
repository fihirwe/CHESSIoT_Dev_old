/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl;

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

import org.eclipse.papyrus.sysml.blocks.BlocksPackage;

import org.eclipse.papyrus.sysml.portandflows.PortandflowsPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl.CHESSIoTHardwarePackageImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.BoardType;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemFactory;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTBoard;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTGateway;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTServer;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PowerSource;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.RFModule;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SerialInOut;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.TransmissionMode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CHESSIoTSystemPackageImpl extends EPackageImpl implements CHESSIoTSystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioTBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rfModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatingBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serialInOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioTGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioTServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum boardTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transmissionModeEEnum = null;

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
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CHESSIoTSystemPackageImpl() {
		super(eNS_URI, CHESSIoTSystemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CHESSIoTSystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CHESSIoTSystemPackage init() {
		if (isInited) return (CHESSIoTSystemPackage)EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSystemPackage.eNS_URI);

		// Obtain or create and register package
		CHESSIoTSystemPackageImpl theCHESSIoTSystemPackage = (CHESSIoTSystemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CHESSIoTSystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CHESSIoTSystemPackageImpl());

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
		CHESSIoTOperationalProfilePackageImpl theCHESSIoTOperationalProfilePackage = (CHESSIoTOperationalProfilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTOperationalProfilePackage.eNS_URI) instanceof CHESSIoTOperationalProfilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTOperationalProfilePackage.eNS_URI) : CHESSIoTOperationalProfilePackage.eINSTANCE);
		CHESSIoTHardwarePackageImpl theCHESSIoTHardwarePackage = (CHESSIoTHardwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTHardwarePackage.eNS_URI) instanceof CHESSIoTHardwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTHardwarePackage.eNS_URI) : CHESSIoTHardwarePackage.eINSTANCE);

		// Create package meta-data objects
		theCHESSIoTSystemPackage.createPackageContents();
		theCHESSIoTSoftwarePackage.createPackageContents();
		theCHESSIoTOperationalProfilePackage.createPackageContents();
		theCHESSIoTHardwarePackage.createPackageContents();

		// Initialize created meta-data
		theCHESSIoTSystemPackage.initializePackageContents();
		theCHESSIoTSoftwarePackage.initializePackageContents();
		theCHESSIoTOperationalProfilePackage.initializePackageContents();
		theCHESSIoTHardwarePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCHESSIoTSystemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CHESSIoTSystemPackage.eNS_URI, theCHESSIoTSystemPackage);
		return theCHESSIoTSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoTBoard() {
		return ioTBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIoTBoard_BoardType() {
		return (EAttribute)ioTBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIoTBoard_Mode() {
		return (EAttribute)ioTBoardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorBlock() {
		return sensorBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRFModule() {
		return rfModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuatingBlock() {
		return actuatingBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSource() {
		return powerSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerialInOut() {
		return serialInOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoTGateway() {
		return ioTGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoTServer() {
		return ioTServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser__() {
		return (EReference)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Base_Actor() {
		return (EReference)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalEntity() {
		return physicalEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBoardType() {
		return boardTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransmissionMode() {
		return transmissionModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSystemFactory getCHESSIoTSystemFactory() {
		return (CHESSIoTSystemFactory)getEFactoryInstance();
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
		ioTBoardEClass = createEClass(IO_TBOARD);
		createEAttribute(ioTBoardEClass, IO_TBOARD__BOARD_TYPE);
		createEAttribute(ioTBoardEClass, IO_TBOARD__MODE);

		sensorBlockEClass = createEClass(SENSOR_BLOCK);

		rfModuleEClass = createEClass(RF_MODULE);

		actuatingBlockEClass = createEClass(ACTUATING_BLOCK);

		powerSourceEClass = createEClass(POWER_SOURCE);

		serialInOutEClass = createEClass(SERIAL_IN_OUT);

		ioTGatewayEClass = createEClass(IO_TGATEWAY);

		ioTServerEClass = createEClass(IO_TSERVER);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__);
		createEReference(userEClass, USER__BASE_ACTOR);

		physicalEntityEClass = createEClass(PHYSICAL_ENTITY);

		// Create enums
		boardTypeEEnum = createEEnum(BOARD_TYPE);
		transmissionModeEEnum = createEEnum(TRANSMISSION_MODE);
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
		BlocksPackage theBlocksPackage = (BlocksPackage)EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);
		PortandflowsPackage thePortandflowsPackage = (PortandflowsPackage)EPackage.Registry.INSTANCE.getEPackage(PortandflowsPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ioTBoardEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		sensorBlockEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		rfModuleEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		actuatingBlockEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		powerSourceEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		serialInOutEClass.getESuperTypes().add(thePortandflowsPackage.getFlowPort());
		ioTGatewayEClass.getESuperTypes().add(this.getIoTServer());
		ioTServerEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		physicalEntityEClass.getESuperTypes().add(theBlocksPackage.getBlock());

		// Initialize classes, features, and operations; add parameters
		initEClass(ioTBoardEClass, IoTBoard.class, "IoTBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIoTBoard_BoardType(), this.getBoardType(), "boardType", null, 1, 1, IoTBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIoTBoard_Mode(), this.getTransmissionMode(), "mode", null, 1, 1, IoTBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sensorBlockEClass, SensorBlock.class, "SensorBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rfModuleEClass, RFModule.class, "RFModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actuatingBlockEClass, ActuatingBlock.class, "ActuatingBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(powerSourceEClass, PowerSource.class, "PowerSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serialInOutEClass, SerialInOut.class, "SerialInOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ioTGatewayEClass, IoTGateway.class, "IoTGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ioTServerEClass, IoTServer.class, "IoTServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser__(), this.getPhysicalEntity(), null, "_", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUser_Base_Actor(), theUMLPackage.getActor(), null, "base_Actor", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(physicalEntityEClass, PhysicalEntity.class, "PhysicalEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(boardTypeEEnum, BoardType.class, "BoardType");
		addEEnumLiteral(boardTypeEEnum, BoardType.RASBERRY_PI);
		addEEnumLiteral(boardTypeEEnum, BoardType.ARDUINO);
		addEEnumLiteral(boardTypeEEnum, BoardType.TEENSY);
		addEEnumLiteral(boardTypeEEnum, BoardType.BEAGLE_BONE_BLACK);
		addEEnumLiteral(boardTypeEEnum, BoardType.ADAFRUIT);

		initEEnum(transmissionModeEEnum, TransmissionMode.class, "TransmissionMode");
		addEEnumLiteral(transmissionModeEEnum, TransmissionMode.SERIAL);
		addEEnumLiteral(transmissionModeEEnum, TransmissionMode.WIRELESS);

		// Create resource
		createResource(eNS_URI);
	}

} //CHESSIoTSystemPackageImpl
