/**
 */
package org.polarsys.chess.chessmlprofile.Dependability.DependableComponent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext;

import org.eclipse.uml2.uml.Component;

import org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Context Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This stereotype is used to 
 * store the result of a V&V check.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getDate <em>Date</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#isValid <em>Valid</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getResult <em>Result</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getRoot <em>Root</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getContextAnalysis <em>Context Analysis</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getInstantiatedArchitecture <em>Instantiated Architecture</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponentPackage#getAnalysisContextElement()
 * @model
 * @generated
 */
public interface AnalysisContextElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis
	 * @see #setType(Analysis)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponentPackage#getAnalysisContextElement_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Analysis getType();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis
	 * @see #getType()
	 * @generated
	 */
	void setType(Analysis value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponentPackage#getAnalysisContextElement_Date()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.MARTE_PrimitivesTypes.DateTime" required="true" ordered="false"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' attribute list.
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponentPackage#getAnalysisContextElement_Conditions()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getConditions();

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see #setValid(boolean)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponentPackage#getAnalysisContextElement_Valid()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponentPackage#getAnalysisContextElement_Result()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(String value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(org.eclipse.uml2.uml.Class)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponentPackage#getAnalysisContextElement_Root()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getRoot();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Context Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Analysis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Analysis</em>' reference.
	 * @see #setContextAnalysis(GaAnalysisContext)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponentPackage#getAnalysisContextElement_ContextAnalysis()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GaAnalysisContext getContextAnalysis();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getContextAnalysis <em>Context Analysis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Analysis</em>' reference.
	 * @see #getContextAnalysis()
	 * @generated
	 */
	void setContextAnalysis(GaAnalysisContext value);

	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(Component)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponentPackage#getAnalysisContextElement_Base_Component()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

	/**
	 * Returns the value of the '<em><b>Instantiated Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiated Architecture</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiated Architecture</em>' reference.
	 * @see #setInstantiatedArchitecture(InstantiatedArchitectureConfiguration)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponentPackage#getAnalysisContextElement_InstantiatedArchitecture()
	 * @model ordered="false"
	 * @generated
	 */
	InstantiatedArchitectureConfiguration getInstantiatedArchitecture();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement#getInstantiatedArchitecture <em>Instantiated Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiated Architecture</em>' reference.
	 * @see #getInstantiatedArchitecture()
	 * @generated
	 */
	void setInstantiatedArchitecture(InstantiatedArchitectureConfiguration value);

} // AnalysisContextElement
