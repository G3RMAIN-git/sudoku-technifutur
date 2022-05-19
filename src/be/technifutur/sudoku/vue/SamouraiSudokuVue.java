package be.technifutur.sudoku.vue;

import be.technifutur.sudoku.model.SamouraiSudokuModel;

public class SamouraiSudokuVue {
    public String getGrilleVide() {
        String Grillevide = """
                +-------+-------+-------+       +-------+-------+-------+
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                +-------+-------+-------+       +-------+-------+-------+
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                +-------+-------+-------+-------+-------+-------+-------+
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                +-------+-------+-------+-------+-------+-------+-------+
                                | . . . | . . . | . . . |
                                | . . . | . . . | . . . |
                                | . . . | . . . | . . . |
                +-------+-------+-------+-------+-------+-------+-------+
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                +-------+-------+-------+-------+-------+-------+-------+
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                +-------+-------+-------+       +-------+-------+-------+
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                +-------+-------+-------+       +-------+-------+-------+
                """;
        return Grillevide;

    }

    public String getGrille(SamouraiSudokuModel sudo) {
        /*String grille = getGrilleVide();
        String grilleS = grille.replace(".", "%s");

        Character[] tableau = new Character[21 * 21 - 4 * 3 * 6];
        int pos = 0;

        for (int ligne = 0; ligne < sudo.getLineSize(); ligne++) {
            for (int colone = 0; colone < sudo.getColumnSize(); colone++) {
                //condition a ajouter pour ne rien faire dans les collones vides
                if (sudo.IsValid(ligne, colone))
                {//si la cellule(ligne)(colonne) == vide -> ne rien faire
                    if (sudo.isEmpty(ligne, colone))
                    {
                        tableau[pos] = ' ';
                    } else
                    {

                        if(sudo.getValue(ligne, colone)!='.')
                        {
                            tableau[pos] = sudo.getValue(ligne, colone);
                        }else
                        {
                            tableau[pos] = '.';
                            //pos++;
                        }


                    }
                }

                    //tableau[pos] = sudo.getValue(ligne, colone);
                    pos++;



                }
            }


            return String.format(grilleS, (Object[]) tableau);
        }*/

        String format = getGrilleVide().replace(".", "%s");


        Character[] tableau = new Character[21*21-4*3*6];
        int pos = 0;
        for (int lig = 0; lig < 21; lig++) {
            for (int col = 0; col < 21; col++) {

                if (sudo.IsValid(lig, col)) {

                    if (sudo.isEmpty(lig, col)) {
                        tableau[pos] = '.';
                    } else {
                        tableau[pos] = sudo.getValue(lig, col);
                    }
                    pos++;
                }




            }


        }

        return String.format(format, (Object[]) tableau);
    }
    }
