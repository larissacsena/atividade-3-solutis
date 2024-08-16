package a50;
/*
50. Imprima exatamente o n-ezimo termo da seqüência de Fibonacci.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade50_Bruno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numerosFibonacci = new ArrayList<>();

        System.out.println("Digite o a quantidade de termos da sequência de Fibonacci: ");

        int n = sc.nextInt();

        System.out.printf("Sequência de Fibonacci de "+n+" termos: ");

                for(int i =1;i<=n; i++) {

            numerosFibonacci.add(fibonacciRecursivo(i));
        }

        System.out.println(numerosFibonacci);

    }

    public static int fibonacciRecursivo(int n) {

        //sequência de fibonnaci: cada número da sequência é a soma dos dois anteriores, começando com 1

        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }
}
