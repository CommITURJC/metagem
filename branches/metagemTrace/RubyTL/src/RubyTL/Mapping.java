/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RubyTL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RubyTL.Mapping#getBindings <em>Bindings</em>}</li>
 *   <li>{@link RubyTL.Mapping#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see RubyTL.RubyTLPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link RubyTL.Binding}.
	 * It is bidirectional and its opposite is '{@link RubyTL.Binding#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see RubyTL.RubyTLPackage#getMapping_Bindings()
	 * @see RubyTL.Binding#getMapping
	 * @model opposite="mapping" containment="true"
	 * @generated
	 */
	EList<Binding> getBindings();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link RubyTL.Rule#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(Rule)
	 * @see RubyTL.RubyTLPackage#getMapping_Rule()
	 * @see RubyTL.Rule#getMapping
	 * @model opposite="mapping" required="true" transient="false"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link RubyTL.Mapping#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

} // Mapping
