package DevDojoMaratone.ExerciciosVetores;

import java.util.Scanner;

public class Exercicios12Arrays {
    public static void main(String[] args) {
        //Criando Array
        int [] valores = new int[5];
        //Criando variavel para armazenar soma
        int somaMulti = 0;
        Scanner teclado = new Scanner(System.in);

        // Armazenando valores dentro do array
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o valor na pos: " + i);
            valores[i] = teclado.nextInt();
        }
        System.out.println("Valores multiplos do vetor: ");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 5 == 0) {
                somaMulti++;
                System.out.print(valores[i] + " ");
            }

        }
        System.out.println("\nSoma dos valores multiplos de 5 = " + somaMulti);

        }


    }








