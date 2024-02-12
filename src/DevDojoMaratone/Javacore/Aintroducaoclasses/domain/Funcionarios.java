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
        if (salario == null) {
            return;
        }

            for (double salarios : salario) {
                System.out.print("Salário: " + df.format(salarios) + "\n ");
            }
            imprimeMedia();
            System.out.println("------------------------");



    }


    // Método para calcular e imprimir a média salarial
    public void imprimeMedia() {

            double media = 0;
            if (salario == null){
                return;
            }

            // Calculando a soma dos salários
            for (double salarios : salario) {
                media += salarios;
            }

            // Calculando a média
            media /= salario.length;
            System.out.println("Média salarial: " + df.format(media));
        }
    }

