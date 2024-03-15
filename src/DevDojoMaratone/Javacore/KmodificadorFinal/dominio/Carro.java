package DevDojoMaratone.Javacore.KmodificadorFinal.dominio;

public class Carro {
    public String nome;


    // Criando relacionamento, Carro tem um comprador;

    // Variavel de referência não pode ser atribuida a outra instância de classe nem mesmo criado nova instância
    // porem podemos acessar os atributos e métodos





    public final Comprador COMPRADOR = new Comprador();

    // Constante criada
    public static final double VELOCIDADE_LIMITE = 220;

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
