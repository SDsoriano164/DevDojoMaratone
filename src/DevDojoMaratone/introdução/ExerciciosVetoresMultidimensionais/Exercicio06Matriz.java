package DevDojoMaratone.introdução.ExerciciosVetoresMultidimensionais;
import java.util.Scanner;

public class Exercicio06Matriz {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[][] compromisso = new String[31][24];

        boolean sair = false;
        byte opcao;

        do {
            System.out.println("Digite [1] para adicionar compromisso");
            System.out.println("Digite [2] para consultar compromisso");
            System.out.println("Digite [0] para sair ");
            opcao = teclado.nextByte();

            switch (opcao) {
                case 1:
                    // adicionar compromisso
                    boolean diaValido = false;
                    int dia = 0;

                    // Validar o dia do mês
                    while (!diaValido) {
                        System.out.println("Entre com o dia do mês");
                        dia = teclado.nextInt();
                        if (dia > 0 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("Dia inválido, digite novamente.");
                        }
                    }

                    boolean horaValida = false;
                    int horario = 0;

                    // Validar o horário
                    while (!horaValida) {
                        System.out.println("Horário do compromisso: ");
                        horario = teclado.nextInt();
                        if (horario >= 0 && horario <= 23) {
                            horaValida = true;
                        } else {
                            System.out.println("Hora inválida, digite novamente.");
                        }
                    }

                    // Adicionar o compromisso à matriz
                    System.out.println("Digite o compromisso: ");
                    String descricaoCompromisso = teclado.next();
                    compromisso[dia - 1][horario] = descricaoCompromisso;
                    System.out.println("Compromisso adicionado com sucesso.");

                    break;
                case 2:
                    // verificar compromisso
                    System.out.println("Opção 2 escolhida.");
                    break;
                case 0:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, digite novamente.");
            }

        } while (!sair);
    }
}
