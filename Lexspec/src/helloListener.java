// Generated from hello.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link helloParser}.
 */
public interface helloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link helloParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(helloParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(helloParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(helloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(helloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#defOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterDefOrExpr(helloParser.DefOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#defOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitDefOrExpr(helloParser.DefOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#nameplus}.
	 * @param ctx the parse tree
	 */
	void enterNameplus(helloParser.NameplusContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#nameplus}.
	 * @param ctx the parse tree
	 */
	void exitNameplus(helloParser.NameplusContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#namestar}.
	 * @param ctx the parse tree
	 */
	void enterNamestar(helloParser.NamestarContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#namestar}.
	 * @param ctx the parse tree
	 */
	void exitNamestar(helloParser.NamestarContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#definitionstar}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionstar(helloParser.DefinitionstarContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#definitionstar}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionstar(helloParser.DefinitionstarContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(helloParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(helloParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#exprplus}.
	 * @param ctx the parse tree
	 */
	void enterExprplus(helloParser.ExprplusContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#exprplus}.
	 * @param ctx the parse tree
	 */
	void exitExprplus(helloParser.ExprplusContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#lner}.
	 * @param ctx the parse tree
	 */
	void enterLner(helloParser.LnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#lner}.
	 * @param ctx the parse tree
	 */
	void exitLner(helloParser.LnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#leerbplus}.
	 * @param ctx the parse tree
	 */
	void enterLeerbplus(helloParser.LeerbplusContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#leerbplus}.
	 * @param ctx the parse tree
	 */
	void exitLeerbplus(helloParser.LeerbplusContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#leersqbplus}.
	 * @param ctx the parse tree
	 */
	void enterLeersqbplus(helloParser.LeersqbplusContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#leersqbplus}.
	 * @param ctx the parse tree
	 */
	void exitLeersqbplus(helloParser.LeersqbplusContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#leersqbstar}.
	 * @param ctx the parse tree
	 */
	void enterLeersqbstar(helloParser.LeersqbstarContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#leersqbstar}.
	 * @param ctx the parse tree
	 */
	void exitLeersqbstar(helloParser.LeersqbstarContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(helloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(helloParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#quotedstar}.
	 * @param ctx the parse tree
	 */
	void enterQuotedstar(helloParser.QuotedstarContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#quotedstar}.
	 * @param ctx the parse tree
	 */
	void exitQuotedstar(helloParser.QuotedstarContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#quoted}.
	 * @param ctx the parse tree
	 */
	void enterQuoted(helloParser.QuotedContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#quoted}.
	 * @param ctx the parse tree
	 */
	void exitQuoted(helloParser.QuotedContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#quasiQuotedstar}.
	 * @param ctx the parse tree
	 */
	void enterQuasiQuotedstar(helloParser.QuasiQuotedstarContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#quasiQuotedstar}.
	 * @param ctx the parse tree
	 */
	void exitQuasiQuotedstar(helloParser.QuasiQuotedstarContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#quasiQuoted}.
	 * @param ctx the parse tree
	 */
	void enterQuasiQuoted(helloParser.QuasiQuotedContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#quasiQuoted}.
	 * @param ctx the parse tree
	 */
	void exitQuasiQuoted(helloParser.QuasiQuotedContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#exprquestionmark}.
	 * @param ctx the parse tree
	 */
	void enterExprquestionmark(helloParser.ExprquestionmarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#exprquestionmark}.
	 * @param ctx the parse tree
	 */
	void exitExprquestionmark(helloParser.ExprquestionmarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#testCase}.
	 * @param ctx the parse tree
	 */
	void enterTestCase(helloParser.TestCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#testCase}.
	 * @param ctx the parse tree
	 */
	void exitTestCase(helloParser.TestCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#stringplus}.
	 * @param ctx the parse tree
	 */
	void enterStringplus(helloParser.StringplusContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#stringplus}.
	 * @param ctx the parse tree
	 */
	void exitStringplus(helloParser.StringplusContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#lsprquestionmark}.
	 * @param ctx the parse tree
	 */
	void enterLsprquestionmark(helloParser.LsprquestionmarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#lsprquestionmark}.
	 * @param ctx the parse tree
	 */
	void exitLsprquestionmark(helloParser.LsprquestionmarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#libraryRequire}.
	 * @param ctx the parse tree
	 */
	void enterLibraryRequire(helloParser.LibraryRequireContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#libraryRequire}.
	 * @param ctx the parse tree
	 */
	void exitLibraryRequire(helloParser.LibraryRequireContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#pkg}.
	 * @param ctx the parse tree
	 */
	void enterPkg(helloParser.PkgContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#pkg}.
	 * @param ctx the parse tree
	 */
	void exitPkg(helloParser.PkgContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(helloParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(helloParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(helloParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(helloParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(helloParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(helloParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(helloParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(helloParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(helloParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(helloParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(helloParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(helloParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#reloperators}.
	 * @param ctx the parse tree
	 */
	void enterReloperators(helloParser.ReloperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#reloperators}.
	 * @param ctx the parse tree
	 */
	void exitReloperators(helloParser.ReloperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#arthoperators}.
	 * @param ctx the parse tree
	 */
	void enterArthoperators(helloParser.ArthoperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#arthoperators}.
	 * @param ctx the parse tree
	 */
	void exitArthoperators(helloParser.ArthoperatorsContext ctx);
}