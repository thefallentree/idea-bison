// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import generated.psi.IdOrCharLiteral;
import generated.psi.Variable;
import generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;

public class VariableImpl extends ASTWrapperPsiElement implements Variable {

  public VariableImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitVariable(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public IdOrCharLiteral getIdOrCharLiteral() {
    return findNotNullChildByClass(IdOrCharLiteral.class);
  }

}
