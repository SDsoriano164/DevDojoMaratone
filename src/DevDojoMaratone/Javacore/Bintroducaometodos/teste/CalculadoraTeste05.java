package DevDojoMaratone.Javacore.Bintroducaometodos.teste;

import DevDojoMaratone.Javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int [] num = {2,4,5,6,7};


        for (int i = 0; i <num.length ; i++) {
            System.out.println(num[i]);

        }
        System.out.print("A soma é ");
        calculadora.somaArrays(num);





    }
}
