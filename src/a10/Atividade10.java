package a10;

/*
Um banco concede empréstimo a seus clientes no valor máximo de 30% do valor do seu
salário liquido. Receba o valor do salário bruto, o valor dos descontos e o valor do possível
empréstimo de um cliente, em seguida avise se ele poderá ou não fazer o empréstimo.
*/

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do salário bruto: R$ ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Informe o valor dos descontos: R$ ");
        double descontos = scanner.nextDouble();

        double salarioLiquido = salarioBruto - descontos;
        double valorMaximoEmprestimo = salarioLiquido * 0.3;

        System.out.print("Informe o valor do empréstimo desejado: R$ ");
        double valorEmprestimo = scanner.nextDouble();

        if (valorEmprestimo <= valorMaximoEmprestimo) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo não aprovado.");
        }
    }
}
