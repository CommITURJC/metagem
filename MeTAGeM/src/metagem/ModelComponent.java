/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metagem.ModelComponent#getRelationElement <em>Relation Element</em>}</li>
 *   <li>{@link metagem.ModelComponent#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see metagem.MetagemPackage#getModelComponent()
 * @model abstract="true"
 * @generated
 */
public interface ModelComponent extends TransformationElement {
	/**
	 * Returns the value of the '<em><b>Relation Element</b></em>' reference list.
	 * The list contents are of type {@link metagem.RelationElement}.
	 * It is bidirectional and its opposite is '{@link metagem.RelationElement#getModelComponent <em>Model Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Element</em>' reference list.
	 * @see metagem.MetagemPackage#getModelComponent_RelationElement()
	 * @see metagem.RelationElement#getModelComponent
	 * @model opposite="modelComponent"
	 * @generated
	 */
	EList<RelationElement> getRelationElement();

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
	 * @see metagem.MetagemPackage#getModelComponent_Ref()
	 * @model
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link metagem.ModelComponent#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

} // ModelComponent
