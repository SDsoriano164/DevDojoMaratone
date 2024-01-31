package DevDojoMaratone.Javacore.Bintroducaometodos.teste;

import DevDojoMaratone.Javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03Retornos {
    public static void main(String[] args) {

        // Classe   // referencia objeto  // Referencia ao objeto da classe
        Calculadora      calculadora   =         new Calculadora();


        // sempre necessário fazer casting para retornar no tipo desejado, sendo ao declarar o método ou já na chamada para o método

        // guardando resultado da chamada em uma variavel

       double result = calculadora.divideDoisNumeros2(20,2);
        System.out.println(result);


       //caso 2
        System.out.println(calculadora.divideDoisNumeros2(20,2));

        //caso 3
        System.out.println(calculadora.divideDoisNumeros3(20,2));



    }
}
