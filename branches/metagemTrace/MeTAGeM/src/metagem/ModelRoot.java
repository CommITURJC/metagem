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
 * A representation of the model object '<em><b>Model Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metagem.ModelRoot#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link metagem.ModelRoot#getTargetModels <em>Target Models</em>}</li>
 *   <li>{@link metagem.ModelRoot#getRelations <em>Relations</em>}</li>
 *   <li>{@link metagem.ModelRoot#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see metagem.MetagemPackage#getModelRoot()
 * @model
 * @generated
 */
public interface ModelRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metagem.MetagemPackage#getModelRoot_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metagem.ModelRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Models</b></em>' containment reference list.
	 * The list contents are of type {@link metagem.SourceModelTransf}.
	 * It is bidirectional and its opposite is '{@link metagem.SourceModelTransf#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Models</em>' containment reference list.
	 * @see metagem.MetagemPackage#getModelRoot_SourceModels()
	 * @see metagem.SourceModelTransf#getOwnedElement
	 * @model opposite="ownedElement" containment="true" required="true"
	 * @generated
	 */
	EList<SourceModelTransf> getSourceModels();

	/**
	 * Returns the value of the '<em><b>Target Models</b></em>' containment reference list.
	 * The list contents are of type {@link metagem.TargetModelTransf}.
	 * It is bidirectional and its opposite is '{@link metagem.TargetModelTransf#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Models</em>' containment reference list.
	 * @see metagem.MetagemPackage#getModelRoot_TargetModels()
	 * @see metagem.TargetModelTransf#getOwnedElement
	 * @model opposite="ownedElement" containment="true" required="true"
	 * @generated
	 */
	EList<TargetModelTransf> getTargetModels();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link metagem.Relations}.
	 * It is bidirectional and its opposite is '{@link metagem.Relations#getOwnedModel <em>Owned Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see metagem.MetagemPackage#getModelRoot_Relations()
	 * @see metagem.Relations#getOwnedModel
	 * @model opposite="ownedModel" containment="true" required="true"
	 * @generated
	 */
	EList<Relations> getRelations();

} // ModelRoot
