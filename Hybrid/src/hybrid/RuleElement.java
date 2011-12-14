/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.RuleElement#getRef <em>Ref</em>}</li>
 *   <li>{@link hybrid.RuleElement#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link hybrid.RuleElement#getOwns <em>Owns</em>}</li>
 *   <li>{@link hybrid.RuleElement#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getRuleElement()
 * @model abstract="true"
 * @generated
 */
public interface RuleElement extends HybridElement {
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
	 * @see hybrid.HybridPackage#getRuleElement_Ref()
	 * @model
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link hybrid.RuleElement#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hybrid.RuleElement#getOwns <em>Owns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' reference.
	 * @see #setBelongsTo(RuleElement)
	 * @see hybrid.HybridPackage#getRuleElement_BelongsTo()
	 * @see hybrid.RuleElement#getOwns
	 * @model opposite="owns"
	 * @generated
	 */
	RuleElement getBelongsTo();

	/**
	 * Sets the value of the '{@link hybrid.RuleElement#getBelongsTo <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(RuleElement value);

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' reference list.
	 * The list contents are of type {@link hybrid.RuleElement}.
	 * It is bidirectional and its opposite is '{@link hybrid.RuleElement#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' reference list.
	 * @see hybrid.HybridPackage#getRuleElement_Owns()
	 * @see hybrid.RuleElement#getBelongsTo
	 * @model opposite="belongsTo"
	 * @generated
	 */
	EList<RuleElement> getOwns();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see hybrid.HybridPackage#getRuleElement_Model()
	 * @model required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link hybrid.RuleElement#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // RuleElement
