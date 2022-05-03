package be.technifutur.sudoku.vue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SudokuVue3X3Test {

    @Test
    @DisplayName("grille vide")
    void test() {
        SudokuVue3X3 vue = new SudokuVue3X3();
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
