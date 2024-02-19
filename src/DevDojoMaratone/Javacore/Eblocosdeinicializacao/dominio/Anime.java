package DevDojoMaratone.Javacore.Eblocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int [] episodios;







    public Anime(String nome){

        this.nome = nome;

    }

    public Anime (){
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


