package a18;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int day, int month, int year) {
        validateDate(day, month, year);

        this.day = day;
        this.month = month;
        this.year = year;
    }

    private void validateDate(int day, int month, int year) {
        if (day < 1 || day > 31) {
            System.out.println("Dia inválido.");
            throw new IllegalArgumentException();
        }

        if (month < 1 || month > 12) {
            System.out.println("Mês inválido.");
            throw new IllegalArgumentException();
        }

        int daysInMonth = switch (month) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };

        if (month == 2 && isLeapYear(year)) daysInMonth++;

        if (day > daysInMonth) {
            System.out.println("Mês não tem " + day + " dias.");
            throw new IllegalArgumentException();
        }
        ;
    }

    private boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else return true;
        } else return false;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
