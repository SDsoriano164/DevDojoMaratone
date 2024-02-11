package DevDojoMaratone.Javacore.Bintroducaometodos.dominio;

public class Calculadora {


    public void somaDoisNumeros(){  // modificador de acesso // void = vazio // metodo que não retorna valores
        System.out.println("Soma");
        System.out.println(10+10);
    }


    public void subtrairDoisNumeros(){
        System.out.println("Subtração");
        System.out.println(10-5);
    }


    // Passagem por parametro
    // Cria uma variavel na qual sera armazenada os valores para o metodo ser executado

                                        // parametros
    public void multiplicarDoisNumeros(int num1,float num2, int num3){ // tem que ser inicializado o tipo na variavel
        System.out.println(num1 * num2 );
        // voce pode não informar na hora da exibição o parametro, porem ao declarar um novo parametro, ele tem que ser exibibido
    }


    // Retornos de um método,   produzir e devolver a ponto de chamada
    public double divideDoisNumeros (double num1, double num2){
        if (num2 ==0){
            System.out.println("Não existe divisão por 0");
            return 0;

        }
        System.out.println(num1 + " / " + num2 + " = ");
      return  num1/num2;

    }
    public int divideDoisNumeros2 (double num1, double num2){
        if (num2 == 0){
            System.out.println(num1 + " / " + num2 + " = ");
            return (int) (num1/num2);
        }else{
            System.out.println("Não existe divisão por 0");
         return 0;
        }
    }


    public double divideDoisNumeros3 (double num1, double num2){
        if (num1 !=0){
            System.out.println(num1 + " / " + num2 + " = ");
            return  num1/num2;
        }
        System.out.println("Não existe divisão por 0");
        return 0;
    }
    public void divideDoisnumero4 (double num1,double num2){
        if (num2 == 0){
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros (int num1,int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do metodo ");
        System.out.println( "numero 1 :" + num1);
        System.out.println( "numero 2 :" +num2);

    }
    public void somaArrays(int [] numeros){
        int sum = 0;
        for (int i = 0; i < numeros.length ; i++) {
            sum += numeros[i];

        }
        System.out.println(sum);
    }
    public void somaArrays2 (int [] numeros){
        int soma = 0;
        for (int num :numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaArgs (int valor,int valor1, int... numeros){
        int soma = 0;
        for (int num :numeros){
            soma += num;
        }
        System.out.println(soma);


    }
    public void multArgs (int...numeros){
        int mult = 1;
        for (int i = 0; i <numeros.length ; i++) {
            mult *= numeros[i];

        }
        System.out.println(mult);
    }


}


