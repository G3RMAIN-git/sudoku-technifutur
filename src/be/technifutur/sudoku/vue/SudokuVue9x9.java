package be.technifutur.sudoku.vue;

import be.technifutur.sudoku.model.SudokuModel9x9;

public class SudokuVue9x9 {


    public String getGrilleVide() {

        return """
                +-------+-------+-------+
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                +-------+-------+-------+
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                +-------+-------+-------+
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                +-------+-------+-------+
                """;


    }

    public String getGrilleFormat() {
        String GrilleFormat = """
                +-------+-------+-------+
                | %s %s %s | %s %s %s | %s %s %s |
                | %s %s %s | %s %s %s | %s %s %s |
                | %s %s %s | %s %s %s | %s %s %s |
                +-------+-------+-------+
                | %s %s %s | %s %s %s | %s %s %s |
                | %s %s %s | %s %s %s | %s %s %s |
                | %s %s %s | %s %s %s | %s %s %s |
                +-------+-------+-------+
                | %s %s %s | %s %s %s | %s %s %s |
                | %s %s %s | %s %s %s | %s %s %s |
                | %s %s %s | %s %s %s | %s %s %s |
                +-------+-------+-------+
                                """;
        return GrilleFormat;
    }


    public String getGrille(SudokuModel9x9 sudo) {

        //char[] tableau = new char[81];
        Character[] tableau = new Character[81];
        int pos = 0;

        for (int ligne = 0; ligne < sudo.getLineSize(); ligne++) {
            for (int colone = 0; colone < sudo.getColumnSize(); colone++){
                if((sudo.isEmpty(ligne,colone)) == true){
                    tableau[pos] = '.';
                    pos++;
                }else {
                    tableau[pos] = sudo.getValue(ligne, colone);
                    pos++;
                }

            }
        }


        //System.out.println(sudo.getValue(1, 2));

        //tableau = char(sudo);

        //String solution = String.format(,  sudo);

        String solution = String.format(getGrilleFormat(),(Object[])  tableau);



        //return String.format(getGrilleFormat(), tableau);
        //return tableau;
        return solution;
    }
}
