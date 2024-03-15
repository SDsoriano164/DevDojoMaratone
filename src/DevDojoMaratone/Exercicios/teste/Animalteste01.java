package DevDojoMaratone.Exercicios.teste;

import DevDojoMaratone.Exercicios.domain.Cachorro;
import DevDojoMaratone.Exercicios.domain.Gato;

public class Animalteste01 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("kiki",10,"poodle");
        Gato gato = new Gato("Kitty",5,"Laranja");
        Gato gato1 = new Gato("Baby",3,"preto");
        Gato gato2 = new Gato("Sagua",7,"cinza");

       cachorro.imprimirAnimal();
       gato.imprimirAnimal();
       gato2.imprimirAnimal();

    }
}
