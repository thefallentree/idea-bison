package info.fluffos;


import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import generated.lexer._BisonLexer;

import java.io.IOException;

class BisonLexer implements FlexLexer {

    _BisonLexer impl;
    public BisonLexer(_BisonLexer lexer) {
        this.impl = lexer;
    }

    @Override
    public void yybegin(int state) {
        impl.yybegin(state);
    }

    @Override
    public int yystate() {
        return impl.yystate();
    }

    @Override
    public int getTokenStart() {
        return impl.getTokenStart();
    }

    @Override
    public int getTokenEnd() {
        return impl.getTokenEnd();
    }

    @Override
    public IElementType advance() throws IOException {
        return impl.advance();
    }

    @Override
    public void reset(CharSequence buf, int start, int end, int initialState) {
        impl.reset(buf, start, end, initialState);
    }
}