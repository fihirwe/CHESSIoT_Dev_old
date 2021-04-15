/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.CHESSIoTHardwarePackage
 * @generated
 */
public class CHESSIoTHardwareAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CHESSIoTHardwarePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTHardwareAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CHESSIoTHardwarePackage.eINSTANCE;
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
	protected CHESSIoTHardwareSwitch<Adapter> modelSwitch =
		new CHESSIoTHardwareSwitch<Adapter>() {
			@Override
			public Adapter caseSensorUnit(SensorUnit object) {
				return createSensorUnitAdapter();
			}
			@Override
			public Adapter caseActuatorUnit(ActuatorUnit object) {
				return createActuatorUnitAdapter();
			}
			@Override
			public Adapter caseIoTBaord(IoTBaord object) {
				return createIoTBaordAdapter();
			}
			@Override
			public Adapter caseSystemHW(SystemHW object) {
				return createSystemHWAdapter();
			}
			@Override
			public Adapter caseportIn(portIn object) {
				return createportInAdapter();
			}
			@Override
			public Adapter caseIoTPort(IoTPort object) {
				return createIoTPortAdapter();
			}
			@Override
			public Adapter caseportOut(portOut object) {
				return createportOutAdapter();
			}
			@Override
			public Adapter caseTagUnit(TagUnit object) {
				return createTagUnitAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.SensorUnit <em>Sensor Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.SensorUnit
	 * @generated
	 */
	public Adapter createSensorUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.ActuatorUnit <em>Actuator Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.ActuatorUnit
	 * @generated
	 */
	public Adapter createActuatorUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.IoTBaord <em>Io TBaord</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.IoTBaord
	 * @generated
	 */
	public Adapter createIoTBaordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.SystemHW <em>System HW</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.SystemHW
	 * @generated
	 */
	public Adapter createSystemHWAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.portIn <em>port In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.portIn
	 * @generated
	 */
	public Adapter createportInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.IoTPort <em>Io TPort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.IoTPort
	 * @generated
	 */
	public Adapter createIoTPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.portOut <em>port Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.portOut
	 * @generated
	 */
	public Adapter createportOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.TagUnit <em>Tag Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTHardware.TagUnit
	 * @generated
	 */
	public Adapter createTagUnitAdapter() {
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

} //CHESSIoTHardwareAdapterFactory
