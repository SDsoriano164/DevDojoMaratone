package DevDojoMaratone.Javacore.HAssociacoes.teste;

import java.util.Scanner;

public class LeituraTecladoTeste02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Previsão do futuro");

        System.out.println("Digite a pergunta e eu responderei sim ou não ");

        String perg = input.nextLine();
        if (perg.charAt(0) == ' '){
            System.out.println("SIM");
        }else{
            System.out.println("Não");
        }
    }
}
