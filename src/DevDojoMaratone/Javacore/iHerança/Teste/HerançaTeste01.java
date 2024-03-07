package DevDojoMaratone.Javacore.iHerança.Teste;

import DevDojoMaratone.Javacore.iHerança.Dominio.Endereco;
import DevDojoMaratone.Javacore.iHerança.Dominio.Funcionario;
import DevDojoMaratone.Javacore.iHerança.Dominio.Pessoa;

public class HerançaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("312312");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa shimazu");
        pessoa.setCpf("323231313");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Jiraya Sensei");
        funcionario.setCpf("4445552222");
        funcionario.setEndereco(endereco);



        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("---------------------");
        System.out.println("Funcinario");
        funcionario.imprime();

    }

}
