package DevDojoMaratone.Javacore.Dconstrutores.teste;

import DevDojoMaratone.Javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {

        int[] publicacoes = new int [] {20000,1999,499};
        // inicializando construtor
        Anime anime = new Anime("kokotaro","TV",23,"Prodution IG");
        Anime anime1 = new Anime("Kamisama","TV",21,"Nova era Studio");
        Anime anime2 = new Anime("Dragon ball z","TV",21,"XXXX",1999);
        Anime anime3 = new Anime("Solo leveling","TV",12,"Ghibi",2015,publicacoes);





        anime.imprime();
        anime1.imprime();
        anime2.imprime();
        anime3.imprime();


    }
}
