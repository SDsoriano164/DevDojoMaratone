package DevDojoMaratone.Javacore.Lenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa fisica"),

    PESSOA_JURIDICA(2,"Pessoa juridica");




    // criando atributo para receber o Valor
   public final int VALOR;
   public final String nomeRelatorio; // tem que ser inicializado


    // o construtor é privado então só as enumerações chamam os construtores
    TipoCliente(int VALOR,String nomeRelatorio) { // Constructor para inicializar o valor
        this.VALOR = VALOR;
        this.nomeRelatorio = nomeRelatorio;
    }

}
