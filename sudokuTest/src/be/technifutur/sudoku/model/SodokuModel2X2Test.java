package be.technifutur.sudoku.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SodokuModel2X2Test {

    @Test
    @DisplayName("Quand on le crée un sudoku est vide")
    void testNewSudokuEmpty() {
        SudokuModel2X2 sudoku = new SudokuModel2X2();
        for(int line = 0; line < sudoku.getLineSize(); line++){
            for(int column = 0; column < sudoku.getColumnSize(); column++){
                Assertions.assertTrue(sudoku.isEmpty(line,column));
            }
        }
    }

    @Test
    @DisplayName("la taille d'une ligne de sudoku 4x4 est de 4")
    void testLigneSize() {
        SudokuModel2X2 sudoku = new SudokuModel2X2();
        Assertions.assertEquals(4,sudoku.getLineSize());
    }

    @Test
    @DisplayName("la taille d'une colonne de sudoku 4x4 est de 4")
    void testColumnSize() {
        SudokuModel2X2 sudoku = new SudokuModel2X2();
        Assertions.assertEquals(4,sudoku.getColumnSize());
    }
}
