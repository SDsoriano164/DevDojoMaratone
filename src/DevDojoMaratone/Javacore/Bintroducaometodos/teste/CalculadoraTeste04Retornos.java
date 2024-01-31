package DevDojoMaratone.Javacore.Bintroducaometodos.teste;

import DevDojoMaratone.Javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04Retornos {
    public static void main(String[] args) {

        // Classe   // referencia objeto  // Referencia ao objeto da classe
        Calculadora      calculadora   =         new Calculadora();


        // sempre necessário fazer casting para retornar no tipo desejado, sendo ao declarar o método ou já na chamada para o método

        // guardando resultado da chamada em uma variavel
       double result = calculadora.multiplicacaoDoisNumeros(3,5);
        System.out.println(result);


        // ou
        System.out.println(calculadora.multiplicacaoDoisNumeros(20,2));


    }
}
