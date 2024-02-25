package DevDojoMaratone.Javacore.HAssociacoes.teste;

import DevDojoMaratone.Javacore.HAssociacoes.domain.Jogador;
import DevDojoMaratone.Javacore.HAssociacoes.domain.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Marcelinho Paraiba");
        Time time = new Time("Campinense Clube");
        jogador1.setTime(time);
        jogador1.imprime();


    }


}
