package DevDojoMaratone.Javacore.HAssociacoes.teste;

import DevDojoMaratone.Javacore.HAssociacoes.domain.Jogador;
import DevDojoMaratone.Javacore.HAssociacoes.domain.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Marcelinho Paraiba");
        Time time = new Time("Campinense Clube");

        Jogador jogador2 = new Jogador("Adelino ");
        Time time2 = new Time("Treze");
        jogador1.setTime(time);
        jogador2.setTime(time2);
        jogador1.imprime();
        jogador2.imprime();


    }


}
