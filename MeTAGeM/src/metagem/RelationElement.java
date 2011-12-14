/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metagem.RelationElement#getRef <em>Ref</em>}</li>
 *   <li>{@link metagem.RelationElement#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link metagem.RelationElement#getOwns <em>Owns</em>}</li>
 *   <li>{@link metagem.RelationElement#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see metagem.MetagemPackage#getRelationElement()
 * @model abstract="true"
 * @generated
 */
public interface RelationElement extends TransformationElement {
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
	 * @see metagem.MetagemPackage#getRelationElement_Ref()
	 * @model
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link metagem.RelationElement#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metagem.RelationElement#getOwns <em>Owns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' reference.
	 * @see #setBelongsTo(RelationElement)
	 * @see metagem.MetagemPackage#getRelationElement_BelongsTo()
	 * @see metagem.RelationElement#getOwns
	 * @model opposite="owns"
	 * @generated
	 */
	RelationElement getBelongsTo();

	/**
	 * Sets the value of the '{@link metagem.RelationElement#getBelongsTo <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(RelationElement value);

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' reference list.
	 * The list contents are of type {@link metagem.RelationElement}.
	 * It is bidirectional and its opposite is '{@link metagem.RelationElement#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' reference list.
	 * @see metagem.MetagemPackage#getRelationElement_Owns()
	 * @see metagem.RelationElement#getBelongsTo
	 * @model opposite="belongsTo"
	 * @generated
	 */
	EList<RelationElement> getOwns();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(ModelTransf)
	 * @see metagem.MetagemPackage#getRelationElement_Model()
	 * @model required="true"
	 * @generated
	 */
	ModelTransf getModel();

	/**
	 * Sets the value of the '{@link metagem.RelationElement#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ModelTransf value);

} // RelationElement
