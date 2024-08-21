package a44;

import java.util.Scanner;


/* Modifique o problema anterior para que a quantidade de valores também seja fornecida
pelo usuário. */
public class Atividade44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores que deseja inserir: ");
        int quantidade = scanner.nextInt();

        if (quantidade <= 0) {
            System.out.println("A quantidade de valores deve ser maior do que zero.");
        } else {

            double soma = 0;

            for (int i = 1; i <= quantidade; i++) {
                System.out.print("Digite o valor " + i + ": ");
                double valor = scanner.nextDouble();
                soma += valor;
            }

            System.out.printf("A média aritmética dos " + (quantidade) + " valores fornecidos é: %.2f%n", (soma / quantidade));
        }
    }
}