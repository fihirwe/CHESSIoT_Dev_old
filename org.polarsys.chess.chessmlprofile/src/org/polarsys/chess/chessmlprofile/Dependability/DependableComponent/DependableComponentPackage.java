/*****************************************************************************
 * Copyright (c) 2011, 2015 University of Padova, Intecs
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 *
 *****************************************************************************/
package org.polarsys.chess.chessmlprofile.Dependability.DependableComponent;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponentFactory
 * @model kind="package"
 * @generated
 */
public interface DependableComponentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DependableComponent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://CHESS/Dependability/DependableComponent";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DependableComponent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DependableComponentPackage eINSTANCE = org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.FailureModesImpl <em>Failure Modes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.FailureModesImpl
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getFailureModes()
	 * @generated
	 */
	int FAILURE_MODES = 0;

	/**
	 * The feature id for the '<em><b>Base Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODES__BASE_SLOT = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODES__BASE_PORT = 1;

	/**
	 * The feature id for the '<em><b>Failure Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODES__FAILURE_MODE = 2;

	/**
	 * The feature id for the '<em><b>FPTC Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODES__FPTC_SPECIFICATION = 3;

	/**
	 * The number of structural features of the '<em>Failure Modes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODES_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.FailureModeImpl <em>Failure Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.FailureModeImpl
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getFailureMode()
	 * @generated
	 */
	int FAILURE_MODE = 6;

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureModes <em>Failure Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Modes</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureModes
	 * @generated
	 */
	EClass getFailureModes();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureModes#getBase_Slot <em>Base Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Slot</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureModes#getBase_Slot()
	 * @see #getFailureModes()
	 * @generated
	 */
	EReference getFailureModes_Base_Slot();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureModes#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureModes#getBase_Port()
	 * @see #getFailureModes()
	 * @generated
	 */
	EReference getFailureModes_Base_Port();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureModes#getFailureMode <em>Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failure Mode</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureModes#getFailureMode()
	 * @see #getFailureModes()
	 * @generated
	 */
	EReference getFailureModes_FailureMode();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureModes#getFPTCSpecification <em>FPTC Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>FPTC Specification</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureModes#getFPTCSpecification()
	 * @see #getFailureModes()
	 * @generated
	 */
	EReference getFailureModes_FPTCSpecification();

	/**
	 * The meta object id for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentImpl <em>Dependable Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentImpl
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getDependableComponent()
	 * @generated
	 */
	int DEPENDABLE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABLE_COMPONENT__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Error Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABLE_COMPONENT__ERROR_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABLE_COMPONENT__BASE_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABLE_COMPONENT__BASE_INSTANCE_SPECIFICATION = 3;

	/**
	 * The number of structural features of the '<em>Dependable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABLE_COMPONENT_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.ThreatImpl <em>Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.ThreatImpl
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getThreat()
	 * @generated
	 */
	int THREAT = 3;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.ErrorModelBehaviorImpl <em>Error Model Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.ErrorModelBehaviorImpl
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getErrorModelBehavior()
	 * @generated
	 */
	int ERROR_MODEL_BEHAVIOR = 2;

	/**
	 * The feature id for the '<em><b>Error Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_BEHAVIOR__ERROR_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_BEHAVIOR__BASE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_BEHAVIOR__BASE_INSTANCE_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_BEHAVIOR__BASE_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_BEHAVIOR__BASE_CONNECTOR = 4;

	/**
	 * The number of structural features of the '<em>Error Model Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_BEHAVIOR_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Failuremode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__FAILUREMODE = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__BASE_PORT = 1;

	/**
	 * The feature id for the '<em><b>Base Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__BASE_SLOT = 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__KIND = 3;

	/**
	 * The number of structural features of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.AnalysisContextElementImpl <em>Analysis Context Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.AnalysisContextElementImpl
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getAnalysisContextElement()
	 * @generated
	 */
	int ANALYSIS_CONTEXT_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CONTEXT_ELEMENT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CONTEXT_ELEMENT__DATE = 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CONTEXT_ELEMENT__CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CONTEXT_ELEMENT__VALID = 3;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CONTEXT_ELEMENT__RESULT = 4;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CONTEXT_ELEMENT__ROOT = 5;

	/**
	 * The feature id for the '<em><b>Context Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CONTEXT_ELEMENT__CONTEXT_ANALYSIS = 6;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CONTEXT_ELEMENT__BASE_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Instantiated Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CONTEXT_ELEMENT__INSTANTIATED_ARCHITECTURE = 8;

	/**
	 * The number of structural features of the '<em>Analysis Context Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CONTEXT_ELEMENT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.PropagationImpl <em>Propagation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.PropagationImpl
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getPropagation()
	 * @generated
	 */
	int PROPAGATION = 5;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION__PROB = 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION__DELAY = 1;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION__BASE_CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION__BASE_INSTANCE_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION__BASE_COMMENT = 4;

	/**
	 * The number of structural features of the '<em>Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPAGATION_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__SEVERITY = 2;

	/**
	 * The feature id for the '<em><b>Exposure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__EXPOSURE = 3;

	/**
	 * The feature id for the '<em><b>Controllability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__CONTROLLABILITY = 4;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__LIKELIHOOD = 5;

	/**
	 * The number of structural features of the '<em>Failure Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_FEATURE_COUNT = 6;


	/**
	 * The meta object id for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AttackType <em>Attack Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AttackType
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getAttackType()
	 * @generated
	 */
	int ATTACK_TYPE = 7;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.VulnerabilityType <em>Vulnerability Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.VulnerabilityType
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getVulnerabilityType()
	 * @generated
	 */
	int VULNERABILITY_TYPE = 8;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ThreatType <em>Threat Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ThreatType
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getThreatType()
	 * @generated
	 */
	int THREAT_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis <em>Analysis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getAnalysis()
	 * @generated
	 */
	int ANALYSIS = 10;

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureMode <em>Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Mode</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureMode
	 * @generated
	 */
	EClass getFailureMode();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureMode#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureMode#getBase_Class()
	 * @see #getFailureMode()
	 * @generated
	 */
	EReference getFailureMode_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureMode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureMode#getDescription()
	 * @see #getFailureMode()
	 * @generated
	 */
	EAttribute getFailureMode_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureMode#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureMode#getSeverity()
	 * @see #getFailureMode()
	 * @generated
	 */
	EAttribute getFailureMode_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureMode#getExposure <em>Exposure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exposure</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureMode#getExposure()
	 * @see #getFailureMode()
	 * @generated
	 */
	EAttribute getFailureMode_Exposure();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureMode#getControllability <em>Controllability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controllability</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureMode#getControllability()
	 * @see #getFailureMode()
	 * @generated
	 */
	EAttribute getFailureMode_Controllability();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureMode#getLikelihood <em>Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Likelihood</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.FailureMode#getLikelihood()
	 * @see #getFailureMode()
	 * @generated
	 */
	EAttribute getFailureMode_Likelihood();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AttackType <em>Attack Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attack Type</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AttackType
	 * @generated
	 */
	EEnum getAttackType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.VulnerabilityType <em>Vulnerability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vulnerability Type</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.VulnerabilityType
	 * @generated
	 */
	EEnum getVulnerabilityType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ThreatType <em>Threat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Threat Type</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ThreatType
	 * @generated
	 */
	EEnum getThreatType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Analysis</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis
	 * @generated
	 */
	EEnum getAnalysis();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponent <em>Dependable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependable Component</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponent
	 * @generated
	 */
	EClass getDependableComponent();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponent#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponent#getBase_Component()
	 * @see #getDependableComponent()
	 * @generated
	 */
	EReference getDependableComponent_Base_Component();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponent#getErrorModel <em>Error Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error Model</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponent#getErrorModel()
	 * @see #getDependableComponent()
	 * @generated
	 */
	EReference getDependableComponent_ErrorModel();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponent#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponent#getBase_Property()
	 * @see #getDependableComponent()
	 * @generated
	 */
	EReference getDependableComponent_Base_Property();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponent#getBase_InstanceSpecification <em>Base Instance Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Instance Specification</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponent#getBase_InstanceSpecification()
	 * @see #getDependableComponent()
	 * @generated
	 */
	EReference getDependableComponent_Base_InstanceSpecification();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Threat
	 * @generated
	 */
	EClass getThreat();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Threat#getFailuremode <em>Failuremode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failuremode</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Threat#getFailuremode()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Failuremode();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Threat#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Threat#getBase_Port()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Base_Port();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Threat#getBase_Slot <em>Base Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Slot</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Threat#getBase_Slot()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Base_Slot();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Threat#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Threat#getKind()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Kind();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement <em>Analysis Context Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Context Element</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement
	 * @generated
	 */
	EClass getAnalysisContextElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getType()
	 * @see #getAnalysisContextElement()
	 * @generated
	 */
	EAttribute getAnalysisContextElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getDate()
	 * @see #getAnalysisContextElement()
	 * @generated
	 */
	EAttribute getAnalysisContextElement_Date();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Conditions</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getConditions()
	 * @see #getAnalysisContextElement()
	 * @generated
	 */
	EAttribute getAnalysisContextElement_Conditions();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#isValid()
	 * @see #getAnalysisContextElement()
	 * @generated
	 */
	EAttribute getAnalysisContextElement_Valid();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getResult()
	 * @see #getAnalysisContextElement()
	 * @generated
	 */
	EAttribute getAnalysisContextElement_Result();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getRoot()
	 * @see #getAnalysisContextElement()
	 * @generated
	 */
	EReference getAnalysisContextElement_Root();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getContextAnalysis <em>Context Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Analysis</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getContextAnalysis()
	 * @see #getAnalysisContextElement()
	 * @generated
	 */
	EReference getAnalysisContextElement_ContextAnalysis();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getBase_Component()
	 * @see #getAnalysisContextElement()
	 * @generated
	 */
	EReference getAnalysisContextElement_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getInstantiatedArchitecture <em>Instantiated Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiated Architecture</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getInstantiatedArchitecture()
	 * @see #getAnalysisContextElement()
	 * @generated
	 */
	EReference getAnalysisContextElement_InstantiatedArchitecture();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ErrorModelBehavior <em>Error Model Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Model Behavior</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ErrorModelBehavior
	 * @generated
	 */
	EClass getErrorModelBehavior();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ErrorModelBehavior#getErrorModel <em>Error Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error Model</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ErrorModelBehavior#getErrorModel()
	 * @see #getErrorModelBehavior()
	 * @generated
	 */
	EReference getErrorModelBehavior_ErrorModel();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ErrorModelBehavior#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ErrorModelBehavior#getBase_Class()
	 * @see #getErrorModelBehavior()
	 * @generated
	 */
	EReference getErrorModelBehavior_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ErrorModelBehavior#getBase_InstanceSpecification <em>Base Instance Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Instance Specification</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ErrorModelBehavior#getBase_InstanceSpecification()
	 * @see #getErrorModelBehavior()
	 * @generated
	 */
	EReference getErrorModelBehavior_Base_InstanceSpecification();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ErrorModelBehavior#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ErrorModelBehavior#getBase_Property()
	 * @see #getErrorModelBehavior()
	 * @generated
	 */
	EReference getErrorModelBehavior_Base_Property();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ErrorModelBehavior#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ErrorModelBehavior#getBase_Connector()
	 * @see #getErrorModelBehavior()
	 * @generated
	 */
	EReference getErrorModelBehavior_Base_Connector();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Propagation <em>Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propagation</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Propagation
	 * @generated
	 */
	EClass getPropagation();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Propagation#getProb <em>Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Propagation#getProb()
	 * @see #getPropagation()
	 * @generated
	 */
	EAttribute getPropagation_Prob();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Propagation#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Propagation#getDelay()
	 * @see #getPropagation()
	 * @generated
	 */
	EAttribute getPropagation_Delay();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Propagation#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Propagation#getBase_Connector()
	 * @see #getPropagation()
	 * @generated
	 */
	EReference getPropagation_Base_Connector();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Propagation#getBase_InstanceSpecification <em>Base Instance Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Instance Specification</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Propagation#getBase_InstanceSpecification()
	 * @see #getPropagation()
	 * @generated
	 */
	EReference getPropagation_Base_InstanceSpecification();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Propagation#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Propagation#getBase_Comment()
	 * @see #getPropagation()
	 * @generated
	 */
	EReference getPropagation_Base_Comment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DependableComponentFactory getDependableComponentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.FailureModesImpl <em>Failure Modes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.FailureModesImpl
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getFailureModes()
		 * @generated
		 */
		EClass FAILURE_MODES = eINSTANCE.getFailureModes();

		/**
		 * The meta object literal for the '<em><b>Base Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODES__BASE_SLOT = eINSTANCE.getFailureModes_Base_Slot();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODES__BASE_PORT = eINSTANCE.getFailureModes_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Failure Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODES__FAILURE_MODE = eINSTANCE.getFailureModes_FailureMode();

		/**
		 * The meta object literal for the '<em><b>FPTC Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODES__FPTC_SPECIFICATION = eINSTANCE.getFailureModes_FPTCSpecification();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.FailureModeImpl <em>Failure Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.FailureModeImpl
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getFailureMode()
		 * @generated
		 */
		EClass FAILURE_MODE = eINSTANCE.getFailureMode();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE__BASE_CLASS = eINSTANCE.getFailureMode_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_MODE__DESCRIPTION = eINSTANCE.getFailureMode_Description();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_MODE__SEVERITY = eINSTANCE.getFailureMode_Severity();

		/**
		 * The meta object literal for the '<em><b>Exposure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_MODE__EXPOSURE = eINSTANCE.getFailureMode_Exposure();

		/**
		 * The meta object literal for the '<em><b>Controllability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_MODE__CONTROLLABILITY = eINSTANCE.getFailureMode_Controllability();

		/**
		 * The meta object literal for the '<em><b>Likelihood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_MODE__LIKELIHOOD = eINSTANCE.getFailureMode_Likelihood();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AttackType <em>Attack Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AttackType
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getAttackType()
		 * @generated
		 */
		EEnum ATTACK_TYPE = eINSTANCE.getAttackType();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.VulnerabilityType <em>Vulnerability Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.VulnerabilityType
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getVulnerabilityType()
		 * @generated
		 */
		EEnum VULNERABILITY_TYPE = eINSTANCE.getVulnerabilityType();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ThreatType <em>Threat Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ThreatType
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getThreatType()
		 * @generated
		 */
		EEnum THREAT_TYPE = eINSTANCE.getThreatType();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis <em>Analysis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getAnalysis()
		 * @generated
		 */
		EEnum ANALYSIS = eINSTANCE.getAnalysis();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentImpl <em>Dependable Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentImpl
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getDependableComponent()
		 * @generated
		 */
		EClass DEPENDABLE_COMPONENT = eINSTANCE.getDependableComponent();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABLE_COMPONENT__BASE_COMPONENT = eINSTANCE.getDependableComponent_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Error Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABLE_COMPONENT__ERROR_MODEL = eINSTANCE.getDependableComponent_ErrorModel();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABLE_COMPONENT__BASE_PROPERTY = eINSTANCE.getDependableComponent_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Base Instance Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABLE_COMPONENT__BASE_INSTANCE_SPECIFICATION = eINSTANCE.getDependableComponent_Base_InstanceSpecification();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.ThreatImpl <em>Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.ThreatImpl
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getThreat()
		 * @generated
		 */
		EClass THREAT = eINSTANCE.getThreat();

		/**
		 * The meta object literal for the '<em><b>Failuremode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__FAILUREMODE = eINSTANCE.getThreat_Failuremode();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__BASE_PORT = eINSTANCE.getThreat_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Base Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__BASE_SLOT = eINSTANCE.getThreat_Base_Slot();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__KIND = eINSTANCE.getThreat_Kind();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.AnalysisContextElementImpl <em>Analysis Context Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.AnalysisContextElementImpl
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getAnalysisContextElement()
		 * @generated
		 */
		EClass ANALYSIS_CONTEXT_ELEMENT = eINSTANCE.getAnalysisContextElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_CONTEXT_ELEMENT__TYPE = eINSTANCE.getAnalysisContextElement_Type();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_CONTEXT_ELEMENT__DATE = eINSTANCE.getAnalysisContextElement_Date();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_CONTEXT_ELEMENT__CONDITIONS = eINSTANCE.getAnalysisContextElement_Conditions();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_CONTEXT_ELEMENT__VALID = eINSTANCE.getAnalysisContextElement_Valid();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_CONTEXT_ELEMENT__RESULT = eINSTANCE.getAnalysisContextElement_Result();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_CONTEXT_ELEMENT__ROOT = eINSTANCE.getAnalysisContextElement_Root();

		/**
		 * The meta object literal for the '<em><b>Context Analysis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_CONTEXT_ELEMENT__CONTEXT_ANALYSIS = eINSTANCE.getAnalysisContextElement_ContextAnalysis();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_CONTEXT_ELEMENT__BASE_COMPONENT = eINSTANCE.getAnalysisContextElement_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Instantiated Architecture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_CONTEXT_ELEMENT__INSTANTIATED_ARCHITECTURE = eINSTANCE.getAnalysisContextElement_InstantiatedArchitecture();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.ErrorModelBehaviorImpl <em>Error Model Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.ErrorModelBehaviorImpl
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getErrorModelBehavior()
		 * @generated
		 */
		EClass ERROR_MODEL_BEHAVIOR = eINSTANCE.getErrorModelBehavior();

		/**
		 * The meta object literal for the '<em><b>Error Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_BEHAVIOR__ERROR_MODEL = eINSTANCE.getErrorModelBehavior_ErrorModel();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_BEHAVIOR__BASE_CLASS = eINSTANCE.getErrorModelBehavior_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Instance Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_BEHAVIOR__BASE_INSTANCE_SPECIFICATION = eINSTANCE.getErrorModelBehavior_Base_InstanceSpecification();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_BEHAVIOR__BASE_PROPERTY = eINSTANCE.getErrorModelBehavior_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_BEHAVIOR__BASE_CONNECTOR = eINSTANCE.getErrorModelBehavior_Base_Connector();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.PropagationImpl <em>Propagation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.PropagationImpl
		 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.impl.DependableComponentPackageImpl#getPropagation()
		 * @generated
		 */
		EClass PROPAGATION = eINSTANCE.getPropagation();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPAGATION__PROB = eINSTANCE.getPropagation_Prob();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPAGATION__DELAY = eINSTANCE.getPropagation_Delay();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATION__BASE_CONNECTOR = eINSTANCE.getPropagation_Base_Connector();

		/**
		 * The meta object literal for the '<em><b>Base Instance Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATION__BASE_INSTANCE_SPECIFICATION = eINSTANCE.getPropagation_Base_InstanceSpecification();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPAGATION__BASE_COMMENT = eINSTANCE.getPropagation_Base_Comment();

	}

} //DependableComponentPackage
