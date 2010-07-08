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
 *   <li>{@link mm_hybrid.ElementIncluded#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link mm_hybrid.ElementIncluded#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link mm_hybrid.ElementIncluded#getTypeAttribute <em>Type Attribute</em>}</li>
 *   <li>{@link mm_hybrid.ElementIncluded#getTypeElement <em>Type Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getElementIncluded()
 * @model
 * @generated
 */
public interface ElementIncluded extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' containment reference list.
	 * The list contents are of type {@link mm_hybrid.SourceElementRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' containment reference list.
	 * @see mm_hybrid.MM_HybridPackage#getElementIncluded_SourceElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceElementRule> getSourceElement();

	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' containment reference list.
	 * The list contents are of type {@link mm_hybrid.TargetElementRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' containment reference list.
	 * @see mm_hybrid.MM_HybridPackage#getElementIncluded_TargetElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TargetElementRule> getTargetElement();

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

} // ElementIncluded
