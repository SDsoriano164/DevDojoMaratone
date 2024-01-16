package DevDojoMaratone.introdução;

public class ArrayMultidimensionaisExemplo3 {
    public static void main(String[] args) {
        int [][] Arrayint = new int[3][]; // se for inicializado vai retornar null excepetion ou sejam sem valores referenciados na posição de um array
                                            // se mudarmos o valor para 4 ele também vai retornar 4 pois não foi inicializado nenhum valor no array base ( linhas )

        // criando arrays informando valores
        int [] array0 = {10,5,3,2};
        int [] array1 = {2,3,5,6};
        int [] array2 = {13,5241,323,211};
        Arrayint [0] = array0;
        Arrayint [1] = array1;
        Arrayint [2] = array2;
        
        for (int[] Arraybase : Arrayint) {
            System.out.println("\n  -------");
            for (int num :Arraybase){
                System.out.print(num + " / ");
            }

        }
    }
}
