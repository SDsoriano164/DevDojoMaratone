package DevDojoMaratone.Javacore.FmodificadoresdeacessoEstatico.dominio;

public class Funcionarios {
    private String nome;
    private int idade;

    public static String empresaAtual = "a&c";

    public Funcionarios(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }
    public void imprimeFuncionarios(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(Funcionarios.empresaAtual);
        System.out.println("------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

