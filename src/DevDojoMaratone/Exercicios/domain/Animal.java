package DevDojoMaratone.Exercicios.domain;

public class Animal {
    private String nome;
    private int idade;

    public void imprimirAnimal() {
        System.out.println("Nome  :" + this.nome);
        System.out.println("idade :" + this.idade);
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("Som genérico animal");
    }
}