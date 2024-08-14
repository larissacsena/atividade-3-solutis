// Valide um horário composto de horas, minutos e segundos.

package a25;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Atividade25 {

        public static void main(String[] args) {

            String horario ="";
            String[] tempos = {"Horas", "Minutos", "Segundos"};
            int[] horas = new int[tempos.length];

            Scanner scanner = new Scanner(System.in);

            for(int i = 0; i < tempos.length; i++){
                System.out.println("Digite as "+tempos[i]+": ");

                horas[i] = scanner.nextInt();
                if(i<tempos.length-1) {
                    horario += horas[i] + ":";
                } else {
                    horario += horas[i];
                }
            }

            if (validarHorario(horario)) {
                System.out.println("Horário válido: " + horario);
            } else {
                System.out.println("Horário inválido: " + horario);
            }
        }

        public static boolean validarHorario(String horario) {
            try {
                // Tenta criar um objeto LocalTime a partir da string
                LocalTime.parse(horario);
                return true;
            } catch (DateTimeParseException e) {
                // Lança exceção se o formato ou valores forem inválidos
                return false;
            }
        }
    }
