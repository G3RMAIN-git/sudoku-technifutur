package be.technifutur.sudoku.vue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SudokuVue2X2Test {

    @Test
    @DisplayName("grille vide")
    void testEmptyGrid() {
        SudokuVue2X2 vue = new SudokuVue2X2();
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
