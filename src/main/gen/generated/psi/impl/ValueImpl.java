// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import generated.psi.IdOrCharLiteral;
import generated.psi.Value;
import generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static generated.GeneratedTypes.BRACED_CODE;
import static generated.GeneratedTypes.STRING;

public class ValueImpl extends ASTWrapperPsiElement implements Value {

  public ValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitValue(this);
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
  public PsiElement getBracedCode() {
    return findChildByType(BRACED_CODE);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

}
