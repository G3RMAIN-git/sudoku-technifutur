package be.technifutur.sudoku.model;

import java.util.Scanner;

public enum Sudoku4x4Exemple {
    FACILE_1("""
            4..2
            ..1.
            .4..
            3..1
            """);
    private final String values;

    Sudoku4x4Exemple(String values) {
        this.values = values;
    }

    public void init(SudokuModel4x4 sudo) {
        Scanner scan = new Scanner(values);
        for (int lig = 0; lig < 4; lig++) {
            char[] line = scan.nextLine().toCharArray();
            for (int col = 0; col < 4; col++) {
                if (line[col] != '.') {
                    sudo.setValue(lig, col, line[col]);
                }
            }
        }
    }
}
