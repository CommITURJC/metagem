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
import mm_hybrid.Rule;
import mm_hybrid.SourceElementRule;
import mm_hybrid.TargetElementRule;

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
 * This is the item provider adapter for a {@link mm_hybrid.Rule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleItemProvider(AdapterFactory adapterFactory) {
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

			addName_rulePropertyDescriptor(object);
			addIsAbstractPropertyDescriptor(object);
			addIsMainPropertyDescriptor(object);
			addTypeAttributePropertyDescriptor(object);
			addTypeElementPropertyDescriptor(object);
			addExtendsPropertyDescriptor(object);
			addIsExtendedPropertyDescriptor(object);
			addRightPatternPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addName_rulePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Rule_name_rule_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rule_name_rule_feature", "_UI_Rule_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						MM_HybridPackage.Literals.RULE__NAME_RULE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Rule_isAbstract_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rule_isAbstract_feature", "_UI_Rule_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						MM_HybridPackage.Literals.RULE__IS_ABSTRACT, true,
						false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Main feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsMainPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Rule_isMain_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rule_isMain_feature", "_UI_Rule_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						MM_HybridPackage.Literals.RULE__IS_MAIN, true, false,
						false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Type Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Rule_typeAttribute_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rule_typeAttribute_feature", "_UI_Rule_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						MM_HybridPackage.Literals.RULE__TYPE_ATTRIBUTE, true,
						false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Rule_typeElement_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rule_typeElement_feature", "_UI_Rule_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						MM_HybridPackage.Literals.RULE__TYPE_ELEMENT, true,
						false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Extends feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Rule_extends_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rule_extends_feature", "_UI_Rule_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						MM_HybridPackage.Literals.RULE__EXTENDS, true, false,
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Extended feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsExtendedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Rule_isExtended_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rule_isExtended_feature", "_UI_Rule_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						MM_HybridPackage.Literals.RULE__IS_EXTENDED, true,
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
						getString("_UI_Rule_rightPattern_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rule_rightPattern_feature", "_UI_Rule_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						MM_HybridPackage.Literals.RULE__RIGHT_PATTERN, true,
						false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Rule_comment_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Rule_comment_feature", "_UI_Rule_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						MM_HybridPackage.Literals.RULE__COMMENT, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
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
			childrenFeatures.add(MM_HybridPackage.Literals.RULE__IN);
			childrenFeatures.add(MM_HybridPackage.Literals.RULE__OUT);
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
	 * This returns Rule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/Rule")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Rule) object).getName_rule();
		String inElements="";
		int count=0;
		for(Object i:((Rule) object).getIn()){
			count++;
			String metamodel="NotDefined";
			if(((SourceElementRule)i).getMetamodel()!=null){
				metamodel=((SourceElementRule)i).getMetamodel().getName_mm();
			}
			inElements+=((SourceElementRule)i).getName_element()+"::"+metamodel;
			if(count!=((Rule) object).getIn().size()){
				inElements+=", ";
			}
		}
		String outElements=new  String("");
		count=0;
		for(Object i:((Rule) object).getOut()){
			count++;
			String metamodel="NotDefined";
			if(((TargetElementRule)i).getMetamodel()!=null){
				metamodel=((TargetElementRule)i).getMetamodel().getName_mm();
			}
			outElements+=((TargetElementRule)i).getName_element()+"::"+metamodel;
			if(count!=((Rule) object).getOut().size()){
				outElements+=", ";
			}
		}
		
		return label == null || label.length() == 0 ? getString("_UI_Rule_type") : //$NON-NLS-1$
				getString("_UI_Rule_type") + " " + label + " ("+inElements+" -> "+outElements+")"; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Rule.class)) {
		case MM_HybridPackage.RULE__NAME_RULE:
		case MM_HybridPackage.RULE__IS_ABSTRACT:
		case MM_HybridPackage.RULE__IS_MAIN:
		case MM_HybridPackage.RULE__TYPE_ATTRIBUTE:
		case MM_HybridPackage.RULE__TYPE_ELEMENT:
		case MM_HybridPackage.RULE__COMMENT:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		case MM_HybridPackage.RULE__IN:
		case MM_HybridPackage.RULE__OUT:
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
				MM_HybridPackage.Literals.RULE__IN, MM_HybridFactory.eINSTANCE
						.createSourceElementRule()));

		newChildDescriptors.add(createChildParameter(
				MM_HybridPackage.Literals.RULE__OUT, MM_HybridFactory.eINSTANCE
						.createTargetElementRule()));
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
