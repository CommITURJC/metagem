/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ETL.Guard#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see ETL.ETLPackage#getGuard()
 * @model
 * @generated
 */
public interface Guard extends Block {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ETL.TransformationRule#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(TransformationRule)
	 * @see ETL.ETLPackage#getGuard_Rule()
	 * @see ETL.TransformationRule#getGuard
	 * @model opposite="guard" required="true" transient="false"
	 * @generated
	 */
	TransformationRule getRule();

	/**
	 * Sets the value of the '{@link ETL.Guard#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(TransformationRule value);

} // Guard
