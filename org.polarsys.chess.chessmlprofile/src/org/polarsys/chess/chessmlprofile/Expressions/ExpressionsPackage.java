/**
 */
package org.polarsys.chess.chessmlprofile.Expressions;

import org.eclipse.emf.ecore.EClass;
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
 * @see org.polarsys.chess.chessmlprofile.Expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Expressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://CHESS/Expressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Expressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsPackage eINSTANCE = org.polarsys.chess.chessmlprofile.Expressions.impl.ExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.chess.chessmlprofile.Expressions.impl.MacroDefinitionImpl <em>Macro Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.chessmlprofile.Expressions.impl.MacroDefinitionImpl
	 * @see org.polarsys.chess.chessmlprofile.Expressions.impl.ExpressionsPackageImpl#getMacroDefinition()
	 * @generated
	 */
	int MACRO_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DEFINITION__BASE_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Macro Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.chessmlprofile.Expressions.impl.ParameterAssumptionsImpl <em>Parameter Assumptions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.chessmlprofile.Expressions.impl.ParameterAssumptionsImpl
	 * @see org.polarsys.chess.chessmlprofile.Expressions.impl.ExpressionsPackageImpl#getParameterAssumptions()
	 * @generated
	 */
	int PARAMETER_ASSUMPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ASSUMPTIONS__BASE_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Parameter Assumptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ASSUMPTIONS_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.chessmlprofile.Expressions.MacroDefinition <em>Macro Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Definition</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Expressions.MacroDefinition
	 * @generated
	 */
	EClass getMacroDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Expressions.MacroDefinition#getBase_Constraint <em>Base Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Constraint</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Expressions.MacroDefinition#getBase_Constraint()
	 * @see #getMacroDefinition()
	 * @generated
	 */
	EReference getMacroDefinition_Base_Constraint();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.chessmlprofile.Expressions.ParameterAssumptions <em>Parameter Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Assumptions</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Expressions.ParameterAssumptions
	 * @generated
	 */
	EClass getParameterAssumptions();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.Expressions.ParameterAssumptions#getBase_Constraint <em>Base Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Constraint</em>'.
	 * @see org.polarsys.chess.chessmlprofile.Expressions.ParameterAssumptions#getBase_Constraint()
	 * @see #getParameterAssumptions()
	 * @generated
	 */
	EReference getParameterAssumptions_Base_Constraint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionsFactory getExpressionsFactory();

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
		 * The meta object literal for the '{@link org.polarsys.chess.chessmlprofile.Expressions.impl.MacroDefinitionImpl <em>Macro Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.chessmlprofile.Expressions.impl.MacroDefinitionImpl
		 * @see org.polarsys.chess.chessmlprofile.Expressions.impl.ExpressionsPackageImpl#getMacroDefinition()
		 * @generated
		 */
		EClass MACRO_DEFINITION = eINSTANCE.getMacroDefinition();

		/**
		 * The meta object literal for the '<em><b>Base Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO_DEFINITION__BASE_CONSTRAINT = eINSTANCE.getMacroDefinition_Base_Constraint();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.chessmlprofile.Expressions.impl.ParameterAssumptionsImpl <em>Parameter Assumptions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.chessmlprofile.Expressions.impl.ParameterAssumptionsImpl
		 * @see org.polarsys.chess.chessmlprofile.Expressions.impl.ExpressionsPackageImpl#getParameterAssumptions()
		 * @generated
		 */
		EClass PARAMETER_ASSUMPTIONS = eINSTANCE.getParameterAssumptions();

		/**
		 * The meta object literal for the '<em><b>Base Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_ASSUMPTIONS__BASE_CONSTRAINT = eINSTANCE.getParameterAssumptions_Base_Constraint();

	}

} //ExpressionsPackage
