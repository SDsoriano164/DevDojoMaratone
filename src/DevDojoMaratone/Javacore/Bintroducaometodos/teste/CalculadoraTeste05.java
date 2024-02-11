package DevDojoMaratone.Javacore.Bintroducaometodos.teste;

import DevDojoMaratone.Javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int [] num = {2,4,5,6,7};
        int [] num2= {10,20,30,40,50,60};

        System.out.println("Primeiro Array");
        for (int i = 0; i <num.length ; i++) {
            System.out.print(num[i]+ " ");

        }
        System.out.println("\nSegundo Array :");
        for ( int i :num2){
            System.out.print(i + " ");
        }
        System.out.print("\nA soma é ");
        calculadora.somaArrays(num);

        System.out.print("A soma é ");
        calculadora.somaArrays2(num2);

        System.out.println("Utilizando o VarArgs");
        calculadora.somaArgs(3,5,4,5,6,7,8,9,10);



        calculadora.multArgs(3,3,3);





    }
}
