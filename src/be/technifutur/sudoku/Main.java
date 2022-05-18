package be.technifutur.sudoku;

import be.technifutur.sudoku.vue.SudokuVue9x9;

public class Main {

    public static void main(String[] args) {

        System.out.println(new SudokuVue9x9().getGrilleVide());
        System.out.println("------------------------------");
        String grille = """
                +-------+-------+-------+
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                +-------+-------+-------+
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                +-------+-------+-------+
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                +-------+-------+-------+
                """;
        System.out.println(grille.replace(".","%s"));

    }

}
