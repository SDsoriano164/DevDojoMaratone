package DevDojoMaratone.Javacore.HAssociacoes.domain;

public class Anime {
    private String nome; // atributo da classe
    private int [] episodios; // atributo da classe ( Array de episodios )
    private Personagens[] personagens; // Array de objetos associadoo

    // metodo de imprimir
    public void imprime(){
        System.out.println("nome do anime :" +this.nome); // atributo da classe anime
        if (episodios == null){
            return;
        }
        // para iterar a lista de episodios
        System.out.println("Lista de episodios");
        for (int i = 0; i <episodios.length; i++) {
            episodios[i] += i + 1;
            System.out.print(" " + episodios[i]);
        }
        // para iterar arrays com as informações do objeto personagens

        for (Personagens protagonistas : personagens){
            System.out.println("\n nome : " +protagonistas.getNome());
            System.out.println(" idade :" +protagonistas.getIdade());
            System.out.println(" Especialidade : " +protagonistas.getEspecidalidade());
        }

    }

    // construtor para criar o objeto anime
    public Anime(String nome, int episodios[], Personagens[] personagens) {
        this.nome = nome;
        this.episodios = episodios;
        this.personagens = personagens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public Personagens[] getPersonagens() {
        return personagens;
    }

    // metodo para associar a classe personagens na classe anime
    public void setPersonagens(Personagens[] personagens) {
        this.personagens = personagens;
    }
}
