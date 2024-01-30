package DevDojoMaratone.Javacore.Aintroducaoclasses.test;

import DevDojoMaratone.Javacore.Aintroducaoclasses.domain.CarroexemploLoiane;

public class CarroTesteExemploLoiane {
    public static void main(String[] args) {

        CarroexemploLoiane Sedan = new CarroexemploLoiane();

        Sedan.nome = "Toyota";
        Sedan.ano = 2024;
        Sedan.modelo ="Corola";
        Sedan.numPassageiros = 4;
        Sedan.consumoCombustivel =0.2;
        Sedan.capacidadeCombustivel = 50;

        System.out.println(Sedan.nome);
        System.out.println(Sedan.modelo);
        Sedan.exibirAutonomia();


    }
}
