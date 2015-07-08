package org.eclipse.xtext.parser.fragments.idea.highlighting;

import org.eclipse.xtext.parser.fragments.idea.lang.FragmentTestLanguageExLanguage;
import org.eclipse.xtext.idea.highlighting.AbstractColorSettingsPage;

import com.intellij.openapi.options.colors.AttributesDescriptor;

public class FragmentTestLanguageExBaseColorSettingsPage extends AbstractColorSettingsPage {
	private AttributesDescriptor[] descriptors;

	public FragmentTestLanguageExBaseColorSettingsPage() {
		FragmentTestLanguageExLanguage.INSTANCE.injectMembers(this);
	}

	@Override
	public AttributesDescriptor[] getAttributeDescriptors() {
		if (descriptors == null) {
			this.descriptors = new AttributesDescriptor[] {
					createDescriptor("Keywords", FragmentTestLanguageExHighlightingConfiguration.KEYWORD),
					createDescriptor("Numbers", FragmentTestLanguageExHighlightingConfiguration.NUMBER),
					createDescriptor("Comments", FragmentTestLanguageExHighlightingConfiguration.COMMENT),
					createDescriptor("Strings", FragmentTestLanguageExHighlightingConfiguration.STRING) };
		}
		return this.descriptors;
	}

	@Override
	public String getDisplayName() {
		return FragmentTestLanguageExLanguage.INSTANCE.getDisplayName();
	}
}