// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

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
  public List<Symbol> getSymbolList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Symbol.class);
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
