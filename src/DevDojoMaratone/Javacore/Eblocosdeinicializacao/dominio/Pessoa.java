package DevDojoMaratone.Javacore.Eblocosdeinicializacao.dominio;

import java.util.Scanner;

public class Pessoa {
    public String nome;
    public int idade;
    public String naturalidade;
    public int altura;

    public int matricula;

    public long cpf;

    public String cargo;

    public double salario;

    public int dependentes;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, String naturalidade, int altura, int matricula, long cpf, String cargo, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.naturalidade = naturalidade;
        this.altura = altura;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Pessoa(String nome, int idade, String naturalidade, int altura, int matricula, long cpf, String cargo, double salario, int dependentes){
        this(nome, idade, naturalidade, altura, matricula, cpf, cargo, salario);
        this.dependentes = dependentes;
    }

    public void preencherDadosPessoa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        this.nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        this.idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o nextInt()

        System.out.print("Digite a naturalidade: ");
        this.naturalidade = scanner.nextLine();

        System.out.print("Digite a altura: ");
        this.altura = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o nextInt()

        System.out.print("Digite o CPF: ");
        this.cpf = scanner.nextLong();
        scanner.nextLine(); // Consumir a quebra de linha após o nextLong()

        System.out.print("Digite o cargo: ");
        this.cargo = scanner.nextLine();

        System.out.print("Digite o salário: ");
        this.salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha após o nextDouble()

        System.out.print("Digite o número de dependentes: ");
        this.dependentes = scanner.nextInt();
    }

    public void imprimePessoas() {
        System.out.println("nome  : "+this.nome);
        System.out.println("idade :  "+this.idade);
        System.out.println("naturalidade : "+this.naturalidade);
        System.out.println("Altura : "+this.altura);
        System.out.println("Cpf   :   "+this.cpf);
        System.out.println("Cargo : "+this.cargo);
        System.out.println("Salario :"+this.salario);
        System.out.println("Dependentes:" + this.dependentes);
    }

}
