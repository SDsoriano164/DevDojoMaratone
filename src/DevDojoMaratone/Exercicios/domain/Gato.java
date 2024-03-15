package DevDojoMaratone.Exercicios.domain;

public class Gato extends Animal {
    private String raca;

    public Gato(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miaaau");
    }
    @Override
    public void imprimirAnimal() {
        super.imprimirAnimal();
        System.out.println("raça :" + this.raca);
        emitirSom();
        System.out.println("-------------------");


    }
}
