package DevDojoMaratone.Javacore.FmodificadoresdeacessoEstatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;

    private double velocidadeLimite = 250;

    public Carro (String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima  = velocidadeMaxima;


    }
    public void imprime(){
        System.out.println("Nome :" + this.nome);
        System.out.println("Velocidade Maxima : " + this.velocidadeMaxima);
        System.out.println("Velocidade limite : " + this.velocidadeLimite);
        System.out.println("------------------------------");

    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }
}
