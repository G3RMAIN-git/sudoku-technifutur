package be.technifutur.sudoku.controler;

import be.technifutur.sudoku.model.SudokuModel9x9;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SudokuInitControler9x9Test {

    private SudokuInitControler controler;
    private SudokuModel9x9 model;

    @BeforeEach
    void init() {
        controler = new SudokuInitControler();
        model = new SudokuModel9x9();
        controler.setSudoku(model);
    }

    @Test
    @DisplayName("ajout d'un model au controler")
    void testAddVueModel() {
        Assertions.assertSame(model, controler.getSudoku());
    }

    @Test
    @DisplayName("ajout valeur 3 en 1,2")
    void testAddValue1inl1c2() {
        controler.request("1.2.3");
        Assertions.assertEquals('3', model.getValue(0, 1));
    }

    @Test
    @DisplayName("ajout valeur 9 en 9,9")
    void testAddValue9inl9c9() {
        controler.request("9.9.9");
        Assertions.assertEquals('9', model.getValue(8, 8));
    }
}
