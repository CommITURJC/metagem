/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ETL.EolBlock#getPostModule <em>Post Module</em>}</li>
 *   <li>{@link ETL.EolBlock#getPreModule <em>Pre Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see ETL.ETLPackage#getEolBlock()
 * @model
 * @generated
 */
public interface EolBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Post Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ETL.EtlModule#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Module</em>' container reference.
	 * @see #setPostModule(EtlModule)
	 * @see ETL.ETLPackage#getEolBlock_PostModule()
	 * @see ETL.EtlModule#getPost
	 * @model opposite="post" transient="false"
	 * @generated
	 */
	EtlModule getPostModule();

	/**
	 * Sets the value of the '{@link ETL.EolBlock#getPostModule <em>Post Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Module</em>' container reference.
	 * @see #getPostModule()
	 * @generated
	 */
	void setPostModule(EtlModule value);

	/**
	 * Returns the value of the '<em><b>Pre Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ETL.EtlModule#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Module</em>' container reference.
	 * @see #setPreModule(EtlModule)
	 * @see ETL.ETLPackage#getEolBlock_PreModule()
	 * @see ETL.EtlModule#getPre
	 * @model opposite="pre" transient="false"
	 * @generated
	 */
	EtlModule getPreModule();

	/**
	 * Sets the value of the '{@link ETL.EolBlock#getPreModule <em>Pre Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Module</em>' container reference.
	 * @see #getPreModule()
	 * @generated
	 */
	void setPreModule(EtlModule value);

} // EolBlock
