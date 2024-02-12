package DevDojoMaratone.Javacore.Aintroducaoclasses.domain;

public class PlacasDeVideo {
    public String modelo;
    public String marca;

    public int [] Valores;






    public void imprimePlacas(){
        System.out.println("Modelo : " + this.modelo);
        System.out.println("Marca  : " + this.marca);
        System.out.println("Variação de valores :");
        for (int valor : Valores){
            System.out.println(valor);
        }
        imprimeMaiorValor();
    }

    public  void imprimeMaiorValor (){
        int maiorValor = 0;
        for (int i = 0; i < Valores.length; i++) {
            if (Valores[i] > maiorValor){
                maiorValor = Valores[i];
            }
        }
        System.out.println(" Maior valor "+ maiorValor);

    }

}
