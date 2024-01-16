package DevDojoMaratone.introdução;

public class ArrayMultidimensionaisExemplo1 {
    public static void main(String[] args) {
        int [][] Arrayint = new int[3][]; // se for inicializado vai retornar null excepetion ou sejam sem valores referenciados na posição de um array

        // Inicializações
        //  Criando um array de 3 linhas

        Arrayint [0] = new int[2]; // na posição 0 crie um array e duas posiçoes
        Arrayint [1] = new int [3]; // na posição 1 crie um array de 3 posições
        Arrayint [2] = new int[6]; // na posição 2 crie um array de 6 posiçoes

        for (int[] Arraybase : Arrayint) {
            System.out.println("\n  -------");
            for (int num :Arraybase){
                System.out.print(num + " / ");
            }

        }
    }
}
