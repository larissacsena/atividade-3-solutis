package a65;

import java.util.Scanner;

/* Desenhe a seguinte pirâmide de asteriscos. O usuário determina a quantidade de linhas.
       *
      ***
     *****
    *******
   *********
  ***********
 *************
*************** */
public class Atividade65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número de linhas da pirâmide: ");
        int numeroLinha = sc.nextInt();

        for (int i = 1; i <= numeroLinha; i++) {
            for (int espaco = numeroLinha; espaco > i; espaco--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
