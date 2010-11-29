/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Elem</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mm_hybrid.MM_HybridPackage#getTypeElem()
 * @model
 * @generated
 */
public enum TypeElem implements Enumerator {
	/**
	 * The '<em><b>My Eclassifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_ECLASSIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	MY_ECLASSIFIER(1, "MyEclassifier", "MyEclassifier"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>My Eattribute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_EATTRIBUTE_VALUE
	 * @generated
	 * @ordered
	 */
	MY_EATTRIBUTE(2, "MyEattribute", "MyEattribute"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>My Ereference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_EREFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	MY_EREFERENCE(3, "MyEreference", "MyEreference"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>My Eclassifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>My Eclassifier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MY_ECLASSIFIER
	 * @model name="MyEclassifier"
	 * @generated
	 * @ordered
	 */
	public static final int MY_ECLASSIFIER_VALUE = 1;

	/**
	 * The '<em><b>My Eattribute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>My Eattribute</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MY_EATTRIBUTE
	 * @model name="MyEattribute"
	 * @generated
	 * @ordered
	 */
	public static final int MY_EATTRIBUTE_VALUE = 2;

	/**
	 * The '<em><b>My Ereference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>My Ereference</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MY_EREFERENCE
	 * @model name="MyEreference"
	 * @generated
	 * @ordered
	 */
	public static final int MY_EREFERENCE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Elem</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeElem[] VALUES_ARRAY = new TypeElem[] {
			MY_ECLASSIFIER,
			MY_EATTRIBUTE,
			MY_EREFERENCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Elem</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeElem> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Elem</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeElem get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeElem result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Elem</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeElem getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeElem result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Elem</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeElem get(int value) {
		switch (value) {
			case MY_ECLASSIFIER_VALUE: return MY_ECLASSIFIER;
			case MY_EATTRIBUTE_VALUE: return MY_EATTRIBUTE;
			case MY_EREFERENCE_VALUE: return MY_EREFERENCE;
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
	private TypeElem(int value, String name, String literal) {
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

} //TypeElem
