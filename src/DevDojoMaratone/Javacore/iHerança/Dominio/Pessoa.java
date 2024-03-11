package DevDojoMaratone.Javacore.iHerança.Dominio;

public class Pessoa {

    protected String nome;
    protected String cpf;

    protected Endereco endereco;

    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa (String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println("rua : " + this.endereco.getNomerua() + "\n Cep :  " + this.endereco.getCepRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
