package be.technifutur.sudoku.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SodokuModel3X3Test {

    @Test
    @DisplayName("Quand on le crée un sudoku est vide")
    void testNewSudokuEmpty() {
        SudokuModel3X3 sudoku = new SudokuModel3X3();
        for(int line = 0; line < sudoku.getLineSize(); line++){
            for(int column = 0; column < sudoku.getColumnSize(); column++){
                Assertions.assertTrue(sudoku.isEmpty(line,column));
            }
        }
    }

    @Test
    @DisplayName("la taille d'une ligne de sudoku 9x9 est de 9")
    void testLigneSize() {
        SudokuModel3X3 sudoku = new SudokuModel3X3();
        Assertions.assertEquals(9,sudoku.getLineSize());
    }

    @Test
    @DisplayName("la taille d'une colonne de sudoku 9x9 est de 9")
    void testColumnSize() {
        SudokuModel3X3 sudoku = new SudokuModel3X3();
        Assertions.assertEquals(9,sudoku.getColumnSize());
    }
}
