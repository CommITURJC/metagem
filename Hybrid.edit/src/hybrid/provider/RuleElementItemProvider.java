/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid.provider;


import hybrid.Binding;
import hybrid.HybridPackage;
import hybrid.LeftPattern;
import hybrid.RightPattern;
import hybrid.Rule;
import hybrid.RuleElement;
import hybrid.Source;
import hybrid.Target;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
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
 * This is the item provider adapter for a {@link hybrid.RuleElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleElementItemProvider
	extends HybridElementItemProvider
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
	public RuleElementItemProvider(AdapterFactory adapterFactory) {
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

			addRefPropertyDescriptor(object);
			addBelongsToPropertyDescriptor(object);
			addOwnsPropertyDescriptor(object);
			addModelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RuleElement_ref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RuleElement_ref_feature", "_UI_RuleElement_type"),
				 HybridPackage.Literals.RULE_ELEMENT__REF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Belongs To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	protected void addBelongsToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RuleElement_belongsTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RuleElement_belongsTo_feature", "_UI_RuleElement_type"),
				 HybridPackage.Literals.RULE_ELEMENT__BELONGS_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null)
			 {
		          @Override
		          public Collection<?> getChoiceOfValues(Object object)
		          {
		        	  Collection<Object> result = new ArrayList<Object>();
		        	  result.add(null);
		        	  if(object instanceof Source){
		        		Source element = (Source) object;
		        		RightPattern rPattern = element.getRightPatternOwned();
		        		if(rPattern!=null){
		        			Binding binding = rPattern.getBinding();
		        			Target target_rule = binding.getOwned();
		        			Rule mainRule = target_rule.getRule();
		        			result.addAll(mainRule.getSources());
		        		}  		   
		        	  }else if(object instanceof Target){
		        		Target element = (Target) object;
		        		LeftPattern lPattern = element.getLeftPatternOwned();
		        		if(lPattern!=null){
		        			Binding binding = lPattern.getBinding();
		        			Target target_rule = binding.getOwned();
		        			Rule mainRule = target_rule.getRule();
		        			result.addAll(mainRule.getTargets());
		        		}
		        		       		   
		        	  }
		        		  
					return result;
		          }
		          
		          @Override
		          public void resetPropertyValue(Object object)
		          {
		            setPropertyValue(object, null);
		          }
				});
			}

	/**
	 * This adds a property descriptor for the Owns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RuleElement_owns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RuleElement_owns_feature", "_UI_RuleElement_type"),
				 HybridPackage.Literals.RULE_ELEMENT__OWNS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RuleElement_model_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RuleElement_model_feature", "_UI_RuleElement_type"),
				 HybridPackage.Literals.RULE_ELEMENT__MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RuleElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RuleElement_type") :
			getString("_UI_RuleElement_type") + " " + label;
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

		switch (notification.getFeatureID(RuleElement.class)) {
			case HybridPackage.RULE_ELEMENT__REF:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
