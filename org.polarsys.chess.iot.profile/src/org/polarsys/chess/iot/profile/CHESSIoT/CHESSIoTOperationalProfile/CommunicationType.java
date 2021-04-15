/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Communication Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage#getCommunicationType()
 * @model
 * @generated
 */
public enum CommunicationType implements Enumerator {
	/**
	 * The '<em><b>MQTT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQTT_VALUE
	 * @generated
	 * @ordered
	 */
	MQTT(0, "MQTT", "MQTT"),

	/**
	 * The '<em><b>Wifi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI_VALUE
	 * @generated
	 * @ordered
	 */
	WIFI(1, "Wifi", "Wifi"),

	/**
	 * The '<em><b>Bluetooth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUETOOTH_VALUE
	 * @generated
	 * @ordered
	 */
	BLUETOOTH(2, "Bluetooth", "Bluetooth"),

	/**
	 * The '<em><b>SERIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SERIAL(3, "SERIAL", "SERIAL"),

	/**
	 * The '<em><b>USB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USB_VALUE
	 * @generated
	 * @ordered
	 */
	USB(4, "USB", "USB"),

	/**
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(5, "undefined", "undefined");

	/**
	 * The '<em><b>MQTT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MQTT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MQTT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MQTT_VALUE = 0;

	/**
	 * The '<em><b>Wifi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wifi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIFI
	 * @model name="Wifi"
	 * @generated
	 * @ordered
	 */
	public static final int WIFI_VALUE = 1;

	/**
	 * The '<em><b>Bluetooth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bluetooth</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLUETOOTH
	 * @model name="Bluetooth"
	 * @generated
	 * @ordered
	 */
	public static final int BLUETOOTH_VALUE = 2;

	/**
	 * The '<em><b>SERIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERIAL_VALUE = 3;

	/**
	 * The '<em><b>USB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USB_VALUE = 4;

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undefined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model name="undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 5;

	/**
	 * An array of all the '<em><b>Communication Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CommunicationType[] VALUES_ARRAY =
		new CommunicationType[] {
			MQTT,
			WIFI,
			BLUETOOTH,
			SERIAL,
			USB,
			UNDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Communication Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CommunicationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Communication Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CommunicationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CommunicationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Communication Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CommunicationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CommunicationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Communication Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CommunicationType get(int value) {
		switch (value) {
			case MQTT_VALUE: return MQTT;
			case WIFI_VALUE: return WIFI;
			case BLUETOOTH_VALUE: return BLUETOOTH;
			case SERIAL_VALUE: return SERIAL;
			case USB_VALUE: return USB;
			case UNDEFINED_VALUE: return UNDEFINED;
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
	private CommunicationType(int value, String name, String literal) {
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
	
} //CommunicationType
