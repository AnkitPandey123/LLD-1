package tictactoe.models;

import tictactoe.factory.WinningStrategyFactory;
import tictactoe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
   // private Integer boardDimension;
    private List<Player> players;
    private Player winner;
    private List<WinningStrategyType> winningStrategyTypes;
    private List<WinningStrategy> winningStrategy;
    private Integer currentPlayerIndex = 0;
    private List<Move> movesHistory;
    private GameStatus gameStatus;

    public Board getBoard() {
        return board;
    }

    private Game(Integer boardDimension, List<Player> players, List<WinningStrategyType> winningStrategyTypes)
    {
        this.winningStrategy = new ArrayList<>();
        this.movesHistory = new ArrayList<>();
        this.board = new Board(boardDimension);
        this.players = players;
        for(WinningStrategyType winningStrategies : winningStrategyTypes)
        {
            winningStrategy.add(WinningStrategyFactory.getInstance(winningStrategies));
        }
        this.gameStatus = GameStatus.IN_PROGRESS;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public static GameBuilder getBuilder()
    {
        return new GameBuilder();
    }

    public void makeMove() {
        // make and validate move
        Move move = this.players.get(this.currentPlayerIndex).makeMove(this.board);
        //update the board with symbol and status
        this.board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol()).setCellStatus(CellStatus.FILLED);
        this.board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol()).
                setSymbol(this.players.get(this.currentPlayerIndex).getSymbol());
        // check winner if winner close the game

        for(WinningStrategy winningStrategies : winningStrategy)
        {
            Boolean isWin = winningStrategies.checkWinner(this.board, move);
            if(isWin)
            {
                this.winner = this.players.get(this.currentPlayerIndex);
                this.gameStatus = GameStatus.COMPLETED;
                System.out.println(this.players.get(this.currentPlayerIndex).getName() + "is the Winner");
            }
        }

        // update the index
        this.currentPlayerIndex = (this.currentPlayerIndex + 1) % this.players.size();
        // add in moveHistory if undo required.
        this.movesHistory.add(move);
    }

    public void undoMove() {
        // Get the last move
        Move move = this.movesHistory.getLast();
        // Delte the last move from the moveHistory
        this.movesHistory.removeLast();
        // Update the board
        this.board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol()).setCellStatus(CellStatus.EMPTY);
        this.board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol()).setSymbol(null);
        // As you have updated in winner Algo that hashmap, you also need to undo that count
        for(WinningStrategy winningStrategies : winningStrategy)
        {
            winningStrategies.undoMove(move);
        }
        // Update the index to last player only
        this.currentPlayerIndex = (this.currentPlayerIndex - 1 + this.players.size()) % this.players.size();
    }

    public static class GameBuilder {
        private Integer boardDimension;
        private List<Player> players;
        private List<WinningStrategyType> winningStrategyTypes;

        public GameBuilder setBoardDimension(Integer boardDimension) {
            this.boardDimension = boardDimension;
            return this;
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public GameBuilder setWinningStrategyTypes(List<WinningStrategyType> winningStrategyTypes) {
            this.winningStrategyTypes = winningStrategyTypes;
            return this;
        }

        public Game build()
        {
            return new Game(boardDimension, players, winningStrategyTypes);
        }
    }
}
