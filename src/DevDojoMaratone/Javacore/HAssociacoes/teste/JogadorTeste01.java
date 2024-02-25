package DevDojoMaratone.Javacore.HAssociacoes.teste;

import DevDojoMaratone.Javacore.HAssociacoes.domain.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldinho");
        Jogador jogador2 = new Jogador("Káká");
        Jogador jogador3 = new Jogador("boateng");

                                      // criação do array
        // classe     nome do Array( que é um objeto criado em memoria                objetos
        Jogador[]                        jogadores =                        {jogador1,jogador2,jogador3};


        // imprimindo valores do array
        for (Jogador jogador : jogadores) {
            // ref   // metodo em cada objeto da classe
            jogador.imprime();
        }


    }
}
