package DevDojoMaratone.Javacore.Lenum.teste;

import DevDojoMaratone.Javacore.Lenum.dominio.Cliente;
import DevDojoMaratone.Javacore.Lenum.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Pedro Soriano","CPF", TipoCliente.PESSOA_FISICA);
        Cliente cliente02 = new Cliente("Pedro Soriano","CNPJ", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente03 = new Cliente("Carla Caroline ","CPF", TipoCliente.PESSOA_FISICA);
        Cliente cliente04 = new Cliente("Antonio Neto","CPF", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(cliente04);
    }


}
