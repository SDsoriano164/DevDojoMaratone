package DevDojoMaratone.Javacore.Bintroducaometodos.teste;

import DevDojoMaratone.Javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03Retornos {
    public static void main(String[] args) {

        // Classe   // referencia objeto  // Referencia ao objeto da classe
        Calculadora      calculadora   =         new Calculadora();


        // sempre necessário fazer casting para retornar no tipo desejado, sendo ao declarar o método ou já na chamada para o método

        // guardando resultado da chamada em uma variavel


        //caso 1:
       double result = calculadora.divideDoisNumeros(20,0); // retornando dentro de uma variavel
        System.out.println(result);

        System.out.println("------------------");

       //caso 2:
        System.out.println(calculadora.divideDoisNumeros2(20,2)); // retornando no system.out.print

        System.out.println("------------------");
        //caso 3:
        System.out.println(calculadora.divideDoisNumeros3(20,2)); //


        System.out.println("------------------");

        //caso 4 retorno em metodos
        calculadora.divideDoisnumero4(20,2);




    }
}
