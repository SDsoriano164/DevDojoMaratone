package DevDojoMaratone.Javacore.KmodificadorFinal.teste;

import DevDojoMaratone.Javacore.KmodificadorFinal.dominio.Carro;
import DevDojoMaratone.Javacore.KmodificadorFinal.dominio.Comprador;

import java.sql.SQLOutput;

public class carroteste01 {
    public static void main(String[] args) {
        // instânciando classe carro
        Carro carro = new Carro("Toyota Corolla");

        // Imprimindo na tela constante criada com modificador Final
        System.out.println(Carro.VELOCIDADE_LIMITE);

        carro.COMPRADOR.setNome("Kaiba");

        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setNome("Kakaroto");
        System.out.println(carro.COMPRADOR);
    }
}
