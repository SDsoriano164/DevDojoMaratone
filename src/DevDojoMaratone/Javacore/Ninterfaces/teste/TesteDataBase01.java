package DevDojoMaratone.Javacore.Ninterfaces.teste;

import DevDojoMaratone.Javacore.Ninterfaces.dominio.DataBaseLoader;
import DevDojoMaratone.Javacore.Ninterfaces.dominio.FileLoader;

public class TesteDataBase01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        fileLoader.load();
        dataBaseLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        // classe default definida na interface Dataloader
        dataBaseLoader.checkingPermission();
        fileLoader.checkingPermission();
    }
}
