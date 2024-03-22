package DevDojoMaratone.Javacore.Lenum.teste;


import DevDojoMaratone.Javacore.Lenum.dominio.Exercicios.Carro;
import DevDojoMaratone.Javacore.Lenum.dominio.Exercicios.Concessionaria;
import DevDojoMaratone.Javacore.Lenum.dominio.TipoCliente;
import DevDojoMaratone.Javacore.Lenum.dominio.TipoPagamento;

public class conssecionariaTeste01 {
    public static void main(String[] args) {
        Concessionaria carro = new Concessionaria("Carro","Honda", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        carro.imprimeVeiculo();

        Carro carro1 = new Carro("Carro","Honda",TipoCliente.PESSOA_FISICA,TipoPagamento.DEBITO,"Honda Integra Type R",2000000,450);
        carro1.imprimeVeiculo();

    }
}
