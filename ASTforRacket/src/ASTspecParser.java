// Generated from ASTspec.g4 by ANTLR 4.10.1
 import ast.*; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ASTspecParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGINN=1, BEGINN0=2, SETNQ=3, SET=4, DELAY=5, CAR=6, CDR=7, COMBINATIONS=8, 
		LIST=9, REVERSE=10, APPEND=11, LAMBDA=12, LAMBDASYM=13, LOCAL=14, LETREC=15, 
		SHARED=16, LET=17, LETSTAR=18, RECUR=19, COND=20, ELSE=21, IF=22, AND=23, 
		OR=24, TSCHECKEXP=25, TSCHECKRAND=26, TSCHECKWITHIN=27, TSCHECKMEMBEROF=28, 
		TSCHECKSATSIS=29, TSCHECKERROR=30, REQUIRE=31, DISPLAY=32, DEFINE=33, 
		NEWLINE=34, EMPTY=35, DEFINESTRUCT=36, QSMARK=37, QUOTESX=38, QUOTEQUOTED=39, 
		LEFTB=40, RIGHTB=41, LEFTSQB=42, RIGHTSQB=43, QUOTEQUASIQUOTED=44, CHARACTERQUOTED=45, 
		ARTHOPERATORS=46, BOOLEAN=47, RELOPERATORS=48, SYMBOL=49, INT=50, DECIMAL=51, 
		NAME=52, COMMA=53, COMMAAT=54, STRING=55, CHARACTER=56, LANG=57, COMMENT=58, 
		WS=59;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_defOrExpr = 2, RULE_nameplus = 3, 
		RULE_namestar = 4, RULE_definitionstar = 5, RULE_definition = 6, RULE_exprplus = 7, 
		RULE_lner = 8, RULE_leerbplus = 9, RULE_leersqbplus = 10, RULE_leersqbstar = 11, 
		RULE_expr = 12, RULE_pkg = 13, RULE_name = 14, RULE_symbol = 15, RULE_number = 16, 
		RULE_bool = 17, RULE_string = 18, RULE_character = 19, RULE_reloperators = 20, 
		RULE_arthoperators = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "defOrExpr", "nameplus", "namestar", "definitionstar", 
			"definition", "exprplus", "lner", "leerbplus", "leersqbplus", "leersqbstar", 
			"expr", "pkg", "name", "symbol", "number", "bool", "string", "character", 
			"reloperators", "arthoperators"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'begin0'", "'set!'", "'set'", "'delay'", "'car'", "'cdr'", 
			"'combinations'", "'list'", "'reverse'", "'append'", "'lambda'", "'\\u03BB'", 
			"'local'", "'letrec'", "'shared'", "'let'", "'let*'", "'recur'", "'cond'", 
			"'else '", "'if'", "'and'", "'or'", "'check-expect'", "'check-random'", 
			"'check-within'", "'check-member-of'", "'check-satisfied'", "'check-error'", 
			"'require'", "'display'", "'define'", "'newline'", "'empty'", "'define-struct'", 
			"'?'", "'\\u2019()'", "'\\u2019'", "'('", "')'", "'['", "']'", "'\\u2018'", 
			null, null, null, null, null, null, null, null, "','", "',@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BEGINN", "BEGINN0", "SETNQ", "SET", "DELAY", "CAR", "CDR", "COMBINATIONS", 
			"LIST", "REVERSE", "APPEND", "LAMBDA", "LAMBDASYM", "LOCAL", "LETREC", 
			"SHARED", "LET", "LETSTAR", "RECUR", "COND", "ELSE", "IF", "AND", "OR", 
			"TSCHECKEXP", "TSCHECKRAND", "TSCHECKWITHIN", "TSCHECKMEMBEROF", "TSCHECKSATSIS", 
			"TSCHECKERROR", "REQUIRE", "DISPLAY", "DEFINE", "NEWLINE", "EMPTY", "DEFINESTRUCT", 
			"QSMARK", "QUOTESX", "QUOTEQUOTED", "LEFTB", "RIGHTB", "LEFTSQB", "RIGHTSQB", 
			"QUOTEQUASIQUOTED", "CHARACTERQUOTED", "ARTHOPERATORS", "BOOLEAN", "RELOPERATORS", 
			"SYMBOL", "INT", "DECIMAL", "NAME", "COMMA", "COMMAAT", "STRING", "CHARACTER", 
			"LANG", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ASTspec.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ASTspecParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ProgramContext t1;
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((StartContext)_localctx).t1 = program();
			((StartContext)_localctx).t1.node.print();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public ASTNode node;
		public DefOrExprContext t1;
		public ProgramContext t2;
		public DefOrExprContext t3;
		public TerminalNode EOF() { return getToken(ASTspecParser.EOF, 0); }
		public DefOrExprContext defOrExpr() {
			return getRuleContext(DefOrExprContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				((ProgramContext)_localctx).t1 = defOrExpr();
				setState(48);
				((ProgramContext)_localctx).t2 = program();
				setState(49);
				match(EOF);
				((ProgramContext)_localctx).node =  new defOrExpr_program_eof_program(((ProgramContext)_localctx).t1.node,((ProgramContext)_localctx).t2.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				((ProgramContext)_localctx).t3 = defOrExpr();
				((ProgramContext)_localctx).node =  new defOrExpr_program(((ProgramContext)_localctx).t3.node);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefOrExprContext extends ParserRuleContext {
		public ASTNode node;
		public DefinitionContext t1;
		public ExprContext t2;
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defOrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterDefOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitDefOrExpr(this);
		}
	}

	public final DefOrExprContext defOrExpr() throws RecognitionException {
		DefOrExprContext _localctx = new DefOrExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defOrExpr);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				((DefOrExprContext)_localctx).t1 = definition();
				((DefOrExprContext)_localctx).node =  new definition_defOrExpr(((DefOrExprContext)_localctx).t1.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				((DefOrExprContext)_localctx).t2 = expr();
				((DefOrExprContext)_localctx).node =  new expr_defOrExpr(((DefOrExprContext)_localctx).t2.node);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameplusContext extends ParserRuleContext {
		public ASTNode node;
		public NameContext t1;
		public NameplusContext t2;
		public NameContext t3;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameplusContext nameplus() {
			return getRuleContext(NameplusContext.class,0);
		}
		public NameplusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameplus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterNameplus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitNameplus(this);
		}
	}

	public final NameplusContext nameplus() throws RecognitionException {
		NameplusContext _localctx = new NameplusContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nameplus);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				((NameplusContext)_localctx).t1 = name();
				setState(66);
				((NameplusContext)_localctx).t2 = nameplus();
				((NameplusContext)_localctx).node =  new name_nameplus_nameplus(((NameplusContext)_localctx).t1.node,((NameplusContext)_localctx).t2.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				((NameplusContext)_localctx).t3 = name();
				_localctx.node = ((NameplusContext)_localctx).t3.node;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamestarContext extends ParserRuleContext {
		public ASTNode node;
		public NameContext t1;
		public NamestarContext t2;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NamestarContext namestar() {
			return getRuleContext(NamestarContext.class,0);
		}
		public NamestarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namestar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterNamestar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitNamestar(this);
		}
	}

	public final NamestarContext namestar() throws RecognitionException {
		NamestarContext _localctx = new NamestarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_namestar);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				((NamestarContext)_localctx).t1 = name();
				setState(75);
				((NamestarContext)_localctx).t2 = namestar();
				((NamestarContext)_localctx).node =  new name_namestar_namestar(((NamestarContext)_localctx).t1.node,((NamestarContext)_localctx).t2.node);
				}
				break;
			case RIGHTB:
				enterOuterAlt(_localctx, 2);
				{
				((NamestarContext)_localctx).node =  new epsilon_namestar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionstarContext extends ParserRuleContext {
		public ASTNode node;
		public DefinitionContext t1;
		public DefinitionstarContext t2;
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public DefinitionstarContext definitionstar() {
			return getRuleContext(DefinitionstarContext.class,0);
		}
		public DefinitionstarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionstar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterDefinitionstar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitDefinitionstar(this);
		}
	}

	public final DefinitionstarContext definitionstar() throws RecognitionException {
		DefinitionstarContext _localctx = new DefinitionstarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definitionstar);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTB:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				((DefinitionstarContext)_localctx).t1 = definition();
				setState(82);
				((DefinitionstarContext)_localctx).t2 = definitionstar();
				((DefinitionstarContext)_localctx).node =  new definition_definitionstar_definitionstar(((DefinitionstarContext)_localctx).t1.node,((DefinitionstarContext)_localctx).t2.node);
				}
				break;
			case RIGHTSQB:
				enterOuterAlt(_localctx, 2);
				{
				((DefinitionstarContext)_localctx).node =  new epsilon_definitionstar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public ASTNode node;
		public NameContext t1;
		public ExprContext t2;
		public NameContext t3;
		public NameplusContext t4;
		public ExprContext t5;
		public NameContext t6;
		public NamestarContext t7;
		public List<TerminalNode> LEFTB() { return getTokens(ASTspecParser.LEFTB); }
		public TerminalNode LEFTB(int i) {
			return getToken(ASTspecParser.LEFTB, i);
		}
		public TerminalNode DEFINE() { return getToken(ASTspecParser.DEFINE, 0); }
		public List<TerminalNode> RIGHTB() { return getTokens(ASTspecParser.RIGHTB); }
		public TerminalNode RIGHTB(int i) {
			return getToken(ASTspecParser.RIGHTB, i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NameplusContext nameplus() {
			return getRuleContext(NameplusContext.class,0);
		}
		public TerminalNode DEFINESTRUCT() { return getToken(ASTspecParser.DEFINESTRUCT, 0); }
		public NamestarContext namestar() {
			return getRuleContext(NamestarContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_definition);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(88);
				match(LEFTB);
				setState(89);
				match(DEFINE);
				setState(90);
				((DefinitionContext)_localctx).t1 = name();
				setState(91);
				((DefinitionContext)_localctx).t2 = expr();
				setState(92);
				match(RIGHTB);
				((DefinitionContext)_localctx).node =  new lb_def_name_expr_rb_definition(((DefinitionContext)_localctx).t1.node,((DefinitionContext)_localctx).t2.node);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(95);
				match(LEFTB);
				setState(96);
				match(DEFINE);
				setState(97);
				match(LEFTB);
				setState(98);
				((DefinitionContext)_localctx).t3 = name();
				setState(99);
				((DefinitionContext)_localctx).t4 = nameplus();
				setState(100);
				match(RIGHTB);
				setState(101);
				((DefinitionContext)_localctx).t5 = expr();
				setState(102);
				match(RIGHTB);
				((DefinitionContext)_localctx).node =  new lb_def_lb_name_nameplus_rb_expr_rb_definition(((DefinitionContext)_localctx).t3.node,((DefinitionContext)_localctx).t4.node,((DefinitionContext)_localctx).t5.node);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(105);
				match(LEFTB);
				setState(106);
				match(DEFINESTRUCT);
				setState(107);
				((DefinitionContext)_localctx).t6 = name();
				setState(108);
				match(LEFTB);
				setState(109);
				((DefinitionContext)_localctx).t7 = namestar();
				setState(110);
				match(RIGHTB);
				setState(111);
				match(RIGHTB);
				((DefinitionContext)_localctx).node =  new lb_defs_name_lb_namestar_rb_rb(((DefinitionContext)_localctx).t6.node,((DefinitionContext)_localctx).t7.node);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprplusContext extends ParserRuleContext {
		public ASTNode node;
		public ExprContext t1;
		public ExprplusContext t2;
		public ExprContext t3;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprplusContext exprplus() {
			return getRuleContext(ExprplusContext.class,0);
		}
		public ExprplusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprplus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterExprplus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitExprplus(this);
		}
	}

	public final ExprplusContext exprplus() throws RecognitionException {
		ExprplusContext _localctx = new ExprplusContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprplus);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				((ExprplusContext)_localctx).t1 = expr();
				setState(117);
				((ExprplusContext)_localctx).t2 = exprplus();
				((ExprplusContext)_localctx).node =  new expr_exprplus_exprplus(((ExprplusContext)_localctx).t1.node,((ExprplusContext)_localctx).t2.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				((ExprplusContext)_localctx).t3 = expr();
				((ExprplusContext)_localctx).node =  new expr_exprplus(((ExprplusContext)_localctx).t3.node);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LnerContext extends ParserRuleContext {
		public ASTNode node;
		public NameContext t1;
		public ExprContext t2;
		public LnerContext t3;
		public TerminalNode LEFTSQB() { return getToken(ASTspecParser.LEFTSQB, 0); }
		public TerminalNode RIGHTSQB() { return getToken(ASTspecParser.RIGHTSQB, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LnerContext lner() {
			return getRuleContext(LnerContext.class,0);
		}
		public LnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterLner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitLner(this);
		}
	}

	public final LnerContext lner() throws RecognitionException {
		LnerContext _localctx = new LnerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lner);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTSQB:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(125);
				match(LEFTSQB);
				setState(126);
				((LnerContext)_localctx).t1 = name();
				setState(127);
				((LnerContext)_localctx).t2 = expr();
				setState(128);
				match(RIGHTSQB);
				setState(129);
				((LnerContext)_localctx).t3 = lner();
				((LnerContext)_localctx).node =  new lsqb_name_expr_rsqb_lner_lner(((LnerContext)_localctx).t1.node,((LnerContext)_localctx).t2.node,((LnerContext)_localctx).t3.node);
				}
				}
				break;
			case RIGHTB:
				enterOuterAlt(_localctx, 2);
				{
				((LnerContext)_localctx).node =  new epsilon_lner();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeerbplusContext extends ParserRuleContext {
		public ASTNode node;
		public ExprContext t1;
		public ExprContext t2;
		public LeerbplusContext t3;
		public ExprContext t4;
		public ExprContext t5;
		public TerminalNode LEFTB() { return getToken(ASTspecParser.LEFTB, 0); }
		public TerminalNode RIGHTB() { return getToken(ASTspecParser.RIGHTB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LeerbplusContext leerbplus() {
			return getRuleContext(LeerbplusContext.class,0);
		}
		public LeerbplusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leerbplus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterLeerbplus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitLeerbplus(this);
		}
	}

	public final LeerbplusContext leerbplus() throws RecognitionException {
		LeerbplusContext _localctx = new LeerbplusContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_leerbplus);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(135);
				match(LEFTB);
				setState(136);
				((LeerbplusContext)_localctx).t1 = expr();
				setState(137);
				((LeerbplusContext)_localctx).t2 = expr();
				setState(138);
				match(RIGHTB);
				setState(139);
				((LeerbplusContext)_localctx).t3 = leerbplus();
				((LeerbplusContext)_localctx).node =  new lb_expr_expr_rb_leerbplus_leerbplus(((LeerbplusContext)_localctx).t1.node,((LeerbplusContext)_localctx).t2.node,((LeerbplusContext)_localctx).t3.node);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(142);
				match(LEFTB);
				setState(143);
				((LeerbplusContext)_localctx).t4 = expr();
				setState(144);
				((LeerbplusContext)_localctx).t5 = expr();
				setState(145);
				match(RIGHTB);
				((LeerbplusContext)_localctx).node =  new lb_expr_expr_rb_leerbplus(((LeerbplusContext)_localctx).t4.node,((LeerbplusContext)_localctx).t5.node);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeersqbplusContext extends ParserRuleContext {
		public ASTNode node;
		public ExprContext t1;
		public ExprContext t2;
		public LeersqbplusContext t3;
		public ExprContext t4;
		public ExprContext t5;
		public TerminalNode LEFTSQB() { return getToken(ASTspecParser.LEFTSQB, 0); }
		public TerminalNode RIGHTSQB() { return getToken(ASTspecParser.RIGHTSQB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LeersqbplusContext leersqbplus() {
			return getRuleContext(LeersqbplusContext.class,0);
		}
		public LeersqbplusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leersqbplus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterLeersqbplus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitLeersqbplus(this);
		}
	}

	public final LeersqbplusContext leersqbplus() throws RecognitionException {
		LeersqbplusContext _localctx = new LeersqbplusContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_leersqbplus);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(150);
				match(LEFTSQB);
				setState(151);
				((LeersqbplusContext)_localctx).t1 = expr();
				setState(152);
				((LeersqbplusContext)_localctx).t2 = expr();
				setState(153);
				match(RIGHTSQB);
				setState(154);
				((LeersqbplusContext)_localctx).t3 = leersqbplus();
				((LeersqbplusContext)_localctx).node =  new lsqb_expr_expr_rsqb_leersqbplus_leersqbplus(((LeersqbplusContext)_localctx).t1.node,((LeersqbplusContext)_localctx).t2.node,((LeersqbplusContext)_localctx).t3.node);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(157);
				match(LEFTSQB);
				setState(158);
				((LeersqbplusContext)_localctx).t4 = expr();
				setState(159);
				((LeersqbplusContext)_localctx).t5 = expr();
				setState(160);
				match(RIGHTSQB);
				((LeersqbplusContext)_localctx).node =  new lsqb_expr_expr_rsqb_leersqbplus(((LeersqbplusContext)_localctx).t4.node,((LeersqbplusContext)_localctx).t5.node);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeersqbstarContext extends ParserRuleContext {
		public ASTNode node;
		public ExprContext t1;
		public ExprContext t2;
		public LeersqbstarContext t3;
		public TerminalNode LEFTSQB() { return getToken(ASTspecParser.LEFTSQB, 0); }
		public TerminalNode RIGHTSQB() { return getToken(ASTspecParser.RIGHTSQB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LeersqbstarContext leersqbstar() {
			return getRuleContext(LeersqbstarContext.class,0);
		}
		public LeersqbstarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leersqbstar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterLeersqbstar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitLeersqbstar(this);
		}
	}

	public final LeersqbstarContext leersqbstar() throws RecognitionException {
		LeersqbstarContext _localctx = new LeersqbstarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_leersqbstar);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(165);
				match(LEFTSQB);
				setState(166);
				((LeersqbstarContext)_localctx).t1 = expr();
				setState(167);
				((LeersqbstarContext)_localctx).t2 = expr();
				setState(168);
				match(RIGHTSQB);
				setState(169);
				((LeersqbstarContext)_localctx).t3 = leersqbstar();
				((LeersqbstarContext)_localctx).node =  new lsqb_expr_expr_rsqb_leersqbstar_leersqbstar(((LeersqbstarContext)_localctx).t1.node,((LeersqbstarContext)_localctx).t2.node,((LeersqbstarContext)_localctx).t3.node);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((LeersqbstarContext)_localctx).node =  new epsilon_leersqbstar();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ASTNode node;
		public ExprplusContext t1;
		public ExprplusContext t2;
		public ExprContext t3;
		public ExprContext t4;
		public ExprContext t5;
		public ExprContext t6;
		public ExprContext t7;
		public ExprContext t8;
		public ExprContext t9;
		public ExprContext t10;
		public NamestarContext t11;
		public ExprContext t12;
		public NamestarContext t13;
		public ExprContext t14;
		public DefinitionstarContext t15;
		public ExprContext t16;
		public LnerContext t17;
		public ExprContext t18;
		public LnerContext t19;
		public ExprContext t20;
		public LnerContext t21;
		public ExprContext t22;
		public LnerContext t23;
		public ExprContext t24;
		public NameContext t25;
		public LnerContext t26;
		public ExprContext t27;
		public NameContext t28;
		public ExprplusContext t29;
		public LeerbplusContext t30;
		public LeersqbplusContext t31;
		public LeersqbstarContext t32;
		public ExprContext t33;
		public ExprContext t34;
		public ExprContext t35;
		public ExprContext t36;
		public ExprContext t37;
		public ExprplusContext t38;
		public ExprContext t39;
		public ExprplusContext t40;
		public Token DISPLAY;
		public NameContext t41;
		public StringContext t42;
		public Token NEWLINE;
		public Token EMPTY;
		public Token QUOTESX;
		public Token QSMARK;
		public Token CHARACTERQUOTED;
		public ReloperatorsContext t43;
		public ArthoperatorsContext t44;
		public NameContext t45;
		public NumberContext t46;
		public SymbolContext t47;
		public BoolContext t48;
		public StringContext t49;
		public CharacterContext t50;
		public List<TerminalNode> LEFTB() { return getTokens(ASTspecParser.LEFTB); }
		public TerminalNode LEFTB(int i) {
			return getToken(ASTspecParser.LEFTB, i);
		}
		public TerminalNode BEGINN() { return getToken(ASTspecParser.BEGINN, 0); }
		public List<TerminalNode> RIGHTB() { return getTokens(ASTspecParser.RIGHTB); }
		public TerminalNode RIGHTB(int i) {
			return getToken(ASTspecParser.RIGHTB, i);
		}
		public ExprplusContext exprplus() {
			return getRuleContext(ExprplusContext.class,0);
		}
		public TerminalNode BEGINN0() { return getToken(ASTspecParser.BEGINN0, 0); }
		public TerminalNode SETNQ() { return getToken(ASTspecParser.SETNQ, 0); }
		public TerminalNode NAME() { return getToken(ASTspecParser.NAME, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DELAY() { return getToken(ASTspecParser.DELAY, 0); }
		public TerminalNode CAR() { return getToken(ASTspecParser.CAR, 0); }
		public TerminalNode CDR() { return getToken(ASTspecParser.CDR, 0); }
		public TerminalNode COMBINATIONS() { return getToken(ASTspecParser.COMBINATIONS, 0); }
		public TerminalNode LIST() { return getToken(ASTspecParser.LIST, 0); }
		public TerminalNode REVERSE() { return getToken(ASTspecParser.REVERSE, 0); }
		public TerminalNode APPEND() { return getToken(ASTspecParser.APPEND, 0); }
		public TerminalNode LAMBDA() { return getToken(ASTspecParser.LAMBDA, 0); }
		public NamestarContext namestar() {
			return getRuleContext(NamestarContext.class,0);
		}
		public TerminalNode LAMBDASYM() { return getToken(ASTspecParser.LAMBDASYM, 0); }
		public TerminalNode LOCAL() { return getToken(ASTspecParser.LOCAL, 0); }
		public TerminalNode LEFTSQB() { return getToken(ASTspecParser.LEFTSQB, 0); }
		public TerminalNode RIGHTSQB() { return getToken(ASTspecParser.RIGHTSQB, 0); }
		public DefinitionstarContext definitionstar() {
			return getRuleContext(DefinitionstarContext.class,0);
		}
		public TerminalNode LETREC() { return getToken(ASTspecParser.LETREC, 0); }
		public LnerContext lner() {
			return getRuleContext(LnerContext.class,0);
		}
		public TerminalNode SHARED() { return getToken(ASTspecParser.SHARED, 0); }
		public TerminalNode LET() { return getToken(ASTspecParser.LET, 0); }
		public TerminalNode LETSTAR() { return getToken(ASTspecParser.LETSTAR, 0); }
		public TerminalNode RECUR() { return getToken(ASTspecParser.RECUR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COND() { return getToken(ASTspecParser.COND, 0); }
		public LeerbplusContext leerbplus() {
			return getRuleContext(LeerbplusContext.class,0);
		}
		public LeersqbplusContext leersqbplus() {
			return getRuleContext(LeersqbplusContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(ASTspecParser.ELSE, 0); }
		public LeersqbstarContext leersqbstar() {
			return getRuleContext(LeersqbstarContext.class,0);
		}
		public TerminalNode IF() { return getToken(ASTspecParser.IF, 0); }
		public TerminalNode AND() { return getToken(ASTspecParser.AND, 0); }
		public TerminalNode OR() { return getToken(ASTspecParser.OR, 0); }
		public TerminalNode DISPLAY() { return getToken(ASTspecParser.DISPLAY, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ASTspecParser.NEWLINE, 0); }
		public TerminalNode EMPTY() { return getToken(ASTspecParser.EMPTY, 0); }
		public TerminalNode QUOTESX() { return getToken(ASTspecParser.QUOTESX, 0); }
		public TerminalNode QSMARK() { return getToken(ASTspecParser.QSMARK, 0); }
		public TerminalNode CHARACTERQUOTED() { return getToken(ASTspecParser.CHARACTERQUOTED, 0); }
		public ReloperatorsContext reloperators() {
			return getRuleContext(ReloperatorsContext.class,0);
		}
		public ArthoperatorsContext arthoperators() {
			return getRuleContext(ArthoperatorsContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(175);
				match(LEFTB);
				setState(176);
				match(BEGINN);
				setState(177);
				((ExprContext)_localctx).t1 = exprplus();
				setState(178);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_begin_exprplus_rb_expr(((ExprContext)_localctx).t1.node);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(181);
				match(LEFTB);
				setState(182);
				match(BEGINN0);
				setState(183);
				((ExprContext)_localctx).t2 = exprplus();
				setState(184);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_begin0_exprplus_rb_expr(((ExprContext)_localctx).t2.node);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(187);
				match(LEFTB);
				setState(188);
				match(SETNQ);
				setState(189);
				match(NAME);
				setState(190);
				((ExprContext)_localctx).t3 = expr();
				setState(191);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_setnq_name_expr_rb_expr(((ExprContext)_localctx).t3.node);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(194);
				match(LEFTB);
				setState(195);
				match(DELAY);
				setState(196);
				((ExprContext)_localctx).t4 = expr();
				setState(197);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_delay_expr_rb_expr(((ExprContext)_localctx).t4.node);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(200);
				match(LEFTB);
				setState(201);
				match(CAR);
				setState(202);
				((ExprContext)_localctx).t5 = expr();
				setState(203);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_car_expr_rb_expr(((ExprContext)_localctx).t5.node);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(206);
				match(LEFTB);
				setState(207);
				match(CDR);
				setState(208);
				((ExprContext)_localctx).t6 = expr();
				setState(209);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_cdr_expr_rb_expr(((ExprContext)_localctx).t6.node);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(212);
				match(LEFTB);
				setState(213);
				match(COMBINATIONS);
				setState(214);
				((ExprContext)_localctx).t7 = expr();
				setState(215);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_combinations_expr_rb_expr(((ExprContext)_localctx).t7.node);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(218);
				match(LEFTB);
				setState(219);
				match(LIST);
				setState(220);
				((ExprContext)_localctx).t8 = expr();
				setState(221);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_list_expr_rb_expr(((ExprContext)_localctx).t8.node);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(224);
				match(LEFTB);
				setState(225);
				match(REVERSE);
				setState(226);
				((ExprContext)_localctx).t9 = expr();
				setState(227);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_reverse_expr_rb_expr(((ExprContext)_localctx).t9.node);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(230);
				match(LEFTB);
				setState(231);
				match(APPEND);
				setState(232);
				match(NAME);
				setState(233);
				((ExprContext)_localctx).t10 = expr();
				setState(234);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_append_name_expr_rb_expr(((ExprContext)_localctx).t10.node);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(237);
				match(LEFTB);
				setState(238);
				match(LAMBDA);
				setState(239);
				match(LEFTB);
				setState(240);
				((ExprContext)_localctx).t11 = namestar();
				setState(241);
				match(RIGHTB);
				setState(242);
				((ExprContext)_localctx).t12 = expr();
				setState(243);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_lambda_lb_namestar_rb_expr_rb_expr(((ExprContext)_localctx).t11.node,((ExprContext)_localctx).t12.node);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(246);
				match(LEFTB);
				setState(247);
				match(LAMBDASYM);
				setState(248);
				match(LEFTB);
				setState(249);
				((ExprContext)_localctx).t13 = namestar();
				setState(250);
				match(RIGHTB);
				setState(251);
				((ExprContext)_localctx).t14 = expr();
				setState(252);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_lambdasym_lb_namestar_rb_expr_rb_expr(((ExprContext)_localctx).t13.node,((ExprContext)_localctx).t14.node);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(255);
				match(LEFTB);
				setState(256);
				match(LOCAL);
				setState(257);
				match(LEFTSQB);
				setState(258);
				((ExprContext)_localctx).t15 = definitionstar();
				setState(259);
				match(RIGHTSQB);
				setState(260);
				((ExprContext)_localctx).t16 = expr();
				setState(261);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_local_lsqb_definitionstar_rsqb_expr_rb_expr(((ExprContext)_localctx).t15.node,((ExprContext)_localctx).t16.node);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				{
				setState(264);
				match(LEFTB);
				setState(265);
				match(LETREC);
				setState(266);
				match(LEFTB);
				setState(267);
				((ExprContext)_localctx).t17 = lner();
				setState(268);
				match(RIGHTB);
				setState(269);
				((ExprContext)_localctx).t18 = expr();
				setState(270);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_letrec_lb_definitionstar_rsqb_expr_rb_expr(((ExprContext)_localctx).t17.node,((ExprContext)_localctx).t18.node);
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				{
				setState(273);
				match(LEFTB);
				setState(274);
				match(SHARED);
				setState(275);
				match(LEFTB);
				setState(276);
				((ExprContext)_localctx).t19 = lner();
				setState(277);
				match(RIGHTB);
				setState(278);
				((ExprContext)_localctx).t20 = expr();
				setState(279);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_shared_lb_lner_rb_expr_rb_expr(((ExprContext)_localctx).t19.node,((ExprContext)_localctx).t20.node);
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(282);
				match(LEFTB);
				setState(283);
				match(LET);
				setState(284);
				match(LEFTB);
				setState(285);
				((ExprContext)_localctx).t21 = lner();
				setState(286);
				match(RIGHTB);
				setState(287);
				((ExprContext)_localctx).t22 = expr();
				setState(288);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_let_lb_lner_rb_expr_rb_expr(((ExprContext)_localctx).t21.node,((ExprContext)_localctx).t22.node);
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(291);
				match(LEFTB);
				setState(292);
				match(LETSTAR);
				setState(293);
				match(LEFTB);
				setState(294);
				((ExprContext)_localctx).t23 = lner();
				setState(295);
				match(RIGHTB);
				setState(296);
				((ExprContext)_localctx).t24 = expr();
				setState(297);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_letstar_lb_lner_rb_expr_rb_expr(((ExprContext)_localctx).t23.node,((ExprContext)_localctx).t24.node);
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				{
				setState(300);
				match(LEFTB);
				setState(301);
				match(RECUR);
				setState(302);
				((ExprContext)_localctx).t25 = name();
				setState(303);
				match(LEFTB);
				setState(304);
				((ExprContext)_localctx).t26 = lner();
				setState(305);
				match(RIGHTB);
				setState(306);
				((ExprContext)_localctx).t27 = expr();
				setState(307);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_recur_name_lb_lner_rb_expr_rb_expr(((ExprContext)_localctx).t25.node,((ExprContext)_localctx).t26.node,((ExprContext)_localctx).t27.node);
				}
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				{
				setState(310);
				match(LEFTB);
				setState(311);
				((ExprContext)_localctx).t28 = name();
				setState(312);
				((ExprContext)_localctx).t29 = exprplus();
				setState(313);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_name_exprplus_rb_expr(((ExprContext)_localctx).t28.node,((ExprContext)_localctx).t29.node);
				}
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				{
				setState(316);
				match(LEFTB);
				setState(317);
				match(COND);
				setState(318);
				((ExprContext)_localctx).t30 = leerbplus();
				setState(319);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_cond_leerbplus_rb_expr(((ExprContext)_localctx).t30.node);
				}
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				{
				setState(322);
				match(LEFTB);
				setState(323);
				match(COND);
				setState(324);
				((ExprContext)_localctx).t31 = leersqbplus();
				setState(325);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_cond_leersqbplus_rb_expr(((ExprContext)_localctx).t31.node);
				}
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				{
				setState(328);
				match(LEFTB);
				setState(329);
				match(COND);
				setState(330);
				((ExprContext)_localctx).t32 = leersqbstar();
				setState(331);
				match(LEFTSQB);
				setState(332);
				match(ELSE);
				setState(333);
				((ExprContext)_localctx).t33 = expr();
				setState(334);
				match(RIGHTSQB);
				setState(335);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_cond_leersqbstar_lsqb_else_expr_rsqb_rb_expr(((ExprContext)_localctx).t32.node,((ExprContext)_localctx).t33.node);
				}
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				{
				setState(338);
				match(LEFTB);
				setState(339);
				match(IF);
				setState(340);
				((ExprContext)_localctx).t34 = expr();
				setState(341);
				((ExprContext)_localctx).t35 = expr();
				setState(342);
				((ExprContext)_localctx).t36 = expr();
				setState(343);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_if_expr_expr_expr_rb_expr(((ExprContext)_localctx).t34.node,((ExprContext)_localctx).t35.node,((ExprContext)_localctx).t36.node);
				}
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				{
				setState(346);
				match(LEFTB);
				setState(347);
				match(AND);
				setState(348);
				((ExprContext)_localctx).t37 = expr();
				setState(349);
				((ExprContext)_localctx).t38 = exprplus();
				setState(350);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_and_expr_exprplus_rb_expr(((ExprContext)_localctx).t37.node,((ExprContext)_localctx).t38.node);
				}
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				{
				setState(353);
				match(LEFTB);
				setState(354);
				match(OR);
				setState(355);
				((ExprContext)_localctx).t39 = expr();
				setState(356);
				((ExprContext)_localctx).t40 = exprplus();
				setState(357);
				match(RIGHTB);
				((ExprContext)_localctx).node =  new lb_or_expr_exprplus_rb_expr(((ExprContext)_localctx).t39.node,((ExprContext)_localctx).t40.node);
				}
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				{
				setState(360);
				((ExprContext)_localctx).DISPLAY = match(DISPLAY);
				setState(361);
				((ExprContext)_localctx).t41 = name();
				((ExprContext)_localctx).node =  new display_name_expr((((ExprContext)_localctx).DISPLAY!=null?((ExprContext)_localctx).DISPLAY.getText():null),((ExprContext)_localctx).t41.node);
				}
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				{
				setState(364);
				((ExprContext)_localctx).DISPLAY = match(DISPLAY);
				setState(365);
				((ExprContext)_localctx).t42 = string();
				((ExprContext)_localctx).node =  new display_string_expr((((ExprContext)_localctx).DISPLAY!=null?((ExprContext)_localctx).DISPLAY.getText():null),((ExprContext)_localctx).t42.node);
				}
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(368);
				((ExprContext)_localctx).NEWLINE = match(NEWLINE);
				 ((ExprContext)_localctx).node =  new newline_expr((((ExprContext)_localctx).NEWLINE!=null?((ExprContext)_localctx).NEWLINE.getText():null));
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(370);
				((ExprContext)_localctx).EMPTY = match(EMPTY);
				 ((ExprContext)_localctx).node =  new empty_expr((((ExprContext)_localctx).EMPTY!=null?((ExprContext)_localctx).EMPTY.getText():null));
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(372);
				((ExprContext)_localctx).QUOTESX = match(QUOTESX);
				 ((ExprContext)_localctx).node =  new quotesx_expr((((ExprContext)_localctx).QUOTESX!=null?((ExprContext)_localctx).QUOTESX.getText():null));
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(374);
				((ExprContext)_localctx).QSMARK = match(QSMARK);
				 ((ExprContext)_localctx).node =  new qsmark_expr((((ExprContext)_localctx).QSMARK!=null?((ExprContext)_localctx).QSMARK.getText():null));
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(376);
				((ExprContext)_localctx).CHARACTERQUOTED = match(CHARACTERQUOTED);
				 ((ExprContext)_localctx).node =  new characterquoted_expr((((ExprContext)_localctx).CHARACTERQUOTED!=null?((ExprContext)_localctx).CHARACTERQUOTED.getText():null));
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(378);
				((ExprContext)_localctx).t43 = reloperators();
				_localctx.node = ((ExprContext)_localctx).t43.node;
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(381);
				((ExprContext)_localctx).t44 = arthoperators();
				_localctx.node = ((ExprContext)_localctx).t44.node;
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(384);
				((ExprContext)_localctx).t45 = name();
				_localctx.node = ((ExprContext)_localctx).t45.node;
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(387);
				((ExprContext)_localctx).t46 = number();
				_localctx.node = ((ExprContext)_localctx).t46.node;
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(390);
				((ExprContext)_localctx).t47 = symbol();
				_localctx.node = ((ExprContext)_localctx).t47.node;
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(393);
				((ExprContext)_localctx).t48 = bool();
				_localctx.node = ((ExprContext)_localctx).t48.node;
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(396);
				((ExprContext)_localctx).t49 = string();
				_localctx.node = ((ExprContext)_localctx).t49.node;
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(399);
				((ExprContext)_localctx).t50 = character();
				_localctx.node = ((ExprContext)_localctx).t50.node;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PkgContext extends ParserRuleContext {
		public ASTNode node;
		public StringContext t1;
		public StringContext t2;
		public NumberContext t3;
		public NumberContext t4;
		public TerminalNode LEFTB() { return getToken(ASTspecParser.LEFTB, 0); }
		public TerminalNode RIGHTB() { return getToken(ASTspecParser.RIGHTB, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public PkgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pkg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterPkg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitPkg(this);
		}
	}

	public final PkgContext pkg() throws RecognitionException {
		PkgContext _localctx = new PkgContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pkg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(404);
			match(LEFTB);
			setState(405);
			((PkgContext)_localctx).t1 = string();
			setState(406);
			((PkgContext)_localctx).t2 = string();
			setState(407);
			((PkgContext)_localctx).t3 = number();
			setState(408);
			((PkgContext)_localctx).t4 = number();
			setState(409);
			match(RIGHTB);
			((PkgContext)_localctx).node =  new lb_string_string_number_number_rb(((PkgContext)_localctx).t1.node,((PkgContext)_localctx).t2.node,((PkgContext)_localctx).t3.node,((PkgContext)_localctx).t4.node);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public ASTNode node;
		public Token NAME;
		public TerminalNode NAME() { return getToken(ASTspecParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(412);
			((NameContext)_localctx).NAME = match(NAME);
			 ((NameContext)_localctx).node =  new name_nameplus((((NameContext)_localctx).NAME!=null?((NameContext)_localctx).NAME.getText():null));
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public ASTNode node;
		public Token SYMBOL;
		public TerminalNode SYMBOL() { return getToken(ASTspecParser.SYMBOL, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitSymbol(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(415);
			((SymbolContext)_localctx).SYMBOL = match(SYMBOL);
			 ((SymbolContext)_localctx).node =  new symbol_expr((((SymbolContext)_localctx).SYMBOL!=null?((SymbolContext)_localctx).SYMBOL.getText():null));
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public ASTNode node;
		public Token INT;
		public Token DECIMAL;
		public TerminalNode INT() { return getToken(ASTspecParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(ASTspecParser.DECIMAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_number);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(418);
				((NumberContext)_localctx).INT = match(INT);
				 ((NumberContext)_localctx).node =  new int_expr((((NumberContext)_localctx).INT!=null?((NumberContext)_localctx).INT.getText():null));
				}
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(420);
				((NumberContext)_localctx).DECIMAL = match(DECIMAL);
				 ((NumberContext)_localctx).node =  new decimal_expr((((NumberContext)_localctx).DECIMAL!=null?((NumberContext)_localctx).DECIMAL.getText():null));
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public ASTNode node;
		public Token BOOLEAN;
		public TerminalNode BOOLEAN() { return getToken(ASTspecParser.BOOLEAN, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(424);
			((BoolContext)_localctx).BOOLEAN = match(BOOLEAN);
			 ((BoolContext)_localctx).node =  new boolean_expr((((BoolContext)_localctx).BOOLEAN!=null?((BoolContext)_localctx).BOOLEAN.getText():null));
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public ASTNode node;
		public Token STRING;
		public TerminalNode STRING() { return getToken(ASTspecParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(427);
			((StringContext)_localctx).STRING = match(STRING);
			 ((StringContext)_localctx).node =  new string_expr((((StringContext)_localctx).STRING!=null?((StringContext)_localctx).STRING.getText():null));
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterContext extends ParserRuleContext {
		public ASTNode node;
		public Token CHARACTER;
		public TerminalNode CHARACTER() { return getToken(ASTspecParser.CHARACTER, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitCharacter(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(430);
			((CharacterContext)_localctx).CHARACTER = match(CHARACTER);
			 ((CharacterContext)_localctx).node =  new character_expr((((CharacterContext)_localctx).CHARACTER!=null?((CharacterContext)_localctx).CHARACTER.getText():null));
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReloperatorsContext extends ParserRuleContext {
		public ASTNode node;
		public Token RELOPERATORS;
		public TerminalNode RELOPERATORS() { return getToken(ASTspecParser.RELOPERATORS, 0); }
		public ReloperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reloperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterReloperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitReloperators(this);
		}
	}

	public final ReloperatorsContext reloperators() throws RecognitionException {
		ReloperatorsContext _localctx = new ReloperatorsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_reloperators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(433);
			((ReloperatorsContext)_localctx).RELOPERATORS = match(RELOPERATORS);
			 ((ReloperatorsContext)_localctx).node =  new reloperators_expr((((ReloperatorsContext)_localctx).RELOPERATORS!=null?((ReloperatorsContext)_localctx).RELOPERATORS.getText():null));
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArthoperatorsContext extends ParserRuleContext {
		public ASTNode node;
		public Token ARTHOPERATORS;
		public TerminalNode ARTHOPERATORS() { return getToken(ASTspecParser.ARTHOPERATORS, 0); }
		public ArthoperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arthoperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).enterArthoperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTspecListener ) ((ASTspecListener)listener).exitArthoperators(this);
		}
	}

	public final ArthoperatorsContext arthoperators() throws RecognitionException {
		ArthoperatorsContext _localctx = new ArthoperatorsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arthoperators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(436);
			((ArthoperatorsContext)_localctx).ARTHOPERATORS = match(ARTHOPERATORS);
			 ((ArthoperatorsContext)_localctx).node =  new arthoperators_expr((((ArthoperatorsContext)_localctx).ARTHOPERATORS!=null?((ArthoperatorsContext)_localctx).ARTHOPERATORS.getText():null));
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u01b8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"8\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002@\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"P\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005W\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006s\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007|\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0086\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0095\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a4\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00ae\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0193"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01a7\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*\u0000\u0000\u01d5\u0000,\u0001\u0000\u0000\u0000\u00027\u0001"+
		"\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000"+
		"\u0000\bO\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000\u0000\fr\u0001"+
		"\u0000\u0000\u0000\u000e{\u0001\u0000\u0000\u0000\u0010\u0085\u0001\u0000"+
		"\u0000\u0000\u0012\u0094\u0001\u0000\u0000\u0000\u0014\u00a3\u0001\u0000"+
		"\u0000\u0000\u0016\u00ad\u0001\u0000\u0000\u0000\u0018\u0192\u0001\u0000"+
		"\u0000\u0000\u001a\u0194\u0001\u0000\u0000\u0000\u001c\u019c\u0001\u0000"+
		"\u0000\u0000\u001e\u019f\u0001\u0000\u0000\u0000 \u01a6\u0001\u0000\u0000"+
		"\u0000\"\u01a8\u0001\u0000\u0000\u0000$\u01ab\u0001\u0000\u0000\u0000"+
		"&\u01ae\u0001\u0000\u0000\u0000(\u01b1\u0001\u0000\u0000\u0000*\u01b4"+
		"\u0001\u0000\u0000\u0000,-\u0003\u0002\u0001\u0000-.\u0006\u0000\uffff"+
		"\uffff\u0000.\u0001\u0001\u0000\u0000\u0000/0\u0003\u0004\u0002\u0000"+
		"01\u0003\u0002\u0001\u000012\u0005\u0000\u0000\u000123\u0006\u0001\uffff"+
		"\uffff\u000038\u0001\u0000\u0000\u000045\u0003\u0004\u0002\u000056\u0006"+
		"\u0001\uffff\uffff\u000068\u0001\u0000\u0000\u00007/\u0001\u0000\u0000"+
		"\u000074\u0001\u0000\u0000\u00008\u0003\u0001\u0000\u0000\u00009:\u0003"+
		"\f\u0006\u0000:;\u0006\u0002\uffff\uffff\u0000;@\u0001\u0000\u0000\u0000"+
		"<=\u0003\u0018\f\u0000=>\u0006\u0002\uffff\uffff\u0000>@\u0001\u0000\u0000"+
		"\u0000?9\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000@\u0005\u0001"+
		"\u0000\u0000\u0000AB\u0003\u001c\u000e\u0000BC\u0003\u0006\u0003\u0000"+
		"CD\u0006\u0003\uffff\uffff\u0000DI\u0001\u0000\u0000\u0000EF\u0003\u001c"+
		"\u000e\u0000FG\u0006\u0003\uffff\uffff\u0000GI\u0001\u0000\u0000\u0000"+
		"HA\u0001\u0000\u0000\u0000HE\u0001\u0000\u0000\u0000I\u0007\u0001\u0000"+
		"\u0000\u0000JK\u0003\u001c\u000e\u0000KL\u0003\b\u0004\u0000LM\u0006\u0004"+
		"\uffff\uffff\u0000MP\u0001\u0000\u0000\u0000NP\u0006\u0004\uffff\uffff"+
		"\u0000OJ\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000P\t\u0001\u0000"+
		"\u0000\u0000QR\u0003\f\u0006\u0000RS\u0003\n\u0005\u0000ST\u0006\u0005"+
		"\uffff\uffff\u0000TW\u0001\u0000\u0000\u0000UW\u0006\u0005\uffff\uffff"+
		"\u0000VQ\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000W\u000b\u0001"+
		"\u0000\u0000\u0000XY\u0005(\u0000\u0000YZ\u0005!\u0000\u0000Z[\u0003\u001c"+
		"\u000e\u0000[\\\u0003\u0018\f\u0000\\]\u0005)\u0000\u0000]^\u0006\u0006"+
		"\uffff\uffff\u0000^s\u0001\u0000\u0000\u0000_`\u0005(\u0000\u0000`a\u0005"+
		"!\u0000\u0000ab\u0005(\u0000\u0000bc\u0003\u001c\u000e\u0000cd\u0003\u0006"+
		"\u0003\u0000de\u0005)\u0000\u0000ef\u0003\u0018\f\u0000fg\u0005)\u0000"+
		"\u0000gh\u0006\u0006\uffff\uffff\u0000hs\u0001\u0000\u0000\u0000ij\u0005"+
		"(\u0000\u0000jk\u0005$\u0000\u0000kl\u0003\u001c\u000e\u0000lm\u0005("+
		"\u0000\u0000mn\u0003\b\u0004\u0000no\u0005)\u0000\u0000op\u0005)\u0000"+
		"\u0000pq\u0006\u0006\uffff\uffff\u0000qs\u0001\u0000\u0000\u0000rX\u0001"+
		"\u0000\u0000\u0000r_\u0001\u0000\u0000\u0000ri\u0001\u0000\u0000\u0000"+
		"s\r\u0001\u0000\u0000\u0000tu\u0003\u0018\f\u0000uv\u0003\u000e\u0007"+
		"\u0000vw\u0006\u0007\uffff\uffff\u0000w|\u0001\u0000\u0000\u0000xy\u0003"+
		"\u0018\f\u0000yz\u0006\u0007\uffff\uffff\u0000z|\u0001\u0000\u0000\u0000"+
		"{t\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000|\u000f\u0001\u0000"+
		"\u0000\u0000}~\u0005*\u0000\u0000~\u007f\u0003\u001c\u000e\u0000\u007f"+
		"\u0080\u0003\u0018\f\u0000\u0080\u0081\u0005+\u0000\u0000\u0081\u0082"+
		"\u0003\u0010\b\u0000\u0082\u0083\u0006\b\uffff\uffff\u0000\u0083\u0086"+
		"\u0001\u0000\u0000\u0000\u0084\u0086\u0006\b\uffff\uffff\u0000\u0085}"+
		"\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0011"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005(\u0000\u0000\u0088\u0089\u0003"+
		"\u0018\f\u0000\u0089\u008a\u0003\u0018\f\u0000\u008a\u008b\u0005)\u0000"+
		"\u0000\u008b\u008c\u0003\u0012\t\u0000\u008c\u008d\u0006\t\uffff\uffff"+
		"\u0000\u008d\u0095\u0001\u0000\u0000\u0000\u008e\u008f\u0005(\u0000\u0000"+
		"\u008f\u0090\u0003\u0018\f\u0000\u0090\u0091\u0003\u0018\f\u0000\u0091"+
		"\u0092\u0005)\u0000\u0000\u0092\u0093\u0006\t\uffff\uffff\u0000\u0093"+
		"\u0095\u0001\u0000\u0000\u0000\u0094\u0087\u0001\u0000\u0000\u0000\u0094"+
		"\u008e\u0001\u0000\u0000\u0000\u0095\u0013\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005*\u0000\u0000\u0097\u0098\u0003\u0018\f\u0000\u0098\u0099"+
		"\u0003\u0018\f\u0000\u0099\u009a\u0005+\u0000\u0000\u009a\u009b\u0003"+
		"\u0014\n\u0000\u009b\u009c\u0006\n\uffff\uffff\u0000\u009c\u00a4\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0005*\u0000\u0000\u009e\u009f\u0003\u0018"+
		"\f\u0000\u009f\u00a0\u0003\u0018\f\u0000\u00a0\u00a1\u0005+\u0000\u0000"+
		"\u00a1\u00a2\u0006\n\uffff\uffff\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a3\u0096\u0001\u0000\u0000\u0000\u00a3\u009d\u0001\u0000\u0000\u0000"+
		"\u00a4\u0015\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005*\u0000\u0000\u00a6"+
		"\u00a7\u0003\u0018\f\u0000\u00a7\u00a8\u0003\u0018\f\u0000\u00a8\u00a9"+
		"\u0005+\u0000\u0000\u00a9\u00aa\u0003\u0016\u000b\u0000\u00aa\u00ab\u0006"+
		"\u000b\uffff\uffff\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00ae"+
		"\u0006\u000b\uffff\uffff\u0000\u00ad\u00a5\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u0017\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005(\u0000\u0000\u00b0\u00b1\u0005\u0001\u0000\u0000\u00b1\u00b2"+
		"\u0003\u000e\u0007\u0000\u00b2\u00b3\u0005)\u0000\u0000\u00b3\u00b4\u0006"+
		"\f\uffff\uffff\u0000\u00b4\u0193\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"(\u0000\u0000\u00b6\u00b7\u0005\u0002\u0000\u0000\u00b7\u00b8\u0003\u000e"+
		"\u0007\u0000\u00b8\u00b9\u0005)\u0000\u0000\u00b9\u00ba\u0006\f\uffff"+
		"\uffff\u0000\u00ba\u0193\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005(\u0000"+
		"\u0000\u00bc\u00bd\u0005\u0003\u0000\u0000\u00bd\u00be\u00054\u0000\u0000"+
		"\u00be\u00bf\u0003\u0018\f\u0000\u00bf\u00c0\u0005)\u0000\u0000\u00c0"+
		"\u00c1\u0006\f\uffff\uffff\u0000\u00c1\u0193\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005(\u0000\u0000\u00c3\u00c4\u0005\u0005\u0000\u0000\u00c4\u00c5"+
		"\u0003\u0018\f\u0000\u00c5\u00c6\u0005)\u0000\u0000\u00c6\u00c7\u0006"+
		"\f\uffff\uffff\u0000\u00c7\u0193\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"(\u0000\u0000\u00c9\u00ca\u0005\u0006\u0000\u0000\u00ca\u00cb\u0003\u0018"+
		"\f\u0000\u00cb\u00cc\u0005)\u0000\u0000\u00cc\u00cd\u0006\f\uffff\uffff"+
		"\u0000\u00cd\u0193\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005(\u0000\u0000"+
		"\u00cf\u00d0\u0005\u0007\u0000\u0000\u00d0\u00d1\u0003\u0018\f\u0000\u00d1"+
		"\u00d2\u0005)\u0000\u0000\u00d2\u00d3\u0006\f\uffff\uffff\u0000\u00d3"+
		"\u0193\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005(\u0000\u0000\u00d5\u00d6"+
		"\u0005\b\u0000\u0000\u00d6\u00d7\u0003\u0018\f\u0000\u00d7\u00d8\u0005"+
		")\u0000\u0000\u00d8\u00d9\u0006\f\uffff\uffff\u0000\u00d9\u0193\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0005(\u0000\u0000\u00db\u00dc\u0005\t"+
		"\u0000\u0000\u00dc\u00dd\u0003\u0018\f\u0000\u00dd\u00de\u0005)\u0000"+
		"\u0000\u00de\u00df\u0006\f\uffff\uffff\u0000\u00df\u0193\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0005(\u0000\u0000\u00e1\u00e2\u0005\n\u0000\u0000"+
		"\u00e2\u00e3\u0003\u0018\f\u0000\u00e3\u00e4\u0005)\u0000\u0000\u00e4"+
		"\u00e5\u0006\f\uffff\uffff\u0000\u00e5\u0193\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0005(\u0000\u0000\u00e7\u00e8\u0005\u000b\u0000\u0000\u00e8\u00e9"+
		"\u00054\u0000\u0000\u00e9\u00ea\u0003\u0018\f\u0000\u00ea\u00eb\u0005"+
		")\u0000\u0000\u00eb\u00ec\u0006\f\uffff\uffff\u0000\u00ec\u0193\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0005(\u0000\u0000\u00ee\u00ef\u0005\f"+
		"\u0000\u0000\u00ef\u00f0\u0005(\u0000\u0000\u00f0\u00f1\u0003\b\u0004"+
		"\u0000\u00f1\u00f2\u0005)\u0000\u0000\u00f2\u00f3\u0003\u0018\f\u0000"+
		"\u00f3\u00f4\u0005)\u0000\u0000\u00f4\u00f5\u0006\f\uffff\uffff\u0000"+
		"\u00f5\u0193\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005(\u0000\u0000\u00f7"+
		"\u00f8\u0005\r\u0000\u0000\u00f8\u00f9\u0005(\u0000\u0000\u00f9\u00fa"+
		"\u0003\b\u0004\u0000\u00fa\u00fb\u0005)\u0000\u0000\u00fb\u00fc\u0003"+
		"\u0018\f\u0000\u00fc\u00fd\u0005)\u0000\u0000\u00fd\u00fe\u0006\f\uffff"+
		"\uffff\u0000\u00fe\u0193\u0001\u0000\u0000\u0000\u00ff\u0100\u0005(\u0000"+
		"\u0000\u0100\u0101\u0005\u000e\u0000\u0000\u0101\u0102\u0005*\u0000\u0000"+
		"\u0102\u0103\u0003\n\u0005\u0000\u0103\u0104\u0005+\u0000\u0000\u0104"+
		"\u0105\u0003\u0018\f\u0000\u0105\u0106\u0005)\u0000\u0000\u0106\u0107"+
		"\u0006\f\uffff\uffff\u0000\u0107\u0193\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0005(\u0000\u0000\u0109\u010a\u0005\u000f\u0000\u0000\u010a\u010b\u0005"+
		"(\u0000\u0000\u010b\u010c\u0003\u0010\b\u0000\u010c\u010d\u0005)\u0000"+
		"\u0000\u010d\u010e\u0003\u0018\f\u0000\u010e\u010f\u0005)\u0000\u0000"+
		"\u010f\u0110\u0006\f\uffff\uffff\u0000\u0110\u0193\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0005(\u0000\u0000\u0112\u0113\u0005\u0010\u0000\u0000\u0113"+
		"\u0114\u0005(\u0000\u0000\u0114\u0115\u0003\u0010\b\u0000\u0115\u0116"+
		"\u0005)\u0000\u0000\u0116\u0117\u0003\u0018\f\u0000\u0117\u0118\u0005"+
		")\u0000\u0000\u0118\u0119\u0006\f\uffff\uffff\u0000\u0119\u0193\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0005(\u0000\u0000\u011b\u011c\u0005\u0011"+
		"\u0000\u0000\u011c\u011d\u0005(\u0000\u0000\u011d\u011e\u0003\u0010\b"+
		"\u0000\u011e\u011f\u0005)\u0000\u0000\u011f\u0120\u0003\u0018\f\u0000"+
		"\u0120\u0121\u0005)\u0000\u0000\u0121\u0122\u0006\f\uffff\uffff\u0000"+
		"\u0122\u0193\u0001\u0000\u0000\u0000\u0123\u0124\u0005(\u0000\u0000\u0124"+
		"\u0125\u0005\u0012\u0000\u0000\u0125\u0126\u0005(\u0000\u0000\u0126\u0127"+
		"\u0003\u0010\b\u0000\u0127\u0128\u0005)\u0000\u0000\u0128\u0129\u0003"+
		"\u0018\f\u0000\u0129\u012a\u0005)\u0000\u0000\u012a\u012b\u0006\f\uffff"+
		"\uffff\u0000\u012b\u0193\u0001\u0000\u0000\u0000\u012c\u012d\u0005(\u0000"+
		"\u0000\u012d\u012e\u0005\u0013\u0000\u0000\u012e\u012f\u0003\u001c\u000e"+
		"\u0000\u012f\u0130\u0005(\u0000\u0000\u0130\u0131\u0003\u0010\b\u0000"+
		"\u0131\u0132\u0005)\u0000\u0000\u0132\u0133\u0003\u0018\f\u0000\u0133"+
		"\u0134\u0005)\u0000\u0000\u0134\u0135\u0006\f\uffff\uffff\u0000\u0135"+
		"\u0193\u0001\u0000\u0000\u0000\u0136\u0137\u0005(\u0000\u0000\u0137\u0138"+
		"\u0003\u001c\u000e\u0000\u0138\u0139\u0003\u000e\u0007\u0000\u0139\u013a"+
		"\u0005)\u0000\u0000\u013a\u013b\u0006\f\uffff\uffff\u0000\u013b\u0193"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0005(\u0000\u0000\u013d\u013e\u0005"+
		"\u0014\u0000\u0000\u013e\u013f\u0003\u0012\t\u0000\u013f\u0140\u0005)"+
		"\u0000\u0000\u0140\u0141\u0006\f\uffff\uffff\u0000\u0141\u0193\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0005(\u0000\u0000\u0143\u0144\u0005\u0014\u0000"+
		"\u0000\u0144\u0145\u0003\u0014\n\u0000\u0145\u0146\u0005)\u0000\u0000"+
		"\u0146\u0147\u0006\f\uffff\uffff\u0000\u0147\u0193\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0005(\u0000\u0000\u0149\u014a\u0005\u0014\u0000\u0000\u014a"+
		"\u014b\u0003\u0016\u000b\u0000\u014b\u014c\u0005*\u0000\u0000\u014c\u014d"+
		"\u0005\u0015\u0000\u0000\u014d\u014e\u0003\u0018\f\u0000\u014e\u014f\u0005"+
		"+\u0000\u0000\u014f\u0150\u0005)\u0000\u0000\u0150\u0151\u0006\f\uffff"+
		"\uffff\u0000\u0151\u0193\u0001\u0000\u0000\u0000\u0152\u0153\u0005(\u0000"+
		"\u0000\u0153\u0154\u0005\u0016\u0000\u0000\u0154\u0155\u0003\u0018\f\u0000"+
		"\u0155\u0156\u0003\u0018\f\u0000\u0156\u0157\u0003\u0018\f\u0000\u0157"+
		"\u0158\u0005)\u0000\u0000\u0158\u0159\u0006\f\uffff\uffff\u0000\u0159"+
		"\u0193\u0001\u0000\u0000\u0000\u015a\u015b\u0005(\u0000\u0000\u015b\u015c"+
		"\u0005\u0017\u0000\u0000\u015c\u015d\u0003\u0018\f\u0000\u015d\u015e\u0003"+
		"\u000e\u0007\u0000\u015e\u015f\u0005)\u0000\u0000\u015f\u0160\u0006\f"+
		"\uffff\uffff\u0000\u0160\u0193\u0001\u0000\u0000\u0000\u0161\u0162\u0005"+
		"(\u0000\u0000\u0162\u0163\u0005\u0018\u0000\u0000\u0163\u0164\u0003\u0018"+
		"\f\u0000\u0164\u0165\u0003\u000e\u0007\u0000\u0165\u0166\u0005)\u0000"+
		"\u0000\u0166\u0167\u0006\f\uffff\uffff\u0000\u0167\u0193\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0005 \u0000\u0000\u0169\u016a\u0003\u001c\u000e\u0000"+
		"\u016a\u016b\u0006\f\uffff\uffff\u0000\u016b\u0193\u0001\u0000\u0000\u0000"+
		"\u016c\u016d\u0005 \u0000\u0000\u016d\u016e\u0003$\u0012\u0000\u016e\u016f"+
		"\u0006\f\uffff\uffff\u0000\u016f\u0193\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u0005\"\u0000\u0000\u0171\u0193\u0006\f\uffff\uffff\u0000\u0172\u0173"+
		"\u0005#\u0000\u0000\u0173\u0193\u0006\f\uffff\uffff\u0000\u0174\u0175"+
		"\u0005&\u0000\u0000\u0175\u0193\u0006\f\uffff\uffff\u0000\u0176\u0177"+
		"\u0005%\u0000\u0000\u0177\u0193\u0006\f\uffff\uffff\u0000\u0178\u0179"+
		"\u0005-\u0000\u0000\u0179\u0193\u0006\f\uffff\uffff\u0000\u017a\u017b"+
		"\u0003(\u0014\u0000\u017b\u017c\u0006\f\uffff\uffff\u0000\u017c\u0193"+
		"\u0001\u0000\u0000\u0000\u017d\u017e\u0003*\u0015\u0000\u017e\u017f\u0006"+
		"\f\uffff\uffff\u0000\u017f\u0193\u0001\u0000\u0000\u0000\u0180\u0181\u0003"+
		"\u001c\u000e\u0000\u0181\u0182\u0006\f\uffff\uffff\u0000\u0182\u0193\u0001"+
		"\u0000\u0000\u0000\u0183\u0184\u0003 \u0010\u0000\u0184\u0185\u0006\f"+
		"\uffff\uffff\u0000\u0185\u0193\u0001\u0000\u0000\u0000\u0186\u0187\u0003"+
		"\u001e\u000f\u0000\u0187\u0188\u0006\f\uffff\uffff\u0000\u0188\u0193\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0003\"\u0011\u0000\u018a\u018b\u0006\f"+
		"\uffff\uffff\u0000\u018b\u0193\u0001\u0000\u0000\u0000\u018c\u018d\u0003"+
		"$\u0012\u0000\u018d\u018e\u0006\f\uffff\uffff\u0000\u018e\u0193\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u0003&\u0013\u0000\u0190\u0191\u0006\f"+
		"\uffff\uffff\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u00af\u0001"+
		"\u0000\u0000\u0000\u0192\u00b5\u0001\u0000\u0000\u0000\u0192\u00bb\u0001"+
		"\u0000\u0000\u0000\u0192\u00c2\u0001\u0000\u0000\u0000\u0192\u00c8\u0001"+
		"\u0000\u0000\u0000\u0192\u00ce\u0001\u0000\u0000\u0000\u0192\u00d4\u0001"+
		"\u0000\u0000\u0000\u0192\u00da\u0001\u0000\u0000\u0000\u0192\u00e0\u0001"+
		"\u0000\u0000\u0000\u0192\u00e6\u0001\u0000\u0000\u0000\u0192\u00ed\u0001"+
		"\u0000\u0000\u0000\u0192\u00f6\u0001\u0000\u0000\u0000\u0192\u00ff\u0001"+
		"\u0000\u0000\u0000\u0192\u0108\u0001\u0000\u0000\u0000\u0192\u0111\u0001"+
		"\u0000\u0000\u0000\u0192\u011a\u0001\u0000\u0000\u0000\u0192\u0123\u0001"+
		"\u0000\u0000\u0000\u0192\u012c\u0001\u0000\u0000\u0000\u0192\u0136\u0001"+
		"\u0000\u0000\u0000\u0192\u013c\u0001\u0000\u0000\u0000\u0192\u0142\u0001"+
		"\u0000\u0000\u0000\u0192\u0148\u0001\u0000\u0000\u0000\u0192\u0152\u0001"+
		"\u0000\u0000\u0000\u0192\u015a\u0001\u0000\u0000\u0000\u0192\u0161\u0001"+
		"\u0000\u0000\u0000\u0192\u0168\u0001\u0000\u0000\u0000\u0192\u016c\u0001"+
		"\u0000\u0000\u0000\u0192\u0170\u0001\u0000\u0000\u0000\u0192\u0172\u0001"+
		"\u0000\u0000\u0000\u0192\u0174\u0001\u0000\u0000\u0000\u0192\u0176\u0001"+
		"\u0000\u0000\u0000\u0192\u0178\u0001\u0000\u0000\u0000\u0192\u017a\u0001"+
		"\u0000\u0000\u0000\u0192\u017d\u0001\u0000\u0000\u0000\u0192\u0180\u0001"+
		"\u0000\u0000\u0000\u0192\u0183\u0001\u0000\u0000\u0000\u0192\u0186\u0001"+
		"\u0000\u0000\u0000\u0192\u0189\u0001\u0000\u0000\u0000\u0192\u018c\u0001"+
		"\u0000\u0000\u0000\u0192\u018f\u0001\u0000\u0000\u0000\u0193\u0019\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0005(\u0000\u0000\u0195\u0196\u0003$\u0012"+
		"\u0000\u0196\u0197\u0003$\u0012\u0000\u0197\u0198\u0003 \u0010\u0000\u0198"+
		"\u0199\u0003 \u0010\u0000\u0199\u019a\u0005)\u0000\u0000\u019a\u019b\u0006"+
		"\r\uffff\uffff\u0000\u019b\u001b\u0001\u0000\u0000\u0000\u019c\u019d\u0005"+
		"4\u0000\u0000\u019d\u019e\u0006\u000e\uffff\uffff\u0000\u019e\u001d\u0001"+
		"\u0000\u0000\u0000\u019f\u01a0\u00051\u0000\u0000\u01a0\u01a1\u0006\u000f"+
		"\uffff\uffff\u0000\u01a1\u001f\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005"+
		"2\u0000\u0000\u01a3\u01a7\u0006\u0010\uffff\uffff\u0000\u01a4\u01a5\u0005"+
		"3\u0000\u0000\u01a5\u01a7\u0006\u0010\uffff\uffff\u0000\u01a6\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7!\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0005/\u0000\u0000\u01a9\u01aa\u0006\u0011\uffff"+
		"\uffff\u0000\u01aa#\u0001\u0000\u0000\u0000\u01ab\u01ac\u00057\u0000\u0000"+
		"\u01ac\u01ad\u0006\u0012\uffff\uffff\u0000\u01ad%\u0001\u0000\u0000\u0000"+
		"\u01ae\u01af\u00058\u0000\u0000\u01af\u01b0\u0006\u0013\uffff\uffff\u0000"+
		"\u01b0\'\u0001\u0000\u0000\u0000\u01b1\u01b2\u00050\u0000\u0000\u01b2"+
		"\u01b3\u0006\u0014\uffff\uffff\u0000\u01b3)\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0005.\u0000\u0000\u01b5\u01b6\u0006\u0015\uffff\uffff\u0000\u01b6"+
		"+\u0001\u0000\u0000\u0000\r7?HOVr{\u0085\u0094\u00a3\u00ad\u0192\u01a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}