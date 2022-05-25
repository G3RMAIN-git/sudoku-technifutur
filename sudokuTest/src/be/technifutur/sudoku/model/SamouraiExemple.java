package be.technifutur.sudoku.model;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
    private final char[][] values;

    SamouraiExemple(String values) {
        Scanner scan = new Scanner(values);
        this.values = new char[21][];
        for (int lig = 0; lig < 21; lig++) {
            this.values[lig] = scan.nextLine().toCharArray();
        }
    }

    /**
     * Retourne un stream de toutes les requêtes utiles pour initialiser le sudoku avec le controleur.
     * les requêtes ont le format {ligne}.{colonne}.{valeur}
     *
     * @return le stream des requêtes.
     */
    public Stream<String> requestStream() {
        return IntStream
                .range(0, 21 * 21)
                .filter(this::hasValue)
                .mapToObj(
                        i -> (i / 21 + 1) + "." + (i % 21 + 1) + "." + get(i)
                );
    }

    public boolean hasValue(int i) {
        char c = get(i);
        return c != '.' && c != '/';
    }

    public char get(int pos) {
        return values[pos / 21][pos % 21];
    }

    public void init(SamouraiSudokuModel sudo) {
        for (int lig = 0; lig < 21; lig++) {
            for (int col = 0; col < 21; col++) {
                if (hasValue(lig * 21 + col)) {
                    sudo.setValue(lig, col, values[lig][col]);
                }
            }
        }
    }
}
