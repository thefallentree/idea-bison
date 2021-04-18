// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import generated.psi.*;
import org.jetbrains.annotations.NotNull;

public class TokenDeclImpl extends ASTWrapperPsiElement implements TokenDecl {

  public TokenDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitTokenDecl(this);
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

  @Override
  @NotNull
  public Alias getAlias() {
    return findNotNullChildByClass(Alias.class);
  }

  @Override
  @NotNull
  public IntOpt getIntOpt() {
    return findNotNullChildByClass(IntOpt.class);
  }

}
