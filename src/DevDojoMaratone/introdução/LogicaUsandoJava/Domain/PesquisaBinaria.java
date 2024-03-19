package DevDojoMaratone.introdução.LogicaUsandoJava.Domain;

public class PesquisaBinaria {

    public int pesquisaBinaria(int[] lista, int item){
        int chute = 0;
        int meio = 0;
        int baixo = 0;
        int alto = lista.length-1;
        while (baixo <= alto){
             meio = (baixo + alto) / 2;
             chute =lista[meio];
             if(chute ==item){
                 return meio;
             }

             if(chute > item){
                 alto = meio -1;
             }else{
                 baixo= meio + 1;
             }

        }
        return -1;
    }
    public static void testarResultado(int resultado,int esperado){
        if (resultado == esperado) {
            System.out.println("Teste passou. resultado : " + resultado);
        }else{
            System.out.println("teste falhou. esperado :" + esperado + ", resultado :" + resultado);
        }

    }

}
