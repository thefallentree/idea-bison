// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import generated.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TokenDeclForPrecImpl extends ASTWrapperPsiElement implements TokenDeclForPrec {

  public TokenDeclForPrecImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitTokenDeclForPrec(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdOrCharLiteral getIdOrCharLiteral() {
    return findChildByClass(IdOrCharLiteral.class);
  }

  @Override
  @Nullable
  public IntOpt getIntOpt() {
    return findChildByClass(IntOpt.class);
  }

  @Override
  @Nullable
  public StringAsId getStringAsId() {
    return findChildByClass(StringAsId.class);
  }

}
