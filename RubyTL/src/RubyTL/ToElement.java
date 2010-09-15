/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RubyTL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RubyTL.ToElement#getClassname <em>Classname</em>}</li>
 *   <li>{@link RubyTL.ToElement#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see RubyTL.RubyTLPackage#getToElement()
 * @model
 * @generated
 */
public interface ToElement extends Variable {
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
	 * @see RubyTL.RubyTLPackage#getToElement_Classname()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getClassname();

	/**
	 * Sets the value of the '{@link RubyTL.ToElement#getClassname <em>Classname</em>}' attribute.
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
	 * @see RubyTL.RubyTLPackage#getToElement_Metamodel()
	 * @model ordered="false"
	 * @generated
	 */
	Metamodel getMetamodel();

	/**
	 * Sets the value of the '{@link RubyTL.ToElement#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(Metamodel value);

} // ToElement
