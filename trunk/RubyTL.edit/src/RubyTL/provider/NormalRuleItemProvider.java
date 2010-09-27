/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RubyTL.provider;


import RubyTL.FromElement;
import RubyTL.NormalRule;
import RubyTL.ToElement;
import RubyTL.TopRule;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the item provider adapter for a {@link RubyTL.NormalRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NormalRuleItemProvider
	extends RuleItemProvider
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
	public NormalRuleItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns NormalRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NormalRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NormalRule)object).getName();
		String inElement="";
		String metamodel="NotDefined";
		if(((NormalRule)object).getFrom()!=null){
			FromElement from=((NormalRule)object).getFrom(); 
			if(from.getMetamodel()!=null){
				metamodel=from.getMetamodel().getName();
			}
			inElement=from.getClassname()+"::"+metamodel;
		}
		
		String outElements=new  String("");
		int count=0;
		for(Object i:((NormalRule) object).getTo()){
			count++;
			metamodel="NotDefined";
			ToElement to=(ToElement)i;
			if(to.getMetamodel()!=null){
				metamodel=to.getMetamodel().getName();
			}
			outElements+=to.getClassname()+"::"+metamodel;
			if(count!=((NormalRule) object).getTo().size()){
				outElements+=", ";
			}
		}
		return label == null || label.length() == 0 ?
			getString("_UI_NormalRule_type") :
			getString("_UI_NormalRule_type") + " " + label + " ("+inElement+" -> "+outElements+")";
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
