package DevDojoMaratone.Javacore.MClasesAbstratas.dominio;

public class Desenvolvedor extends Funcionario  {
    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }


    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.5;
    }

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);


    }
}
