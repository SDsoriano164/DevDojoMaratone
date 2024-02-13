package DevDojoMaratone.Javacore.Aintroducaoclasses.test;

import DevDojoMaratone.Javacore.Aintroducaoclasses.domain.Funcionarios;



public class FuncionariosTeste01 {
    public static void main(String[] args) {
        Funcionarios funcionarios1 = new Funcionarios();
        Funcionarios funcionarios2 = new Funcionarios();
        Funcionarios funcionarios3 = new Funcionarios();

        //modificando media

        //funcionarios1.setMedia(2000);


        // funcionario 1
        funcionarios1.setNome("Pedro Soriano");
        funcionarios1.setIdade(24);
        funcionarios1.setSalario(new double[] {3124,3123,4142});

        //funcionarios1.salario = new double[]{7000,1000,33};

        // funcionario 2
        funcionarios2.setNome("Caroline Soriano");
        funcionarios2.setIdade(23);
        funcionarios2.setSalario(new double[]{9000,2231,545});

        // funcionario 3

        funcionarios3.setNome("Eduardo Soriano");
        funcionarios3.setIdade(24);
        funcionarios3.setSalario(new double[]{1500,1412,3455});

        funcionarios1.imprime();
        funcionarios2.imprime();
        funcionarios3.imprime();


        System.out.println("Media alterada ");

        System.out.println(funcionarios1.getMedia());



    }

}
