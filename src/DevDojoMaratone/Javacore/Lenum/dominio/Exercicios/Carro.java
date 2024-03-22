package DevDojoMaratone.Javacore.Lenum.dominio.Exercicios;

import DevDojoMaratone.Javacore.Lenum.dominio.TipoCliente;
import DevDojoMaratone.Javacore.Lenum.dominio.TipoPagamento;

public class Carro extends Concessionaria {
    private String nome;
    private int valorCarro;

    private int valorFinal;
    private int potência;

    public Carro(String tipoVeiculo, String marca, TipoCliente clienteComprador, TipoPagamento tipoPagamento, String nome, int valorCarro, int potência) {
        super(tipoVeiculo, marca, clienteComprador, tipoPagamento);
        this.nome = nome;
        this.valorCarro = valorCarro;
        this.potência = potência;


    }

    @Override
    public void imprimeVeiculo() {
        super.imprimeVeiculo();
        int desconto =
        System.out.println("nome :" +this.nome);
        System.out.println("valor :" +this.valorCarro);
        System.out.println("potencia :" +this.potência+ " : CV de potência");
        System.out.println("valor com desconto : " + valorFinal);
    }



    public String getNome() {
        return nome;
    }

    public int getValorCarro() {
        return valorCarro;
    }

    public int getPotência() {
        return potência;
    }

}
