/*
 * 
 */
package mm_hybrid.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MM_HybridDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
				.getVisualID(view)) {
		case mm_hybrid.diagram.edit.parts.RuleSourceEditPart.VISUAL_ID:
			return getRuleSource_7001SemanticChildren(view);
		case mm_hybrid.diagram.edit.parts.RuleTargetEditPart.VISUAL_ID:
			return getRuleTarget_7002SemanticChildren(view);
		case mm_hybrid.diagram.edit.parts.SourceElementRuleConditionEditPart.VISUAL_ID:
			return getSourceElementRuleCondition_7003SemanticChildren(view);
		case mm_hybrid.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return getModule_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRuleSource_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		mm_hybrid.Rule modelElement = (mm_hybrid.Rule) containerView
				.getElement();
		List result = new LinkedList();
		{
			mm_hybrid.SourceElementRule childElement = modelElement.getIn();
			int visualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID) {
				result.add(new mm_hybrid.diagram.part.MM_HybridNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRuleTarget_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		mm_hybrid.Rule modelElement = (mm_hybrid.Rule) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOut().iterator(); it.hasNext();) {
			mm_hybrid.TargetElementRule childElement = (mm_hybrid.TargetElementRule) it
					.next();
			int visualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID) {
				result.add(new mm_hybrid.diagram.part.MM_HybridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSourceElementRuleCondition_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		mm_hybrid.SourceElementRule modelElement = (mm_hybrid.SourceElementRule) containerView
				.getElement();
		List result = new LinkedList();
		{
			mm_hybrid.Condition childElement = modelElement.getCondition();
			int visualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID) {
				result.add(new mm_hybrid.diagram.part.MM_HybridNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getModule_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		mm_hybrid.Module modelElement = (mm_hybrid.Module) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getRule().iterator(); it.hasNext();) {
			mm_hybrid.Rule childElement = (mm_hybrid.Rule) it.next();
			int visualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID) {
				result.add(new mm_hybrid.diagram.part.MM_HybridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getInMM().iterator(); it.hasNext();) {
			mm_hybrid.InMetaModel childElement = (mm_hybrid.InMetaModel) it
					.next();
			int visualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID) {
				result.add(new mm_hybrid.diagram.part.MM_HybridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getOutMM().iterator(); it.hasNext();) {
			mm_hybrid.OutMetaModel childElement = (mm_hybrid.OutMetaModel) it
					.next();
			int visualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID) {
				result.add(new mm_hybrid.diagram.part.MM_HybridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
				.getVisualID(view)) {
		case mm_hybrid.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return getModule_1000ContainedLinks(view);
		case mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			return getRule_2001ContainedLinks(view);
		case mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID:
			return getInMetaModel_2002ContainedLinks(view);
		case mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID:
			return getOutMetaModel_2003ContainedLinks(view);
		case mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID:
			return getSourceElementRule_3001ContainedLinks(view);
		case mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID:
			return getCondition_3003ContainedLinks(view);
		case mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID:
			return getTargetElementRule_3002ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
				.getVisualID(view)) {
		case mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			return getRule_2001IncomingLinks(view);
		case mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID:
			return getInMetaModel_2002IncomingLinks(view);
		case mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID:
			return getOutMetaModel_2003IncomingLinks(view);
		case mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID:
			return getSourceElementRule_3001IncomingLinks(view);
		case mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID:
			return getCondition_3003IncomingLinks(view);
		case mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID:
			return getTargetElementRule_3002IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
				.getVisualID(view)) {
		case mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			return getRule_2001OutgoingLinks(view);
		case mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID:
			return getInMetaModel_2002OutgoingLinks(view);
		case mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID:
			return getOutMetaModel_2003OutgoingLinks(view);
		case mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID:
			return getSourceElementRule_3001OutgoingLinks(view);
		case mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID:
			return getCondition_3003OutgoingLinks(view);
		case mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID:
			return getTargetElementRule_3002OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getModule_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRule_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInMetaModel_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutMetaModel_2003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSourceElementRule_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTargetElementRule_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRule_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInMetaModel_2002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutMetaModel_2003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSourceElementRule_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTargetElementRule_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRule_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInMetaModel_2002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutMetaModel_2003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSourceElementRule_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_3003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTargetElementRule_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

}
