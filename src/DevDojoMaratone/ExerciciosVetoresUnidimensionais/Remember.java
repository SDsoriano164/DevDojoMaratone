package DevDojoMaratone.ExerciciosVetoresUnidimensionais;

import java.util.Scanner;

public class Remember {
    public static void main(String[] args) {
        int[][] vetorA = new int[2][]; // Changed the size to [2][3] to match the initialization below

        vetorA[0] = new int[]{1, 2, 3};
        vetorA[1] = new int[]{4, 5, 6,4};

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorA[i].length; j++) {
                System.out.print(vetorA[i][j]+ " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
