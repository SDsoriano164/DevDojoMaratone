package DevDojoMaratone.Javacore.Eblocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int [] episodios;


    public Anime(String nome){
        this.nome = nome;
    }
    public Anime (){
        episodios = new int[100];

        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = 1 + i;

        }

        for (int ep : this.episodios){
            System.out.print(ep + " ");

        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }


    public int[] getEpisodios() {
        return episodios;
    }


}


