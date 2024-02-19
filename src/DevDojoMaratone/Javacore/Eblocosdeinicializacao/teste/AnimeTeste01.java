package DevDojoMaratone.Javacore.Eblocosdeinicializacao.teste;

import DevDojoMaratone.Javacore.Eblocosdeinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Solo leveling");

        System.out.println(anime1.getNome());

        // Itera sobre cada episódio e imprime
        for (int eps : anime1.getEpisodios()) {
            System.out.println("Episódio: " + eps);
        }
    }
}
