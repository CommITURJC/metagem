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
	private IParser ruleName_rule_4003Parser;

	/**
	 * @generated
	 */
	private IParser getRuleName_rule_4003Parser() {
		if (ruleName_rule_4003Parser == null) {
			ruleName_rule_4003Parser = createRuleName_rule_4003Parser();
		}
		return ruleName_rule_4003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRuleName_rule_4003Parser() {
		EAttribute[] features = new EAttribute[] { mm_hybrid.MM_HybridPackage.eINSTANCE
				.getRule_Name_rule(), };
		mm_hybrid.diagram.parsers.MessageFormatParser parser = new mm_hybrid.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser ruleIsAbstractIsMain_4004Parser;

	/**
	 * @generated
	 */
	private IParser getRuleIsAbstractIsMain_4004Parser() {
		if (ruleIsAbstractIsMain_4004Parser == null) {
			ruleIsAbstractIsMain_4004Parser = createRuleIsAbstractIsMain_4004Parser();
		}
		return ruleIsAbstractIsMain_4004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRuleIsAbstractIsMain_4004Parser() {
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
	private IParser inMetaModelName_mm_4005Parser;

	/**
	 * @generated
	 */
	private IParser getInMetaModelName_mm_4005Parser() {
		if (inMetaModelName_mm_4005Parser == null) {
			inMetaModelName_mm_4005Parser = createInMetaModelName_mm_4005Parser();
		}
		return inMetaModelName_mm_4005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInMetaModelName_mm_4005Parser() {
		EAttribute[] features = new EAttribute[] { mm_hybrid.MM_HybridPackage.eINSTANCE
				.getInMetaModel_Name_mm(), };
		mm_hybrid.diagram.parsers.MessageFormatParser parser = new mm_hybrid.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inMetaModelType_mm_4006Parser;

	/**
	 * @generated
	 */
	private IParser getInMetaModelType_mm_4006Parser() {
		if (inMetaModelType_mm_4006Parser == null) {
			inMetaModelType_mm_4006Parser = createInMetaModelType_mm_4006Parser();
		}
		return inMetaModelType_mm_4006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInMetaModelType_mm_4006Parser() {
		EAttribute[] features = new EAttribute[] { mm_hybrid.MM_HybridPackage.eINSTANCE
				.getInMetaModel_Type_mm(), };
		mm_hybrid.diagram.parsers.MessageFormatParser parser = new mm_hybrid.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("type: {0}");
		parser.setEditorPattern("type: {0}");
		parser.setEditPattern("type: {0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser outMetaModelName_mm_4007Parser;

	/**
	 * @generated
	 */
	private IParser getOutMetaModelName_mm_4007Parser() {
		if (outMetaModelName_mm_4007Parser == null) {
			outMetaModelName_mm_4007Parser = createOutMetaModelName_mm_4007Parser();
		}
		return outMetaModelName_mm_4007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOutMetaModelName_mm_4007Parser() {
		EAttribute[] features = new EAttribute[] { mm_hybrid.MM_HybridPackage.eINSTANCE
				.getOutMetaModel_Name_mm(), };
		mm_hybrid.diagram.parsers.MessageFormatParser parser = new mm_hybrid.diagram.parsers.MessageFormatParser(
				features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser outMetaModelType_mm_4008Parser;

	/**
	 * @generated
	 */
	private IParser getOutMetaModelType_mm_4008Parser() {
		if (outMetaModelType_mm_4008Parser == null) {
			outMetaModelType_mm_4008Parser = createOutMetaModelType_mm_4008Parser();
		}
		return outMetaModelType_mm_4008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOutMetaModelType_mm_4008Parser() {
		EAttribute[] features = new EAttribute[] { mm_hybrid.MM_HybridPackage.eINSTANCE
				.getOutMetaModel_Type_mm(), };
		mm_hybrid.diagram.parsers.MessageFormatParser parser = new mm_hybrid.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("type: {0}");
		parser.setEditorPattern("type: {0}");
		parser.setEditPattern("type: {0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser sourceElementRuleName_element_4001Parser;

	/**
	 * @generated
	 */
	private IParser getSourceElementRuleName_element_4001Parser() {
		if (sourceElementRuleName_element_4001Parser == null) {
			sourceElementRuleName_element_4001Parser = createSourceElementRuleName_element_4001Parser();
		}
		return sourceElementRuleName_element_4001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSourceElementRuleName_element_4001Parser() {
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
	private IParser guard_2002Parser;

	/**
	 * @generated
	 */
	private IParser getGuard_2002Parser() {
		if (guard_2002Parser == null) {
			guard_2002Parser = createGuard_2002Parser();
		}
		return guard_2002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGuard_2002Parser() {
		EAttribute[] features = new EAttribute[] { mm_hybrid.MM_HybridPackage.eINSTANCE
				.getGuard_Value(), };
		mm_hybrid.diagram.parsers.MessageFormatParser parser = new mm_hybrid.diagram.parsers.MessageFormatParser(
				features);
		parser.setViewPattern("<<Guard>> {0}");
		parser.setEditorPattern("<<Guard>> {0}");
		parser.setEditPattern("<<Guard>> {0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser targetElementRuleName_element_4002Parser;

	/**
	 * @generated
	 */
	private IParser getTargetElementRuleName_element_4002Parser() {
		if (targetElementRuleName_element_4002Parser == null) {
			targetElementRuleName_element_4002Parser = createTargetElementRuleName_element_4002Parser();
		}
		return targetElementRuleName_element_4002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTargetElementRuleName_element_4002Parser() {
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
			return getRuleName_rule_4003Parser();
		case mm_hybrid.diagram.edit.parts.RuleIsAbstractIsMainEditPart.VISUAL_ID:
			return getRuleIsAbstractIsMain_4004Parser();
		case mm_hybrid.diagram.edit.parts.InMetaModelName_mmEditPart.VISUAL_ID:
			return getInMetaModelName_mm_4005Parser();
		case mm_hybrid.diagram.edit.parts.InMetaModelType_mmEditPart.VISUAL_ID:
			return getInMetaModelType_mm_4006Parser();
		case mm_hybrid.diagram.edit.parts.OutMetaModelName_mmEditPart.VISUAL_ID:
			return getOutMetaModelName_mm_4007Parser();
		case mm_hybrid.diagram.edit.parts.OutMetaModelType_mmEditPart.VISUAL_ID:
			return getOutMetaModelType_mm_4008Parser();
		case mm_hybrid.diagram.edit.parts.SourceElementRuleName_elementEditPart.VISUAL_ID:
			return getSourceElementRuleName_element_4001Parser();
		case mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID:
			return getGuard_2002Parser();
		case mm_hybrid.diagram.edit.parts.TargetElementRuleName_elementEditPart.VISUAL_ID:
			return getTargetElementRuleName_element_4002Parser();
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
