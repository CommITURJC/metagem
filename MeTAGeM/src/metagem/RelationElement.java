/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metagem.RelationElement#getModelComponent <em>Model Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see metagem.MetagemPackage#getRelationElement()
 * @model abstract="true"
 * @generated
 */
public interface RelationElement extends TransformationElement {
	/**
	 * Returns the value of the '<em><b>Model Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metagem.ModelComponent#getRelationElement <em>Relation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Component</em>' reference.
	 * @see #setModelComponent(ModelComponent)
	 * @see metagem.MetagemPackage#getRelationElement_ModelComponent()
	 * @see metagem.ModelComponent#getRelationElement
	 * @model opposite="relationElement" required="true"
	 * @generated
	 */
	ModelComponent getModelComponent();

	/**
	 * Sets the value of the '{@link metagem.RelationElement#getModelComponent <em>Model Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Component</em>' reference.
	 * @see #getModelComponent()
	 * @generated
	 */
	void setModelComponent(ModelComponent value);

} // RelationElement
