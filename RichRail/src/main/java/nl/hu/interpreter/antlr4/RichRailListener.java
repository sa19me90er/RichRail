// Generated from RichRail.g4 by ANTLR 4.4
package nl.hu.interpreter.antlr4;

    import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

import nl.hu.command.AddCommand;
import nl.hu.command.DeleteTrainCommand;
import nl.hu.command.DeleteWagonCommand;
import nl.hu.command.GetSeatsCommand;
import nl.hu.command.NewTrainCommand;
import nl.hu.command.NewWagonCommand;
import nl.hu.command.RemoveCommand;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RichRailParser}.
 */
public interface RichRailListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RichRailParser#newtraincommand}.
	 * @param ctx the parse tree
	 */
	void enterNewtraincommand(@NotNull RichRailParser.NewtraincommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#newtraincommand}.
	 * @param ctx the parse tree
	 */
	void exitNewtraincommand(@NotNull RichRailParser.NewtraincommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#addcommand}.
	 * @param ctx the parse tree
	 */
	void enterAddcommand(@NotNull RichRailParser.AddcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#addcommand}.
	 * @param ctx the parse tree
	 */
	void exitAddcommand(@NotNull RichRailParser.AddcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#deletetraincommand}.
	 * @param ctx the parse tree
	 */
	void enterDeletetraincommand(@NotNull RichRailParser.DeletetraincommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#deletetraincommand}.
	 * @param ctx the parse tree
	 */
	void exitDeletetraincommand(@NotNull RichRailParser.DeletetraincommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#newwagoncommand}.
	 * @param ctx the parse tree
	 */
	void enterNewwagoncommand(@NotNull RichRailParser.NewwagoncommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#newwagoncommand}.
	 * @param ctx the parse tree
	 */
	void exitNewwagoncommand(@NotNull RichRailParser.NewwagoncommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#newcommand}.
	 * @param ctx the parse tree
	 */
	void enterNewcommand(@NotNull RichRailParser.NewcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#newcommand}.
	 * @param ctx the parse tree
	 */
	void exitNewcommand(@NotNull RichRailParser.NewcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#remcommand}.
	 * @param ctx the parse tree
	 */
	void enterRemcommand(@NotNull RichRailParser.RemcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#remcommand}.
	 * @param ctx the parse tree
	 */
	void exitRemcommand(@NotNull RichRailParser.RemcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull RichRailParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull RichRailParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#deletewagoncommand}.
	 * @param ctx the parse tree
	 */
	void enterDeletewagoncommand(@NotNull RichRailParser.DeletewagoncommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#deletewagoncommand}.
	 * @param ctx the parse tree
	 */
	void exitDeletewagoncommand(@NotNull RichRailParser.DeletewagoncommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(@NotNull RichRailParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(@NotNull RichRailParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#getcommand}.
	 * @param ctx the parse tree
	 */
	void enterGetcommand(@NotNull RichRailParser.GetcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#getcommand}.
	 * @param ctx the parse tree
	 */
	void exitGetcommand(@NotNull RichRailParser.GetcommandContext ctx);
}