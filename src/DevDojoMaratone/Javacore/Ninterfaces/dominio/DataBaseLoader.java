package DevDojoMaratone.Javacore.Ninterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemove {

    public void imprime(){
        System.out.println(MAX_DATA_SIZE);

    }
    @Override
    public void load() {
        System.out.println("Loading DataBase data...");
    }

    @Override
    public void remove() {
        System.out.println("Removing DataBase data...");

    }

    @Override
    public void checkingPermission() {
        System.out.println("Checking permission ");
    }

    @Override
    public void verivy() {
        System.out.println("Verify files...");
    }

    // não conseguimos sobrecrever metodos estatico da interface, podemos usar o mesmo nome porém acessamos ele de forma diferente
    // PARA A CLASSE E PARA A INTERFACE
    public static void retriveMaxDataSize(){ // executado na classe
        System.out.println("Dentro da classe DataBaseLoader");
    }
}
