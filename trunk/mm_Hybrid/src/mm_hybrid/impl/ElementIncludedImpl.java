/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import java.util.Collection;

import mm_hybrid.Element;
import mm_hybrid.ElementIncluded;
import mm_hybrid.MM_HybridPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Included</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.ElementIncludedImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link mm_hybrid.impl.ElementIncludedImpl#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementIncludedImpl extends EObjectImpl implements ElementIncluded {
	/**
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> sourceElement;

	/**
	 * The cached value of the '{@link #getTargetElement() <em>Target Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> targetElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementIncludedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_HybridPackage.Literals.ELEMENT_INCLUDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSourceElement() {
		if (sourceElement == null) {
			sourceElement = new EObjectContainmentEList<Element>(Element.class,
					this, MM_HybridPackage.ELEMENT_INCLUDED__SOURCE_ELEMENT);
		}
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTargetElement() {
		if (targetElement == null) {
			targetElement = new EObjectContainmentEList<Element>(Element.class,
					this, MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT);
		}
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MM_HybridPackage.ELEMENT_INCLUDED__SOURCE_ELEMENT:
			return ((InternalEList<?>) getSourceElement()).basicRemove(
					otherEnd, msgs);
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			return ((InternalEList<?>) getTargetElement()).basicRemove(
					otherEnd, msgs);
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
		case MM_HybridPackage.ELEMENT_INCLUDED__SOURCE_ELEMENT:
			return getSourceElement();
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			return getTargetElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MM_HybridPackage.ELEMENT_INCLUDED__SOURCE_ELEMENT:
			getSourceElement().clear();
			getSourceElement().addAll((Collection<? extends Element>) newValue);
			return;
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			getTargetElement().clear();
			getTargetElement().addAll((Collection<? extends Element>) newValue);
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
		case MM_HybridPackage.ELEMENT_INCLUDED__SOURCE_ELEMENT:
			getSourceElement().clear();
			return;
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			getTargetElement().clear();
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
		case MM_HybridPackage.ELEMENT_INCLUDED__SOURCE_ELEMENT:
			return sourceElement != null && !sourceElement.isEmpty();
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			return targetElement != null && !targetElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementIncludedImpl
