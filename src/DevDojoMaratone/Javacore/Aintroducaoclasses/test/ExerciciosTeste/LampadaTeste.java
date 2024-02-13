package DevDojoMaratone.Javacore.Aintroducaoclasses.test.ExerciciosTeste;

import DevDojoMaratone.Javacore.Aintroducaoclasses.ExerciciosDomain.Lampada;

public class LampadaTeste {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.marca = " TP - Link tapo";
        lampada.potência = 9;
        lampada.potênciaIndandesenteEquivalente = 60;
        lampada.CorClara = "R G B";
        lampada.tensão = 240;

        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajour";
        lampada.tipos[1] = "Lampeões";
        lampada.tipos[2] = "Luminarias";




        System.out.println("Marca : " + lampada.marca);
        System.out.println("Potência : " + lampada.potência);
        System.out.println("Potência Incandesente Equivalente :" + lampada.potênciaIndandesenteEquivalente);
        System.out.println("Cor Clara : " + lampada.CorClara);
        System.out.println("Tensão :" + lampada.tensão);



        lampada.setligar();
        lampada.getLigada();
        lampada.setDesligar();
        lampada.getLigada();








        lampada.Sobre();
        System.out.println();





    }
}
