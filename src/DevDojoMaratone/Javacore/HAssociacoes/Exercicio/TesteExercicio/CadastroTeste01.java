package DevDojoMaratone.Javacore.HAssociacoes.Exercicio.TesteExercicio;


import DevDojoMaratone.Javacore.HAssociacoes.Exercicio.*;

public class CadastroTeste01 {
    public static void main(String[] args) {

        Professor professor = new Professor("Kakashi Sensei");
        Aluno aluno = new Aluno("Uchiha Sasuke",23);
        Local local = new Local("Vila da Folha");




        // Array de objetos // Criado para associar alunos a classe Seminario ( construtor exige que seja adicionado um array de alunos);
        Aluno [] alunosSeminarios = {aluno};


        // Instancia classe Seminario
        Seminario seminario = new Seminario("Como fazer o chidori",alunosSeminarios,local);
        Seminario seminario1 = new Seminario("Como fazer o rasengan",alunosSeminarios,local);

        // Array de seminarios para associar ao professor
        Seminario [] seminariosDisponiveis = {seminario,seminario1};

        professor.setSeminarios(seminariosDisponiveis);


        ImprimeSeminario imprimir = new ImprimeSeminario();

        imprimir.imprime(professor);



    }
}
