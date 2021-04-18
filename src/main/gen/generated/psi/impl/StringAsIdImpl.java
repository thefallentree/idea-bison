// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import generated.psi.StringAsId;
import generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;

import static generated.GeneratedTypes.STRING;

public class StringAsIdImpl extends ASTWrapperPsiElement implements StringAsId {

  public StringAsIdImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitStringAsId(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getString() {
    return findNotNullChildByType(STRING);
  }

}
