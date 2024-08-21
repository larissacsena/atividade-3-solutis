package a5;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Calcule e exiba o valor final de uma dívida. Para isto pergunte ao usuário o valor inicial do débito,
a quantidade de meses e os juros mensais. Use o calculo de juros simples. */
public class Atividade5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double initialDebit = 0.0;
        int numberOfMonths = 0;
        double monthlyInterest = 0.0;

        System.out.println("**Calcule a sua dívida:**\n");

        while (true) {
            try {
                if (initialDebit <= 0) {
                    System.out.print("Qual é o valor inicial da sua dívida? ");
                    initialDebit = sc.nextDouble();
                    if (initialDebit <= 0) throw new InputMismatchException();
                }

                if (numberOfMonths <= 0) {
                    System.out.print("Qual é o total de parcelas? ");
                    numberOfMonths = sc.nextInt();
                    if (numberOfMonths <= 0) throw new InputMismatchException();
                }

                if (monthlyInterest <= 0) {
                    System.out.print("Qual o valor dos juros mensais (em %)? ");
                    monthlyInterest = sc.nextDouble();
                    if (monthlyInterest <= 0) throw new InputMismatchException();
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite números válidos e positivos!\n");
                sc.next();
            }
        }

        double totalDebt = calculateTotalDebt(initialDebit, numberOfMonths, monthlyInterest);
        double totalInterestPaid = calculateTotalInterestPaid(initialDebit, numberOfMonths, monthlyInterest);
        double monthlyPayment = calculateMonthlyPayment(totalDebt, numberOfMonths);

        displaySummary(initialDebit, numberOfMonths, monthlyInterest, totalDebt, totalInterestPaid, monthlyPayment);

        sc.close();
    }

    public static double calculateTotalDebt(double initialDebit, int numberOfMonths, double monthlyInterest) {
        double totalInterest = ((monthlyInterest / 100)) * (initialDebit / numberOfMonths);
        return initialDebit + (totalInterest * 5);
    }

    public static double calculateTotalInterestPaid(double initialDebit, int numberOfMonths, double monthlyInterest) {
        double totalInterest = ((monthlyInterest / 100)) * (initialDebit / numberOfMonths);
        return totalInterest * 5;
    }

    public static double calculateMonthlyPayment(double totalDebt, int numberOfMonths) {
        return totalDebt / numberOfMonths;
    }

    public static void displaySummary(double initialDebit, int numberOfMonths, double monthlyInterest,
                                      double totalDebt, double totalInterestPaid, double monthlyPayment) {
        System.out.println("\n**Resumo da Dívida:**");
        System.out.printf("Valor inicial da dívida: %.2f R$%n", initialDebit);
        System.out.printf("Total de parcelas: %d%n", numberOfMonths);
        System.out.printf("Juros mensais: %.2f%%%n", monthlyInterest);
        System.out.printf("Valor total da dívida: %.2f R$%n", totalDebt);
        System.out.printf("Total de juros pagos: %.2f R$%n", totalInterestPaid);
        System.out.printf("Valor de cada parcela: %.2f R$%n", monthlyPayment);
    }
}
