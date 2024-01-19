package DevDojoMaratone.ExerciciosVetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicios09Arrays {
    public static void main(String[] args) {
       double [] VetorA = new double[5];
       double [] VetorB = new double[VetorA.length];
       double [] VetorC = new double[VetorA.length];

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
            VetorC[i] = VetorA[i] / VetorB[i];


        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < VetorA.length; i++) {
            System.out.print(VetorA[i] + " ");

        }
        System.out.print("\nVetor B = ");
        for (int i = 0; i < VetorB.length; i++) {
            System.out.print(VetorB[i] + " ");
        }
        DecimalFormat df = new DecimalFormat("##,##.##");
        System.out.print("\nVetor C = ");

        for (int i = 0; i < VetorC.length; i++) {
            System.out.print(df.format(VetorC[i]) + " ");

        }
    }
}