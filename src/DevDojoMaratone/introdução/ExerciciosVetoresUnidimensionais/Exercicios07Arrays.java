package DevDojoMaratone.introdução.ExerciciosVetoresUnidimensionais;

import java.util.Scanner;

public class Exercicios07Arrays {
    public static void main(String[] args) {
       int [] VetorA = new int[5];
       int [] VetorB = new int[VetorA.length];
       int [] VetorC = new int[VetorA.length];

       Scanner teclado = new Scanner(System.in);

        for (int i = 0; i <VetorA.length; i++) {
            System.out.println("Insira o valor do Vetor A: na pos :" + i);
            VetorA[i] = teclado.nextInt();
            VetorC[i] = VetorA[i] + VetorB[i];

        }
        for (int i = 0; i <VetorA.length; i++) {
            System.out.println("Insira o valor Vetor B : na pos :" + i);
            VetorB[i] = teclado.nextInt();


        }
        for (int i = 0; i < VetorC.length; i++) {
            VetorC[i] = VetorA[i] - VetorB[i];


        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < VetorA.length; i++) {
            System.out.print(VetorA[i] + " ");

        }
        System.out.print("\nVetor B = ");
        for (int i = 0; i < VetorB.length; i++) {
            System.out.print(VetorB[i] + " ");
        }
        System.out.print("\nVetor C = ");
        for (int i = 0; i < VetorC.length; i++) {
            System.out.print(VetorC[i] + " ");

        }
    }
}