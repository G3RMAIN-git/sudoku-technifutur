package be.technifutur.sudoku.controler;

import be.technifutur.sudoku.model.SamouraiSudokuModel;
import be.technifutur.sudoku.model.SudokuModel9x9;

public class SudokuInitControler {

    SudokuModel modelle;
    //Model99 = setValue(Model99,1,2,3);
    SamouraiSudokuModel SamuSudoku;

    int value;
    //char[][] grille = new char[9][9];
    /*SudokuInitControler controler() {
        return null;
    }*/


    public void setSudoku(SudokuModel model) {//a travailler
        modelle = model;
    }

    public void setValue(SudokuModel model, int ligne, int colonne, int valeur) {//a travailler
        setValue(modelle, 1, 2, 3);
    }

    public SudokuModel getSudoku() {


        //return Model99;
        //return ("be.technifutur.sudoku.model.SudokuModel9x9@57d5872c");
        return modelle;
    }// a travailler

    public void request(String s) {
        String recu = s;// test dans le main connard
        //String recu = "9.9.9";
        //String[] recutravaille = recu.split(".",1);
        String[] recutravaille = recu.split("\\.");
        //System.out.println(recutravaille);

        int ligne = Integer.parseInt(recutravaille[0]);
        int colonne = Integer.parseInt(recutravaille[1]);
        char c = recutravaille[2].charAt(0);

        modelle.setValue(ligne - 1, colonne - 1, c);
    }

    /*public AddValue(int ligne,int colone,int valeur){
        Model99 = AddValue(1,2,3);
        //return Model99;

    }*/


    //public int getValue(SamouraiSudokuModel mod,int ligne, int colone)
    public int getValue(int ligne, int colone) {
        //value = getValue(SamuSudoku,ligne, colone);
        value = getValue(ligne, colone);

        return value;
    }



}
