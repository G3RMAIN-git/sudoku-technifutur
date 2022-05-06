package be.technifutur.sudoku.vue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SudokuVue4x4Test {

    @Test
    @DisplayName("grille vide")
    void testEmptyGrid() {
        SudokuVue4x4 vue = new SudokuVue4x4();
        String grille =
                """
                        +------+-----+
                        | . .  | . . |
                        | . .  | . . |
                        +------+-----+
                        | . .  | . . |
                        | . .  | . . |
                        +------+-----+
                        """;
        Assertions.assertEquals(grille, vue.getGrilleVide());
    }
}
