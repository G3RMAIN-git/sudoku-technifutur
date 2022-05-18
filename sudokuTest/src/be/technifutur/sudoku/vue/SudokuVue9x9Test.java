package be.technifutur.sudoku.vue;

import be.technifutur.sudoku.model.Sudoku9x9Exemple;
import be.technifutur.sudoku.model.SudokuModel9x9;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SudokuVue9x9Test {

    @Test
    @DisplayName("grille vide")
    void testEmptyGrid() {
        SudokuVue9x9 vue = new SudokuVue9x9();
        String grille = """
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
        Assertions.assertEquals(grille, vue.getGrilleVide());
    }

    @Test
    @DisplayName("vue grille FACILE_1")
    void testVueFacile1() {
        SudokuModel9x9 sudo = new SudokuModel9x9();
        Sudoku9x9Exemple.FACILE_1.init(sudo);
        String grille = """
                +-------+-------+-------+
                | . 8 . | . 2 . | 4 . . |
                | 4 . 5 | . . 8 | . . . |
                | . . 7 | 1 5 4 | 8 . . |
                +-------+-------+-------+
                | . 5 . | 9 4 . | 3 . . |
                | . 2 8 | . . . | 1 4 . |
                | . . 6 | . 1 2 | . 7 . |
                +-------+-------+-------+
                | . . 2 | 3 6 5 | 7 . . |
                | . . . | 2 . . | 6 . 1 |
                | . . 3 | . 7 . | . 2 . |
                +-------+-------+-------+
                """;
        SudokuVue9x9 vue = new SudokuVue9x9();
        Assertions.assertEquals(grille, vue.getGrille(sudo));
    }
}
