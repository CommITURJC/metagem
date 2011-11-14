/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Etl Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ETL.EtlModule#getPre <em>Pre</em>}</li>
 *   <li>{@link ETL.EtlModule#getPost <em>Post</em>}</li>
 *   <li>{@link ETL.EtlModule#getRules <em>Rules</em>}</li>
 *   <li>{@link ETL.EtlModule#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ETL.ETLPackage#getEtlModule()
 * @model
 * @generated
 */
public interface EtlModule extends EtlElement {
	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ETL.EolBlock#getPreModule <em>Pre Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference.
	 * @see #setPre(EolBlock)
	 * @see ETL.ETLPackage#getEtlModule_Pre()
	 * @see ETL.EolBlock#getPreModule
	 * @model opposite="preModule" containment="true"
	 * @generated
	 */
	EolBlock getPre();

	/**
	 * Sets the value of the '{@link ETL.EtlModule#getPre <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' containment reference.
	 * @see #getPre()
	 * @generated
	 */
	void setPre(EolBlock value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ETL.EolBlock#getPostModule <em>Post Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(EolBlock)
	 * @see ETL.ETLPackage#getEtlModule_Post()
	 * @see ETL.EolBlock#getPostModule
	 * @model opposite="postModule" containment="true"
	 * @generated
	 */
	EolBlock getPost();

	/**
	 * Sets the value of the '{@link ETL.EtlModule#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(EolBlock value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ETL.TransformationRule}.
	 * It is bidirectional and its opposite is '{@link ETL.TransformationRule#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see ETL.ETLPackage#getEtlModule_Rules()
	 * @see ETL.TransformationRule#getModule
	 * @model opposite="module" containment="true" required="true"
	 * @generated
	 */
	EList<TransformationRule> getRules();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link ETL.Operation}.
	 * It is bidirectional and its opposite is '{@link ETL.Operation#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see ETL.ETLPackage#getEtlModule_Operations()
	 * @see ETL.Operation#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // EtlModule
