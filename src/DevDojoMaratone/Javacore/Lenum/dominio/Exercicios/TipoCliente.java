package DevDojoMaratone.Javacore.Lenum.dominio.Exercicios;

public enum TipoCliente {
    TITULAR("titular"),
    ADICIONAL("adicional");

    public final String conta;
    TipoCliente(String conta) {
        this.conta = conta;
    }
}
