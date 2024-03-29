// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import info.fluffos.BisonNamedElementImpl;
import generated.psi.*;
import info.fluffos.BisonPsiImplUtil;
import com.intellij.navigation.ItemPresentation;

public class RulesImpl extends BisonNamedElementImpl implements Rules {

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
  public List<Rhs> getRhsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Rhs.class);
  }

  @Override
  @NotNull
  public PsiElement getIdColon() {
    return findNotNullChildByType(ID_COLON);
  }

  @Override
  public String getName() {
    return BisonPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return BisonPsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return BisonPsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return BisonPsiImplUtil.getPresentation(this);
  }

}
