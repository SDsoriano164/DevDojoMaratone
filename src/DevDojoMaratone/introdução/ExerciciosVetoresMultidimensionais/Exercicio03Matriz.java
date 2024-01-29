package DevDojoMaratone.introdução.ExerciciosVetoresMultidimensionais;

import java.util.Random;

public class Exercicio03Matriz {
    public static void main(String[] args) {
        int[][] array4D = new int[4][4];
        int posMaiorI = 0; // Linha do maior valor
        int posMaiorJ = 0; // Coluna do maior valor
        int maior = 0;
        int posMenorI = 0;
        int posMenorJ = 0;
        int menor = Integer.MAX_VALUE; // Inicializado com o maior valor possível para int

        Random aleatorios = new Random();
        for (int i = 0; i < array4D.length; i++) {
            for (int j = 0; j < array4D[i].length; j++) {
                array4D[i][j] = aleatorios.nextInt(100); // Alterei para gerar números de 0 a 99
            }
        }

        System.out.println("Array 4x4 de números aleatórios:");
        for (int i = 0; i < array4D.length; i++) {
            System.out.println("\nLinha -> " + i);
            for (int j = 0; j < array4D[i].length; j++) {
                System.out.print(array4D[i][j] + " ");
                if (array4D[i][j] > maior) {
                    posMaiorI = i;
                    posMaiorJ = j;
                    maior = array4D[i][j];
                }
                if (array4D[i][j] < menor) {
                    posMenorI = i;
                    posMenorJ = j;
                    menor = array4D[i][j];
                }
            }
            System.out.println(); // Adiciona uma quebra de linha após cada linha da matriz
        }
        System.out.println("Maior valor na posição (" + posMaiorI + ", " + posMaiorJ + ")");
        System.out.println("Menor valor na posição (" + posMenorI + ", " + posMenorJ + ")");
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
