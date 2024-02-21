package DevDojoMaratone.Javacore.FmodificadoresdeacessoEstatico.teste;

import DevDojoMaratone.Javacore.FmodificadoresdeacessoEstatico.dominio.Funcionarios;

public class FuncionariosTeste01 {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios("Pedro ", 24);
        Funcionarios funcionario1 = new Funcionarios("Caroline ", 23);

        // acessando e trocando funcionario

        funcionario.setNome("Sedro Poriano");



        // imprimindo funcionarios
       funcionario.imprimeFuncionarios();
       funcionario1.imprimeFuncionarios();


       // ele é definido uma vez e é independente da instancia do objeto para executar é criado para todos os objetos

        System.out.println("Imprimindo variavel com modificador static");
        System.out.println(Funcionarios.empresaAtual);
    }
}
