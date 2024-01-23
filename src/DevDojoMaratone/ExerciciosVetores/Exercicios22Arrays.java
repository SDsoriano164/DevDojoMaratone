package DevDojoMaratone.ExerciciosVetores;

import java.util.Random;
import java.util.Scanner;

public class Exercicios22Arrays {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        // Preencher o vetorA
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor na pos " + i);
            vetorA[i] = teclado.nextInt();
        }

        // Verificar se é palíndromo
        boolean palindromo = true;
        for (int i = 0; i < vetorA.length / 2; i++) {
            if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        // Imprimir o vetorA
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }

        // Imprimir se é palíndromo ou não
        if (palindromo) {
            System.out.println("Palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }
}
