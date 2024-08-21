package a39;

import java.util.Scanner;

/* Verifique se um número é perfeito, ou seja, se a soma dos seus divisores (exceto o próprio
número) é igual a ele mesmo. */
public class Atividade39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int somaDivisores = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        if (somaDivisores == numero) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }

        scanner.close();
    }
}
