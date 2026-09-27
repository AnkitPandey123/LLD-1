package tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private Integer dimension;
    private List<List<Cell>> grid = new ArrayList<>();

    public Board(Integer dimension)
    {
        this.dimension = dimension;

        for(int i=0;i<dimension;i++)
        {
            this.grid.add(new ArrayList<>());
            for(int j = 0; j <dimension; j++)
            {
                this.grid.get(i).add(new Cell(i, j));
            }
        }
    }

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public Integer getDimension() {
        return dimension;
    }

    public  void displayBoard()
    {
        for(List<Cell> row : grid)
        {
            for(Cell cell : row)
            {
                cell.displayCell();
            }
            System.out.println();
        }
    }
}
