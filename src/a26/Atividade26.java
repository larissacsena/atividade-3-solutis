package a26;

import java.util.Scanner;

/*Receba 2 horários e exiba a diferença entre eles em segundos. A entrada destes horários
pode ocorrer em qualquer ordem.
Dica: transforme os dois horários para segundos.*/

public class Atividade26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o primeiro horário (HH:mm:ss): ");
        String time1 = s.nextLine();
        System.out.print("Digite o segundo horário (HH:mm:ss): ");
        String time2 = s.nextLine();

        int timeInSeconds1 = convertToSeconds(time1);
        int timeInSeconds2 = convertToSeconds(time2);
        int timeDifference = Math.abs(timeInSeconds2 - timeInSeconds1);

        System.out.println("Diferença de: " + timeDifference + " segundos.");

        s.close();
    }

    static int convertToSeconds(String time) {
        String[] split = time.split(":");

        int hours = Integer.parseInt(split[0]);
        int minutes = Integer.parseInt(split[1]);
        int seconds = Integer.parseInt(split[2]);

        return hours * 3600 + minutes * 60 + seconds;
    }
}
