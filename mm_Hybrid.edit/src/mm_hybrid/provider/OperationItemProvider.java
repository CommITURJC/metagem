/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.provider;

import java.util.Collection;
import java.util.List;

import mm_hybrid.MM_HybridFactory;
import mm_hybrid.MM_HybridPackage;
import mm_hybrid.Operation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mm_hybrid.Operation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationItemProvider(AdapterFactory adapterFactory) {
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

			addName_operationPropertyDescriptor(object);
			addBodyPropertyDescriptor(object);
			addContextPropertyDescriptor(object);
			addRightPatternPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addName_operationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Operation_name_operation_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Operation_name_operation_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						MM_HybridPackage.Literals.OPERATION__NAME_OPERATION,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Body feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBodyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Operation_body_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Operation_body_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						MM_HybridPackage.Literals.OPERATION__BODY, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Operation_context_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Operation_context_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						MM_HybridPackage.Literals.OPERATION__CONTEXT, true,
						false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Right Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Operation_rightPattern_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Operation_rightPattern_feature", "_UI_Operation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						MM_HybridPackage.Literals.OPERATION__RIGHT_PATTERN,
						true, false, true, null, null, null));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(MM_HybridPackage.Literals.OPERATION__RETURN_TYPE);
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
	 * This returns Operation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/Operation")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Operation) object).getName_operation();
		String context = "";
		String returnString = "";

		if (((Operation) object).getContext() != null)
			context = ((Operation) object).getContext().getName_element();

		if (((Operation) object).getReturnType() != null) {
			if (((Operation) object).getReturnType().getElement() != null) {
				returnString = ((Operation) object).getReturnType()
						.getElement().getName_element();
			} else {
				returnString = ((Operation) object).getReturnType()
						.getDatatype().getName();
			}
		}

		return label == null || label.length() == 0 ? getString("_UI_Operation_type") : //$NON-NLS-1$
				getString("_UI_Operation_type") + " " + label + " (" + context + ") : " + returnString; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Operation.class)) {
		case MM_HybridPackage.OPERATION__NAME_OPERATION:
		case MM_HybridPackage.OPERATION__BODY:
		case MM_HybridPackage.OPERATION__CONTEXT:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		case MM_HybridPackage.OPERATION__RETURN_TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), true, true));
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
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				MM_HybridPackage.Literals.OPERATION__RETURN_TYPE,
				MM_HybridFactory.eINSTANCE.createReturn()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MM_HybridEditPlugin.INSTANCE;
	}

}
