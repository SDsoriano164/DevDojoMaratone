package DevDojoMaratone.introdução.ExerciciosVetoresUnidimensionais;

import java.util.Scanner;

public class Exercicios16Arrays {
    public static void main(String[] args) {
        int[] age = new int[5];
        String[] nome = new String[age.length]; // pegando comprimento do array da idade

        Scanner teclado = new Scanner(System.in);


        for (int i = 0; i < age.length; i++) {
            System.out.println("Digite seu nome ");
            nome[i] = teclado.nextLine();

            System.out.println("Digite sua idade");
            age[i] = Integer.parseInt(teclado.nextLine());
        }

        // imprimindo valores maiores que 25
        System.out.println("Maiores de 25 :");
        int maiores20 = 0;
        for (int i = 0; i < age.length ; i++) {
            if (age[i] > 20){
                System.out.println("Nome: " + nome[i] + ", Idade: " + age[i]);
                maiores20++;
            }

        }
        System.out.println("=============================");
        System.out.println();

       // imprimindo valores
        for (int i = 0; i < age.length; i++) {
            System.out.println("Nome: " + nome[i] + ", Idade: " + age[i]);
        }
        System.out.println(" Existem " + maiores20 + " maiores de 20");

        teclado.close(); //
    }
}
