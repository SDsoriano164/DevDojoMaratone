package DevDojoMaratone.Javacore.HAssociacoes.Exercicio;


public class ImprimeSeminario {

    public void imprime(Professor professor) {
        System.out.println("Professor : " + professor.getNome());
        Seminario[] seminarios = professor.getSeminarios();
        if (seminarios != null) {
            for (Seminario seminario : seminarios) {
                System.out.println("Título do Seminário: " + seminario.getTitulo());

                // Se quiser imprimir o local do seminário
                Local local = seminario.getLocal();
                if (local != null) {
                    System.out.println("Local do Seminário: " + local.getEndereço());
                }

                // Se quiser imprimir os alunos do seminário
                Aluno[] alunos = seminario.getAlunos();
                if (alunos != null) {
                    System.out.println("Alunos do Seminário:");
                    for (Aluno aluno : alunos) {
                        System.out.println("   - " + aluno.getNome());
                    }
                }
            }
        } else {
            System.out.println("Professor não está vinculado a nenhum seminário.");
        }
    }
}




