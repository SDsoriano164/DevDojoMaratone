package DevDojoMaratone.Javacore.Dconstrutores.teste;

import DevDojoMaratone.Javacore.Dconstrutores.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Caroline Soriano",23,'F');
        Pessoa pessoa2 = new Pessoa ("Pedro Soriano",23,'M');
        pessoa1.setAnoNascimento(2000);

        pessoa2.setAnoNascimento(1999);
        pessoa2.init(180,70,"Espirita");
        pessoa1.init(175,57,"Espirita");
        pessoa1.imprimePessoas();
        pessoa2.imprimePessoas();




    }
}
