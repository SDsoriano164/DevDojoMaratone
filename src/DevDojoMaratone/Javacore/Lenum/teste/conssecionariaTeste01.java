package DevDojoMaratone.Javacore.Lenum.teste;


import DevDojoMaratone.Javacore.Lenum.dominio.Exercicios.Carro;
import DevDojoMaratone.Javacore.Lenum.dominio.Exercicios.Concessionaria;
import DevDojoMaratone.Javacore.Lenum.dominio.TipoCliente;
import DevDojoMaratone.Javacore.Lenum.dominio.TipoPagamento;

public class conssecionariaTeste01 {
    public static void main(String[] args) {
        Concessionaria carro = new Concessionaria("Carro","Honda", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        carro.imprimeVeiculo();
        System.out.println("---------------------------------");

        Carro carro1 = new Carro("Carro","Honda",TipoCliente.PESSOA_FISICA,TipoPagamento.DEBITO,"Honda Integra Type R",2000000,450);



        carro1.imprimeVeiculo();
        System.out.println(carro1.getValorCarro());

        // pegando valor do veiculo com desconto, acessando enumerações e calculando desconto com o valor do carro
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(carro1.getValorCarro()));



    }
}
