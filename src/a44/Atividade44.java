package a44;

/*
43. Calcule a média aritmética de 500 valores fornecidos pelo usuário.
44. Modifique o problema anterior para que a quantidade de valores também seja fornecida pelo
usuário.
 */

import java.util.Scanner;

public class Atividade44 {

    public static void main(String[] args) {

        System.out.println("Quantos números serão digitados?");

        Scanner sc = new Scanner(System.in);

        int qntValores = sc.nextInt();

        double somatorio = 0;

        for(int i = 1; i <= qntValores; i++) {
            System.out.println("Digite o " + i + "º valor: ");
            somatorio += sc.nextDouble();
        }

        System.out.println("A média aritmética dos "+qntValores+" números digitados é: "+(somatorio/qntValores));
    }
}
