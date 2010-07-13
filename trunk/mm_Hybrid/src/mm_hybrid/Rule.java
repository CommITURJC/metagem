/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm_hybrid.Rule#getName_rule <em>Name rule</em>}</li>
 *   <li>{@link mm_hybrid.Rule#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link mm_hybrid.Rule#isIsMain <em>Is Main</em>}</li>
 *   <li>{@link mm_hybrid.Rule#getIn <em>In</em>}</li>
 *   <li>{@link mm_hybrid.Rule#getOut <em>Out</em>}</li>
 *   <li>{@link mm_hybrid.Rule#getTypeAttribute <em>Type Attribute</em>}</li>
 *   <li>{@link mm_hybrid.Rule#getTypeElement <em>Type Element</em>}</li>
 *   <li>{@link mm_hybrid.Rule#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getRule()
 * @model annotation="gmf.node label='name_rule' label.icon='false' border.color='204,153,0' color='253,229,141'"
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name rule</em>' attribute.
	 * @see #setName_rule(String)
	 * @see mm_hybrid.MM_HybridPackage#getRule_Name_rule()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName_rule();

	/**
	 * Sets the value of the '{@link mm_hybrid.Rule#getName_rule <em>Name rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name rule</em>' attribute.
	 * @see #getName_rule()
	 * @generated
	 */
	void setName_rule(String value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see mm_hybrid.MM_HybridPackage#getRule_IsAbstract()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link mm_hybrid.Rule#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Main</em>' attribute.
	 * @see #setIsMain(boolean)
	 * @see mm_hybrid.MM_HybridPackage#getRule_IsMain()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsMain();

	/**
	 * Sets the value of the '{@link mm_hybrid.Rule#isIsMain <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Main</em>' attribute.
	 * @see #isIsMain()
	 * @generated
	 */
	void setIsMain(boolean value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference list.
	 * The list contents are of type {@link mm_hybrid.SourceElementRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference list.
	 * @see mm_hybrid.MM_HybridPackage#getRule_In()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceElementRule> getIn();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' containment reference list.
	 * The list contents are of type {@link mm_hybrid.TargetElementRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' containment reference list.
	 * @see mm_hybrid.MM_HybridPackage#getRule_Out()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TargetElementRule> getOut();

	/**
	 * Returns the value of the '<em><b>Type Attribute</b></em>' attribute.
	 * The literals are from the enumeration {@link mm_hybrid.TypeAtribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Attribute</em>' attribute.
	 * @see mm_hybrid.TypeAtribute
	 * @see #setTypeAttribute(TypeAtribute)
	 * @see mm_hybrid.MM_HybridPackage#getRule_TypeAttribute()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	TypeAtribute getTypeAttribute();

	/**
	 * Sets the value of the '{@link mm_hybrid.Rule#getTypeAttribute <em>Type Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Attribute</em>' attribute.
	 * @see mm_hybrid.TypeAtribute
	 * @see #getTypeAttribute()
	 * @generated
	 */
	void setTypeAttribute(TypeAtribute value);

	/**
	 * Returns the value of the '<em><b>Type Element</b></em>' attribute.
	 * The literals are from the enumeration {@link mm_hybrid.TypeElem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Element</em>' attribute.
	 * @see mm_hybrid.TypeElem
	 * @see #setTypeElement(TypeElem)
	 * @see mm_hybrid.MM_HybridPackage#getRule_TypeElement()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	TypeElem getTypeElement();

	/**
	 * Sets the value of the '{@link mm_hybrid.Rule#getTypeElement <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Element</em>' attribute.
	 * @see mm_hybrid.TypeElem
	 * @see #getTypeElement()
	 * @generated
	 */
	void setTypeElement(TypeElem value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link mm_hybrid.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see mm_hybrid.MM_HybridPackage#getRule_Extends()
	 * @model
	 * @generated
	 */
	EList<Rule> getExtends();

} // Rule
