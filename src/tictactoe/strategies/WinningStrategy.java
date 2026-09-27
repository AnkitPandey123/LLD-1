package tictactoe.strategies;

import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Player;

public interface WinningStrategy {

    public Boolean checkWinner(Board board, Move move);
    public void undoMove(Move move);
}
