package DevDojoMaratone.ExerciciosVetores;

import java.util.Scanner;

public class Exercicios24Arrays {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Insira valor para o vetor A posição " + i);
            vetorA[i] = teclado.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Insira valor para o vetor B posição " + i);
            vetorB[i] = teclado.nextInt();
            if (vetorA[i] == vetorB[i] && vetorA[i] == 0) {
                vetorC[i] = 0;
            } else {
                vetorC[i] = (vetorA[i] > vetorB[i]) ? 1 : -1;
            }
        }

        System.out.println("Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\nVetor C:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
