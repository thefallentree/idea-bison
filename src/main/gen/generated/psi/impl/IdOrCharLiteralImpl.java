// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import generated.psi.IdOrCharLiteral;
import generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static generated.GeneratedTypes.CHAR_LITERAL;
import static generated.GeneratedTypes.ID;

public class IdOrCharLiteralImpl extends ASTWrapperPsiElement implements IdOrCharLiteral {

  public IdOrCharLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitIdOrCharLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getCharLiteral() {
    return findChildByType(CHAR_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

}
