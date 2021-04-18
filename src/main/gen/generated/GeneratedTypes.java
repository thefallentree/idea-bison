// This is a generated file. Not intended for manual editing.
package generated;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import generated.psi.impl.*;
import info.fluffos.BisonCompositeElementType;
import info.fluffos.BisonTokenType;

public interface GeneratedTypes {

  IElementType ALIAS = new BisonCompositeElementType("ALIAS");
  IElementType CODE_PROPS_TYPE = new BisonCompositeElementType("CODE_PROPS_TYPE");
  IElementType EPILOGUE_OPT = new BisonCompositeElementType("EPILOGUE_OPT");
  IElementType GENERIC_SYMLIST_ITEM = new BisonCompositeElementType("GENERIC_SYMLIST_ITEM");
  IElementType GRAMMAR_DECLARATION = new BisonCompositeElementType("GRAMMAR_DECLARATION");
  IElementType ID_OR_CHAR_LITERAL = new BisonCompositeElementType("ID_OR_CHAR_LITERAL");
  IElementType INT_OPT = new BisonCompositeElementType("INT_OPT");
  IElementType NAMED_REF_OPT = new BisonCompositeElementType("NAMED_REF_OPT");
  IElementType NTERM_DECLS = new BisonCompositeElementType("NTERM_DECLS");
  IElementType PRECEDENCE_DECLARATOR = new BisonCompositeElementType("PRECEDENCE_DECLARATOR");
  IElementType PROLOGUE_DECLARATION = new BisonCompositeElementType("PROLOGUE_DECLARATION");
  IElementType RHS = new BisonCompositeElementType("RHS");
  IElementType RULES = new BisonCompositeElementType("RULES");
  IElementType RULES_OR_GRAMMAR_DECLARATION = new BisonCompositeElementType("RULES_OR_GRAMMAR_DECLARATION");
  IElementType STRING_AS_ID = new BisonCompositeElementType("STRING_AS_ID");
  IElementType STRING_OPT = new BisonCompositeElementType("STRING_OPT");
  IElementType SYMBOL = new BisonCompositeElementType("SYMBOL");
  IElementType SYMBOLS_1 = new BisonCompositeElementType("SYMBOLS_1");
  IElementType SYMBOL_DECLARATION = new BisonCompositeElementType("SYMBOL_DECLARATION");
  IElementType TAG = new BisonCompositeElementType("TAG");
  IElementType TAG_OPT = new BisonCompositeElementType("TAG_OPT");
  IElementType TOKEN_DECL = new BisonCompositeElementType("TOKEN_DECL");
  IElementType TOKEN_DECLS = new BisonCompositeElementType("TOKEN_DECLS");
  IElementType TOKEN_DECL_1 = new BisonCompositeElementType("TOKEN_DECL_1");
  IElementType TOKEN_DECL_FOR_PREC = new BisonCompositeElementType("TOKEN_DECL_FOR_PREC");
  IElementType TOKEN_DECL_FOR_PREC_1 = new BisonCompositeElementType("TOKEN_DECL_FOR_PREC_1");
  IElementType UNION_NAME = new BisonCompositeElementType("UNION_NAME");
  IElementType VALUE = new BisonCompositeElementType("VALUE");
  IElementType VARIABLE = new BisonCompositeElementType("VARIABLE");

  IElementType BRACED_CODE = new BisonTokenType("BRACED_CODE");
  IElementType BRACKETED_ID = new BisonTokenType("BRACKETED_ID");
  IElementType CHAR_LITERAL = new BisonTokenType("CHAR_LITERAL");
  IElementType COMMENT = new BisonTokenType("comment");
  IElementType EPILOGUE = new BisonTokenType("EPILOGUE");
  IElementType ERROR = new BisonTokenType("error");
  IElementType ID = new BisonTokenType("ID");
  IElementType INT_LITERAL = new BisonTokenType("INT_LITERAL");
  IElementType PERCENT_PERCENT = new BisonTokenType("PERCENT_PERCENT");
  IElementType PROLOGUE = new BisonTokenType("PROLOGUE");
  IElementType STRING = new BisonTokenType("STRING");
  IElementType TSTRING = new BisonTokenType("TSTRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALIAS) {
        return new AliasImpl(node);
      }
      else if (type == CODE_PROPS_TYPE) {
        return new CodePropsTypeImpl(node);
      }
      else if (type == EPILOGUE_OPT) {
        return new EpilogueOptImpl(node);
      }
      else if (type == GENERIC_SYMLIST_ITEM) {
        return new GenericSymlistItemImpl(node);
      }
      else if (type == GRAMMAR_DECLARATION) {
        return new GrammarDeclarationImpl(node);
      }
      else if (type == ID_OR_CHAR_LITERAL) {
        return new IdOrCharLiteralImpl(node);
      }
      else if (type == INT_OPT) {
        return new IntOptImpl(node);
      }
      else if (type == NAMED_REF_OPT) {
        return new NamedRefOptImpl(node);
      }
      else if (type == NTERM_DECLS) {
        return new NtermDeclsImpl(node);
      }
      else if (type == PRECEDENCE_DECLARATOR) {
        return new PrecedenceDeclaratorImpl(node);
      }
      else if (type == PROLOGUE_DECLARATION) {
        return new PrologueDeclarationImpl(node);
      }
      else if (type == RHS) {
        return new RhsImpl(node);
      }
      else if (type == RULES) {
        return new RulesImpl(node);
      }
      else if (type == RULES_OR_GRAMMAR_DECLARATION) {
        return new RulesOrGrammarDeclarationImpl(node);
      }
      else if (type == STRING_AS_ID) {
        return new StringAsIdImpl(node);
      }
      else if (type == STRING_OPT) {
        return new StringOptImpl(node);
      }
      else if (type == SYMBOL) {
        return new SymbolImpl(node);
      }
      else if (type == SYMBOLS_1) {
        return new Symbols1Impl(node);
      }
      else if (type == SYMBOL_DECLARATION) {
        return new SymbolDeclarationImpl(node);
      }
      else if (type == TAG) {
        return new TagImpl(node);
      }
      else if (type == TAG_OPT) {
        return new TagOptImpl(node);
      }
      else if (type == TOKEN_DECL) {
        return new TokenDeclImpl(node);
      }
      else if (type == TOKEN_DECLS) {
        return new TokenDeclsImpl(node);
      }
      else if (type == TOKEN_DECL_1) {
        return new TokenDecl1Impl(node);
      }
      else if (type == TOKEN_DECL_FOR_PREC) {
        return new TokenDeclForPrecImpl(node);
      }
      else if (type == TOKEN_DECL_FOR_PREC_1) {
        return new TokenDeclForPrec1Impl(node);
      }
      else if (type == UNION_NAME) {
        return new UnionNameImpl(node);
      }
      else if (type == VALUE) {
        return new ValueImpl(node);
      }
      else if (type == VARIABLE) {
        return new VariableImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
