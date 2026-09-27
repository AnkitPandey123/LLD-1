package tictactoe.strategies;

import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Player;

public interface BotMoveStrategy {
    public Move makeMove(Board board);
}
