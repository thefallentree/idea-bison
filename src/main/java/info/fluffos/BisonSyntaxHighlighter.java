// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package info.fluffos;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import generated.GeneratedTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class BisonSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("BISON_ID", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey DIRECTIVE =
            createTextAttributesKey("BISON_DIRECTIVE", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey LINE_COMMENT =
            createTextAttributesKey("BISON_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT =
            createTextAttributesKey("BISON_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey CHAR_LITERIAL =
            createTextAttributesKey("BISON_CHAR_LITERAL", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey STRING_LITERIAL =
            createTextAttributesKey("BISON_STRING_LITERAL", DefaultLanguageHighlighterColors.STRING);

    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] DIRECTIVE_KEYS = new TextAttributesKey[]{DIRECTIVE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{LINE_COMMENT, BLOCK_COMMENT};
    private static final TextAttributesKey[] LITERAL_KEYS = new TextAttributesKey[]{CHAR_LITERIAL, STRING_LITERIAL};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new BisonLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType instanceof BisonTokenType.BisonDirective) {
            return DIRECTIVE_KEYS;
        } else if (tokenType.equals(GeneratedTypes.ID) || tokenType.equals(GeneratedTypes.ID_COLON)) {
            return IDENTIFIER_KEYS;
        } else if (tokenType.equals(GeneratedTypes.CHAR_LITERAL) || tokenType.equals(GeneratedTypes.STRING)) {
            return LITERAL_KEYS;
        } else if (tokenType.equals(GeneratedTypes.COMMENT)) {
            return COMMENT_KEYS;
        }  else {
            return EMPTY_KEYS;
        }
    }

}