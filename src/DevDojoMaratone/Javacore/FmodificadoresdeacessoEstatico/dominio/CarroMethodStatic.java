package DevDojoMaratone.Javacore.FmodificadoresdeacessoEstatico.dominio;

public class CarroMethodStatic {
    private String nome; // Nome da marca do carro
    private int velocidadeMax; // Velocidade máxima do carro
    private static int velocidadeLimite; // Velocidade limite global compartilhada por todos os carros

    // Construtor que inicializa o objeto CarroMethodStatic
    public CarroMethodStatic(String nome, int velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    // Método que imprime informações sobre o carro e a velocidade limite global
    public void imprime() {
        System.out.println("---------------------------");
        System.out.println(" Marca: " + this.nome);
        System.out.println(" Velocidade máxima: " + this.velocidadeMax);
        System.out.println(" Velocidade limite global: " + CarroMethodStatic.velocidadeLimite);
    }

    // Métodos de acesso para os atributos privados
    public String getNome() {
        return nome;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    // Método estático para obter a velocidade limite global
    public static int getVelocidadeLimite() {
        return velocidadeLimite;
    }

    // Método estático para definir o valor da velocidade limite global
    // Pode ser acessado externamente, mas preferível utilizar o método definirVelocidadeLimite
    public static void setVelocidadeLimite(int velocidadeLimite) {
        CarroMethodStatic.velocidadeLimite = velocidadeLimite;
    }

    // Método público para definir a velocidade limite com verificações
    public static void definirVelocidadeLimite(int novaVelocidadeLimite) {
        setVelocidadeLimite(novaVelocidadeLimite);
    }
}
