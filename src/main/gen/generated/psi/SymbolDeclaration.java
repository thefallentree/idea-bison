// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SymbolDeclaration extends PsiElement {

  @NotNull
  List<Tag> getTagList();

  @Nullable
  NtermDecls getNtermDecls();

  @Nullable
  PrecedenceDeclarator getPrecedenceDeclarator();

  @NotNull
  List<Symbol> getSymbolList();

  @NotNull
  List<TokenDeclForPrec1> getTokenDeclForPrec1List();

  @Nullable
  TokenDecls getTokenDecls();

}
