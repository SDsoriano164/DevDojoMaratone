package DevDojoMaratone.Javacore.Bintroducaometodos.dominio;

import DevDojoMaratone.Javacore.Aintroducaoclasses.domain.ContaCorrente;

public class ContaCorrenteTeste {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.agencia = 8317;
        conta.conta = 26097;
        conta.nome = "Pedro Soriano";
        conta.saldo = 312412;
        conta.saldoFuturo = 2134;

        conta.ImprimeContaPessoa();
        conta.valorFuturo();
    }
}
