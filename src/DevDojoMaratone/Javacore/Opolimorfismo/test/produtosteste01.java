package DevDojoMaratone.Javacore.Opolimorfismo.test;

import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Computador;
import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Tomate;
import DevDojoMaratone.Javacore.Opolimorfismo.servicos.CalculadoraImposto;

public class produtosteste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Macbook ",7000);
        Tomate tomate = new Tomate("tomate cereja",6);

        // chamada para o metodo de serviço estatico
        CalculadoraImposto.calcularImpostoProduto(computador);
        System.out.println("--------------------------------------");

        CalculadoraImposto.calcularImpostoProduto(tomate);
    }

}
