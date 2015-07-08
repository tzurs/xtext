package org.eclipse.xtext.parser.fragments.idea.lang.parser;

import org.eclipse.xtext.psi.impl.PsiEObjectReference;
import org.eclipse.xtext.parser.fragments.idea.lang.FragmentTestLanguageExElementTypeProvider;
import org.eclipse.xtext.parser.fragments.idea.lang.psi.impl.FragmentTestLanguageExFileImpl;
import org.eclipse.xtext.idea.parser.AbstractXtextParserDefinition;
import org.eclipse.xtext.psi.impl.PsiNamedEObjectImpl;

import com.google.inject.Inject;
import com.intellij.lang.ASTNode;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;

public class FragmentTestLanguageExParserDefinition extends AbstractXtextParserDefinition {

	@Inject 
	private FragmentTestLanguageExElementTypeProvider elementTypeProvider;

	@Override
	public PsiFile createFile(FileViewProvider viewProvider) {
		return new FragmentTestLanguageExFileImpl(viewProvider);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public PsiElement createElement(ASTNode node) {
		IElementType elementType = node.getElementType();
		if (elementType == elementTypeProvider.getFragments_ElementNamedWithActionParserRuleCall_1_3_1_0ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getNamedWithAction_NameIDTerminalRuleCall_2_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getNamedWithAction_NamedWithActionPrevAction_1ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getNamedWithAction_NameIDTerminalRuleCall_2_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getFragments_ElementNamedWithActionInFragment2ParserRuleCall_1_5_1_0ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getNamedWithActionInFragment2_NameIDTerminalRuleCall_0_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getNamedWithActionInFragment_FragmentWithActionParserRuleCall_0ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getFragmentWithAction_NameIDTerminalRuleCall_0_0ElementType(),
				elementTypeProvider.getFragmentWithAction_NameIDTerminalRuleCall_2_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getFragmentWithAction_NamedWithActionPrevAction_1ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getFragmentWithAction_NameIDTerminalRuleCall_0_0ElementType(),
				elementTypeProvider.getFragmentWithAction_NameIDTerminalRuleCall_2_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getNamedWithActionInFragment2_FragmentWithAction2ParserRuleCall_1ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getFragmentWithAction2_NameIDTerminalRuleCall_1_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getFragmentWithAction2_NamedWithActionPrevAction_0ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getFragmentWithAction2_NameIDTerminalRuleCall_1_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getNamedWithActionInFragment3_FragmentWithAction3ParserRuleCall_0ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getFragmentWithAction3_NameIDTerminalRuleCall_0_0ElementType(),
				elementTypeProvider.getFragmentWithAction3_NameIDTerminalRuleCall_1_2_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getFragmentWithAction3_NamedWithActionPrevAction_1_0ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getFragmentWithAction3_NameIDTerminalRuleCall_0_0ElementType(),
				elementTypeProvider.getFragmentWithAction3_NameIDTerminalRuleCall_1_2_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getNamed_NamedFragmentParserRuleCall_0ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getNamedFragment_NameIDTerminalRuleCall_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getNamedRefFirst_NamedFragmentParserRuleCall_2ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getNamedFragment_NameIDTerminalRuleCall_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getFragments_RefNamedCrossReference_1_1_3_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		if (elementType == elementTypeProvider.getNamed_RefNamedCrossReference_1_0_1_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		if (elementType == elementTypeProvider.getNamedRefFirst_RefNamedCrossReference_0_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		if (elementType == elementTypeProvider.getNamedWithAction_RefNamedCrossReference_3_0_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		if (elementType == elementTypeProvider.getNamedWithAction_Ref2NamedCrossReference_3_1_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		if (elementType == elementTypeProvider.getNamedWithActionInFragment_RefNamedCrossReference_1_1_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		if (elementType == elementTypeProvider.getNamedWithActionInFragment2_RefNamedCrossReference_2_1_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		if (elementType == elementTypeProvider.getNamedWithActionInFragment3_RefNamedCrossReference_1_1_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		if (elementType == elementTypeProvider.getFragmentWithAction_Ref2NamedCrossReference_3_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		if (elementType == elementTypeProvider.getFragmentWithAction2_Ref2NamedCrossReference_2_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		if (elementType == elementTypeProvider.getFragmentWithAction3_Ref2NamedCrossReference_1_3_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		if (elementType == elementTypeProvider.getNamedRef_RefNamedCrossReference_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		return super.createElement(node);
	}

}
