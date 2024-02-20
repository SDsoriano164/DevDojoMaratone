package DevDojoMaratone.Javacore.FmodificadoresdeacessoEstatico.teste;

import DevDojoMaratone.Javacore.FmodificadoresdeacessoEstatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        // Cada instância da classe é independente, então quando a gente cria uma instância sem um método estatico,
        // o valor da velocidade que deveria ser fixo para todos os objetos, só modifica apenas 1, pois eles são independentes

        Carro c1 = new Carro("Bmw m5",280);
        Carro c2 = new Carro("A M G Mercerdes",300);
        Carro c3 = new Carro("Toyota Supra ",220);


        Carro.velocidadeLimite = 120;

        c1.imprime();

        c2.imprime();

        c3.imprime();

    }
}
