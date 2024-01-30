package DevDojoMaratone.Javacore.Bintroducaometodos.teste;

import DevDojoMaratone.Javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {

        // Classe   // referencia objeto  // Referencia ao objeto da classe
        Calculadora      calculadora   =         new Calculadora();


        // chamada para o método
        calculadora.somaDoisNumeros();
        calculadora.subtrairDoisNumeros();
        calculadora.multiplicarDoisNumeros();
        System.out.println("Finalizando calculadora teste 01");
    }
}
