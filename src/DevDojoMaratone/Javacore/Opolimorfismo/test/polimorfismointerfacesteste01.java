package DevDojoMaratone.Javacore.Opolimorfismo.test;

import DevDojoMaratone.Javacore.Opolimorfismo.OrientadoaInterfaces.Repositorio;
import DevDojoMaratone.Javacore.Opolimorfismo.servicos.ArchiveRepository;

public class polimorfismointerfacesteste01 {
    public static void main(String[] args) {
        Repositorio repository = new ArchiveRepository();
        repository.save();
    }
}
