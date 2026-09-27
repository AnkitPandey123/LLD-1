package tictactoe.strategies;

import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Player;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy{

    HashMap<Integer, HashMap<Character, Integer>> rowMap = new HashMap<>();
    @Override
    public Boolean checkWinner(Board board, Move move) {
        rowMap.putIfAbsent(move.getCell().getRow(), new HashMap<>());
        rowMap.get(move.getCell().getRow()).putIfAbsent(move.getPlayer().getSymbol().getSymChar(), 0);
        rowMap.get(move.getCell().getRow()).
                put(move.getPlayer().getSymbol().getSymChar(), rowMap.get(move.getCell().getRow()).get(move.getPlayer().getSymbol().getSymChar())+1);

        if(rowMap.get(move.getCell().getRow()).get(move.getPlayer().getSymbol().getSymChar()) == board.getDimension())
        {
            return true;
        }
        return false;
    }

    @Override
    public void undoMove(Move move) {
        rowMap.get(move.getCell().getRow()).
                put(move.getPlayer().getSymbol().getSymChar(),
                        rowMap.get(move.getCell().getRow()).get(move.getPlayer().getSymbol().getSymChar())-1);
    }
}
