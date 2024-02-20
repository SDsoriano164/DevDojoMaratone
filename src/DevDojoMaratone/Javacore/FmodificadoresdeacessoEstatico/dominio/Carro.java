package DevDojoMaratone.Javacore.FmodificadoresdeacessoEstatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;

    public static double velocidadeLimite = 250;

    /**
     Quando usammos a keyword static, estamos informando que essa variavel de classe é pertencente da classe em si
     Ele não faz mais parte do objeto quando é instanciado, mas si a propria classe, então todos os objetos em existencia
     tem a mesma informação como padrão.
     */

    public Carro (String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima  = velocidadeMaxima;


    }
    public void imprime(){
        System.out.println("Nome :" + this.nome);
        System.out.println("Velocidade Maxima : " + this.velocidadeMaxima);


        System.out.println("Velocidade limite : " + Carro.velocidadeLimite);
        System.out.println("------------------------------");
         /*
        Utilizar o this para se referenciar ao atributo velocidadeMaxima está um pouco incorreto, ela vai funcionar normal
        porem você  acessa o metadado porque você está dentro da classe, mas pode confudir, o certo é chamar
        a propria classe para indicar o valor alterado
        o this sempre vai estar se referenciando a instância do objeto,
         */

    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }
}
