package DevDojoMaratone.Javacore.Aintroducaoclasses.domain;

import java.text.DecimalFormat;

public class Funcionarios {
    // Atributos da classe
    public String nome;
    public int idade;
    public double[] salario;

    // DecimalFormat para formatar os salários
    DecimalFormat df = new DecimalFormat("R$ #,##0.00"); // Define o formato desejado

    // Método para imprimir os atributos da classe
    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + idade);

        // Mostrando os salários usando for-each
        for (double salarios : salario) {
            System.out.print("Salário: " + df.format(salarios) + "\n ");
        }

        // Chamando o método imprimeMedia para imprimir a média salarial
        imprimeMedia();

        System.out.println("------------------------");
    }

    // Método para calcular e imprimir a média salarial
    public void imprimeMedia() {
        double media = 0;

        // Calculando a soma dos salários
        for (double salarios : salario) {
            media += salarios;
        }

        // Calculando a média
        media /= salario.length;

        // Imprimindo a média formatada
        System.out.println("Média salarial: " + df.format(media));
    }
}
