package DevDojoMaratone.ExerciciosVetores;

import java.util.Scanner;

public class Exercicios14Arrays {
    public static void main(String[] args) {
        int [] array = new int[10];
        int pares = 0;
        int impares= 0;


        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira os valores do vetor ");

        for (int i = 0; i < array.length ; i++) {
            array[i] = teclado.nextInt();

        }
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2== 1) {
                impares++;

            }
           pares = array.length - impares;

        }
        pares = array.length - impares;
        int porcentPares   = (pares*100)/array.length;
        int porcentImpares = 100 - porcentPares;
        System.out.println("Porcentagem de impares : " + porcentImpares);
        System.out.println("Porcentagem de pares :"+porcentPares +"%");
    }

}









