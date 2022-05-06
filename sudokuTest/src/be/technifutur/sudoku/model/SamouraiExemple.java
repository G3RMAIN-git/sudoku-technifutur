package be.technifutur.sudoku.model;

import java.util.Scanner;

public enum SamouraiExemple {
    FACILE_1("""
            5.31....7///....6.2..
            2.1.7..4.///.34..58..
            74..5.2.9///...3.7..6
            ...3....6///3.8.7....
            ..9..8...///...6.....
            .5....4..///71.5.84..
            ......36.9.....7.9.4.
            ..5.2...1....7..5.3.9
            .....1.............2.
            //////132......//////      
            //////.......8.//////
            //////.....4...//////
            ..1.....37.6....6.2.4
            3....16....1...1..8..
            ..8..25...2...8......
            73.......///.85......
            1....942.///..34.....
            ...4.5.8.///...6..5..
            .......3.///..4....9.
            ...2.8...///2...3..75
            ...5....1///.3..1.6..
            """);
    private final String values;

    SamouraiExemple(String values) {
        this.values = values;
    }

    public void init(SamouraiSudokuModel sudo) {
        Scanner scan = new Scanner(values);
        for (int lig = 0; lig < 21; lig++) {
            char[] line = scan.nextLine().toCharArray();
            for (int col = 0; col < 21; col++) {
                if (line[col] != '.' && line[col] != '/') {
                    sudo.setValue(lig, col, line[col]);
                }
            }
        }
    }
}
