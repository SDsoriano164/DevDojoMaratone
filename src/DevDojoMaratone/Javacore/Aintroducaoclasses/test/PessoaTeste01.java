package DevDojoMaratone.Javacore.Aintroducaoclasses.test;

import DevDojoMaratone.Javacore.Aintroducaoclasses.domain.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {


        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        // não tem como atribuir valores do objeto pois o acesso está privado
        // pessoa.nome = "Kurosaki";
       // pessoa.idade = 14;

        // pode atribuir valores ao objeto utilizando os metodos
        // metodo setNome();
        pessoa.setNome("Kurosaki");
        pessoa.setIdade(14);
        pessoa2.setNome("Jin woo");
        pessoa2.setIdade(24);




        // Chamada para o metodo imprime();
        pessoa.imprime();


        // chamada para o metodo getNome e adicionando valor em uma variavel
        String estudante = pessoa.getNome();

        // mostrando valor atribuido a variavel estudante
        System.out.println(estudante);


        // mostrando o metodo de retorno direto
        System.out.println(pessoa.getNome());
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa2.getIdade());




    }
}
