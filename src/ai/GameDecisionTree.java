package ai;

import ai.strategies.AIStrategy;
import game.Board;
import java.util.HashSet;

/**
 * A Tree used to analyze potential outcomes and use it to make informed decisions about upcoming
 * moves based on a quantified analysis of a move on a given column.
 */
public class GameDecisionTree {

    /**
     * An internal Node class for the GameDecisionTree that houses a Board for each Node.
     * Each Node also maintains a HashSet containing all children of each node.
     */
    class BoardNode {

        private Board board;

        private HashSet<BoardNode> children;

        protected BoardNode(Board board) {
            this.board = board;
            children = new HashSet<>();
        }
    }

    /** The first Node of the tree, the root */
    private BoardNode root;

    /** The strategy being used to evaluate and quantify the positions of the Checkers */
    private AIStrategy strategy;

    /**
     * Constructor for the GameDecisionTree. It takes an AI Strategy to run any
     * evaluations of the Board that are necessary.
     * 
     * @param strategy The AIStrategy chosen to evaluate the positions of the Checkers
     */
    public GameDecisionTree(AIStrategy strategy) {
        this.strategy = strategy;
        root = null;
    }

    // Pseudocode
    // function ALPHA-BETA-SEARCH(state) returns an action
    //  v ← MAX-VALUE(state, −∞, +∞)
    //  return the action in ACTIONS(state) with value v

    // function MAX-VALUE(state, α, β) returns a utility value
    //  if TERMINAL-TEST(state) the return UTILITY(state)
    //  v ← −∞
    //  for each a in ACTIONS(state) do
    //    v ← MAX(v, MIN-VALUE(RESULT(state, a), α, β))
    //    if v ≥ β then return v
    //    α ← MAX(α, v)
    //  return v

    // function MIN-VALUE(state, α, β) returns a utility value
    //  if TERMINAL-TEST(state) the return UTILITY(state)
    //  v ← +∞
    //  for each a in ACTIONS(state) do
    //    v ← MIN(v, MAX-VALUE(RESULT(state, a), α, β))
    //    if v ≤ α then return v
    //    β ← MIN(β, v)
    //  return v
}
