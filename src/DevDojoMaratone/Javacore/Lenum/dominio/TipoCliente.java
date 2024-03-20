package DevDojoMaratone.Javacore.Lenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1),

    PESSOA_JURIDICA(2);

    // criando atributo para receber o Valor
   public final int VALOR;

    TipoCliente(int VALOR) { // Constructor para inicializar o valor
        this.VALOR = VALOR;
    }

    public int getVALOR() {
        return VALOR;
    }
}
