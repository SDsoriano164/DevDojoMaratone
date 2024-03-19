package DevDojoMaratone.introdução.LogicaUsandoJava.Teste;

import DevDojoMaratone.introdução.LogicaUsandoJava.Domain.PesquisaBinaria;

import static DevDojoMaratone.introdução.LogicaUsandoJava.Domain.PesquisaBinaria.testarResultado;

public class testepesquisabinaria {
    public static void main(String[] args) {
        PesquisaBinaria pesquisaBinaria = new PesquisaBinaria();
        int[] lista = {1, 3, 5, 7, 9};

        // Testando um item presente na lista
        testarResultado(pesquisaBinaria.pesquisaBinaria(lista, 3), 1);

        // Testando um item ausente na lista
        testarResultado(pesquisaBinaria.pesquisaBinaria(lista, 4), -1);

        // Testando um item no início da lista
        testarResultado(pesquisaBinaria.pesquisaBinaria(lista, 1), 0);

        // Testando um item no final da lista
        testarResultado(pesquisaBinaria.pesquisaBinaria(lista, 9), 4);

        // Testando um item em uma lista vazia
        int[] listaVazia = {};
        testarResultado(pesquisaBinaria.pesquisaBinaria(listaVazia, 10), -1);



    }
}
