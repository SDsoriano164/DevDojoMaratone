package DevDojoMaratone.Javacore.KmodificadorFinal.dominio.Motos;

public class ImprimeMotos {
    public void imprimeMethodSuperClass(Moto motosSC) {
        System.out.println("Membros da superClasse");
        System.out.println(" nome : " + motosSC.getNome());
        System.out.println("Comprador: " + motosSC.COMPRADOR);   // não precisa usar o getNome pois está com a string sobrescrita
        System.out.println("Montadora : " + motosSC.getMontadora());
    }
    public void imprimeMethodSubClass(Honda hondaSubC){
        System.out.println("----------------------");
        System.out.println("Membros da subclasse ");
        System.out.println("Nome :" + hondaSubC.getNome() );
        System.out.println("Comprador :" + hondaSubC.COMPRADOR );
        System.out.println(" Montadora :" + hondaSubC.getMontadora());
        System.out.println(" Cilindrada " + hondaSubC.getCilindrada());
    }

}
