/*
 * 
 */
package mm_hybrid.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class MM_HybridEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getVisualID(view)) {

			case mm_hybrid.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.ModuleEditPart(view);

			case mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.RuleEditPart(view);

			case mm_hybrid.diagram.edit.parts.RuleName_ruleEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.RuleName_ruleEditPart(
						view);

			case mm_hybrid.diagram.edit.parts.RuleIsAbstractIsMainEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.RuleIsAbstractIsMainEditPart(
						view);

			case mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.InMetaModelEditPart(
						view);

			case mm_hybrid.diagram.edit.parts.InMetaModelName_mmEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.InMetaModelName_mmEditPart(
						view);

			case mm_hybrid.diagram.edit.parts.InMetaModelType_mmEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.InMetaModelType_mmEditPart(
						view);

			case mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.OutMetaModelEditPart(
						view);

			case mm_hybrid.diagram.edit.parts.OutMetaModelName_mmEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.OutMetaModelName_mmEditPart(
						view);

			case mm_hybrid.diagram.edit.parts.OutMetaModelType_mmEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.OutMetaModelType_mmEditPart(
						view);

			case mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart(
						view);

			case mm_hybrid.diagram.edit.parts.SourceElementRuleName_elementEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.SourceElementRuleName_elementEditPart(
						view);

			case mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.ConditionEditPart(view);

			case mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart(
						view);

			case mm_hybrid.diagram.edit.parts.TargetElementRuleName_elementEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.TargetElementRuleName_elementEditPart(
						view);

			case mm_hybrid.diagram.edit.parts.RuleSourceEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.RuleSourceEditPart(view);

			case mm_hybrid.diagram.edit.parts.RuleTargetEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.RuleTargetEditPart(view);

			case mm_hybrid.diagram.edit.parts.SourceElementRuleConditionEditPart.VISUAL_ID:
				return new mm_hybrid.diagram.edit.parts.SourceElementRuleConditionEditPart(
						view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
