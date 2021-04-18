// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import generated.psi.Symbol;
import generated.psi.Symbols1;
import generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Symbols1Impl extends ASTWrapperPsiElement implements Symbols1 {

  public Symbols1Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitSymbols1(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Symbol> getSymbolList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Symbol.class);
  }

}
