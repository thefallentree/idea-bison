package generated.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import info.fluffos.BisonTokenType;

import java.io.IOException;import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static generated.GeneratedTypes.*;

%%

%{
  public _BisonLexer() {
    this((java.io.Reader)null);
  }
  int percent_percent_count = 0;
  int nesting = 0;
%}

%public
%class _BisonLexer
// %implements FlexLexer
%function advance
%type IElementType
%unicode
%debug

EOL=\n|\n\r
WHITE_SPACE=\s+
letter=[.abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_]
ID={letter}({letter}|[-0-9])*
BRACKETED_ID=\[{ID}\]
SPACE=[ \t\n\x0B\f\r]+

/* Zero or more instances of backslash-newline.  Following GCC, allow
   white space between the backslash and the newline.  */
splice=   (\\[ \f\t\v]*{EOL})*

/* An equal sign, with optional leading whitespaces. This is used in some
   deprecated constructs. */
sp=       [[:space:]]*
eqopt=    ({sp}=)?

// comments
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

%x SC_PROLOGUE SC_BRACED_CODE SC_PREDICATE SC_EPILOGUE

%x SC_TAG

 /* Characters and strings in directives/rules. */
%x SC_ESCAPED_CHARACTER SC_ESCAPED_STRING SC_ESCAPED_TSTRING

%%

<YYINITIAL> {
  "%binary"                         {return BisonTokenType.directive("BINARY"); }
  "%code"                           {return BisonTokenType.directive ("CODE"); }
  "%debug"                          {return BisonTokenType.directive ("DEBUG"); }
  "%default-prec"                   { return BisonTokenType.directive("DEFAULT_PREC"); }
  "%define"                         { return BisonTokenType.directive("DEFINE"); }
  "%defines"                        { return BisonTokenType.directive("HEADER"); } // Deprecated in 3.8.
  "%destructor"                     { return BisonTokenType.directive("DESTRUCTOR"); }
  "%dprec"                          { return BisonTokenType.directive("DPREC"); }
  "%empty"                          { return BisonTokenType.directive("EMPTY"); }
  "%expect"                         { return BisonTokenType.directive("EXPECT"); }
  "%expect-rr"                      { return BisonTokenType.directive("EXPECT_RR"); }
  "%file-prefix"                    { return BisonTokenType.directive("FILE-PREFIX"); }
  "%glr-parser"                     { return BisonTokenType.directive("GLR_PARSER"); }
  "%header"                         { return BisonTokenType.directive("HEADER"); }
  "%initial-action"                 { return BisonTokenType.directive("INITIAL_ACTION"); }
  "%language"                       { return BisonTokenType.directive("LANGUAGE"); }
  "%left"                           { return BisonTokenType.directive("LEFT"); }
  "%lex-param"                      { return BisonTokenType.directive("lex-param"); }
  "%locations"                      { return BisonTokenType.directive("locations"); }
  "%merge"                          { return BisonTokenType.directive("MERGE"); }
  "%no-default-prec"                { return BisonTokenType.directive("NO_DEFAULT_PREC"); }
  "%no-lines"                       { return BisonTokenType.directive("NO_LINES"); }
  "%nonassoc"                       { return BisonTokenType.directive("nonassoc"); }
  "%nondeterministic-parser"        { return BisonTokenType.directive("NONDETERMINISTIC_PARSER"); }
  "%nterm"                          { return BisonTokenType.directive("NTERM"); }
  "%output"                         { return BisonTokenType.directive("OUTPUT"); }
  "%param"                          { return BisonTokenType.directive("param"); }
  "%parse-param"                    { return BisonTokenType.directive("parse-param"); }
  "%prec"                           { return BisonTokenType.directive("prec"); }
  "%precedence"                     { return BisonTokenType.directive("PRECEDENCE"); }
  "%printer"                        { return BisonTokenType.directive("PRINTER"); }
  "%require"                        { return BisonTokenType.directive("REQUIRE"); }
  "%right"                          { return BisonTokenType.directive("right"); }
  "%skeleton"                       { return BisonTokenType.directive("SKELETON"); }
  "%start"                          { return BisonTokenType.directive("start"); }
  "%term"                           { return BisonTokenType.directive("TOKEN"); }
  "%token"                          { return BisonTokenType.directive("token"); }
  "%token-table"                    { return BisonTokenType.directive("TOKEN_TABLE"); }
  "%type"                           { return BisonTokenType.directive("type"); }
  "%union"                          { return BisonTokenType.directive("union"); }
  "%verbose"                        { return BisonTokenType.directive("VERBOSE"); }
  "%yacc"                           { return BisonTokenType.directive("yacc"); }
  /* Deprecated since Bison 2.3b (2008-05-27), but the warning is
     issued only since Bison 3.4. */
  "%pure"[-_]"parser"                { return BisonTokenType.directive("PURE_PARSER"); }

  /* Deprecated since Bison 3.0 (2013-07-25), but the warning is
     issued only since Bison 3.3. */
  "%error-verbose"                  { return BisonTokenType.directive("ERROR_VERBOSE"); }

  /* Deprecated since Bison 2.6 (2012-07-19), but the warning is
     issued only since Bison 3.3. */
  "%name"[-_]"prefix"{eqopt}{sp}    { return BisonTokenType.directive("NAME_PREFIX"); }

  /* Deprecated since Bison 2.7.90, 2012. */
  "%default"[-_]"prec"              { return BisonTokenType.directive("DEFAULT_PREC"); }
  "%error"[-_]"verbose"             { return BisonTokenType.directive("ERROR_VERBOSE"); }
  "%expect"[-_]"rr"                 { return BisonTokenType.directive("expect-rr"); }
  "%file-prefix"{eqopt}             { return BisonTokenType.directive("PERCENT_FILE_PREFIX"); }
  "%fixed"[-_]"output"[-_]"files"   { return BisonTokenType.directive("%output \"y.tab.c\""); }
  "%no"[-_]"default"[-_]"prec"      { return BisonTokenType.directive("%no-default-prec"); }
  "%no"[-_]"lines"                  { return BisonTokenType.directive("%no-lines"); }
  "%output"{eqopt}                  { return BisonTokenType.directive("%output"); }
  "%token"[-_]"table"               { return BisonTokenType.directive("%token-table"); }
  ":"           {return new BisonTokenType(":"); }
  "="           {return new BisonTokenType("="); }
  "|"           {return new BisonTokenType("|"); }
  ";"           {return new BisonTokenType(";"); }

  {SPACE}       { return WHITE_SPACE; }
  {Comment}           { return COMMENT; }


  /* Characters.  */
  "'"         {yybegin(SC_ESCAPED_CHARACTER);}
  /* Strings. */
  \"        {yybegin(SC_ESCAPED_STRING);}
  "_(\""      {yybegin(SC_ESCAPED_TSTRING);}

  "%{"                { yybegin(SC_PROLOGUE); }
  "{"                 {nesting = 0; yybegin(SC_BRACED_CODE); }
  "%%"               { if(++percent_percent_count == 2) yybegin(SC_EPILOGUE); return new BisonTokenType("%%"); }

  {ID}                { return ID; }
  {ID} ":"           { yypushback(1); return ID_COLON;}
  {BRACKETED_ID}        { return BRACKETED_ID; }
  {int}           { return INT_LITERAL; }
  {xint}          { return INT_LITERAL; }

  /* Semantic predicate. */
  "%?"([ \f\t\v]|{EOL})*"{" {nesting = 0; yybegin(SC_PREDICATE); }

    /* A type. */
    "<*>"       {return TAG_ANY;}
    "<>"        { return TAG_NONE;}
    "<"         { nesting = 0; yybegin(SC_TAG); }

}

