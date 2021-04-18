// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import generated.psi.TokenDeclForPrec;
import generated.psi.TokenDeclForPrec1;
import generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TokenDeclForPrec1Impl extends ASTWrapperPsiElement implements TokenDeclForPrec1 {

  public TokenDeclForPrec1Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitTokenDeclForPrec1(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TokenDeclForPrec> getTokenDeclForPrecList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TokenDeclForPrec.class);
  }

}
