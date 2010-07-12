/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Element Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm_hybrid.TargetElementRule#getIncluded <em>Included</em>}</li>
 *   <li>{@link mm_hybrid.TargetElementRule#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getTargetElementRule()
 * @model annotation="gmf.node label='name_element' label.icon='false' border.color='51,153,102' color='204,255,204'"
 * @generated
 */
public interface TargetElementRule extends Element {

	/**
	 * Returns the value of the '<em><b>Included</b></em>' containment reference list.
	 * The list contents are of type {@link mm_hybrid.ElementIncluded}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included</em>' containment reference list.
	 * @see mm_hybrid.MM_HybridPackage#getTargetElementRule_Included()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementIncluded> getIncluded();

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.OutMetaModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(OutMetaModel)
	 * @see mm_hybrid.MM_HybridPackage#getTargetElementRule_Metamodel()
	 * @see mm_hybrid.OutMetaModel#getElements
	 * @model opposite="elements" required="true"
	 * @generated
	 */
	OutMetaModel getMetamodel();

	/**
	 * Sets the value of the '{@link mm_hybrid.TargetElementRule#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(OutMetaModel value);
} // TargetElementRule
