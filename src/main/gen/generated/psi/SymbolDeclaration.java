// This is a generated file. Not intended for manual editing.
package generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface SymbolDeclaration extends PsiElement {

  @NotNull
  List<Tag> getTagList();

  @Nullable
  NtermDecls getNtermDecls();

  @Nullable
  PrecedenceDeclarator getPrecedenceDeclarator();

  @NotNull
  List<Symbols1> getSymbols1List();

  @NotNull
  List<TokenDeclForPrec1> getTokenDeclForPrec1List();

  @Nullable
  TokenDecls getTokenDecls();

}
