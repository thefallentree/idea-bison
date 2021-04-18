// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import generated.psi.IdOrCharLiteral;
import generated.psi.StringAsId;
import generated.psi.Symbol;
import generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SymbolImpl extends ASTWrapperPsiElement implements Symbol {

  public SymbolImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitSymbol(this);
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
  public StringAsId getStringAsId() {
    return findChildByClass(StringAsId.class);
  }

}
