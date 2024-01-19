package DevDojoMaratone.ExerciciosVetores;

import java.util.Scanner;

public class Exercicios11Arrays {
    public static void main(String[] args) {
        int [] valores = new int[4];
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i <valores.length; i++) {
            System.out.println("Digite os valores : ");
            valores[i] = teclado.nextInt();

        }
        System.out.print("Vetor A  = ");
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];

            }
        System.out.println(soma);


        }


    }








