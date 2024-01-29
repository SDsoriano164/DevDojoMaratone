package DevDojoMaratone.introdução.ExerciciosVetoresMultidimensionais;

import java.util.Scanner;

public class Exercicios01Matriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // pegando numero de entrevistados
        System.out.println("Digite a quantidade de pessoas entrevistadas");
        int numEntrevistados = teclado.nextInt();

        // criando array para guardar informações
        String[][] nomeFilhos = new String[numEntrevistados][];

        // Criando array para adicionar nome dos filhos
        for (int i = 0; i < nomeFilhos.length; i++) {
            System.out.println("Entre com a quantidade de filhos: ");
            int quantFilhos = teclado.nextInt();
            nomeFilhos[i] = new String[quantFilhos];
            for (int j = 0; j < nomeFilhos[i].length; j++) {
                System.out.println("Digite o nome do filho " + (j + 1) + " para a pessoa " + (i + 1) + ": ");
                nomeFilhos[i][j] = teclado.next();
            }
        }

        for (int i = 0; i < nomeFilhos.length; i++) {
            System.out.println((i + 1) + "a. Pessoa - Quantidade de filhos: " + nomeFilhos[i].length + " ");
            for (int j = 0; j < nomeFilhos[i].length; j++) {
                System.out.println(nomeFilhos[i][j]);
            }
            System.out.println(); // Adicione uma linha em branco entre as pessoas
        }
    }
}
