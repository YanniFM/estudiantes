// Generated from com/example/Estudiantes.g4 by ANTLR 4.9.3
package com.example;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EstudiantesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, ESTUDIANTE=2, CALIFICACION=3, PARCIAL=4, NUMERO=5, NOMBRE=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ADD", "ESTUDIANTE", "CALIFICACION", "PARCIAL", "NUMERO", "NOMBRE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'agregar'", "'estudiante'", "'calificacion'", "'parcial'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "ESTUDIANTE", "CALIFICACION", "PARCIAL", "NUMERO", "NOMBRE", 
			"WS"
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


	public EstudiantesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Estudiantes.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tJ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\6\6;\n\6\r\6\16\6<\3\7\6\7@\n\7\r\7\16\7A\3\b\6\bE\n\b\r\b\16\bF\3\b"+
		"\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\5\3\2\62;\4\2C\\c|\5\2\13"+
		"\f\17\17\"\"\2L\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\31\3\2\2\2\7$\3\2\2\2\t"+
		"\61\3\2\2\2\13:\3\2\2\2\r?\3\2\2\2\17D\3\2\2\2\21\22\7c\2\2\22\23\7i\2"+
		"\2\23\24\7t\2\2\24\25\7g\2\2\25\26\7i\2\2\26\27\7c\2\2\27\30\7t\2\2\30"+
		"\4\3\2\2\2\31\32\7g\2\2\32\33\7u\2\2\33\34\7v\2\2\34\35\7w\2\2\35\36\7"+
		"f\2\2\36\37\7k\2\2\37 \7c\2\2 !\7p\2\2!\"\7v\2\2\"#\7g\2\2#\6\3\2\2\2"+
		"$%\7e\2\2%&\7c\2\2&\'\7n\2\2\'(\7k\2\2()\7h\2\2)*\7k\2\2*+\7e\2\2+,\7"+
		"c\2\2,-\7e\2\2-.\7k\2\2./\7q\2\2/\60\7p\2\2\60\b\3\2\2\2\61\62\7r\2\2"+
		"\62\63\7c\2\2\63\64\7t\2\2\64\65\7e\2\2\65\66\7k\2\2\66\67\7c\2\2\678"+
		"\7n\2\28\n\3\2\2\29;\t\2\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2="+
		"\f\3\2\2\2>@\t\3\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\16\3\2\2"+
		"\2CE\t\4\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\b\2"+
		"\2I\20\3\2\2\2\6\2<AF\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}