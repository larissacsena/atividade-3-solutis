package a25;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

// Valide um horário composto de horas, minutos e segundos.

public class Atividade25 {

    public static void main(String[] args) {

        String horario = "";
        String[] tempos = {"Horas", "Minutos", "Segundos"};
        int[] horas = new int[tempos.length];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tempos.length; i++) {
            System.out.println("Digite as " + tempos[i] + ": ");

            horas[i] = scanner.nextInt();
            if (i < tempos.length - 1) {
                horario += horas[i] + ":";
            } else {
                horario += horas[i];
            }
        }

        if (validarHorario(horario)) {
            System.out.println("Horário VÁLIDO: " + horario);
        } else {
            System.out.println("Horário INVÁLIDO: " + horario);
        }
    }

    public static boolean validarHorario(String horario) {
        try {
            LocalTime.parse(horario);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}