package DevDojoMaratone.ExerciciosVetoresMultidimensionais;

import java.util.Scanner;

public class Exercicio09Matriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char[][] jogoDaVelha = new char[3][3];
        System.out.println("Jogador X");
        System.out.println("Jogador O");
        int jogada = 1;
        char sinal;
        int linha = 0;
        int coluna = 0;

        boolean ganhou = false;
        boolean empate = false;

        while (!ganhou && !empate) {
            if (jogada % 2 == 1) {
                System.out.println("Vez do jogador 1: escolha linha e coluna (1 - 3)");
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2: escolha linha e coluna (1 - 3)");
                sinal = 'O';
            }

            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.println("Entre com a linha:");
                linha = teclado.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Inválido, digite novamente:");
                }
            }

            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.println("Entre com a coluna (1 - 3):");
                coluna = teclado.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Inválido, digite novamente:");
                }
            }

            linha--;
            coluna--;

            if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
                System.out.println("Posição já usada, tente novamente");
            } else {
                jogoDaVelha[linha][coluna] = sinal;
                jogada++;

                // Imprimindo tabuleiro
                for (int i = 0; i < jogoDaVelha.length; i++) {
                    for (int j = 0; j < jogoDaVelha[i].length; j++) {
                        System.out.print(jogoDaVelha[i][j] + " | ");
                    }
                    System.out.println();
                }

                // Verifica se tem ganhador
                if ((jogoDaVelha[0][0] == sinal && jogoDaVelha[0][1] == sinal && jogoDaVelha[0][2] == sinal) ||
                        (jogoDaVelha[1][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[1][2] == sinal) ||
                        (jogoDaVelha[2][0] == sinal && jogoDaVelha[2][1] == sinal && jogoDaVelha[2][2] == sinal) ||
                        (jogoDaVelha[0][0] == sinal && jogoDaVelha[1][0] == sinal && jogoDaVelha[2][0] == sinal) ||
                        (jogoDaVelha[0][1] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][1] == sinal) ||
                        (jogoDaVelha[0][2] == sinal && jogoDaVelha[1][2] == sinal && jogoDaVelha[2][2] == sinal) ||
                        (jogoDaVelha[0][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][2] == sinal) ||
                        (jogoDaVelha[0][2] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][0] == sinal)) {
                    System.out.println("Jogador " + (sinal == 'X' ? "1" : "2") + " ganhou!");
                    ganhou = true;
                    break;
                }

                // Verifica se há empate
                empate = true;
                for (int i = 0; i < jogoDaVelha.length; i++) {
                    for (int j = 0; j < jogoDaVelha[i].length; j++) {
                        if (jogoDaVelha[i][j] == 0) {
                            empate = false;
                            break;
                        }
                    }
                    if (!empate) {
                        break;
                    }
                }

                if (empate) {
                    System.out.println("Empate!");
                    break;
                }
            }
        }
    }
}
