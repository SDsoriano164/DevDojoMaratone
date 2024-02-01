package DevDojoMaratone.Javacore.Bintroducaometodos.teste;

import DevDojoMaratone.Javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04Retornos {
    public static void main(String[] args) {


        Calculadora calculadora = new Calculadora();
        // criando copia da variavel para o metodo
        int num1= 1;
        int num2 = 2;

        // o metodo já está com a variavel definida com os valores

        // os valores serão impressos porque
        calculadora.alteraDoisNumeros(num1,num2);

        System.out.println("---------------");
        System.out.println("Fora do metodo");
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);


    }
}
