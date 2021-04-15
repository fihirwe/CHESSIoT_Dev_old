/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.MARTE.MARTEPackage;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.GCM.GCMPackage;

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

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.impl.CHESSIoTHardwarePackageImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwareFactory;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.DoIoTAction;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.InternalEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTAction;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTElement;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SystemSW;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_CopyOf_VirtualBoard_1;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard_VirtualBoard;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CHESSIoTSoftwarePackageImpl extends EPackageImpl implements CHESSIoTSoftwarePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioTStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioTEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualBoard_VirtualBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemSWEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualBoard_CopyOf_VirtualBoard_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomingEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receivePayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioTActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outgoingEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendPayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioTElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doIoTActionEClass = null;

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
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CHESSIoTSoftwarePackageImpl() {
		super(eNS_URI, CHESSIoTSoftwareFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CHESSIoTSoftwarePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CHESSIoTSoftwarePackage init() {
		if (isInited) return (CHESSIoTSoftwarePackage)EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSoftwarePackage.eNS_URI);

		// Obtain or create and register package
		CHESSIoTSoftwarePackageImpl theCHESSIoTSoftwarePackage = (CHESSIoTSoftwarePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CHESSIoTSoftwarePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CHESSIoTSoftwarePackageImpl());

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
		CHESSIoTSystemPackageImpl theCHESSIoTSystemPackage = (CHESSIoTSystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSystemPackage.eNS_URI) instanceof CHESSIoTSystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSystemPackage.eNS_URI) : CHESSIoTSystemPackage.eINSTANCE);
		CHESSIoTOperationalProfilePackageImpl theCHESSIoTOperationalProfilePackage = (CHESSIoTOperationalProfilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTOperationalProfilePackage.eNS_URI) instanceof CHESSIoTOperationalProfilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTOperationalProfilePackage.eNS_URI) : CHESSIoTOperationalProfilePackage.eINSTANCE);
		CHESSIoTHardwarePackageImpl theCHESSIoTHardwarePackage = (CHESSIoTHardwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTHardwarePackage.eNS_URI) instanceof CHESSIoTHardwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTHardwarePackage.eNS_URI) : CHESSIoTHardwarePackage.eINSTANCE);

		// Create package meta-data objects
		theCHESSIoTSoftwarePackage.createPackageContents();
		theCHESSIoTSystemPackage.createPackageContents();
		theCHESSIoTOperationalProfilePackage.createPackageContents();
		theCHESSIoTHardwarePackage.createPackageContents();

		// Initialize created meta-data
		theCHESSIoTSoftwarePackage.initializePackageContents();
		theCHESSIoTSystemPackage.initializePackageContents();
		theCHESSIoTOperationalProfilePackage.initializePackageContents();
		theCHESSIoTHardwarePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCHESSIoTSoftwarePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CHESSIoTSoftwarePackage.eNS_URI, theCHESSIoTSoftwarePackage);
		return theCHESSIoTSoftwarePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualBoard() {
		return virtualBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualBoard_Name() {
		return (EAttribute)virtualBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualBoard_Base_Component() {
		return (EReference)virtualBoardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualBoard_Base_Class() {
		return (EReference)virtualBoardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualBoard_IoTState() {
		return (EReference)virtualBoardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoTState() {
		return ioTStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTState_OnEntry() {
		return (EReference)ioTStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTState_OnExit() {
		return (EReference)ioTStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTState_Base_State() {
		return (EReference)ioTStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoTEvent() {
		return ioTEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTEvent_Base_Class() {
		return (EReference)ioTEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualBoard_VirtualBoard() {
		return virtualBoard_VirtualBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualBoard_VirtualBoard_Name() {
		return (EAttribute)virtualBoard_VirtualBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualBoard_VirtualBoard_Base_Component() {
		return (EReference)virtualBoard_VirtualBoardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualBoard_VirtualBoard_Base_Class() {
		return (EReference)virtualBoard_VirtualBoardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualBoard_VirtualBoard_IoTState() {
		return (EReference)virtualBoard_VirtualBoardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualBoard_VirtualBoard_VE() {
		return (EReference)virtualBoard_VirtualBoardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualEntity() {
		return virtualEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualEntity_PhysicalEntity() {
		return (EReference)virtualEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualEntity_Base_Block() {
		return (EReference)virtualEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemSW() {
		return systemSWEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemSW_Base_Class() {
		return (EReference)systemSWEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemSW_Base_Component() {
		return (EReference)systemSWEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualBoard_CopyOf_VirtualBoard_1() {
		return virtualBoard_CopyOf_VirtualBoard_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualBoard_CopyOf_VirtualBoard_1_Name() {
		return (EAttribute)virtualBoard_CopyOf_VirtualBoard_1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualBoard_CopyOf_VirtualBoard_1_Base_Component() {
		return (EReference)virtualBoard_CopyOf_VirtualBoard_1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualBoard_CopyOf_VirtualBoard_1_Base_Class() {
		return (EReference)virtualBoard_CopyOf_VirtualBoard_1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualBoard_CopyOf_VirtualBoard_1_IoTState() {
		return (EReference)virtualBoard_CopyOf_VirtualBoard_1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualBoard_CopyOf_VirtualBoard_1_VE() {
		return (EReference)virtualBoard_CopyOf_VirtualBoard_1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncomingEvent() {
		return incomingEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomingEvent_Base_Behavior() {
		return (EReference)incomingEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomingEvent_Receive() {
		return (EReference)incomingEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomingEvent_Incoming() {
		return (EReference)incomingEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceivePayload() {
		return receivePayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceivePayload_Base_Operation() {
		return (EReference)receivePayloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceivePayload_Payload() {
		return (EReference)receivePayloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceivePayload_Base_Event() {
		return (EReference)receivePayloadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceivePayload_Base_Action() {
		return (EReference)receivePayloadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceivePayload_Port() {
		return (EReference)receivePayloadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoTAction() {
		return ioTActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTAction_Base_Class() {
		return (EReference)ioTActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayload() {
		return payloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayload_Content() {
		return (EAttribute)payloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPayload_Base_Message() {
		return (EReference)payloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayload_PayloadName() {
		return (EAttribute)payloadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPayload_Base_Comment() {
		return (EReference)payloadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutgoingEvent() {
		return outgoingEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutgoingEvent_IsPeriodic() {
		return (EAttribute)outgoingEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutgoingEvent_TimeInterval() {
		return (EAttribute)outgoingEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutgoingEvent_Send() {
		return (EReference)outgoingEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutgoingEvent_Outgoing() {
		return (EReference)outgoingEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendPayload() {
		return sendPayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendPayload_Base_Operation() {
		return (EReference)sendPayloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendPayload_Payload() {
		return (EReference)sendPayloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendPayload_Base_Event() {
		return (EReference)sendPayloadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendPayload_Base_Action() {
		return (EReference)sendPayloadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendPayload_Port() {
		return (EReference)sendPayloadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateTransition() {
		return stateTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_Base_Transition() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_StateSource() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_StateTarget() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateTransition_GuardExpression() {
		return (EAttribute)stateTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoTElement() {
		return ioTElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTElement_Base_Component() {
		return (EReference)ioTElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTElement_IoTState() {
		return (EReference)ioTElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalEvent() {
		return internalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalEvent_IsPeriodic() {
		return (EAttribute)internalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalEvent_TimeInterval() {
		return (EAttribute)internalEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalEvent_Do() {
		return (EReference)internalEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoIoTAction() {
		return doIoTActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoIoTAction_ActionName() {
		return (EAttribute)doIoTActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSoftwareFactory getCHESSIoTSoftwareFactory() {
		return (CHESSIoTSoftwareFactory)getEFactoryInstance();
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
		virtualBoardEClass = createEClass(VIRTUAL_BOARD);
		createEAttribute(virtualBoardEClass, VIRTUAL_BOARD__NAME);
		createEReference(virtualBoardEClass, VIRTUAL_BOARD__BASE_COMPONENT);
		createEReference(virtualBoardEClass, VIRTUAL_BOARD__BASE_CLASS);
		createEReference(virtualBoardEClass, VIRTUAL_BOARD__IO_TSTATE);

		ioTStateEClass = createEClass(IO_TSTATE);
		createEReference(ioTStateEClass, IO_TSTATE__ON_ENTRY);
		createEReference(ioTStateEClass, IO_TSTATE__ON_EXIT);
		createEReference(ioTStateEClass, IO_TSTATE__BASE_STATE);

		ioTEventEClass = createEClass(IO_TEVENT);
		createEReference(ioTEventEClass, IO_TEVENT__BASE_CLASS);

		virtualBoard_VirtualBoardEClass = createEClass(VIRTUAL_BOARD_VIRTUAL_BOARD);
		createEAttribute(virtualBoard_VirtualBoardEClass, VIRTUAL_BOARD_VIRTUAL_BOARD__NAME);
		createEReference(virtualBoard_VirtualBoardEClass, VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_COMPONENT);
		createEReference(virtualBoard_VirtualBoardEClass, VIRTUAL_BOARD_VIRTUAL_BOARD__BASE_CLASS);
		createEReference(virtualBoard_VirtualBoardEClass, VIRTUAL_BOARD_VIRTUAL_BOARD__IO_TSTATE);
		createEReference(virtualBoard_VirtualBoardEClass, VIRTUAL_BOARD_VIRTUAL_BOARD__VE);

		virtualEntityEClass = createEClass(VIRTUAL_ENTITY);
		createEReference(virtualEntityEClass, VIRTUAL_ENTITY__PHYSICAL_ENTITY);
		createEReference(virtualEntityEClass, VIRTUAL_ENTITY__BASE_BLOCK);

		systemSWEClass = createEClass(SYSTEM_SW);
		createEReference(systemSWEClass, SYSTEM_SW__BASE_CLASS);
		createEReference(systemSWEClass, SYSTEM_SW__BASE_COMPONENT);

		virtualBoard_CopyOf_VirtualBoard_1EClass = createEClass(VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1);
		createEAttribute(virtualBoard_CopyOf_VirtualBoard_1EClass, VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1__NAME);
		createEReference(virtualBoard_CopyOf_VirtualBoard_1EClass, VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1__BASE_COMPONENT);
		createEReference(virtualBoard_CopyOf_VirtualBoard_1EClass, VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1__BASE_CLASS);
		createEReference(virtualBoard_CopyOf_VirtualBoard_1EClass, VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1__IO_TSTATE);
		createEReference(virtualBoard_CopyOf_VirtualBoard_1EClass, VIRTUAL_BOARD_COPY_OF_VIRTUAL_BOARD_1__VE);

		incomingEventEClass = createEClass(INCOMING_EVENT);
		createEReference(incomingEventEClass, INCOMING_EVENT__BASE_BEHAVIOR);
		createEReference(incomingEventEClass, INCOMING_EVENT__RECEIVE);
		createEReference(incomingEventEClass, INCOMING_EVENT__INCOMING);

		receivePayloadEClass = createEClass(RECEIVE_PAYLOAD);
		createEReference(receivePayloadEClass, RECEIVE_PAYLOAD__BASE_OPERATION);
		createEReference(receivePayloadEClass, RECEIVE_PAYLOAD__PAYLOAD);
		createEReference(receivePayloadEClass, RECEIVE_PAYLOAD__BASE_EVENT);
		createEReference(receivePayloadEClass, RECEIVE_PAYLOAD__BASE_ACTION);
		createEReference(receivePayloadEClass, RECEIVE_PAYLOAD__PORT);

		ioTActionEClass = createEClass(IO_TACTION);
		createEReference(ioTActionEClass, IO_TACTION__BASE_CLASS);

		payloadEClass = createEClass(PAYLOAD);
		createEAttribute(payloadEClass, PAYLOAD__CONTENT);
		createEReference(payloadEClass, PAYLOAD__BASE_MESSAGE);
		createEAttribute(payloadEClass, PAYLOAD__PAYLOAD_NAME);
		createEReference(payloadEClass, PAYLOAD__BASE_COMMENT);

		outgoingEventEClass = createEClass(OUTGOING_EVENT);
		createEAttribute(outgoingEventEClass, OUTGOING_EVENT__IS_PERIODIC);
		createEAttribute(outgoingEventEClass, OUTGOING_EVENT__TIME_INTERVAL);
		createEReference(outgoingEventEClass, OUTGOING_EVENT__SEND);
		createEReference(outgoingEventEClass, OUTGOING_EVENT__OUTGOING);

		sendPayloadEClass = createEClass(SEND_PAYLOAD);
		createEReference(sendPayloadEClass, SEND_PAYLOAD__BASE_OPERATION);
		createEReference(sendPayloadEClass, SEND_PAYLOAD__PAYLOAD);
		createEReference(sendPayloadEClass, SEND_PAYLOAD__BASE_EVENT);
		createEReference(sendPayloadEClass, SEND_PAYLOAD__BASE_ACTION);
		createEReference(sendPayloadEClass, SEND_PAYLOAD__PORT);

		stateTransitionEClass = createEClass(STATE_TRANSITION);
		createEReference(stateTransitionEClass, STATE_TRANSITION__BASE_TRANSITION);
		createEReference(stateTransitionEClass, STATE_TRANSITION__STATE_SOURCE);
		createEReference(stateTransitionEClass, STATE_TRANSITION__STATE_TARGET);
		createEAttribute(stateTransitionEClass, STATE_TRANSITION__GUARD_EXPRESSION);

		ioTElementEClass = createEClass(IO_TELEMENT);
		createEReference(ioTElementEClass, IO_TELEMENT__BASE_COMPONENT);
		createEReference(ioTElementEClass, IO_TELEMENT__IO_TSTATE);

		internalEventEClass = createEClass(INTERNAL_EVENT);
		createEAttribute(internalEventEClass, INTERNAL_EVENT__IS_PERIODIC);
		createEAttribute(internalEventEClass, INTERNAL_EVENT__TIME_INTERVAL);
		createEReference(internalEventEClass, INTERNAL_EVENT__DO);

		doIoTActionEClass = createEClass(DO_IO_TACTION);
		createEAttribute(doIoTActionEClass, DO_IO_TACTION__ACTION_NAME);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		CHESSIoTSystemPackage theCHESSIoTSystemPackage = (CHESSIoTSystemPackage)EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSystemPackage.eNS_URI);
		BlocksPackage theBlocksPackage = (BlocksPackage)EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);
		GCMPackage theGCMPackage = (GCMPackage)EPackage.Registry.INSTANCE.getEPackage(GCMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		virtualEntityEClass.getESuperTypes().add(this.getSystemSW());
		incomingEventEClass.getESuperTypes().add(this.getIoTEvent());
		receivePayloadEClass.getESuperTypes().add(this.getIoTAction());
		outgoingEventEClass.getESuperTypes().add(this.getIoTEvent());
		sendPayloadEClass.getESuperTypes().add(this.getIoTAction());
		internalEventEClass.getESuperTypes().add(this.getIoTEvent());
		doIoTActionEClass.getESuperTypes().add(this.getIoTAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(virtualBoardEClass, VirtualBoard.class, "VirtualBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualBoard_Name(), theTypesPackage.getString(), "Name", null, 1, 1, VirtualBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualBoard_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, VirtualBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualBoard_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, VirtualBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualBoard_IoTState(), this.getIoTState(), null, "ioTState", null, 1, 1, VirtualBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ioTStateEClass, IoTState.class, "IoTState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoTState_OnEntry(), this.getIoTEvent(), null, "onEntry", null, 0, -1, IoTState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoTState_OnExit(), this.getIoTEvent(), null, "onExit", null, 0, -1, IoTState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoTState_Base_State(), theUMLPackage.getState(), null, "base_State", null, 1, 1, IoTState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ioTEventEClass, IoTEvent.class, "IoTEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoTEvent_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, IoTEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(virtualBoard_VirtualBoardEClass, VirtualBoard_VirtualBoard.class, "VirtualBoard_VirtualBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualBoard_VirtualBoard_Name(), theTypesPackage.getString(), "Name", null, 1, 1, VirtualBoard_VirtualBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualBoard_VirtualBoard_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, VirtualBoard_VirtualBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualBoard_VirtualBoard_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, VirtualBoard_VirtualBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualBoard_VirtualBoard_IoTState(), this.getIoTState(), null, "ioTState", null, 1, 1, VirtualBoard_VirtualBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualBoard_VirtualBoard_VE(), this.getVirtualEntity(), null, "VE", null, 1, 1, VirtualBoard_VirtualBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(virtualEntityEClass, VirtualEntity.class, "VirtualEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualEntity_PhysicalEntity(), theCHESSIoTSystemPackage.getPhysicalEntity(), null, "physicalEntity", null, 1, 1, VirtualEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualEntity_Base_Block(), theBlocksPackage.getBlock(), null, "base_Block", null, 1, 1, VirtualEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemSWEClass, SystemSW.class, "SystemSW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemSW_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, SystemSW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemSW_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, SystemSW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(virtualBoard_CopyOf_VirtualBoard_1EClass, VirtualBoard_CopyOf_VirtualBoard_1.class, "VirtualBoard_CopyOf_VirtualBoard_1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualBoard_CopyOf_VirtualBoard_1_Name(), theTypesPackage.getString(), "Name", null, 1, 1, VirtualBoard_CopyOf_VirtualBoard_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualBoard_CopyOf_VirtualBoard_1_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, VirtualBoard_CopyOf_VirtualBoard_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualBoard_CopyOf_VirtualBoard_1_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, VirtualBoard_CopyOf_VirtualBoard_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualBoard_CopyOf_VirtualBoard_1_IoTState(), this.getIoTState(), null, "ioTState", null, 1, 1, VirtualBoard_CopyOf_VirtualBoard_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualBoard_CopyOf_VirtualBoard_1_VE(), this.getVirtualEntity(), null, "VE", null, 1, 1, VirtualBoard_CopyOf_VirtualBoard_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(incomingEventEClass, IncomingEvent.class, "IncomingEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncomingEvent_Base_Behavior(), theUMLPackage.getBehavior(), null, "base_Behavior", null, 1, 1, IncomingEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIncomingEvent_Receive(), this.getReceivePayload(), null, "receive", null, 0, -1, IncomingEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIncomingEvent_Incoming(), this.getOutgoingEvent(), null, "incoming", null, 1, 1, IncomingEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(receivePayloadEClass, ReceivePayload.class, "ReceivePayload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceivePayload_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 1, 1, ReceivePayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReceivePayload_Payload(), this.getPayload(), null, "payload", null, 0, -1, ReceivePayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReceivePayload_Base_Event(), theUMLPackage.getEvent(), null, "base_Event", null, 1, 1, ReceivePayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReceivePayload_Base_Action(), theUMLPackage.getAction(), null, "base_Action", null, 1, 1, ReceivePayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReceivePayload_Port(), theGCMPackage.getClientServerPort(), null, "port", null, 1, 1, ReceivePayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ioTActionEClass, IoTAction.class, "IoTAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoTAction_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, IoTAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(payloadEClass, Payload.class, "Payload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPayload_Content(), theTypesPackage.getString(), "Content", null, 1, 1, Payload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPayload_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, Payload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPayload_PayloadName(), theTypesPackage.getString(), "payloadName", null, 1, 1, Payload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPayload_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 1, 1, Payload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(outgoingEventEClass, OutgoingEvent.class, "OutgoingEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutgoingEvent_IsPeriodic(), theTypesPackage.getBoolean(), "isPeriodic", null, 1, 1, OutgoingEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOutgoingEvent_TimeInterval(), theTypesPackage.getInteger(), "timeInterval", null, 1, 1, OutgoingEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutgoingEvent_Send(), this.getSendPayload(), null, "send", null, 0, -1, OutgoingEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutgoingEvent_Outgoing(), this.getIncomingEvent(), null, "outgoing", null, 1, 1, OutgoingEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sendPayloadEClass, SendPayload.class, "SendPayload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendPayload_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 1, 1, SendPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSendPayload_Payload(), this.getPayload(), null, "payload", null, 0, -1, SendPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSendPayload_Base_Event(), theUMLPackage.getEvent(), null, "base_Event", null, 1, 1, SendPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSendPayload_Base_Action(), theUMLPackage.getAction(), null, "base_Action", null, 1, 1, SendPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSendPayload_Port(), theGCMPackage.getClientServerPort(), null, "port", null, 1, 1, SendPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stateTransitionEClass, StateTransition.class, "StateTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateTransition_Base_Transition(), theUMLPackage.getTransition(), null, "base_Transition", null, 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateTransition_StateSource(), this.getIoTState(), null, "stateSource", null, 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateTransition_StateTarget(), this.getIoTState(), null, "stateTarget", null, 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStateTransition_GuardExpression(), theTypesPackage.getString(), "guardExpression", null, 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ioTElementEClass, IoTElement.class, "IoTElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoTElement_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, IoTElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoTElement_IoTState(), this.getIoTState(), null, "ioTState", null, 1, 1, IoTElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(internalEventEClass, InternalEvent.class, "InternalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalEvent_IsPeriodic(), theTypesPackage.getBoolean(), "isPeriodic", null, 1, 1, InternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInternalEvent_TimeInterval(), theTypesPackage.getInteger(), "timeInterval", null, 1, 1, InternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInternalEvent_Do(), this.getIoTAction(), null, "do", null, 1, 1, InternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(doIoTActionEClass, DoIoTAction.class, "DoIoTAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoIoTAction_ActionName(), theTypesPackage.getString(), "actionName", null, 1, 1, DoIoTAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CHESSIoTSoftwarePackageImpl
