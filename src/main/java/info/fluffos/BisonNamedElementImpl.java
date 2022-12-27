package info.fluffos;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;

import org.jetbrains.annotations.NotNull;

public abstract class BisonNamedElementImpl extends ASTWrapperPsiElement implements BisonNamedElement {

    public BisonNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}