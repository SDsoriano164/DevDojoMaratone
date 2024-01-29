package DevDojoMaratone.introdução.ExerciciosVetoresUnidimensionais;

import java.util.Scanner;

public class Exercicios28Arrays {
    public static void main(String[] args) {
        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        Scanner teclado = new Scanner(System.in);

        // Preenchendo vetorA com valores fornecidos pelo usuário
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetor A na pos " + i);
            vetorA[i] = teclado.nextInt();
        }

        int posB = 0;
        int posC = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[posB] = vetorA[i];
                posB++;
            } else {
                vetorC[posC] = vetorA[i];
                posC++;
            }
        }

        // Exibindo os vetores A, B e C
        System.out.println("Mostrando o vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nMostrando o vetor B (pares):");
        for (int i = 0; i < posB; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\nMostrando o vetor C (ímpares): ");
        for (int i = 0; i < posC; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
