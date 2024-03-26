package DevDojoMaratone.Javacore.MClasesAbstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();

    }



    // metodos abstratos servem para criar metodos que devem ser obrigatoriamente implementados em subclasses
    public abstract void calculaBonus();


}
