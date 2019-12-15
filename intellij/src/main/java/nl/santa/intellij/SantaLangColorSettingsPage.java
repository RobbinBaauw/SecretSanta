package nl.santa.intellij;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class SantaLangColorSettingsPage implements ColorSettingsPage {
	private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
		new AttributesDescriptor("Identifier", SantaLangSyntaxHighlighter.ID),
		new AttributesDescriptor("Keyword", SantaLangSyntaxHighlighter.KEYWORD),
		new AttributesDescriptor("String", SantaLangSyntaxHighlighter.STRING),
		new AttributesDescriptor("Line comment", SantaLangSyntaxHighlighter.LINE_COMMENT),
		new AttributesDescriptor("Block comment", SantaLangSyntaxHighlighter.BLOCK_COMMENT),
	};

	@Nullable
	@Override
	public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
		return null;
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return Icons.SAMPLE_ICON;
	}

	@NotNull
	@Override
	public SyntaxHighlighter getHighlighter() {
		return new SantaLangSyntaxHighlighter();
	}

	@NotNull
	@Override
	public String getDemoText() {
		return
			"/* block comment */\n"+
			"func f(a:[]) {\n"+
			"   // line comment\n"+
			"   var i = 1\n" +
			"   while (i < len(a)) {\n" +
			"       print(a[i])\n" +
			"   }\n" +
			"   g(\"hi mom\")\n" +
			"}\n" +
			"func g(c:string) { }\n";
	}

	@NotNull
	@Override
	public AttributesDescriptor[] getAttributeDescriptors() {
		return DESCRIPTORS;
	}

	@NotNull
	@Override
	public ColorDescriptor[] getColorDescriptors() {
		return ColorDescriptor.EMPTY_ARRAY;
	}

	@NotNull
	@Override
	public String getDisplayName() {
		return "Sample";
	}
}
