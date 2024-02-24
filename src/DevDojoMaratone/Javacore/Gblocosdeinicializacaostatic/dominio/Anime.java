package DevDojoMaratone.Javacore.Gblocosdeinicializacaostatic.dominio;// Nome do pacote e importações

// Definição da classe Anime
public class Anime {

    /*
            Sorry for the amount of comments, it's just for study, in my real projects I'll use the clean code.
     */



    /*
      // bloco de inicialização estatica só aceita atributos com o modificador estatico
    // não aceita atributos de instancia pois pertence a um objeto
    // ele é executade junto com a jvm
    // se tiver metodos dentro do bloco static ele é inicializado junto

     */

    // Atributos estáticos
    private static String nome;
    private static int[] episodios;

    // Bloco de inicialização estático 1
    static {
        // Mensagem indicando o início do bloco estático 1
        System.out.println("Bloco estático 1");

        // Inicializa os episódios chamando o método inicializaEpisodios
        inicializaEpisodios();

        // Chama o método imprime para mostrar os episódios
        imprime();
    }

    // Bloco de inicialização estático 2
    static {
        // Mensagem indicando o início do segundo bloco estático
        System.out.println("\nBloco estático 2");
    }

    // Bloco de inicialização de instância
    {
        // Mensagem indicando o início do bloco de inicialização de instância
        System.out.println("Bloco de inicialização de instância");
    }

    // Construtor da classe Anime
    public Anime(String nome) {
        // Define o nome da classe para o valor passado no construtor
        this.nome = nome;
    }

    // Método estático para inicializar os episódios
    private static void inicializaEpisodios() {
        // Inicializa o array de episódios com valores sequenciais
        episodios = new int[10];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    // Método estático para imprimir os episódios
    public static void imprime() {
        // Imprime os episódios
        for (int eps : episodios) {
            System.out.print(eps);
        }
        // Adiciona uma quebra de linha para melhorar a formatação
        System.out.println();
    }

    // Métodos de acesso para o nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        // Atualiza o nome usando o nome da classe
        Anime.nome = nome;
    }

    // Métodos estáticos para acessar e modificar os episódios
    public static void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }

    public static int[] getEpisodios() {
        return episodios;
    }
}
