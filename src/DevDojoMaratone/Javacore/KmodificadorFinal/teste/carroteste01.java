package DevDojoMaratone.Javacore.KmodificadorFinal.teste;

import DevDojoMaratone.Javacore.KmodificadorFinal.dominio.Carro;
import DevDojoMaratone.Javacore.KmodificadorFinal.dominio.Comprador;
import DevDojoMaratone.Javacore.KmodificadorFinal.dominio.Sedan;

import java.sql.SQLOutput;

public class carroteste01 {
    public static void main(String[] args) {
        // instânciando classe carro
        Carro carro = new Carro("Toyota Corolla");
        Sedan sedan = new Sedan("Mazda Rx8",60);

        // Imprimindo na tela constante criada com modificador Final
        System.out.println(Carro.VELOCIDADE_LIMITE);

        //Criando relacionamento entre carro e comprador / setando o nome;
        carro.COMPRADOR.setNome("Kaiba");

        // imprimindo
        System.out.println(carro.COMPRADOR);



        sedan.COMPRADOR.setNome("Lorran Saito");
        sedan.imprime();


    }
}
