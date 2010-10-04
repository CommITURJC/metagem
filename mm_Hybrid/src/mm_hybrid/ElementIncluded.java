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
 *   <li>{@link mm_hybrid.ElementIncluded#getTargetElement <em>Target Element</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link mm_hybrid.RightPattern#getElementIncluded <em>Element Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(RightPattern)
	 * @see mm_hybrid.MM_HybridPackage#getElementIncluded_Right()
	 * @see mm_hybrid.RightPattern#getElementIncluded
	 * @model opposite="elementIncluded" containment="true" required="true"
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
	 * It is bidirectional and its opposite is '{@link mm_hybrid.LeftPattern#getElementIncluded <em>Element Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(LeftPattern)
	 * @see mm_hybrid.MM_HybridPackage#getElementIncluded_Left()
	 * @see mm_hybrid.LeftPattern#getElementIncluded
	 * @model opposite="elementIncluded" containment="true" required="true"
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
	 * Returns the value of the '<em><b>Target Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.TargetElementRule#getIncluded <em>Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' container reference.
	 * @see #setTargetElement(TargetElementRule)
	 * @see mm_hybrid.MM_HybridPackage#getElementIncluded_TargetElement()
	 * @see mm_hybrid.TargetElementRule#getIncluded
	 * @model opposite="included" required="true" transient="false"
	 * @generated
	 */
	TargetElementRule getTargetElement();

	/**
	 * Sets the value of the '{@link mm_hybrid.ElementIncluded#getTargetElement <em>Target Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' container reference.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(TargetElementRule value);

} // ElementIncluded
