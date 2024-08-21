package a63;

import java.util.Scanner;

/* Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas.
01
01 02
01 02 03
01 02 03 04
01 02 03 04 05
01 02 03 04 05 06
01 02 03 04 05 06 07
01 02 03 04 05 06 07 08
01 02 03 04 05 06 07 08 09
01 02 03 04 05 06 07 08 09 10
01 02 03 04 05 06 07 08 09 10 11 
... */
public class Atividade63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de linhas da pirâmide: ");
        int numLinhas = scan.nextInt();

        for (int i = 1; i <= numLinhas; i++) {
            for (int j = 1; j <= i; j++) {
                if (j < 10) {
                    System.out.print("0" + j + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}