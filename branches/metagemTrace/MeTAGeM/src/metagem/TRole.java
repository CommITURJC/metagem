/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TRole</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see metagem.MetagemPackage#getTRole()
 * @model
 * @generated
 */
public enum TRole implements Enumerator {
	/**
	 * The '<em><b>Is Main</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_MAIN_VALUE
	 * @generated
	 * @ordered
	 */
	IS_MAIN(0, "IsMain", "IsMain"),

	/**
	 * The '<em><b>Is Secondary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_SECONDARY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_SECONDARY(1, "IsSecondary", "IsSecondary"),

	/**
	 * The '<em><b>Is Abstract</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_ABSTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	IS_ABSTRACT(2, "IsAbstract", "IsAbstract");

	/**
	 * The '<em><b>Is Main</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Main</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_MAIN
	 * @model name="IsMain"
	 * @generated
	 * @ordered
	 */
	public static final int IS_MAIN_VALUE = 0;

	/**
	 * The '<em><b>Is Secondary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Secondary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_SECONDARY
	 * @model name="IsSecondary"
	 * @generated
	 * @ordered
	 */
	public static final int IS_SECONDARY_VALUE = 1;

	/**
	 * The '<em><b>Is Abstract</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Abstract</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_ABSTRACT
	 * @model name="IsAbstract"
	 * @generated
	 * @ordered
	 */
	public static final int IS_ABSTRACT_VALUE = 2;

	/**
	 * An array of all the '<em><b>TRole</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TRole[] VALUES_ARRAY =
		new TRole[] {
			IS_MAIN,
			IS_SECONDARY,
			IS_ABSTRACT,
		};

	/**
	 * A public read-only list of all the '<em><b>TRole</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TRole> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TRole</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TRole get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TRole result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TRole</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TRole getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TRole result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TRole</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TRole get(int value) {
		switch (value) {
			case IS_MAIN_VALUE: return IS_MAIN;
			case IS_SECONDARY_VALUE: return IS_SECONDARY;
			case IS_ABSTRACT_VALUE: return IS_ABSTRACT;
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
	private TRole(int value, String name, String literal) {
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
	
} //TRole
