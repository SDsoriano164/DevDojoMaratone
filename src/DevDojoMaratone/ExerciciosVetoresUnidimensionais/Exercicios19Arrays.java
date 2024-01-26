package DevDojoMaratone.ExerciciosVetoresUnidimensionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicios19Arrays {
    public static void main(String[] args) {
        double[] variacoes = new double[5];
        Scanner teclado = new Scanner(System.in);
        double cotDollar;

        System.out.println("Digite a cotação do dólar ");
        cotDollar = teclado.nextDouble();

        for (int i = 1; i <= variacoes.length; i++) {
            variacoes[i-1] = cotDollar * (i);
        }

        DecimalFormat df = new DecimalFormat("###,###.##");
        for (int i = 0; i < variacoes.length; i++) {
            System.out.println(df.format(variacoes[i]));
        }
    }
}
