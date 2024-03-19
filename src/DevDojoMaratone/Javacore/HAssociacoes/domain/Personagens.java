package DevDojoMaratone.Javacore.HAssociacoes.domain;

public class Personagens {
    public Personagens(String nome, int idade, String especidalidade) {
        this.nome = nome;
        this.idade = idade;
        this.especidalidade = especidalidade;
    }

    private String nome;
    private int idade;
    private String especidalidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecidalidade() {
        return especidalidade;
    }

    public void setEspecidalidade(String especidalidade) {
        this.especidalidade = especidalidade;
    }
}
