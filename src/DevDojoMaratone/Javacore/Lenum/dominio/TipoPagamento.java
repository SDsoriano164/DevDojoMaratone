package DevDojoMaratone.Javacore.Lenum.dominio;

public enum TipoPagamento {

    // tem que ser dentro do corpo os metodos
    DEBITO{

        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor* 0.05;
        }
    };



    // comportamento é definido pela as enumerações
    public abstract double calcularDesconto(double valor);



}
