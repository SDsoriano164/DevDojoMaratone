package DevDojoMaratone.Javacore.Opolimorfismo.servicos;

import DevDojoMaratone.Javacore.Opolimorfismo.OrientadoaInterfaces.Repositorio;

public class DataBaseRepository implements Repositorio {
    @Override
    public void save() {
        System.out.println("Saving in database repository");

    }
}
