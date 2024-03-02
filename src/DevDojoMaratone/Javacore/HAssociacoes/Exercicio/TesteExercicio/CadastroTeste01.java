package DevDojoMaratone.Javacore.HAssociacoes.Exercicio.TesteExercicio;


import DevDojoMaratone.Javacore.HAssociacoes.Exercicio.*;

public class CadastroTeste01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Rock lee",23);
        Professor professor = new Professor("Mestre Guy");
        Local local = new Local("Vila da folha");

            // array de alunos associado ao seminario
        Aluno [] alunosSeminarios = {aluno};

                     // instancia da classe seminario
        Seminario seminario = new Seminario("Konoha Senpuu Tutorial",alunosSeminarios,local);

            // array de seminarios associado a professor
                                                // objetos armazenados no array de seminarios
        Seminario [] seminariosDisponiveis = {seminario};

            // conectando seminarios a classe professor
        professor.setSeminarios(seminariosDisponiveis);

        ImprimeSeminario imprimir = new ImprimeSeminario();
        imprimir.imprime(professor);






    }
}
