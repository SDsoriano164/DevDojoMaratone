package DevDojoMaratone.introdução;

public class ArraysMultidimensionaispt02 {
    public static void main(String[] args) {
        int [][] Arrayint = new int[3][]; // se for inicializado vai retornar null excepetion ou sejam sem valores referenciados na posição de um array

        // Inicializações
        //  Criando um array de 3 linhas

        Arrayint [0] = new int[2]; // na posição 0 crie um array e duas posiçoes
        Arrayint [1] = new int [3]; // na posição 1 crie um array de 3 posições
        Arrayint [2] = new int[6]; // na posição 2 crie um array de 6 posiçoes

        // Pode ser criado adicinando valores
       Arrayint [0 ] = new int[]{1,2,4,5}; // index 0 // linha um do array com 4 valores  : 3 pos
        Arrayint [1] = new int[]{1,2,4,5}; // segunda linha do array com 4 valores : 3 pos
        Arrayint [2] = new int[]{1,2,4,5,6,7,21,213,21,54,61}; // 3 linha do array com 9 valores : 10 pos ,

        // Podem de criar um array e fazer referencia na posição desejada.
        int [ ] array = {10,5,3,2};
       Arrayint [2] = array;

        System.out.println("-----------------");
        // Podem ser inicializadas assim
        Arrayint [0] [0] = 9;
        Arrayint [1][1] = 4;
        Arrayint [2][2] = 5;


        for (int[] Arraybase : Arrayint) {
            System.out.println("\n  -------");
            for (int num :Arraybase){
                System.out.print(num + " / ");
            }
            
        }

    }
}
