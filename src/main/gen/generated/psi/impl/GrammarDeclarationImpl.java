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
  public BracedCode getBracedCode() {
    return findChildByClass(BracedCode.class);
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
  @NotNull
  public List<Symbol> getSymbolList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Symbol.class);
  }

  @Override
  @Nullable
  public SymbolDeclaration getSymbolDeclaration() {
    return findChildByClass(SymbolDeclaration.class);
  }

  @Override
  @Nullable
  public UnionName getUnionName() {
    return findChildByClass(UnionName.class);
  }

}
