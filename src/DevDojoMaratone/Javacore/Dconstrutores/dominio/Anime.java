package DevDojoMaratone.Javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String estudio;
    private int ano;

    // Construtor básico
    public Anime(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    // Construtor com adição de 'estudio'
    public Anime(String nome, String tipo, int episodios, String estudio) {
        this(nome, tipo, episodios);
        this.estudio = estudio;
    }

    // Construtor com adição de 'ano'
    public Anime(String nome, String tipo, int episodios,String estudio, int ano) {
        this(nome, tipo, episodios,estudio);
        this.ano = ano;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Estúdio: " + this.estudio);
        System.out.println("Ano: " + this.ano);
    }
}
