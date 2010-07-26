/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import java.util.Collection;

import mm_hybrid.Element;
import mm_hybrid.MM_HybridPackage;
import mm_hybrid.Operation;
import mm_hybrid.RightPattern;
import mm_hybrid.Rule;
import mm_hybrid.SourceElementRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.RightPatternImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link mm_hybrid.impl.RightPatternImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link mm_hybrid.impl.RightPatternImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link mm_hybrid.impl.RightPatternImpl#getName_pattern <em>Name pattern</em>}</li>
 *   <li>{@link mm_hybrid.impl.RightPatternImpl#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RightPatternImpl extends EObjectImpl implements RightPattern {
	/**
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceElementRule> sourceElement;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rule;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operation;

	/**
	 * The default value of the '{@link #getName_pattern() <em>Name pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_pattern()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_pattern() <em>Name pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_pattern()
	 * @generated
	 * @ordered
	 */
	protected String name_pattern = NAME_PATTERN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Element reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_HybridPackage.Literals.RIGHT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceElementRule> getSourceElement() {
		if (sourceElement == null) {
			sourceElement = new EObjectContainmentWithInverseEList<SourceElementRule>(
					SourceElementRule.class, this,
					MM_HybridPackage.RIGHT_PATTERN__SOURCE_ELEMENT,
					MM_HybridPackage.SOURCE_ELEMENT_RULE__RIGHT_PATTERN);
		}
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRule() {
		if (rule == null) {
			rule = new EObjectWithInverseResolvingEList.ManyInverse<Rule>(
					Rule.class, this, MM_HybridPackage.RIGHT_PATTERN__RULE,
					MM_HybridPackage.RULE__RIGHT_PATTERN);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectWithInverseResolvingEList.ManyInverse<Operation>(
					Operation.class, this,
					MM_HybridPackage.RIGHT_PATTERN__OPERATION,
					MM_HybridPackage.OPERATION__RIGHT_PATTERN);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_pattern() {
		return name_pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_pattern(String newName_pattern) {
		String oldName_pattern = name_pattern;
		name_pattern = newName_pattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.RIGHT_PATTERN__NAME_PATTERN,
					oldName_pattern, name_pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject) reference;
			reference = (Element) eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MM_HybridPackage.RIGHT_PATTERN__REFERENCE,
							oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Element newReference,
			NotificationChain msgs) {
		Element oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					MM_HybridPackage.RIGHT_PATTERN__REFERENCE, oldReference,
					newReference);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Element newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject) reference).eInverseRemove(this,
						MM_HybridPackage.ELEMENT__IS_REFERED, Element.class,
						msgs);
			if (newReference != null)
				msgs = ((InternalEObject) newReference).eInverseAdd(this,
						MM_HybridPackage.ELEMENT__IS_REFERED, Element.class,
						msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.RIGHT_PATTERN__REFERENCE, newReference,
					newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MM_HybridPackage.RIGHT_PATTERN__SOURCE_ELEMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSourceElement())
					.basicAdd(otherEnd, msgs);
		case MM_HybridPackage.RIGHT_PATTERN__RULE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRule())
					.basicAdd(otherEnd, msgs);
		case MM_HybridPackage.RIGHT_PATTERN__OPERATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOperation())
					.basicAdd(otherEnd, msgs);
		case MM_HybridPackage.RIGHT_PATTERN__REFERENCE:
			if (reference != null)
				msgs = ((InternalEObject) reference).eInverseRemove(this,
						MM_HybridPackage.ELEMENT__IS_REFERED, Element.class,
						msgs);
			return basicSetReference((Element) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case MM_HybridPackage.RIGHT_PATTERN__SOURCE_ELEMENT:
			return ((InternalEList<?>) getSourceElement()).basicRemove(
					otherEnd, msgs);
		case MM_HybridPackage.RIGHT_PATTERN__RULE:
			return ((InternalEList<?>) getRule()).basicRemove(otherEnd, msgs);
		case MM_HybridPackage.RIGHT_PATTERN__OPERATION:
			return ((InternalEList<?>) getOperation()).basicRemove(otherEnd,
					msgs);
		case MM_HybridPackage.RIGHT_PATTERN__REFERENCE:
			return basicSetReference(null, msgs);
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
		case MM_HybridPackage.RIGHT_PATTERN__SOURCE_ELEMENT:
			return getSourceElement();
		case MM_HybridPackage.RIGHT_PATTERN__RULE:
			return getRule();
		case MM_HybridPackage.RIGHT_PATTERN__OPERATION:
			return getOperation();
		case MM_HybridPackage.RIGHT_PATTERN__NAME_PATTERN:
			return getName_pattern();
		case MM_HybridPackage.RIGHT_PATTERN__REFERENCE:
			if (resolve)
				return getReference();
			return basicGetReference();
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
		case MM_HybridPackage.RIGHT_PATTERN__SOURCE_ELEMENT:
			getSourceElement().clear();
			getSourceElement().addAll(
					(Collection<? extends SourceElementRule>) newValue);
			return;
		case MM_HybridPackage.RIGHT_PATTERN__RULE:
			getRule().clear();
			getRule().addAll((Collection<? extends Rule>) newValue);
			return;
		case MM_HybridPackage.RIGHT_PATTERN__OPERATION:
			getOperation().clear();
			getOperation().addAll((Collection<? extends Operation>) newValue);
			return;
		case MM_HybridPackage.RIGHT_PATTERN__NAME_PATTERN:
			setName_pattern((String) newValue);
			return;
		case MM_HybridPackage.RIGHT_PATTERN__REFERENCE:
			setReference((Element) newValue);
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
		case MM_HybridPackage.RIGHT_PATTERN__SOURCE_ELEMENT:
			getSourceElement().clear();
			return;
		case MM_HybridPackage.RIGHT_PATTERN__RULE:
			getRule().clear();
			return;
		case MM_HybridPackage.RIGHT_PATTERN__OPERATION:
			getOperation().clear();
			return;
		case MM_HybridPackage.RIGHT_PATTERN__NAME_PATTERN:
			setName_pattern(NAME_PATTERN_EDEFAULT);
			return;
		case MM_HybridPackage.RIGHT_PATTERN__REFERENCE:
			setReference((Element) null);
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
		case MM_HybridPackage.RIGHT_PATTERN__SOURCE_ELEMENT:
			return sourceElement != null && !sourceElement.isEmpty();
		case MM_HybridPackage.RIGHT_PATTERN__RULE:
			return rule != null && !rule.isEmpty();
		case MM_HybridPackage.RIGHT_PATTERN__OPERATION:
			return operation != null && !operation.isEmpty();
		case MM_HybridPackage.RIGHT_PATTERN__NAME_PATTERN:
			return NAME_PATTERN_EDEFAULT == null ? name_pattern != null
					: !NAME_PATTERN_EDEFAULT.equals(name_pattern);
		case MM_HybridPackage.RIGHT_PATTERN__REFERENCE:
			return reference != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name_pattern: "); //$NON-NLS-1$
		result.append(name_pattern);
		result.append(')');
		return result.toString();
	}

} //RightPatternImpl
