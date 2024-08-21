package a15_16_17_18;

import java.util.Scanner;

// Questoes 15 a 18

/* 15. Verifique a validade de uma data de aniversário (solicite apenas o número do dia e do mês).
Além de falar se a data está ok, informe também o name do mês.
Dica: meses com 30 dias: abril, junho, setembro e novembro.

16. Acrescente no exercício anterior se a pessoa nasceu no 1º, 2º, 3º ou 4º trimestre.

17. Acrescente no exercício anterior a apresentação do signo do horóscopo da pessoa.

18. Inclua no exercício anterior a solicitação do ano de nascimento e também da data de hoje. A
partir destas informações, apresente a idade atual desta pessoa. */
public class Atividade15_16_17_18 {
    private static final String[] monthNames = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date birthDate;
        Date currentDate;

        try {
            birthDate = getBirthDate(scanner);
        } catch (Exception e) {
            System.out.println("Data de nascimento inválida.");
            return;
        }

        try {
            currentDate = getCurrentDate(scanner);
        } catch (Exception e) {
            System.out.println("Data atual inválida.");
            return;
        }

        scanner.close();


        String trimester = getTrimester(birthDate.getMonth());
        String zodiacSign = getZodiacSign(birthDate.getDay(), birthDate.getMonth());
        int age = getAge(birthDate.getDay(), birthDate.getMonth(), birthDate.getYear(),
                currentDate.getDay(), currentDate.getMonth(), currentDate.getYear());

        System.out.println("\nData de nascimento válida: " + birthDate.getDay() + " de " + monthNames[birthDate.getMonth() - 1]);
        System.out.println("Você nasceu no " + trimester + "trimestre");
        System.out.println("Seu signo é: " + zodiacSign);
        System.out.println("Você tem " + age + " anos");
    }

    private static Date getBirthDate(Scanner scanner) {
        System.out.print("Digite o dia do nascimento: ");
        int birthDay = scanner.nextInt();

        System.out.print("Digite o mês do nascimento: ");
        int birthMonth = scanner.nextInt();

        System.out.print("Digite o ano do nascimento: ");
        int birthYear = scanner.nextInt();

        return new Date(birthDay, birthMonth, birthYear);
    }

    private static Date getCurrentDate(Scanner scanner) {
        System.out.print("Digite o dia atual: ");
        int currentDay = scanner.nextInt();

        System.out.print("Digite o mês atual: ");
        int currentMonth = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int currentYear = scanner.nextInt();

        return new Date(currentDay, currentMonth, currentYear);
    }

    private static String getTrimester(int month) {
        if (month <= 3) return "1º ";
        else if (month <= 6) return "2º ";
        else if (month <= 9) return "3º ";
        else return "4º ";
    }

    private static String getZodiacSign(int day, int month) {
        switch (month) {
            case 1:
                return (day <= 20) ? "Capricórnio" : "Aquário";
            case 2:
                return (day <= 18) ? "Aquário" : "Peixes";
            case 3:
                return (day <= 20) ? "Peixes" : "Áries";
            case 4:
                return (day <= 20) ? "Áries" : "Touro";
            case 5:
                return (day <= 20) ? "Touro" : "Gêmeos";
            case 6:
                return (day <= 20) ? "Gêmeos" : "Câncer";
            case 7:
                return (day <= 22) ? "Câncer" : "Leão";
            case 8:
                return (day <= 22) ? "Leão" : "Virgem";
            case 9:
                return (day <= 22) ? "Virgem" : "Libra";
            case 10:
                return (day <= 22) ? "Libra" : "Escorpião";
            case 11:
                return (day <= 21) ? "Escorpião" : "Sagitário";
            case 12:
                return (day <= 21) ? "Sagitário" : "Capricórnio";
            default:
                return "";
        }
    }

    private static int getAge(int birthDay, int birthMonth, int birthYear,
                              int currentDay, int currentMonth, int currentYear) {
        int age = currentYear - birthYear;

        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }

        return age;
    }
}