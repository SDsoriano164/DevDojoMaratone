package DevDojoMaratone.Javacore.HAssociacoes.teste;

import java.util.Scanner;

public class LeituraTecladoTeste01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("whats your name ? ");
        String next = input.nextLine();
        System.out.println("Whats your age ?");
        byte age = input.nextByte();
        System.out.println("Whats your sex ?");
        char sex = input.next().charAt(0);

        System.out.println("-----------------");
        System.out.println("name:"+ next);
        System.out.println("age :"+ age);
        System.out.println("sex :"+ sex);

    }
}
