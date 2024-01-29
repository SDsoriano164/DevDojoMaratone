package DevDojoMaratone.introdução.ExerciciosVetoresUnidimensionais;

import java.util.Scanner;

public class Exercicios13Arrays {
    public static void main(String[] args) {
        // Criando Array
        int[] array = new int[10];
        float mediaAritmetica = 0;
        float soma = 0;
        float quantImares =0;
        float mediaSimples=0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os valores do vetor:");

        for (int i = 0; i < array.length; i++) {
            array[i] = teclado.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                soma += array[i];
                quantImares ++;

            }
        }
        mediaSimples = soma/quantImares;
        mediaAritmetica = soma / array.length;

        System.out.println("A média aritmética é = " + mediaAritmetica);
        System.out.println("A Soma é = " + soma);
        System.out.println("Quantidade de numeros impares = " + quantImares);
        System.out.println("Elementos impares/quantidade de impares = " + mediaSimples);

        // Fechar o Scanner para evitar vazamento de recursos
        teclado.close();
    }
}









