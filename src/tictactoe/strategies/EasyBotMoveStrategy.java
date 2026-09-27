package tictactoe.strategies;

import tictactoe.models.*;

public class EasyBotMoveStrategy implements BotMoveStrategy{
    @Override
    public Move makeMove(Board board) {
        for(int i=0;i<board.getDimension();i++)
        {
            for(int j=0;j<board.getDimension();j++)
            {
                if(board.getGrid().get(i).get(j).getCellStatus()
                == CellStatus.EMPTY)
                {
                    return new Move(null, new Cell(i, j));
                }
            }
        }
        return null;
    }
}
