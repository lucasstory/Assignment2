// Generated from C:/Users/lelia/OneDrive/Dokument/GitHub/Assignment2/src/grammar\dior.g4 by ANTLR 4.8

package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class diorLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "OPEN_CURLY", "CLOSE_CURLY", "OPEN_PAR", 
			"CLOSE_PAR", "COLON", "NEW_LINE", "IF", "ELSE", "END", "WHILE", "UNTIL", 
			"DO", "EQUALS", "NOT", "IS", "LESS_THAN", "GREATER_THAN", "WRITE", "AND", 
			"OR", "TRUE", "FALSE", "INT", "FLOAT", "DIGIT", "STRING", "ID", "WHITESPACE", 
			"COMMENT"
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


	public diorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dior.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00fc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\5\13Y\n\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u009b"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u00ab\n\33\3\34\6\34\u00ae\n\34\r\34\16\34\u00af\3\35\6\35"+
		"\u00b3\n\35\r\35\16\35\u00b4\3\35\3\35\7\35\u00b9\n\35\f\35\16\35\u00bc"+
		"\13\35\3\35\7\35\u00bf\n\35\f\35\16\35\u00c2\13\35\3\35\3\35\6\35\u00c6"+
		"\n\35\r\35\16\35\u00c7\5\35\u00ca\n\35\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\7\37\u00d4\n\37\f\37\16\37\u00d7\13\37\3\37\3\37\3 \6 \u00dc"+
		"\n \r \16 \u00dd\3!\6!\u00e1\n!\r!\16!\u00e2\3!\3!\3\"\3\"\3\"\3\"\7\""+
		"\u00eb\n\"\f\"\16\"\u00ee\13\"\3\"\3\"\3\"\3\"\7\"\u00f4\n\"\f\"\16\""+
		"\u00f7\13\"\5\"\u00f9\n\"\3\"\3\"\3\u00ec\2#\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\2=\37? A!C\"\3\2\b\4\2..\60"+
		"\60\3\2\62;\4\2$$^^\5\2\62;C\\c|\4\2\13\13\"\"\4\2\f\f\17\17\2\u010f\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2"+
		"\tK\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21S\3\2\2\2\23U\3\2\2\2"+
		"\25X\3\2\2\2\27\\\3\2\2\2\31_\3\2\2\2\33d\3\2\2\2\35h\3\2\2\2\37n\3\2"+
		"\2\2!t\3\2\2\2#w\3\2\2\2%z\3\2\2\2\'|\3\2\2\2)~\3\2\2\2+\u0080\3\2\2\2"+
		"-\u0082\3\2\2\2/\u0088\3\2\2\2\61\u008a\3\2\2\2\63\u009a\3\2\2\2\65\u00aa"+
		"\3\2\2\2\67\u00ad\3\2\2\29\u00c9\3\2\2\2;\u00cb\3\2\2\2=\u00cd\3\2\2\2"+
		"?\u00db\3\2\2\2A\u00e0\3\2\2\2C\u00f8\3\2\2\2EF\7-\2\2F\4\3\2\2\2GH\7"+
		"/\2\2H\6\3\2\2\2IJ\7,\2\2J\b\3\2\2\2KL\7\61\2\2L\n\3\2\2\2MN\7}\2\2N\f"+
		"\3\2\2\2OP\7\177\2\2P\16\3\2\2\2QR\7*\2\2R\20\3\2\2\2ST\7+\2\2T\22\3\2"+
		"\2\2UV\7<\2\2V\24\3\2\2\2WY\7\17\2\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7"+
		"\f\2\2[\26\3\2\2\2\\]\7k\2\2]^\7h\2\2^\30\3\2\2\2_`\7g\2\2`a\7n\2\2ab"+
		"\7u\2\2bc\7g\2\2c\32\3\2\2\2de\7g\2\2ef\7p\2\2fg\7f\2\2g\34\3\2\2\2hi"+
		"\7y\2\2ij\7j\2\2jk\7k\2\2kl\7n\2\2lm\7g\2\2m\36\3\2\2\2no\7w\2\2op\7p"+
		"\2\2pq\7v\2\2qr\7k\2\2rs\7n\2\2s \3\2\2\2tu\7f\2\2uv\7q\2\2v\"\3\2\2\2"+
		"wx\7?\2\2xy\7?\2\2y$\3\2\2\2z{\7#\2\2{&\3\2\2\2|}\7?\2\2}(\3\2\2\2~\177"+
		"\7>\2\2\177*\3\2\2\2\u0080\u0081\7@\2\2\u0081,\3\2\2\2\u0082\u0083\7r"+
		"\2\2\u0083\u0084\7t\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086\u0087"+
		"\7v\2\2\u0087.\3\2\2\2\u0088\u0089\7(\2\2\u0089\60\3\2\2\2\u008a\u008b"+
		"\7~\2\2\u008b\62\3\2\2\2\u008c\u008d\7V\2\2\u008d\u008e\7T\2\2\u008e\u008f"+
		"\7W\2\2\u008f\u009b\7G\2\2\u0090\u0091\7v\2\2\u0091\u0092\7t\2\2\u0092"+
		"\u0093\7w\2\2\u0093\u009b\7g\2\2\u0094\u0095\7[\2\2\u0095\u0096\7G\2\2"+
		"\u0096\u009b\7U\2\2\u0097\u0098\7{\2\2\u0098\u0099\7g\2\2\u0099\u009b"+
		"\7u\2\2\u009a\u008c\3\2\2\2\u009a\u0090\3\2\2\2\u009a\u0094\3\2\2\2\u009a"+
		"\u0097\3\2\2\2\u009b\64\3\2\2\2\u009c\u009d\7H\2\2\u009d\u009e\7C\2\2"+
		"\u009e\u009f\7N\2\2\u009f\u00a0\7U\2\2\u00a0\u00ab\7G\2\2\u00a1\u00a2"+
		"\7h\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5"+
		"\u00ab\7g\2\2\u00a6\u00a7\7P\2\2\u00a7\u00ab\7Q\2\2\u00a8\u00a9\7p\2\2"+
		"\u00a9\u00ab\7q\2\2\u00aa\u009c\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a6"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\66\3\2\2\2\u00ac\u00ae\5;\36\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b08\3\2\2\2\u00b1\u00b3\5;\36\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00ba\t\2\2\2\u00b7\u00b9\5;\36\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00ca\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00bf\5;\36\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c5\t\2\2\2\u00c4\u00c6\5;\36\2\u00c5\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00b2\3\2\2\2\u00c9\u00c0\3\2\2\2\u00ca:\3\2\2\2"+
		"\u00cb\u00cc\t\3\2\2\u00cc<\3\2\2\2\u00cd\u00d5\7$\2\2\u00ce\u00cf\7^"+
		"\2\2\u00cf\u00d4\7$\2\2\u00d0\u00d1\7^\2\2\u00d1\u00d4\7^\2\2\u00d2\u00d4"+
		"\n\4\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7$\2\2\u00d9>\3\2\2\2\u00da\u00dc"+
		"\t\5\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de@\3\2\2\2\u00df\u00e1\t\6\2\2\u00e0\u00df\3\2\2\2"+
		"\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e5\b!\2\2\u00e5B\3\2\2\2\u00e6\u00e7\7=\2\2\u00e7\u00e8"+
		"\7=\2\2\u00e8\u00ec\3\2\2\2\u00e9\u00eb\13\2\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7=\2\2\u00f0\u00f9\7=\2\2\u00f1\u00f5"+
		"\7=\2\2\u00f2\u00f4\n\7\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u00e6\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fb\b\"\2\2\u00fbD\3\2\2\2\23\2X\u009a\u00aa\u00af\u00b4\u00ba\u00c0"+
		"\u00c7\u00c9\u00d3\u00d5\u00dd\u00e2\u00ec\u00f5\u00f8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}