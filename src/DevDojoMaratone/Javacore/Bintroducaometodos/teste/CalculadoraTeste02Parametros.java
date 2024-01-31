package DevDojoMaratone.Javacore.Bintroducaometodos.teste;

import DevDojoMaratone.Javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste02Parametros {
    public static void main(String[] args) {

        // Classe   // referencia objeto  // Referencia ao objeto da classe
        Calculadora      calculadora   =         new Calculadora();


        // Passagem por parametro
        calculadora.multiplicarDoisNumeros(5, 10.5F,5); // precisa de tres argumentos // que são os valores passados


        System.out.println("Finalizando calculadora teste 01");
    }
}
