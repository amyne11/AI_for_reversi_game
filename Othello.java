/**
 * Java code for Comp24011 Reversi lab
 *
 * @author Mbassip2
 * @author a21674fl
 *
 * Copyright 2023; please do not distribute!
 */

public class Othello {
    // Default player to start game
    public static final int startColour= -1;
    // Default depth of minimax search
    public static final int searchDepth= 8;  // Changed to 4 as per your instruction
    // Default seed for random number generation
    public static final long randomSeed= 0l;

    public static void main(String[] args) {
        BoardState initialState;
        MoveChooser whiteChooser;
        MoveChooser blackChooser;

        // Load boardState from command line if argument given
        if (args.length > 0)
            initialState= new BoardState(args[0]);
        else {
            initialState= new BoardState("");
            initialState.colour= startColour;
        }

        // Choose the two players.
        whiteChooser= new AlphaBetaMoveChooser(searchDepth);  // Set AlphaBetaMoveChooser for White
        blackChooser= new FirstMoveChooser();  // Set FirstMoveChooser for Black

        // Run interactive game UI
        OthelloDisplay othelloDisplay= new OthelloDisplay(initialState,whiteChooser,blackChooser);
        othelloDisplay.startGame();
    }
}

/* vim:set et ts=4 sw=4: */
