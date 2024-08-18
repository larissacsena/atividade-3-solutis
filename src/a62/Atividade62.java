package a62;

import java.util.Scanner;

/*
Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas.
01
02 02
03 03 03
04 04 04 04
05 05 05 05 05
06 06 06 06 06 06
07 07 07 07 07 07 07
08 08 08 08 08 08 08 08
09 09 09 09 09 09 09 09 09
10 10 10 10 10 10 10 10 10 10
11 11 11 11 11 11 11 11 11 11 11
...
*/

public class Atividade62 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a quantidade de linhas: ");
        int lines = s.nextInt();

        for (int i = 1; i <= lines; i++) {
            String formattedNumber = String.format("%02d", i);

            for (int j = 1; j <= i; j++) {
                System.out.print(formattedNumber + " ");
            }

            System.out.println();
        }

        s.close();
    }
}
