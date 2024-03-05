package DevDojoMaratone.Javacore.HAssociacoes.Exercicio;


public class ImprimeSeminario {
    public void imprime(Professor professor) {
        System.out.println("Professor : " + professor.getNome());
        Seminario[] seminariosRef= professor.getSeminarios();
        /*
        não cria explicitamente um novo array, mas sim atribui à variável seminarios uma referência ao array retornado pelo método getSeminarios().
         */
        if (seminariosRef != null) {
            for (Seminario seminario : seminariosRef) {
                System.out.println("Título do Seminário: " + seminario.getTitulo());

                // Se quiser imprimir o local do seminário
                Local local = seminario.getLocal();
                if (local != null) {
                    System.out.println("Local do Seminário: " + local.getEndereco());
                }

                // Se quiser imprimir os alunos do seminário
                Aluno[] alunos = seminario.getAluno();
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




