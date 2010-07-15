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
 * A representation of the model object '<em><b>Element Included</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm_hybrid.ElementIncluded#getTypeAttribute <em>Type Attribute</em>}</li>
 *   <li>{@link mm_hybrid.ElementIncluded#getTypeElement <em>Type Element</em>}</li>
 *   <li>{@link mm_hybrid.ElementIncluded#getRight <em>Right</em>}</li>
 *   <li>{@link mm_hybrid.ElementIncluded#getLeft <em>Left</em>}</li>
 *   <li>{@link mm_hybrid.ElementIncluded#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getElementIncluded()
 * @model
 * @generated
 */
public interface ElementIncluded extends EObject {
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
	 * @see mm_hybrid.MM_HybridPackage#getElementIncluded_TypeAttribute()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	TypeAtribute getTypeAttribute();

	/**
	 * Sets the value of the '{@link mm_hybrid.ElementIncluded#getTypeAttribute <em>Type Attribute</em>}' attribute.
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
	 * @see mm_hybrid.MM_HybridPackage#getElementIncluded_TypeElement()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	TypeElem getTypeElement();

	/**
	 * Sets the value of the '{@link mm_hybrid.ElementIncluded#getTypeElement <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Element</em>' attribute.
	 * @see mm_hybrid.TypeElem
	 * @see #getTypeElement()
	 * @generated
	 */
	void setTypeElement(TypeElem value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(RightPattern)
	 * @see mm_hybrid.MM_HybridPackage#getElementIncluded_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RightPattern getRight();

	/**
	 * Sets the value of the '{@link mm_hybrid.ElementIncluded#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(RightPattern value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(LeftPattern)
	 * @see mm_hybrid.MM_HybridPackage#getElementIncluded_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LeftPattern getLeft();

	/**
	 * Sets the value of the '{@link mm_hybrid.ElementIncluded#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(LeftPattern value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.TargetElementRule#getIncluded <em>Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' container reference.
	 * @see #setTarget(TargetElementRule)
	 * @see mm_hybrid.MM_HybridPackage#getElementIncluded_Target()
	 * @see mm_hybrid.TargetElementRule#getIncluded
	 * @model opposite="included" required="true" transient="false"
	 * @generated
	 */
	TargetElementRule getTarget();

	/**
	 * Sets the value of the '{@link mm_hybrid.ElementIncluded#getTarget <em>Target</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' container reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetElementRule value);

} // ElementIncluded
