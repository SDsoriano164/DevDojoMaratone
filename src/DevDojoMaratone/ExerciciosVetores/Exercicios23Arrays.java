package DevDojoMaratone.ExerciciosVetores;

import java.util.Scanner;

public class Exercicios23Arrays {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Insira um valor na pos " + i);
            vetorA[i] = teclado.nextInt();
            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
        }

        System.out.println("Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
