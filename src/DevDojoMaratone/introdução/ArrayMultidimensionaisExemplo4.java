package DevDojoMaratone.introdução;

public class ArrayMultidimensionaisExemplo4 {
    public static void main(String[] args) {


        // Inicializações

        // criando array         //  [3][3]          [3][3]          [3][3]
        int [][] Arrayint = {       {4,1}   ,      {5,2,3,},      {51,10,8,1,6,}  }; // adicionando valores no array base
                                // posição 0     //posição 1     // posição 2

        for (int[] Arraybase : Arrayint) {
            System.out.println("\n  -------");
            for (int num :Arraybase){
                System.out.print(num + " / ");
            }

        }
    }
}
