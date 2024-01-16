package DevDojoMaratone.introdução;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        int [] [] dias = new int[3][3];
        dias [0] [0] = 18;
        dias [0] [1] = 24;
        dias [0] [2] = 31;


        dias [1] [0] = 28;
        dias [1] [1] = 31;
        dias [1] [2] = 31;

        dias [2] [0] = 31;
        dias [2] [1] = 11;
        dias [2] [2] = 31;


        for (int i = 0; i < dias.length; i++) { // pegando o array base
            for (int j = 0; j < dias[i].length ; j++) { // acessando o array nas posições
                System.out.println(dias[i][j]); // acessando a base e mostrando posicoes e mostrando na tela
                
            }

        }
        System.out.println("----------------------------------------");
        for (int [] ArrayBase:dias) {
            for (int num : ArrayBase) {
                System.out.println(num);

            }

        }
    }
}
