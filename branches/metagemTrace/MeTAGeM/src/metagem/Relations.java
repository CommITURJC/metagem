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
 * A representation of the model object '<em><b>Relations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metagem.Relations#getOwnedModel <em>Owned Model</em>}</li>
 *   <li>{@link metagem.Relations#getTypeRelation <em>Type Relation</em>}</li>
 *   <li>{@link metagem.Relations#getTypeElement <em>Type Element</em>}</li>
 *   <li>{@link metagem.Relations#getRole <em>Role</em>}</li>
 *   <li>{@link metagem.Relations#getExtends <em>Extends</em>}</li>
 *   <li>{@link metagem.Relations#getIsExtended <em>Is Extended</em>}</li>
 * </ul>
 * </p>
 *
 * @see metagem.MetagemPackage#getRelations()
 * @model abstract="true"
 * @generated
 */
public interface Relations extends TransformationElement {
	/**
	 * Returns the value of the '<em><b>Owned Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metagem.ModelRoot#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Model</em>' container reference.
	 * @see #setOwnedModel(ModelRoot)
	 * @see metagem.MetagemPackage#getRelations_OwnedModel()
	 * @see metagem.ModelRoot#getRelations
	 * @model opposite="relations" transient="false"
	 * @generated
	 */
	ModelRoot getOwnedModel();

	/**
	 * Sets the value of the '{@link metagem.Relations#getOwnedModel <em>Owned Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Model</em>' container reference.
	 * @see #getOwnedModel()
	 * @generated
	 */
	void setOwnedModel(ModelRoot value);

	/**
	 * Returns the value of the '<em><b>Type Relation</b></em>' attribute.
	 * The literals are from the enumeration {@link metagem.TRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Relation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Relation</em>' attribute.
	 * @see metagem.TRelation
	 * @see #setTypeRelation(TRelation)
	 * @see metagem.MetagemPackage#getRelations_TypeRelation()
	 * @model
	 * @generated
	 */
	TRelation getTypeRelation();

	/**
	 * Sets the value of the '{@link metagem.Relations#getTypeRelation <em>Type Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Relation</em>' attribute.
	 * @see metagem.TRelation
	 * @see #getTypeRelation()
	 * @generated
	 */
	void setTypeRelation(TRelation value);

	/**
	 * Returns the value of the '<em><b>Type Element</b></em>' attribute.
	 * The literals are from the enumeration {@link metagem.TElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Element</em>' attribute.
	 * @see metagem.TElement
	 * @see #setTypeElement(TElement)
	 * @see metagem.MetagemPackage#getRelations_TypeElement()
	 * @model
	 * @generated
	 */
	TElement getTypeElement();

	/**
	 * Sets the value of the '{@link metagem.Relations#getTypeElement <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Element</em>' attribute.
	 * @see metagem.TElement
	 * @see #getTypeElement()
	 * @generated
	 */
	void setTypeElement(TElement value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link metagem.TRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see metagem.TRole
	 * @see #setRole(TRole)
	 * @see metagem.MetagemPackage#getRelations_Role()
	 * @model
	 * @generated
	 */
	TRole getRole();

	/**
	 * Sets the value of the '{@link metagem.Relations#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see metagem.TRole
	 * @see #getRole()
	 * @generated
	 */
	void setRole(TRole value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metagem.Relations#getIsExtended <em>Is Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(Relations)
	 * @see metagem.MetagemPackage#getRelations_Extends()
	 * @see metagem.Relations#getIsExtended
	 * @model opposite="isExtended"
	 * @generated
	 */
	Relations getExtends();

	/**
	 * Sets the value of the '{@link metagem.Relations#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Relations value);

	/**
	 * Returns the value of the '<em><b>Is Extended</b></em>' reference list.
	 * The list contents are of type {@link metagem.Relations}.
	 * It is bidirectional and its opposite is '{@link metagem.Relations#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Extended</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Extended</em>' reference list.
	 * @see metagem.MetagemPackage#getRelations_IsExtended()
	 * @see metagem.Relations#getExtends
	 * @model opposite="extends"
	 * @generated
	 */
	EList<Relations> getIsExtended();

} // Relations
