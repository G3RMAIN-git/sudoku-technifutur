package be.technifutur.sudoku.controler;

import be.technifutur.sudoku.model.SamouraiExemple;
import be.technifutur.sudoku.model.SamouraiSudokuModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class SamouraiSudokuInitControlerTest {

    private SudokuInitControler controler;
    private SudokuModel model;

    @BeforeEach
    void ini() {
        controler = new SudokuInitControler();
        model = new SamouraiSudokuModel();
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
        testsetValueValid('3', 0, 1);
    }

    private void testsetValueValid(char value, int line, int column) {
        String request = String.format("%s.%s.%s", line + 1, column + 1, value);
        controler.request(request);
        char value1 = model.getValue(line, column);
        Assertions.assertEquals(value, value1, () -> "request = " + request + " , value in sudoku = " + value1);
    }

    @Test
    @DisplayName("ajout valeur 9 en 21,21")
    void testAddValue9inl21c21() {
        testsetValueValid('9', 20, 20);
    }

    @DisplayName("initialisation avec exemple FACILE_1")
    @Test
    void testFacile1init() {
        SamouraiExemple.FACILE_1.requestStream().forEach(s -> controler.request(s));
        Assertions.assertAll(
                IntStream
                        .range(0, 21 * 21)
                        .filter(SamouraiExemple.FACILE_1::hasValue)
                        .mapToObj(i -> () -> Assertions.assertEquals(SamouraiExemple.FACILE_1.get(i), model.getValue(i / 21, i % 21)))
        );
    }

}
