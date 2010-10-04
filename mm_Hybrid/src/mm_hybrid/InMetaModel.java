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
 * A representation of the model object '<em><b>In Meta Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm_hybrid.InMetaModel#getName_mm <em>Name mm</em>}</li>
 *   <li>{@link mm_hybrid.InMetaModel#getType_mm <em>Type mm</em>}</li>
 *   <li>{@link mm_hybrid.InMetaModel#getElements <em>Elements</em>}</li>
 *   <li>{@link mm_hybrid.InMetaModel#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getInMetaModel()
 * @model annotation="gmf.node label='name_mm' label.icon='false' border.color='0,0,128' color='198,198,236'"
 * @generated
 */
public interface InMetaModel extends EObject {
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
	 * @see mm_hybrid.MM_HybridPackage#getInMetaModel_Name_mm()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName_mm();

	/**
	 * Sets the value of the '{@link mm_hybrid.InMetaModel#getName_mm <em>Name mm</em>}' attribute.
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
	 * @see mm_hybrid.MM_HybridPackage#getInMetaModel_Type_mm()
	 * @model required="true"
	 * @generated
	 */
	String getType_mm();

	/**
	 * Sets the value of the '{@link mm_hybrid.InMetaModel#getType_mm <em>Type mm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type mm</em>' attribute.
	 * @see #getType_mm()
	 * @generated
	 */
	void setType_mm(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link mm_hybrid.SourceElementRule}.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.SourceElementRule#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see mm_hybrid.MM_HybridPackage#getInMetaModel_Elements()
	 * @see mm_hybrid.SourceElementRule#getMetamodel
	 * @model opposite="metamodel"
	 * @generated
	 */
	EList<SourceElementRule> getElements();

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.Module#getInMM <em>In MM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(Module)
	 * @see mm_hybrid.MM_HybridPackage#getInMetaModel_Module()
	 * @see mm_hybrid.Module#getInMM
	 * @model opposite="inMM" required="true" transient="false"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link mm_hybrid.InMetaModel#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

} // InMetaModel
