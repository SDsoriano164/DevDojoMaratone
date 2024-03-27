package DevDojoMaratone.Javacore.Ninterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemove {
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
}
