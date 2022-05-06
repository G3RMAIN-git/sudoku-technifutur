package be.technifutur.sudoku.controler;

import be.technifutur.sudoku.model.SudokuModel4x4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SudokuInitControler4x4Test {

    private SudokuInitControler controler;
    private SudokuModel model;

    @BeforeEach
    void init() {
        controler = new SudokuInitControler();
        model = new SudokuModel4x4();
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
    @DisplayName("ajout valeur 4 en 4,4")
    void testAddValue4inl4c4() {
        controler.request("4.4.4");
        Assertions.assertEquals('4', model.getValue(3, 3));
    }
}
