/**
 */
package org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext;

import org.eclipse.uml2.uml.Component;

import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis;
import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement;
import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponentPackage;

import org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Context Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.AnalysisContextElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.AnalysisContextElementImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.AnalysisContextElementImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.AnalysisContextElementImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.AnalysisContextElementImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.AnalysisContextElementImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.AnalysisContextElementImpl#getContextAnalysis <em>Context Analysis</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.AnalysisContextElementImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.AnalysisContextElementImpl#getInstantiatedArchitecture <em>Instantiated Architecture</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisContextElementImpl extends EObjectImpl implements AnalysisContextElement {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Analysis TYPE_EDEFAULT = Analysis.FMEA_ANALYSIS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Analysis type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> conditions;

	/**
	 * The default value of the '{@link #isValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid()
	 * @generated
	 * @ordered
	 */
	protected boolean valid = VALID_EDEFAULT;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected String result = RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class root;

	/**
	 * The cached value of the '{@link #getContextAnalysis() <em>Context Analysis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextAnalysis()
	 * @generated
	 * @ordered
	 */
	protected GaAnalysisContext contextAnalysis;

	/**
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

	/**
	 * The cached value of the '{@link #getInstantiatedArchitecture() <em>Instantiated Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatedArchitecture()
	 * @generated
	 * @ordered
	 */
	protected InstantiatedArchitectureConfiguration instantiatedArchitecture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisContextElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependableComponentPackage.Literals.ANALYSIS_CONTEXT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analysis getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Analysis newType) {
		Analysis oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConditions() {
		if (conditions == null) {
			conditions = new EDataTypeUniqueEList<String>(String.class, this, DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValid() {
		return valid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValid(boolean newValid) {
		boolean oldValid = valid;
		valid = newValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(String newResult) {
		String oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getRoot() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject)root;
			root = (org.eclipse.uml2.uml.Class)eResolveProxy(oldRoot);
			if (root != oldRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(org.eclipse.uml2.uml.Class newRoot) {
		org.eclipse.uml2.uml.Class oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaAnalysisContext getContextAnalysis() {
		if (contextAnalysis != null && contextAnalysis.eIsProxy()) {
			InternalEObject oldContextAnalysis = (InternalEObject)contextAnalysis;
			contextAnalysis = (GaAnalysisContext)eResolveProxy(oldContextAnalysis);
			if (contextAnalysis != oldContextAnalysis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__CONTEXT_ANALYSIS, oldContextAnalysis, contextAnalysis));
			}
		}
		return contextAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaAnalysisContext basicGetContextAnalysis() {
		return contextAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextAnalysis(GaAnalysisContext newContextAnalysis) {
		GaAnalysisContext oldContextAnalysis = contextAnalysis;
		contextAnalysis = newContextAnalysis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__CONTEXT_ANALYSIS, oldContextAnalysis, contextAnalysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiatedArchitectureConfiguration getInstantiatedArchitecture() {
		if (instantiatedArchitecture != null && instantiatedArchitecture.eIsProxy()) {
			InternalEObject oldInstantiatedArchitecture = (InternalEObject)instantiatedArchitecture;
			instantiatedArchitecture = (InstantiatedArchitectureConfiguration)eResolveProxy(oldInstantiatedArchitecture);
			if (instantiatedArchitecture != oldInstantiatedArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__INSTANTIATED_ARCHITECTURE, oldInstantiatedArchitecture, instantiatedArchitecture));
			}
		}
		return instantiatedArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiatedArchitectureConfiguration basicGetInstantiatedArchitecture() {
		return instantiatedArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiatedArchitecture(InstantiatedArchitectureConfiguration newInstantiatedArchitecture) {
		InstantiatedArchitectureConfiguration oldInstantiatedArchitecture = instantiatedArchitecture;
		instantiatedArchitecture = newInstantiatedArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__INSTANTIATED_ARCHITECTURE, oldInstantiatedArchitecture, instantiatedArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__TYPE:
				return getType();
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__DATE:
				return getDate();
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__CONDITIONS:
				return getConditions();
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__VALID:
				return isValid();
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__RESULT:
				return getResult();
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__CONTEXT_ANALYSIS:
				if (resolve) return getContextAnalysis();
				return basicGetContextAnalysis();
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__INSTANTIATED_ARCHITECTURE:
				if (resolve) return getInstantiatedArchitecture();
				return basicGetInstantiatedArchitecture();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__TYPE:
				setType((Analysis)newValue);
				return;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__DATE:
				setDate((String)newValue);
				return;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends String>)newValue);
				return;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__VALID:
				setValid((Boolean)newValue);
				return;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__RESULT:
				setResult((String)newValue);
				return;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__ROOT:
				setRoot((org.eclipse.uml2.uml.Class)newValue);
				return;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__CONTEXT_ANALYSIS:
				setContextAnalysis((GaAnalysisContext)newValue);
				return;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__INSTANTIATED_ARCHITECTURE:
				setInstantiatedArchitecture((InstantiatedArchitectureConfiguration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__CONDITIONS:
				getConditions().clear();
				return;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__VALID:
				setValid(VALID_EDEFAULT);
				return;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__RESULT:
				setResult(RESULT_EDEFAULT);
				return;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__ROOT:
				setRoot((org.eclipse.uml2.uml.Class)null);
				return;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__CONTEXT_ANALYSIS:
				setContextAnalysis((GaAnalysisContext)null);
				return;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__INSTANTIATED_ARCHITECTURE:
				setInstantiatedArchitecture((InstantiatedArchitectureConfiguration)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__VALID:
				return valid != VALID_EDEFAULT;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__RESULT:
				return RESULT_EDEFAULT == null ? result != null : !RESULT_EDEFAULT.equals(result);
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__ROOT:
				return root != null;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__CONTEXT_ANALYSIS:
				return contextAnalysis != null;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__BASE_COMPONENT:
				return base_Component != null;
			case DependableComponentPackage.ANALYSIS_CONTEXT_ELEMENT__INSTANTIATED_ARCHITECTURE:
				return instantiatedArchitecture != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", date: ");
		result.append(date);
		result.append(", conditions: ");
		result.append(conditions);
		result.append(", valid: ");
		result.append(valid);
		result.append(", result: ");
		result.append(result);
		result.append(')');
		return result.toString();
	}

} //AnalysisContextElementImpl
