package DevDojoMaratone.ExerciciosVetores;

public class Exercicios20Arrays {
    public static void main(String[] args) {
        // Criar um array de 10 elementos
        int[] numerosAleatorios = new int[20];
        int num0 = 0;
        int num1 = 0;

        // Preencher o array com valores aleatórios 0 ou 1
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) (Math.round(Math.random()));
        }

        // Contar a quantidade de uns (1) no array
        for (int i = 0; i < numerosAleatorios.length; i++) {
            if (numerosAleatorios[i] == 1) {
                num1++;
            } else {
                num0++; // Contar a quantidade de zeros (0)
            }
        }
        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.print(numerosAleatorios[i] + " ");

        }

        // Calcular percentagens
        double porcentagem0 = (num0 * 100.0) / numerosAleatorios.length;
        double porcentagem1 = (num1 * 100.0) / numerosAleatorios.length;

        // Exibir resultados
        System.out.println("\nPercentagem de números 0: " + porcentagem0 + " %");
        System.out.println("Percentagem de números 1: " + porcentagem1 + " %");
    }
}
