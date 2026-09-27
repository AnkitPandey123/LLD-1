package tictactoe.models;

public class Cell {

    private Integer row;
    private Integer col;
    private Symbol symbol;
    private CellStatus cellStatus;

    public Cell(int row, int col)
    {
        this.row = row;
        this.col = col;
        this.cellStatus = CellStatus.EMPTY;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public void setCellStatus(CellStatus cellStatus) {
        this.cellStatus = cellStatus;
    }

    public CellStatus getCellStatus() {
        return cellStatus;
    }

    public Integer getRow() {
        return row;
    }

    public Integer getCol() {
        return col;
    }

    public  void displayCell() {
        if (this.symbol == null) {
            System.out.print("| |");
        } else{
            System.out.print("| " + this.symbol.getSymChar() + "|");
        }
    }
}
