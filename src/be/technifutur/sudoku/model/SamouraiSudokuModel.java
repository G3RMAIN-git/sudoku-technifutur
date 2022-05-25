package be.technifutur.sudoku.model;


import be.technifutur.sudoku.controler.SudokuModel;

public class SamouraiSudokuModel implements SudokuModel {

    char[][] grille = new char[21][21];

    public static final char EMPTY_VALUE = 0;
    public static final char ISNOTVALID_VALUE = 'E';

    /*constructeur (int posdebut, int posfin){

    }*/
    public int getLineSize() {
        return 21;
    }

    public int getColumnSize() {
        return 21;
    }

    /*public boolean isEmpty(int line, int column) { //le tableau est initie avec des 0 donc la condition test si le tablkeau a été attribué '.' ou un nombre
        if (grille[line][column]==EMPTY_VALUE){ //empty vaut 0 si grille[val] = 0
            //System.out.println(grille[line][column]);
            return true;
        }else{
            return false;
        }
    }*/
    public boolean isEmpty(int line, int column) {
        if (grille[line][column] == EMPTY_VALUE || grille[line][column] == ISNOTVALID_VALUE) {
            return true;
        } else {
            return false;
        }
    }

    public void setValue(int ligne, int colone, char valeur) {

        grille[ligne][colone] = valeur;
    }

    public char getValue(int ligne, int colonne) {
        char value = grille[ligne][colonne];
        return value;
    }

    public boolean IsValid(int ligne, int colonne) {


        return grille[ligne][colonne] != ISNOTVALID_VALUE;//isnot = E
    }


    public SamouraiSudokuModel() {
        for (int longueur = 0; longueur < 6; longueur++) {
            for (int larg = 0; larg < 3; larg++) {
                grille[0 + longueur][9 + larg] = ISNOTVALID_VALUE;
                grille[9 + larg][0 + longueur] = ISNOTVALID_VALUE;
                grille[15 + longueur][9 + larg] = ISNOTVALID_VALUE;
                grille[9 + larg][15 + longueur] = ISNOTVALID_VALUE;
            }


        }
    }


}

