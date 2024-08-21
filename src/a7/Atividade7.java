package a7;

import java.util.Scanner;

/* Calcule e exiba a comissão de 10% de um garçom num restaurante a partir do valor da
despesa de um cliente. */
public class Atividade7 {
    public static void main(String[] args) {

        final double PERCENTUAL_COMISSAO = .1;

        Scanner scan = new Scanner(System.in);

        double valorConta;

        System.out.println("Digite o valor do conta do cliente: ");

        valorConta = scan.nextDouble();

        double valorComissao = PERCENTUAL_COMISSAO * valorConta;


        System.out.print("Sendo o valor total da conta R$" + valorConta + ", o valor da comissão do garçom é de R$");
        System.out.printf("%.2f%n", valorComissao);
    }
}
