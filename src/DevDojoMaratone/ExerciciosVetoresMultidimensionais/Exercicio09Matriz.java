package DevDojoMaratone.ExerciciosVetoresMultidimensionais;

import java.util.Scanner;

public class Exercicio09Matriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char [] [] jogoDaVelha = new char [3][3];
        System.out.println("Jogador X");
        System.out.println("Jogador O");
        int jogada = 1;
        char sinal;
        int linha = 0;
        int coluna= 0;

        boolean ganhou = false;
        while (!ganhou) {
            if (jogada % 2 == 1 ) {
                System.out.println("Vez do jogador 1 : escolha linha e coluna ( 1 - 3 )");
                sinal = 'X';
            }else {
                System.out.println("Vez do jogador 2 : escolha linha e coluna");
                sinal = 'O';
            }
            boolean linhaValida = false;
            while ( !linhaValida ) {
                System.out.println("Entre com a linha :");
                linha = teclado.nextInt();
                if (linha >= 1 && linha <=3){
                    linhaValida = true;
                }else {
                    System.out.println("Invalido, digite novamente :");
                }
            }
            boolean colunaValida = false;
            while(!colunaValida) {
                System.out.println("Entre com a coluna ");
                coluna = teclado.nextInt();
                if (coluna >1 && coluna<=3) {
                    colunaValida = true;
                }
            }
            linha--;
            coluna--;
            if (jogoDaVelha[linha][coluna] == 'X'|| jogoDaVelha[linha][coluna] == 'O'){
                System.out.println("Posição Ja usada, tente novamente ");
            }else{
                jogoDaVelha[linha][coluna] = sinal;
                jogada++;

            }
            // imprimindo tabuleiro
            for (int i = 0; i <jogoDaVelha.length ; i++) {
                for (int j = 0; j <jogoDaVelha[i].length ; j++) {
                    System.out.print(jogoDaVelha[i][j] + " |");

                }
                System.out.println();

            }
            //verifica se tem ganhador
            if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') ||
                    (jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') ||
                    (jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') ||
                    (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') ||
                    (jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') ||
                    (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') ||
                    (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') ||
                    (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][0] == 'X')) {
                System.out.println("Jogador 1 ganhou!");
                ganhou = true;
                break;

            }

        }

    }
}

