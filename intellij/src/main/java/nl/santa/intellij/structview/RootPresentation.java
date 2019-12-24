package nl.santa.intellij.structview;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import nl.santa.intellij.Icons;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RootPresentation implements ItemPresentation {
	protected final PsiFile element;

	protected RootPresentation(PsiFile element) {
		this.element = element;
	}

	@Nullable
	@Override
	public Icon getIcon(boolean unused) {
		return Icons.SANTA_ICON;
	}

	@Nullable
	@Override
	public String getPresentableText() {
		return element.getVirtualFile().getNameWithoutExtension();
	}

	@Nullable
	@Override
	public String getLocationString() {
		return null;
	}
}
