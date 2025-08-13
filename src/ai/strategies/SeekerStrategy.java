package ai.strategies;

import game.Board;
import game.CheckerNode;
import game.CheckerType;

/**
 * The SeekerStrategy tries to discern the best point to drop a checker based on how many
 * checkers of the same type or empty spaces there are 
 */
public class SeekerStrategy implements AIStrategy {
    
    @Override
    public int analyzePosition(CheckerNode checker) {
        CheckerType type = checker.getType();
        // If the checker slot is not empty, this slot is occupied and is not a valid move
        if (type != CheckerType.EMPTY) return 0;

        // Check horizontal line for matching checkers
        

        // TODO: Incomplete
        return -1;
    }

    @Override
    public int determineAction(Board board) {
        // TODO: Incomplete
        return -1;
    }
}
