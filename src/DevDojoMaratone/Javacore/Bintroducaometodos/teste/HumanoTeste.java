package DevDojoMaratone.Javacore.Bintroducaometodos.teste;

import DevDojoMaratone.Javacore.Bintroducaometodos.dominio.Humano;

public class HumanoTeste {
    public static void main(String[] args) {
        Humano comportamentosHumanos = new Humano();


        //Chamada para o metodo sem retorno
        comportamentosHumanos.falar();
        comportamentosHumanos.dormir();

    }
}
