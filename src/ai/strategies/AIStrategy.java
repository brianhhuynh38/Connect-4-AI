package ai.strategies;

import game.Board;
import game.CheckerNode;

/**
 * The AIStrategy is meant to define the reasoning and overall strategy employed
 * by a non-human player.
 */
interface AIStrategy {
    /** 
     * Returns a numerical value representative of how worthwhile it would be to
     * place a checker at the current location. This should check in all cardinal
     * and ordinal directions. The larger the number, the more favorable the 
     * 
     * @return An integer representing how favorable the action is
     */
    int analyzePosition(CheckerNode node);

    /**
     * Determines what column to drop the checker in and returns that value based on
     * analysis of a given Board and its positioning.
     * 
     * @return The index of the column the Checker is meant to be dropped on the board
     */
    int determineAction(Board board);
}
