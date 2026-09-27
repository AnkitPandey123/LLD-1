package tictactoe.factory;

import tictactoe.models.BotDifficultyLevel;
import tictactoe.strategies.BotMoveStrategy;
import tictactoe.strategies.EasyBotMoveStrategy;
import tictactoe.strategies.HardBotMoveStrategy;
import tictactoe.strategies.MediumBotMoveStrategy;

public class BotMoveFactory {

    public static BotMoveStrategy getInstance(BotDifficultyLevel botDifficultyLevel)
    {
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY))
        {
            return new EasyBotMoveStrategy();
        }
        else if(botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM))
        {
            return new MediumBotMoveStrategy();
        }
        return new HardBotMoveStrategy();
    }
}
