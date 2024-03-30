package DevDojoMaratone.Javacore.Opolimorfismo.test;

import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Computador;
import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Produto;
import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Televisao;
import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Tomate;
import DevDojoMaratone.Javacore.Opolimorfismo.servicos.CalculadoraImposto;

public class produtoteste02 {
    public static void main(String[] args) {

        Produto produto1 = new Computador("Ryzen 9",2000);
        // só conseguimos acessar os campos que herdamos para a subclasse
        // caso seja criados atributos dentro da subclasse só conseguimos acessar na instancia da subclasse



        System.out.println(" nome :"+ produto1.getNome());
        System.out.println(" valor : " +produto1.getValor());
        System.out.println("calcular imposto: "+produto1.calcularImposto());
        System.out.println("-------------------------------------------------------");


        Produto produto2 = new Tomate("Tomate americano",2);
        System.out.println(" nome :" +produto2.getNome());
        System.out.println(" valor : " +produto2.getValor());
        System.out.println("calcular imposto:"+produto2.calcularImposto());

        // instanciando subclasse // nao tem acesso aos atributos diretamente
        Tomate tomate1 = new Tomate("tomate verde ", 20);
        tomate1.setDataValidade("10/06/1999");
        System.out.println("data de validade do tomate :" + tomate1.getDataValidade());

        //
        Produto produto3 = new Televisao("Samsung 50\"",4000);


        System.out.println("-------------------------------------------");

        // Acessando Classe com metodo de calcularimposto passando argumento
        CalculadoraImposto.calcularImpostoProduto(produto2);
        CalculadoraImposto.calcularImpostoProduto(produto3);


    }
}
