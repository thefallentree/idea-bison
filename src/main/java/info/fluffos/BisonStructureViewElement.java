package info.fluffos;

import com.intellij.ide.projectView.PresentationData;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.NavigatablePsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import generated.GeneratedTypes;
import generated.psi.Rhs;
import generated.psi.Rules;
import generated.psi.RulesOrGrammarDeclaration;
import generated.psi.Symbol;
import generated.psi.impl.RulesImpl;
import generated.psi.impl.SymbolImpl;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class BisonStructureViewElement implements StructureViewTreeElement, SortableTreeElement {

    private final NavigatablePsiElement myElement;

    public BisonStructureViewElement(NavigatablePsiElement element) {
        this.myElement = element;
    }

    @Override
    public Object getValue() {
        return myElement;
    }

    @Override
    public void navigate(boolean requestFocus) {
        myElement.navigate(requestFocus);
    }

    @Override
    public boolean canNavigate() {
        return myElement.canNavigate();
    }

    @Override
    public boolean canNavigateToSource() {
        return myElement.canNavigateToSource();
    }

    @NotNull
    @Override
    public String getAlphaSortKey() {
        String name = myElement.getName();
        return name != null ? name : "";
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        ItemPresentation presentation = myElement.getPresentation();
        return presentation != null ? presentation : new PresentationData();
    }

    @Override
    public TreeElement @NotNull [] getChildren() {
        if (myElement instanceof BisonFile) {
            List<RulesOrGrammarDeclaration> children = PsiTreeUtil.getChildrenOfTypeAsList(myElement, RulesOrGrammarDeclaration.class);
            List<TreeElement> treeElements = new ArrayList<>(children.size());
            for (RulesOrGrammarDeclaration item : children) {
                if (item.getRules() != null) {
                    treeElements.add(new BisonStructureViewElement((RulesImpl) item.getRules()));
                }
            }
            return treeElements.toArray(new TreeElement[0]);
        }
        return EMPTY_ARRAY;
    }

}