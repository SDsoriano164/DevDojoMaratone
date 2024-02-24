package DevDojoMaratone.Javacore.Eblocosdeinicializacao.teste;

import DevDojoMaratone.Javacore.Eblocosdeinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {

        // criação de instância da clase

         // Utilizando construtor que não está mostrando os episodios do objeto
        Anime anime1 = new Anime("Solo leveling");

        // não executa episodios se método não for chamado // aperta alt enter pra iterar
        for (int episodio : anime1.getEpisodios()) {
            System.out.println("Episodio :" + episodio);

        }


        //

    }
}

