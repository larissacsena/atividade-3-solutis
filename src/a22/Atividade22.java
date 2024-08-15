package a22;

import java.util.Date;
import java.util.Scanner;

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
        }
        else{
            System.out.println("Datas diferentes!");
        }

    }
}
