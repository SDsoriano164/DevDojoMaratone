package DevDojoMaratone.ExerciciosVetores;

import java.util.Scanner;

public class Exercicios05Arrays {
    public static void main(String[] args) {
       int [] VetorA = new int[5];
       int [] VetorB = new int[VetorA.length];

       Scanner teclado = new Scanner(System.in);

        for (int i = 0; i <VetorA.length; i++) {
            System.out.println("Insira o valor na pos :" + i);
            VetorA[i] = teclado.nextInt();
            VetorB[i] = VetorA[i] * i;

        }
        System.out.println("Vetor A ");
        for (int i = 0; i <VetorA.length ; i++) {
            System.out.print(VetorA[i] + " ");
        }
        System.out.println("Vetor B");
        for (int i = 0; i <VetorB.length ; i++) {
            System.out.println("VetorA[" + i + "] = " + VetorA[i] + " * " + i + " = " + VetorB[i]);

        }

        }

    }

