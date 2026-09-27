package tictactoe.models;

import tictactoe.factory.BotMoveFactory;
import tictactoe.strategies.BotMoveStrategy;

public class BotPlayer extends Player{

    private BotDifficultyLevel botDifficultyLevel;
    public BotPlayer(String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(name, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move makeMove(Board board) {
        BotMoveStrategy botMoveStrategy = BotMoveFactory.getInstance(this.botDifficultyLevel);
        Move mv =  botMoveStrategy.makeMove(board);
        System.out.println(this.name + " is making it's move to row " + mv.getCell().getRow()
        + " and column " + mv.getCell().getCol());
        mv.setPlayer(this);
        return mv;
    }
}
