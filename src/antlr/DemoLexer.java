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
		T__0=1, T__1=2, REPEAT=3, ENDREPEAT=4, IF=5, THEN=6, ENDIF=7, PRINT=8, 
		READ=9, ID=10, INT=11, DOUBLE=12, ADD=13, MULT=14, NEWLINE=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "REPEAT", "ENDREPEAT", "IF", "THEN", "ENDIF", "PRINT", 
			"READ", "ID", "INT", "DOUBLE", "ADD", "MULT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'=='", "'repeat'", "'endrepeat'", "'if'", "'then'", "'endif'", 
			"'print'", "'read'", null, null, null, "'+'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "REPEAT", "ENDREPEAT", "IF", "THEN", "ENDIF", "PRINT", 
			"READ", "ID", "INT", "DOUBLE", "ADD", "MULT", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\6\13T\n\13\r\13\16\13U\3\f"+
		"\6\fY\n\f\r\f\16\fZ\3\r\6\r^\n\r\r\r\16\r_\3\r\6\rc\n\r\r\r\16\rd\3\r"+
		"\6\rh\n\r\r\r\16\ri\3\16\3\16\3\17\3\17\3\20\5\20q\n\20\3\20\3\20\3\21"+
		"\6\21v\n\21\r\21\16\21w\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\4\4\2C\\c|\5\2\13"+
		"\f\17\17\"\"\2\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7(\3\2\2\2\t/\3\2\2\2\139\3\2\2\2"+
		"\r<\3\2\2\2\17A\3\2\2\2\21G\3\2\2\2\23M\3\2\2\2\25S\3\2\2\2\27X\3\2\2"+
		"\2\31]\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37p\3\2\2\2!u\3\2\2\2#$\7?\2\2"+
		"$\4\3\2\2\2%&\7?\2\2&\'\7?\2\2\'\6\3\2\2\2()\7t\2\2)*\7g\2\2*+\7r\2\2"+
		"+,\7g\2\2,-\7c\2\2-.\7v\2\2.\b\3\2\2\2/\60\7g\2\2\60\61\7p\2\2\61\62\7"+
		"f\2\2\62\63\7t\2\2\63\64\7g\2\2\64\65\7r\2\2\65\66\7g\2\2\66\67\7c\2\2"+
		"\678\7v\2\28\n\3\2\2\29:\7k\2\2:;\7h\2\2;\f\3\2\2\2<=\7v\2\2=>\7j\2\2"+
		">?\7g\2\2?@\7p\2\2@\16\3\2\2\2AB\7g\2\2BC\7p\2\2CD\7f\2\2DE\7k\2\2EF\7"+
		"h\2\2F\20\3\2\2\2GH\7r\2\2HI\7t\2\2IJ\7k\2\2JK\7p\2\2KL\7v\2\2L\22\3\2"+
		"\2\2MN\7t\2\2NO\7g\2\2OP\7c\2\2PQ\7f\2\2Q\24\3\2\2\2RT\t\2\2\2SR\3\2\2"+
		"\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\26\3\2\2\2WY\4\62;\2XW\3\2\2\2YZ\3\2"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[\30\3\2\2\2\\^\4\62;\2]\\\3\2\2\2^_\3\2\2\2_"+
		"]\3\2\2\2_`\3\2\2\2`b\3\2\2\2ac\7\60\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2eg\3\2\2\2fh\4\62;\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2"+
		"j\32\3\2\2\2kl\7-\2\2l\34\3\2\2\2mn\7,\2\2n\36\3\2\2\2oq\7\17\2\2po\3"+
		"\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\f\2\2s \3\2\2\2tv\t\3\2\2ut\3\2\2\2vw\3"+
		"\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\21\2\2z\"\3\2\2\2\n\2UZ_dipw"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}