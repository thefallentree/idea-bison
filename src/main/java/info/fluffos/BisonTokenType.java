package info.fluffos;

import com.google.common.collect.Maps;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class BisonTokenType extends IElementType {
    private static final Map<String, BisonDirective> directive_map = Maps.newHashMap();
    private static final Map<String, BisonTokenType> token_map = Maps.newHashMap();

    public BisonTokenType(@NonNls @NotNull String debugName) {
        super(debugName, BisonLanguage.INSTANCE);
    }

    public static class BisonDirective extends BisonTokenType {
        public BisonDirective(@NotNull String debugName) {
            super(debugName);
        }
    }

    public static BisonTokenType token(@NonNls @NotNull String name) {
        token_map.computeIfAbsent(name, BisonTokenType::new);
        return token_map.get(name);
    }

    public static BisonTokenType directive(@NonNls @NotNull String name) {
        directive_map.computeIfAbsent(name, BisonDirective::new);
        return directive_map.get(name);
    }
}
