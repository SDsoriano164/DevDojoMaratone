package DevDojoMaratone.ExerciciosVetoresMultidimensionais;

import java.util.Random;
import java.util.Scanner;

public class Exercicio05Matriz {
    public static void main(String[] args) {
        int [] [] array3x3 = new int[3][3];
        Scanner teclado = new Scanner(System.in);
        int numPar = 0;
        int numImpar = 0;

        for (int i = 0; i <array3x3.length; i++) {
            System.out.println("Digite o valor na linha " +
                    i );
            for (int j = 0; j < array3x3[i].length ; j++) {
                System.out.println("coluna " + j);
                array3x3[i][j] = teclado.nextInt();
                if (array3x3[i][j] % 2 == 0 ) {
                    numPar++;
                }else {
                    numImpar++;
                }


            }

        }
        for (int i = 0; i <array3x3.length; i++) {
            System.out.println("------");
            for (int j = 0; j < array3x3[i].length; j++) {
                System.out.print(array3x3[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("Quant numeros pares :" + numPar);
        System.out.println("Quant numeros impares :" + numImpar);

    }
}
