package DevDojoMaratone.Javacore.HAssociacoes.domain;

public class Time {

    private String nomeTime;
            // class ref
    private     Jogador [] jogadores;



    // Criado para setar o nome do time
    public Time(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    // imprime o nome do time e o jogadores setados para o time.
    public void imprime(){
        System.out.println(nomeTime);
        if (jogadores == null) return;
        for (Jogador jogadores : jogadores) {
            System.out.println(jogadores.getNome());

        }

    }



    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    // criado para pegar o nome do time
    public String getNomeTime() {
        return nomeTime;
    }

}
