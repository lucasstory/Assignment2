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
		PLUS=1, MINUS=2, MULTIPLY=3, DIVIDE=4, OPEN_CURLY=5, CLOSE_CURLY=6, OPEN_PAR=7, 
		CLOSE_PAR=8, COLON=9, NEW_LINE=10, IF=11, ELSE=12, END=13, WHILE=14, UNTIL=15, 
		DO=16, EQUALS=17, NOT=18, IS=19, LESS_THAN=20, GREATER_THAN=21, WRITE=22, 
		AND=23, OR=24, TRUE=25, FALSE=26, INT=27, FLOAT=28, STRING=29, ID=30, 
		WHITESPACE=31, COMMENT=32;
	public static final int
		RULE_file = 0, RULE_block = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_if_statement = 4, RULE_condition_block = 5, RULE_statement_block = 6, 
		RULE_while_statement = 7, RULE_until_statement = 8, RULE_do_while_statement = 9, 
		RULE_expression = 10, RULE_atom = 11, RULE_write = 12, RULE_bool = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "block", "statement", "assignment", "if_statement", "condition_block", 
			"statement_block", "while_statement", "until_statement", "do_while_statement", 
			"expression", "atom", "write", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'{'", "'}'", "'('", "')'", "':'", 
			null, "'if'", "'else'", "'end'", "'while'", "'until'", "'do'", "'=='", 
			"'!'", "'='", "'<'", "'>'", "'print'", "'&'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "OPEN_CURLY", "CLOSE_CURLY", 
			"OPEN_PAR", "CLOSE_PAR", "COLON", "NEW_LINE", "IF", "ELSE", "END", "WHILE", 
			"UNTIL", "DO", "EQUALS", "NOT", "IS", "LESS_THAN", "GREATER_THAN", "WRITE", 
			"AND", "OR", "TRUE", "FALSE", "INT", "FLOAT", "STRING", "ID", "WHITESPACE", 
			"COMMENT"
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			block();
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
		public List<TerminalNode> NEW_LINE() { return getTokens(diorParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(diorParser.NEW_LINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> EOF() { return getTokens(diorParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(diorParser.EOF, i);
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
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(30);
				match(NEW_LINE);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(36);
					statement();
					setState(43);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NEW_LINE:
						{
						setState(38); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(37);
							match(NEW_LINE);
							}
							}
							setState(40); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NEW_LINE );
						}
						break;
					case EOF:
						{
						setState(42);
						match(EOF);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Until_statementContext until_statement() {
			return getRuleContext(Until_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				assignment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				while_statement();
				}
				break;
			case UNTIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				until_statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				do_while_statement();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				write();
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionAssignmentContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(diorParser.ID, 0); }
		public TerminalNode IS() { return getToken(diorParser.IS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitExpressionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitExpressionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementAssignmentContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(diorParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(diorParser.MINUS, 0); }
		public DecrementAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterDecrementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitDecrementAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitDecrementAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementAssignmentContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(diorParser.ID, 0); }
		public TerminalNode PLUS() { return getToken(diorParser.PLUS, 0); }
		public IncrementAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterIncrementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitIncrementAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitIncrementAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(ID);
				setState(59);
				match(IS);
				setState(60);
				expression(0);
				}
				break;
			case 2:
				_localctx = new IncrementAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(ID);
				setState(62);
				match(PLUS);
				}
				break;
			case 3:
				_localctx = new DecrementAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(ID);
				setState(64);
				match(MINUS);
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

	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(diorParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(diorParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public TerminalNode END() { return getToken(diorParser.END, 0); }
		public List<TerminalNode> ELSE() { return getTokens(diorParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(diorParser.ELSE, i);
		}
		public TerminalNode NEW_LINE() { return getToken(diorParser.NEW_LINE, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(IF);
			setState(68);
			condition_block();
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(69);
					match(ELSE);
					setState(70);
					match(IF);
					setState(71);
					condition_block();
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(77);
				match(ELSE);
				setState(78);
				match(NEW_LINE);
				setState(79);
				statement_block();
				}
			}

			setState(82);
			match(END);
			setState(83);
			match(IF);
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

	public static class Condition_blockContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(diorParser.NEW_LINE, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			expression(0);
			setState(86);
			match(NEW_LINE);
			setState(87);
			statement_block();
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

	public static class Statement_blockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterStatement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitStatement_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitStatement_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			block();
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

	public static class While_statementContext extends ParserRuleContext {
		public List<TerminalNode> WHILE() { return getTokens(diorParser.WHILE); }
		public TerminalNode WHILE(int i) {
			return getToken(diorParser.WHILE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(diorParser.NEW_LINE, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode END() { return getToken(diorParser.END, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(WHILE);
			setState(92);
			expression(0);
			setState(93);
			match(NEW_LINE);
			setState(94);
			statement_block();
			setState(95);
			match(END);
			setState(96);
			match(WHILE);
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

	public static class Until_statementContext extends ParserRuleContext {
		public List<TerminalNode> UNTIL() { return getTokens(diorParser.UNTIL); }
		public TerminalNode UNTIL(int i) {
			return getToken(diorParser.UNTIL, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(diorParser.NEW_LINE, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode END() { return getToken(diorParser.END, 0); }
		public Until_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_until_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterUntil_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitUntil_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitUntil_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Until_statementContext until_statement() throws RecognitionException {
		Until_statementContext _localctx = new Until_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_until_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(UNTIL);
			setState(99);
			expression(0);
			setState(100);
			match(NEW_LINE);
			setState(101);
			statement_block();
			setState(102);
			match(END);
			setState(103);
			match(UNTIL);
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

	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(diorParser.DO, 0); }
		public TerminalNode NEW_LINE() { return getToken(diorParser.NEW_LINE, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(diorParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitDo_while_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitDo_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(DO);
			setState(106);
			match(NEW_LINE);
			setState(107);
			statement_block();
			setState(108);
			match(WHILE);
			setState(109);
			expression(0);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotEqualityExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(diorParser.NOT, 0); }
		public TerminalNode EQUALS() { return getToken(diorParser.EQUALS, 0); }
		public NotEqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterNotEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitNotEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitNotEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotLessThanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IS() { return getToken(diorParser.IS, 0); }
		public TerminalNode NOT() { return getToken(diorParser.NOT, 0); }
		public TerminalNode LESS_THAN() { return getToken(diorParser.LESS_THAN, 0); }
		public NotLessThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterNotLessThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitNotLessThanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitNotLessThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(diorParser.MINUS, 0); }
		public MinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryPlusExpressionContext extends ExpressionContext {
		public TerminalNode PLUS() { return getToken(diorParser.PLUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterUnaryPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitUnaryPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitUnaryPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanOrEqualExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IS() { return getToken(diorParser.IS, 0); }
		public TerminalNode LESS_THAN() { return getToken(diorParser.LESS_THAN, 0); }
		public TerminalNode OR() { return getToken(diorParser.OR, 0); }
		public TerminalNode EQUALS() { return getToken(diorParser.EQUALS, 0); }
		public LessThanOrEqualExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterLessThanOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitLessThanOrEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitLessThanOrEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(diorParser.MULTIPLY, 0); }
		public MultiplicationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterMultiplicationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitMultiplicationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitMultiplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IS() { return getToken(diorParser.IS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(diorParser.GREATER_THAN, 0); }
		public GreaterThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterGreaterThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitGreaterThanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitGreaterThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(diorParser.PLUS, 0); }
		public IncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanOrEqualExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IS() { return getToken(diorParser.IS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(diorParser.GREATER_THAN, 0); }
		public TerminalNode OR() { return getToken(diorParser.OR, 0); }
		public TerminalNode EQUALS() { return getToken(diorParser.EQUALS, 0); }
		public GreaterThanOrEqualExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterGreaterThanOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitGreaterThanOrEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitGreaterThanOrEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(diorParser.OR, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExpressionContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(diorParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitUnaryMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(diorParser.AND, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExpressionContext extends ExpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterAtomExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitAtomExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitAtomExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(diorParser.EQUALS, 0); }
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(diorParser.LESS_THAN, 0); }
		public LessThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterLessThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitLessThanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitLessThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(diorParser.PLUS, 0); }
		public PlusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(diorParser.MINUS, 0); }
		public DecrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(diorParser.DIVIDE, 0); }
		public DivisionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterDivisionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitDivisionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitDivisionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotGreaterThanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IS() { return getToken(diorParser.IS, 0); }
		public TerminalNode NOT() { return getToken(diorParser.NOT, 0); }
		public TerminalNode GREATER_THAN() { return getToken(diorParser.GREATER_THAN, 0); }
		public NotGreaterThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterNotGreaterThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitNotGreaterThanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitNotGreaterThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case TRUE:
			case FALSE:
			case INT:
			case FLOAT:
			case STRING:
			case ID:
				{
				_localctx = new AtomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(112);
				atom();
				}
				break;
			case MINUS:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(MINUS);
				setState(114);
				expression(18);
				}
				break;
			case PLUS:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(PLUS);
				setState(116);
				expression(17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new PlusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(120);
						match(PLUS);
						setState(121);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new MinusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(123);
						match(MINUS);
						setState(124);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(125);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(126);
						match(MULTIPLY);
						setState(127);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new DivisionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(129);
						match(DIVIDE);
						setState(130);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(132);
						match(AND);
						setState(133);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(134);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(135);
						match(OR);
						setState(136);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(137);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(138);
						match(EQUALS);
						setState(139);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new NotEqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(141);
						match(NOT);
						setState(142);
						match(EQUALS);
						setState(143);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new LessThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(145);
						match(LESS_THAN);
						setState(146);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new NotLessThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(148);
						match(IS);
						setState(149);
						match(NOT);
						setState(150);
						match(LESS_THAN);
						setState(151);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(153);
						match(IS);
						setState(154);
						match(GREATER_THAN);
						setState(155);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new NotGreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(157);
						match(IS);
						setState(158);
						match(NOT);
						setState(159);
						match(GREATER_THAN);
						setState(160);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new GreaterThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(162);
						match(IS);
						setState(163);
						match(GREATER_THAN);
						setState(164);
						match(OR);
						setState(165);
						match(EQUALS);
						setState(166);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new LessThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(168);
						match(IS);
						setState(169);
						match(LESS_THAN);
						setState(170);
						match(OR);
						setState(171);
						match(EQUALS);
						setState(172);
						expression(2);
						}
						break;
					case 15:
						{
						_localctx = new IncrementExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(174);
						match(PLUS);
						}
						break;
					case 16:
						{
						_localctx = new DecrementExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(176);
						match(MINUS);
						}
						break;
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(diorParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatAtomContext extends AtomContext {
		public TerminalNode FLOAT() { return getToken(diorParser.FLOAT, 0); }
		public FloatAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterFloatAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitFloatAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitFloatAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(diorParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionAtomContext extends AtomContext {
		public TerminalNode OPEN_PAR() { return getToken(diorParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(diorParser.CLOSE_PAR, 0); }
		public ExpressionAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAtomContext extends AtomContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterBoolAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitBoolAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitBoolAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(diorParser.INT, 0); }
		public IntegerAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterIntegerAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitIntegerAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitIntegerAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atom);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegerAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(FLOAT);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BoolAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				bool();
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				match(STRING);
				}
				break;
			case OPEN_PAR:
				_localctx = new ExpressionAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				match(OPEN_PAR);
				setState(188);
				expression(0);
				setState(189);
				match(CLOSE_PAR);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(diorParser.WRITE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(WRITE);
			setState(194);
			expression(0);
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
		public TerminalNode TRUE() { return getToken(diorParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(diorParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof diorListener ) ((diorListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof diorVisitor ) return ((diorVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		case 14:
			return precpred(_ctx, 12);
		case 15:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\7\3\"\n\3\f\3\16\3"+
		"%\13\3\3\3\3\3\6\3)\n\3\r\3\16\3*\3\3\5\3.\n\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"D\n\5\3\6\3\6\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\3\6\3\6\5\6S\n\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\fx\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b4\n\f\f\f\16\f\u00b7\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c2\n\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\2\3\26\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3\2\33"+
		"\34\2\u00de\2\36\3\2\2\2\4#\3\2\2\2\6:\3\2\2\2\bC\3\2\2\2\nE\3\2\2\2\f"+
		"W\3\2\2\2\16[\3\2\2\2\20]\3\2\2\2\22d\3\2\2\2\24k\3\2\2\2\26w\3\2\2\2"+
		"\30\u00c1\3\2\2\2\32\u00c3\3\2\2\2\34\u00c6\3\2\2\2\36\37\5\4\3\2\37\3"+
		"\3\2\2\2 \"\7\f\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\61\3\2\2"+
		"\2%#\3\2\2\2&-\5\6\4\2\')\7\f\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2"+
		"\2\2+.\3\2\2\2,.\7\2\2\3-(\3\2\2\2-,\3\2\2\2.\60\3\2\2\2/&\3\2\2\2\60"+
		"\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\5\3\2\2\2\63\61\3\2\2\2\64;\5"+
		"\b\5\2\65;\5\n\6\2\66;\5\20\t\2\67;\5\22\n\28;\5\24\13\29;\5\32\16\2:"+
		"\64\3\2\2\2:\65\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\7"+
		"\3\2\2\2<=\7 \2\2=>\7\25\2\2>D\5\26\f\2?@\7 \2\2@D\7\3\2\2AB\7 \2\2BD"+
		"\7\4\2\2C<\3\2\2\2C?\3\2\2\2CA\3\2\2\2D\t\3\2\2\2EF\7\r\2\2FL\5\f\7\2"+
		"GH\7\16\2\2HI\7\r\2\2IK\5\f\7\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2"+
		"\2MR\3\2\2\2NL\3\2\2\2OP\7\16\2\2PQ\7\f\2\2QS\5\16\b\2RO\3\2\2\2RS\3\2"+
		"\2\2ST\3\2\2\2TU\7\17\2\2UV\7\r\2\2V\13\3\2\2\2WX\5\26\f\2XY\7\f\2\2Y"+
		"Z\5\16\b\2Z\r\3\2\2\2[\\\5\4\3\2\\\17\3\2\2\2]^\7\20\2\2^_\5\26\f\2_`"+
		"\7\f\2\2`a\5\16\b\2ab\7\17\2\2bc\7\20\2\2c\21\3\2\2\2de\7\21\2\2ef\5\26"+
		"\f\2fg\7\f\2\2gh\5\16\b\2hi\7\17\2\2ij\7\21\2\2j\23\3\2\2\2kl\7\22\2\2"+
		"lm\7\f\2\2mn\5\16\b\2no\7\20\2\2op\5\26\f\2p\25\3\2\2\2qr\b\f\1\2rx\5"+
		"\30\r\2st\7\4\2\2tx\5\26\f\24uv\7\3\2\2vx\5\26\f\23wq\3\2\2\2ws\3\2\2"+
		"\2wu\3\2\2\2x\u00b5\3\2\2\2yz\f\22\2\2z{\7\3\2\2{\u00b4\5\26\f\23|}\f"+
		"\21\2\2}~\7\4\2\2~\u00b4\5\26\f\22\177\u0080\f\20\2\2\u0080\u0081\7\5"+
		"\2\2\u0081\u00b4\5\26\f\21\u0082\u0083\f\17\2\2\u0083\u0084\7\6\2\2\u0084"+
		"\u00b4\5\26\f\20\u0085\u0086\f\f\2\2\u0086\u0087\7\31\2\2\u0087\u00b4"+
		"\5\26\f\r\u0088\u0089\f\13\2\2\u0089\u008a\7\32\2\2\u008a\u00b4\5\26\f"+
		"\f\u008b\u008c\f\n\2\2\u008c\u008d\7\23\2\2\u008d\u00b4\5\26\f\13\u008e"+
		"\u008f\f\t\2\2\u008f\u0090\7\24\2\2\u0090\u0091\7\23\2\2\u0091\u00b4\5"+
		"\26\f\n\u0092\u0093\f\b\2\2\u0093\u0094\7\26\2\2\u0094\u00b4\5\26\f\t"+
		"\u0095\u0096\f\7\2\2\u0096\u0097\7\25\2\2\u0097\u0098\7\24\2\2\u0098\u0099"+
		"\7\26\2\2\u0099\u00b4\5\26\f\b\u009a\u009b\f\6\2\2\u009b\u009c\7\25\2"+
		"\2\u009c\u009d\7\27\2\2\u009d\u00b4\5\26\f\7\u009e\u009f\f\5\2\2\u009f"+
		"\u00a0\7\25\2\2\u00a0\u00a1\7\24\2\2\u00a1\u00a2\7\27\2\2\u00a2\u00b4"+
		"\5\26\f\6\u00a3\u00a4\f\4\2\2\u00a4\u00a5\7\25\2\2\u00a5\u00a6\7\27\2"+
		"\2\u00a6\u00a7\7\32\2\2\u00a7\u00a8\7\23\2\2\u00a8\u00b4\5\26\f\5\u00a9"+
		"\u00aa\f\3\2\2\u00aa\u00ab\7\25\2\2\u00ab\u00ac\7\26\2\2\u00ac\u00ad\7"+
		"\32\2\2\u00ad\u00ae\7\23\2\2\u00ae\u00b4\5\26\f\4\u00af\u00b0\f\16\2\2"+
		"\u00b0\u00b4\7\3\2\2\u00b1\u00b2\f\r\2\2\u00b2\u00b4\7\4\2\2\u00b3y\3"+
		"\2\2\2\u00b3|\3\2\2\2\u00b3\177\3\2\2\2\u00b3\u0082\3\2\2\2\u00b3\u0085"+
		"\3\2\2\2\u00b3\u0088\3\2\2\2\u00b3\u008b\3\2\2\2\u00b3\u008e\3\2\2\2\u00b3"+
		"\u0092\3\2\2\2\u00b3\u0095\3\2\2\2\u00b3\u009a\3\2\2\2\u00b3\u009e\3\2"+
		"\2\2\u00b3\u00a3\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\27\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00c2\7\35\2\2\u00b9\u00c2"+
		"\7\36\2\2\u00ba\u00c2\5\34\17\2\u00bb\u00c2\7 \2\2\u00bc\u00c2\7\37\2"+
		"\2\u00bd\u00be\7\t\2\2\u00be\u00bf\5\26\f\2\u00bf\u00c0\7\n\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00ba\3\2"+
		"\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c2"+
		"\31\3\2\2\2\u00c3\u00c4\7\30\2\2\u00c4\u00c5\5\26\f\2\u00c5\33\3\2\2\2"+
		"\u00c6\u00c7\t\2\2\2\u00c7\35\3\2\2\2\16#*-\61:CLRw\u00b3\u00b5\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}