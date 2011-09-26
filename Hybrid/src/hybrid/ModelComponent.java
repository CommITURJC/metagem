/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.ModelComponent#getRef <em>Ref</em>}</li>
 *   <li>{@link hybrid.ModelComponent#getRuleElement <em>Rule Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getModelComponent()
 * @model abstract="true"
 * @generated
 */
public interface ModelComponent extends HybridElement {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see hybrid.HybridPackage#getModelComponent_Ref()
	 * @model
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link hybrid.ModelComponent#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Rule Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hybrid.RuleElement#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Element</em>' reference.
	 * @see #setRuleElement(RuleElement)
	 * @see hybrid.HybridPackage#getModelComponent_RuleElement()
	 * @see hybrid.RuleElement#getComponent
	 * @model opposite="component"
	 * @generated
	 */
	RuleElement getRuleElement();

	/**
	 * Sets the value of the '{@link hybrid.ModelComponent#getRuleElement <em>Rule Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Element</em>' reference.
	 * @see #getRuleElement()
	 * @generated
	 */
	void setRuleElement(RuleElement value);

} // ModelComponent
