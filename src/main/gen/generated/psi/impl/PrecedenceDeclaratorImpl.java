// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import generated.psi.PrecedenceDeclarator;
import generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;

public class PrecedenceDeclaratorImpl extends ASTWrapperPsiElement implements PrecedenceDeclarator {

  public PrecedenceDeclaratorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitPrecedenceDeclarator(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

}
