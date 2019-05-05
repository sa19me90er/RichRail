// Generated from RichRail.g4 by ANTLR 4.4
package nl.hu.interpreter.antlr4;

    import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

import nl.hu.command.AddCommand;
import nl.hu.command.DeleteTrainCommand;
import nl.hu.command.DeleteWagonCommand;
import nl.hu.command.GetSeatsCommand;
import nl.hu.command.NewTrainCommand;
import nl.hu.command.NewWagonCommand;
import nl.hu.command.RemoveCommand;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RichRailLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, NEW=4, TRAIN=5, WAGON=6, ADD=7, DELETE=8, REMOVE=9, 
		GETNUMSEATS=10, ID=11, NUMBER=12, WHITESPACE=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "NEW", "TRAIN", "WAGON", "ADD", "DELETE", "REMOVE", 
		"GETNUMSEATS", "ID", "NUMBER", "WHITESPACE"
	};


	public RichRailLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RichRail.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7"+
		"\fj\n\f\f\f\16\fm\13\f\3\r\6\rp\n\r\r\r\16\rq\3\16\6\16u\n\16\r\16\16"+
		"\16v\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\3\2\4\4\2\62;c|\5\2\13\f\16\17\"\"|\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\3\35\3\2\2\2\5\"\3\2\2\2\7+\3\2\2\2\t\62\3\2\2\2\13\67\3\2\2\2\r"+
		">\3\2\2\2\17E\3\2\2\2\21J\3\2\2\2\23R\3\2\2\2\25Z\3\2\2\2\27g\3\2\2\2"+
		"\31o\3\2\2\2\33t\3\2\2\2\35\36\7\"\2\2\36\37\7v\2\2\37 \7q\2\2 !\7\"\2"+
		"\2!\4\3\2\2\2\"#\7p\2\2#$\7w\2\2$%\7o\2\2%&\7u\2\2&\'\7g\2\2\'(\7c\2\2"+
		"()\7v\2\2)*\7u\2\2*\6\3\2\2\2+,\7\"\2\2,-\7h\2\2-.\7t\2\2./\7q\2\2/\60"+
		"\7o\2\2\60\61\7\"\2\2\61\b\3\2\2\2\62\63\7p\2\2\63\64\7g\2\2\64\65\7y"+
		"\2\2\65\66\7\"\2\2\66\n\3\2\2\2\678\7v\2\289\7t\2\29:\7c\2\2:;\7k\2\2"+
		";<\7p\2\2<=\7\"\2\2=\f\3\2\2\2>?\7y\2\2?@\7c\2\2@A\7i\2\2AB\7q\2\2BC\7"+
		"p\2\2CD\7\"\2\2D\16\3\2\2\2EF\7c\2\2FG\7f\2\2GH\7f\2\2HI\7\"\2\2I\20\3"+
		"\2\2\2JK\7f\2\2KL\7g\2\2LM\7n\2\2MN\7g\2\2NO\7v\2\2OP\7g\2\2PQ\7\"\2\2"+
		"Q\22\3\2\2\2RS\7t\2\2ST\7g\2\2TU\7o\2\2UV\7q\2\2VW\7x\2\2WX\7g\2\2XY\7"+
		"\"\2\2Y\24\3\2\2\2Z[\7i\2\2[\\\7g\2\2\\]\7v\2\2]^\7p\2\2^_\7w\2\2_`\7"+
		"o\2\2`a\7u\2\2ab\7g\2\2bc\7c\2\2cd\7v\2\2de\7u\2\2ef\7\"\2\2f\26\3\2\2"+
		"\2gk\4c|\2hj\t\2\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\30\3\2\2"+
		"\2mk\3\2\2\2np\4\62;\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\32\3\2"+
		"\2\2su\t\3\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\16"+
		"\2\2y\34\3\2\2\2\6\2kqv\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}