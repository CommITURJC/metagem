/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL.provider;


import ETL.ETLFactory;
import ETL.ETLPackage;
import ETL.TransformationRule;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ETL.TransformationRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationRuleItemProvider
	extends EtlElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationRuleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIsAbstractPropertyDescriptor(object);
			addLazyPropertyDescriptor(object);
			addPrimaryPropertyDescriptor(object);
			addGreedyPropertyDescriptor(object);
			addExtendsPropertyDescriptor(object);
			addIsExtendedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransformationRule_isAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransformationRule_isAbstract_feature", "_UI_TransformationRule_type"),
				 ETLPackage.Literals.TRANSFORMATION_RULE__IS_ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lazy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLazyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransformationRule_lazy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransformationRule_lazy_feature", "_UI_TransformationRule_type"),
				 ETLPackage.Literals.TRANSFORMATION_RULE__LAZY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransformationRule_primary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransformationRule_primary_feature", "_UI_TransformationRule_type"),
				 ETLPackage.Literals.TRANSFORMATION_RULE__PRIMARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Greedy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGreedyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransformationRule_greedy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransformationRule_greedy_feature", "_UI_TransformationRule_type"),
				 ETLPackage.Literals.TRANSFORMATION_RULE__GREEDY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extends feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransformationRule_extends_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransformationRule_extends_feature", "_UI_TransformationRule_type"),
				 ETLPackage.Literals.TRANSFORMATION_RULE__EXTENDS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Extended feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsExtendedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransformationRule_isExtended_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransformationRule_isExtended_feature", "_UI_TransformationRule_type"),
				 ETLPackage.Literals.TRANSFORMATION_RULE__IS_EXTENDED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ETLPackage.Literals.TRANSFORMATION_RULE__GUARD);
			childrenFeatures.add(ETLPackage.Literals.TRANSFORMATION_RULE__SOURCE);
			childrenFeatures.add(ETLPackage.Literals.TRANSFORMATION_RULE__TARGETS);
			childrenFeatures.add(ETLPackage.Literals.TRANSFORMATION_RULE__BINDINGS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TransformationRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TransformationRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TransformationRule)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TransformationRule_type") :
			getString("_UI_TransformationRule_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TransformationRule.class)) {
			case ETLPackage.TRANSFORMATION_RULE__IS_ABSTRACT:
			case ETLPackage.TRANSFORMATION_RULE__LAZY:
			case ETLPackage.TRANSFORMATION_RULE__PRIMARY:
			case ETLPackage.TRANSFORMATION_RULE__GREEDY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ETLPackage.TRANSFORMATION_RULE__GUARD:
			case ETLPackage.TRANSFORMATION_RULE__SOURCE:
			case ETLPackage.TRANSFORMATION_RULE__TARGETS:
			case ETLPackage.TRANSFORMATION_RULE__BINDINGS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ETLPackage.Literals.TRANSFORMATION_RULE__GUARD,
				 ETLFactory.eINSTANCE.createGuard()));

		newChildDescriptors.add
			(createChildParameter
				(ETLPackage.Literals.TRANSFORMATION_RULE__SOURCE,
				 ETLFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(ETLPackage.Literals.TRANSFORMATION_RULE__TARGETS,
				 ETLFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(ETLPackage.Literals.TRANSFORMATION_RULE__BINDINGS,
				 ETLFactory.eINSTANCE.createBinding()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ETLPackage.Literals.TRANSFORMATION_RULE__SOURCE ||
			childFeature == ETLPackage.Literals.TRANSFORMATION_RULE__TARGETS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
