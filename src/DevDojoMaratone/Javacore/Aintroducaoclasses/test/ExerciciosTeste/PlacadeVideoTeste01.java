package DevDojoMaratone.Javacore.Aintroducaoclasses.test.ExerciciosTeste;

import DevDojoMaratone.Javacore.Aintroducaoclasses.domain.PlacasDeVideo;

public class PlacadeVideoTeste01 {
    public static void main(String... args) {
        PlacasDeVideo placasDeVideo = new PlacasDeVideo();
        PlacasDeVideo placasDeVideo1 = new PlacasDeVideo();

        placasDeVideo.marca = "Nvidia";
        placasDeVideo.modelo = "RTX 4060";
        placasDeVideo.Valores = new int[] {1979,1399,2539};

        placasDeVideo1.marca = "AMD";
        placasDeVideo1.modelo = "RX 6600";
        placasDeVideo1.Valores = new int[] {2000,1432,1203};


        placasDeVideo.imprimePlacas();
        System.out.println("---------");
        placasDeVideo1.imprimePlacas();

    }
}
