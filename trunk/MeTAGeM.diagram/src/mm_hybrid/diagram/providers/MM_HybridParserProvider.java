/*
 * 
 */
package mm_hybrid.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MM_HybridParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser ruleName_rule_5003Parser;

	/**
	 * @generated
	 */
	private IParser getRuleName_rule_5003Parser() {
		if (ruleName_rule_5003Parser == null) {
			ruleName_rule_5003Parser = createRuleName_rule_5003Parser();
		}
		return ruleName_rule_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRuleName_rule_5003Parser() {
		EAttribute[] features = new EAttribute[] { mm_hybrid.MM_HybridPackage.eINSTANCE
				.getRule_Name_rule(), };
		mm_hybrid.diagram.parsers.MessageFormatParser parser = new mm_hybrid.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser ruleIsAbstractIsMain_5004Parser;

	/**
	 * @generated
	 */
	private IParser getRuleIsAbstractIsMain_5004Parser() {
		if (ruleIsAbstractIsMain_5004Parser == null) {
			ruleIsAbstractIsMain_5004Parser = createRuleIsAbstractIsMain_5004Parser();
		}
		return ruleIsAbstractIsMain_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRuleIsAbstractIsMain_5004Parser() {
		EAttribute[] features = new EAttribute[] {
				mm_hybrid.MM_HybridPackage.eINSTANCE.getRule_IsAbstract(),
				mm_hybrid.MM_HybridPackage.eINSTANCE.getRule_IsMain(), };
		mm_hybrid.diagram.parsers.MessageFormatParser parser = new mm_hybrid.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("( Abstract: {0},   Main: {1} )");
		parser.setEditorPattern("( Abstract: {0},   Main: {1} )");
		parser.setEditPattern("( Abstract: {0},   Main: {1} )");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inMetaModelName_mm_5005Parser;

	/**
	 * @generated
	 */
	private IParser getInMetaModelName_mm_5005Parser() {
		if (inMetaModelName_mm_5005Parser == null) {
			inMetaModelName_mm_5005Parser = createInMetaModelName_mm_5005Parser();
		}
		return inMetaModelName_mm_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInMetaModelName_mm_5005Parser() {
		EAttribute[] features = new EAttribute[] { mm_hybrid.MM_HybridPackage.eINSTANCE
				.getInMetaModel_Name_mm(), };
		mm_hybrid.diagram.parsers.MessageFormatParser parser = new mm_hybrid.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser outMetaModelName_mm_5006Parser;

	/**
	 * @generated
	 */
	private IParser getOutMetaModelName_mm_5006Parser() {
		if (outMetaModelName_mm_5006Parser == null) {
			outMetaModelName_mm_5006Parser = createOutMetaModelName_mm_5006Parser();
		}
		return outMetaModelName_mm_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOutMetaModelName_mm_5006Parser() {
		EAttribute[] features = new EAttribute[] { mm_hybrid.MM_HybridPackage.eINSTANCE
				.getOutMetaModel_Name_mm(), };
		mm_hybrid.diagram.parsers.MessageFormatParser parser = new mm_hybrid.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser sourceElementRuleName_element_5001Parser;

	/**
	 * @generated
	 */
	private IParser getSourceElementRuleName_element_5001Parser() {
		if (sourceElementRuleName_element_5001Parser == null) {
			sourceElementRuleName_element_5001Parser = createSourceElementRuleName_element_5001Parser();
		}
		return sourceElementRuleName_element_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSourceElementRuleName_element_5001Parser() {
		EAttribute[] features = new EAttribute[] { mm_hybrid.MM_HybridPackage.eINSTANCE
				.getElement_Name_element(), };
		mm_hybrid.diagram.parsers.MessageFormatParser parser = new mm_hybrid.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser condition_3003Parser;

	/**
	 * @generated
	 */
	private IParser getCondition_3003Parser() {
		if (condition_3003Parser == null) {
			condition_3003Parser = createCondition_3003Parser();
		}
		return condition_3003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCondition_3003Parser() {
		EAttribute[] features = new EAttribute[] { mm_hybrid.MM_HybridPackage.eINSTANCE
				.getCondition_Value(), };
		mm_hybrid.diagram.parsers.MessageFormatParser parser = new mm_hybrid.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("<<Condition>> {0}");
		parser.setEditorPattern("<<Condition>> {0}");
		parser.setEditPattern("<<Condition>> {0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser targetElementRuleName_element_5002Parser;

	/**
	 * @generated
	 */
	private IParser getTargetElementRuleName_element_5002Parser() {
		if (targetElementRuleName_element_5002Parser == null) {
			targetElementRuleName_element_5002Parser = createTargetElementRuleName_element_5002Parser();
		}
		return targetElementRuleName_element_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTargetElementRuleName_element_5002Parser() {
		EAttribute[] features = new EAttribute[] { mm_hybrid.MM_HybridPackage.eINSTANCE
				.getElement_Name_element(), };
		mm_hybrid.diagram.parsers.MessageFormatParser parser = new mm_hybrid.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case mm_hybrid.diagram.edit.parts.RuleName_ruleEditPart.VISUAL_ID:
			return getRuleName_rule_5003Parser();
		case mm_hybrid.diagram.edit.parts.RuleIsAbstractIsMainEditPart.VISUAL_ID:
			return getRuleIsAbstractIsMain_5004Parser();
		case mm_hybrid.diagram.edit.parts.InMetaModelName_mmEditPart.VISUAL_ID:
			return getInMetaModelName_mm_5005Parser();
		case mm_hybrid.diagram.edit.parts.OutMetaModelName_mmEditPart.VISUAL_ID:
			return getOutMetaModelName_mm_5006Parser();
		case mm_hybrid.diagram.edit.parts.SourceElementRuleName_elementEditPart.VISUAL_ID:
			return getSourceElementRuleName_element_5001Parser();
		case mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID:
			return getCondition_3003Parser();
		case mm_hybrid.diagram.edit.parts.TargetElementRuleName_elementEditPart.VISUAL_ID:
			return getTargetElementRuleName_element_5002Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (mm_hybrid.diagram.providers.MM_HybridElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
