package be.technifutur.sudoku.model;

public class SudokuModel4x4 {

    public static final char EMPTY_VALUE = 0;
    char[][] grille = new char[4][4];
    public int getLineSize() {
        return 4;
    }

    public int getColumnSize() {
        return 4;
    }

    public boolean isEmpty(int line, int column) {
        return true;
    }

    public void setValue(int ligne, int colone, char valeur) {

        //char[] tableau = new char[81];
        grille[ligne][colone]=valeur;

    }

    public char getValue(int ligne, int colonne) {
        char value = grille[ligne][colonne] ;
        return value;
    }
}
