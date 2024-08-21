package a50;

import java.util.ArrayList;
import java.util.Scanner;

/* Imprima exatamente o n-ezimo termo da seqüência de Fibonacci. */
public class Atividade50 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numerosFibonacci = new ArrayList<>();

        System.out.println("Digite o a quantidade de termos da sequência de Fibonacci: ");

        int n = sc.nextInt();

        System.out.printf("Sequência de Fibonacci de " + n + " termos: ");

        for (int i = 1; i <= n; i++) {

            numerosFibonacci.add(fibonacciRecursivo(i));
        }

        System.out.println(numerosFibonacci);

    }

    public static int fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }
}