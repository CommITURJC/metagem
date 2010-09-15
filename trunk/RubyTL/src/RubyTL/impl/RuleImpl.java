/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RubyTL.impl;

import RubyTL.Filter;
import RubyTL.FromElement;
import RubyTL.Mapping;
import RubyTL.RubyTLPackage;
import RubyTL.Rule;
import RubyTL.ToElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RubyTL.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link RubyTL.impl.RuleImpl#getFrom <em>From</em>}</li>
 *   <li>{@link RubyTL.impl.RuleImpl#getTo <em>To</em>}</li>
 *   <li>{@link RubyTL.impl.RuleImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link RubyTL.impl.RuleImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RuleImpl extends EObjectImpl implements Rule {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected FromElement from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected ToElement to;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected Mapping mapping;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected Filter filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RubyTLPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RubyTLPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromElement getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(FromElement newFrom,
			NotificationChain msgs) {
		FromElement oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RubyTLPackage.RULE__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(FromElement newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RubyTLPackage.RULE__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RubyTLPackage.RULE__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RubyTLPackage.RULE__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToElement getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(ToElement newTo, NotificationChain msgs) {
		ToElement oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RubyTLPackage.RULE__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(ToElement newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RubyTLPackage.RULE__TO, null, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RubyTLPackage.RULE__TO, null, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RubyTLPackage.RULE__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping(Mapping newMapping,
			NotificationChain msgs) {
		Mapping oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RubyTLPackage.RULE__MAPPING, oldMapping, newMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(Mapping newMapping) {
		if (newMapping != mapping) {
			NotificationChain msgs = null;
			if (mapping != null)
				msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RubyTLPackage.RULE__MAPPING, null, msgs);
			if (newMapping != null)
				msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RubyTLPackage.RULE__MAPPING, null, msgs);
			msgs = basicSetMapping(newMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RubyTLPackage.RULE__MAPPING, newMapping, newMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(Filter newFilter, NotificationChain msgs) {
		Filter oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RubyTLPackage.RULE__FILTER, oldFilter, newFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(Filter newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RubyTLPackage.RULE__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RubyTLPackage.RULE__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RubyTLPackage.RULE__FILTER, newFilter, newFilter));
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
			case RubyTLPackage.RULE__FROM:
				return basicSetFrom(null, msgs);
			case RubyTLPackage.RULE__TO:
				return basicSetTo(null, msgs);
			case RubyTLPackage.RULE__MAPPING:
				return basicSetMapping(null, msgs);
			case RubyTLPackage.RULE__FILTER:
				return basicSetFilter(null, msgs);
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
			case RubyTLPackage.RULE__NAME:
				return getName();
			case RubyTLPackage.RULE__FROM:
				return getFrom();
			case RubyTLPackage.RULE__TO:
				return getTo();
			case RubyTLPackage.RULE__MAPPING:
				return getMapping();
			case RubyTLPackage.RULE__FILTER:
				return getFilter();
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
			case RubyTLPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case RubyTLPackage.RULE__FROM:
				setFrom((FromElement)newValue);
				return;
			case RubyTLPackage.RULE__TO:
				setTo((ToElement)newValue);
				return;
			case RubyTLPackage.RULE__MAPPING:
				setMapping((Mapping)newValue);
				return;
			case RubyTLPackage.RULE__FILTER:
				setFilter((Filter)newValue);
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
			case RubyTLPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RubyTLPackage.RULE__FROM:
				setFrom((FromElement)null);
				return;
			case RubyTLPackage.RULE__TO:
				setTo((ToElement)null);
				return;
			case RubyTLPackage.RULE__MAPPING:
				setMapping((Mapping)null);
				return;
			case RubyTLPackage.RULE__FILTER:
				setFilter((Filter)null);
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
			case RubyTLPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RubyTLPackage.RULE__FROM:
				return from != null;
			case RubyTLPackage.RULE__TO:
				return to != null;
			case RubyTLPackage.RULE__MAPPING:
				return mapping != null;
			case RubyTLPackage.RULE__FILTER:
				return filter != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
