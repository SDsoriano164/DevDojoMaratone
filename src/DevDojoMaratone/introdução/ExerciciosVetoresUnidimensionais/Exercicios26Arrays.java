package DevDojoMaratone.introdução.ExerciciosVetoresUnidimensionais;

import java.util.Scanner;

public class Exercicios26Arrays {
    public static void main(String[] args) {
        // Criando os vetores A e B
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        // Solicitando valores para o vetorA do usuário
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor na posição " + i);
            vetorA[i] = teclado.nextInt();

            // Invertendo os elementos de vetorA para vetorB
            // A posição em vetorB é calculada usando o índice inverso
            // vetorB[comprimento - i - 1] pega o último elemento de vetorB na primeira iteração
            // e assim por diante
            vetorB[vetorA.length - i - 1] = vetorA[i];
        }

        // Exibindo o vetorA
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        // Exibindo o vetorB (invertido)
        System.out.println("\nVetor B (inverso):");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
