package DevDojoMaratone.Javacore.MClasesAbstratas.teste;

import DevDojoMaratone.Javacore.MClasesAbstratas.dominio.Desenvolvedor;
import DevDojoMaratone.Javacore.MClasesAbstratas.dominio.Funcionario;
import DevDojoMaratone.Javacore.MClasesAbstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
       // Funcionario funcionario = new Funcionario("Zoro",2000);  não pode ser istânciado pois a classe funcionario é abstrato ( é só um template );

        Gerente gerente = new Gerente("Luffy",5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Myamoto",5000);


        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
