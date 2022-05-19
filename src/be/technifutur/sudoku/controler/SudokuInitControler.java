package be.technifutur.sudoku.controler;

import be.technifutur.sudoku.model.SudokuModel9x9;

public class SudokuInitControler {

    SudokuModel9x9 Model99;
    int value ;
    /*SudokuInitControler controler() {
        return null;
    }*/

    public void setSudoku(SudokuModel9x9 model) {
    }

    public SudokuModel9x9 getSudoku() {
        return null;
    }

    public void request(String s) {
        //String recu = s;// test dans le main connard
        String recu = "9.9.9";
        String[] recutravaille = recu.split(".",1);
        System.out.println(recutravaille);
    }

    public void AddValue(int ligne,int colone,int valeur){
        //model99.grille=9;

    }

    public int getValue(int ligne, int colone){
        value = getValue(8,8);

        return value;
    }


}
