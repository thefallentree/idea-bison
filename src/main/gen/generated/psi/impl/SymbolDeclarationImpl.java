// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import generated.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SymbolDeclarationImpl extends ASTWrapperPsiElement implements SymbolDeclaration {

  public SymbolDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitSymbolDeclaration(this);
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
  @Nullable
  public NtermDecls getNtermDecls() {
    return findChildByClass(NtermDecls.class);
  }

  @Override
  @Nullable
  public PrecedenceDeclarator getPrecedenceDeclarator() {
    return findChildByClass(PrecedenceDeclarator.class);
  }

  @Override
  @NotNull
  public List<Symbols1> getSymbols1List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Symbols1.class);
  }

  @Override
  @NotNull
  public List<TokenDeclForPrec1> getTokenDeclForPrec1List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TokenDeclForPrec1.class);
  }

  @Override
  @Nullable
  public TokenDecls getTokenDecls() {
    return findChildByClass(TokenDecls.class);
  }

}
