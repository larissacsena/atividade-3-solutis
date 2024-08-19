package a23.application;

import a23.entities.People;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final LocalDate DATA_BASE = LocalDate.of(2024, Month.JANUARY, 1);
        final int NUMBER_OF_PEOPLES = 2;

        List<People> peoples = new ArrayList<>();

        for (int i = 1; i <= NUMBER_OF_PEOPLES; i++) {
            String name = readName(sc, i);
            LocalDate birthDay = readBirthDay(sc, i, DATA_BASE);
            peoples.add(new People(name, birthDay));
        }

        People closest = Collections.min(peoples);
        System.out.println("Primeiro Aniversariante: " + closest.getName());
    }

    public static boolean isValidName(String name) {
        return name != null && name.matches("[a-zA-Z\\s]+");
    }

    public static LocalDate formatData(String birthdayInput, LocalDate dataBase) {
        try {
            LocalDate birthday = LocalDate.parse(birthdayInput + "/" + dataBase.getYear(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return LocalDate.of(dataBase.getYear(), birthday.getMonth(), birthday.getDayOfMonth());
        } catch (DateTimeParseException e) {
            System.out.println("Data de aniversário inválida: ");
            return null;
        } catch (DateTimeException e) {
            System.out.println("Erro ao criar data: ");
            return null;
        }
    }

    public static String readName(Scanner sc, int personNumber) {
        String name = null;
        while (name == null) {
            try {
                System.out.print("Digite o nome da " + personNumber + "ª pessoa: ");
                name = sc.nextLine().trim();
                if (!isValidName(name)) throw new InputMismatchException();
            } catch (InputMismatchException e) {
                name = null;
                System.out.println("Nome Inválido!");
            }
        }
        return name;
    }

    public static LocalDate readBirthDay(Scanner sc, int personNumber, LocalDate dataBase) {
        LocalDate birthDay = null;
        while (birthDay == null) {
            System.out.print("Digite a data e o mês do aniversário " + personNumber + "ª pessoa (dd/MM): ");
            birthDay = formatData(sc.nextLine(), dataBase);
        }
        return birthDay;
    }

}
