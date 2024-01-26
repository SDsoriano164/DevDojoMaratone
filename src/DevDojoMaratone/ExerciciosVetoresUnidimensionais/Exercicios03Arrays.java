package DevDojoMaratone.ExerciciosVetoresUnidimensionais;

import java.util.Scanner;

public class Exercicios03Arrays {
    public static void main(String[] args) {
        //vetor de 15 elementos na qual o vetor b seja o quadrado dos elementos de A
        int [] vetorA = new int[5];
        int [] vetorB = new int[vetorA.length];


        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i <vetorA.length ; i++) {
            System.out.println("Digite o vetor na posição : " + i);
            vetorA[i] = teclado.nextInt();
            vetorB[i] = vetorA[i]*vetorA[i];

        }
        System.out.println("Vetor A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");

        }
        System.out.println(("\nVetor B"));
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");

        }

        }

    }

