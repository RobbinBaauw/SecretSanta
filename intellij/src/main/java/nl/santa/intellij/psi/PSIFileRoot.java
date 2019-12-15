package nl.santa.intellij.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import org.antlr.intellij.adaptor.SymtabUtils;
import org.antlr.intellij.adaptor.psi.ScopeNode;
import nl.santa.intellij.Icons;
import nl.santa.intellij.SantaLangFileType;
import nl.santa.intellij.SantaLangLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PSIFileRoot extends PsiFileBase implements ScopeNode {
    public PSIFileRoot(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, SantaLangLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return SantaLangFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Santa Language file";
    }

    @Override
    public Icon getIcon(int flags) {
        return Icons.SAMPLE_ICON;
    }

	/** Return null since a file scope has no enclosing scope. It is
	 *  not itself in a scope.
	 */
	@Override
	public ScopeNode getContext() {
		return null;
	}

	@Nullable
	@Override
	public PsiElement resolve(PsiNamedElement element) {
//		System.out.println(getClass().getSimpleName()+
//		                   ".resolve("+element.getName()+
//		                   " at "+Integer.toHexString(element.hashCode())+")");
		if ( element.getParent() instanceof CallSubtree ) {
			return SymtabUtils.resolve(this, SantaLangLanguage.INSTANCE,
			                           element, "/script/function/ID");
		}
		return SymtabUtils.resolve(this, SantaLangLanguage.INSTANCE,
		                           element, "/script/vardef/ID");
	}
}
