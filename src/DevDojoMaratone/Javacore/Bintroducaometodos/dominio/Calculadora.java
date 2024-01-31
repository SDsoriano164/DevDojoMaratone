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
        if (num1 % 2 ==0){
            return 0;
        }
      return (int) num1/num2;      // pode fazer casting no retorno
    }
    public int divideDoisNumeros2 (double num1, double num2){
        if (num1 % 2 ==0){
            return 0;
        }else{
            return (int) (num1/num2);
        }

    }
    public double divideDoisNumeros3 (double num1, double num2){
        if (num1 !=0){
            return  num1/num2;
        }
        return 0;       // pode fazer casting no retorno
    }



    public int multiplicacaoDoisNumeros (int num3, int num4) {
        return num3 * num4;
    }

}
