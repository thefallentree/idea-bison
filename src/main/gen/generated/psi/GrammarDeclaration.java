// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GrammarDeclaration extends PsiElement {

  @Nullable
  IdOrCharLiteral getIdOrCharLiteral();

  @Nullable
  BracedCode getBracedCode();

  @Nullable
  CodePropsType getCodePropsType();

  @NotNull
  List<GenericSymlistItem> getGenericSymlistItemList();

  @NotNull
  List<Symbol> getSymbolList();

  @Nullable
  SymbolDeclaration getSymbolDeclaration();

  @Nullable
  UnionName getUnionName();

}
