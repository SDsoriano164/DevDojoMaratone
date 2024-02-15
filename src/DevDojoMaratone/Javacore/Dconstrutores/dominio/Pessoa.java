package DevDojoMaratone.Javacore.Dconstrutores.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    private int anoNascimento;

    private int Altura;

    private int Peso;

    private String religião;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    public Pessoa (String nome, int idade,char sexo){
        this(nome, idade);
        this.sexo = sexo;


    }
    public void setAnoNascimento (int anoNascimento){
        this.anoNascimento = anoNascimento;
    }
    public void init (int altura, int peso, String religião){
        this.setAnoNascimento(anoNascimento);
        this.Altura = altura;
        this.Peso = peso;
        this.religião = religião;

    }




    public void imprimePessoas(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println(this.anoNascimento);
        System.out.println(this.Altura);
        System.out.println(this.Peso);
        System.out.println(this.religião);
        System.out.println("------------");
    }
}
