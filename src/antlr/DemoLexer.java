package antlr;// Generated from Demo.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, FUNCTION=3, ENDFUNCTION=4, REPEAT=5, ENDREPEAT=6, IF=7, 
		THEN=8, ENDIF=9, PRINT=10, READ=11, ID=12, INT=13, DOUBLE=14, ADD=15, 
		MULT=16, NEWLINE=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "FUNCTION", "ENDFUNCTION", "REPEAT", "ENDREPEAT", "IF", 
			"THEN", "ENDIF", "PRINT", "READ", "ID", "INT", "DOUBLE", "ADD", "MULT", 
			"NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'=='", "'function'", "'endfunction'", "'repeat'", "'endrepeat'", 
			"'if'", "'then'", "'endif'", "'print'", "'read'", null, null, null, "'+'", 
			"'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "FUNCTION", "ENDFUNCTION", "REPEAT", "ENDREPEAT", "IF", 
			"THEN", "ENDIF", "PRINT", "READ", "ID", "INT", "DOUBLE", "ADD", "MULT", 
			"NEWLINE", "WS"
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


	public DemoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Demo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\6\rm\n\r\r\r\16\rn\3\16\6\16r\n\16\r\16\16\16s\3\17"+
		"\6\17w\n\17\r\17\16\17x\3\17\6\17|\n\17\r\17\16\17}\3\17\6\17\u0081\n"+
		"\17\r\17\16\17\u0082\3\20\3\20\3\21\3\21\3\22\5\22\u008a\n\22\3\22\3\22"+
		"\3\23\6\23\u008f\n\23\r\23\16\23\u0090\3\23\3\23\2\2\24\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\2\u009a\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2"+
		"\2\2\5)\3\2\2\2\7,\3\2\2\2\t\65\3\2\2\2\13A\3\2\2\2\rH\3\2\2\2\17R\3\2"+
		"\2\2\21U\3\2\2\2\23Z\3\2\2\2\25`\3\2\2\2\27f\3\2\2\2\31l\3\2\2\2\33q\3"+
		"\2\2\2\35v\3\2\2\2\37\u0084\3\2\2\2!\u0086\3\2\2\2#\u0089\3\2\2\2%\u008e"+
		"\3\2\2\2\'(\7?\2\2(\4\3\2\2\2)*\7?\2\2*+\7?\2\2+\6\3\2\2\2,-\7h\2\2-."+
		"\7w\2\2./\7p\2\2/\60\7e\2\2\60\61\7v\2\2\61\62\7k\2\2\62\63\7q\2\2\63"+
		"\64\7p\2\2\64\b\3\2\2\2\65\66\7g\2\2\66\67\7p\2\2\678\7f\2\289\7h\2\2"+
		"9:\7w\2\2:;\7p\2\2;<\7e\2\2<=\7v\2\2=>\7k\2\2>?\7q\2\2?@\7p\2\2@\n\3\2"+
		"\2\2AB\7t\2\2BC\7g\2\2CD\7r\2\2DE\7g\2\2EF\7c\2\2FG\7v\2\2G\f\3\2\2\2"+
		"HI\7g\2\2IJ\7p\2\2JK\7f\2\2KL\7t\2\2LM\7g\2\2MN\7r\2\2NO\7g\2\2OP\7c\2"+
		"\2PQ\7v\2\2Q\16\3\2\2\2RS\7k\2\2ST\7h\2\2T\20\3\2\2\2UV\7v\2\2VW\7j\2"+
		"\2WX\7g\2\2XY\7p\2\2Y\22\3\2\2\2Z[\7g\2\2[\\\7p\2\2\\]\7f\2\2]^\7k\2\2"+
		"^_\7h\2\2_\24\3\2\2\2`a\7r\2\2ab\7t\2\2bc\7k\2\2cd\7p\2\2de\7v\2\2e\26"+
		"\3\2\2\2fg\7t\2\2gh\7g\2\2hi\7c\2\2ij\7f\2\2j\30\3\2\2\2km\t\2\2\2lk\3"+
		"\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o\32\3\2\2\2pr\4\62;\2qp\3\2\2\2r"+
		"s\3\2\2\2sq\3\2\2\2st\3\2\2\2t\34\3\2\2\2uw\4\62;\2vu\3\2\2\2wx\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2z|\7\60\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2"+
		"\2\2}~\3\2\2\2~\u0080\3\2\2\2\177\u0081\4\62;\2\u0080\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\36\3\2\2"+
		"\2\u0084\u0085\7-\2\2\u0085 \3\2\2\2\u0086\u0087\7,\2\2\u0087\"\3\2\2"+
		"\2\u0088\u008a\7\17\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\7\f\2\2\u008c$\3\2\2\2\u008d\u008f\t\3\2\2"+
		"\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\23\2\2\u0093&\3\2\2\2\n\2n"+
		"sx}\u0082\u0089\u0090\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}