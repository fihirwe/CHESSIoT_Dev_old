/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Board Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getBoardType()
 * @model
 * @generated
 */
public enum BoardType implements Enumerator {
	/**
	 * The '<em><b>Rasberry Pi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RASBERRY_PI_VALUE
	 * @generated
	 * @ordered
	 */
	RASBERRY_PI(0, "RasberryPi", "RasberryPi"),

	/**
	 * The '<em><b>Arduino</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARDUINO_VALUE
	 * @generated
	 * @ordered
	 */
	ARDUINO(1, "Arduino", "Arduino"),

	/**
	 * The '<em><b>Teensy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEENSY_VALUE
	 * @generated
	 * @ordered
	 */
	TEENSY(2, "Teensy", "Teensy"),

	/**
	 * The '<em><b>Beagle Bone Black</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEAGLE_BONE_BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	BEAGLE_BONE_BLACK(3, "BeagleBoneBlack", "BeagleBoneBlack"),

	/**
	 * The '<em><b>Adafruit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADAFRUIT_VALUE
	 * @generated
	 * @ordered
	 */
	ADAFRUIT(4, "Adafruit", "Adafruit");

	/**
	 * The '<em><b>Rasberry Pi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rasberry Pi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RASBERRY_PI
	 * @model name="RasberryPi"
	 * @generated
	 * @ordered
	 */
	public static final int RASBERRY_PI_VALUE = 0;

	/**
	 * The '<em><b>Arduino</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Arduino</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARDUINO
	 * @model name="Arduino"
	 * @generated
	 * @ordered
	 */
	public static final int ARDUINO_VALUE = 1;

	/**
	 * The '<em><b>Teensy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Teensy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEENSY
	 * @model name="Teensy"
	 * @generated
	 * @ordered
	 */
	public static final int TEENSY_VALUE = 2;

	/**
	 * The '<em><b>Beagle Bone Black</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Beagle Bone Black</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEAGLE_BONE_BLACK
	 * @model name="BeagleBoneBlack"
	 * @generated
	 * @ordered
	 */
	public static final int BEAGLE_BONE_BLACK_VALUE = 3;

	/**
	 * The '<em><b>Adafruit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adafruit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADAFRUIT
	 * @model name="Adafruit"
	 * @generated
	 * @ordered
	 */
	public static final int ADAFRUIT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Board Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BoardType[] VALUES_ARRAY =
		new BoardType[] {
			RASBERRY_PI,
			ARDUINO,
			TEENSY,
			BEAGLE_BONE_BLACK,
			ADAFRUIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Board Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BoardType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Board Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BoardType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BoardType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Board Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BoardType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BoardType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Board Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BoardType get(int value) {
		switch (value) {
			case RASBERRY_PI_VALUE: return RASBERRY_PI;
			case ARDUINO_VALUE: return ARDUINO;
			case TEENSY_VALUE: return TEENSY;
			case BEAGLE_BONE_BLACK_VALUE: return BEAGLE_BONE_BLACK;
			case ADAFRUIT_VALUE: return ADAFRUIT;
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
	private BoardType(int value, String name, String literal) {
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
	
} //BoardType
