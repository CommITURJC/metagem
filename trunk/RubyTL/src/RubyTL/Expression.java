/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RubyTL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RubyTL.Expression#getExpGet <em>Exp Get</em>}</li>
 * </ul>
 * </p>
 *
 * @see RubyTL.RubyTLPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends EObject {

	/**
	 * Returns the value of the '<em><b>Exp Get</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link RubyTL.ExpGet#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp Get</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp Get</em>' container reference.
	 * @see #setExpGet(ExpGet)
	 * @see RubyTL.RubyTLPackage#getExpression_ExpGet()
	 * @see RubyTL.ExpGet#getSource
	 * @model opposite="source" required="true" transient="false"
	 * @generated
	 */
	ExpGet getExpGet();

	/**
	 * Sets the value of the '{@link RubyTL.Expression#getExpGet <em>Exp Get</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp Get</em>' container reference.
	 * @see #getExpGet()
	 * @generated
	 */
	void setExpGet(ExpGet value);
} // Expression
