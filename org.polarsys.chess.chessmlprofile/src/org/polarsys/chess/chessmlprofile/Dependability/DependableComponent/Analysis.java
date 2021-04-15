/**
 */
package org.polarsys.chess.chessmlprofile.Dependability.DependableComponent;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Analysis</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.DependableComponentPackage#getAnalysis()
 * @model
 * @generated
 */
public enum Analysis implements Enumerator {
	/**
	 * The '<em><b>FMEA ANALYSIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FMEA_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	FMEA_ANALYSIS(0, "FMEA_ANALYSIS", "FMEA_ANALYSIS"),

	/**
	 * The '<em><b>FTA ANALYSIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FTA_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	FTA_ANALYSIS(1, "FTA_ANALYSIS", "FTA_ANALYSIS"),

	/**
	 * The '<em><b>CONTRACT BASED FTA ANALYSIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_BASED_FTA_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRACT_BASED_FTA_ANALYSIS(2, "CONTRACT_BASED_FTA_ANALYSIS", "CONTRACT_BASED_FTA_ANALYSIS"),

	/**
	 * The '<em><b>CONTRACT REFINEMENT ANALYSIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_REFINEMENT_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRACT_REFINEMENT_ANALYSIS(3, "CONTRACT_REFINEMENT_ANALYSIS", "CONTRACT_REFINEMENT_ANALYSIS"),

	/**
	 * The '<em><b>CONTRACT IMPLEMENTATION ANALYSIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_IMPLEMENTATION_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRACT_IMPLEMENTATION_ANALYSIS(4, "CONTRACT_IMPLEMENTATION_ANALYSIS", "CONTRACT_IMPLEMENTATION_ANALYSIS"),

	/**
	 * The '<em><b>PROPERTY VALIDATION ANALYSIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_VALIDATION_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTY_VALIDATION_ANALYSIS(5, "PROPERTY_VALIDATION_ANALYSIS", "PROPERTY_VALIDATION_ANALYSIS"),

	/**
	 * The '<em><b>CONTRACT PROPERTY VALIDATION ANALYSIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_PROPERTY_VALIDATION_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRACT_PROPERTY_VALIDATION_ANALYSIS(6, "CONTRACT_PROPERTY_VALIDATION_ANALYSIS", "CONTRACT_PROPERTY_VALIDATION_ANALYSIS"),

	/**
	 * The '<em><b>MODEL CHECKING ANALYSIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_CHECKING_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL_CHECKING_ANALYSIS(7, "MODEL_CHECKING_ANALYSIS", "MODEL_CHECKING_ANALYSIS"),

	/**
	 * The '<em><b>CONTRACT COMPOSITE IMPLEMENTATION ANALYSIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_COMPOSITE_IMPLEMENTATION_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRACT_COMPOSITE_IMPLEMENTATION_ANALYSIS(8, "CONTRACT_COMPOSITE_IMPLEMENTATION_ANALYSIS", "CONTRACT_COMPOSITE_IMPLEMENTATION_ANALYSIS");

	/**
	 * The '<em><b>FMEA ANALYSIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FMEA ANALYSIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FMEA_ANALYSIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FMEA_ANALYSIS_VALUE = 0;

	/**
	 * The '<em><b>FTA ANALYSIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FTA ANALYSIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FTA_ANALYSIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FTA_ANALYSIS_VALUE = 1;

	/**
	 * The '<em><b>CONTRACT BASED FTA ANALYSIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTRACT BASED FTA ANALYSIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_BASED_FTA_ANALYSIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACT_BASED_FTA_ANALYSIS_VALUE = 2;

	/**
	 * The '<em><b>CONTRACT REFINEMENT ANALYSIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTRACT REFINEMENT ANALYSIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_REFINEMENT_ANALYSIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACT_REFINEMENT_ANALYSIS_VALUE = 3;

	/**
	 * The '<em><b>CONTRACT IMPLEMENTATION ANALYSIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTRACT IMPLEMENTATION ANALYSIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_IMPLEMENTATION_ANALYSIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACT_IMPLEMENTATION_ANALYSIS_VALUE = 4;

	/**
	 * The '<em><b>PROPERTY VALIDATION ANALYSIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROPERTY VALIDATION ANALYSIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_VALIDATION_ANALYSIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_VALIDATION_ANALYSIS_VALUE = 5;

	/**
	 * The '<em><b>CONTRACT PROPERTY VALIDATION ANALYSIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTRACT PROPERTY VALIDATION ANALYSIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_PROPERTY_VALIDATION_ANALYSIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACT_PROPERTY_VALIDATION_ANALYSIS_VALUE = 6;

	/**
	 * The '<em><b>MODEL CHECKING ANALYSIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODEL CHECKING ANALYSIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODEL_CHECKING_ANALYSIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_CHECKING_ANALYSIS_VALUE = 7;

	/**
	 * The '<em><b>CONTRACT COMPOSITE IMPLEMENTATION ANALYSIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTRACT COMPOSITE IMPLEMENTATION ANALYSIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_COMPOSITE_IMPLEMENTATION_ANALYSIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACT_COMPOSITE_IMPLEMENTATION_ANALYSIS_VALUE = 8;

	/**
	 * An array of all the '<em><b>Analysis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Analysis[] VALUES_ARRAY =
		new Analysis[] {
			FMEA_ANALYSIS,
			FTA_ANALYSIS,
			CONTRACT_BASED_FTA_ANALYSIS,
			CONTRACT_REFINEMENT_ANALYSIS,
			CONTRACT_IMPLEMENTATION_ANALYSIS,
			PROPERTY_VALIDATION_ANALYSIS,
			CONTRACT_PROPERTY_VALIDATION_ANALYSIS,
			MODEL_CHECKING_ANALYSIS,
			CONTRACT_COMPOSITE_IMPLEMENTATION_ANALYSIS,
		};

	/**
	 * A public read-only list of all the '<em><b>Analysis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Analysis> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Analysis</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Analysis get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Analysis result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Analysis</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Analysis getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Analysis result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Analysis</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Analysis get(int value) {
		switch (value) {
			case FMEA_ANALYSIS_VALUE: return FMEA_ANALYSIS;
			case FTA_ANALYSIS_VALUE: return FTA_ANALYSIS;
			case CONTRACT_BASED_FTA_ANALYSIS_VALUE: return CONTRACT_BASED_FTA_ANALYSIS;
			case CONTRACT_REFINEMENT_ANALYSIS_VALUE: return CONTRACT_REFINEMENT_ANALYSIS;
			case CONTRACT_IMPLEMENTATION_ANALYSIS_VALUE: return CONTRACT_IMPLEMENTATION_ANALYSIS;
			case PROPERTY_VALIDATION_ANALYSIS_VALUE: return PROPERTY_VALIDATION_ANALYSIS;
			case CONTRACT_PROPERTY_VALIDATION_ANALYSIS_VALUE: return CONTRACT_PROPERTY_VALIDATION_ANALYSIS;
			case MODEL_CHECKING_ANALYSIS_VALUE: return MODEL_CHECKING_ANALYSIS;
			case CONTRACT_COMPOSITE_IMPLEMENTATION_ANALYSIS_VALUE: return CONTRACT_COMPOSITE_IMPLEMENTATION_ANALYSIS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Analysis(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Analysis
