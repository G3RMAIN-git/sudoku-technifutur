package be.technifutur.sudoku.vue;

import be.technifutur.sudoku.model.SudokuModel4x4;

public class SudokuVue4x4 {
    public String getGrilleVide() {
        return """
                +------+-----+
                | . .  | . . |
                | . .  | . . |
                +------+-----+
                | . .  | . . |
                | . .  | . . |
                +------+-----+
                """;
    }

  /*  public String getGrilleFormat() {
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
    }*/

    public String getGrille(SudokuModel4x4 sudo) {
        //char[] tableau = new char[81];
        Character[] tableau = new Character[16];
        String format = getGrilleVide().replace(".","%s");
        int pos = 0;

        for (int ligne = 0; ligne < sudo.getLineSize(); ligne++) {
            for (int colone = 0; colone < sudo.getColumnSize(); colone++) {
                if ((sudo.isEmpty(ligne, colone)) == true) {
                    tableau[pos] = '.';
                    pos++;
                } else {
                    tableau[pos] = sudo.getValue(ligne, colone);
                    pos++;
                }

            }
        }
        String solution = String.format(format, (Object[]) tableau);


        //return String.format(getGrilleFormat(), tableau);
        //return tableau;
        return solution;
    }}
