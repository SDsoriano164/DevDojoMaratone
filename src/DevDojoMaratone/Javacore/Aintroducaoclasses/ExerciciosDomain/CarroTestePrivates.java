package DevDojoMaratone.Javacore.Aintroducaoclasses.ExerciciosDomain;

import DevDojoMaratone.Javacore.Aintroducaoclasses.domain.Carro;

public class CarroTestePrivates {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setNome("Rx 8");
        carro.setModelo("Mazda");
        carro.setAno(2004);
        carro.setValores(new int[]{50000,30000,2700});

        carro.exibirInformações();
        System.out.println("maior valor");
        System.out.println(carro.maiorValor());

    }
}
