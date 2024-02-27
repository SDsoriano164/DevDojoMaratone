package DevDojoMaratone.Javacore.HAssociacoes.teste;

import DevDojoMaratone.Javacore.HAssociacoes.domain.Escola;
import DevDojoMaratone.Javacore.HAssociacoes.domain.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");


        Professor [] professores = {professor1,professor2};


        Escola escola = new Escola("Konoha class",professores);

        escola.imprime();


    }


}
