package DevDojoMaratone.Javacore.Ninterfaces.dominio;

public class FileLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Loading File ...");
    }

    @Override
    public void remove() {
        System.out.println("Remove fileLoader data...");
    }

    @Override
    public void checkingPermission() {
        System.out.println("Cheking permission...");
    }
}
