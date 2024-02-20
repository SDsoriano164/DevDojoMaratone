package DevDojoMaratone.Javacore.FmodificadoresdeacessoEstatico.teste;

import DevDojoMaratone.Javacore.FmodificadoresdeacessoEstatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {


        Carro c1 = new Carro("Bmw m5",280);
        Carro c2 = new Carro("A M G Mercerdes",300);
        Carro c3 = new Carro("Toyota Supra ",220);

        //agora podemos setar o valor da velocidade limite utilizando a propria classe, pois é um metadado da Classe
        // todas as instancia de Carro vão ter o valor associado ao limite...
        // não utiliza a variavel de referencia para alterar apesar de funcionar

        Carro.velocidadeLimite = 120;

        c1.imprime();

        c2.imprime();

        c3.imprime();

    }
}
