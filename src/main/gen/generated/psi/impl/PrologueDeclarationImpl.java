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
import info.fluffos.BisonPsiImplUtil;

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
  public BracedCode getBracedCode() {
    return findChildByClass(BracedCode.class);
  }

  @Override
  @Nullable
  public GrammarDeclaration getGrammarDeclaration() {
    return findChildByClass(GrammarDeclaration.class);
  }

  @Override
  @Nullable
  public Prologue getPrologue() {
    return findChildByClass(Prologue.class);
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
  public PsiElement getIntLiteral() {
    return findChildByType(INT_LITERAL);
  }

}
