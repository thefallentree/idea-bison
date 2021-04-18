package info.fluffos;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class BisonCompositeElementType extends IElementType {
    public BisonCompositeElementType(@NonNls @NotNull String debugName) {
        super(debugName, BisonLanguage.INSTANCE);
    }
}
