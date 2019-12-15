package nl.santa.intellij.structview;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class StructureViewRootElement extends StructureViewElement {
	public StructureViewRootElement(PsiFile element) {
		super(element);
	}

	@NotNull
	@Override
	public ItemPresentation getPresentation() {
		return new RootPresentation((PsiFile)element);
	}
}
