package DevDojoMaratone.Javacore.iHerança.Teste;

import DevDojoMaratone.Javacore.iHerança.Dominio.Endereco;
import DevDojoMaratone.Javacore.iHerança.Dominio.Funcionario;
import DevDojoMaratone.Javacore.iHerança.Dominio.Pessoa;

public class HerançaTeste01 {
    public static void main(String[] args) {
        Endereco endereco  = new Endereco();
        endereco.setCepRua("58416-034");
        endereco.setNomerua("Dev Street");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Kilian mbape");
        pessoa.setCpf("708.341.344-22");

        pessoa.setEndereco(endereco);
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Neymar Jr");
        funcionario.setCpf("453.178.287-91");
        funcionario.setSalario(2312);
        funcionario.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("-----------------");
        System.out.println("=== funcionario ===");

        funcionario.imprime();
        funcionario.relatorioPagamento();

    }

}
