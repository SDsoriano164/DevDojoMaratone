package DevDojoMaratone.Javacore.Aintroducaoclasses.domain;

import java.text.DecimalFormat;

public class Funcionarios {
    // Atributos da classe
    private String nome;
    private int idade;
    private double media;
    private double[] salario;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

     // ao deletar esta linha, não terá mais como modificar o valor da variavel
    //public void setMedia(double media) {
       // this.media = media;
    //}

    public void setSalario(double[] salario) {
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getMedia() {
        return media;
    }

    public double[] getSalario() {
        return salario;
    }

}

