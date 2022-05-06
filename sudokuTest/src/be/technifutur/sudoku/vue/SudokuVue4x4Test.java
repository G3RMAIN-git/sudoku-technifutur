package be.technifutur.sudoku.vue;

import be.technifutur.sudoku.model.Sudoku4x4Exemple;
import be.technifutur.sudoku.model.SudokuModel4x4;
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

    @Test
    @DisplayName("vue grille FACILE_1")
    void testVueFacile1() {
        SudokuModel4x4 sudo = new SudokuModel4x4();
        Sudoku4x4Exemple.FACILE_1.init(sudo);
        String grille = """
                +------+-----+
                | 4 .  | . 2 |
                | . .  | 1 . |
                +------+-----+
                | . 4  | . . |
                | 3 .  | . 1 |
                +------+-----+
                """;
        SudokuVue4x4 vue = new SudokuVue4x4();
        Assertions.assertEquals(grille, vue.getGrille(sudo));
    }

}
