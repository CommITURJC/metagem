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
 * A representation of the literals of the enumeration '<em><b>Type Atribute</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mm_hybrid.MM_HybridPackage#getTypeAtribute()
 * @model
 * @generated
 */
public enum TypeAtribute implements Enumerator {
	/**
	 * The '<em><b>Copy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPY_VALUE
	 * @generated
	 * @ordered
	 */
	COPY(1, "copy", "copy"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Concatenation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCATENATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONCATENATION(2, "concatenation", "concatenation"), /**
	 * The '<em><b>Unique</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	UNIQUE(3, "unique", "unique"), /**
	 * The '<em><b>Various</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIOUS_VALUE
	 * @generated
	 * @ordered
	 */
	VARIOUS(4, "various", "various"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Copy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Copy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COPY
	 * @model name="copy"
	 * @generated
	 * @ordered
	 */
	public static final int COPY_VALUE = 1;

	/**
	 * The '<em><b>Concatenation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Concatenation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONCATENATION
	 * @model name="concatenation"
	 * @generated
	 * @ordered
	 */
	public static final int CONCATENATION_VALUE = 2;

	/**
	 * The '<em><b>Unique</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unique</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIQUE
	 * @model name="unique"
	 * @generated
	 * @ordered
	 */
	public static final int UNIQUE_VALUE = 3;

	/**
	 * The '<em><b>Various</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Various</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIOUS
	 * @model name="various"
	 * @generated
	 * @ordered
	 */
	public static final int VARIOUS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Atribute</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeAtribute[] VALUES_ARRAY = new TypeAtribute[] {
			COPY, CONCATENATION, UNIQUE, VARIOUS, };

	/**
	 * A public read-only list of all the '<em><b>Type Atribute</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeAtribute> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Atribute</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeAtribute get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeAtribute result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Atribute</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeAtribute getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeAtribute result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Atribute</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeAtribute get(int value) {
		switch (value) {
		case COPY_VALUE:
			return COPY;
		case CONCATENATION_VALUE:
			return CONCATENATION;
		case UNIQUE_VALUE:
			return UNIQUE;
		case VARIOUS_VALUE:
			return VARIOUS;
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
	private TypeAtribute(int value, String name, String literal) {
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

} //TypeAtribute
