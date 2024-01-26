package DevDojoMaratone.ExerciciosVetoresUnidimensionais;

import java.util.Scanner;

public class Exercicios01Arrays {
    public static void main(String[] args) {
        int  [] vetorA = new int[5];
        int  [] vetorB = new int[vetorA.length];
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i <vetorA.length ; i++) {
            System.out.println("Indique o valor na pos :" + i);
            vetorA[i] = teclado.nextInt();
            vetorB[i] = vetorA[i];
        }

        System.out.println("Vetores de A :");
        for (int i = 0; i < vetorA.length ; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVetores de B :");
        for (int i = 0; i < vetorB.length ; i++) {
            System.out.print(vetorB[i] + " ");

        }
    }
}

    

