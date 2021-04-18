// This is a generated file. Not intended for manual editing.
package generated;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;

import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import static generated.GeneratedTypes.*;

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
  // '<*>'
  //            | '<>'
  public static boolean TAG(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TAG")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TAG, "<tag>");
    r = consumeToken(b, "<*>");
    if (!r) r = consumeToken(b, "<>");
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
  // '%%' EPILOGUE?
  public static boolean epilogue_opt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "epilogue_opt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EPILOGUE_OPT, "<epilogue opt>");
    r = consumeToken(b, "%%");
    r = r && epilogue_opt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // EPILOGUE?
  private static boolean epilogue_opt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "epilogue_opt_1")) return false;
    consumeToken(b, EPILOGUE);
    return true;
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
  //            | '%start' symbols_1
  //            | code_props_type '{...}' generic_symlist_item+
  //            | '%default-prec'
  //            | '%no-default-prec'
  //            | ( '%code' ID_OR_CHAR_LITERAL? | '%union' union_name ) '{...}'
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

  // '%start' symbols_1
  private static boolean grammar_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%start");
    r = r && symbols_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // code_props_type '{...}' generic_symlist_item+
  private static boolean grammar_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = code_props_type(b, l + 1);
    r = r && consumeToken(b, "{...}");
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

  // ( '%code' ID_OR_CHAR_LITERAL? | '%union' union_name ) '{...}'
  private static boolean grammar_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grammar_declaration_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = grammar_declaration_5_0(b, l + 1);
    r = r && consumeToken(b, "{...}");
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
  // prologue_declaration* PERCENT_PERCENT rules_or_grammar_declaration+ epilogue_opt
  static boolean input(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = input_0(b, l + 1);
    r = r && consumeToken(b, PERCENT_PERCENT);
    r = r && input_2(b, l + 1);
    r = r && epilogue_opt(b, l + 1);
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

  /* ********************************************************** */
  // INT_LITERAL?
  public static boolean int_opt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "int_opt")) return false;
    Marker m = enter_section_(b, l, _NONE_, INT_OPT, "<int opt>");
    consumeToken(b, INT_LITERAL);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // BRACKETED_ID?
  public static boolean named_ref_opt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_ref_opt")) return false;
    Marker m = enter_section_(b, l, _NONE_, NAMED_REF_OPT, "<named ref opt>");
    consumeToken(b, BRACKETED_ID);
    exit_section_(b, l, m, true, false, null);
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
  // PROLOGUE
  //            | grammar_declaration
  //            | '%<flag>'
  //            | '%define' variable value
  //            | '%header' string_opt
  //            | '%error-verbose'
  //            | ( '%expect' | '%expect-rr' ) INT_LITERAL
  //            | ( '%file-prefix' | '%language' | '%name-prefix' | '%output' | '%require' | '%skeleton' ) STRING
  //            | '%glr-parser'
  //            | '%initial-action' BRACED_CODE
  //            | '%no-lines'
  //            | '%nondeterministic-parser'
  //            | '%param' '{...}'+
  //            | '%pure-parser'
  //            | '%token-table'
  //            | '%verbose'
  //            | '%yacc'
  //            | error? ';'
  public static boolean prologue_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROLOGUE_DECLARATION, "<prologue declaration>");
    r = consumeToken(b, PROLOGUE);
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

  // '%header' string_opt
  private static boolean prologue_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%header");
    r = r && string_opt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
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

  // '%initial-action' BRACED_CODE
  private static boolean prologue_declaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%initial-action");
    r = r && consumeToken(b, BRACED_CODE);
    exit_section_(b, m, null, r);
    return r;
  }

  // '%param' '{...}'+
  private static boolean prologue_declaration_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%param");
    r = r && prologue_declaration_12_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{...}'+
  private static boolean prologue_declaration_12_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prologue_declaration_12_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{...}");
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, "{...}")) break;
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
  // ( ( symbol | tag_opt BRACED_CODE ) named_ref_opt | '%?{...}' | '%empty' | '%prec' symbol | ( '%dprec' | '%expect' | '%expect-rr' ) INT_LITERAL | '%merge' TAG )*
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

  // ( symbol | tag_opt BRACED_CODE ) named_ref_opt | '%?{...}' | '%empty' | '%prec' symbol | ( '%dprec' | '%expect' | '%expect-rr' ) INT_LITERAL | '%merge' TAG
  private static boolean rhs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rhs_0_0(b, l + 1);
    if (!r) r = consumeToken(b, "%?{...}");
    if (!r) r = consumeToken(b, "%empty");
    if (!r) r = rhs_0_3(b, l + 1);
    if (!r) r = rhs_0_4(b, l + 1);
    if (!r) r = rhs_0_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( symbol | tag_opt BRACED_CODE ) named_ref_opt
  private static boolean rhs_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rhs_0_0_0(b, l + 1);
    r = r && named_ref_opt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // symbol | tag_opt BRACED_CODE
  private static boolean rhs_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    if (!r) r = rhs_0_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tag_opt BRACED_CODE
  private static boolean rhs_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tag_opt(b, l + 1);
    r = r && consumeToken(b, BRACED_CODE);
    exit_section_(b, m, null, r);
    return r;
  }

  // '%prec' symbol
  private static boolean rhs_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%prec");
    r = r && symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( '%dprec' | '%expect' | '%expect-rr' ) INT_LITERAL
  private static boolean rhs_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rhs_0_4_0(b, l + 1);
    r = r && consumeToken(b, INT_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // '%dprec' | '%expect' | '%expect-rr'
  private static boolean rhs_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0_4_0")) return false;
    boolean r;
    r = consumeToken(b, "%dprec");
    if (!r) r = consumeToken(b, "%expect");
    if (!r) r = consumeToken(b, "%expect-rr");
    return r;
  }

  // '%merge' TAG
  private static boolean rhs_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_0_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%merge");
    r = r && TAG(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID named_ref_opt ':' rhs ( '|' rhs | ';' )*
  public static boolean rules(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && named_ref_opt(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && rhs(b, l + 1);
    r = r && rules_4(b, l + 1);
    exit_section_(b, m, RULES, r);
    return r;
  }

  // ( '|' rhs | ';' )*
  private static boolean rules_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!rules_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rules_4", c)) break;
    }
    return true;
  }

  // '|' rhs | ';'
  private static boolean rules_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rules_4_0_0(b, l + 1);
    if (!r) r = consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // '|' rhs
  private static boolean rules_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules_4_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "|");
    r = r && rhs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // rules
  //            | ( grammar_declaration | error ) ';'
  public static boolean rules_or_grammar_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules_or_grammar_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULES_OR_GRAMMAR_DECLARATION, "<rules or grammar declaration>");
    r = rules(b, l + 1);
    if (!r) r = rules_or_grammar_declaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( grammar_declaration | error ) ';'
  private static boolean rules_or_grammar_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules_or_grammar_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rules_or_grammar_declaration_1_0(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // grammar_declaration | error
  private static boolean rules_or_grammar_declaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules_or_grammar_declaration_1_0")) return false;
    boolean r;
    r = grammar_declaration(b, l + 1);
    if (!r) r = consumeToken(b, ERROR);
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
  // STRING?
  public static boolean string_opt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_opt")) return false;
    Marker m = enter_section_(b, l, _NONE_, STRING_OPT, "<string opt>");
    consumeToken(b, STRING);
    exit_section_(b, l, m, true, false, null);
    return true;
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
  //            | '%type' TAG? symbols_1 ( TAG symbols_1 )*
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

  // '%type' TAG? symbols_1 ( TAG symbols_1 )*
  private static boolean symbol_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "%type");
    r = r && symbol_declaration_2_1(b, l + 1);
    r = r && symbols_1(b, l + 1);
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

  // ( TAG symbols_1 )*
  private static boolean symbol_declaration_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_declaration_2_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!symbol_declaration_2_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbol_declaration_2_3", c)) break;
    }
    return true;
  }

  // TAG symbols_1
  private static boolean symbol_declaration_2_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_declaration_2_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TAG(b, l + 1);
    r = r && symbols_1(b, l + 1);
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
  // symbol+
  public static boolean symbols_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbols_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOLS_1, "<symbols 1>");
    r = symbol(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!symbol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbols_1", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TAG?
  public static boolean tag_opt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag_opt")) return false;
    Marker m = enter_section_(b, l, _NONE_, TAG_OPT, "<tag opt>");
    TAG(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // ID_OR_CHAR_LITERAL int_opt alias
  public static boolean token_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decl")) return false;
    if (!nextTokenIs(b, "<token decl>", CHAR_LITERAL, ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOKEN_DECL, "<token decl>");
    r = ID_OR_CHAR_LITERAL(b, l + 1);
    r = r && int_opt(b, l + 1);
    r = r && alias(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // token_decl+
  public static boolean token_decl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decl_1")) return false;
    if (!nextTokenIs(b, "<token decl 1>", CHAR_LITERAL, ID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOKEN_DECL_1, "<token decl 1>");
    r = token_decl(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!token_decl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "token_decl_1", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ID_OR_CHAR_LITERAL int_opt
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

  // ID_OR_CHAR_LITERAL int_opt
  private static boolean token_decl_for_prec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decl_for_prec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ID_OR_CHAR_LITERAL(b, l + 1);
    r = r && int_opt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
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
  // TAG? token_decl_1 ( TAG token_decl_1 )*
  public static boolean token_decls(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decls")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOKEN_DECLS, "<token decls>");
    r = token_decls_0(b, l + 1);
    r = r && token_decl_1(b, l + 1);
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

  // ( TAG token_decl_1 )*
  private static boolean token_decls_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decls_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!token_decls_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "token_decls_2", c)) break;
    }
    return true;
  }

  // TAG token_decl_1
  private static boolean token_decls_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token_decls_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TAG(b, l + 1);
    r = r && token_decl_1(b, l + 1);
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
  // ( ID_OR_CHAR_LITERAL | STRING | BRACED_CODE )?
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    value_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ID_OR_CHAR_LITERAL | STRING | BRACED_CODE
  private static boolean value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_0")) return false;
    boolean r;
    r = ID_OR_CHAR_LITERAL(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, BRACED_CODE);
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
