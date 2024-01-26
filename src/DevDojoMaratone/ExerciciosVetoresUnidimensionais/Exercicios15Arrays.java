package DevDojoMaratone.ExerciciosVetoresUnidimensionais;

import java.util.Scanner;

public class Exercicios15Arrays {
    public static void main(String[] args) {
       int [] vetorA = new int[10];
       int soma = 0;
       int iguaisQuinze = 0;
       float maiorQuinze = 0;
       int somaVetorMaiorQuinze=0;
      float mediavetorMaiorQuinze=0;

    Scanner teclado = new Scanner(System.in);

    // inserindo dados no vetor
        System.out.println("Insira os dados do vetor A ");
        for (int i = 0; i < vetorA.length ; i++) {
            vetorA[i] = teclado.nextInt();

        }
        // testando condições
        for (int i = 0; i < vetorA.length ; i++) {
            if (vetorA[i] <15) {
                //somando os vetores de A se o valor for menor que 15
                soma += vetorA[i];

            }else if (vetorA[i] == 15) {
                // somando os valores do vetor A se for igual a 15
                iguaisQuinze += vetorA[i];

            }else{
                // somando vetores de A se for maior que Quinze
                somaVetorMaiorQuinze += vetorA[i];
                maiorQuinze++;
            }
        }

        // media dos vetores que sao maiores que quinze dividido pela quantidade de vetores que são maiores
        // 5
        mediavetorMaiorQuinze = somaVetorMaiorQuinze/maiorQuinze;

        System.out.println("vetores menores que 15 : " );
        for (int i = 0; i < vetorA.length ; i++) {
            if (vetorA[i] <15){
                System.out.print(vetorA[i] +" ");
            }

        }
        System.out.println("\nSoma dos vetores menor que 15 :" + soma);

        System.out.println("\nvetores menores que 15 : " );
        for (int i = 0; i < vetorA.length ; i++) {
            if (vetorA[i] == 15){
                System.out.print(vetorA[i] +" ");
            }
        }
        System.out.println("\nSoma dos vetores iguais a 15 :" + iguaisQuinze);


        System.out.println("\nvetores maiores que 15 : " );
        for (int i = 0; i < vetorA.length ; i++) {
            if (vetorA[i] > 15){
                System.out.print(vetorA[i] +" ");
            }
        }
        System.out.println("\nMedia dos vetores maior que 15 :" + mediavetorMaiorQuinze);

    }



}









