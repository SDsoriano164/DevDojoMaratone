package DevDojoMaratone.Javacore.Aintroducaoclasses.domain;




public class CarroexemploLoiane {

    // atributos da classe
    public String nome;
    public String modelo;
    public int  ano;
    public int numPassageiros;
    public double capacidadeCombustivel;
    public double consumoCombustivel;


    //metodos

    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é : " + capacidadeCombustivel * consumoCombustivel + "km" );
    }



    }

