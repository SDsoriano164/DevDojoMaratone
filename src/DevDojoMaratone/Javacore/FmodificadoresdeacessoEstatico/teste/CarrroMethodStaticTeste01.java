package DevDojoMaratone.Javacore.FmodificadoresdeacessoEstatico.teste;


import DevDojoMaratone.Javacore.FmodificadoresdeacessoEstatico.dominio.CarroMethodStatic;

public class CarrroMethodStaticTeste01 {
    public static void main(String[] args) {


        // Metodo estatico

        // classe            // chamada para metodo static
        CarroMethodStatic.setVelocidadeLimite(120);

        System.out.println("Velocidade limite :" + CarroMethodStatic.getVelocidadeLimite());



        CarroMethodStatic car1 = new CarroMethodStatic("M A Z D A - R X 8 ",231);
        CarroMethodStatic car2 = new CarroMethodStatic("W O L K W A G E M  - J E T T A ",231);

        car1.imprime();
        car2.imprime();


    }
}
