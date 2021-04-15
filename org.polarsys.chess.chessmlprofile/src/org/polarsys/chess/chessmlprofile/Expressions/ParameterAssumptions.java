/**
 */
package org.polarsys.chess.chessmlprofile.Expressions;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Assumptions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A special type of Constraint
 * used to store assumptions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.chessmlprofile.Expressions.ParameterAssumptions#getBase_Constraint <em>Base Constraint</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.chessmlprofile.Expressions.ExpressionsPackage#getParameterAssumptions()
 * @model
 * @generated
 */
public interface ParameterAssumptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Constraint</em>' reference.
	 * @see #setBase_Constraint(Constraint)
	 * @see org.polarsys.chess.chessmlprofile.Expressions.ExpressionsPackage#getParameterAssumptions_Base_Constraint()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Constraint getBase_Constraint();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.chessmlprofile.Expressions.ParameterAssumptions#getBase_Constraint <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Constraint</em>' reference.
	 * @see #getBase_Constraint()
	 * @generated
	 */
	void setBase_Constraint(Constraint value);

} // ParameterAssumptions
