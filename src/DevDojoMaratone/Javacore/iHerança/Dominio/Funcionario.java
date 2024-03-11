package DevDojoMaratone.Javacore.iHerança.Dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public double getSalario() {
        return salario;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(" salario : " +this.salario);
    }
    public void relatorioPagamento(){
        System.out.println(" Eu " +
                " " + this.getNome() + " recebi o salario de " + this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
