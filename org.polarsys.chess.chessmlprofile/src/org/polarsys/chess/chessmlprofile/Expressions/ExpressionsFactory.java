/**
 */
package org.polarsys.chess.chessmlprofile.Expressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.chessmlprofile.Expressions.ExpressionsPackage
 * @generated
 */
public interface ExpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsFactory eINSTANCE = org.polarsys.chess.chessmlprofile.Expressions.impl.ExpressionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Macro Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macro Definition</em>'.
	 * @generated
	 */
	MacroDefinition createMacroDefinition();

	/**
	 * Returns a new object of class '<em>Parameter Assumptions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Assumptions</em>'.
	 * @generated
	 */
	ParameterAssumptions createParameterAssumptions();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExpressionsPackage getExpressionsPackage();

} //ExpressionsFactory
