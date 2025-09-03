package game;

public class Board {

    // Default dimensions for the Connect 4 Board
    static final int DEFAULT_ROWS = 6;
    static final int DEFAULT_COLUMNS = 7;
    
    CheckerNode[][] layout;

    
    /**
     * Default constructor that intializes the Board layout with the dimensions of a
     * regular, real-life Connect 4 Board (6 rows, 7 columns)
     */
    public Board() {
        this.layout = new CheckerNode[DEFAULT_ROWS][DEFAULT_COLUMNS];
        for (CheckerNode[] row : layout) {
            for (CheckerNode checker : row) {
                //checker.setNearestNodes(neighbors);
            }
        }
    }



}
