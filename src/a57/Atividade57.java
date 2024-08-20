package a57;

/*
Exiba todas as datas de um calendário que estão entre duas datas informadas pelo usuário
(dia, mês e ano). Suponha que as duas datas informadas sejam válidas.
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Atividade57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Informe a primeira data (dd/MM/yyyy): ");
        String data1 = scanner.nextLine();
        LocalDate inicio = LocalDate.parse(data1, formatter);

        LocalDate fim;
        // Loop para garantir que a segunda data seja posterior à primeira
        while (true) {
            System.out.print("Informe a segunda data (dd/MM/yyyy): ");
            String data2 = scanner.nextLine();
            fim = LocalDate.parse(data2, formatter);

            if (!fim.isBefore(inicio)) {
                break;
            }

            System.out.println("A segunda data deve ser posterior à primeira data.");
        }

        LocalDate dataAtual = inicio;
        while (!dataAtual.isAfter(fim)) {
            System.out.println(dataAtual.format(formatter));
            dataAtual = dataAtual.plusDays(1);
        }
    }
}
