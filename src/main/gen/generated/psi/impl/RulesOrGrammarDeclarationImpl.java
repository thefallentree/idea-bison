// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import generated.psi.GrammarDeclaration;
import generated.psi.Rules;
import generated.psi.RulesOrGrammarDeclaration;
import generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RulesOrGrammarDeclarationImpl extends ASTWrapperPsiElement implements RulesOrGrammarDeclaration {

  public RulesOrGrammarDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitRulesOrGrammarDeclaration(this);
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
  public Rules getRules() {
    return findChildByClass(Rules.class);
  }

}
