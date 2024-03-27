package DevDojoMaratone.Javacore.MClasesAbstratas.dominio.Exercicios;

import DevDojoMaratone.Javacore.MClasesAbstratas.dominio.Funcionario;

import java.util.Arrays;

public  class Empresa extends Local {

    // classe principal

    private String nome;

    private Funcionario [] funcionarios; // Uma empresa tem varios funcionarios


    // construtor com array de funcionarios
    public Empresa(String nome, Funcionario[] funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    @Override
    public void imprime() {

    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", funcionarios=" + Arrays.toString(funcionarios) +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}
