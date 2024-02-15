package DevDojoMaratone.Javacore.Bintroducaometodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;

    private String generos;


    public void init (String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo =tipo;
        this.episodios = episodios;

    }

    // sobrecarga de metodo
    public void init (String nome, String tipo, int episodios, String generos){
        this.init(nome,tipo,episodios);
        this.generos = generos;

    }

    public void imprime (){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);


    }


}
