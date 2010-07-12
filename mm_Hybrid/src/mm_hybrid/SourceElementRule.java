/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Element Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm_hybrid.SourceElementRule#getCondition <em>Condition</em>}</li>
 *   <li>{@link mm_hybrid.SourceElementRule#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getSourceElementRule()
 * @model annotation="gmf.node label='name_element' label.icon='false' border.color='31,73,125' color='218,238,243'"
 * @generated
 */
public interface SourceElementRule extends Element {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see mm_hybrid.MM_HybridPackage#getSourceElementRule_Condition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link mm_hybrid.SourceElementRule#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.InMetaModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(InMetaModel)
	 * @see mm_hybrid.MM_HybridPackage#getSourceElementRule_Metamodel()
	 * @see mm_hybrid.InMetaModel#getElements
	 * @model opposite="elements" required="true"
	 * @generated
	 */
	InMetaModel getMetamodel();

	/**
	 * Sets the value of the '{@link mm_hybrid.SourceElementRule#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(InMetaModel value);

} // SourceElementRule
