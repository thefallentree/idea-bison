// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import info.fluffos.BisonNamedElement;
import com.intellij.navigation.ItemPresentation;

public interface Rules extends BisonNamedElement {

  @NotNull
  List<Rhs> getRhsList();

  @NotNull
  PsiElement getIdColon();

  //WARNING: getKey(...) is skipped
  //matching getKey(Rules, ...)
  //methods are not found in BisonPsiImplUtil

  //WARNING: getValue(...) is skipped
  //matching getValue(Rules, ...)
  //methods are not found in BisonPsiImplUtil

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
