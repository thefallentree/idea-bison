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

public class GrammarDeclarationImpl extends ASTWrapperPsiElement implements GrammarDeclaration {

  public GrammarDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitGrammarDeclaration(this);
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
  public CodePropsType getCodePropsType() {
    return findChildByClass(CodePropsType.class);
  }

  @Override
  @NotNull
  public List<GenericSymlistItem> getGenericSymlistItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GenericSymlistItem.class);
  }

  @Override
  @Nullable
  public SymbolDeclaration getSymbolDeclaration() {
    return findChildByClass(SymbolDeclaration.class);
  }

  @Override
  @Nullable
  public Symbols1 getSymbols1() {
    return findChildByClass(Symbols1.class);
  }

  @Override
  @Nullable
  public UnionName getUnionName() {
    return findChildByClass(UnionName.class);
  }

}
