package DevDojoMaratone.Javacore.KmodificadorFinal.dominio;

public class Sedan extends Carro{
    public int capacidadeCombustivel;

    // como está sendo criado a superclasse com o construtor, é necessario inicializar a subclasse
    public Sedan(String nome,int capacidadeCombustivel) {
        super(nome);
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    // sobrescerevendo metodo imprime ( vai imprimir as informações de acordo com a definição na SuperClasse )
    // porém vai adicionar mais um comportamento ao metodo que é a capacidade do combustivel.
    public void imprime(){
        super.imprime();
        System.out.println(this.capacidadeCombustivel);
    }

    public int getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(int capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

}
