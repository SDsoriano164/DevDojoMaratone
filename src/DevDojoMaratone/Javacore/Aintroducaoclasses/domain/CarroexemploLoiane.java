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

    public void setCapacidadeCombustivel(int capacidadeCombustivel){
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public int getAutonomia(){
        return (int) (capacidadeCombustivel *consumoCombustivel);
    }
    public void imprimirInformações(){
        System.out.println("---------------");
        System.out.println(this.nome);
        System.out.println(this.modelo);
        System.out.println(this.ano);
        System.out.println(this.consumoCombustivel);
        System.out.println(this.numPassageiros);
    }



    }

