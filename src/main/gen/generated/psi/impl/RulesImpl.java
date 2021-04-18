// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import generated.psi.NamedRefOpt;
import generated.psi.Rhs;
import generated.psi.Rules;
import generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static generated.GeneratedTypes.ID;

public class RulesImpl extends ASTWrapperPsiElement implements Rules {

  public RulesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitRules(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NamedRefOpt getNamedRefOpt() {
    return findNotNullChildByClass(NamedRefOpt.class);
  }

  @Override
  @NotNull
  public List<Rhs> getRhsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Rhs.class);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(ID);
  }

}
