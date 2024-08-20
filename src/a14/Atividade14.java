package a14;

import java.util.Scanner;

/*
Receba do usuário o nome de um mês. Exiba o número equivalente.
Obs.: para comparar Strings em Java deve-se usar o método equals ou equalsIgnoreCase,
mas nunca o operador “==”. Por exemplo, para comparar a variável nome com “Maria”
deve-se usar: if(nome.equals(“Maria”) ...
*/

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do mês: ");
        String mes = scanner.nextLine();

        int numeroMes;

        if (mes.equalsIgnoreCase("Janeiro")) {
            numeroMes = 1;
        } else if (mes.equalsIgnoreCase("Fevereiro")) {
            numeroMes = 2;
        } else if (mes.equalsIgnoreCase("Março")) {
            numeroMes = 3;
        } else if (mes.equalsIgnoreCase("Abril")) {
            numeroMes = 4;
        } else if (mes.equalsIgnoreCase("Maio")) {
            numeroMes = 5;
        } else if (mes.equalsIgnoreCase("Junho")) {
            numeroMes = 6;
        } else if (mes.equalsIgnoreCase("Julho")) {
            numeroMes = 7;
        } else if (mes.equalsIgnoreCase("Agosto")) {
            numeroMes = 8;
        } else if (mes.equalsIgnoreCase("Setembro")) {
            numeroMes = 9;
        } else if (mes.equalsIgnoreCase("Outubro")) {
            numeroMes = 10;
        } else if (mes.equalsIgnoreCase("Novembro")) {
            numeroMes = 11;
        } else if (mes.equalsIgnoreCase("Dezembro")) {
            numeroMes = 12;
        } else {
            numeroMes = -1;
        }

        if (numeroMes != -1) {
            System.out.println("O número equivalente ao mês " + mes + " é " + numeroMes + ".");
        } else {
            System.out.println("Mês inválido.");
        }
    }
}

