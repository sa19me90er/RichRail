// Generated from RichRail.g4 by ANTLR 4.4
package nl.hu.interpreter.antlr4;

    import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import nl.hu.command.AddCommand;
import nl.hu.command.DeleteTrainCommand;
import nl.hu.command.DeleteWagonCommand;
import nl.hu.command.GetSeatsCommand;
import nl.hu.command.NewTrainCommand;
import nl.hu.command.NewWagonCommand;
import nl.hu.command.RemoveCommand;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RichRailParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, NEW=4, TRAIN=5, WAGON=6, ADD=7, DELETE=8, REMOVE=9, 
		GETNUMSEATS=10, ID=11, NUMBER=12, WHITESPACE=13;
	public static final String[] tokenNames = {
		"<INVALID>", "' to '", "'numseats'", "' from '", "'new '", "'train '", 
		"'wagon '", "'add '", "'delete '", "'remove '", "'getnumseats '", "ID", 
		"NUMBER", "WHITESPACE"
	};
	public static final int
		RULE_command = 0, RULE_newcommand = 1, RULE_newtraincommand = 2, RULE_newwagoncommand = 3, 
		RULE_addcommand = 4, RULE_getcommand = 5, RULE_deletetraincommand = 6, 
		RULE_deletewagoncommand = 7, RULE_remcommand = 8, RULE_type = 9;
	public static final String[] ruleNames = {
		"command", "newcommand", "newtraincommand", "newwagoncommand", "addcommand", 
		"getcommand", "deletetraincommand", "deletewagoncommand", "remcommand", 
		"type"
	};

	@Override
	public String getGrammarFileName() { return "RichRail.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RichRailParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CommandContext extends ParserRuleContext {
		public NewcommandContext newcommand() {
			return getRuleContext(NewcommandContext.class,0);
		}
		public DeletetraincommandContext deletetraincommand() {
			return getRuleContext(DeletetraincommandContext.class,0);
		}
		public DeletewagoncommandContext deletewagoncommand() {
			return getRuleContext(DeletewagoncommandContext.class,0);
		}
		public RemcommandContext remcommand() {
			return getRuleContext(RemcommandContext.class,0);
		}
		public AddcommandContext addcommand() {
			return getRuleContext(AddcommandContext.class,0);
		}
		public GetcommandContext getcommand() {
			return getRuleContext(GetcommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			setState(26);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20); newcommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21); addcommand();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(22); getcommand();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(23); deletetraincommand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(24); deletewagoncommand();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(25); remcommand();
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

	public static class NewcommandContext extends ParserRuleContext {
		public NewwagoncommandContext newwagoncommand() {
			return getRuleContext(NewwagoncommandContext.class,0);
		}
		public NewtraincommandContext newtraincommand() {
			return getRuleContext(NewtraincommandContext.class,0);
		}
		public NewcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterNewcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitNewcommand(this);
		}
	}

	public final NewcommandContext newcommand() throws RecognitionException {
		NewcommandContext _localctx = new NewcommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_newcommand);
		try {
			setState(30);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28); newtraincommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29); newwagoncommand();
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

	public static class NewtraincommandContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public TerminalNode TRAIN() { return getToken(RichRailParser.TRAIN, 0); }
		public TerminalNode NEW() { return getToken(RichRailParser.NEW, 0); }
		public NewtraincommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newtraincommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterNewtraincommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitNewtraincommand(this);
		}
	}

	public final NewtraincommandContext newtraincommand() throws RecognitionException {
		NewtraincommandContext _localctx = new NewtraincommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_newtraincommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(NEW);
			setState(33); match(TRAIN);
			setState(34); ((NewtraincommandContext)_localctx).ID = match(ID);
			new NewTrainCommand((((NewtraincommandContext)_localctx).ID!=null?((NewtraincommandContext)_localctx).ID.getText():null)).execute();
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

	public static class NewwagoncommandContext extends ParserRuleContext {
		public Token ID;
		public Token NUMBER;
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(RichRailParser.NUMBER, 0); }
		public TerminalNode WAGON() { return getToken(RichRailParser.WAGON, 0); }
		public TerminalNode NEW() { return getToken(RichRailParser.NEW, 0); }
		public NewwagoncommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newwagoncommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterNewwagoncommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitNewwagoncommand(this);
		}
	}

	public final NewwagoncommandContext newwagoncommand() throws RecognitionException {
		NewwagoncommandContext _localctx = new NewwagoncommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_newwagoncommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(NEW);
			setState(38); match(WAGON);
			setState(39); ((NewwagoncommandContext)_localctx).ID = match(ID);
			setState(42);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(40); match(T__1);
				setState(41); ((NewwagoncommandContext)_localctx).NUMBER = match(NUMBER);
				}
			}

			new NewWagonCommand((((NewwagoncommandContext)_localctx).ID!=null?((NewwagoncommandContext)_localctx).ID.getText():null), (((NewwagoncommandContext)_localctx).NUMBER!=null?((NewwagoncommandContext)_localctx).NUMBER.getText():null)).execute();
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

	public static class AddcommandContext extends ParserRuleContext {
		public Token add;
		public Token to;
		public List<TerminalNode> ID() { return getTokens(RichRailParser.ID); }
		public TerminalNode ADD() { return getToken(RichRailParser.ADD, 0); }
		public TerminalNode ID(int i) {
			return getToken(RichRailParser.ID, i);
		}
		public AddcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterAddcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitAddcommand(this);
		}
	}

	public final AddcommandContext addcommand() throws RecognitionException {
		AddcommandContext _localctx = new AddcommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(ADD);
			setState(47); ((AddcommandContext)_localctx).add = match(ID);
			setState(48); match(T__2);
			setState(49); ((AddcommandContext)_localctx).to = match(ID);
			new AddCommand((((AddcommandContext)_localctx).add!=null?((AddcommandContext)_localctx).add.getText():null), (((AddcommandContext)_localctx).to!=null?((AddcommandContext)_localctx).to.getText():null)).execute();
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

	public static class GetcommandContext extends ParserRuleContext {
		public TypeContext type;
		public Token to;
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public TerminalNode GETNUMSEATS() { return getToken(RichRailParser.GETNUMSEATS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GetcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterGetcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitGetcommand(this);
		}
	}

	public final GetcommandContext getcommand() throws RecognitionException {
		GetcommandContext _localctx = new GetcommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_getcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(GETNUMSEATS);
			setState(53); ((GetcommandContext)_localctx).type = type();
			setState(54); ((GetcommandContext)_localctx).to = match(ID);
			new GetSeatsCommand((((GetcommandContext)_localctx).type!=null?_input.getText(((GetcommandContext)_localctx).type.start,((GetcommandContext)_localctx).type.stop):null), (((GetcommandContext)_localctx).to!=null?((GetcommandContext)_localctx).to.getText():null)).execute();
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

	public static class DeletetraincommandContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public TerminalNode DELETE() { return getToken(RichRailParser.DELETE, 0); }
		public TerminalNode TRAIN() { return getToken(RichRailParser.TRAIN, 0); }
		public DeletetraincommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deletetraincommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterDeletetraincommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitDeletetraincommand(this);
		}
	}

	public final DeletetraincommandContext deletetraincommand() throws RecognitionException {
		DeletetraincommandContext _localctx = new DeletetraincommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_deletetraincommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(DELETE);
			setState(58); match(TRAIN);
			setState(59); ((DeletetraincommandContext)_localctx).ID = match(ID);
			new DeleteTrainCommand((((DeletetraincommandContext)_localctx).ID!=null?((DeletetraincommandContext)_localctx).ID.getText():null)).execute();
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

	public static class DeletewagoncommandContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public TerminalNode DELETE() { return getToken(RichRailParser.DELETE, 0); }
		public TerminalNode WAGON() { return getToken(RichRailParser.WAGON, 0); }
		public DeletewagoncommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deletewagoncommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterDeletewagoncommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitDeletewagoncommand(this);
		}
	}

	public final DeletewagoncommandContext deletewagoncommand() throws RecognitionException {
		DeletewagoncommandContext _localctx = new DeletewagoncommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_deletewagoncommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(DELETE);
			setState(63); match(WAGON);
			setState(64); ((DeletewagoncommandContext)_localctx).ID = match(ID);
			new DeleteWagonCommand((((DeletewagoncommandContext)_localctx).ID!=null?((DeletewagoncommandContext)_localctx).ID.getText():null)).execute();
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

	public static class RemcommandContext extends ParserRuleContext {
		public Token rem;
		public Token to;
		public List<TerminalNode> ID() { return getTokens(RichRailParser.ID); }
		public TerminalNode REMOVE() { return getToken(RichRailParser.REMOVE, 0); }
		public TerminalNode ID(int i) {
			return getToken(RichRailParser.ID, i);
		}
		public RemcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterRemcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitRemcommand(this);
		}
	}

	public final RemcommandContext remcommand() throws RecognitionException {
		RemcommandContext _localctx = new RemcommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_remcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(REMOVE);
			setState(68); ((RemcommandContext)_localctx).rem = match(ID);
			setState(69); match(T__0);
			setState(70); ((RemcommandContext)_localctx).to = match(ID);
			new RemoveCommand((((RemcommandContext)_localctx).rem!=null?((RemcommandContext)_localctx).rem.getText():null), (((RemcommandContext)_localctx).to!=null?((RemcommandContext)_localctx).to.getText():null)).execute();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TRAIN() { return getToken(RichRailParser.TRAIN, 0); }
		public TerminalNode WAGON() { return getToken(RichRailParser.WAGON, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==TRAIN || _la==WAGON) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2\35\n\2\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\5\5-\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2\7\bJ\2\34"+
		"\3\2\2\2\4 \3\2\2\2\6\"\3\2\2\2\b\'\3\2\2\2\n\60\3\2\2\2\f\66\3\2\2\2"+
		"\16;\3\2\2\2\20@\3\2\2\2\22E\3\2\2\2\24K\3\2\2\2\26\35\5\4\3\2\27\35\5"+
		"\n\6\2\30\35\5\f\7\2\31\35\5\16\b\2\32\35\5\20\t\2\33\35\5\22\n\2\34\26"+
		"\3\2\2\2\34\27\3\2\2\2\34\30\3\2\2\2\34\31\3\2\2\2\34\32\3\2\2\2\34\33"+
		"\3\2\2\2\35\3\3\2\2\2\36!\5\6\4\2\37!\5\b\5\2 \36\3\2\2\2 \37\3\2\2\2"+
		"!\5\3\2\2\2\"#\7\6\2\2#$\7\7\2\2$%\7\r\2\2%&\b\4\1\2&\7\3\2\2\2\'(\7\6"+
		"\2\2()\7\b\2\2),\7\r\2\2*+\7\4\2\2+-\7\16\2\2,*\3\2\2\2,-\3\2\2\2-.\3"+
		"\2\2\2./\b\5\1\2/\t\3\2\2\2\60\61\7\t\2\2\61\62\7\r\2\2\62\63\7\3\2\2"+
		"\63\64\7\r\2\2\64\65\b\6\1\2\65\13\3\2\2\2\66\67\7\f\2\2\678\5\24\13\2"+
		"89\7\r\2\29:\b\7\1\2:\r\3\2\2\2;<\7\n\2\2<=\7\7\2\2=>\7\r\2\2>?\b\b\1"+
		"\2?\17\3\2\2\2@A\7\n\2\2AB\7\b\2\2BC\7\r\2\2CD\b\t\1\2D\21\3\2\2\2EF\7"+
		"\13\2\2FG\7\r\2\2GH\7\5\2\2HI\7\r\2\2IJ\b\n\1\2J\23\3\2\2\2KL\t\2\2\2"+
		"L\25\3\2\2\2\5\34 ,";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}