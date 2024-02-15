package DevDojoMaratone.Javacore.Dconstrutores.dominio;

import org.w3c.dom.ls.LSOutput;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String estudio;
    private int ano;
    private int [] publicacoes;

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

    public Anime(String nome, String tipo, int episodios,String estudio, int ano,int[]publicacoes){
        this(nome, tipo, episodios, estudio, ano);
        this.publicacoes = publicacoes;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Estúdio: " + this.estudio);

        // Verifica se o ano é zero
        if (this.ano == 0) {
            System.out.println("Ano: Não definido");
            return;
        }

        // Verifica se publicacoes é nulo
        if (this.publicacoes == null) {
            return; // Se for nulo, retorna sem imprimir
        }

        // Se não for nulo, imprime as publicações
        System.out.println("Ano de publicações");
        for (int publi : publicacoes) {
            System.out.print(publi + " / ");
        }
    }

}

