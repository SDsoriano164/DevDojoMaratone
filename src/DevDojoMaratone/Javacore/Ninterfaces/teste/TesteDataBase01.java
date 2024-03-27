package DevDojoMaratone.Javacore.Ninterfaces.teste;

import DevDojoMaratone.Javacore.Ninterfaces.dominio.DataBaseLoader;
import DevDojoMaratone.Javacore.Ninterfaces.dominio.DataLoader;
import DevDojoMaratone.Javacore.Ninterfaces.dominio.FileLoader;

public class TesteDataBase01 {
    public static void main(String[] args) {
        // instânciando Classes
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        // chamada para  o metodo da interface implementada na classe
        fileLoader.load();
        dataBaseLoader.load();
        dataBaseLoader.remove();
        fileLoader.remove();

        // classes default definida na interface Dataloader // chamada para o metodo
        dataBaseLoader.checkingPermission();
        fileLoader.checkingPermission();
        dataBaseLoader.verivy();


        // acessando atributo da interface ( são constantes por padrão )
        dataBaseLoader.imprime();


        // lembre-se membro estaticos acessamos diretamente pela Classe e não pela referencia

        // metodo static dentro da classe DataBaseLoader
        DataBaseLoader.retriveMaxDataSize();

        //  metodo static dentro da interface dataLoader
        DataLoader.retriveMaxDataSize();

    }
}
