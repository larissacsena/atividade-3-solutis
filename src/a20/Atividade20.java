package a20;

import java.util.InputMismatchException;
import java.util.Scanner;

/*.Solicite o nome e a idade de duas pessoas. Em seguida exiba o nome da pessoa mais
velha e o nome da pessoa mais nova.*/

public class Atividade20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da primeira pessoa:");
        String name1 = getValidName(sc);
        int age1 = getValidAge(sc);

        System.out.println("Informe os dados da segunda pessoa:");
        String name2 = getValidName(sc);
        int age2 = getValidAge(sc);

        compareAges(name1, age1, name2, age2);

        sc.close();
    }

    private static String getValidName(Scanner sc) {
        String name = null;
        while (name == null || name.isEmpty()) {
            try {
                System.out.print("Digite o nome: ");
                name = sc.nextLine().trim();
                if (!name.matches("[a-zA-Z\\s]+")) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Entrada Inválida! Por favor, digite um nome válido.");
                name = null;
            }
        }
        return name;
    }

    private static int getValidAge(Scanner sc) {
        int age = 0;
        while (true) {
            try {
                System.out.print("Digite a idade: ");
                age = sc.nextInt();
                sc.nextLine();
                if (age < 0) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada Inválida! Por favor, digite um número inteiro.");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Entrada Inválida! A idade não pode ser negativa.");
            }
        }
        return age;
    }

    private static void compareAges(String name1, int age1, String name2, int age2) {
        String olderPerson = age1 > age2 ? name1 : name2;
        String youngerPerson = age1 < age2 ? name1 : name2;

        System.out.println("A pessoa mais velha é: " + olderPerson);
        System.out.println("A pessoa mais nova é: " + youngerPerson);
    }
}
