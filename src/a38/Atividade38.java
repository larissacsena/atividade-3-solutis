package a38;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade38 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            double number = getValidNumber(sc);
            String result = isPrime(number) ? "O número é primo" : "O número não é primo";

            System.out.print(result);

            if (!askToContinue(sc)) {
                break;
            }
        }
    }

    static boolean isPrime(double num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }

    private static double getValidNumber(Scanner sc) {
        double number;
        while (true) {
            try {
                System.out.print("Digite um número: ");
                number = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada Inválida! Por favor digite um número válido.");
                sc.nextLine();
            }
        }
        return number;
    }

    private static boolean askToContinue(Scanner sc) {
        System.out.print("\nDeseja informar outro número (y/n)? ");
        String response = sc.nextLine();
        return response.equalsIgnoreCase("y");
    }
}

