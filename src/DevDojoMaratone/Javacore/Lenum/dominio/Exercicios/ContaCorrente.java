package DevDojoMaratone.Javacore.Lenum.dominio.Exercicios;

public class ContaCorrente {
    private String nome;
    private int idade;

    private TipoCliente tipoCliente;

    public ContaCorrente(String nome, int idade, TipoCliente tipoCliente) {
        this.nome = nome;
        this.idade = idade;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", tipoCliente=" + tipoCliente.conta +
                '}';
    }
}
