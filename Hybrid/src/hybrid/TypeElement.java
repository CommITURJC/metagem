/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Element</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hybrid.HybridPackage#getTypeElement()
 * @model
 * @generated
 */
public enum TypeElement implements Enumerator {
	/**
	 * The '<em><b>EClassifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECLASSIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	ECLASSIFIER(1, "EClassifier", "EClassifier"),

	/**
	 * The '<em><b>EAttribute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EATTRIBUTE_VALUE
	 * @generated
	 * @ordered
	 */
	EATTRIBUTE(2, "EAttribute", "EAttribute"),

	/**
	 * The '<em><b>EReference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EREFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	EREFERENCE(3, "EReference", "EReference");

	/**
	 * The '<em><b>EClassifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EClassifier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ECLASSIFIER
	 * @model name="EClassifier"
	 * @generated
	 * @ordered
	 */
	public static final int ECLASSIFIER_VALUE = 1;

	/**
	 * The '<em><b>EAttribute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EAttribute</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EATTRIBUTE
	 * @model name="EAttribute"
	 * @generated
	 * @ordered
	 */
	public static final int EATTRIBUTE_VALUE = 2;

	/**
	 * The '<em><b>EReference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EReference</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EREFERENCE
	 * @model name="EReference"
	 * @generated
	 * @ordered
	 */
	public static final int EREFERENCE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Element</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeElement[] VALUES_ARRAY =
		new TypeElement[] {
			ECLASSIFIER,
			EATTRIBUTE,
			EREFERENCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Element</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeElement> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Element</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeElement get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeElement result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Element</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeElement getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeElement result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Element</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeElement get(int value) {
		switch (value) {
			case ECLASSIFIER_VALUE: return ECLASSIFIER;
			case EATTRIBUTE_VALUE: return EATTRIBUTE;
			case EREFERENCE_VALUE: return EREFERENCE;
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
	private TypeElement(int value, String name, String literal) {
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
	
} //TypeElement
