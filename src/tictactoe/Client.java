package tictactoe;

import tictactoe.controller.GameController;
import tictactoe.models.*;

import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player1 = new HumanPlayer("Ankit", new Symbol('X'));
        Player player2 = new BotPlayer("BotMaster", new Symbol('O'), BotDifficultyLevel.EASY);

        Game game = GameController.creteGame(3, List.of(player1, player2), List.of(WinningStrategyType.ROW));

      //  game.getBoard().displayBoard();
      //  System.out.println(game.getGameStatus());

        while(game.getGameStatus() == GameStatus.IN_PROGRESS)
        {
            GameController.makeMove(game);
            game.getBoard().displayBoard();
            System.out.println("Do you want to undo your move Y/N : ");
            Character wantToUndoMove = sc.next().charAt(0);
            if(wantToUndoMove == 'Y')
            {
                GameController.undoMove(game);
                game.getBoard().displayBoard();
            }
        }

        // TODO: BOT MOVE STRATEGY IMPLEMENTATION ONE SUPPOSE EASY, UNDO IMPLEMENTATION;
    }
}
