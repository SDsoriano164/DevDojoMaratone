package DevDojoMaratone.introdução.ExerciciosVetoresUnidimensionais;

import java.util.Scanner;

public class Exercicios21Arrays {
    public static void main(String[] args) {
        int [] vetorA = new int[10];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o :" + i );
            vetorA[i]= teclado.nextInt();
            if (vetorA[i] % 2==1){
                break;

        }



        }
    }
}
