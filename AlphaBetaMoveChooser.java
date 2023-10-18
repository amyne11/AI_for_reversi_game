/**
 * Solution code for Comp24011 Reversi lab
 *
 * @author Y54754AE
 */

public class AlphaBetaMoveChooser extends MoveChooser {
    /**
     * MoveCooser implementation AlphaBetaMoveChooser(int)
     *
     * @param   searchDepth The requested depth for minimax search
     */
    public AlphaBetaMoveChooser(int searchDepth) {
        // Add object initialisation code...
        super("MyAwesomeAgent",searchDepth);
    }

    /**
     * Need to implement chooseMove(BoardState,Move)
     *
     * @param   boardState  The current state of the game board
     *
     * @param   hint        Skip move or board location clicked on the UI
     *                      This parameter should be ignored!
     *
     * @return  The move chosen by alpha-beta pruning as discussed in the course
     */
    public Move chooseMove(BoardState boardState, Move hint) {
        // Add alpha-beta pruning code...
        Move ans= null;
        return ans;
    }

    /**
     * Need to implement boardEval(BoardState)
     *
     * @param   boardState  The current state of the game board
     *
     * @return  The value of the board using Norvig's weighting of squares
     */
    public int boardEval(BoardState boardState) {
    // Define the weight matrix for the board
    int[][] weights = {
        {120, -20, 20, 5, 5, 20, -20, 120},
        {-20, -40, -5, -5, -5, -5, -40, -20},
        {20, -5, 15, 3, 3, 15, -5, 20},
        {5, -5, 3, 3, 3, 3, -5, 5},
        {5, -5, 3, 3, 3, 3, -5, 5},
        {20, -5, 15, 3, 3, 15, -5, 20},
        {-20, -40, -5, -5, -5, -5, -40, -20},
        {120, -20, 20, 5, 5, 20, -20, 120}
    };

    int score = 0;

    // Iterate through each square on the board
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            // Assuming boardState has a method getSquareValue(i, j)
            // which returns -1 for black, 1 for white, and 0 for empty.
            int squareValue = boardState.getContents(i, j);
            
            if (squareValue == 1) { // white piece
                score += weights[i][j];
            } else if (squareValue == -1) { // black piece
                score -= weights[i][j];
            }
        }
    }
    
    return score;
}

}

/* vim:set et ts=4 sw=4: */
