package DevDojoMaratone.Javacore.MClasesAbstratas.dominio.Exercicios;

import DevDojoMaratone.Javacore.MClasesAbstratas.dominio.Desenvolvedor;
import DevDojoMaratone.Javacore.MClasesAbstratas.dominio.Funcionario;
import DevDojoMaratone.Javacore.MClasesAbstratas.dominio.Gerente;

public class EmprestaTeste01 {
    public static void main(String[] args) {
        // Classe herdada de funcionario
        Gerente gerente = new Gerente("Pedro Soriano",100000);

        // classe herdada de funcionario
        Desenvolvedor desenvolvedor = new Desenvolvedor("Cleitin", 2000000);

        // criando array de objetos para receber o endereço das instâncias com os campos
        Funcionario funcionario [] = {gerente,desenvolvedor};

        // criando empresa com os funcionarios associado a empresa.
        Empresa empresa = new Empresa("AEC",funcionario);


        // imprimindo empresa
        System.out.println(empresa);
    }
}
