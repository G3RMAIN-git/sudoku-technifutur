package be.technifutur.sudoku.controler;

import be.technifutur.sudoku.model.SudokuModel9x9;
import be.technifutur.sudoku.model.SamouraiSudokuModel;


public interface SudokuModel {

    SudokuModel9x9 Mod99 = null;

    public char getSudoku(int ligne,int colonne);//{
    public void setSudoku(int ligne,int colonne, char value);


        //return Mod99;
 //   }
}
