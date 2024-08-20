package a58;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/*
    Leia uma data e uma quantidade de dias, em seguida exiba esta data somada pela
    quantidade de dias fornecida. Exemplo: 29/04/2007 + 3 = 02/05/2007.
*/

public class Atividade58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite a data (DD/MM/YYYY): ");
        String dataString = sc.nextLine();

        System.out.println("Informe a quantidade de dias que deseja adicionar: ");
        int quantidadeDias = sc.nextInt();

        try {
            LocalDate data = LocalDate.parse(dataString, formatter);

            LocalDate novaData = data.plusDays(quantidadeDias);

            System.out.println("Data final: " + novaData.format(formatter));
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida. Por favor, use o formato DD/MM/YYYY.");
        }
        sc.close();
    }
}
