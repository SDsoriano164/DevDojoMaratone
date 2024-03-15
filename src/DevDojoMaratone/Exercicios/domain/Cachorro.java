package DevDojoMaratone.Exercicios.domain;

public class Cachorro extends Animal {
    private String raca;

    // utilizando os construtores e fazendo a chamada para que possamos usar na classe atual.
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    //
    @Override
    public void imprimirAnimal() {
        super.imprimirAnimal();
        System.out.println("Raça: "+this.raca);
        emitirSom();
        System.out.println("-------------------");

    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
