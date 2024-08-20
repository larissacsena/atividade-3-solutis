package a22;

import java.util.Scanner;

/*
    Verifique se duas datas de aniversário (dia e mês) são iguais.
*/

public class Atividade22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Data 1- Informe o número do DIA de nascimento: ");
        short dia1 = sc.nextShort();
        System.out.println("Data 1- Informe o número do MÊS de nascimento: ");
        short mes1 = sc.nextShort();

        System.out.println("Data 2- Informe o número do DIA de nascimento: ");
        short dia2 = sc.nextShort();
        System.out.println("Data 2- Informe o número do MÊS de nascimento: ");
        short mes2 = sc.nextShort();

        if (dia1 == dia2 && mes1 == mes2) {
            System.out.println("Datas iguais!");
        } else if (dia1 <= 0 || dia1 > 31 || mes1 < 1 || mes1 > 12) {
            System.out.println("Data 01 é invalida!");
        } else if (dia2 < 1 || dia2 > 31 || mes2 < 1 || mes2 > 12) {
            System.out.println("Data 02 é invalida!");
        } else {
            System.out.println("Datas diferentes!");
        }
        sc.close();
    }
}
