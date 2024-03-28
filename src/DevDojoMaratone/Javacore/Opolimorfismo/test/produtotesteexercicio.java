package DevDojoMaratone.Javacore.Opolimorfismo.test;

import DevDojoMaratone.Javacore.Lenum.dominio.TipoPagamento;
import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Comprador;
import DevDojoMaratone.Javacore.Opolimorfismo.dominio.Computador;
import DevDojoMaratone.Javacore.Opolimorfismo.servicos.CalculadoraImposto;

import static DevDojoMaratone.Javacore.Lenum.dominio.TipoPagamento.DEBITO;

public class produtotesteexercicio {
    public static void main(String[] args) {

        // instância da clase computador
        Computador computador = new Computador("intel core i5",2000);

        // instãncia da classe comprador
        Comprador comprador = new Comprador("Pedro Soriano",24, DEBITO);

        // associando computador ao comprador
        comprador.setProduto(computador);


        // Calculando e mostrando informações
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("-----------------------------------");

        comprador.imprime();



    }
}
