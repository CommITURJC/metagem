/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.Model#getPath <em>Path</em>}</li>
 *   <li>{@link hybrid.Model#getType_mm <em>Type mm</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getModel()
 * @model abstract="true"
 * @generated
 */
public interface Model extends HybridElement {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see hybrid.HybridPackage#getModel_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link hybrid.Model#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Type mm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type mm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type mm</em>' attribute.
	 * @see #setType_mm(String)
	 * @see hybrid.HybridPackage#getModel_Type_mm()
	 * @model required="true"
	 * @generated
	 */
	String getType_mm();

	/**
	 * Sets the value of the '{@link hybrid.Model#getType_mm <em>Type mm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type mm</em>' attribute.
	 * @see #getType_mm()
	 * @generated
	 */
	void setType_mm(String value);

} // Model
