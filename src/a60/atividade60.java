package a60;

import java.util.Scanner;

/* Apresente uma tabela contendo a evolução do valor de uma dívida ao longo dos meses e anos a
partir de janeiro de 2007. */
public class atividade60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial da dívida: R$ ");
        double valorDivida = scanner.nextDouble();

        System.out.print("Digite a taxa de correção mensal (em %): ");
        double taxaCorrecao = scanner.nextDouble() / 100;

        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();

        System.out.println("\nEvolução da Dívida:");
        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                "Ano", "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez");

        for (int ano = 2007; ano < 2007 + anos; ano++) {
            System.out.printf("%-5d", ano);
            for (int mes = 1; mes <= 12; mes++) {
                System.out.printf(" %-10.2f", valorDivida);
                valorDivida += valorDivida * taxaCorrecao;
            }
            System.out.println();
        }

        scanner.close();
    }
}
