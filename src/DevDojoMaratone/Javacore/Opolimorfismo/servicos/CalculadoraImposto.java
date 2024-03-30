package DevDojoMaratone.Javacore.Opolimorfismo.servicos;

import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Computador;
import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Produto;
import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static  void calcularImpostoProduto (Produto produto){
        System.out.println("Relatorio de imposto do computador ;");
        double imposto = produto.calcularImposto();
        System.out.println("Nome do produto" + produto.getNome());
        System.out.println("Imposto do produto: " + produto.getValor());
        System.out.println("Imposto a ser pago : " + imposto);
        double valorcomimpostos = produto.getValor() + imposto;
        System.out.println( "Valor com impostos : " + valorcomimpostos);
        System.out.println("--------------------------------------");

        // verificando se o produto é uma istancia de toamate
        if (produto instanceof Tomate){
            Tomate tomate  = (Tomate) produto;
            System.out.println(tomate.getDataValidade());


        }

    }

}
