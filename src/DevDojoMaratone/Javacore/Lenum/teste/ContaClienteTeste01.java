package DevDojoMaratone.Javacore.Lenum.teste;

import DevDojoMaratone.Javacore.Lenum.dominio.Exercicios.ContaCorrente;
import DevDojoMaratone.Javacore.Lenum.dominio.Exercicios.TipoCliente;

import static DevDojoMaratone.Javacore.Lenum.dominio.Exercicios.TipoCliente.ADICIONAL;
import static DevDojoMaratone.Javacore.Lenum.dominio.Exercicios.TipoCliente.TITULAR;

public class ContaClienteTeste01 {
    public static void main(String[] args) {
        ContaCorrente cliente1 = new ContaCorrente("Pedro Henrique Soriano",24, TITULAR);
        ContaCorrente cliente2 = new ContaCorrente("Carla Caroline Soriano",23, TITULAR);
        ContaCorrente cliente3 = new ContaCorrente("Eduardo Soriano da Silva",8, ADICIONAL);


        System.out.println(cliente1);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(cliente2);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(cliente3);

    }

}
