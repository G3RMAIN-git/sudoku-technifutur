package be.technifutur.sudoku.vue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SudokuVue9x9Test {

    @Test
    @DisplayName("grille vide")
    void testEmptyGrid() {
        SudokuVue9x9 vue = new SudokuVue9x9();
        String grille =
                """
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
}
