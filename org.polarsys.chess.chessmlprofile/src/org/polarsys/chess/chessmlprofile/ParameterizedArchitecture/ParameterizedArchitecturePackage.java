/**
 */
package org.polarsys.chess.chessmlprofile.ParameterizedArchitecture;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.ParameterizedArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface ParameterizedArchitecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ParameterizedArchitecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CHESS/ParameterizedArchitecture.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CHESS.ParameterizedArchitecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParameterizedArchitecturePackage eINSTANCE = org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.impl.ParameterizedArchitecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.impl.InstantiatedArchitectureConfigurationImpl <em>Instantiated Architecture Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.impl.InstantiatedArchitectureConfigurationImpl
	 * @see org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.impl.ParameterizedArchitecturePackageImpl#getInstantiatedArchitectureConfiguration()
	 * @generated
	 */
	int INSTANTIATED_ARCHITECTURE_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATED_ARCHITECTURE_CONFIGURATION__PARAMETER_LIST = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATED_ARCHITECTURE_CONFIGURATION__BASE_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Instantiated Root Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATED_ARCHITECTURE_CONFIGURATION__INSTANTIATED_ROOT_COMPONENT = 2;

	/**
	 * The number of structural features of the '<em>Instantiated Architecture Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATED_ARCHITECTURE_CONFIGURATION_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration <em>Instantiated Architecture Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiated Architecture Configuration</em>'.
	 * @see org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration
	 * @generated
	 */
	EClass getInstantiatedArchitectureConfiguration();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration#getParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter List</em>'.
	 * @see org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration#getParameterList()
	 * @see #getInstantiatedArchitectureConfiguration()
	 * @generated
	 */
	EAttribute getInstantiatedArchitectureConfiguration_ParameterList();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration#getBase_Property()
	 * @see #getInstantiatedArchitectureConfiguration()
	 * @generated
	 */
	EReference getInstantiatedArchitectureConfiguration_Base_Property();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration#getInstantiatedRootComponent <em>Instantiated Root Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiated Root Component</em>'.
	 * @see org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration#getInstantiatedRootComponent()
	 * @see #getInstantiatedArchitectureConfiguration()
	 * @generated
	 */
	EReference getInstantiatedArchitectureConfiguration_InstantiatedRootComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParameterizedArchitectureFactory getParameterizedArchitectureFactory();

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
		 * The meta object literal for the '{@link org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.impl.InstantiatedArchitectureConfigurationImpl <em>Instantiated Architecture Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.impl.InstantiatedArchitectureConfigurationImpl
		 * @see org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.impl.ParameterizedArchitecturePackageImpl#getInstantiatedArchitectureConfiguration()
		 * @generated
		 */
		EClass INSTANTIATED_ARCHITECTURE_CONFIGURATION = eINSTANCE.getInstantiatedArchitectureConfiguration();

		/**
		 * The meta object literal for the '<em><b>Parameter List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANTIATED_ARCHITECTURE_CONFIGURATION__PARAMETER_LIST = eINSTANCE.getInstantiatedArchitectureConfiguration_ParameterList();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATED_ARCHITECTURE_CONFIGURATION__BASE_PROPERTY = eINSTANCE.getInstantiatedArchitectureConfiguration_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Instantiated Root Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATED_ARCHITECTURE_CONFIGURATION__INSTANTIATED_ROOT_COMPONENT = eINSTANCE.getInstantiatedArchitectureConfiguration_InstantiatedRootComponent();

	}

} //ParameterizedArchitecturePackage
