package a45;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Determine o maior valor de uma lista de 100 números fornecidos pelo usuário. */
public class Atividade45 {
    public static void main(String[] args) {
        final int TOTALNUMBERS = 5;
        int[] numbers = new int[TOTALNUMBERS];

        System.out.println("Por favor, insira " + TOTALNUMBERS + " números:");
        numbers = readNumbers(TOTALNUMBERS);

        Arrays.sort(numbers);
        int max = numbers[numbers.length - 1];
        System.out.println("O maior valor da lista é: " + max);
    }

    public static int[] readNumbers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Número " + (i + 1) + ": ");
                    numbers[i] = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                    scanner.next();
                }
            }
        }
        return numbers;
    }
}
