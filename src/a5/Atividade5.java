package a5;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        /* Calcule e exiba o valor final de uma dívida.
        Para isto pergunte ao usuário o valor inicial do débito,
        a quantidade de meses e os juros mensais. Use o calculo
        de juros simples. */

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Double initialDebit = null;
        Integer numberOfMonths = null;
        Double monthlyInterest = null;

        System.out.println("Calcule a sua dívida");


        while (initialDebit == null || numberOfMonths == null || monthlyInterest == null) {
            try {
                if (initialDebit == null) {
                    System.out.println("Qual é o valor inicial da sua dívida?");
                    initialDebit = sc.nextDouble();
                }

                if (numberOfMonths == null) {
                    System.out.println("Qual é o total de parcelas?");
                    numberOfMonths = sc.nextInt();
                }

                if (monthlyInterest == null) {
                    System.out.println("Qual o valor dos juros mensais?");
                    monthlyInterest = sc.nextDouble();
                }

            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite números válidos!");
                sc.next();  // Limpa a entrada inválida
            }
        }

        System.out.println(calculateDivide(initialDebit, numberOfMonths, monthlyInterest));

        sc.close();
    }

    public static Double calculateDivide(Double initialDebit, int numberOfMonths, Double monthlyInterest) {
        Double juros = (monthlyInterest / 100) * (initialDebit / numberOfMonths);
        Double result = juros * numberOfMonths + initialDebit;
        return result;
    }
}
