// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package info.fluffos;

import com.intellij.lexer.FlexAdapter;
import generated.lexer._BisonLexer;

public class BisonLexerAdapter extends FlexAdapter {
    public BisonLexerAdapter() {
        super(new BisonLexer(new _BisonLexer()));
    }

}