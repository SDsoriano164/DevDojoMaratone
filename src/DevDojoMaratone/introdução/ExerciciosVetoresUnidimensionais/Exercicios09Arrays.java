package DevDojoMaratone.introdução.ExerciciosVetoresUnidimensionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicios09Arrays {
    public static void main(String[] args) {
       double [] VetorA = new double[5];
       double [] VetorB = new double[VetorA.length];
       double [] VetorC = new double[VetorA.length];

       Scanner teclado = new Scanner(System.in);
        //Adicionando valores ao vetor A
        for (int i = 0; i <VetorA.length; i++) {
            System.out.println("Insira o valor do Vetor A: na pos :" + i);
            VetorA[i] = teclado.nextInt();
            VetorC[i] = VetorA[i] + VetorB[i];

        }
        // Adicionando valores ao vetor B
        for (int i = 0; i <VetorA.length; i++) {
            System.out.println("Insira o valor Vetor B : na pos :" + i);
            VetorB[i] = teclado.nextInt();


        }
        //  Armazenando valores da divisão entre vetor A e vetor B no vetor C
        for (int i = 0; i < VetorC.length; i++) {
            VetorC[i] = VetorA[i] / VetorB[i];


        }
        // mostrando valores do vetor A
        System.out.print("Vetor A = ");
        for (int i = 0; i < VetorA.length; i++) {
            System.out.print(VetorA[i] + " ");

        }
        // Mostrando valores do vetor B
        System.out.print("\nVetor B = ");
        for (int i = 0; i < VetorB.length; i++) {
            System.out.print(VetorB[i] + " ");
        }
        // Criando formatação para decimais
        DecimalFormat df = new DecimalFormat("##,##.##");


       //Mostrando os valores do vetor C
        System.out.print("\nVetor C = ");
        for (int i = 0; i < VetorC.length; i++) {
            System.out.print(df.format(VetorC[i]) + " ");

        }
    }
}