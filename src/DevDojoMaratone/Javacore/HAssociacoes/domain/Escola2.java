package DevDojoMaratone.Javacore.HAssociacoes.domain;

public class Escola2 {
    private String nomeEscola;
    private Professor2[] professores;

    // Construtor que recebe o nome da escola e uma lista variável de nomes de professores
    public Escola2(String nomeEscola, String... nomesProfessores) {
        this.nomeEscola = nomeEscola;
        this.professores = new Professor2[nomesProfessores.length];

        // Loop para criar instâncias de Professor2 com base nos nomes fornecidos
        for (int i = 0; i < nomesProfessores.length; i++) {
            this.professores[i] = new Professor2(nomesProfessores[i]);
        }
    }

    // Método para imprimir o nome da escola e os nomes dos professores associados
    public void imprime() {
        System.out.println(this.nomeEscola);

        // Verifica se há professores associados à escola
        if (professores == null) return;

        // Loop para imprimir os nomes dos professores usando o método getNomeProfessor()
        for (Professor2 professor : professores) {
            System.out.println(professor.getNomeProfessor());
        }
    }

    // Getter para obter o nome da escola
    public String getNomeEscola() {
        return nomeEscola;
    }

    // Setter para definir o nome da escola
    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    // Getter para obter o array de professores
    public Professor2[] getProfessores() {
        return professores;
    }

    // Setter para definir o array de professores
    public void setProfessores(Professor2[] professores) {
        this.professores = professores;
    }
}
