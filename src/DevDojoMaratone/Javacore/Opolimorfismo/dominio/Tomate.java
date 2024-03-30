package DevDojoMaratone.Javacore.Opolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_TOMATE = 0.06;
    private String dataValidade;

    public Tomate(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate ...");
        return this.valor * IMPOSTO_TOMATE ;
    }

    public void setDataValidade(String  dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }
}
