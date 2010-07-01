/*
 * 
 */
package mm_hybrid.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class MM_HybridNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		mm_hybrid.diagram.part.MM_HybridDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		mm_hybrid.diagram.part.MM_HybridDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof mm_hybrid.diagram.navigator.MM_HybridNavigatorItem
				&& !isOwnView(((mm_hybrid.diagram.navigator.MM_HybridNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof mm_hybrid.diagram.navigator.MM_HybridNavigatorGroup) {
			mm_hybrid.diagram.navigator.MM_HybridNavigatorGroup group = (mm_hybrid.diagram.navigator.MM_HybridNavigatorGroup) element;
			return mm_hybrid.diagram.part.MM_HybridDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof mm_hybrid.diagram.navigator.MM_HybridNavigatorItem) {
			mm_hybrid.diagram.navigator.MM_HybridNavigatorItem navigatorItem = (mm_hybrid.diagram.navigator.MM_HybridNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
				.getVisualID(view)) {
		case mm_hybrid.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///MM_Hybrid.ecore?Module", mm_hybrid.diagram.providers.MM_HybridElementTypes.Module_79); //$NON-NLS-1$
		case mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///MM_Hybrid.ecore?Rule", mm_hybrid.diagram.providers.MM_HybridElementTypes.Rule_1001); //$NON-NLS-1$
		case mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///MM_Hybrid.ecore?InMetaModel", mm_hybrid.diagram.providers.MM_HybridElementTypes.InMetaModel_1002); //$NON-NLS-1$
		case mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///MM_Hybrid.ecore?OutMetaModel", mm_hybrid.diagram.providers.MM_HybridElementTypes.OutMetaModel_1003); //$NON-NLS-1$
		case mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///MM_Hybrid.ecore?SourceElementRule", mm_hybrid.diagram.providers.MM_HybridElementTypes.SourceElementRule_2001); //$NON-NLS-1$
		case mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///MM_Hybrid.ecore?Condition", mm_hybrid.diagram.providers.MM_HybridElementTypes.Condition_2002); //$NON-NLS-1$
		case mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///MM_Hybrid.ecore?TargetElementRule", mm_hybrid.diagram.providers.MM_HybridElementTypes.TargetElementRule_2003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = mm_hybrid.diagram.part.MM_HybridDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& mm_hybrid.diagram.providers.MM_HybridElementTypes
						.isKnownElementType(elementType)) {
			image = mm_hybrid.diagram.providers.MM_HybridElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof mm_hybrid.diagram.navigator.MM_HybridNavigatorGroup) {
			mm_hybrid.diagram.navigator.MM_HybridNavigatorGroup group = (mm_hybrid.diagram.navigator.MM_HybridNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof mm_hybrid.diagram.navigator.MM_HybridNavigatorItem) {
			mm_hybrid.diagram.navigator.MM_HybridNavigatorItem navigatorItem = (mm_hybrid.diagram.navigator.MM_HybridNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
				.getVisualID(view)) {
		case mm_hybrid.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return getModule_79Text(view);
		case mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			return getRule_1001Text(view);
		case mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID:
			return getInMetaModel_1002Text(view);
		case mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID:
			return getOutMetaModel_1003Text(view);
		case mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID:
			return getSourceElementRule_2001Text(view);
		case mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID:
			return getCondition_2002Text(view);
		case mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID:
			return getTargetElementRule_2003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getModule_79Text(View view) {
		mm_hybrid.Module domainModelElement = (mm_hybrid.Module) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName_module();
		} else {
			mm_hybrid.diagram.part.MM_HybridDiagramEditorPlugin.getInstance()
					.logError(
							"No domain element for view with visualID = " + 79); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRule_1001Text(View view) {
		IAdaptable hintAdapter = new mm_hybrid.diagram.providers.MM_HybridParserProvider.HintAdapter(
				mm_hybrid.diagram.providers.MM_HybridElementTypes.Rule_1001,
				(view.getElement() != null ? view.getElement() : view),
				mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
						.getType(mm_hybrid.diagram.edit.parts.RuleName_ruleEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			mm_hybrid.diagram.part.MM_HybridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInMetaModel_1002Text(View view) {
		IAdaptable hintAdapter = new mm_hybrid.diagram.providers.MM_HybridParserProvider.HintAdapter(
				mm_hybrid.diagram.providers.MM_HybridElementTypes.InMetaModel_1002,
				(view.getElement() != null ? view.getElement() : view),
				mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
						.getType(mm_hybrid.diagram.edit.parts.InMetaModelName_mmEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			mm_hybrid.diagram.part.MM_HybridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getOutMetaModel_1003Text(View view) {
		IAdaptable hintAdapter = new mm_hybrid.diagram.providers.MM_HybridParserProvider.HintAdapter(
				mm_hybrid.diagram.providers.MM_HybridElementTypes.OutMetaModel_1003,
				(view.getElement() != null ? view.getElement() : view),
				mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
						.getType(mm_hybrid.diagram.edit.parts.OutMetaModelName_mmEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			mm_hybrid.diagram.part.MM_HybridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSourceElementRule_2001Text(View view) {
		IAdaptable hintAdapter = new mm_hybrid.diagram.providers.MM_HybridParserProvider.HintAdapter(
				mm_hybrid.diagram.providers.MM_HybridElementTypes.SourceElementRule_2001,
				(view.getElement() != null ? view.getElement() : view),
				mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
						.getType(mm_hybrid.diagram.edit.parts.SourceElementRuleName_elementEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			mm_hybrid.diagram.part.MM_HybridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getCondition_2002Text(View view) {
		IAdaptable hintAdapter = new mm_hybrid.diagram.providers.MM_HybridParserProvider.HintAdapter(
				mm_hybrid.diagram.providers.MM_HybridElementTypes.Condition_2002,
				(view.getElement() != null ? view.getElement() : view),
				mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
						.getType(mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			mm_hybrid.diagram.part.MM_HybridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTargetElementRule_2003Text(View view) {
		IAdaptable hintAdapter = new mm_hybrid.diagram.providers.MM_HybridParserProvider.HintAdapter(
				mm_hybrid.diagram.providers.MM_HybridElementTypes.TargetElementRule_2003,
				(view.getElement() != null ? view.getElement() : view),
				mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
						.getType(mm_hybrid.diagram.edit.parts.TargetElementRuleName_elementEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			mm_hybrid.diagram.part.MM_HybridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return mm_hybrid.diagram.edit.parts.ModuleEditPart.MODEL_ID
				.equals(mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
						.getModelID(view));
	}

}
