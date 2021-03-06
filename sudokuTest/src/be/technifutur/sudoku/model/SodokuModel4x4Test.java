package be.technifutur.sudoku.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SodokuModel4x4Test {

    @Test
    @DisplayName("Quand on le crée un sudoku est vide")
    void testNewSudokuEmpty() {
        SudokuModel4x4 sudoku = new SudokuModel4x4();
        for(int line = 0; line < sudoku.getLineSize(); line++){
            for(int column = 0; column < sudoku.getColumnSize(); column++){
                Assertions.assertTrue(sudoku.isEmpty(line,column));
            }
        }
    }

    @Test
    @DisplayName("la taille d'une ligne de sudoku 4x4 est de 4")
    void testLigneSize() {
        SudokuModel4x4 sudoku = new SudokuModel4x4();
        Assertions.assertEquals(4, sudoku.getLineSize());
    }

    @Test
    @DisplayName("la taille d'une colonne de sudoku 4x4 est de 4")
    void testColumnSize() {
        SudokuModel4x4 sudoku = new SudokuModel4x4();
        Assertions.assertEquals(4, sudoku.getColumnSize());
    }


    @Test
    @DisplayName("après modification la case 1,2 n'est plus vide")
    void testCell1_2IsNotEmpty() {
        SudokuModel4x4 sudoku = new SudokuModel4x4();
        sudoku.setValue(1, 2, '1');
        Assertions.assertFalse(sudoku.isEmpty(1, 2));
    }

    @Test
    @DisplayName("après modification de la case 3,2 par '3' sa valeur est '3'")
    void testCell3_2getValueIs_3() {
        SudokuModel4x4 sudoku = new SudokuModel4x4();
        sudoku.setValue(3, 2, '3');
        Assertions.assertEquals('3', sudoku.getValue(3, 2));
    }

    @Test
    @DisplayName("EMPTY_VALUE vaut le caractère de code 0")
    void testEmptyValueIs0() {
        Assertions.assertEquals(0, SudokuModel4x4.EMPTY_VALUE);
    }

    @Test
    @DisplayName("Une case vide contient la valeur EMPTY_VALUE")
    void testEmptyCell3_3Is0() {
        SudokuModel4x4 sudoku = new SudokuModel4x4();
        Assertions.assertEquals(SudokuModel4x4.EMPTY_VALUE, sudoku.getValue(3, 3));
    }

}
