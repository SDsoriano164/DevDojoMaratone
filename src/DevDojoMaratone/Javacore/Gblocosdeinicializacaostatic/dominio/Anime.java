package DevDojoMaratone.Javacore.Gblocosdeinicializacaostatic.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;


    // bloco de inicialização estatico
    // carrega junto com a jvm, se tiver metodos inseridos vai ser executado junto
    // só consegue acessar membro estaticos não instancia da classe ( membros do objeto )
    // é executado apenas uma vez, ou quantas vezes você criar, porem você consegue utilizar para todos os objetos criados

     static  {
        System.out.println("bloco estatico 1");
        episodios = new int[10];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i + 1;
        }
        System.out.println("---------------");
    }
    // carregado junto com a jvm, executa quantas vezes for criado
    static {
        System.out.println("Bloco estatico 2");
        System.out.println("----------------");
    }
    {
        // executado sempre que uma instancia da classe é criada
        System.out.println("Bloco de inicialização não estatico");
    }


    // Construtor que aceita um parâmetro 'nome'
    public Anime(String nome) {
        this.nome = nome;
        System.out.println(this.nome);

    }

    // Construtor padrão (sem parâmetros)
    public Anime() {
        // Estamos iterando e mostrando na classe, e será mostrado no teste
        episodios = new int[10];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int eps : episodios){
            System.out.println("episodios : " + eps);
        }
        System.out.println("-------------");


    }

    public String getNome() {
        return nome;
    }

}
