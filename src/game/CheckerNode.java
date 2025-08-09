package game;

/**
 * A Node class meant to be used with the Board class to represent the Checkers used in
 * a game of Connect 4. This Node class maintains references to adjacent Nodes on all
 * sides in order to properly assess the benefit of placing a token in a certain spot.
 */
public class CheckerNode {
    
    /** A CheckerNode adjacent to this one in a given direction */
    private CheckerNode left, right, up, down;
    /** A CheckerNode in a given diagonal direction */
    private CheckerNode upLeft, upRight, downLeft, downRight;
    /** The type of Checker occupies this spot (red, yellow, or empty) */
    private CheckerType type;
    /** Coordinate value (x, y) for this CheckerNode's position on the Board */
    private int x, y;

    /**
     * A constructor function that initializes to default values given the bare minimum coordinates.
     * Remember to properly set Node connections if using this constructor.
     * 
     * @param x The x coordinate the checker is located at on the board
     * @param y The y coordinate the checker is located at on the board
     */
    public CheckerNode(int x, int y) {
        this.type = CheckerType.EMPTY;
        this.x = x;
        this.y = y;
    }

    /**
     * Calculate the amount of strategic advantage a certain node has based on its location and
     * position relative to other checkers. Neighboring checkers are iterated through recursively
     * until it hits the boundaries or an opposing checker
     */
    @Deprecated
    public int calculateStrategicAdvantage() {
        // If the slot is already occupied, return 0 as it is an invalid move
        if (type != CheckerType.EMPTY) return 0;
        
        int totalAdvantage = 0;

        // Check for advantage in 
        int hAdvantage = getNeighborAdvantage(right) + getNeighborAdvantage(left);
        
        return -1;
    }

    @Deprecated
    private int getNeighborAdvantage(CheckerNode neighbor) {
        // If the current Node is null, then end recursive search
        if (neighbor == null) return 0;



        return -1;
    }

    /**
     * Sets all of the closest nodes to this one. If the Node is on a boundary,
     * then it should be set to null.
     * 
     * @param left The CheckerNode to the left of this one
     * @param right The CheckerNode to the right of this one
     * @param up The CheckerNode above this one
     * @param down The CheckerNode below this one
     */
    public void setNearestNodes(CheckerNode left, CheckerNode right, CheckerNode up, CheckerNode down,
    CheckerNode upLeft, CheckerNode upRight, CheckerNode downLeft, CheckerNode downRight) {
        // Set adjacent nodes
        this.left = left;
        this.right = right;
        this.up = up;
        this.down = down;
        // Set diagonal nodes
        this.upLeft = upLeft;
        this.upRight = upRight;
        this.downLeft = downLeft;
        this.downRight = downRight;
    }
}
