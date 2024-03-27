package DevDojoMaratone.Javacore.Ninterfaces.dominio;

public interface DataLoader {
    public  static final int MAX_DATA_SIZE = 10; //TODO ATRIBUTO EM INTERFACE SAO CONSTANTES.
    public abstract void load();
    public default void checkingPermission(){ // Criando metodo para ser implementado na classe.
    }
    default  void verivy (){
    }
    public static void retriveMaxDataSize(){
        System.out.println("Dentro da interface DataLoader");
    }

}
