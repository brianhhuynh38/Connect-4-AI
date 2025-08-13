package game;

import java.util.EnumMap;
import util.Direction;

/**
 * A Node class meant to be used with the Board class to represent the Checkers used in
 * a game of Connect 4. This Node class maintains references to adjacent Nodes in all 8
 * directions in order to properly assess the benefit of placing a token in a certain spot.
 */
public class CheckerNode {
    
    /** An EnumMap consisting of CheckerNodes in each of the 8 compass directions */
    private final EnumMap<Direction, CheckerNode> neighborMap;

    /** The type of Checker occupies this spot (red, yellow, or empty) */
    private CheckerType type;

    /**
     * A constructor function that initializes to default values given the bare minimum coordinates.
     * Remember to properly set Node connections if using this constructor.
     */
    public CheckerNode() {
        type = CheckerType.EMPTY;
        neighborMap = new EnumMap<>(Direction.class);
    }

    /**
     * Sets CheckerNodes that are close to this CheckerNode in the 8 compass directions.
     * Any Directions that remain unused will be considered an invalid space; in other
     * words, it is the edge of the board.
     * 
     * @param neighbors An EnumMap that lists all the neighbors of this CheckerNode, as 
     * well as each of the directions that each neighbor is in
     */
    public void setNearestNodes(EnumMap<Direction, CheckerNode> neighbors) {
        for (Direction dir : neighbors.keySet()) {
            neighborMap.put(dir, neighbors.get(dir));
        }
    }

    /**
     * Gets the CheckerNode that is in the direction specified. If the key does
     * not exist, then this is a boundary and will return null.
     * 
     * @param direction The direction from this CheckerNode to return
     * @return The CheckerNode in the direction specified; if it does not exist, null
     */
    public CheckerNode getNeighbor(Direction direction) {
        return neighborMap.get(direction);
    }

    /**
     * Returns the type of checker occupying this space (red, yellow, empty)
     * 
     * @return The CheckerType of this CheckerNode
     */
    public CheckerType getType() {
        return type;
    }

    public void setType(CheckerType type) {
        this.type = type;
    }

}
