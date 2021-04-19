package info.fluffos;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class BisonTokenType extends IElementType {
    public BisonTokenType(@NonNls @NotNull String debugName) {
        super(debugName, BisonLanguage.INSTANCE);
    }

    public static BisonTokenType directive(@NonNls @NotNull String name) {
        return new BisonTokenType(name);
    }
}
