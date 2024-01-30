package DevDojoMaratone.Javacore.Aintroducaoclasses.test;

import DevDojoMaratone.Javacore.Aintroducaoclasses.domain.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();
        Carro comportamentoCarro = new Carro();

        // só consegue fazer com objeto do mesmo tipo.
        // fazendo referencia  a objeto carro1 enquanto não estiver perdido em memoria
        carro3 = carro;



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
        System.out.println("=====---=====");
        System.out.println(carro3.nome);
        System.out.println(carro3.modelo);
        System.out.println(carro3.ano);


    }
}
