package DevDojoMaratone.Javacore.HAssociacoes.domain;

public class Time {
    private String nomeTime;


    // Criado para setar o nome do time
    public Time(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    // criado para pegar o nome do time
    public String getNomeTime() {
        return nomeTime;
    }

}