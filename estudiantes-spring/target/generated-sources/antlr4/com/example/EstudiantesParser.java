// Generated from com/example/Estudiantes.g4 by ANTLR 4.9.3
package com.example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EstudiantesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, ESTUDIANTE=2, CALIFICACION=3, PARCIAL=4, NUMERO=5, NOMBRE=6, WS=7;
	public static final int
		RULE_comando = 0, RULE_agregar_estudiante = 1, RULE_agregar_calificacion = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"comando", "agregar_estudiante", "agregar_calificacion"
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

	@Override
	public String getGrammarFileName() { return "Estudiantes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EstudiantesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ComandoContext extends ParserRuleContext {
		public Agregar_estudianteContext agregar_estudiante() {
			return getRuleContext(Agregar_estudianteContext.class,0);
		}
		public Agregar_calificacionContext agregar_calificacion() {
			return getRuleContext(Agregar_calificacionContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EstudiantesListener ) ((EstudiantesListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EstudiantesListener ) ((EstudiantesListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_comando);
		try {
			setState(8);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				agregar_estudiante();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(7);
				agregar_calificacion();
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

	public static class Agregar_estudianteContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(EstudiantesParser.ADD, 0); }
		public TerminalNode ESTUDIANTE() { return getToken(EstudiantesParser.ESTUDIANTE, 0); }
		public TerminalNode NOMBRE() { return getToken(EstudiantesParser.NOMBRE, 0); }
		public Agregar_estudianteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agregar_estudiante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EstudiantesListener ) ((EstudiantesListener)listener).enterAgregar_estudiante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EstudiantesListener ) ((EstudiantesListener)listener).exitAgregar_estudiante(this);
		}
	}

	public final Agregar_estudianteContext agregar_estudiante() throws RecognitionException {
		Agregar_estudianteContext _localctx = new Agregar_estudianteContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_agregar_estudiante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(ADD);
			setState(11);
			match(ESTUDIANTE);
			setState(12);
			match(NOMBRE);
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

	public static class Agregar_calificacionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(EstudiantesParser.ADD, 0); }
		public TerminalNode CALIFICACION() { return getToken(EstudiantesParser.CALIFICACION, 0); }
		public TerminalNode NOMBRE() { return getToken(EstudiantesParser.NOMBRE, 0); }
		public TerminalNode PARCIAL() { return getToken(EstudiantesParser.PARCIAL, 0); }
		public TerminalNode NUMERO() { return getToken(EstudiantesParser.NUMERO, 0); }
		public Agregar_calificacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agregar_calificacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EstudiantesListener ) ((EstudiantesListener)listener).enterAgregar_calificacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EstudiantesListener ) ((EstudiantesListener)listener).exitAgregar_calificacion(this);
		}
	}

	public final Agregar_calificacionContext agregar_calificacion() throws RecognitionException {
		Agregar_calificacionContext _localctx = new Agregar_calificacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_agregar_calificacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(ADD);
			setState(15);
			match(CALIFICACION);
			setState(16);
			match(NOMBRE);
			setState(17);
			match(PARCIAL);
			setState(18);
			match(NUMERO);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\27\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\5\2\13\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\2\2\5\2\4\6\2\2\2\24\2\n\3\2\2\2\4\f\3\2\2\2\6\20\3\2\2\2\b\13"+
		"\5\4\3\2\t\13\5\6\4\2\n\b\3\2\2\2\n\t\3\2\2\2\13\3\3\2\2\2\f\r\7\3\2\2"+
		"\r\16\7\4\2\2\16\17\7\b\2\2\17\5\3\2\2\2\20\21\7\3\2\2\21\22\7\5\2\2\22"+
		"\23\7\b\2\2\23\24\7\6\2\2\24\25\7\7\2\2\25\7\3\2\2\2\3\n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}