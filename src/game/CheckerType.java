package game;

/**
 * An enumerator made to differentiate the color of the checkers being slotted into 
 * each column (red or yellow). This is primarily to make it more readable. If it is
 * empty, then no checker exists in that given slot
 */
public enum CheckerType {
    /** Player 1's color */
    RED,
    /** Player 2's color */
    YELLOW,
    /** No checker exists in this slot */
    EMPTY
};
