package info.fluffos;

import com.intellij.ide.structureView.*;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import generated.psi.Rules;
import generated.psi.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BisonFileStructureViewModel extends StructureViewModelBase implements
        StructureViewModel.ElementInfoProvider {

    public BisonFileStructureViewModel(@Nullable Editor editor, PsiFile psiFile) {
        super(psiFile, editor, new BisonStructureViewElement(psiFile));
    }

    @NotNull
    public Sorter @NotNull [] getSorters() {
        return new Sorter[]{Sorter.ALPHA_SORTER};
    }


    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return element.getValue() instanceof Rules;
    }

    @Override
    protected Class<?> @NotNull [] getSuitableClasses() {
        return new Class[]{Rules.class};
    }
}