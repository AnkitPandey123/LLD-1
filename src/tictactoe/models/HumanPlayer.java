package tictactoe.models;

import tictactoe.validations.MoveValidator;

import java.util.Scanner;

public class HumanPlayer extends Player{
    Scanner sc = new Scanner(System.in);
    public HumanPlayer(String name, Symbol symbol) {
        super(name, symbol);
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println(this.name + "Enter row where you want to play your move : ");
        int row = sc.nextInt();
        System.out.println(this.name + "Enter column where you want to play your move : ");
        int col = sc.nextInt();
        // TODO: FOR NOW IMPLEMENTING THIS WILL REVISIT
        Move mv = new Move(this, new Cell(row, col));
        MoveValidator.ValidateMoveByPlayer(board, mv);
        return mv;
    }


}
