package a49;

import java.util.ArrayList;

/* Exiba os 50 primeiros números da seqüência de Fibonacci
(1,1,2,3,5,8,13,21,34,55,89,144,233,377,...). */
public class Atividade49 {
    public static void main(String[] args) {

        ArrayList<Integer> numerosFibonacci = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {

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