/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RubyTL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RubyTL.FromElement#getClassname <em>Classname</em>}</li>
 *   <li>{@link RubyTL.FromElement#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see RubyTL.RubyTLPackage#getFromElement()
 * @model
 * @generated
 */
public interface FromElement extends Variable {
	/**
	 * Returns the value of the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classname</em>' attribute.
	 * @see #setClassname(String)
	 * @see RubyTL.RubyTLPackage#getFromElement_Classname()
	 * @model
	 * @generated
	 */
	String getClassname();

	/**
	 * Sets the value of the '{@link RubyTL.FromElement#getClassname <em>Classname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classname</em>' attribute.
	 * @see #getClassname()
	 * @generated
	 */
	void setClassname(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(Metamodel)
	 * @see RubyTL.RubyTLPackage#getFromElement_Metamodel()
	 * @model
	 * @generated
	 */
	Metamodel getMetamodel();

	/**
	 * Sets the value of the '{@link RubyTL.FromElement#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(Metamodel value);

} // FromElement
