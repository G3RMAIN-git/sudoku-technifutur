package be.technifutur.sudoku.model;

import be.technifutur.sudoku.controler.SudokuModel;

public class SudokuModel9x9 implements SudokuModel {

    char[][] grille = new char[9][9];

    public static final char EMPTY_VALUE = 0;

    public int getLineSize() {
        return 9;
    }

    public int getColumnSize() {
        return 9;
    }

    public boolean isEmpty(int line, int column) {

        if (grille[line][column]==EMPTY_VALUE){
            return true;
        }else{
            return false;
        }


    }

    public void setValue(int ligne, int colone, char valeur) {
        /*for(int ligne=0;ligne<grille.length;ligne++){
            for(int collone=0;collone<grille[ligne].length;collone++){

                    grille[ligne][collone]=2;

            }
        }*/

        grille[ligne][colone]=valeur;
    }

    public char getValue(int ligne, int colonne) {
        char value = grille[ligne][colonne] ;
        return value;
    }

    @Override
    public char getSudoku(int ligne, int colonne) {
        return 0;
    }

    @Override
    public void setSudoku(int ligne, int colonne, char value) {

    }
}
