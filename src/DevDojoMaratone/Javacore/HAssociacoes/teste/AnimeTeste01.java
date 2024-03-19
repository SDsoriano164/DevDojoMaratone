package DevDojoMaratone.Javacore.HAssociacoes.teste;

import DevDojoMaratone.Javacore.HAssociacoes.domain.Anime;
import DevDojoMaratone.Javacore.HAssociacoes.domain.Personagens;

public class AnimeTeste01 {
    public static void main(String[] args) {
        // Criando classe com menos campos de execução

        // objeto instânciado baseado no constructor
        Personagens personagens = new Personagens("Sasuke",15,"Chidori");

        // array de episodios criado para inicializar o objeto anime
        int episodiosAnime[] = new int[12];

        // array de objetos para inicializar o objeto anime
        Personagens [] personagensPrincipais = {personagens};

        // criando objeto anime passando os argumentos
        Anime anime = new Anime("Naruto",episodiosAnime,personagensPrincipais);

        // criando de fato o relacionamento , um anime tem muitos personagens.
        anime.setPersonagens(personagensPrincipais);

        anime.imprime();

    }
}
