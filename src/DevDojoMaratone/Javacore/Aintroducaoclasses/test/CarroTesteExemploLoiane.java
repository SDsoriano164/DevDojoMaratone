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
        Sedan.setCapacidadeCombustivel(50);

        System.out.println(Sedan.nome);
        System.out.println(Sedan.modelo);
        // metodo sem retorno, apenas mostrando o valor no metodo
        Sedan.exibirAutonomia();

        System.out.println("-----------------------");
        Sedan.exibirAutonomiaPassandoArgumentos(50,0.2);

        // usando retornos
        System.out.println("-----------------------");
        // retornando o valor para o chamador // porem sem criar uma variavel.
        System.out.println(Sedan.exibirAutonomia2() + " km");
        // retornando o valor para o chamador dentro de uma variavel
        double autonomia = Sedan.exibirAutonomia2();
        System.out.println("A autonomia é de : " + autonomia);


        System.out.println("------ Passando argumentos -------");
        Sedan.exibirAutonomiaPassandoArgumentos(Sedan.consumoCombustivel,Sedan.capacidadeCombustivel);

        System.out.println("------ Autonomia no get---------- ");
        System.out.println(Sedan.getAutonomia());

        Sedan.imprimirInformações();




    }
}
