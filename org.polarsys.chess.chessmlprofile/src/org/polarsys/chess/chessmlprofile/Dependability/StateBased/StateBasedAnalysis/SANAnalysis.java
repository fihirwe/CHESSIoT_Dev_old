/**
 */
package org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedAnalysis;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SAN Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * tentative
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedAnalysis.SANAnalysis#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedAnalysis.StateBasedAnalysisPackage#getSANAnalysis()
 * @model
 * @generated
 */
public interface SANAnalysis extends GaAnalysisContext {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedAnalysis.StateBasedAnalysisPackage#getSANAnalysis_Condition()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedAnalysis.SANAnalysis#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // SANAnalysis
