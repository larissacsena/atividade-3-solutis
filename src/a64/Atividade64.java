package a64;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade64 {

    public static void main(String[] args) {
        int totalTriangles = getTotalTrianglesFromUser();
        printTriangles(totalTriangles);
    }

    private static int getTotalTrianglesFromUser() {
        Scanner scanner = new Scanner(System.in);
        int totalTriangles = -1;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Digite o total de triângulos: ");
            try {
                totalTriangles = scanner.nextInt();
                if (totalTriangles <= 0) {
                    System.out.println("Número inválido. O total de triângulos deve ser um número positivo.");
                } else {
                    isValidInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Número inválido. Por favor, digite um número inteiro.");
                scanner.next();
            }
        }

        return totalTriangles;
    }

    private static void printTriangles(int totalTriangles) {
        for (int i = 1; i <= totalTriangles; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

