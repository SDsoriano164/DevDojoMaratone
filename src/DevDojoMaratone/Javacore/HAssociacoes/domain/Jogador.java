package DevDojoMaratone.Javacore.HAssociacoes.domain;

public class Jogador {
    private  String nome;

   // Associando Time a classe jogador
    private Time time;


    // criado para dar o nome do jogador na instancia
    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        //só executa esse bloco se o time for diferente de null (tiver algo escrito )
        if (time != null) {
            System.out.println(time.getNomeTime());
        }


    }


    // utilizado para associar a classe Time a classe jogador
    public void setTime(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }


    public String getNome() {
        return nome;
    }
    // não necessário já que estamos setando o nome na instancia utilizada pelo construtor
    public void setNome(String nome) {
        this.nome = nome;
    }
}