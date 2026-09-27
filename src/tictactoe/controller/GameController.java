package tictactoe.controller;

import tictactoe.models.Game;
import tictactoe.models.Player;
import tictactoe.models.WinningStrategyType;
import tictactoe.strategies.WinningStrategy;

import java.util.List;

public class GameController {

    public static Game creteGame(Integer dimension, List<Player> players, List<WinningStrategyType> winningStrategyTypes)
    {
        return   Game.getBuilder()
                .setBoardDimension(dimension)
                .setPlayers(players)
                .setWinningStrategyTypes(winningStrategyTypes)
                .build();
    }

    public static void makeMove(Game game) {
        game.makeMove();
    }

    public static void undoMove(Game game) {
        game.undoMove();
    }
}
