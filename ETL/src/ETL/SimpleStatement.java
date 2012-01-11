/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ETL.SimpleStatement#getElementRef <em>Element Ref</em>}</li>
 *   <li>{@link ETL.SimpleStatement#getProperty <em>Property</em>}</li>
 *   <li>{@link ETL.SimpleStatement#getElementChild <em>Element Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see ETL.ETLPackage#getSimpleStatement()
 * @model
 * @generated
 */
public interface SimpleStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Ref</em>' reference.
	 * @see #setElementRef(Element)
	 * @see ETL.ETLPackage#getSimpleStatement_ElementRef()
	 * @model
	 * @generated
	 */
	Element getElementRef();

	/**
	 * Sets the value of the '{@link ETL.SimpleStatement#getElementRef <em>Element Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Ref</em>' reference.
	 * @see #getElementRef()
	 * @generated
	 */
	void setElementRef(Element value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see ETL.ETLPackage#getSimpleStatement_Property()
	 * @model
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link ETL.SimpleStatement#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

	/**
	 * Returns the value of the '<em><b>Element Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Child</em>' containment reference.
	 * @see #setElementChild(Element)
	 * @see ETL.ETLPackage#getSimpleStatement_ElementChild()
	 * @model containment="true"
	 * @generated
	 */
	Element getElementChild();

	/**
	 * Sets the value of the '{@link ETL.SimpleStatement#getElementChild <em>Element Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Child</em>' containment reference.
	 * @see #getElementChild()
	 * @generated
	 */
	void setElementChild(Element value);

} // SimpleStatement
