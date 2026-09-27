package tictactoe.strategies;

import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Player;

public class ColumnWinningStrategy implements WinningStrategy{
    @Override
    public Boolean checkWinner(Board board, Move move) {
        return null;
    }

    @Override
    public void undoMove(Move move) {

    }
}
