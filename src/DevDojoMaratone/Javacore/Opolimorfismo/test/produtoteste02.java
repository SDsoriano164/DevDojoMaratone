package DevDojoMaratone.Javacore.Opolimorfismo.test;

import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Computador;
import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Produto;
import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Tomate;
import DevDojoMaratone.Javacore.Opolimorfismo.servicos.CalculadoraImposto;

public class produtoteste02 {
    public static void main(String[] args) {

        Produto produto1 = new Computador("Ryzen 9",2000);

        System.out.println(" nome :"+ produto1.getNome());
        System.out.println(" valor : " +produto1.getValor());
        System.out.println("calcular imposto: "+produto1.calcularImposto());

        System.out.println("-------------------------------------------------------");

        Produto produto2 = new Tomate("Tomate americano",2);
        System.out.println(" nome :" +produto2.getNome());
        System.out.println(" valor : " +produto2.getValor());
        System.out.println("calcular imposto:"+produto2.calcularImposto());

        System.out.println("-------------------------------------------");

        // Acessando Classe com metodo de calcularimposto passando argumento
        CalculadoraImposto.calcularImpostoProduto(produto1);


    }
}
