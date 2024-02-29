package DevDojoMaratone.Javacore.HAssociacoes.Exercicio.TesteExercicio;

import DevDojoMaratone.Javacore.HAssociacoes.Exercicio.Estudante;
import DevDojoMaratone.Javacore.HAssociacoes.Exercicio.Local;
import DevDojoMaratone.Javacore.HAssociacoes.Exercicio.Professor;
import DevDojoMaratone.Javacore.HAssociacoes.Exercicio.Seminario;

public class CadastroTeste01 {
    public static void main(String[] args) {
        Local local = new Local(" Konoha ");
        Estudante estudante = new Estudante("naruto", 23);
        Professor professor = new Professor("Jiraya Sensei","Rasengan");

        Estudante [] estudantesSeminario = {estudante};

        Seminario seminario = new Seminario("Como fazer o rasenShuriken ? ",estudantesSeminario,local);
        Seminario [] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);


        professor.imprime();

    }
}
