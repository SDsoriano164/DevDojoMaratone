package DevDojoMaratone.introdução.ExerciciosVetoresUnidimensionais;

import java.util.Scanner;

public class Remember {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[][] compromissos = new String[31][24];
        boolean sair = false;
        int opcao;


        while (!sair) {

            System.out.println(" Agenda mensal ");
            System.out.println(" [1] Agendar Compromisso ");
            System.out.println(" [2] Visualizar Compromisso ");
            System.out.println(" [0] Sair ");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Digite o dia ");
                    dia = teclado.nextInt();
                    if (dia >= 1 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Opção inválida, digite novamente :");
                    }
                } // fora do while
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.println("Digite as horas :");
                    hora = teclado.nextInt();
                    if (hora > 0 && hora < 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Opção inválida : ");
                    }
                } // fora do while

                System.out.println("Qual o compromisso ?");
                compromissos[dia - 1][hora] = teclado.next();


            } else if (opcao == 2) {
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Digite o dia ");
                    dia = teclado.nextInt();
                    if (dia >= 1 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Opção inválida, digite novamente :");
                    }
                } // fora do while
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.println("Digite as horas :");
                    hora = teclado.nextInt();
                    if (hora > 0 && hora < 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Opção inválida : ");
                    }
                } // fora do while
                System.out.println("Compromisso : " + compromissos[dia - 1][hora]);


            } else if (opcao == 0) {
                sair = true;

            }
        }

    }
}
