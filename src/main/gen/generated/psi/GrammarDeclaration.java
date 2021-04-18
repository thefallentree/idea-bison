// This is a generated file. Not intended for manual editing.
package generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface GrammarDeclaration extends PsiElement {

  @Nullable
  IdOrCharLiteral getIdOrCharLiteral();

  @Nullable
  CodePropsType getCodePropsType();

  @NotNull
  List<GenericSymlistItem> getGenericSymlistItemList();

  @Nullable
  SymbolDeclaration getSymbolDeclaration();

  @Nullable
  Symbols1 getSymbols1();

  @Nullable
  UnionName getUnionName();

}
