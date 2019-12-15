package nl.santa.intellij.structview;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import nl.santa.intellij.psi.PSIFileRoot;
import org.jetbrains.annotations.NotNull;

public class StructureViewModel
	extends StructureViewModelBase
	implements com.intellij.ide.structureView.StructureViewModel.ElementInfoProvider
{
	public StructureViewModel(PSIFileRoot root) {
		super(root, new StructureViewRootElement(root));
	}

	@NotNull
	public Sorter[] getSorters() {
		return new Sorter[] {Sorter.ALPHA_SORTER};
	}

	@Override
	public boolean isAlwaysLeaf(StructureViewTreeElement element) {
  		return !isAlwaysShowsPlus(element);
	}

	@Override
	public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
		Object value = element.getValue();
  		return value instanceof PSIFileRoot;
	}
}
