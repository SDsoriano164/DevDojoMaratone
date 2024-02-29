package DevDojoMaratone.Javacore.HAssociacoes.Exercicio;

public class Professor {
    private String nome;
    private String especialidade;

    private Seminario [] seminarios;



    public Professor(String nome, String especialidade) {
        this.nome = nome;

    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }
    public void imprime(){
        System.out.println("Professor :" + this.nome);
        if (seminarios == null) return;
        System.out.println("=======#Seminarios cadastrados#========");
        System.out.println();
        for (Seminario seminario : this.seminarios) {
            System.out.println(" Titulo seminário :" +seminario.getTitulo());
            System.out.println("Local seminário   :" + seminario.getLocal().getEndereço());
            System.out.println();
            System.out.println("--Alunos--");
            if (seminario.getEstudantes() == null) continue;
            for (Estudante estudante : seminario.getEstudantes()) {
                System.out.println("Aluno :"+ estudante.getNome() + "\n idade :" + estudante.getIdade());

            }

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
