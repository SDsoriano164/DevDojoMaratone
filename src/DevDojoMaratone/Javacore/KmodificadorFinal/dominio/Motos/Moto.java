package DevDojoMaratone.Javacore.KmodificadorFinal.dominio.Motos;

import DevDojoMaratone.Javacore.KmodificadorFinal.dominio.Comprador;

public class Moto {
    private String Montadora;
    private String nome;

    public final Comprador COMPRADOR = new Comprador();

    public Moto(String montadora, String nome) {
        Montadora = montadora;
        this.nome = nome;
    }

    public String getMontadora() {
        return Montadora;
    }

    public void setMontadora(String montadora) {
        Montadora = montadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}