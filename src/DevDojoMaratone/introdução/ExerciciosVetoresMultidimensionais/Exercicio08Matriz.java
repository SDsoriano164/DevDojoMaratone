package DevDojoMaratone.introdução.ExerciciosVetoresMultidimensionais;

import java.util.Scanner;

public class Exercicio08Matriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String [][][] compromissos = new String[12][31][24];

        boolean sair = false;
        byte opcao;


        while (!sair) {
            System.out.println(" Agenda de compromissos ");
            System.out.println(" [ 1 ] Agendar Compromissos ");
            System.out.println(" [ 2 ] Ver Compromisso ");
            System.out.println(" [ 0 ] Sair ");
            System.out.println("-----------------------------");
            opcao = teclado.nextByte();
            if (opcao == 1) {
                // Condição para o mes
                boolean mesValido = false;
                byte mes = 0;
                while (!mesValido){
                    System.out.println("Digite o mes");
                    mes = teclado.nextByte();
                    if (mes >= 1 && mes <=12) {
                        mesValido = true;
                    }else{
                        System.out.println("Opção invalida, digite novamente :");
                    }
                }


                // Condição para o dia
                boolean diaValido = false;
                byte dia = 0;
                while (!diaValido) {
                    System.out.println("Digite o dia : ");
                    dia = teclado.nextByte();
                    if (dia >= 1 && dia <=31) {
                        diaValido = true;
                    }else{
                        System.out.println("Opção Invalida, digite novamente : ");
                    }
                }
                // Condição para a hora
                boolean horaValida = false;
                byte hora = 0;
                while (!horaValida) {
                    System.out.println("Digite a hora :");
                    hora = teclado.nextByte();
                    if (hora >=0 && hora <=24) {
                        horaValida=true;

                    }else{
                        System.out.println("Opção inválida, digite novamente");
                    }
                }
                System.out.println("Qual o compromisso ?");
                compromissos[mes-1][dia-1][hora] = teclado.next();

            }else if (opcao == 2) {
                // Condição para o mes
                boolean mesValido = false;
                byte mes = 0;
                while (!mesValido){
                    System.out.println("Digite o mes");
                    mes = teclado.nextByte();
                    if (mes >= 1 && mes <=12) {
                        mesValido = true;
                    }else{
                        System.out.println("Opção invalida, digite novamente :");
                    }
                }
                boolean diaValido = false;
                byte dia = 0;
                while (!diaValido) {
                    System.out.println("Digite o dia : ");
                    dia = teclado.nextByte();
                    if (dia >= 1 && dia <=31) {
                        diaValido = true;
                    }else{
                        System.out.println("Opção Invalida, digite novamente : ");
                    }
                }

                boolean horaValida = false;
                byte hora = 0;
                while (!horaValida) {
                    System.out.println("Digite a hora :");
                    hora = teclado.nextByte();
                    // 7am          // 18 pm
                    if (hora >=7  && hora <=18) {
                        horaValida=true;

                    }else{
                        System.out.println("Opção inválida, digite novamente");
                    }
                }

                System.out.println("Compromisso : " +compromissos[mes-1][dia-1][hora]);

            }else if (opcao == 0){
                sair = true;
            }



        }
    }
}
