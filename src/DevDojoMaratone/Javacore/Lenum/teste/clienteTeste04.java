package DevDojoMaratone.Javacore.Lenum.teste;

import DevDojoMaratone.Javacore.Lenum.dominio.Clientetst2;
import DevDojoMaratone.Javacore.Lenum.dominio.Clientetst3;
import DevDojoMaratone.Javacore.Lenum.dominio.TipoCliente;
import DevDojoMaratone.Javacore.Lenum.dominio.TipoPagamento;

public class clienteTeste04 {
    public static void main(String[] args) {
        Clientetst3 cliente = new Clientetst3("lvat missy", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);




        System.out.println(cliente);
        System.out.println(" Desconto Debito :" + TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println("Desconto Crédito :" +   TipoPagamento.CREDITO.calcularDesconto(100));

    }
}
