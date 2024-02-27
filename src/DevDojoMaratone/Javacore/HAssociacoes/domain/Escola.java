package DevDojoMaratone.Javacore.HAssociacoes.domain;

// Classe que representa uma Escola com associação unidirecional de um-para-muitos com Professores
public class Escola {

    // Atributos da classe
    private String nomeEscola;         // Nome da escola
    private Professor[] professores;   // Array de professores associados à escola

    // Construtor com um parâmetro para o nome da escola
    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    // Construtor com dois parâmetros para o nome da escola e um array de professores
    public Escola(String nomeEscola, Professor[] professores) {
        this.nomeEscola = nomeEscola;
        this.professores = professores;
    }

    // Método para imprimir informações sobre a escola e seus professores
    public void imprime() {
        System.out.println(this.nomeEscola);

        // Verifica se há professores associados à escola
        if (professores == null) return;

        // Itera sobre os professores e imprime seus nomes
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }
    }

}
