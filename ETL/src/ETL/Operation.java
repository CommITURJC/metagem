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
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ETL.Operation#getContext <em>Context</em>}</li>
 *   <li>{@link ETL.Operation#getReturn <em>Return</em>}</li>
 *   <li>{@link ETL.Operation#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ETL.Operation#getModule <em>Module</em>}</li>
 *   <li>{@link ETL.Operation#getPre <em>Pre</em>}</li>
 *   <li>{@link ETL.Operation#getPost <em>Post</em>}</li>
 *   <li>{@link ETL.Operation#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see ETL.ETLPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Block {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(SimpleStatement)
	 * @see ETL.ETLPackage#getOperation_Context()
	 * @model containment="true"
	 * @generated
	 */
	SimpleStatement getContext();

	/**
	 * Sets the value of the '{@link ETL.Operation#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(SimpleStatement value);

	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(SimpleStatement)
	 * @see ETL.ETLPackage#getOperation_Return()
	 * @model containment="true"
	 * @generated
	 */
	SimpleStatement getReturn();

	/**
	 * Sets the value of the '{@link ETL.Operation#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(SimpleStatement value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' attribute.
	 * @see #setAnnotation(String)
	 * @see ETL.ETLPackage#getOperation_Annotation()
	 * @model
	 * @generated
	 */
	String getAnnotation();

	/**
	 * Sets the value of the '{@link ETL.Operation#getAnnotation <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' attribute.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ETL.EtlModule#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(EtlModule)
	 * @see ETL.ETLPackage#getOperation_Module()
	 * @see ETL.EtlModule#getOperations
	 * @model opposite="operations" required="true" transient="false"
	 * @generated
	 */
	EtlModule getModule();

	/**
	 * Sets the value of the '{@link ETL.Operation#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(EtlModule value);

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ETL.EolBlock#getPreOperation <em>Pre Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference.
	 * @see #setPre(EolBlock)
	 * @see ETL.ETLPackage#getOperation_Pre()
	 * @see ETL.EolBlock#getPreOperation
	 * @model opposite="preOperation" containment="true"
	 * @generated
	 */
	EolBlock getPre();

	/**
	 * Sets the value of the '{@link ETL.Operation#getPre <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' containment reference.
	 * @see #getPre()
	 * @generated
	 */
	void setPre(EolBlock value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ETL.EolBlock#getPostOperation <em>Post Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(EolBlock)
	 * @see ETL.ETLPackage#getOperation_Post()
	 * @see ETL.EolBlock#getPostOperation
	 * @model opposite="postOperation" containment="true"
	 * @generated
	 */
	EolBlock getPost();

	/**
	 * Sets the value of the '{@link ETL.Operation#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(EolBlock value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ETL.OperationParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see ETL.ETLPackage#getOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationParameter> getParameters();

} // Operation
