package DevDojoMaratone.ExerciciosVetoresUnidimensionais;

import java.util.Scanner;

public class Exercicios27Arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Preenchendo o vetorA com valores fornecidos pelo usuário
        int[] vetorA = new int[10];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetor A na posição " + i);
            vetorA[i] = teclado.nextInt();
        }

        // Preenchendo o vetorB com valores fornecidos pelo usuário
        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite o valor do vetor B na posição " + i);
            vetorB[i] = teclado.nextInt();
        }

        // Criando o vetorC com o dobro do tamanho de vetorA
        int[] vetorC = new int[vetorA.length * 2];

        // Copiando os elementos de vetorA para a primeira metade de vetorC
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }

        // Copiando os elementos de vetorB para a segunda metade de vetorC
        for (int i = 0; i < vetorB.length; i++) {
            // A posição de início é o comprimento de vetorC dividido por 2
            // Adiciona i para ajustar a posição no vetorC
            vetorC[i + vetorC.length / 2] = vetorB[i];
        }

        // Exibindo os vetores A, B e C
        System.out.println("Mostrando o vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nMostrando o vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\nMostrando o vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
