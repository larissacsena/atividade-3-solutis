package a55.application;

import a55.services.CallCalculator;

import java.util.Scanner;

/*
A operadora de celular Vai-Vai possui um plano com o valor mensal de 50,00 que permite 100 minutos por mês para qualquer número. Além disso, ela oferece 50 minutos a mais
para ligações destinadas a um número da própria Vai-Vai. Ainda neste plano ela tem uma promoção onde cada minuto gasto para telefone fixo consome somente a metade. O valor do minuto excedente para outras operadoras é de 0.65, e para a própria Vai-Vai é 0.20.
Faça um programa que permita ao usuário entrar com o tipo de ligação (‘o’ = outras
operadoras, ‘v’ = a própria Vai-Vai, ou ‘f’ = telefone fixo) e a quantidade de minutos. A cada entrada, deve-se informar o quanto que ele tem de saldo e o valor a pagar. Faça isto
enquanto ele indicar que existem mais ligações a serem digitadas.
*/

public class Atividade55 {
    private static final double MONTHLY_FEE = 50.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CallCalculator calculator = new CallCalculator();

        do {
            char callType = getValidCallType(scanner);
            int minutes = getValidMinutes(scanner);
            calculator.processCall(callType, minutes);

            System.out.printf("Saldo -> Plano: %d minutos.\n", calculator.getRemainingMinutes());
            System.out.printf("Saldo -> Bonus (Vai Vai): %d minutos.\n", calculator.getRemainingVaiVaiMinutes());
            System.out.printf("Saldo -> TOTAL: %d minutos.\n", calculator.getTotalMinutes());
            System.out.printf("Custo excedente acumulado: R$ %.2f\n", calculator.getTotalOverageCost());

            System.out.print("Deseja adicionar mais uma ligação? (s/n): ");
        } while (scanner.next().toLowerCase().charAt(0) == 's');

        scanner.close();
        System.out.printf("Total a pagar: R$ %.2f\n", MONTHLY_FEE + calculator.getTotalOverageCost());
    }

    private static char getValidCallType(Scanner scanner) {
        char type;
        while (true) {
            System.out.print("Digite o tipo de ligação ('o' para outras operadoras, 'v' para Vai-Vai, 'f' para telefone fixo): ");
            type = scanner.next().toLowerCase().charAt(0);
            if (type == 'o' || type == 'v' || type == 'f') {
                break;
            } else {
                System.out.println("Tipo de ligação inválido. Tente novamente.");
            }
        }
        return type;
    }

    private static int getValidMinutes(Scanner scanner) {
        int minutes;
        while (true) {
            System.out.print("Digite a quantidade de minutos: ");
            if (scanner.hasNextInt()) {
                minutes = scanner.nextInt();
                if (minutes > 0) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Quantidade de minutos inválida. Tente novamente.");
        }
        return minutes;
    }

}
