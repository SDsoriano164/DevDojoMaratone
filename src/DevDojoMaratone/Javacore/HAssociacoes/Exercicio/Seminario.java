package DevDojoMaratone.Javacore.HAssociacoes.Exercicio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;

    private Local local;



    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }



    public Aluno[] getAlunos() {
        return alunos;
    }



    public Local getLocal() {
        return local;
    }


}



