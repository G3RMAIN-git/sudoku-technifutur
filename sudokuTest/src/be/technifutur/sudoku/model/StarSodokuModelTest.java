package be.technifutur.sudoku.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StarSodokuModelTest {

    @Test
    @DisplayName("Quand on le crée un sudoku est vide")
    void testNewSudokuEmpty() {
        StarSudokuModel sudoku = new StarSudokuModel();
        for(int line = 0; line < sudoku.getLineSize(); line++){
            for(int column = 0; column < sudoku.getColumnSize(); column++){
                Assertions.assertTrue(sudoku.isEmpty(line,column));
            }
        }
    }

    @Test
    @DisplayName("la taille d'une ligne de sudoku étoile est de 21")
    void testLigneSize() {
        StarSudokuModel sudoku = new StarSudokuModel();
        Assertions.assertEquals(21,sudoku.getLineSize());
    }

    @Test
    @DisplayName("la taille d'une colonne de sudoku étoile est de 21")
    void testColumnSize() {
        StarSudokuModel sudoku = new StarSudokuModel();
        Assertions.assertEquals(21,sudoku.getColumnSize());
    }
}
