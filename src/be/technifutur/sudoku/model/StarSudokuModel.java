package be.technifutur.sudoku.model;

public class StarSudokuModel {
    public int getLineSize() {
        return 21;
    }

    public int getColumnSize() {
        return 21;
    }

    public boolean isEmpty(int line, int column) {
        return true;
    }
}
