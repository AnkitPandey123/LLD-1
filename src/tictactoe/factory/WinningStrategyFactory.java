package tictactoe.factory;

import tictactoe.models.WinningStrategyType;
import tictactoe.strategies.ColumnWinningStrategy;
import tictactoe.strategies.DiagonalWinningStrategy;
import tictactoe.strategies.RowWinningStrategy;
import tictactoe.strategies.WinningStrategy;

public class WinningStrategyFactory {

    public static WinningStrategy getInstance(WinningStrategyType winningStrategyType)
    {
        if(winningStrategyType.equals(WinningStrategyType.COLUMN))
        {
            return new ColumnWinningStrategy();
        } else if (winningStrategyType.equals(WinningStrategyType.ROW)) {
            return new RowWinningStrategy();
        }
        else if(winningStrategyType.equals(WinningStrategyType.DIAGONAL))
        {
            return new DiagonalWinningStrategy();
        }
        else
        {
            //TODO: WILL IMPLEMENTS IT, BY CHECKING RIGHT IMPLEMENTATAION. FOR NOW RETURNING ROW WINNING STRATEGY
            // return new EnumConstantNotPresentException(WinningStrategyType, winningStrategyType);
            return new RowWinningStrategy();
        }

    }
}
