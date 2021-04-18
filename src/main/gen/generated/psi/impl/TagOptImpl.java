// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import generated.psi.Tag;
import generated.psi.TagOpt;
import generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TagOptImpl extends ASTWrapperPsiElement implements TagOpt {

  public TagOptImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitTagOpt(this);
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

}
