package DevDojoMaratone.Javacore.HAssociacoes.teste;

import DevDojoMaratone.Javacore.HAssociacoes.domain.Jogador;
import DevDojoMaratone.Javacore.HAssociacoes.domain.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {

        // Instanciando classes
        Jogador jogador = new Jogador("Ronaldinho Gaucho");
        Time time = new Time("Brasil");

        // Criando array para poder associar jogadores ao time
        Jogador [] jogadores = {jogador};

        // associando jogador ao time
        jogador.setTime(time);

        // associando time ao jogador
        time.setJogadores(jogadores);

        // imprimindo
        System.out.println("------- Jogadores--------");

        jogador.imprime();

        System.out.println("------  Time --------");

        time.imprime();
    }

}
