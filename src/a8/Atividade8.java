package a8;

import java.util.Scanner;

/*
    Transforme um número Racional (formado por numerador e denominador) para um número
    Real. Antes de dividir, verifique se o denominador é diferente de zero. Emita uma
    mensagem de alerta ao usuário se for zero.
*/

public class Atividade8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número numerador:");
        int numerador = sc.nextInt();
        System.out.println("Informe um número denominador:");
        int denominador = sc.nextInt();

        if (denominador != 0) {
            float numReal = (float) numerador / denominador;
            System.out.println("O número real é: " + numReal);
        } else {
            System.out.println("O denonimador é igual a 0!");
        }
      sc.close();
    }
}
