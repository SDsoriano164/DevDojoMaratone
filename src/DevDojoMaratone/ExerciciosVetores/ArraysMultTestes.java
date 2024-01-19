package DevDojoMaratone.ExerciciosVetores;

public class ArraysMultTestes {
    public static void main(String[] args) {
            String [] [] nomes = new String[3][]; // 3 linhas // 4 colunas
                                                    // se as linhas e colunas forem maior que o preenchimentos do array vai retornar valores nulos
                                                    // se as linhas e colunas forem menor que o preenchimento do array, vai retornar erros de quantidade


            nomes [0] = new String[]{"Junior","Natalia"};
            nomes [1] = new String[]{"Amanda","david","diego"};
            nomes [2] = new String[]{"Pedro","Carol","Kamila","Ramon"};





        for (int i = 0; i < nomes.length ; i++) { // Array base ( de 0 ate o tamanho do comprimento do array que é 3)
            System.out.println("\n------");
            for (int j = 0; j < nomes[i].length; j++) { // pega o comprimento do array endereçado pelo arraybase
                System.out.println(nomes[i][j] + " ");
            }
        }


            }
        }




















