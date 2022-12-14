// Generated from ASTspec.g4 by ANTLR 4.10.1
 import ast.*; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ASTspecParser}.
 */
public interface ASTspecListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ASTspecParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ASTspecParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ASTspecParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ASTspecParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#defOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterDefOrExpr(ASTspecParser.DefOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#defOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitDefOrExpr(ASTspecParser.DefOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#nameplus}.
	 * @param ctx the parse tree
	 */
	void enterNameplus(ASTspecParser.NameplusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#nameplus}.
	 * @param ctx the parse tree
	 */
	void exitNameplus(ASTspecParser.NameplusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#namestar}.
	 * @param ctx the parse tree
	 */
	void enterNamestar(ASTspecParser.NamestarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#namestar}.
	 * @param ctx the parse tree
	 */
	void exitNamestar(ASTspecParser.NamestarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#definitionstar}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionstar(ASTspecParser.DefinitionstarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#definitionstar}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionstar(ASTspecParser.DefinitionstarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(ASTspecParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(ASTspecParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#exprplus}.
	 * @param ctx the parse tree
	 */
	void enterExprplus(ASTspecParser.ExprplusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#exprplus}.
	 * @param ctx the parse tree
	 */
	void exitExprplus(ASTspecParser.ExprplusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#lner}.
	 * @param ctx the parse tree
	 */
	void enterLner(ASTspecParser.LnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#lner}.
	 * @param ctx the parse tree
	 */
	void exitLner(ASTspecParser.LnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#leerbplus}.
	 * @param ctx the parse tree
	 */
	void enterLeerbplus(ASTspecParser.LeerbplusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#leerbplus}.
	 * @param ctx the parse tree
	 */
	void exitLeerbplus(ASTspecParser.LeerbplusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#leersqbplus}.
	 * @param ctx the parse tree
	 */
	void enterLeersqbplus(ASTspecParser.LeersqbplusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#leersqbplus}.
	 * @param ctx the parse tree
	 */
	void exitLeersqbplus(ASTspecParser.LeersqbplusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#leersqbstar}.
	 * @param ctx the parse tree
	 */
	void enterLeersqbstar(ASTspecParser.LeersqbstarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#leersqbstar}.
	 * @param ctx the parse tree
	 */
	void exitLeersqbstar(ASTspecParser.LeersqbstarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ASTspecParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ASTspecParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#pkg}.
	 * @param ctx the parse tree
	 */
	void enterPkg(ASTspecParser.PkgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#pkg}.
	 * @param ctx the parse tree
	 */
	void exitPkg(ASTspecParser.PkgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ASTspecParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ASTspecParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(ASTspecParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(ASTspecParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ASTspecParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ASTspecParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(ASTspecParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(ASTspecParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(ASTspecParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(ASTspecParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(ASTspecParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(ASTspecParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#reloperators}.
	 * @param ctx the parse tree
	 */
	void enterReloperators(ASTspecParser.ReloperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#reloperators}.
	 * @param ctx the parse tree
	 */
	void exitReloperators(ASTspecParser.ReloperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTspecParser#arthoperators}.
	 * @param ctx the parse tree
	 */
	void enterArthoperators(ASTspecParser.ArthoperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTspecParser#arthoperators}.
	 * @param ctx the parse tree
	 */
	void exitArthoperators(ASTspecParser.ArthoperatorsContext ctx);
}