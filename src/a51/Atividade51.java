package a51;

import java.util.Scanner;

/* Exiba os n primeiros termos da seqüência de Tribonacci (soma dos três anteriores).
Inicia com 1,1 e 2. */
public class Atividade51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantos termos de tribonacci deseja:");
        int termos = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        int n3 = 1;

        for (int i = 1; i <= termos; i++) {
            int next = n1 + n2 + n3;
            System.out.println("O resultado da soma " + i + " de Tribonacci é: " + next + " (" + n1 + "+" + n2 + "+" + n3 + ")");

            n1 = n2;
            n2 = n3;
            n3 = next;
        }
        sc.close();
    }
}


