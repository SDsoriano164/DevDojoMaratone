package DevDojoMaratone.Javacore.Aintroducaoclasses.ExerciciosDomain;

import DevDojoMaratone.Javacore.Aintroducaoclasses.domain.Funcionarios;



public class FuncionariosTeste01 {
    public static void main(String[] args) {
        Funcionarios funcionarios1 = new Funcionarios();
        Funcionarios funcionarios2 = new Funcionarios();
        Funcionarios funcionarios3 = new Funcionarios();


        // funcionario 1
        funcionarios1.nome = "Pedro Soriano";
        funcionarios1.idade = 24;
        funcionarios1.salario = new double[]{7000,1000,33};
        // funcionario 2
        funcionarios2.nome = "Caroline Soriano";
        funcionarios2.idade = 24;
        funcionarios2.salario = new double[]{9000,2231,545};

        // funcionario 3
        funcionarios3.nome = "Eduardo Soriano";
        funcionarios3.idade = 24;

        funcionarios3.salario = new double[]{1500,1412,3455};

        funcionarios1.imprime();
        funcionarios2.imprime();
        funcionarios3.imprime();
        funcionarios1.imprimeMedia();
        funcionarios2.imprimeMedia();
        funcionarios3.imprimeMedia();


    }

}
