package a43;

/*
43. Calcule a média aritmética de 500 valores fornecidos pelo usuário.
44. Modifique o problema anterior para que a quantidade de valores também seja fornecida pelo
usuário.
 */

import java.util.Scanner;

public class Atividade43 {
    public static void main(String[] args) {

        final int QUANTIDADE_VALORES = 500;

        double somatorio = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= QUANTIDADE_VALORES; i++) {
            System.out.println("Digite o " + i + "º valor: ");
            somatorio += sc.nextDouble();
            i++;
        }

        System.out.println("A média aritmética dos "+QUANTIDADE_VALORES+" digitados é: "+(somatorio/QUANTIDADE_VALORES));
    }
}
