/*
 * 
 */
package mm_hybrid.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		mm_hybrid.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		mm_hybrid.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		mm_hybrid.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		mm_hybrid.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		mm_hybrid.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);
	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return mm_hybrid.diagram.part.MM_HybridDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
