/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability.impl;

import Traceability.ModelElement;
import Traceability.SourceElement;
import Traceability.TargetElement;
import Traceability.TraceabilityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Traceability.impl.ModelElementImpl#getSourceElementLink <em>Source Element Link</em>}</li>
 *   <li>{@link Traceability.impl.ModelElementImpl#getTargetElementLink <em>Target Element Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelElementImpl extends TraceElementImpl implements ModelElement {
	/**
	 * The cached value of the '{@link #getSourceElementLink() <em>Source Element Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElementLink()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceElement> sourceElementLink;

	/**
	 * The cached value of the '{@link #getTargetElementLink() <em>Target Element Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElementLink()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetElement> targetElementLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceElement> getSourceElementLink() {
		if (sourceElementLink == null) {
			sourceElementLink = new EObjectWithInverseResolvingEList<SourceElement>(SourceElement.class, this, TraceabilityPackage.MODEL_ELEMENT__SOURCE_ELEMENT_LINK, TraceabilityPackage.SOURCE_ELEMENT__ELEMENT_MODEL);
		}
		return sourceElementLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetElement> getTargetElementLink() {
		if (targetElementLink == null) {
			targetElementLink = new EObjectWithInverseResolvingEList<TargetElement>(TargetElement.class, this, TraceabilityPackage.MODEL_ELEMENT__TARGET_ELEMENT_LINK, TraceabilityPackage.TARGET_ELEMENT__ELEMENT_MODEL);
		}
		return targetElementLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityPackage.MODEL_ELEMENT__SOURCE_ELEMENT_LINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceElementLink()).basicAdd(otherEnd, msgs);
			case TraceabilityPackage.MODEL_ELEMENT__TARGET_ELEMENT_LINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetElementLink()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityPackage.MODEL_ELEMENT__SOURCE_ELEMENT_LINK:
				return ((InternalEList<?>)getSourceElementLink()).basicRemove(otherEnd, msgs);
			case TraceabilityPackage.MODEL_ELEMENT__TARGET_ELEMENT_LINK:
				return ((InternalEList<?>)getTargetElementLink()).basicRemove(otherEnd, msgs);
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
			case TraceabilityPackage.MODEL_ELEMENT__SOURCE_ELEMENT_LINK:
				return getSourceElementLink();
			case TraceabilityPackage.MODEL_ELEMENT__TARGET_ELEMENT_LINK:
				return getTargetElementLink();
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
			case TraceabilityPackage.MODEL_ELEMENT__SOURCE_ELEMENT_LINK:
				getSourceElementLink().clear();
				getSourceElementLink().addAll((Collection<? extends SourceElement>)newValue);
				return;
			case TraceabilityPackage.MODEL_ELEMENT__TARGET_ELEMENT_LINK:
				getTargetElementLink().clear();
				getTargetElementLink().addAll((Collection<? extends TargetElement>)newValue);
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
			case TraceabilityPackage.MODEL_ELEMENT__SOURCE_ELEMENT_LINK:
				getSourceElementLink().clear();
				return;
			case TraceabilityPackage.MODEL_ELEMENT__TARGET_ELEMENT_LINK:
				getTargetElementLink().clear();
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
			case TraceabilityPackage.MODEL_ELEMENT__SOURCE_ELEMENT_LINK:
				return sourceElementLink != null && !sourceElementLink.isEmpty();
			case TraceabilityPackage.MODEL_ELEMENT__TARGET_ELEMENT_LINK:
				return targetElementLink != null && !targetElementLink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelElementImpl
