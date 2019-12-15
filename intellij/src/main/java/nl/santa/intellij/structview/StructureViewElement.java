package nl.santa.intellij.structview;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.NavigationItem;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import org.antlr.intellij.adaptor.xpath.XPath;
import nl.santa.intellij.SantaLangLanguage;
import nl.santa.intellij.psi.PSIFileRoot;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StructureViewElement implements StructureViewTreeElement, SortableTreeElement {
	protected final PsiElement element;

	public StructureViewElement(PsiElement element) {
		this.element = element;
	}

	@Override
	public Object getValue() {
		return element;
	}

	@Override
	public void navigate(boolean requestFocus) {
		if (element instanceof NavigationItem ) {
			((NavigationItem) element).navigate(requestFocus);
		}
	}

	@Override
	public boolean canNavigate() {
		return element instanceof NavigationItem &&
			   ((NavigationItem)element).canNavigate();
	}

	@Override
	public boolean canNavigateToSource() {
		return element instanceof NavigationItem &&
			   ((NavigationItem)element).canNavigateToSource();
	}

	@NotNull
	@Override
	public String getAlphaSortKey() {
		String s = element instanceof PsiNamedElement ? ((PsiNamedElement) element).getName() : null;
		if ( s==null ) return "unknown key";
		return s;
	}

	@NotNull
	@Override
	public com.intellij.navigation.ItemPresentation getPresentation() {
		return new ItemPresentation(element);
	}

	@NotNull
	@Override
	public TreeElement[] getChildren() {
		if ( element instanceof PSIFileRoot) {
			Collection<? extends PsiElement> funcs = XPath.findAll(SantaLangLanguage.INSTANCE, element, "/script/function/ID");
			List<TreeElement> treeElements = new ArrayList<>(funcs.size());
			for (PsiElement el : funcs) {
				treeElements.add(new StructureViewElement(el));
			}
			return treeElements.toArray(new TreeElement[funcs.size()]);
		}
		return new TreeElement[0];
	}
}
