package DevDojoMaratone.Javacore.Opolimorfismo.servicos;

import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Computador;
import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Produto;
import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador (Computador computador){
        System.out.println("Relatorio de imposto do computador ;");
        double imposto = computador.calcularImposto();
        System.out.println("Nome do computador:" + computador.getNome());
        System.out.println("Imposto do computador: " + computador.getValor());
        System.out.println("Imposto a ser pago : " + imposto);
        double valorcomimpostos = computador.getValor() + imposto;
        System.out.println( "Valor com impostos : " + valorcomimpostos);
    }
    public  static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatorio de imposto do tomate ");
        double imposto = tomate.calcularImposto();
        System.out.println("nome do tomate : " + tomate.getNome());
        System.out.println("valor to domate :" + tomate.getNome());
        System.out.println("imposto a ser pago :" + imposto);
    }
    public static  void calcularImpostoProduto (Produto produto){
        System.out.println("Relatorio de imposto do computador ;");
        double imposto = produto.calcularImposto();
        System.out.println("Nome do computador:" + produto.getNome());
        System.out.println("Imposto do computador: " + produto.getValor());
        System.out.println("Imposto a ser pago : " + imposto);
        double valorcomimpostos = produto.getValor() + imposto;
        System.out.println( "Valor com impostos : " + valorcomimpostos);

    }

}
