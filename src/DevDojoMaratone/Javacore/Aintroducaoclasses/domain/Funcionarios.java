package DevDojoMaratone.Javacore.Aintroducaoclasses.domain;

import java.text.DecimalFormat;
public class Funcionarios {
    public String nome;
    public int idade;
    public double[] salario;

    DecimalFormat df = new DecimalFormat("R$ #,##0.00"); // Define o formato desejado
    public void imprime(){
        System.out.println("Nome : " + this.nome);
        System.out.println("Idade : " + idade);
        for (double salarios : salario){
            System.out.print("Salario : " + df.format(salarios) + "\n ");
        }
    }
    public void imprimeMedia(){
        double media = 0;
        for (double salarios:salario){
            media += salarios;

        }
        media /= salario.length;
        System.out.println("Media salarial : " + df.format(media));
    }
}
