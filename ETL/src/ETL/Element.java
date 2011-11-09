/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ETL.Element#getClassName <em>Class Name</em>}</li>
 *   <li>{@link ETL.Element#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link ETL.Element#getSource_rule <em>Source rule</em>}</li>
 *   <li>{@link ETL.Element#getTargets_rule <em>Targets rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see ETL.ETLPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EtlElement {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see ETL.ETLPackage#getElement_ClassName()
	 * @model required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link ETL.Element#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' attribute.
	 * @see #setMetamodel(String)
	 * @see ETL.ETLPackage#getElement_Metamodel()
	 * @model required="true"
	 * @generated
	 */
	String getMetamodel();

	/**
	 * Sets the value of the '{@link ETL.Element#getMetamodel <em>Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' attribute.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(String value);

	/**
	 * Returns the value of the '<em><b>Source rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ETL.TransformationRule#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source rule</em>' container reference.
	 * @see #setSource_rule(TransformationRule)
	 * @see ETL.ETLPackage#getElement_Source_rule()
	 * @see ETL.TransformationRule#getSource
	 * @model opposite="source" transient="false"
	 * @generated
	 */
	TransformationRule getSource_rule();

	/**
	 * Sets the value of the '{@link ETL.Element#getSource_rule <em>Source rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source rule</em>' container reference.
	 * @see #getSource_rule()
	 * @generated
	 */
	void setSource_rule(TransformationRule value);

	/**
	 * Returns the value of the '<em><b>Targets rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ETL.TransformationRule#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets rule</em>' container reference.
	 * @see #setTargets_rule(TransformationRule)
	 * @see ETL.ETLPackage#getElement_Targets_rule()
	 * @see ETL.TransformationRule#getTargets
	 * @model opposite="targets" transient="false"
	 * @generated
	 */
	TransformationRule getTargets_rule();

	/**
	 * Sets the value of the '{@link ETL.Element#getTargets_rule <em>Targets rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targets rule</em>' container reference.
	 * @see #getTargets_rule()
	 * @generated
	 */
	void setTargets_rule(TransformationRule value);

} // Element
