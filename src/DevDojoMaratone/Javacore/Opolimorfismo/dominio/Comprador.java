package DevDojoMaratone.Javacore.Opolimorfismo.dominio;

import DevDojoMaratone.Javacore.Lenum.dominio.TipoPagamento;

public class Comprador {
    private String nome;
    private int idade;

    public TipoPagamento tipoPagamento;

    public Produto produto;

    public Comprador(String nome, int idade, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.idade = idade;
        this.tipoPagamento = tipoPagamento;

    }

    public void imprime(){
        System.out.println("nome do comprador: " +this.nome);
        System.out.println("idade do comprador: " +this.idade);
        System.out.println("tipo de pagamento: " +this.tipoPagamento);
        System.out.println(" nome do produto: "+ this.produto.getNome());
        double valorPagoComImposto = this.produto.calcularImposto() + this.produto.getValor();
        System.out.println(" valor do produto: "+ valorPagoComImposto);


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
