package DevDojoMaratone.Javacore.Lenum.teste;

import DevDojoMaratone.Javacore.Lenum.dominio.Clientetst3;
import DevDojoMaratone.Javacore.Lenum.dominio.TipoCliente;
import DevDojoMaratone.Javacore.Lenum.dominio.TipoPagamento;

import static DevDojoMaratone.Javacore.Lenum.dominio.TipoCliente.PESSOA_FISICA;
import static DevDojoMaratone.Javacore.Lenum.dominio.TipoCliente.PESSOA_JURIDICA;
import static DevDojoMaratone.Javacore.Lenum.dominio.TipoPagamento.*;

public class ClienteTeste03 {
    public static void main(String[] args) {
        Clientetst3 client1 = new Clientetst3("Pedro Soriano", PESSOA_FISICA, CREDITO); // alt enter importa o package e não precisa passar o tipo
        Clientetst3 client2 = new Clientetst3("Carol Soriano", PESSOA_JURIDICA, DEBITO);
        System.out.println(client1);
        System.out.println(client2);
    }
}
