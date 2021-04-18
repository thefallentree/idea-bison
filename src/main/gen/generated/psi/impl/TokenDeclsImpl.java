// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import generated.psi.Tag;
import generated.psi.TokenDecl1;
import generated.psi.TokenDecls;
import generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TokenDeclsImpl extends ASTWrapperPsiElement implements TokenDecls {

  public TokenDeclsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitTokenDecls(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Tag> getTagList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Tag.class);
  }

  @Override
  @NotNull
  public List<TokenDecl1> getTokenDecl1List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TokenDecl1.class);
  }

}
