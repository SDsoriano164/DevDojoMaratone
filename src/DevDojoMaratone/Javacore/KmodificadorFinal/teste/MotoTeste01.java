package DevDojoMaratone.Javacore.KmodificadorFinal.teste;

import DevDojoMaratone.Javacore.KmodificadorFinal.dominio.Motos.Honda;
import DevDojoMaratone.Javacore.KmodificadorFinal.dominio.Motos.ImprimeMotos;
import DevDojoMaratone.Javacore.KmodificadorFinal.dominio.Motos.Moto;

public class MotoTeste01 {
    public static void main(String[] args) {
        Moto moto = new Moto("Honda","Biz");

        moto.COMPRADOR.setNome("Carol Miranda");

        Honda honda = new Honda("Honda motors","Sahara",300);

        honda.COMPRADOR.setNome("Pedro Soriano");


        // classe criada só para imprimir
        ImprimeMotos imprimeMotos = new ImprimeMotos();

        // class    // method // class referenciada
        imprimeMotos.imprimeMethodSuperClass(moto);
        imprimeMotos.imprimeMethodSubClass(honda);

    }
}
