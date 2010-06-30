/*
 * 
 */
package mm_hybrid.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class RuleEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public RuleEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy() {
					public Command getCommand(Request request) {
						if (understandsRequest(request)) {
							if (request instanceof CreateViewAndElementRequest) {
								CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
										.getViewAndElementDescriptor()
										.getCreateElementRequestAdapter();
								IElementType type = (IElementType) adapter
										.getAdapter(IElementType.class);
								if (type == mm_hybrid.diagram.providers.MM_HybridElementTypes.SourceElementRule_3001) {
									EditPart compartmentEditPart = getChildBySemanticHint(mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
											.getType(mm_hybrid.diagram.edit.parts.RuleSourceEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
								if (type == mm_hybrid.diagram.providers.MM_HybridElementTypes.TargetElementRule_3003) {
									EditPart compartmentEditPart = getChildBySemanticHint(mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
											.getType(mm_hybrid.diagram.edit.parts.RuleTargetEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
							}
							return super.getCommand(request);
						}
						return null;
					}
				});
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new mm_hybrid.diagram.edit.policies.RuleItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new mm_hybrid.diagram.edit.policies.MM_HybridTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		RuleFigure figure = new RuleFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public RuleFigure getPrimaryShape() {
		return (RuleFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof mm_hybrid.diagram.edit.parts.RuleName_ruleEditPart) {
			((mm_hybrid.diagram.edit.parts.RuleName_ruleEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureRuleLabelFigure());
			return true;
		}
		if (childEditPart instanceof mm_hybrid.diagram.edit.parts.RuleIsAbstractIsMainEditPart) {
			((mm_hybrid.diagram.edit.parts.RuleIsAbstractIsMainEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureValuesLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {

		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode()
				.DPtoLP(300), getMapMode().DPtoLP(200));
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
				.getType(mm_hybrid.diagram.edit.parts.RuleName_ruleEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class RuleFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRuleLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureValuesLabel;

		/**
		 * @generated
		 */
		public RuleFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutThis.setSpacing(0);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setLineWidth(2);
			this.setForegroundColor(THIS_FORE);
			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(300),
					getMapMode().DPtoLP(200)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrappingLabel ruleLabel0 = new WrappingLabel();
			ruleLabel0.setAlignment(PositionConstants.CENTER);
			ruleLabel0.setText("<<Rule>>");

			ruleLabel0.setFont(RULELABEL0_FONT);

			this.add(ruleLabel0);

			fFigureRuleLabelFigure = new WrappingLabel();
			fFigureRuleLabelFigure.setAlignment(PositionConstants.CENTER);
			fFigureRuleLabelFigure.setText("<...>");

			this.add(fFigureRuleLabelFigure);

			fFigureValuesLabel = new WrappingLabel();
			fFigureValuesLabel.setAlignment(PositionConstants.CENTER);
			fFigureValuesLabel.setText("");

			fFigureValuesLabel.setFont(FFIGUREVALUESLABEL_FONT);

			this.add(fFigureValuesLabel);

			RectangleFigure source0 = new RectangleFigure();

			this.add(source0);
			source0.setLayoutManager(new StackLayout());

			RectangleFigure target0 = new RectangleFigure();

			this.add(target0);
			target0.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRuleLabelFigure() {
			return fFigureRuleLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureValuesLabel() {
			return fFigureValuesLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 204, 153, 0);

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 253, 229, 141);

	/**
	 * @generated
	 */
	static final Font RULELABEL0_FONT = new Font(Display.getCurrent(), Display
			.getDefault().getSystemFont().getFontData()[0].getName(), 8,
			SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FFIGUREVALUESLABEL_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 8,
			SWT.NORMAL);

}
