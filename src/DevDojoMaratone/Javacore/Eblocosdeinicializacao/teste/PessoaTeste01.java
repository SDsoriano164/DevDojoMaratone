package DevDojoMaratone.Javacore.Eblocosdeinicializacao.teste;

import DevDojoMaratone.Javacore.Eblocosdeinicializacao.dominio.Pessoa;

import java.util.Scanner;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas deseja cadastrar?");
        int quantidadePessoas = scanner.nextInt();

        Pessoa[] pessoas = new Pessoa[quantidadePessoas];

        for (int i = 0; i < quantidadePessoas; i++) {
            pessoas[i] = new Pessoa();
            pessoas[i].preencherDadosPessoa();
        }

        System.out.println("Pessoas cadastradas:");
        for (Pessoa pessoa : pessoas) {
            pessoa.imprimePessoas();
            System.out.println("-------------------------");
        }
    }
}
