// This is a generated file. Not intended for manual editing.
package generated;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static generated.GeneratedTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GeneratedParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return input(b, l + 1);
  }

  /* ********************************************************** */
  // ID | CHAR_LITERAL
  public static boolean ID_OR_CHAR_LITERAL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ID_OR_CHAR_LITERAL")) return false;
    if (!nextTokenIs(b, "<id or char literal>", CHAR_LITERAL, ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID_OR_CHAR_LITERAL, "<id or char literal>");
    r = consumeToken(b, ID);
    if (!r) r = consumeToken(b, CHAR_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TAG_ANY
  //            | TAG_NONE
  //            | TAG_TAG
  public static boolean TAG(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TAG")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TAG, "<tag>");
    r = consumeToken(b, TAG_ANY);
    if (!r) r = consumeToken(b, TAG_NONE);
    if (!r) r = consumeToken(b, TAG_TAG);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( string_as_id | TSTRING )?
  public static boolean alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias")) return false;
    Marker m = enter_section_(b, l, _NONE_, ALIAS, "<alias>");
    alias_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // string_as_id | TSTRING
  private static boolean alias_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_0")) return false;
    boolean r;
    r = string_as_id(b, l + 1);
    if (!r) r = consumeToken(b, TSTRING);
    return r;
  }

  /* ********************************************************** */
  // BRACED_CODE_LITERAL
  public static boolean braced_code(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "braced_code")) return false;
    if (!nextTokenIs(b, BRACED_CODE_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACED_CODE_LITERAL);
    exit_section_(b, m, BRACED_CODE, r);
    return r;
  }

  /* ********************************************************** */
  // '%destructor'
  //            | '%printer'
  public static boolean code_props_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_props_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CODE_PROPS_TYPE, "<code props type>");
    r = consumeToken(b, "%destructor");
    if (!r) r = consumeToken(b, "%printer");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EPILOGUE_LITERAL
  public static boolean epilogue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "epilogue")) return false;
    if (!nextTokenIs(b, EPILOGUE_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EPILOGUE_LITERAL);
    exit_section_(b, m, EPILOGUE, r);
    return r;
  }

  /* ********************************************************** */
  // symbol
  //            | TAG
  public static boolean generic_symlist_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_symlist_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_SYMLIST_ITEM, "<generic symlist item>");
    r = symbol(b, l + 1);
    if (!r) r = TAG(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // symbol_declaration
  //            | '%start' symbol+
  //            | code_props_type braced_code generic_symlist_item+
  //            | '%default-prec'
  //            | '%no-default-prec'
  //            | ( '%code' ID_OR_CHAR_LITERAL? | '%union' union_name ) braced_code
  public static boolean grammar_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GRAMMAR_DECLARATION, "<grammar declaration>");
    r = symbol_declaration(b, l + 1);
    if (!r) r = grammar_declaration_1(b, l + 1);
    if (!r) r = grammar_declaration_2(b, l + 1);
    if (!r) r = consumeToken(b, "%default-prec");
    if (!r) r = consumeToken(b, "%no-default-prec");
    if (!r) r = grammar_declaration_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '%start' symbol+
  private static boolean grammar_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%start");
    r = r && grammar_declaration_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // symbol+
  private static boolean grammar_declaration_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_declaration_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!symbol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "grammar_declaration_1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // code_props_type braced_code generic_symlist_item+
  private static boolean grammar_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = code_props_type(b, l + 1);
    r = r && braced_code(b, l + 1);
    r = r && grammar_declaration_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // generic_symlist_item+
  private static boolean grammar_declaration_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_declaration_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_symlist_item(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!generic_symlist_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "grammar_declaration_2_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( '%code' ID_OR_CHAR_LITERAL? | '%union' union_name ) braced_code
  private static boolean grammar_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_declaration_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = grammar_declaration_5_0(b, l + 1);
    r = r && braced_code(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '%code' ID_OR_CHAR_LITERAL? | '%union' union_name
  private static boolean grammar_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = grammar_declaration_5_0_0(b, l + 1);
    if (!r) r = grammar_declaration_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '%code' ID_OR_CHAR_LITERAL?
  private static boolean grammar_declaration_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_declaration_5_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%code");
    r = r && grammar_declaration_5_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID_OR_CHAR_LITERAL?
  private static boolean grammar_declaration_5_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_declaration_5_0_0_1")) return false;
    ID_OR_CHAR_LITERAL(b, l + 1);
    return true;
  }

  // '%union' union_name
  private static boolean grammar_declaration_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_declaration_5_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%union");
    r = r && union_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // prologue_declaration* '%%' rules_or_grammar_declaration+ '%%' epilogue?
  static boolean input(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = input_0(b, l + 1);
    r = r && consumeToken(b, "%%");
    r = r && input_2(b, l + 1);
    r = r && consumeToken(b, "%%");
    r = r && input_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // prologue_declaration*
  private static boolean input_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!prologue_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "input_0", c)) break;
    }
    return true;
  }

  // rules_or_grammar_declaration+
  private static boolean input_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rules_or_grammar_declaration(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!rules_or_grammar_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "input_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // epilogue?
  private static boolean input_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_4")) return false;
    epilogue(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // token_decls
  public static boolean nterm_decls(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nterm_decls")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NTERM_DECLS, "<nterm decls>");
    r = token_decls(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '%left'
  //            | '%right'
  //            | '%nonassoc'
  //            | '%precedence'
  public static boolean precedence_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRECEDENCE_DECLARATOR, "<precedence declarator>");
    r = consumeToken(b, "%left");
    if (!r) r = consumeToken(b, "%right");
    if (!r) r = consumeToken(b, "%nonassoc");
    if (!r) r = consumeToken(b, "%precedence");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PREDICATE_LITERAL
  public static boolean predicate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predicate")) return false;
    if (!nextTokenIs(b, PREDICATE_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PREDICATE_LITERAL);
    exit_section_(b, m, PREDICATE, r);
    return r;
  }

  /* ********************************************************** */
  // PROLOGUE_LITERAL
  public static boolean prologue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue")) return false;
    if (!nextTokenIs(b, PROLOGUE_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROLOGUE_LITERAL);
    exit_section_(b, m, PROLOGUE, r);
    return r;
  }

  /* ********************************************************** */
  // prologue
  //            | grammar_declaration
  //            | '%<flag>'
  //            | '%define' variable value
  //            | '%header' STRING?
  //            | '%error-verbose'
  //            | ( '%expect' | '%expect-rr' ) INT_LITERAL
  //            | ( '%file-prefix' | '%language' | '%name-prefix' | '%output' | '%require' | '%skeleton' ) STRING
  //            | '%glr-parser'
  //            | '%initial-action' braced_code
  //            | '%no-lines'
  //            | '%nondeterministic-parser'
  //            | '%param' braced_code+
  //            | '%pure-parser'
  //            | '%token-table'
  //            | '%verbose'
  //            | '%yacc'
  //            | error? ';'
  public static boolean prologue_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROLOGUE_DECLARATION, "<prologue declaration>");
    r = prologue(b, l + 1);
    if (!r) r = grammar_declaration(b, l + 1);
    if (!r) r = consumeToken(b, "%<flag>");
    if (!r) r = prologue_declaration_3(b, l + 1);
    if (!r) r = prologue_declaration_4(b, l + 1);
    if (!r) r = consumeToken(b, "%error-verbose");
    if (!r) r = prologue_declaration_6(b, l + 1);
    if (!r) r = prologue_declaration_7(b, l + 1);
    if (!r) r = consumeToken(b, "%glr-parser");
    if (!r) r = prologue_declaration_9(b, l + 1);
    if (!r) r = consumeToken(b, "%no-lines");
    if (!r) r = consumeToken(b, "%nondeterministic-parser");
    if (!r) r = prologue_declaration_12(b, l + 1);
    if (!r) r = consumeToken(b, "%pure-parser");
    if (!r) r = consumeToken(b, "%token-table");
    if (!r) r = consumeToken(b, "%verbose");
    if (!r) r = consumeToken(b, "%yacc");
    if (!r) r = prologue_declaration_17(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '%define' variable value
  private static boolean prologue_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%define");
    r = r && variable(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '%header' STRING?
  private static boolean prologue_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%header");
    r = r && prologue_declaration_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING?
  private static boolean prologue_declaration_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration_4_1")) return false;
    consumeToken(b, STRING);
    return true;
  }

  // ( '%expect' | '%expect-rr' ) INT_LITERAL
  private static boolean prologue_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prologue_declaration_6_0(b, l + 1);
    r = r && consumeToken(b, INT_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // '%expect' | '%expect-rr'
  private static boolean prologue_declaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration_6_0")) return false;
    boolean r;
    r = consumeToken(b, "%expect");
    if (!r) r = consumeToken(b, "%expect-rr");
    return r;
  }

  // ( '%file-prefix' | '%language' | '%name-prefix' | '%output' | '%require' | '%skeleton' ) STRING
  private static boolean prologue_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prologue_declaration_7_0(b, l + 1);
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // '%file-prefix' | '%language' | '%name-prefix' | '%output' | '%require' | '%skeleton'
  private static boolean prologue_declaration_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration_7_0")) return false;
    boolean r;
    r = consumeToken(b, "%file-prefix");
    if (!r) r = consumeToken(b, "%language");
    if (!r) r = consumeToken(b, "%name-prefix");
    if (!r) r = consumeToken(b, "%output");
    if (!r) r = consumeToken(b, "%require");
    if (!r) r = consumeToken(b, "%skeleton");
    return r;
  }

  // '%initial-action' braced_code
  private static boolean prologue_declaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%initial-action");
    r = r && braced_code(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '%param' braced_code+
  private static boolean prologue_declaration_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%param");
    r = r && prologue_declaration_12_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // braced_code+
  private static boolean prologue_declaration_12_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration_12_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = braced_code(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!braced_code(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "prologue_declaration_12_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // error? ';'
  private static boolean prologue_declaration_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration_17")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prologue_declaration_17_0(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // error?
  private static boolean prologue_declaration_17_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration_17_0")) return false;
    consumeToken(b, ERROR);
    return true;
  }

  /* ********************************************************** */
  // (symbol BRACKETED_ID?
  //             | TAG? braced_code BRACKETED_ID?
  //             | predicate
  //             | '%empty'
  //             | '%prec' symbol
  //             | ( '%dprec' | '%expect' | '%expect-rr' ) INT_LITERAL
  //             | '%merge' TAG)*
  public static boolean rhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs")) return false;
    Marker m = enter_section_(b, l, _NONE_, RHS, "<rhs>");
    while (true) {
      int c = current_position_(b);
      if (!rhs_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rhs", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // symbol BRACKETED_ID?
  //             | TAG? braced_code BRACKETED_ID?
  //             | predicate
  //             | '%empty'
  //             | '%prec' symbol
  //             | ( '%dprec' | '%expect' | '%expect-rr' ) INT_LITERAL
  //             | '%merge' TAG
  private static boolean rhs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rhs_0_0(b, l + 1);
    if (!r) r = rhs_0_1(b, l + 1);
    if (!r) r = predicate(b, l + 1);
    if (!r) r = consumeToken(b, "%empty");
    if (!r) r = rhs_0_4(b, l + 1);
    if (!r) r = rhs_0_5(b, l + 1);
    if (!r) r = rhs_0_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // symbol BRACKETED_ID?
  private static boolean rhs_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    r = r && rhs_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BRACKETED_ID?
  private static boolean rhs_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0_0_1")) return false;
    consumeToken(b, BRACKETED_ID);
    return true;
  }

  // TAG? braced_code BRACKETED_ID?
  private static boolean rhs_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rhs_0_1_0(b, l + 1);
    r = r && braced_code(b, l + 1);
    r = r && rhs_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TAG?
  private static boolean rhs_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0_1_0")) return false;
    TAG(b, l + 1);
    return true;
  }

  // BRACKETED_ID?
  private static boolean rhs_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0_1_2")) return false;
    consumeToken(b, BRACKETED_ID);
    return true;
  }

  // '%prec' symbol
  private static boolean rhs_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%prec");
    r = r && symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( '%dprec' | '%expect' | '%expect-rr' ) INT_LITERAL
  private static boolean rhs_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rhs_0_5_0(b, l + 1);
    r = r && consumeToken(b, INT_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // '%dprec' | '%expect' | '%expect-rr'
  private static boolean rhs_0_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0_5_0")) return false;
    boolean r;
    r = consumeToken(b, "%dprec");
    if (!r) r = consumeToken(b, "%expect");
    if (!r) r = consumeToken(b, "%expect-rr");
    return r;
  }

  // '%merge' TAG
  private static boolean rhs_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%merge");
    r = r && TAG(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID_COLON BRACKETED_ID? ':' rhs ('|' rhs)*
  public static boolean rules(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules")) return false;
    if (!nextTokenIs(b, ID_COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID_COLON);
    r = r && rules_1(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && rhs(b, l + 1);
    r = r && rules_4(b, l + 1);
    exit_section_(b, m, RULES, r);
    return r;
  }

  // BRACKETED_ID?
  private static boolean rules_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules_1")) return false;
    consumeToken(b, BRACKETED_ID);
    return true;
  }

  // ('|' rhs)*
  private static boolean rules_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!rules_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rules_4", c)) break;
    }
    return true;
  }

  // '|' rhs
  private static boolean rules_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "|");
    r = r && rhs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // rules ';'?
  //          | grammar_declaration ';'
  public static boolean rules_or_grammar_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules_or_grammar_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULES_OR_GRAMMAR_DECLARATION, "<rules or grammar declaration>");
    r = rules_or_grammar_declaration_0(b, l + 1);
    if (!r) r = rules_or_grammar_declaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // rules ';'?
  private static boolean rules_or_grammar_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules_or_grammar_declaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rules(b, l + 1);
    r = r && rules_or_grammar_declaration_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean rules_or_grammar_declaration_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules_or_grammar_declaration_0_1")) return false;
    consumeToken(b, ";");
    return true;
  }

  // grammar_declaration ';'
  private static boolean rules_or_grammar_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules_or_grammar_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = grammar_declaration(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING
  public static boolean string_as_id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_as_id")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    exit_section_(b, m, STRING_AS_ID, r);
    return r;
  }

  /* ********************************************************** */
  // ID_OR_CHAR_LITERAL
  //            | string_as_id
  public static boolean symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL, "<symbol>");
    r = ID_OR_CHAR_LITERAL(b, l + 1);
    if (!r) r = string_as_id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '%nterm' nterm_decls
  //            | '%token' token_decls
  //            | '%type' TAG? symbol+ ( TAG symbol+ )*
  //            | precedence_declarator TAG? token_decl_for_prec_1 ( TAG token_decl_for_prec_1 )*
  public static boolean symbol_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL_DECLARATION, "<symbol declaration>");
    r = symbol_declaration_0(b, l + 1);
    if (!r) r = symbol_declaration_1(b, l + 1);
    if (!r) r = symbol_declaration_2(b, l + 1);
    if (!r) r = symbol_declaration_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '%nterm' nterm_decls
  private static boolean symbol_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_declaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%nterm");
    r = r && nterm_decls(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '%token' token_decls
  private static boolean symbol_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%token");
    r = r && token_decls(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '%type' TAG? symbol+ ( TAG symbol+ )*
  private static boolean symbol_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%type");
    r = r && symbol_declaration_2_1(b, l + 1);
    r = r && symbol_declaration_2_2(b, l + 1);
    r = r && symbol_declaration_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TAG?
  private static boolean symbol_declaration_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_declaration_2_1")) return false;
    TAG(b, l + 1);
    return true;
  }

  // symbol+
  private static boolean symbol_declaration_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_declaration_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!symbol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbol_declaration_2_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TAG symbol+ )*
  private static boolean symbol_declaration_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_declaration_2_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!symbol_declaration_2_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbol_declaration_2_3", c)) break;
    }
    return true;
  }

  // TAG symbol+
  private static boolean symbol_declaration_2_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_declaration_2_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TAG(b, l + 1);
    r = r && symbol_declaration_2_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // symbol+
  private static boolean symbol_declaration_2_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_declaration_2_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!symbol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbol_declaration_2_3_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // precedence_declarator TAG? token_decl_for_prec_1 ( TAG token_decl_for_prec_1 )*
  private static boolean symbol_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_declaration_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = precedence_declarator(b, l + 1);
    r = r && symbol_declaration_3_1(b, l + 1);
    r = r && token_decl_for_prec_1(b, l + 1);
    r = r && symbol_declaration_3_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TAG?
  private static boolean symbol_declaration_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_declaration_3_1")) return false;
    TAG(b, l + 1);
    return true;
  }

  // ( TAG token_decl_for_prec_1 )*
  private static boolean symbol_declaration_3_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_declaration_3_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!symbol_declaration_3_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbol_declaration_3_3", c)) break;
    }
    return true;
  }

  // TAG token_decl_for_prec_1
  private static boolean symbol_declaration_3_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_declaration_3_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TAG(b, l + 1);
    r = r && token_decl_for_prec_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID_OR_CHAR_LITERAL INT_LITERAL? alias
  public static boolean token_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decl")) return false;
    if (!nextTokenIs(b, "<token decl>", CHAR_LITERAL, ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOKEN_DECL, "<token decl>");
    r = ID_OR_CHAR_LITERAL(b, l + 1);
    r = r && token_decl_1(b, l + 1);
    r = r && alias(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // INT_LITERAL?
  private static boolean token_decl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decl_1")) return false;
    consumeToken(b, INT_LITERAL);
    return true;
  }

  /* ********************************************************** */
  // ID_OR_CHAR_LITERAL INT_LITERAL?
  //            | string_as_id
  public static boolean token_decl_for_prec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decl_for_prec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOKEN_DECL_FOR_PREC, "<token decl for prec>");
    r = token_decl_for_prec_0(b, l + 1);
    if (!r) r = string_as_id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ID_OR_CHAR_LITERAL INT_LITERAL?
  private static boolean token_decl_for_prec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decl_for_prec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ID_OR_CHAR_LITERAL(b, l + 1);
    r = r && token_decl_for_prec_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INT_LITERAL?
  private static boolean token_decl_for_prec_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decl_for_prec_0_1")) return false;
    consumeToken(b, INT_LITERAL);
    return true;
  }

  /* ********************************************************** */
  // token_decl_for_prec+
  public static boolean token_decl_for_prec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decl_for_prec_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOKEN_DECL_FOR_PREC_1, "<token decl for prec 1>");
    r = token_decl_for_prec(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!token_decl_for_prec(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "token_decl_for_prec_1", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TAG? token_decl+ ( TAG token_decl+ )*
  public static boolean token_decls(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decls")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOKEN_DECLS, "<token decls>");
    r = token_decls_0(b, l + 1);
    r = r && token_decls_1(b, l + 1);
    r = r && token_decls_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TAG?
  private static boolean token_decls_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decls_0")) return false;
    TAG(b, l + 1);
    return true;
  }

  // token_decl+
  private static boolean token_decls_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decls_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = token_decl(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!token_decl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "token_decls_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TAG token_decl+ )*
  private static boolean token_decls_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decls_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!token_decls_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "token_decls_2", c)) break;
    }
    return true;
  }

  // TAG token_decl+
  private static boolean token_decls_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decls_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TAG(b, l + 1);
    r = r && token_decls_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // token_decl+
  private static boolean token_decls_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decls_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = token_decl(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!token_decl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "token_decls_2_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID_OR_CHAR_LITERAL?
  public static boolean union_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_name")) return false;
    Marker m = enter_section_(b, l, _NONE_, UNION_NAME, "<union name>");
    ID_OR_CHAR_LITERAL(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // ( ID_OR_CHAR_LITERAL | STRING | braced_code )?
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    value_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ID_OR_CHAR_LITERAL | STRING | braced_code
  private static boolean value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_0")) return false;
    boolean r;
    r = ID_OR_CHAR_LITERAL(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = braced_code(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ID_OR_CHAR_LITERAL
  public static boolean variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable")) return false;
    if (!nextTokenIs(b, "<variable>", CHAR_LITERAL, ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE, "<variable>");
    r = ID_OR_CHAR_LITERAL(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
