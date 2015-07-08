package org.eclipse.xtext.parser.fragments.idea.highlighting;

import org.eclipse.xtext.parser.fragments.idea.lang.FragmentTestLanguageLanguage;
import org.eclipse.xtext.idea.highlighting.AbstractColorSettingsPage;

import com.intellij.openapi.options.colors.AttributesDescriptor;

public class FragmentTestLanguageBaseColorSettingsPage extends AbstractColorSettingsPage {
	private AttributesDescriptor[] descriptors;

	public FragmentTestLanguageBaseColorSettingsPage() {
		FragmentTestLanguageLanguage.INSTANCE.injectMembers(this);
	}

	@Override
	public AttributesDescriptor[] getAttributeDescriptors() {
		if (descriptors == null) {
			this.descriptors = new AttributesDescriptor[] {
					createDescriptor("Keywords", FragmentTestLanguageHighlightingConfiguration.KEYWORD),
					createDescriptor("Numbers", FragmentTestLanguageHighlightingConfiguration.NUMBER),
					createDescriptor("Comments", FragmentTestLanguageHighlightingConfiguration.COMMENT),
					createDescriptor("Strings", FragmentTestLanguageHighlightingConfiguration.STRING) };
		}
		return this.descriptors;
	}

	@Override
	public String getDisplayName() {
		return FragmentTestLanguageLanguage.INSTANCE.getDisplayName();
	}
}