package DevDojoMaratone.Javacore.KmodificadorFinal.dominio.Motos;

public class Honda  extends Moto{
    private int cilindrada;

    public Honda(String montadora, String nome, int cilindrada) { // criado construct na subclass,  criada também na superclass

        super(montadora, nome); // faz referência aos campos da superclass
        this.cilindrada = cilindrada; // campo da subclasse // classe especificada
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
