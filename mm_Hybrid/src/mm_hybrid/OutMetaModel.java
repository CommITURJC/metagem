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
 * A representation of the model object '<em><b>Out Meta Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm_hybrid.OutMetaModel#getName_mm <em>Name mm</em>}</li>
 *   <li>{@link mm_hybrid.OutMetaModel#getType_mm <em>Type mm</em>}</li>
 *   <li>{@link mm_hybrid.OutMetaModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getOutMetaModel()
 * @model annotation="gmf.node label='name_mm' label.icon='false' border.color='210,0,0' color='255,147,147'"
 * @generated
 */
public interface OutMetaModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name mm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name mm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name mm</em>' attribute.
	 * @see #setName_mm(String)
	 * @see mm_hybrid.MM_HybridPackage#getOutMetaModel_Name_mm()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName_mm();

	/**
	 * Sets the value of the '{@link mm_hybrid.OutMetaModel#getName_mm <em>Name mm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name mm</em>' attribute.
	 * @see #getName_mm()
	 * @generated
	 */
	void setName_mm(String value);

	/**
	 * Returns the value of the '<em><b>Type mm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type mm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type mm</em>' attribute.
	 * @see #setType_mm(String)
	 * @see mm_hybrid.MM_HybridPackage#getOutMetaModel_Type_mm()
	 * @model required="true"
	 * @generated
	 */
	String getType_mm();

	/**
	 * Sets the value of the '{@link mm_hybrid.OutMetaModel#getType_mm <em>Type mm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type mm</em>' attribute.
	 * @see #getType_mm()
	 * @generated
	 */
	void setType_mm(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link mm_hybrid.TargetElementRule}.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.TargetElementRule#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see mm_hybrid.MM_HybridPackage#getOutMetaModel_Elements()
	 * @see mm_hybrid.TargetElementRule#getMetamodel
	 * @model opposite="metamodel"
	 * @generated
	 */
	EList<TargetElementRule> getElements();

} // OutMetaModel
