package be.technifutur.sudoku.controler;

import be.technifutur.sudoku.model.SudokuModel9x9;
import be.technifutur.sudoku.model.SamouraiSudokuModel;
import be.technifutur.sudoku.model.SudokuModel4x4;


public interface SudokuModel {



    //SudokuModel MOD ;

    public char getValue(int ligne,int colonne);//{
    public void setValue(int ligne,int colonne, char value);

    //char getValue(int line, int column);


    //return Mod99;
 //   }
}
