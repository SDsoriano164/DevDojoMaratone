package DevDojoMaratone.Javacore.Aintroducaoclasses.test;

import DevDojoMaratone.Javacore.Aintroducaoclasses.domain.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();



        carro.modelo = "Rx-8";
        carro.ano = 2006;
        carro.nome = "Mazda";

        carro2.modelo = "Jetta";
        carro2.ano = 2006;
        carro2.nome = "Wolksvagen";

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);
        System.out.println("=====---=====");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
