// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import generated.psi.GenericSymlistItem;
import generated.psi.Symbol;
import generated.psi.Tag;
import generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GenericSymlistItemImpl extends ASTWrapperPsiElement implements GenericSymlistItem {

  public GenericSymlistItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitGenericSymlistItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Tag getTag() {
    return findChildByClass(Tag.class);
  }

  @Override
  @Nullable
  public Symbol getSymbol() {
    return findChildByClass(Symbol.class);
  }

}
