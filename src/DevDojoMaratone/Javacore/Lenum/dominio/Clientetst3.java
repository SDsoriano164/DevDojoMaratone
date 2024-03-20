package DevDojoMaratone.Javacore.Lenum.dominio;

public class Clientetst3 {
    private String nome;
    private TipoCliente tipoCliente;
    public TipoPagamento tipoPagamento;

    public Clientetst3(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Clientetst3{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
