/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.sysml.blocks.Block;

import org.eclipse.papyrus.sysml.portandflows.FlowPort;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage
 * @generated
 */
public class CHESSIoTSystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CHESSIoTSystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CHESSIoTSystemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CHESSIoTSystemSwitch<Adapter> modelSwitch =
		new CHESSIoTSystemSwitch<Adapter>() {
			@Override
			public Adapter caseIoTBoard(IoTBoard object) {
				return createIoTBoardAdapter();
			}
			@Override
			public Adapter caseSensorBlock(SensorBlock object) {
				return createSensorBlockAdapter();
			}
			@Override
			public Adapter caseRFModule(RFModule object) {
				return createRFModuleAdapter();
			}
			@Override
			public Adapter caseActuatingBlock(ActuatingBlock object) {
				return createActuatingBlockAdapter();
			}
			@Override
			public Adapter casePowerSource(PowerSource object) {
				return createPowerSourceAdapter();
			}
			@Override
			public Adapter caseSerialInOut(SerialInOut object) {
				return createSerialInOutAdapter();
			}
			@Override
			public Adapter caseIoTGateway(IoTGateway object) {
				return createIoTGatewayAdapter();
			}
			@Override
			public Adapter caseIoTServer(IoTServer object) {
				return createIoTServerAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter casePhysicalEntity(PhysicalEntity object) {
				return createPhysicalEntityAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseFlowPort(FlowPort object) {
				return createFlowPortAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTBoard <em>Io TBoard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTBoard
	 * @generated
	 */
	public Adapter createIoTBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock <em>Sensor Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock
	 * @generated
	 */
	public Adapter createSensorBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.RFModule <em>RF Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.RFModule
	 * @generated
	 */
	public Adapter createRFModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock <em>Actuating Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock
	 * @generated
	 */
	public Adapter createActuatingBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PowerSource <em>Power Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PowerSource
	 * @generated
	 */
	public Adapter createPowerSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SerialInOut <em>Serial In Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SerialInOut
	 * @generated
	 */
	public Adapter createSerialInOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTGateway <em>Io TGateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTGateway
	 * @generated
	 */
	public Adapter createIoTGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTServer <em>Io TServer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTServer
	 * @generated
	 */
	public Adapter createIoTServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity <em>Physical Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity
	 * @generated
	 */
	public Adapter createPhysicalEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.sysml.blocks.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.sysml.blocks.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.sysml.portandflows.FlowPort <em>Flow Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.sysml.portandflows.FlowPort
	 * @generated
	 */
	public Adapter createFlowPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CHESSIoTSystemAdapterFactory
