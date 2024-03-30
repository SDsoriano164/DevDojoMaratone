package DevDojoMaratone.Javacore.Opolimorfismo.dominio;

public class Televisao extends Produto {
    public static final double IMPOSTO_TV = 0.21;
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da televisão");
        return this.valor * IMPOSTO_TV ;
    }

    public Televisao(String nome, int valor) {
        super(nome, valor);
    }
}
