package DevDojoMaratone.Javacore.Lenum.teste;

import DevDojoMaratone.Javacore.Lenum.dominio.Clientetst2;
import DevDojoMaratone.Javacore.Lenum.dominio.Clientetst2.TipoPagamento; // importado com alt enter
import DevDojoMaratone.Javacore.Lenum.dominio.TipoCliente;

public class ClienteTeste02 {


    public static void main(String[] args) {
        Clientetst2 cliente1 = new Clientetst2("Messi", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        Clientetst2 cliente2 = new Clientetst2("Gabigol",TipoCliente.PESSOA_JURIDICA,TipoPagamento.CREDITO);
        System.out.println(cliente2);
    }
}
