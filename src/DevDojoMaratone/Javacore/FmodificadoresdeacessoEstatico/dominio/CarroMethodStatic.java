package DevDojoMaratone.Javacore.FmodificadoresdeacessoEstatico.dominio;

public class CarroMethodStatic {
    private String nome;
    private int velocidadeMax;
    private static int velocidadeLimite ;



    //Constructor
    public CarroMethodStatic(String nome, int velocidadeMax){
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime (){
        System.out.println("--------------------------");
        System.out.println(this.nome);
        System.out.println(this.velocidadeMax);
        System.out.println(Carro.velocidadeLimite);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public static int getVelocidadeLimite() {
        System.out.println(velocidadeLimite);
        return velocidadeLimite;
    }

    // para definir o valor do metodo estatic criado para a classe utiliza o nome da classe, pois é pertecentente a ela
    // só conseguimos acessar sem o static se tiver um objeto criado

    public  static void setVelocidadeLimite(int velocidadeLimite) {
        CarroMethodStatic.velocidadeLimite = velocidadeLimite;

    }
    public void setVeloicidadelimite2(int veloicidadelimite2){
        CarroMethodStatic.velocidadeLimite = veloicidadelimite2;
    }
    public int getVelocidadeLimite1() {
        System.out.println(velocidadeLimite);
        return velocidadeLimite;
    }
}


