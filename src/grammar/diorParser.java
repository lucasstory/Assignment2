// Generated from C:/Users/lelia/OneDrive/Dokument/GitHub/Assignment2/src/grammar\dior.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class diorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ID=13, INT=14, WS=15, GREATER=16, LESS=17, 
		EQUALS=18;
	public static final int
		RULE_file = 0, RULE_code = 1, RULE_block = 2, RULE_statement = 3, RULE_declaration = 4, 
		RULE_whileStatment = 5, RULE_forStatement = 6, RULE_forConditions = 7, 
		RULE_varRef = 8, RULE_assignment = 9, RULE_expression = 10, RULE_addExpression = 11, 
		RULE_compareExpression = 12, RULE_unaryExpression = 13, RULE_printOut = 14, 
		RULE_maths = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "code", "block", "statement", "declaration", "whileStatment", 
			"forStatement", "forConditions", "varRef", "assignment", "expression", 
			"addExpression", "compareExpression", "unaryExpression", "printOut", 
			"maths"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'var'", "'while'", "'('", "')'", "'for'", 
			"'FROM'", "'TO'", "'+'", "'print'", null, null, null, "'>'", "'<'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "INT", "WS", "GREATER", "LESS", "EQUALS"
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
	public String getGrammarFileName() { return "dior.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public diorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(diorParser.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__4:
			case T__7:
			case T__11:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				code();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(EOF);
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

	public static class CodeContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				statement();
				setState(37);
				match(T__0);
				setState(38);
				code();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				statement();
				setState(41);
				match(T__0);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__1);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__11) | (1L << ID))) != 0)) {
				{
				{
				setState(46);
				statement();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(T__2);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatmentContext whileStatment() {
			return getRuleContext(WhileStatmentContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintOutContext printOut() {
			return getRuleContext(PrintOutContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				block();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				declaration();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				forStatement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				whileStatment();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				assignment();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				printOut();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(diorParser.ID, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__3);
			setState(63);
			match(ID);
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

	public static class WhileStatmentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterWhileStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitWhileStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitWhileStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatmentContext whileStatment() throws RecognitionException {
		WhileStatmentContext _localctx = new WhileStatmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStatment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__4);
			setState(66);
			match(T__5);
			setState(67);
			expression();
			setState(68);
			match(T__6);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(69);
					statement();
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ForStatementContext extends ParserRuleContext {
		public ForConditionsContext forConditions() {
			return getRuleContext(ForConditionsContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__7);
			setState(76);
			match(T__5);
			setState(77);
			forConditions();
			setState(78);
			match(T__6);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					statement();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ForConditionsContext extends ParserRuleContext {
		public VarRefContext iterator;
		public ExpressionContext startExpr;
		public Token range;
		public ExpressionContext endExpr;
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forConditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterForConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitForConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitForConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionsContext forConditions() throws RecognitionException {
		ForConditionsContext _localctx = new ForConditionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forConditions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((ForConditionsContext)_localctx).iterator = varRef();
			setState(86);
			match(T__8);
			setState(87);
			((ForConditionsContext)_localctx).startExpr = expression();
			setState(88);
			((ForConditionsContext)_localctx).range = match(T__9);
			setState(89);
			((ForConditionsContext)_localctx).endExpr = expression();
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

	public static class VarRefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(diorParser.ID, 0); }
		public VarRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterVarRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitVarRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitVarRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarRefContext varRef() throws RecognitionException {
		VarRefContext _localctx = new VarRefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(ID);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(diorParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(diorParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ID);
			setState(94);
			match(EQUALS);
			setState(95);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public CompareExpressionContext compareExpression() {
			return getRuleContext(CompareExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				addExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				compareExpression();
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

	public static class AddExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_addExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			unaryExpression();
			setState(103);
			match(T__10);
			setState(104);
			expression();
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

	public static class CompareExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MathsContext maths() {
			return getRuleContext(MathsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CompareExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExpressionContext compareExpression() throws RecognitionException {
		CompareExpressionContext _localctx = new CompareExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compareExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			unaryExpression();
			setState(107);
			maths();
			setState(108);
			expression();
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(diorParser.ID, 0); }
		public TerminalNode INT() { return getToken(diorParser.INT, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PrintOutContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(diorParser.ID, 0); }
		public PrintOutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printOut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterPrintOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitPrintOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitPrintOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintOutContext printOut() throws RecognitionException {
		PrintOutContext _localctx = new PrintOutContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printOut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__11);
			setState(113);
			match(ID);
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

	public static class MathsContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(diorParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(diorParser.LESS, 0); }
		public TerminalNode EQUALS() { return getToken(diorParser.EQUALS, 0); }
		public MathsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maths; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterMaths(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitMaths(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitMaths(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathsContext maths() throws RecognitionException {
		MathsContext _localctx = new MathsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_maths);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << EQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24x\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\5\2%\n"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\7\4\62\n\4\f\4\16\4\65"+
		"\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\7\7I\n\7\f\7\16\7L\13\7\3\b\3\b\3\b\3\b\3\b\7\bS\n\b\f\b\16\b"+
		"V\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\5\fg\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\3\2"+
		"\17\20\3\2\22\24\2s\2$\3\2\2\2\4-\3\2\2\2\6/\3\2\2\2\b>\3\2\2\2\n@\3\2"+
		"\2\2\fC\3\2\2\2\16M\3\2\2\2\20W\3\2\2\2\22]\3\2\2\2\24_\3\2\2\2\26f\3"+
		"\2\2\2\30h\3\2\2\2\32l\3\2\2\2\34p\3\2\2\2\36r\3\2\2\2 u\3\2\2\2\"%\5"+
		"\4\3\2#%\7\2\2\3$\"\3\2\2\2$#\3\2\2\2%\3\3\2\2\2&\'\5\b\5\2\'(\7\3\2\2"+
		"()\5\4\3\2).\3\2\2\2*+\5\b\5\2+,\7\3\2\2,.\3\2\2\2-&\3\2\2\2-*\3\2\2\2"+
		".\5\3\2\2\2/\63\7\4\2\2\60\62\5\b\5\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\5\2\2\67\7"+
		"\3\2\2\28?\5\6\4\29?\5\n\6\2:?\5\16\b\2;?\5\f\7\2<?\5\24\13\2=?\5\36\20"+
		"\2>8\3\2\2\2>9\3\2\2\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\t\3\2"+
		"\2\2@A\7\6\2\2AB\7\17\2\2B\13\3\2\2\2CD\7\7\2\2DE\7\b\2\2EF\5\26\f\2F"+
		"J\7\t\2\2GI\5\b\5\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\r\3\2\2\2"+
		"LJ\3\2\2\2MN\7\n\2\2NO\7\b\2\2OP\5\20\t\2PT\7\t\2\2QS\5\b\5\2RQ\3\2\2"+
		"\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\17\3\2\2\2VT\3\2\2\2WX\5\22\n\2XY\7"+
		"\13\2\2YZ\5\26\f\2Z[\7\f\2\2[\\\5\26\f\2\\\21\3\2\2\2]^\7\17\2\2^\23\3"+
		"\2\2\2_`\7\17\2\2`a\7\24\2\2ab\5\26\f\2b\25\3\2\2\2cg\5\34\17\2dg\5\30"+
		"\r\2eg\5\32\16\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\27\3\2\2\2hi\5\34\17\2"+
		"ij\7\r\2\2jk\5\26\f\2k\31\3\2\2\2lm\5\34\17\2mn\5 \21\2no\5\26\f\2o\33"+
		"\3\2\2\2pq\t\2\2\2q\35\3\2\2\2rs\7\16\2\2st\7\17\2\2t\37\3\2\2\2uv\t\3"+
		"\2\2v!\3\2\2\2\t$-\63>JTf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}