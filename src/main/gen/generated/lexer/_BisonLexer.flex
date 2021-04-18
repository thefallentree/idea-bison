package generated.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import java.io.IOException;import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static generated.GeneratedTypes.*;

%%

%{
  public _BisonLexer() {
    this((java.io.Reader)null);
  }

  StringBuffer string = new StringBuffer();
%}

%public
%class _BisonLexer
// %implements FlexLexer
%function advance
%type IElementType
%unicode
%debug

EOL=\R
WHITE_SPACE=\s+

ID=[.abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_]([.abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_]|[-0-9])*
BRACKETED_ID=\[[.abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_]([.abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_]|[-0-9])*\]
SPACE=[ \t\n\x0B\f\r]+
CHAR_LITERAL='.+'
STRING=\".+\"
BRACED_CODE=\{.+}

    LineTerminator = \r|\n|\r\n
    InputCharacter = [^\r\n]
    WhiteSpace     = {LineTerminator} | [ \t\f]

    /* comments */
    Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

    TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
    // Comment can be the last line of the file, without line terminator.
    EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
    DocumentationComment = "/**" {CommentContent} "*"+ "/"
    CommentContent       = ( [^*] | \*+ [^/*] )*

int=       [0-9]+
xint=      0[xX][0-9abcdefABCDEF]+

%x SC_PROLOGUE

%%


<YYINITIAL> {
  {SPACE}       { return WHITE_SPACE; }

  {Comment}           { return COMMENT; }
  {int}           { return INT_LITERAL; }
  {xint}          { return INT_LITERAL; }

  "%{"                { string.setLength(0); yybegin(SC_PROLOGUE); }
  {BRACED_CODE}       { return BRACED_CODE; }

  "%%"               { return PERCENT_PERCENT; }

  {ID}                { return ID; }
  {BRACKETED_ID}        { return BRACKETED_ID; }
  {CHAR_LITERAL}      { return CHAR_LITERAL; }
  {STRING}            { return STRING; }

}

<SC_PROLOGUE> {
    {WHITE_SPACE} { /* do nothing */ }
    "%}" {  yybegin(YYINITIAL);  string.append(yytext()); return PROLOGUE; }
    .+ { /* do nothing */ }
    <<EOF>>   { return BAD_CHARACTER; }
}

[^] { return BAD_CHARACTER; }



