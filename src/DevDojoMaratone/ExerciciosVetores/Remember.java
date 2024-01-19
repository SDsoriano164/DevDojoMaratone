package DevDojoMaratone.ExerciciosVetores;

import java.util.Scanner;

public class Remember {
    public static void main(String[] args) {
        int [] vetorA = new int[5];
        int [] vetorB = new int [vetorA.length];
        int soma = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Insira os valores do vetor A :" + i);
           vetorA[i] = teclado.nextInt();
        }
        for (int i = 0; i <vetorB.length; i++) {
            System.out.println("insira os valores do vetor B :"+i);
            vetorB[i] = teclado.nextInt();

        }
        for (int i = 0; i <vetorA.length; i++) {
            soma += vetorA[i] + vetorB[i];
        }
        System.out.println(soma);

    }
}
