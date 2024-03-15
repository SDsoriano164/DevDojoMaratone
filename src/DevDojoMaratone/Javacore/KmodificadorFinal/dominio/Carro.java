package DevDojoMaratone.Javacore.KmodificadorFinal.dominio;

public class Carro {
    public String nome;


    // Criando relacionamento, Carro tem um comprador;

    // Variavel de referência não pode ser atribuida a outra instância de classe nem mesmo criado nova instância
    // porem podemos acessar os atributos e métodos



    // permite acesso a variavel de refêrencia sem precisar utilizar o get
    public final Comprador COMPRADOR = new Comprador();


    // Constante criada

            // static permite o uso direto da referência da classe, sem necessidade de criação da istância
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
