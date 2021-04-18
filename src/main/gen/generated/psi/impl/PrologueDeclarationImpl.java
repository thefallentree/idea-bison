// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import generated.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static generated.GeneratedTypes.*;

public class PrologueDeclarationImpl extends ASTWrapperPsiElement implements PrologueDeclaration {

  public PrologueDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitPrologueDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GrammarDeclaration getGrammarDeclaration() {
    return findChildByClass(GrammarDeclaration.class);
  }

  @Override
  @Nullable
  public StringOpt getStringOpt() {
    return findChildByClass(StringOpt.class);
  }

  @Override
  @Nullable
  public Value getValue() {
    return findChildByClass(Value.class);
  }

  @Override
  @Nullable
  public Variable getVariable() {
    return findChildByClass(Variable.class);
  }

  @Override
  @Nullable
  public PsiElement getBracedCode() {
    return findChildByType(BRACED_CODE);
  }

  @Override
  @Nullable
  public PsiElement getPrologue() {
    return findChildByType(PROLOGUE);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

}
