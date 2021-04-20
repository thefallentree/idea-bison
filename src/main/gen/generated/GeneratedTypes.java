// This is a generated file. Not intended for manual editing.
package generated;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import info.fluffos.BisonCompositeElementType;
import info.fluffos.BisonTokenType;
import generated.psi.impl.*;

public interface GeneratedTypes {

  IElementType ALIAS = new BisonCompositeElementType("ALIAS");
  IElementType BRACED_CODE = new BisonCompositeElementType("BRACED_CODE");
  IElementType CODE_PROPS_TYPE = new BisonCompositeElementType("CODE_PROPS_TYPE");
  IElementType EPILOGUE = new BisonCompositeElementType("EPILOGUE");
  IElementType GENERIC_SYMLIST_ITEM = new BisonCompositeElementType("GENERIC_SYMLIST_ITEM");
  IElementType GRAMMAR_DECLARATION = new BisonCompositeElementType("GRAMMAR_DECLARATION");
  IElementType ID_OR_CHAR_LITERAL = new BisonCompositeElementType("ID_OR_CHAR_LITERAL");
  IElementType NTERM_DECLS = new BisonCompositeElementType("NTERM_DECLS");
  IElementType PRECEDENCE_DECLARATOR = new BisonCompositeElementType("PRECEDENCE_DECLARATOR");
  IElementType PREDICATE = new BisonCompositeElementType("PREDICATE");
  IElementType PROLOGUE = new BisonCompositeElementType("PROLOGUE");
  IElementType PROLOGUE_DECLARATION = new BisonCompositeElementType("PROLOGUE_DECLARATION");
  IElementType RHS = new BisonCompositeElementType("RHS");
  IElementType RULES = new BisonCompositeElementType("RULES");
  IElementType RULES_OR_GRAMMAR_DECLARATION = new BisonCompositeElementType("RULES_OR_GRAMMAR_DECLARATION");
  IElementType STRING_AS_ID = new BisonCompositeElementType("STRING_AS_ID");
  IElementType SYMBOL = new BisonCompositeElementType("SYMBOL");
  IElementType SYMBOL_DECLARATION = new BisonCompositeElementType("SYMBOL_DECLARATION");
  IElementType TAG = new BisonCompositeElementType("TAG");
  IElementType TOKEN_DECL = new BisonCompositeElementType("TOKEN_DECL");
  IElementType TOKEN_DECLS = new BisonCompositeElementType("TOKEN_DECLS");
  IElementType TOKEN_DECL_FOR_PREC = new BisonCompositeElementType("TOKEN_DECL_FOR_PREC");
  IElementType TOKEN_DECL_FOR_PREC_1 = new BisonCompositeElementType("TOKEN_DECL_FOR_PREC_1");
  IElementType UNION_NAME = new BisonCompositeElementType("UNION_NAME");
  IElementType VALUE = new BisonCompositeElementType("VALUE");
  IElementType VARIABLE = new BisonCompositeElementType("VARIABLE");

  IElementType BRACED_CODE_LITERAL = new BisonTokenType("BRACED_CODE_LITERAL");
  IElementType BRACKETED_ID = new BisonTokenType("BRACKETED_ID");
  IElementType CHAR_LITERAL = new BisonTokenType("CHAR_LITERAL");
  IElementType COMMENT = new BisonTokenType("COMMENT");
  IElementType EPILOGUE_LITERAL = new BisonTokenType("EPILOGUE_LITERAL");
  IElementType ERROR = new BisonTokenType("error");
  IElementType ID = new BisonTokenType("ID");
  IElementType ID_COLON = new BisonTokenType("ID_COLON");
  IElementType INT_LITERAL = new BisonTokenType("INT_LITERAL");
  IElementType PREDICATE_LITERAL = new BisonTokenType("PREDICATE_LITERAL");
  IElementType PROLOGUE_LITERAL = new BisonTokenType("PROLOGUE_LITERAL");
  IElementType STRING = new BisonTokenType("STRING");
  IElementType TAG_ANY = new BisonTokenType("TAG_ANY");
  IElementType TAG_NONE = new BisonTokenType("TAG_NONE");
  IElementType TAG_TAG = new BisonTokenType("TAG_TAG");
  IElementType TSTRING = new BisonTokenType("TSTRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALIAS) {
        return new AliasImpl(node);
      }
      else if (type == BRACED_CODE) {
        return new BracedCodeImpl(node);
      }
      else if (type == CODE_PROPS_TYPE) {
        return new CodePropsTypeImpl(node);
      }
      else if (type == EPILOGUE) {
        return new EpilogueImpl(node);
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
      else if (type == NTERM_DECLS) {
        return new NtermDeclsImpl(node);
      }
      else if (type == PRECEDENCE_DECLARATOR) {
        return new PrecedenceDeclaratorImpl(node);
      }
      else if (type == PREDICATE) {
        return new PredicateImpl(node);
      }
      else if (type == PROLOGUE) {
        return new PrologueImpl(node);
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
      else if (type == SYMBOL) {
        return new SymbolImpl(node);
      }
      else if (type == SYMBOL_DECLARATION) {
        return new SymbolDeclarationImpl(node);
      }
      else if (type == TAG) {
        return new TagImpl(node);
      }
      else if (type == TOKEN_DECL) {
        return new TokenDeclImpl(node);
      }
      else if (type == TOKEN_DECLS) {
        return new TokenDeclsImpl(node);
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
