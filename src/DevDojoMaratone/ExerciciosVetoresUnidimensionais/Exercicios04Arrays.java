package DevDojoMaratone.ExerciciosVetoresUnidimensionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicios04Arrays {
    public static void main(String[] args) {
        int [] vetorA = new int[5];
       double [] vetorB = new double[vetorA.length];

        // Lendo numeros
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i <vetorA.length ; i++) {
            System.out.println("Digite o vetor na posição : " + i );
            vetorA[i] = teclado.nextInt(); // inserindo valores na posição
            vetorB[i] = Math.sqrt(vetorA[i]);

        }
        System.out.println("Vetor A :");
        for (int i = 0; i < vetorA.length ; i++) {
            System.out.print(vetorA[i] + " ");
        }
        DecimalFormat df = new DecimalFormat("###,###.###");
        System.out.println("\nVetor B : ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(df.format(vetorB[i]) + " ");
        }


        }

        }



