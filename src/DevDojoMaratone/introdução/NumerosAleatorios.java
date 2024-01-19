package DevDojoMaratone.introdução;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println(Math.floor(Math.random()*100));
        Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt(100));
        System.out.println(aleatorio.nextInt(6+1));

    }
}
