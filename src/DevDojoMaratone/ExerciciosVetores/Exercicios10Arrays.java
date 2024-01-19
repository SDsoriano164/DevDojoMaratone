package DevDojoMaratone.ExerciciosVetores;

import java.util.Scanner;

public class Exercicios10Arrays {
    public static void main(String[] args) {
        int [] valores = new int[7];
        Scanner teclado = new Scanner(System.in);
        int quantidadesPares = 0;
        for (int i = 0; i <valores.length; i++) {
            System.out.println("Digite os valores : ");
            valores[i] = teclado.nextInt();

        }
        System.out.print("Vetor A  = ");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0){
                quantidadesPares++;
                System.out.print(valores[i] + " ");
            }


        }
        System.out.println("\nQuantidade de pares = " + quantidadesPares);


    }



}




