package DevDojoMaratone.Javacore.Opolimorfismo.servicos;

import DevDojoMaratone.Javacore.Opolimorfismo.OrientadoaInterfaces.Repositorio;

public class MemoryRepository implements Repositorio {
    @Override
    public void save() {
        System.out.println("Savin in Memory Repository");
    }
}
