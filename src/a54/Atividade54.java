package a54;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
Apresente uma tabela de conversão de reais em dólares. Ela deve ser totalmente
configurável, ou seja, o usuário pode informar o valor inicial e final, o valor de incremento e o
valor de 1 dólar. Apresente os números no formato monetário com duas casas decimais.
*/

public class Atividade54 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o valor inicial em reais: ");
        double initialValue = s.nextDouble();

        System.out.print("Informe o valor final em reais: ");
        double finalValue = s.nextDouble();

        System.out.print("Informe o valor de incremento em reais: ");
        double increment = s.nextDouble();

        System.out.print("Informe a cotação do dólar: ");
        double dollarValue = s.nextDouble();

        s.close();

        if (initialValue < 0 || finalValue < 0 || increment < 0 || dollarValue < 0) {
            System.out.println("Nenhum valor pode ser negativo.");
            return;
        }

        showTable(initialValue, finalValue, increment, dollarValue);
    }

    private static void showTable(double initialValue, double finalValue, double increment, double dollarValue) {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));

        System.out.println("Tabela de Conversão: Reais -> Dólares");
        System.out.println("-------------------------------------");
        System.out.printf("%-15s %-15s%n", "Reais", "Dólares");
        System.out.println("-------------------------------------");

        for (double value = initialValue; value <= finalValue; value += increment) {
            double convertedValue = value / dollarValue;
            System.out.printf("%-15s %-15s%n",
                    formatoMoeda.format(value),
                    formatoMoeda.format(convertedValue));
        }
    }
}