<SC_ESCAPED_CHARACTER>
{
    "'" {yybegin(YYINITIAL); return CHAR_LITERAL;}
   [^']+ { /* do nothing */ }
    {EOL} { return BAD_CHARACTER; }
     <<EOF>> { throw new Error("Unexpected EOF"); }
}

<SC_ESCAPED_STRING>
{
  "\"" {yybegin(YYINITIAL); return STRING;}
  [^\"]+ { /* do nothing */ }
  {EOL} { return BAD_CHARACTER; }
  <<EOF>> { throw new Error("Unexpected EOF"); }
}

<SC_ESCAPED_TSTRING>
{
  "\")" {yybegin(YYINITIAL); return TSTRING;}
  [^)\"]+ { /* do nothing */ }
  {EOL} { return BAD_CHARACTER; }
  <<EOF>> { throw new Error("Unexpected EOF"); }
}

<SC_BRACED_CODE,SC_PREDICATE>
{
  "{"|"<"{splice}"%"  { nesting++; }
  "%"{splice}">"      { nesting--; }

  /* Tokenize '<<%' correctly (as '<<' '%') rather than incorrectly
     (as '<' '<%').  */
  "<"{splice}"<"  { /* do nothing */ }

  <<EOF>>   { throw new Error("Unexpected EOF"); }
}

<SC_BRACED_CODE> {
   "}" { if (--nesting < 0) { yybegin(YYINITIAL); return BRACED_CODE_LITERAL; } }
   {Comment} | [^{}]+ | {EOL} { /* do nothing */ }
}

<SC_PREDICATE>
{
  "}" { if (--nesting < 0) { yybegin(YYINITIAL); return PREDICATE; } }
   {Comment} | [^{}]+ | {EOL} { /* do nothing */ }
}

<SC_PROLOGUE> {
    "%}" {  yybegin(YYINITIAL); return PROLOGUE_LITERAL; }
   {Comment} | [^%]+ | {EOL} { /* do nothing */ }
    <<EOF>>   { throw new Error("Unexpected EOF"); }
}

<SC_EPILOGUE> {
   .+ | {EOL}  { /* do nothing */ }
    <<EOF>>   { yybegin(YYINITIAL); return EPILOGUE_LITERAL; }
}

  /*--------------------------------------------------------------.
  | Scanning a tag.  The initial angle bracket is already eaten.  |
  `--------------------------------------------------------------*/

<SC_TAG>
{
  ">" { if (--nesting < 0) { yybegin(YYINITIAL); return TAG_TAG; } }
  ([^<>]|->)+ { /* do nothing */ }
  "<"+   { nesting += yylength(); }
  <<EOF>>   { throw new Error("unexpected_eof");}
}

[^] { return BAD_CHARACTER; }



