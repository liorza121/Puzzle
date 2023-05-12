import java.util.Arrays;

public class Board {

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Board)) {
            return false;
        }
        Board board = (Board) other;
        return Arrays.deepEquals(tiles, board.tiles);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(tiles);
    }
}
/**
 * To do:
 * add a 2D matrix of tiles as a field.
 * add a constructor
 * research Arrays.deepHashCode to understand how to implement the board
 * add a moveTile method
 * add directrion enum
 */