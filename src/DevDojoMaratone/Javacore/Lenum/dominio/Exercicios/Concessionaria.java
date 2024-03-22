package DevDojoMaratone.Javacore.Lenum.dominio.Exercicios;

import DevDojoMaratone.Javacore.Lenum.dominio.TipoCliente;
import DevDojoMaratone.Javacore.Lenum.dominio.TipoPagamento;

public class Concessionaria {
    private String tipoVeiculo;
    private String marca;


    private TipoCliente clienteComprador;
    private TipoPagamento tipoPagamento;

    public void imprimeVeiculo(){
        System.out.println("tipo de veiculo :" +this.tipoVeiculo);
        System.out.println("marca:" + this.marca);
        System.out.println("tipo de cliente :" + this.clienteComprador.nomeRelatorio);
        System.out.println("tipo de pagamento : " +this.tipoPagamento);



    }

    public Concessionaria(String tipoVeiculo, String marca, TipoCliente clienteComprador, TipoPagamento tipoPagamento) {
        this.tipoVeiculo = tipoVeiculo;
        this.marca = marca;
        this.clienteComprador = clienteComprador;
        this.tipoPagamento = tipoPagamento;
    }


}

