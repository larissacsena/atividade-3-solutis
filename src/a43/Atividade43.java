package a43;

import java.util.Scanner;

/* Calcule a média aritmética de 500 valores fornecidos pelo usuário. */
public class Atividade43 {
    public static void main(String[] args) {

        final int QUANTIDADE_VALORES = 500;

        double somatorio = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= QUANTIDADE_VALORES; i++) {
            System.out.println("Digite o " + i + "º valor: ");
            somatorio += sc.nextDouble();
        }

        System.out.println("A média aritmética dos " + QUANTIDADE_VALORES + " valores digitados é: " + (somatorio / QUANTIDADE_VALORES));
    }
}