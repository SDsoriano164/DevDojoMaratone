package DevDojoMaratone.Javacore.Aintroducaoclasses.domain;

public class ContaCorrente {
    //atributos da classe
   public int conta;
   public int agencia;
   public double saldo;

   public  String nome;


   public void ImprimeContaPessoa (ContaCorrente contaPessoa){
       System.out.println(this.conta);
       System.out.println(this.nome);
       System.out.println(this.agencia);
       System.out.println(this.saldo);
   }





}
