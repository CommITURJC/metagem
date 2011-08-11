/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.Return#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link hybrid.Return#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getReturn()
 * @model
 * @generated
 */
public interface Return extends EObject {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' attribute.
	 * The literals are from the enumeration {@link hybrid.Datatype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' attribute.
	 * @see hybrid.Datatype
	 * @see #setDatatype(Datatype)
	 * @see hybrid.HybridPackage#getReturn_Datatype()
	 * @model
	 * @generated
	 */
	Datatype getDatatype();

	/**
	 * Sets the value of the '{@link hybrid.Return#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' attribute.
	 * @see hybrid.Datatype
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(Datatype value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(ModelComponent)
	 * @see hybrid.HybridPackage#getReturn_Component()
	 * @model
	 * @generated
	 */
	ModelComponent getComponent();

	/**
	 * Sets the value of the '{@link hybrid.Return#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ModelComponent value);

} // Return
