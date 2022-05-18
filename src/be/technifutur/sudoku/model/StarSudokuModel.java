package be.technifutur.sudoku.model;

public class StarSudokuModel {

    char[][] grille = new char[21][21];

    public static final char EMPTY_VALUE = 0;
    public int getLineSize() {
        return 21;
    }

    public int getColumnSize() {
        return 21;
    }

    public boolean isEmpty(int line, int column) {
        if (grille[line][column]==EMPTY_VALUE){
            return true;
        }else{
            return false;
        }
    }

    public void setValue(int ligne, int colone, char valeur) {
        grille[ligne][colone]=valeur;
    }

    public char getValue(int ligne, int colonne) {
        char value = grille[ligne][colonne] ;
        return value;
    }
}
