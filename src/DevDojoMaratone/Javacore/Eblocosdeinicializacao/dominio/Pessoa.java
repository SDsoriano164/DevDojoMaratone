package DevDojoMaratone.Javacore.Eblocosdeinicializacao.dominio;

public class Pessoa {
    public String nome;
    public int idade;
    public String naturalidade;
    public int altura;

    public int matricula;

    public long cpf;

    public String cargo;

    public double salario;

    public Pessoa(String nome, int idade, String naturalidade, int altura, int matricula, long cpf, String cargo, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.naturalidade = naturalidade;
        this.altura = altura;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;

    }

    public void imprimePessoas() {
        System.out.println("nome  : "+this.nome);
        System.out.println("idade :  "+this.idade);
        System.out.println("naturalidade : "+this.naturalidade);
        System.out.println("Altura : "+this.altura);
        System.out.println("Cpf   :   "+this.cpf);
        System.out.println("Cargo : "+this.cargo);
        System.out.println("Salario :"+this.salario);

    }


}
