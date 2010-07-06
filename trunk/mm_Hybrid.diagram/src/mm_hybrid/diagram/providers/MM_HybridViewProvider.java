/*
 * 
 */
package mm_hybrid.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MM_HybridViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (mm_hybrid.diagram.edit.parts.ModuleEditPart.MODEL_ID
				.equals(diagramKind)
				&& mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
						.getDiagramVisualID(semanticElement) != -1) {
			return mm_hybrid.diagram.view.factories.ModuleViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!mm_hybrid.diagram.providers.MM_HybridElementTypes
						.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
								.getNodeVisualID(containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!mm_hybrid.diagram.edit.parts.ModuleEditPart.MODEL_ID
						.equals(mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
								.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID:
				case mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID:
				case mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID:
				case mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID:
				case mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID:
				case mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case mm_hybrid.diagram.edit.parts.RuleName_ruleEditPart.VISUAL_ID:
				case mm_hybrid.diagram.edit.parts.RuleIsAbstractIsMainEditPart.VISUAL_ID:
				case mm_hybrid.diagram.edit.parts.RuleSourceEditPart.VISUAL_ID:
				case mm_hybrid.diagram.edit.parts.RuleTargetEditPart.VISUAL_ID:
					if (mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID != mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case mm_hybrid.diagram.edit.parts.InMetaModelName_mmEditPart.VISUAL_ID:
				case mm_hybrid.diagram.edit.parts.InMetaModelType_mmEditPart.VISUAL_ID:
					if (mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID != mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case mm_hybrid.diagram.edit.parts.OutMetaModelName_mmEditPart.VISUAL_ID:
				case mm_hybrid.diagram.edit.parts.OutMetaModelType_mmEditPart.VISUAL_ID:
					if (mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID != mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case mm_hybrid.diagram.edit.parts.SourceElementRuleName_elementEditPart.VISUAL_ID:
				case mm_hybrid.diagram.edit.parts.SourceElementRuleConditionEditPart.VISUAL_ID:
					if (mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID != mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case mm_hybrid.diagram.edit.parts.TargetElementRuleName_elementEditPart.VISUAL_ID:
					if (mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID != mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null
				|| !mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
						.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.RuleViewFactory.class;
		case mm_hybrid.diagram.edit.parts.RuleName_ruleEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.RuleName_ruleViewFactory.class;
		case mm_hybrid.diagram.edit.parts.RuleIsAbstractIsMainEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.RuleIsAbstractIsMainViewFactory.class;
		case mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.InMetaModelViewFactory.class;
		case mm_hybrid.diagram.edit.parts.InMetaModelName_mmEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.InMetaModelName_mmViewFactory.class;
		case mm_hybrid.diagram.edit.parts.InMetaModelType_mmEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.InMetaModelType_mmViewFactory.class;
		case mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.OutMetaModelViewFactory.class;
		case mm_hybrid.diagram.edit.parts.OutMetaModelName_mmEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.OutMetaModelName_mmViewFactory.class;
		case mm_hybrid.diagram.edit.parts.OutMetaModelType_mmEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.OutMetaModelType_mmViewFactory.class;
		case mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.SourceElementRuleViewFactory.class;
		case mm_hybrid.diagram.edit.parts.SourceElementRuleName_elementEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.SourceElementRuleName_elementViewFactory.class;
		case mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.ConditionViewFactory.class;
		case mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.TargetElementRuleViewFactory.class;
		case mm_hybrid.diagram.edit.parts.TargetElementRuleName_elementEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.TargetElementRuleName_elementViewFactory.class;
		case mm_hybrid.diagram.edit.parts.RuleSourceEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.RuleSourceViewFactory.class;
		case mm_hybrid.diagram.edit.parts.RuleTargetEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.RuleTargetViewFactory.class;
		case mm_hybrid.diagram.edit.parts.SourceElementRuleConditionEditPart.VISUAL_ID:
			return mm_hybrid.diagram.view.factories.SourceElementRuleConditionViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!mm_hybrid.diagram.providers.MM_HybridElementTypes
				.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
				.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
