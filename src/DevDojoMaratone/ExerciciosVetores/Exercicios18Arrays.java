package DevDojoMaratone.ExerciciosVetores;

import java.util.Scanner;

public class Exercicios18Arrays {
    public static void main(String[] args) {
        float[] nota1 = new float[1];
        float[] nota2 = new float[nota1.length];
        float[] media = new float[nota1.length];

        int j = 1;

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < nota1.length; i++) {
            System.out.println("Digite a primeira nota " + j + "o. Aluno ");
            nota1[i] = teclado.nextFloat();
            System.out.println("Digite a segunda nota " + j + "o. Aluno ");
            nota2[i] = teclado.nextFloat();
            j++;
        }

        for (int i = 0; i < nota1.length; i++) {
            media[i] = (nota1[i] + nota2[i]) / 2;
        }

        for (int i = 0; i < nota1.length; i++) {
            System.out.println("Média do aluno " + (i + 1) + ": " + media[i]);

            if (media[i] >= 7) {
                System.out.println("Aprovado");
            } else if (media[i] >= 5 && media[i] < 7) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
