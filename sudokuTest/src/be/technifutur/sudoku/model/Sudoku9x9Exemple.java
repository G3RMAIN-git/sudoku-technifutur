package be.technifutur.sudoku.model;

import java.util.Scanner;

public enum Sudoku9x9Exemple {
    FACILE_1("""
            .8..2.4..
            4.5..8...
            ..71548..
            .5.94.3..
            .28...14.
            ..6.12.7.
            ..23657..
            ...2..6.1
            ..3.7..2.
            """);
    private final String values;

    Sudoku9x9Exemple(String values) {
        this.values = values;
    }

    public void init(SudokuModel9x9 sudo) {
        Scanner scan = new Scanner(values);
        for (int lig = 0; lig < 9; lig++) {
            char[] line = scan.nextLine().toCharArray();
            for (int col = 0; col < 9; col++) {
                if (line[col] != '.') {
                    sudo.setValue(lig, col, line[col]);
                }
            }
        }
    }
}
