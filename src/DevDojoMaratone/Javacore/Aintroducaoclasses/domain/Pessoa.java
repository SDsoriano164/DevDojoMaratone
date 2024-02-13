package DevDojoMaratone.Javacore.Aintroducaoclasses.domain;

public class Pessoa {

    // acesso privado // não da pra atribuir elementos sem criar metodos
    private String nome;
    private int idade;


    // só quem tem acesso é quem está dentro do objeto
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);

    }

    // criando metodo para adicioanar valores

    // atribuir nome
    public void setNome (String nome){

        //variavel da classe vai receber valor do parametro definido no PessoaTeste01
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}



