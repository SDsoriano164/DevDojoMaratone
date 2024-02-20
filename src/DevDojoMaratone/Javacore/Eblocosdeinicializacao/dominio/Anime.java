package DevDojoMaratone.Javacore.Eblocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int [] episodios;

    // Executa independente do construtor, sempre vai ser inicializado
    {
        episodios = new int[10];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;

        }
        System.out.println("---------------");
    }


    public Anime(String nome){

        this.nome = nome;
        System.out.println(this.nome);


    }

    public Anime (){

        // já estamos iterando e mostrando na classe e será mostrado no teste
        episodios = new int[10];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;

        }
        for (int ep :this.episodios){
            System.out.println("Episodio "+ep);
        }


    }


    public String getNome() {
        return nome;
    }


    public int[] getEpisodios() {
        return episodios;
    }


}


