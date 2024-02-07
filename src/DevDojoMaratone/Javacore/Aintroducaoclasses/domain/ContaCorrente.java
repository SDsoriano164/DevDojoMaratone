package DevDojoMaratone.Javacore.Aintroducaoclasses.domain;

public class ContaCorrente {
    //atributos da classe
   public int conta;
   public int agencia;
   public double saldo;

   public  String nome;

   public int saldoFuturo;


   public void ImprimeContaPessoa (){
       System.out.println(this.conta);
       System.out.println(this.nome);
       System.out.println(this.agencia);
       System.out.println(this.saldo);

   }
   public void valorFuturo(){

       System.out.println(saldo + saldoFuturo);

   }

}
