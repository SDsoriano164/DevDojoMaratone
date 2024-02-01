package DevDojoMaratone.Javacore.Aintroducaoclasses.domain;




public class CarroexemploLoiane {

    // atributos da classe
    public String nome;
    public String modelo;
    public int  ano;
    public int numPassageiros;
    public double capacidadeCombustivel;
    public double consumoCombustivel;


    //metodos sem retorno

    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é : " + capacidadeCombustivel * consumoCombustivel + "km" );
    }

    // metodo com retorno
    public double exibirAutonomia2(){
     return capacidadeCombustivel * consumoCombustivel;

    }
    public void exibirAutonomiaPassandoArgumentos (double num1, double num2){
        System.out.println( num1 * num2);
    }



    }

