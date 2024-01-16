package DevDojoMaratone.introdução;

public class ArrayMultidimensionaisExemplo2 {
    public static void main(String[] args) {
        int [][] Arrayint = new int[3][]; // se for inicializado vai retornar null excepetion ou sejam sem valores referenciados na posição de um array

        // Pode ser criado adicinando valores
        Arrayint [0 ] = new int[]{1,2,4,5}; // index 0 // linha um do array com 4 valores  : 3 pos
        Arrayint [1] = new int[]{1,2,4,5}; // segunda linha do array com 4 valores : 3 pos
        Arrayint [2] = new int[]{1,2,4,5,6,7,21,213,21,54,61}; // 3 linha do array com 9 valores : 10 pos ,
        
        for (int[] Arraybase : Arrayint) {
            System.out.println("\n  -------");
            for (int num :Arraybase){
                System.out.print(num + " / ");
            }

        }
    }
}
