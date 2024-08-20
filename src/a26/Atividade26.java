package a26;

import java.util.Scanner;

/*Receba 2 horários e exiba a diferença entre eles em segundos. A entrada destes horários
pode ocorrer em qualquer ordem.
Dica: transforme os dois horários para segundos.*/

public class Atividade26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String time1;
        String time2;

        try {
            System.out.print("Digite o primeiro horário (HH:mm:ss): ");
            time1 = s.nextLine();
            validateTime(time1);
        }
        catch (Exception e) {
            System.out.println("Primeiro horário inválido.");
            s.close();
            return;
        }

        try {
            System.out.print("Digite o segundo horário (HH:mm:ss): ");
            time2 = s.nextLine();
            validateTime(time2);
        }
        catch (Exception e) {
            System.out.println("Segundo horário inválido.");
            s.close();
            return;
        }

        s.close();

        int timeInSeconds1 = convertToSeconds(time1);
        int timeInSeconds2 = convertToSeconds(time2);
        int timeDifference = Math.abs(timeInSeconds2 - timeInSeconds1);

        System.out.println("Diferença de: " + timeDifference + " segundos.");
    }

    static void validateTime(String time) {
        String[] split = time.split(":");

        int hours = Integer.parseInt(split[0]);
        int minutes = Integer.parseInt(split[1]);
        int seconds = Integer.parseInt(split[2]);

        if (hours > 23 || hours < 0) throw new IllegalArgumentException();
        else if (minutes > 59 || minutes < 0) throw new IllegalArgumentException();
        else if (seconds > 59 || seconds < 0) throw new IllegalArgumentException();
    }

    static int convertToSeconds(String time) {
        String[] split = time.split(":");

        int hours = Integer.parseInt(split[0]);
        int minutes = Integer.parseInt(split[1]);
        int seconds = Integer.parseInt(split[2]);

        return hours * 3600 + minutes * 60 + seconds;
    }
}
