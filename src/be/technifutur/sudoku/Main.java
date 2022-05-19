package be.technifutur.sudoku;

import be.technifutur.sudoku.vue.SudokuVue9x9;
import  be.technifutur.sudoku.controler.SudokuInitControler;

public class Main {

    public static void main(String[] args) {

        /*System.out.println(new SudokuVue4x4().getGrilleVide());
        System.out.println("------------------------------");
        String grille = """
                        +------+-----+
                        | . .  | . . |
                        | . .  | . . |
                        +------+-----+
                        | . .  | . . |
                        | . .  | . . |
                        +------+-----+
                        """;
        System.out.println(grille.replace(".","%s"));*/

        String recu = "9.9.9";
        String[] recutravaille = recu.split("\\.");// ca marche connard
        String part1 = recutravaille[0];
        System.out.println(part1);

    }

}
