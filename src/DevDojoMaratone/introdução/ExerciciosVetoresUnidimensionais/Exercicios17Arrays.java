package DevDojoMaratone.introdução.ExerciciosVetoresUnidimensionais;

import java.util.Scanner;

public class Exercicios17Arrays {
    public static void main(String[] args) {
        // Criando array
        int [] age = new int[5];

        Scanner teclado = new Scanner(System.in);
            // adicionando valores
        for (int i = 0; i < age.length ; i++) {
            System.out.println("Digite a idade : ");
            age[i] = teclado.nextInt();
        }
        // Criando variaveis para armazenar os valores do maiores do menor e do index
        int menor = age[0];
        int indexmenor = 0;
        int maior = age[0];
        int indexmaior = 0;

        // Criando condição
        for (int i = 1 ; i < age.length; i++) {
            if (age[i] > maior) {
                maior = age[i];
                indexmaior =i;
            }else if (age[i] < menor){
                menor = age[i];
                indexmenor = i;
            }

        }
        // mostrando o vetor com as idades
        System.out.println("Idades : ");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " /");

        }
        System.out.println("\nMenor  idade : " + menor);
        System.out.println("Indice menor idade : " + indexmenor);
        System.out.println("maior idade : " + maior);
        System.out.println("Indice maior idade : " + indexmaior);

    }
}
