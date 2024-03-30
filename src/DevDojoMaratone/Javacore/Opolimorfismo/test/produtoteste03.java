package DevDojoMaratone.Javacore.Opolimorfismo.test;

import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Computador;
import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Produto;
import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Tomate;
import DevDojoMaratone.Javacore.Opolimorfismo.servicos.CalculadoraImposto;

public class produtoteste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzem 9",3000);
        Tomate tomate = new Tomate("Tomate cereja",5);

        tomate.setDataValidade("20/10/2024");


        CalculadoraImposto.calcularImpostoProduto(tomate);


    }
}
