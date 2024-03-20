package DevDojoMaratone.Javacore.Lenum.dominio;

public class Cliente {
    private String nome;
    private String tipo;
    private TipoCliente tipoCliente; // Classe enum

    public Cliente(String nome, String tipo, TipoCliente tipoCliente) { // Construtor para instanciar classes com parametros
        this.nome = nome;
        this.tipo = tipo;
        this.tipoCliente = tipoCliente;

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
