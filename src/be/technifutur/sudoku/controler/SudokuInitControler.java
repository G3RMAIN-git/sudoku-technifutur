package be.technifutur.sudoku.controler;

import be.technifutur.sudoku.model.SudokuModel9x9;

public class SudokuInitControler {

    SudokuModel9x9 Model99 ;
    //Model99 = setValue(Model99,1,2,3);

    int value;
    //char[][] grille = new char[9][9];
    /*SudokuInitControler controler() {
        return null;
    }*/



    public void setSudoku(SudokuModel9x9 model) {//a travailler
        Model99 = model;
    }
    public void setValue(SudokuModel9x9 model,int ligne, int colonne, int valeur) {//a travailler
        setValue(Model99,1,2,3);
    }

    public SudokuModel9x9 getSudoku() {



        //return Model99;
        //return ("be.technifutur.sudoku.model.SudokuModel9x9@57d5872c");
        return Model99;
    }// a travailler

    public void request(String s) {
        String recu = s;// test dans le main connard
        //String recu = "9.9.9";
        //String[] recutravaille = recu.split(".",1);
        String[] recutravaille = recu.split("\\.");
        //System.out.println(recutravaille);

        int ligne = Integer.parseInt(recutravaille[0]);
        int colonne = Integer.parseInt(recutravaille[1]);
        char  c = recutravaille[2].charAt(0);

        Model99.setValue(ligne-1,colonne-1,c);
    }

    /*public AddValue(int ligne,int colone,int valeur){
        Model99 = AddValue(1,2,3);
        //return Model99;

    }*/



    public int getValue(int ligne, int colone) {
        value = getValue(8, 8);

        return value;
    }


}
