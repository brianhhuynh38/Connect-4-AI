package ai.strategies;

import game.Board;
import game.CheckerNode;

public class SeekerStrategy implements AIStrategy {
    
    @Override
    public int analyzePosition(CheckerNode node) {
        return -1;
    }

    @Override
    public int determineAction(Board board) {
        return -1;
    }
}
