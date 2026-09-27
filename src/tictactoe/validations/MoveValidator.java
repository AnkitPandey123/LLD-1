package tictactoe.validations;

import tictactoe.models.Board;
import tictactoe.models.CellStatus;
import tictactoe.models.Move;

public class MoveValidator {

    public static Boolean ValidateMoveByPlayer(Board board, Move move)
    {
        if(move.getCell().getCol() < 0 || move.getCell().getRow() < 0
        || move.getCell().getRow() >= board.getDimension() || move.getCell().getCol() >= board.getDimension() ||
        board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol()).getCellStatus() == CellStatus.FILLED)
        {

            // TODO: IDEALLY WE WILL BE RETURNING FALES AND WILL CATCH IN PLAYER AND AGAIN ASK FOR MOVE FROM PLAYER
            System.out.println("Move is wrong so ending the game" + move.getCell().getCol() +
                    " " + move.getCell().getRow() +
                    " " + board.getGrid().get(move.getCell().getCol()).get(move.getCell().getRow()).getCellStatus());
            System.exit(0);
        }
        return true;
    }
}
