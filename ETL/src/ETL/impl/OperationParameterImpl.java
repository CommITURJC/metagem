/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL.impl;

import ETL.ETLPackage;
import ETL.Element;
import ETL.OperationParameter;
import ETL.SimpleStatement;
import ETL.Statement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ETL.impl.OperationParameterImpl#getElementRef <em>Element Ref</em>}</li>
 *   <li>{@link ETL.impl.OperationParameterImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link ETL.impl.OperationParameterImpl#getElementChild <em>Element Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationParameterImpl extends EtlElementImpl implements OperationParameter {
	/**
	 * The cached value of the '{@link #getElementRef() <em>Element Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementRef()
	 * @generated
	 * @ordered
	 */
	protected Element elementRef;

	/**
	 * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected String property = PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementChild() <em>Element Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementChild()
	 * @generated
	 * @ordered
	 */
	protected Element elementChild;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ETLPackage.Literals.OPERATION_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElementRef() {
		if (elementRef != null && elementRef.eIsProxy()) {
			InternalEObject oldElementRef = (InternalEObject)elementRef;
			elementRef = (Element)eResolveProxy(oldElementRef);
			if (elementRef != oldElementRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ETLPackage.OPERATION_PARAMETER__ELEMENT_REF, oldElementRef, elementRef));
			}
		}
		return elementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetElementRef() {
		return elementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementRef(Element newElementRef) {
		Element oldElementRef = elementRef;
		elementRef = newElementRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.OPERATION_PARAMETER__ELEMENT_REF, oldElementRef, elementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(String newProperty) {
		String oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.OPERATION_PARAMETER__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElementChild() {
		return elementChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementChild(Element newElementChild, NotificationChain msgs) {
		Element oldElementChild = elementChild;
		elementChild = newElementChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETLPackage.OPERATION_PARAMETER__ELEMENT_CHILD, oldElementChild, newElementChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementChild(Element newElementChild) {
		if (newElementChild != elementChild) {
			NotificationChain msgs = null;
			if (elementChild != null)
				msgs = ((InternalEObject)elementChild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETLPackage.OPERATION_PARAMETER__ELEMENT_CHILD, null, msgs);
			if (newElementChild != null)
				msgs = ((InternalEObject)newElementChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETLPackage.OPERATION_PARAMETER__ELEMENT_CHILD, null, msgs);
			msgs = basicSetElementChild(newElementChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.OPERATION_PARAMETER__ELEMENT_CHILD, newElementChild, newElementChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ETLPackage.OPERATION_PARAMETER__ELEMENT_CHILD:
				return basicSetElementChild(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ETLPackage.OPERATION_PARAMETER__ELEMENT_REF:
				if (resolve) return getElementRef();
				return basicGetElementRef();
			case ETLPackage.OPERATION_PARAMETER__PROPERTY:
				return getProperty();
			case ETLPackage.OPERATION_PARAMETER__ELEMENT_CHILD:
				return getElementChild();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ETLPackage.OPERATION_PARAMETER__ELEMENT_REF:
				setElementRef((Element)newValue);
				return;
			case ETLPackage.OPERATION_PARAMETER__PROPERTY:
				setProperty((String)newValue);
				return;
			case ETLPackage.OPERATION_PARAMETER__ELEMENT_CHILD:
				setElementChild((Element)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ETLPackage.OPERATION_PARAMETER__ELEMENT_REF:
				setElementRef((Element)null);
				return;
			case ETLPackage.OPERATION_PARAMETER__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
				return;
			case ETLPackage.OPERATION_PARAMETER__ELEMENT_CHILD:
				setElementChild((Element)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ETLPackage.OPERATION_PARAMETER__ELEMENT_REF:
				return elementRef != null;
			case ETLPackage.OPERATION_PARAMETER__PROPERTY:
				return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
			case ETLPackage.OPERATION_PARAMETER__ELEMENT_CHILD:
				return elementChild != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Statement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SimpleStatement.class) {
			switch (derivedFeatureID) {
				case ETLPackage.OPERATION_PARAMETER__ELEMENT_REF: return ETLPackage.SIMPLE_STATEMENT__ELEMENT_REF;
				case ETLPackage.OPERATION_PARAMETER__PROPERTY: return ETLPackage.SIMPLE_STATEMENT__PROPERTY;
				case ETLPackage.OPERATION_PARAMETER__ELEMENT_CHILD: return ETLPackage.SIMPLE_STATEMENT__ELEMENT_CHILD;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Statement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SimpleStatement.class) {
			switch (baseFeatureID) {
				case ETLPackage.SIMPLE_STATEMENT__ELEMENT_REF: return ETLPackage.OPERATION_PARAMETER__ELEMENT_REF;
				case ETLPackage.SIMPLE_STATEMENT__PROPERTY: return ETLPackage.OPERATION_PARAMETER__PROPERTY;
				case ETLPackage.SIMPLE_STATEMENT__ELEMENT_CHILD: return ETLPackage.OPERATION_PARAMETER__ELEMENT_CHILD;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (property: ");
		result.append(property);
		result.append(')');
		return result.toString();
	}

} //OperationParameterImpl
