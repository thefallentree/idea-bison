// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import generated.psi.TokenDecl;
import generated.psi.TokenDecl1;
import generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TokenDecl1Impl extends ASTWrapperPsiElement implements TokenDecl1 {

  public TokenDecl1Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitTokenDecl1(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TokenDecl> getTokenDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TokenDecl.class);
  }

}
