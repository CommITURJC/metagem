/*
 * 
 */
package mm_hybrid.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class MM_HybridPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createMetaModels1Group());
		paletteRoot.add(createRules2Group());
	}

	/**
	 * Creates "MetaModels" palette tool group
	 * @generated
	 */
	private PaletteContainer createMetaModels1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				mm_hybrid.diagram.part.Messages.MetaModels1Group_title);
		paletteContainer.add(createInMetaModel1CreationTool());
		paletteContainer.add(createOutMetaModel2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Rules" palette tool group
	 * @generated
	 */
	private PaletteContainer createRules2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				mm_hybrid.diagram.part.Messages.Rules2Group_title);
		paletteContainer.add(createRule1CreationTool());
		paletteContainer.add(createSourceElementRule2CreationTool());
		paletteContainer.add(createTargetElementRule3CreationTool());
		paletteContainer.add(createCondition4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInMetaModel1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(mm_hybrid.diagram.providers.MM_HybridElementTypes.InMetaModel_1002);
		NodeToolEntry entry = new NodeToolEntry(
				mm_hybrid.diagram.part.Messages.InMetaModel1CreationTool_title,
				mm_hybrid.diagram.part.Messages.InMetaModel1CreationTool_desc,
				types);
		entry
				.setSmallIcon(mm_hybrid.diagram.providers.MM_HybridElementTypes
						.getImageDescriptor(mm_hybrid.diagram.providers.MM_HybridElementTypes.InMetaModel_1002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutMetaModel2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(mm_hybrid.diagram.providers.MM_HybridElementTypes.OutMetaModel_1003);
		NodeToolEntry entry = new NodeToolEntry(
				mm_hybrid.diagram.part.Messages.OutMetaModel2CreationTool_title,
				mm_hybrid.diagram.part.Messages.OutMetaModel2CreationTool_desc,
				types);
		entry
				.setSmallIcon(mm_hybrid.diagram.providers.MM_HybridElementTypes
						.getImageDescriptor(mm_hybrid.diagram.providers.MM_HybridElementTypes.OutMetaModel_1003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRule1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(mm_hybrid.diagram.providers.MM_HybridElementTypes.Rule_1001);
		NodeToolEntry entry = new NodeToolEntry(
				mm_hybrid.diagram.part.Messages.Rule1CreationTool_title,
				mm_hybrid.diagram.part.Messages.Rule1CreationTool_desc, types);
		entry
				.setSmallIcon(mm_hybrid.diagram.providers.MM_HybridElementTypes
						.getImageDescriptor(mm_hybrid.diagram.providers.MM_HybridElementTypes.Rule_1001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSourceElementRule2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(mm_hybrid.diagram.providers.MM_HybridElementTypes.SourceElementRule_2001);
		NodeToolEntry entry = new NodeToolEntry(
				mm_hybrid.diagram.part.Messages.SourceElementRule2CreationTool_title,
				mm_hybrid.diagram.part.Messages.SourceElementRule2CreationTool_desc,
				types);
		entry
				.setSmallIcon(mm_hybrid.diagram.providers.MM_HybridElementTypes
						.getImageDescriptor(mm_hybrid.diagram.providers.MM_HybridElementTypes.SourceElementRule_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTargetElementRule3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(mm_hybrid.diagram.providers.MM_HybridElementTypes.TargetElementRule_2003);
		NodeToolEntry entry = new NodeToolEntry(
				mm_hybrid.diagram.part.Messages.TargetElementRule3CreationTool_title,
				mm_hybrid.diagram.part.Messages.TargetElementRule3CreationTool_desc,
				types);
		entry
				.setSmallIcon(mm_hybrid.diagram.providers.MM_HybridElementTypes
						.getImageDescriptor(mm_hybrid.diagram.providers.MM_HybridElementTypes.TargetElementRule_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCondition4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(mm_hybrid.diagram.providers.MM_HybridElementTypes.Condition_2002);
		NodeToolEntry entry = new NodeToolEntry(
				mm_hybrid.diagram.part.Messages.Condition4CreationTool_title,
				mm_hybrid.diagram.part.Messages.Condition4CreationTool_desc,
				types);
		entry
				.setSmallIcon(mm_hybrid.diagram.providers.MM_HybridElementTypes
						.getImageDescriptor(mm_hybrid.diagram.providers.MM_HybridElementTypes.Condition_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
