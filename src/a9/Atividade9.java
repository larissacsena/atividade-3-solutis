package a9;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Verifique se o usuário é maior de idade ou não. */
public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String name = getValidName(sc);
            while (name == null) {
                name = getValidName(sc);
            }
            int age = getValidAge(sc);

            System.out.println(getAgeStatement(name, age));
            if (!askToContinue(sc)) {
                break;
            }
        }
    }

    private static String getValidName(Scanner sc) {
        String name = null;
        while (name == null || name.isEmpty()) {
            try {
                System.out.print("Digite o name do usuário: ");
                name = sc.nextLine().trim();
                if (!name.matches("[a-zA-Z\\s]+")) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Entrada Inválida! Por favor digite um name válido.");
                name = null;
            }
        }
        return name;
    }

    private static int getValidAge(Scanner sc) {
        int age = 0;
        while (true) {
            try {
                System.out.print("Digite a idade do usuário: ");
                age = sc.nextInt();
                sc.nextLine();
                if (age < 0) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada Inválida! Por favor digite um número inteiro.");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Entrada Inválida! A idade não pode ser negativa.");
            }
        }
        return age;
    }

    private static String getAgeStatement(String name, int age) {
        return (age >= 18)
                ? name + " (" + age + ") é maior de idade."
                : name + " (" + age + ") é menor de idade.";
    }

    private static boolean askToContinue(Scanner sc) {
        System.out.println("\nDeseja verificar a idade de outro Usuário? (y/n)");
        String response = sc.nextLine();
        return response.equalsIgnoreCase("y");
    }
}
