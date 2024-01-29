package DevDojoMaratone.introdução.ExerciciosVetoresUnidimensionais;

import java.util.Scanner;

public class Exercicios25Arrays {
    public static void main(String[] args) {
        //b = 'A'  - A < 7
        //b = 'b' - A == 7
        //b = 'C' - A > 7
        //b = 'd' - A == 10
        //b = 'e' A > 10;




        int [] vetorA = new int[10];
        char[] vetorB = new char[vetorA.length];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe os valores no vetor A : " + i);
           vetorA[i] = teclado.nextInt();
        }
        for (int i = 0; i <vetorA.length ; i++) {
            if (vetorA[i] < 7){
                vetorB[i] = 'a';
            }else if (vetorA[i] == 7){
                vetorB[i] = 'b';
            }else if (vetorA[i] >7){
                vetorB[i] = 'c';
            }else if (vetorA[i] == 10){
                vetorB[i] = 'd';
            }else if (vetorA[i] >10){
                vetorB[i] = 'e';
            }


        }
        System.out.println("Vetor A : ");
        for (int i = 0; i < vetorA.length ; i++) {
            System.out.print(vetorA[i] + " ");

        }
        System.out.println("\nVetor B :");
        for (int i = 0; i <vetorB.length ; i++) {
            System.out.print(vetorB[i] + " ");

        }



    }
}
