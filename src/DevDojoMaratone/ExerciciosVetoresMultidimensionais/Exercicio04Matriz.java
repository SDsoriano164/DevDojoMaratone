package DevDojoMaratone.ExerciciosVetoresMultidimensionais;

import java.util.Random;

public class Exercicio04Matriz {
    public static void main(String[] args) {
        int[][] array10x10 = new int[10][10];
        Random aleatorios = new Random();
        int menorValorPos5 = Integer.MAX_VALUE;
        int menorValorPos7 = Integer.MAX_VALUE;
        int maiorValorPos5 = 0;
        int maiorValorPos7 = 0;

        // Adicionado valores aleatórios no array
        for (int i = 0; i < array10x10.length; i++) {
            for (int j = 0; j < array10x10[i].length; j++) {
                array10x10[i][j] = aleatorios.nextInt(99);
            }
        }

        for (int i = 0; i < array10x10.length; i++) {
            System.out.println("Linha -> " + i);
            for (int j = 0; j < array10x10[i].length; j++) {
                System.out.print(array10x10[i][j] + " ");
                if (i == 5) {
                    if (array10x10[i][j] < menorValorPos5) {
                        menorValorPos5 = array10x10[i][j];
                    }
                    if (array10x10[i][j] > maiorValorPos5) {
                        maiorValorPos5 = array10x10[i][j];
                    }
                }
                if (i == 7) {
                    if (array10x10[i][j] < menorValorPos7) {
                        menorValorPos7 = array10x10[i][j];
                    }
                    if (array10x10[i][j] > maiorValorPos7) {
                        maiorValorPos7 = array10x10[i][j];
                    }
                }
            }
            System.out.println();
        }
        System.out.println("MAIOR valor na pos 5: " + maiorValorPos5);
        System.out.println("MENOR valor na pos 5: " + menorValorPos5);
        System.out.println("MAIOR valor na pos 7: " + maiorValorPos7);
        System.out.println("MENOR valor na pos 7: " + menorValorPos7);
    }
}
