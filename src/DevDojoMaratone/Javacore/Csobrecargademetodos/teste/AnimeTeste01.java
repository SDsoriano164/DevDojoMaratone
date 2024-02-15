package DevDojoMaratone.Javacore.Csobrecargademetodos.teste;

import DevDojoMaratone.Javacore.Bintroducaometodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Kimetsu no yaba","TV",15,"Ação");

        anime.imprime();
    }
}
