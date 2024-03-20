package DevDojoMaratone.Javacore.Lenum.dominio;

public class Clientetst2 {

     public enum TipoPagamento{ // criando constante já na classe, podemos criar com qualquer modificador de acesso.
        DEBITO,CREDITO
    }
    private String nome;
    private TipoCliente tipoCliente;
    public TipoPagamento tipoPagamento; // tem que ser Criado o relacionamento apesar do enum já está na classe

    public Clientetst2(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "ClienteT2{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoCliente=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
