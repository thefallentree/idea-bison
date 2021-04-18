package info.fluffos;

import com.intellij.lang.Language;

public class BisonLanguage extends Language {

    public static final BisonLanguage INSTANCE = new BisonLanguage();

    private BisonLanguage() {
        super("Bison");
    }

}