package a58;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Atividade58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite a data (DD/MM/YYYY): ");
        String dataString = sc.nextLine();

        System.out.println("Informe a quantidade de dias que deseja adicionar: ");
        int quantidadeDias = sc.nextInt();

        // Utilizado bloco TryCatch para caso tenha erro relacionado ao tipo de data captado, informar uma mensagem ao usuário
        try {
            // Converte a string de data para LocalDate
            LocalDate data = LocalDate.parse(dataString, formatter);

            // Adiciona a quantidade de dias utilizando o metodo plusDays, método exclusivo para manipulação de data
            LocalDate novaData = data.plusDays(quantidadeDias);

            System.out.println("Data final: " + novaData.format(formatter));
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida. Por favor, use o formato DD/MM/YYYY.");
        }

        sc.close();
    }
}
