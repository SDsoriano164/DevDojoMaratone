package DevDojoMaratone.Javacore.Eblocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int [] episodios;



    // bloco de inicialização sempre serão executados antes do construtor


    {

        // valor já está sendo inicializado independente do construtor
        // sempre sera executado
        episodios = new int[5];

        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = 1 + i;

        }


    }


    public Anime(String nome){
        this.nome = nome;
    }
    public Anime (){
        episodios = new int[10];


        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = 1 + i;

        }
        System.out.println("Primeiro");
        for (int ep : this.episodios){
            System.out.print(ep + " - ");

        }
        System.out.println("\nsegundo");
        for (int ep : this.episodios){
            System.out.print(ep + " - ");

        }
        System.out.println("\nterceiro");
        for (int ep : this.episodios){
            System.out.print(ep + " - ");

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


