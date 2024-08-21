package a28;

import java.util.Scanner;

/* Coloque em ordem crescente três números quaisquer.
Como desafio, tente depois fazer uma solução com apenas 3 estruturas de decisão. */
public class Atividade28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Informe o terceiro número: ");
        int c = scanner.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Números em ordem crescente: " + a + ", " + b + ", " + c);
    }
}
